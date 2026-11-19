# Cloaking

- Play title: Betclic Bets, Casino & Poker
- APK application-label: Win App
- Launcher: MainActivity (splash + gate)
- White: MainActivity2
- Gate GET https://noisy-glitter-9c54.thabanifoundation.workers.dev/?app=com.epoch.wave.espnbet
- Headers: X-Device-Model, Accept-Language (hardcoded uk-UA,it-IT;q=0.9,en-US;q=0.8), User-Agent
- If final URL contains workers.dev → white (C0153gg)
- Else save prefs data/goto and ACTION_VIEW
- Error / exception → MainActivity2
