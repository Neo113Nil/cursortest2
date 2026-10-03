Play «Chicken Road 2» / application-label «Hive Almanac». Package com.jorden.karto.tharnox vc1.

Чеклист:
- Application.onCreate: Hilt/Dagger-компонент (e7), без сети.
- Splash / attachBaseContext нет.
- MainActivity.onCreate: Jetpack Compose (wp), ViewModel, без WebView/Custom Tabs/ACTION_VIEW оффера.
- INTERNET в манифесте нет. HttpURLConnection/OkHttp/Volley/Retrofit в dex нет.
- Remote Config / Firebase / реклама / аналитика / PairIP нет.
- DataStore datastore/almanac_prefs.preferences_pb (ключ hide_opened).
- Room hive_almanac.db: frames, runs, compare_pairs, open_events; сид po из локального списка tp.
- dispatchers.io = kotlinx.coroutines Dispatchers.IO.
- lineheightstyle.alignment.top = Compose LineHeightStyle.Alignment.Top.

Клоака = нет: развилки оффер/белая нет, это локальный пчеловодческий альманах под другим именем в Play.
