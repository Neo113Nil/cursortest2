#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Сборка PDF-отчёта по анализу APK Foxtail Sports Betting Picks."""

import json
import os

from reportlab.lib import colors
from reportlab.lib.enums import TA_LEFT
from reportlab.lib.pagesizes import A4
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import Paragraph, SimpleDocTemplate, Spacer, Table, TableStyle

BASE = os.path.dirname(os.path.abspath(__file__))
OUT = os.path.join(BASE, "report.pdf")
CHECKS = os.path.join(BASE, "domain_checks.json")

FONT_DIR = "/usr/share/fonts/truetype/dejavu"
pdfmetrics.registerFont(TTFont("DJ", os.path.join(FONT_DIR, "DejaVuSans.ttf")))
pdfmetrics.registerFont(TTFont("DJ-B", os.path.join(FONT_DIR, "DejaVuSans-Bold.ttf")))

H1 = ParagraphStyle("H1", fontName="DJ-B", fontSize=16, leading=20,
                    spaceAfter=8, textColor=colors.HexColor("#12263f"))
H2 = ParagraphStyle("H2", fontName="DJ-B", fontSize=12.5, leading=16,
                    spaceBefore=12, spaceAfter=6,
                    textColor=colors.HexColor("#12263f"))
BODY = ParagraphStyle("BODY", fontName="DJ", fontSize=9.3, leading=13.4,
                      alignment=TA_LEFT, spaceAfter=5)
CELL = ParagraphStyle("CELL", fontName="DJ", fontSize=8.2, leading=10.8)
CELL_B = ParagraphStyle("CELL_B", fontName="DJ-B", fontSize=8.2, leading=10.8)
SMALL = ParagraphStyle("SMALL", fontName="DJ", fontSize=8.4, leading=11.6,
                       textColor=colors.HexColor("#444444"), spaceAfter=6)

GRID = colors.HexColor("#b9c2cc")
HEAD_BG = colors.HexColor("#1f3b57")
ALT_BG = colors.HexColor("#f2f5f8")


def esc(text):
    return (str(text).replace("&", "&amp;").replace("<", "&lt;")
            .replace(">", "&gt;"))


def kv_table(rows, widths=(52 * mm, 118 * mm), header=None):
    data = []
    if header:
        data.append([
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[0]), CELL_B),
            Paragraph('<font color="#ffffff">%s</font>' % esc(header[1]), CELL_B),
        ])
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
    "android.permission.ACCESS_NETWORK_STATE, "
    "android.permission.POST_NOTIFICATIONS, "
    "android.permission.WAKE_LOCK, "
    "android.permission.USE_CREDENTIALS, "
    "android.permission.ACCESS_ADSERVICES_ATTRIBUTION, "
    "android.permission.ACCESS_ADSERVICES_AD_ID, "
    "com.android.vending.BILLING, "
    "com.android.vending.CHECK_LICENSE, "
    "com.google.android.c2dm.permission.RECEIVE, "
    "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE, "
    "com.foxtailsports.app.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
)

AD_NETWORKS = "нет"

ANALYTICS = (
    "Firebase Analytics / Google Analytics for Firebase (measurement), "
    "Firebase Cloud Messaging, Firebase Installations, "
    "Google Play Install Referrer, Google Advertising ID library "
    "(play-services-ads-identifier, без AdMob), "
    "Facebook SDK App Events (плагин logEvent; AutoLogAppEventsEnabled=false, "
    "AdvertiserIDCollectionEnabled=false)"
)

LIBRARIES = (
    "Capacitor (com.getcapacitor, BridgeActivity / WebView), "
    "Cordova WebView (org.apache.cordova), "
    "@capacitor/browser (Custom Tabs), @capacitor/app, "
    "@capacitor/push-notifications, "
    "@capacitor-community/facebook-login, "
    "@capacitor-community/apple-sign-in, "
    "@codetrix-studio/capacitor-google-auth, "
    "@capgo/native-purchases (ee.forgr.nativepurchases), "
    "androidx.appcompat, androidx.activity, androidx.fragment, androidx.core "
    "(+ktx, splashscreen), androidx.browser, androidx.webkit, "
    "androidx.lifecycle, androidx.datastore, androidx.emoji2, "
    "androidx.privacysandbox.ads, androidx.profileinstaller, androidx.startup, "
    "Kotlin stdlib (metadata 1.9.0), kotlinx-coroutines 1.9.0, Okio, "
    "Google Play Services (auth, base/basement, cloud-messaging, measurement, "
    "tasks, location, ads-identifier), "
    "Firebase (analytics, messaging, installations, datatransport, common), "
    "Facebook SDK (login / common / customtabs), "
    "Google Play Billing 8.3.0 (com.android.billingclient), "
    "PairIP / Play license check (com.pairip.licensecheck), "
    "ZXing (com.google.zxing)"
)

SHARED_PREFS = (
    "foxtail_app: ключ last_version_code — сброс кэша встроенного окна сайта "
    "при обновлении версии; CapWebViewSettings: serverBasePath, "
    "lastBinaryVersionCode, lastBinaryVersionName; "
    "в веб-части sessionStorage/localStorage: foxtail_session_id, "
    "api-cache:*, offline-action-queue, pendingPlan, "
    "foxtail_update_dismissed_<version>, seenPredictions"
)

SUSPICIOUS_DOMAINS = [
    "app.foxtailsports.com",
]

DOMAIN_NOTES = {
    "app.foxtailsports.com": (
        "Это основной сервер самого Foxtail Sports. Приложение на Capacitor "
        "сначала открывает локальные страницы из памяти телефона, а сетевые "
        "запросы (вход, подписка, прогнозы, пуш-токен) перенаправляет на "
        "https://app.foxtailsports.com. Страница отдаёт обычный продукт "
        "«AI sports picks» без постороннего рекламного лендинга; по VirusTotal "
        "детекции 0/91, редиректа нет. На вид это собственный бэкенд "
        "разработчика, а не скрытый «gate» для чужого оффера."
    ),
}

SUSPICIOUS_WORDS = (
    "betting, sports betting, betting_lines, betting-preferences, "
    "parlay / parlay-builder, odds, offer / promotional offers / What We Offer, "
    "promo / promo-codes / retention offer, redirect (auth/checkout/onboarding), "
    "bot (запрет ботов в Terms), banned-entities / capture-ip (антиабьюз админки)"
)

MAIN_ROWS = [
    ("Название приложения",
     "Foxtail Sports Betting Picks (Foxtail Sports), "
     "com.foxtailsports.app, версия 1.0.46 (versionCode 46), "
     "разработчик Foxtail Sports LLC"),
    ("Android Gradle Plugin", "9.0.0"),
    ("minSdk", "24"),
    ("targetSdk", "36"),
    ("Kotlin", "да, 1.9.0"),
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


def build():
    with open(CHECKS, "r", encoding="utf-8") as f:
        checks = json.load(f)
    by_domain = {c["domain"]: c for c in checks.get("checked", [])}

    doc = SimpleDocTemplate(
        OUT, pagesize=A4,
        leftMargin=18 * mm, rightMargin=18 * mm,
        topMargin=15 * mm, bottomMargin=15 * mm,
        title="Отчёт по анализу APK — Foxtail Sports Betting Picks",
        author="Анализ Android APK",
    )

    story = []
    story.append(Paragraph("Отчёт по анализу Android-приложения", H1))
    story.append(Paragraph(
        "Foxtail Sports Betting Picks &mdash; Foxtail Sports LLC &mdash; "
        "com.foxtailsports.app (версия 1.0.46)", BODY))
    story.append(Paragraph(
        "Разобраны: xapk/apk-сплиты, meta.json, domain_checks, "
        "AndroidManifest.xml, strings.xml, capacitor.config.json, "
        "network_security_config, assets/public (Next.js), "
        "decompiled/sources (MainActivity → BridgeActivity, Capacitor plugins, "
        "Firebase / Facebook / Billing / PairIP).", SMALL))

    story.append(Paragraph("SDK / стек", H2))
    story.append(kv_table(MAIN_ROWS, header=("Параметр", "Значение")))

    story.append(Paragraph("Проверка подозрительных доменов", H2))
    story.append(Paragraph(
        "Данные ниже взяты как есть из готовых проверок пайплайна "
        "(domain_checks.json / domain_checks.md): сводка VirusTotal, полный список "
        "Security vendors' analysis и три дополнительных пункта в конце.", SMALL))

    for dom in SUSPICIOUS_DOMAINS:
        rec = by_domain.get(dom)
        if not rec:
            continue
        rows = [(r["param"], r["value"]) for r in rec.get("table_rows", [])]
        story.append(Paragraph("Проверка домена: %s" % esc(dom), H2))
        story.append(kv_table(rows, widths=(62 * mm, 108 * mm),
                              header=("Параметр / движок", "Значение / вердикт")))
        note = DOMAIN_NOTES.get(dom)
        if note:
            story.append(Paragraph(esc(note), BODY))
        story.append(Spacer(1, 3 * mm))

    doc.build(story)
    print("saved:", OUT)


if __name__ == "__main__":
    build()
