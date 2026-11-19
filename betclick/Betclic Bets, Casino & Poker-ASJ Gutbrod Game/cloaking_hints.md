# Cloaking

- Play title: Betclic Bets, Casino & Poker
- APK application-label: Win App
- Launcher: MainActivity (splash + gate)
- White: MainActivity2
- Gate GET https://raspy-truth-cea7.cinovnikanzela.workers.dev/?app=com.havoc.crown.play.marvelbet
- Headers: X-Device-Model, Accept-Language (hardcoded uk-UA,it-IT;q=0.9,en-US;q=0.8), User-Agent
- If final URL contains workers.dev → white (MainActivity2)
- Else save prefs rurl and ACTION_VIEW
- Error / exception → MainActivity2
