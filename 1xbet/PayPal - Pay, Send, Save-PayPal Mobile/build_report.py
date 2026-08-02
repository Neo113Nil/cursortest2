#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK PayPal - Pay, Send, Save (PayPal Mobile)."""

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


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None, compact=False):
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
    pad = 2 if compact else 3
    style = [
        ("GRID", (0, 0), (-1, -1), 0.4, GRID),
        ("VALIGN", (0, 0), (-1, -1), "TOP"),
        ("LEFTPADDING", (0, 0), (-1, -1), 4),
        ("RIGHTPADDING", (0, 0), (-1, -1), 4),
        ("TOPPADDING", (0, 0), (-1, -1), pad),
        ("BOTTOMPADDING", (0, 0), (-1, -1), pad),
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
    "android.permission.ACCESS_COARSE_LOCATION, "
    "android.permission.ACCESS_FINE_LOCATION, "
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.ACCESS_WIFI_STATE, "
    "android.permission.BLUETOOTH, "
    "android.permission.BLUETOOTH_ADMIN, "
    "android.permission.BLUETOOTH_CONNECT, "
    "android.permission.BLUETOOTH_SCAN, "
    "android.permission.CAMERA, "
    "android.permission.CHANGE_NETWORK_STATE, "
    "android.permission.FLASHLIGHT, "
    "android.permission.FOREGROUND_SERVICE, "
    "android.permission.FOREGROUND_SERVICE_DATA_SYNC, "
    "android.permission.INTERNET, "
    "android.permission.KB_WHITELIST_NFC, "
    "android.permission.NFC, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.RECEIVE_BOOT_COMPLETED, "
    "android.permission.RECORD_AUDIO, "
    "android.permission.REQUEST_COMPANION_USE_DATA_IN_BACKGROUND, "
    "android.permission.USE_BIOMETRIC, "
    "android.permission.VIBRATE, "
    "android.permission.WAKE_LOCK, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.gms.permission.AD_ID, "
    "com.paypal.android.p2pmobile.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

AD_NETWORKS = "нет"

ANALYTICS = (
    "Firebase Analytics, Firebase Cloud Messaging, Firebase Installations, "
    "Adjust (атрибуция), Adobe Experience Platform / Mobile Core "
    "(Edge, Identity, Consent, Messaging, Launch Rules), "
    "Datadog (RUM / trace / session replay), Statsig (feature flags), "
    "iovation / TransUnion DevicePrint (антифрод), "
    "Data Theorem TrustKit (pinning / TLS), "
    "Google Play Services AD_ID / measurement transport"
)

LIBRARIES = (
    "com.paypal.oslo / com.paypal.android / com.paypal.pds, "
    "androidx (compose, browser, webkit, camera, datastore, hilt, "
    "navigation, room, work, security-crypto, biometric), "
    "com.google.firebase, com.google.android.gms, com.google.mlkit, "
    "com.adjust.sdk, com.adobe.marketing.mobile, com.datadog, "
    "com.statsig.androidsdk, com.plaid, com.iovation, "
    "com.datatheorem.android.trustkit, com.knotapi, "
    "com.izettle / com.zettle, com.thalesgroup, com.gemalto, "
    "com.microblink, com.miteksystems.misnap, com.facetec, "
    "com.daon, com.dyneti, com.visa, com.mastercard, "
    "amex, eftpos, financial.atomic, jcb, upi, "
    "okhttp3, okio, retrofit2, io.ktor, coil3, dagger / hilt, "
    "com.apollographql, arrow, timber, kotlinx, "
    "com.airbnb.lottie, com.squareup.moshi, org.bouncycastle"
)

SHARED_PREFS = (
    "DataStore «oslo.preferences_pb» через AppStorage / AppStorageKey "
    "(модульные ключи настроек, сессии, feature flags); миграция из "
    "legacy SharedPreferences и EncryptedSharedPreferences "
    "(AES256-SIV / AES256-GCM) через SharedPrefsMigrationProvider; "
    "отдельные prefs у Thales Tap to Pay / 3DS / push-токенов; "
    "ключей offer_url / cloak / gate для схемы «оффер vs белое приложение» нет"
)

SUSPICIOUS_WORDS = (
    "affiliate / offer (Shopping Rewards IAB — партнёрские URL магазинов "
    "Honey/PayPal, не клоака трафика), landing (Tap to Pay landing image / "
    "UI), whitelist (KB_WHITELIST_NFC и allowlist SecureWebView), "
    "redirect (OAuth / checkout / deeplink), webview / loadUrl "
    "(штатные SecureWebView, DebitCard, 3DS, AffiliateWebView), "
    "bot / casino / poker / slots (ложные совпадения: TLD-список TrustKit, "
    "Google Places PlaceTypes, UI «Slots» в Compose — не гемблинг-клоака)"
)

DOMAIN_NOTES = {
    "analytics.plaid.com": (
        "Служебный хост аналитики SDK Plaid Link: приложение использует "
        "Plaid для привязки банковских счетов. Сюда уходят технические "
        "события линковки, а не «проверка кого пустить на оффер». "
        "VirusTotal 0/91, без редиректа; регистратор GANDI SAS. "
        "На вид безопасный домен известного финтех-провайдера."
    ),
    "api-m.paypal.com": (
        "Мобильный API PayPal (api-m): основной бэкенд приложения для "
        "платежей, сессий и GraphQL/REST вызовов. Прямой браузерный "
        "запрос упирается в защиту Cloudflare («Attention Required»), "
        "что нормально для API без клиентских заголовков. VirusTotal "
        "0/91. Официальная инфраструктура PayPal, не внешний лендинг."
    ),
    "api-m.sandbox.paypal.com": (
        "Песочница того же мобильного API PayPal для тестовых окружений. "
        "В бинарнике встречается рядом с прод-хостами; прямой ответ — "
        "403 Forbidden от Varnish. VirusTotal 0/91. Нужен для staging/"
        "QA, не для подмены экрана пользователя оффером."
    ),
    "api.paypal.com": (
        "Классический API-хост PayPal (в т.ч. SOAP/REST). При голом "
        "запросе отвечает служебной ошибкой «Method not implemented». "
        "VirusTotal 0/91, без редиректа на рекламную страницу. "
        "Штатный сервер продукта PayPal."
    ),
}


def load_checks():
    with open(CHECKS, "r", encoding="utf-8") as f:
        return json.load(f)


CHECKS_DATA = load_checks()
CHECKED_DOMAINS = [c["domain"] for c in CHECKS_DATA.get("checked", [])]

MAIN_ROWS = [
    (
        "Название приложения",
        "PayPal - Pay, Send, Save (com.paypal.android.p2pmobile), "
        "versionName 9.1.0 (versionCode 1160090083), "
        "разработчик PayPal Mobile",
    ),
    ("Android Gradle Plugin", "8.13.2"),
    ("minSdk", "26"),
    ("targetSdk", "36"),
    ("Kotlin", "да 2.3.10"),
    ("Web View", "да"),
    ("Custom Tabs", "да"),
    ("Рекламные сети", AD_NETWORKS),
    ("Аналитика", ANALYTICS),
    ("Permissions", PERMISSIONS),
    ("Libraries", LIBRARIES),
    (
        "Подозрительные домены",
        ", ".join(CHECKED_DOMAINS) if CHECKED_DOMAINS else "нет",
    ),
    ("SharedPreferences", SHARED_PREFS),
    ("Есть ли клоака", "нет"),
    ("Подозрительные слова", SUSPICIOUS_WORDS),
]


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
        title="Отчёт по анализу APK — PayPal - Pay, Send, Save",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(
        Paragraph(
            "PayPal - Pay, Send, Save &mdash; PayPal Mobile &mdash; "
            "com.paypal.android.p2pmobile "
            "(versionName 9.1.0 / versionCode 1160090083)",
            BODY,
        )
    )
    story.append(
        Paragraph(
            "Разобраны: com.paypal.android.p2pmobile.xapk, "
            "apk/com.paypal.android.p2pmobile.apk, языковые и ABI/dpi "
            "config.*.apk, meta.json, domain_checks.json / domain_checks.md, "
            "decompiled/resources/AndroidManifest.xml, "
            "res/values/strings.xml и jadx-исходники (com.paypal.oslo, "
            "com.paypal.android, com.adjust, com.adobe, com.datadog, "
            "com.statsig, com.plaid, com.iovation, androidx, okhttp3, "
            "firebase и др.). Точка входа: OsloApplication → "
            "MainActivity (Compose Navigation3, обычный fintech UI / "
            "логин / кошелёк). Тихой серверной развилки "
            "«оффер vs белое приложение» нет: это официальный клиент PayPal. "
            "Statsig и Adobe используются для feature flags и продуктовой "
            "аналитики внутри приложения, не для подмены экрана казино.",
            SMALL,
        )
    )

    story.append(Paragraph("SDK / стек", H2))
    story.append(
        kv_table(
            MAIN_ROWS,
            widths=(42 * mm, 128 * mm),
            header=("Параметр", "Значение"),
            compact=True,
        )
    )

    if CHECKED_DOMAINS:
        story.append(Paragraph("Проверка подозрительных доменов", H2))
        story.append(
            Paragraph(
                "Данные ниже взяты как есть из готовых проверок пайплайна "
                "(domain_checks.json / domain_checks.md): сводка VirusTotal, "
                "полный список Security vendors' analysis и три дополнительных "
                "пункта в конце. Хосты — инфраструктура PayPal / Plaid; "
                "клоаки трафика по ним не видно.",
                SMALL,
            )
        )

        for dom in CHECKED_DOMAINS:
            rec = by_domain.get(dom)
            if not rec:
                continue
            rows = [(r["param"], r["value"]) for r in rec.get("table_rows", [])]
            story.append(Paragraph("Проверка домена: %s" % esc(dom), H2))
            story.append(
                kv_table(
                    rows,
                    widths=(62 * mm, 108 * mm),
                    header=("Параметр / движок", "Значение / вердикт"),
                )
            )
            note = DOMAIN_NOTES.get(dom)
            if note:
                story.append(Paragraph(esc(note), BODY))
            story.append(Spacer(1, 2 * mm))

    doc.build(story)
    print("Wrote", OUT)


if __name__ == "__main__":
    build()
