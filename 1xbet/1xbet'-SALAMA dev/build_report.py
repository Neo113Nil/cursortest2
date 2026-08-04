#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""PDF report — 1xbet' / Quran stories (SALAMA dev / Andromo). Cloak = NO."""

import json
import os
import re

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import Paragraph, SimpleDocTemplate, Spacer

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")
CHECKS_MD = os.path.join(BASE, "domain_checks.md")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20, spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12.5, leading=16, spaceBefore=12, spaceAfter=6, textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.3, leading=13.4, alignment=TA_LEFT, spaceAfter=5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
BULLET = ParagraphStyle("BULLET", fontName="DJ", fontSize=9.3, leading=13.4, leftIndent=10, spaceAfter=3)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return str(text).replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    from reportlab.platypus import Table, TableStyle

    data = []
    if header:
        data.append(
            [
                Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B),
                Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B),
            ]
        )
    for k, v in rows:
        data.append([Paragraph(esc(k), CELL_B), Paragraph(esc(v), CELL)])
    t = Table(data, colWidths=list(widths), repeatRows=1 if header else 0)
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 4),
        ("TOPPADDING", (0, 0), (-1, -1), 3),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 3),
    ]
    if header:
        style += [
            ("BACKGROUND", (0, 0), (-1, 0), HEAD_BG),
            ("BACKGROUND", (0, 1), (-1, 1), ALT_BG),
        ]
        for i in range(2, len(data)):
            if i % 2 == 1:
                style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    else:
        for i in range(len(data)):
            if i % 2 == 1:
                style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


SUSPICIOUS_DOMAINS = [
    "sqz.andromo.com",
    "builder.andromo.com",
    "inapppurchase.andromo.com",
    "cfg.flurry.com",
    "data.flurry.com",
    "o582999.ingest.sentry.io",
]

DOMAIN_NOTES = {
    "sqz.andromo.com": (
        "Строка https://sqz.andromo.com зашита в Flutter-бинарь (libapp.so). "
        "Это хост Andromo для squeeze/hosted web-контента билдера, а не кастомный "
        "API клоаки с развилкой «оффер / белое приложение». В коде нет разбора "
        "ответа с offer URL и переключения UI."
    ),
    "builder.andromo.com": (
        "Hub Andromo: https://builder.andromo.com/hub/c1e2365349b385c9a4b77ea7f068062a/. "
        "Платформенный адрес конструктора приложений. HTTP 200. Не gate."
    ),
    "inapppurchase.andromo.com": (
        "Эндпоинт проверки покупок Andromo (/verify/). Корень отвечает 404. "
        "Не участвует в выборе оффера при старте."
    ),
    "cfg.flurry.com": (
        "Конфиг Flurry SDK (https://cfg.flurry.com/sdk/v1/config). Сюда уходят "
        "apiKey, версия приложения, модель/бренд устройства, locale, advertising id "
        "и т.п. — стандартная аналитика, без ветвления white/offer в приложении."
    ),
    "data.flurry.com": (
        "Приём событий Flurry (https://data.flurry.com/v1/flr.do). Аналитика Yahoo/Flurry."
    ),
    "o582999.ingest.sentry.io": (
        "Sentry ingest по DSN из libapp.so. Краши/производительность, не клоака."
    ),
}


def build():
    permissions = (
        "INTERNET, WRITE_SETTINGS, WRITE_EXTERNAL_STORAGE, READ_EXTERNAL_STORAGE, "
        "WAKE_LOCK, FOREGROUND_SERVICE, FOREGROUND_SERVICE_MEDIA_PLAYBACK, "
        "AD_ID, ACCESS_NETWORK_STATE, ACCESS_ADSERVICES_AD_ID/ATTRIBUTION/TOPICS, "
        "READ_GSERVICES, DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
    )
    libraries = (
        "Flutter 3.32.7 (Andromo builder), audio_service/just_audio, "
        "google_mobile_ads (AdMob), flutter_flurry_sdk, Firebase plugins "
        "(core/auth/firestore/database/storage), flutter_inappwebview, "
        "webview_flutter, url_launcher, sentry_flutter, shared_preferences, "
        "flutter_secure_storage, sqflite, device_info_plus, package_info_plus"
    )
    sdk_rows = [
        ("Название приложения", "1xbet' (в APK: قصص القران العوضي; Andromo Quran stories)"),
        ("Android Gradle Plugin", "8.7.3"),
        ("minSdk", "24"),
        ("targetSdk", "35"),
        ("Kotlin", "да 2.1.0 (Flutter 3.32.7)"),
        ("Web View", "да (url_launcher, webview_flutter, InAppWebView)"),
        ("Custom Tabs", "да (flutter_inappwebview CCT/TWA)"),
        ("Рекламные сети", "AdMob ca-app-pub-9116501680612894; StartApp/FAN — заглушки"),
        ("Аналитика", "Flurry, Sentry; Firebase plugins (GA отсутствует)"),
        ("Permissions", permissions),
        ("Libraries", libraries),
        ("Подозрительные домены", ", ".join(SUSPICIOUS_DOMAINS)),
        (
            "SharedPreferences",
            "FlutterSharedPreferences; FLURRY_SHARED_PREFERENCES (advertising_id); "
            "IABTCF_TCString (UMP/ump_outdate); AgreementDao — без offer/cloak ключей",
        ),
        ("Есть ли клоака", "нет"),
        (
            "Подозрительные слова",
            "rootcloak (Sentry RootChecker), OFFER_PRESENTED (SDK), "
            "SAFE_BROWSING_WHITELIST; нет cloak/offer-gate/betting/clickid/affiliate",
        ),
    ]

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=14 * mm,
        rightMargin=14 * mm,
        topMargin=14 * mm,
        bottomMargin=14 * mm,
        title="Отчёт по анализу APK — 1xbet' (SALAMA dev)",
        author="Анализ Android APK",
    )
    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(
        Paragraph(
            esc(
                "1xbet' — SALAMA dev — com.salamadev.nabilalawadi.kisaskoran "
                "(версия 5.0 / 1105). Фактически: Andromo Flutter-приложение "
                "с аудио-рассказами Корана (Nabil Al-Awadi)."
            ),
            BODY,
        )
    )
    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(sdk_rows, header=("Параметр", "Значение")))

    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    for domain in SUSPICIOUS_DOMAINS:
        entry = by_domain.get(domain) or {}
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        rows = []
        for item in entry.get("table_rows") or []:
            rows.append((item.get("param", ""), item.get("value", "")))
        if not rows:
            rows = [("Домен", domain), ("Клоака-ворота", "нет")]
        story.append(kv_table(rows, header=("Параметр / движок", "Значение / вердикт")))
        note = DOMAIN_NOTES.get(domain)
        if note:
            story.append(Paragraph(esc(note), BODY))

    story.append(Paragraph("Какие данные собираются", H2))
    for b in [
        "Advertising ID (GAID) — Flurry читает через AdvertisingIdClient и пишет в prefs advertising_id; уходит на cfg/data.flurry.com вместе с аналитикой",
        "Модель/бренд/product/Android version — в deviceTags запроса Flurry config",
        "Locale (язык_страна) — в Flurry config; также plugins device_info / app language Andromo",
        "packageName / appVersion / appBuild — Flurry bundleId и версии",
        "Crash/performance — Sentry DSN o582999.ingest.sentry.io",
        "AdMob — стандартный рекламный трафик Google; UMP consent (IABTCF_TCString)",
        "Кастомного gate-запроса (locale+gaid → offer_url) в приложении нет",
    ]:
        story.append(Paragraph("• " + esc(b), BULLET))

    story.append(Paragraph("Как собираются", H2))
    story.append(
        Paragraph(
            esc(
                "При старте: AndromoApp (опциональный FAN через reflection) → "
                "AudioServiceActivity → Flutter main (package:builder/main.dart). "
                "Инициализируются AdMob/UMP, Flurry (method channel buildFlurryBuilder), "
                "Sentry. Нет отдельного экрана «проверки трафика» перед белым UI."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Куда отправляются", H2))
    story.append(
        Paragraph(
            esc(
                "Аналитика: Flurry (cfg.flurry.com, data.flurry.com). Краши: Sentry. "
                "Реклама: Google AdMob. Платформа билдера: andromo.com (hub / IAP / sqz). "
                "Развилки «показать оффер вместо приложения» по ответу сервера в коде нет — "
                "вердикт клоаки: нет."
            ),
            BODY,
        )
    )

    story.append(Paragraph("Вердикт по клоаке", H2))
    story.append(
        Paragraph(
            esc(
                "НЕТ. Есть AdMob, WebView/Custom Tabs и Flurry, но отсутствует "
                "server-side fork «offer URL vs white/normal app». Маркетинговое имя "
                "папки «1xbet'» в бинарнике/URL офферов не подтверждается."
            ),
            BODY,
        )
    )

    story.append(Spacer(1, 6))
    story.append(
        Paragraph(
            esc("Подробные доказательства: FINDINGS.md в каталоге анализа."),
            BODY,
        )
    )

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
