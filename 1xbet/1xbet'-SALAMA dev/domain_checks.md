# Проверка подозрительных доменов

Кастомные хосты из APK (не google/gstatic/googleapis/firebase CDN крупных SDK).

## sqz.andromo.com

| Параметр / движок | Значение / вердикт |
|---|---|
| Домен | sqz.andromo.com |
| VirusTotal URL | https://www.virustotal.com/gui/domain/sqz.andromo.com |
| Роль в APK | Базовый хост Andromo squeeze/hosted web content (`https://sqz.andromo.com` в `libapp.so`) |
| Клоака-ворота? | нет — платформенный CDN билдера, не развилка white/offer в коде |
| Куда редиректит | (проверка: корневой HEAD без ответа в среде анализа) |
| Что выводит (кратко) | Andromo hosted pages |
| Где припаркован | Andromo / Appmakr infrastructure |

## builder.andromo.com

| Параметр / движок | Значение / вердикт |
|---|---|
| Домен | builder.andromo.com |
| VirusTotal URL | https://www.virustotal.com/gui/domain/builder.andromo.com |
| Роль в APK | Hub URL `https://builder.andromo.com/hub/c1e2365349b385c9a4b77ea7f068062a/` |
| HTTP | 200 OK (HTML) |
| Клоака-ворота? | нет |
| Куда редиректит | нет (200) |
| Что выводит (кратко) | Andromo builder hub |
| Где припаркован | Andromo |

## inapppurchase.andromo.com

| Параметр / движок | Значение / вердикт |
|---|---|
| Домен | inapppurchase.andromo.com |
| Роль в APK | `https://inapppurchase.andromo.com/verify/` (+ staging twin) |
| HTTP | 404 на корне |
| Клоака-ворота? | нет (IAP verify) |

## cfg.flurry.com / data.flurry.com

| Параметр / движок | Значение / вердикт |
|---|---|
| Домены | cfg.flurry.com, data.flurry.com |
| Роль в APK | Flurry SDK config + event ingest |
| Клоака-ворота? | нет (стандартная аналитика; GAID/locale уходят в Flurry, без ветвления UI) |

## o582999.ingest.sentry.io

| Параметр / движок | Значение / вердикт |
|---|---|
| Домен | o582999.ingest.sentry.io |
| Роль в APK | Sentry DSN ingest |
| Клоака-ворота? | нет |

## sites.google.com (salama-dev)

| Параметр / движок | Значение / вердикт |
|---|---|
| URL | https://sites.google.com/view/salama-dev |
| Роль в APK | Страница разработчика / about |
| Клоака-ворота? | нет |
