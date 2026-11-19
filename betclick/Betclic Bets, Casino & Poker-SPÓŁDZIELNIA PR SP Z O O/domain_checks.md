# Проверка подозрительных доменов

`config.ru` в `splits0.xml` — это языковой сплит Play (русский), а не сетевой хост. Таблица VirusTotal для config.ru из пайплайна не используется.

Реальный кастомный хост клоаки: `hidden-thunder-9e5d.ancient-recipe-9ecd.workers.dev`. Пайплайн не вернул по нему движки VirusTotal — выдумывать вердикты нельзя.

## Проверка домена: hidden-thunder-9e5d.ancient-recipe-9ecd.workers.dev

| Параметр / движок | Значение / вердикт |
|---|---|
| Домен | hidden-thunder-9e5d.ancient-recipe-9ecd.workers.dev |
| VirusTotal URL | https://www.virustotal.com/gui/domain/hidden-thunder-9e5d.ancient-recipe-9ecd.workers.dev |
| Детекции | нет |
| Security vendors' analysis | нет |
| Куда редиректит | нет |
| Что выводит (кратко) | {"status":"ok","version":"1.0.0"} (служебный JSON, без внешней страницы) |
| Где припаркован | Cloudflare Workers (workers.dev), A 172.67.141.249 |
