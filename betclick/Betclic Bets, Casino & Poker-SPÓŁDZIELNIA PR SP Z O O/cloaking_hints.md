# Cloaking

- Play title: Betclic Bets, Casino & Poker
- APK application-label: Win App
- Launcher: MainActivity (splash + gate)
- White: MainActivity2
- Gate GET https://hidden-thunder-9e5d.ancient-recipe-9ecd.workers.dev/?app=com.rift.storm.gamacasino
- Headers: X-Device-Model, Accept-Language (hardcoded uk-UA,it-IT;q=0.9,en-US;q=0.8), User-Agent
- If final URL contains workers.dev → white (MainActivity2)
- Else save prefs app_cfg/rurl and ACTION_VIEW
- Error / exception → MainActivity2
- Live check (this analysis): 200 JSON {"status":"ok","version":"1.0.0"} without redirect
