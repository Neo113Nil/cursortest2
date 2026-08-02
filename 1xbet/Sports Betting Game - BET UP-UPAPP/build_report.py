#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Sports Betting Game - BET UP (UPAPP / org.betup)."""

import json
import os

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import (
    KeepTogether,
    Paragraph,
    SimpleDocTemplate,
    Spacer,
    Table,
    TableStyle,
)

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle(
    "H1",
    fontName="DJ-B",
    fontSize=16,
    leading=20,
    spaceAfter=8,
    textColor=colors.HexColor("#12263f"),
)
H2 = ParagraphStyle(
    "H2",
    fontName="DJ-B",
    fontSize=12.5,
    leading=16,
    spaceBefore=12,
    spaceAfter=6,
    textColor=colors.HexColor("#12263f"),
)
BODY = ParagraphStyle(
    "BODY",
    fontName="DJ",
    fontSize=9.3,
    leading=13.4,
    alignment=TA_LEFT,
    spaceAfter=5,
)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
SMALL = ParagraphStyle(
    "SMALL",
    fontName="DJ",
    fontSize=8.4,
    leading=11.6,
    textColor=colors.HexColor("#444444"),
    spaceAfter=6,
)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return (
        str(text)
        .replace("&", "&amp;")
        .replace("<", "&lt;")
        .replace(">", "&gt;")
    )


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append(
            [
                Paragraph(
                    '<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B
                ),
                Paragraph(
                    '<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B
                ),
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
        style.append(("BACKGROUND", (0, 0), (-1, 0), HEAD_BG))
    start = 1 if header else 0
    for i in range(start, len(data)):
        if (i - start) % 2 == 1:
            style.append(("BACKGROUND", (0, i), (-1, i), ALT_BG))
    t.setStyle(TableStyle(style))
    return t


PERMISSIONS = (
    "android.permission.INTERNET, "
    "android.permission.VIBRATE, "
    "android.permission.READ_EXTERNAL_STORAGE, "
    "android.permission.WRITE_EXTERNAL_STORAGE, "
    "android.permission.READ_PHONE_STATE, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.android.vending.BILLING, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.READ_BASIC_PHONE_STATE, "
    "android.permission.ACCESS_ADSERVICES_TOPICS, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.USE_FINGERPRINT, "
    "com.google.android.providers.gsf.permission.READ_GSERVICES, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "android.permission.WAKE_LOCK, "
    "com.android.vending.CHECK_LICENSE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "android.permission.FOREGROUND_SERVICE, "
    "org.betup.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION, "
    "com.sec.android.provider.badge.permission.READ, "
    "com.sec.android.provider.badge.permission.WRITE, "
    "com.htc.launcher.permission.READ_SETTINGS, "
    "com.htc.launcher.permission.UPDATE_SHORTCUT, "
    "com.sonyericsson.home.permission.BROADCAST_BADGE, "
    "com.sonymobile.home.permission.PROVIDER_INSERT_BADGE, "
    "com.anddoes.launcher.permission.UPDATE_COUNT, "
    "com.majeur.launcher.permission.UPDATE_BADGE, "
    "com.huawei.android.launcher.permission.CHANGE_BADGE, "
    "com.huawei.android.launcher.permission.READ_SETTINGS, "
    "com.huawei.android.launcher.permission.WRITE_SETTINGS, "
    "android.permission.READ_APP_BADGE, "
    "com.oppo.launcher.permission.READ_SETTINGS, "
    "com.oppo.launcher.permission.WRITE_SETTINGS, "
    "me.everything.badger.permission.BADGE_COUNT_READ, "
    "me.everything.badger.permission.BADGE_COUNT_WRITE, "
    "com.amazon.privacypass.ATTEST"
)

AD_NETWORKS = (
    "AdMob (Google Mobile Ads / GMA Next-Gen), AppLovin MAX, "
    "ironSource / LevelPlay (SuperSonic), BidMachine, Pangle (Bytedance), "
    "Facebook Audience Network, Unity Ads (через mediation)"
)

ANALYTICS = (
    "Firebase Analytics, Firebase Crashlytics, Firebase Auth, "
    "Firebase Cloud Messaging, Firebase Remote Config, "
    "Firebase Dynamic Links, Firebase In-App Messaging, "
    "собственная аналитика analytics.betup.org, "
    "Facebook SDK, TikTok Business SDK (в пакете), "
    "Sentry (в сборке отключён)"
)

LIBRARIES = (
    "androidx.*, Kotlin 2.1.21 + kotlinx-coroutines, Dagger, ButterKnife, "
    "Coil3, OkHttp3, Okio, Retrofit2, Picasso (+ transformations), "
    "Gson, GreenRobot EventBus, RxJava (io.reactivex), "
    "Google Play Services (ads, ads-identifier, auth, base, basement, tasks, "
    "measurement), Google Play Billing, Firebase (*, incl. encoders), "
    "AppLovin, ironSource/SuperSonic, BidMachine / ExploreStack, "
    "Pangle / Bytedance, Facebook SDK + Audience Network, Unity3d ads, "
    "TikTok Business SDK, VK SDK, Sentry (disabled), "
    "ShortcutBadger, Material Components, Compose UI, "
    "ads_mobile_sdk, tourguide, CircleIndicator, MaterialSearchBar, "
    "CarouselRecyclerView, FloatingActionButton, ColorRatingBar, "
    "MaterialRatingBar, RoundedImageView, Emoji (vanniktech)"
)

SHARED_PREFS = (
    "termsAccepted / introShown — согласие с правилами и показ введения; "
    "casino_accepted — согласие на раздел казино; "
    "challenge_tour / quiz_tour / bet_tutorial_guide / leaderboard_dialog — "
    "флаги обучающих экранов; "
    "last_session_started(_uid) — время сессии; "
    "matchId / bet_link_id / bet_link_owner_user_id — ссылки на матч/ставку; "
    "betslip — корзина ставок; "
    "is_eu / consent_asked — регион GDPR и согласие на рекламу; "
    "local_profile / anonymous_user_uid / push_token — профиль и пуш; "
    "lastBetWonCloseInterstitialAtMs — кулдаун межстраничной рекламы; "
    "visual/haptic/in_app_messages и настройки ставок"
)

SUSPICIOUS_WORDS = (
    "betting, casino, offer, gambling, redirect, landing, slots, bridge, "
    "webview, loadUrl"
)

SUSPICIOUS_DOMAINS = [
    "185.56.139.122",
    "akm.ssacdn.com",
    "analytics.betup.org",
    "analytics.qbetapp.info",
    "aomedia.org",
]

MAIN_ROWS = [
    ("Название приложения", "Sports Betting Game - BET UP (в приложении: BETUP)"),
    ("Android Gradle Plugin", "8.7.0"),
    ("minSdk", "26"),
    ("targetSdk", "35"),
    ("Kotlin", "да, 2.1.21"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    ("Подозрительные домены", ", ".join(SUSPICIOUS_DOMAINS)),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]

DOMAIN_NOTES = {
    "185.56.139.122": (
        "В коде это шаблон адреса живого видео (HLS): "
        "http://185.56.139.122/hls-live/.../{videoId}.m3u8, который подставляется "
        "из удалённых настроек (ключ videoLink). Приложение пытается открыть "
        "трансляцию матча, а не «ворота» проверки трафика. Сейчас соединение "
        "не устанавливается (таймаут), VirusTotal для «голого» IP не принимает "
        "запрос как домен — на вид это старый/недоступный медиа-хост, а не "
        "скрытый оффер."
    ),
    "akm.ssacdn.com": (
        "Адрес из рекламного стека ironSource / SuperSonic (CDN для рекламных "
        "роликов и инициализации). В логике запуска игры он не решает, кому "
        "показать внешнюю страницу, а кому обычное приложение: это обычная "
        "сеть показа рекламы. DNS сейчас не отвечает; регистратор — Amazon. "
        "На вид безопасный служебный хост SDK, а не клоака."
    ),
    "analytics.betup.org": (
        "Собственный сервер аналитики BETUP: в релизе базовый адрес "
        "https://analytics.betup.org/api/ (класс ProdApiConfig). Сюда уходят "
        "события приложения (тип события, язык, версия сборки, иногда модель "
        "телефона при сбое сервера) после входа в игру — это учёт действий "
        "внутри продукта, а не развилка «оффер или белая версия». Корень "
        "сайта отвечает 404; по VirusTotal чисто; whois связан с GoDaddy."
    ),
    "analytics.qbetapp.info": (
        "Адрес тестовой/стейджинговой среды (TestApiConfig): "
        "https://analytics.qbetapp.info/api/. В релизе приложение на него "
        "не переключается — используется betup.org. На корне тоже 404, "
        "детекции VirusTotal нулевые, регистратор/whois — GoDaddy. Это "
        "запасной аналитический хост разработки, не шлюз скрытой выдачи."
    ),
    "aomedia.org": (
        "Строка https://aomedia.org/emsg/ID3 встречается внутри библиотеки "
        "BidMachine / media3 как идентификатор схемы метаданных видео "
        "(Alliance for Open Media), а не как сайт, который приложение "
        "открывает человеку. Отдельного запроса «на проверку трафика» к "
        "этому домену в коде BETUP нет. Страница организации открывается "
        "как обычный сайт стандарта AV1; регистратор — Squarespace Domains."
    ),
}


def domain_rows_from_check(entry):
    rows = []
    for item in entry.get("table_rows") or []:
        rows.append((item.get("param", ""), item.get("value", "")))
    if rows:
        return rows
    vt = entry.get("virustotal") or {}
    rows = [
        ("Домен", entry.get("domain", "")),
        ("VirusTotal URL", vt.get("vt_url", "")),
        ("Детекции", vt.get("detections", "")),
        ("Security vendors' analysis", "ниже построчно, как на VirusTotal"),
    ]
    for name, verdict in vt.get("vendor_rows") or []:
        rows.append((name, verdict))
    rows.append(("Куда редиректит", entry.get("redirects_to", "нет")))
    rows.append(("Что выводит (кратко)", entry.get("page_output", "нет")))
    rows.append(("Где припаркован", entry.get("parked_at", "нет")))
    return rows


def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT,
        pagesize=A4,
        leftMargin=18 * mm,
        rightMargin=18 * mm,
        topMargin=15 * mm,
        bottomMargin=15 * mm,
        title="Отчёт по анализу APK — Sports Betting Game - BET UP",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(
        Paragraph(
            "Sports Betting Game - BET UP &mdash; UPAPP &mdash; org.betup "
            "(в ресурсах: BETUP, версия 3.3.5 / 3606)",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Разобраны: org.betup.xapk, apk/* (base + config splits), meta.json, "
            "domain_checks, AndroidManifest.xml, strings.xml, decompiled/sources "
            "(BetUpApp, SplashActivity, MainActivity, ProdApiConfig, SharedPrefs, "
            "FullscreenXZoneActivity, CasinoService, AdsInitializer, offer/*).",
            SMALL,
        )
    )

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(MAIN_ROWS, header=("Параметр", "Значение")))

    story.append(Paragraph("Проверка подозрительных доменов", H2))
    story.append(
        Paragraph(
            "Данные ниже взяты как есть из готовых проверок пайплайна "
            "(domain_checks.json / domain_checks.md): сводка VirusTotal, "
            "полный список Security vendors' analysis и три дополнительных "
            "пункта в конце.",
            SMALL,
        )
    )

    for domain in SUSPICIOUS_DOMAINS:
        entry = by_domain.get(domain)
        if not entry:
            continue
        story.append(Paragraph("Проверка домена: %s" % esc(domain), H2))
        story.append(
            kv_table(
                domain_rows_from_check(entry),
                widths=(62 * mm, 108 * mm),
                header=("Параметр / движок", "Значение / вердикт"),
            )
        )
        story.append(Spacer(1, 3 * mm))
        story.append(Paragraph(esc(DOMAIN_NOTES.get(domain, "")), BODY))
        story.append(Spacer(1, 4 * mm))

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
