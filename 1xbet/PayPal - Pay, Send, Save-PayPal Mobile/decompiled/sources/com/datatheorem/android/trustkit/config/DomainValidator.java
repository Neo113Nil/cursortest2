package com.datatheorem.android.trustkit.config;

/* loaded from: classes8.dex */
class DomainValidator implements java.io.Serializable {
    private static final java.lang.String[] getHighSpeedVideoSizes;
    private static volatile java.lang.String[] getHighSpeedVideoSizesFor = null;
    private static volatile java.lang.String[] getInputFormats = null;
    private static volatile java.lang.String[] getInputSizeshNQ4ISI = null;
    private static volatile java.lang.String[] getOutputSizeshNQ4ISI = null;
    private static final long serialVersionUID = -4407125112880174009L;
    private final boolean getOutputSizes;
    private final com.datatheorem.android.trustkit.config.RegexValidator getOutputStallDuration = new com.datatheorem.android.trustkit.config.RegexValidator("^(?:\\p{Alnum}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?\\.)+(\\p{Alpha}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?)\\.?$");
    private final com.datatheorem.android.trustkit.config.RegexValidator getOutputStallDurationlomOqCM = new com.datatheorem.android.trustkit.config.RegexValidator("\\p{Alnum}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?");
    private static final com.datatheorem.android.trustkit.config.DomainValidator getHighResolutionOutputSizeshNQ4ISI = new com.datatheorem.android.trustkit.config.DomainValidator(false);
    private static final com.datatheorem.android.trustkit.config.DomainValidator Camera2StreamConfigurationMap = new com.datatheorem.android.trustkit.config.DomainValidator(true);
    private static final java.lang.String[] getOutputFormats = {"arpa"};
    private static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {"aaa", "aarp", "abb", "abbott", "abbvie", "abogado", "abudhabi", "academy", "accenture", "accountant", "accountants", "aco", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE, "actor", "adac", "ads", "adult", "aeg", "aero", "afl", "agakhan", "agency", "aig", "airforce", "airtel", "akdn", "alibaba", "alipay", "allfinanz", "ally", "alsace", "amica", "amsterdam", "analytics", com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME, "anquan", "apartments", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, "apple", "aquarelle", "aramco", "archi", "army", "arte", "asia", "associates", "attorney", "auction", "audi", "audio", "author", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "autos", "avianca", "aws", "axa", "azure", "baby", "baidu", "band", "bank", com.google.android.libraries.places.api.model.PlaceTypes.BAR, "barcelona", "barclaycard", "barclays", "barefoot", "bargains", "bauhaus", "bayern", "bbc", "bbva", "bcg", "bcn", "beats", "beer", "bentley", "berlin", "best", "bet", "bharti", "bible", "bid", "bike", "bing", "bingo", "bio", "biz", "black", "blackfriday", "bloomberg", "blue", "bms", "bmw", "bnl", "bnpparibas", "boats", "boehringer", "bom", "bond", "boo", "book", "boots", "bosch", "bostik", "bot", "boutique", "bradesco", "bridgestone", "broadway", com.datadog.trace.bootstrap.instrumentation.api.Tags.SPAN_KIND_BROKER, "brother", "brussels", "budapest", "bugatti", "build", "builders", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UserProfileConstants.KEY_ACCOUNT_TYPE_BUSINESS, "buy", "buzz", "bzh", "cab", com.google.android.libraries.places.api.model.PlaceTypes.CAFE, "cal", androidx.core.app.NotificationCompat.CATEGORY_CALL, com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "camp", "cancerresearch", "canon", "capetown", "capital", "car", "caravan", "cards", "care", "career", "careers", "cars", "cartier", "casa", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.CASH, com.google.android.libraries.places.api.model.PlaceTypes.CASINO, "cat", "catering", "cba", "cbn", "ceb", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "ceo", "cern", "cfa", "cfd", "chanel", "channel", "chase", "chat", "cheap", "chloe", "christmas", "chrome", com.google.android.libraries.places.api.model.PlaceTypes.CHURCH, "cipriani", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.CIRCLE, "cisco", "citic", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity, "cityeats", "claims", "cleaning", com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.AccountNumbersScreen.NAVIGATION_TYPE, "clinic", "clinique", "clothing", "cloud", "club", "clubmed", "coach", "codes", "coffee", "college", "cologne", "com", "commbank", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_MONEY_POOLS_VALUE, "company", "compare", "computer", "comsec", "condos", "construction", "consulting", "contact", "contractors", "cooking", "cool", "coop", "corsica", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "coupon", "coupons", "courses", "credit", "creditcard", "creditunion", "cricket", "crown", "crs", "cruises", "csc", "cuisinella", "cymru", "cyou", "dabur", "dad", "dance", "date", "dating", "datsun", "day", "dclk", "dealer", "deals", "degree", "delivery", "dell", "deloitte", "delta", "democrat", "dental", com.google.android.libraries.places.api.model.PlaceTypes.DENTIST, "desi", "design", "dev", "diamonds", "diet", "digital", com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef.DIRECT, "directory", "discount", "dnp", "docs", "dog", "doha", "domains", "download", "drive", "dubai", "durban", "dvag", "earth", "eat", "edeka", "edu", "education", "email", "emerck", "energy", "engineer", "engineering", "enterprises", "epson", "equipment", "erni", "esq", "estate", "eurovision", "eus", "events", "everbank", "exchange", "expert", "exposed", "express", "extraspace", "fage", "fail", "fairwinds", "faith", "family", "fan", "fans", "farm", "fashion", "fast", "feedback", "ferrero", "film", "final", com.google.android.libraries.places.api.model.PlaceTypes.FINANCE, "financial", "firestone", "firmdale", "fish", "fishing", "fit", "fitness", "flickr", "flights", com.google.android.libraries.places.api.model.PlaceTypes.FLORIST, "flowers", "flsmidth", "fly", "foo", "football", "ford", "forex", "forsale", "forum", "foundation", "fox", "fresenius", "frl", "frogans", "frontier", "ftr", "fund", "furniture", "futbol", "fyi", "gal", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_GALLERY, "gallo", "gallup", "game", "garden", "gbiz", "gdn", "gea", "gent", "genting", "ggee", "gift", "gifts", "gives", "giving", "glass", "gle", "global", "globo", "gmail", "gmbh", "gmo", "gmx", "gold", "goldpoint", "golf", "goo", "goog", com.adjust.sdk.Constants.REFERRER_API_GOOGLE, "gop", "got", "gov", "grainger", "graphics", "gratis", "green", "gripe", "group", "gucci", "guge", "guide", "guitars", "guru", "hamburg", "hangout", "haus", "hdfcbank", com.google.android.libraries.places.api.model.PlaceTypes.HEALTH, "healthcare", "help", "helsinki", "here", "hermes", "hiphop", "hitachi", "hiv", "hockey", "holdings", "holiday", "homedepot", "homes", "honda", "horse", com.datadog.android.log.LogAttributes.HOST, "hosting", "hoteles", "hotmail", "house", "how", "hsbc", "htc", "hyundai", "ibm", "icbc", "ice", androidx.room.FtsOptions.TOKENIZER_ICU, "ifm", "iinet", "imamat", "immo", "immobilien", "industries", "infiniti", "info", "ing", "ink", "institute", "insurance", "insure", com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT, "international", "investments", "ipiranga", "irish", "iselect", "ismaili", "ist", "istanbul", "itau", "iwc", "jaguar", "java", "jcb", "jcp", "jetzt", "jewelry", "jlc", "jll", "jmp", "jnj", "jobs", "joburg", "jot", "joy", "jpmorgan", "jprs", "juegos", "kaufen", "kddi", "kerryhotels", "kerrylogistics", "kerryproperties", "kfh", "kia", "kim", "kinder", "kitchen", "kiwi", "koeln", "komatsu", "kpmg", "kpn", "krd", "kred", "kuokgroup", "kyoto", "lacaixa", "lamborghini", "lamer", "lancaster", "land", "landrover", "lanxess", "lasalle", "lat", "latrobe", "law", com.google.android.libraries.places.api.model.PlaceTypes.LAWYER, "lds", "lease", "leclerc", "legal", "lexus", "lgbt", "liaison", "lidl", "life", "lifeinsurance", "lifestyle", "lighting", "like", "limited", "limo", "lincoln", "linde", "link", "live", "living", "lixil", "loan", "loans", "locus", "lol", "london", "lotte", "lotto", "love", "ltd", "ltda", "lupin", "luxe", "luxury", "madrid", "maif", "maison", "makeup", "man", com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.MANAGEMENT, "mango", "market", "marketing", "markets", "marriott", "mba", "med", io.ktor.http.LinkHeader.Parameters.Media, "meet", "melbourne", "meme", "memorial", "men", "menu", "meo", "miami", "microsoft", "mil", "mini", "mls", "mma", "mobi", "mobily", "moda", "moe", "moi", "mom", "monash", "money", "montblanc", "mormon", "mortgage", "moscow", "motorcycles", "mov", "movie", "movistar", "mtn", "mtpc", "mtr", com.google.android.libraries.places.api.model.PlaceTypes.MUSEUM, "mutual", "mutuelle", "nadex", "nagoya", "name", "natura", "navy", "nec", "net", "netbank", "network", "neustar", "new", "news", "nexus", "ngo", "nhk", "nico", "nikon", "ninja", "nissan", "nissay", "nokia", "northwesternmutual", "norton", "nowruz", "nra", "nrw", "ntt", "nyc", "obi", "office", "okinawa", "omega", "one", "ong", "onl", androidx.browser.customtabs.CustomTabsCallback.ONLINE_EXTRAS_KEY, "ooo", "oracle", "orange", "org", "organic", "origins", "osaka", "otsuka", "ovh", "page", "pamperedchef", "panerai", "paris", "pars", "partners", "parts", "party", "passagens", "pet", com.google.android.libraries.places.api.model.PlaceTypes.PHARMACY, "philips", "photo", "photography", "photos", "physio", "piaget", "pics", "pictet", "pictures", "pid", "pin", "ping", "pink", "pizza", "place", "play", "playstation", "plumbing", "plus", "pohl", "poker", "porn", "post", "praxi", "press", "pro", "prod", "productions", "prof", "progressive", androidx.core.app.NotificationCompat.CATEGORY_PROMO, "properties", "property", "protection", "pub", "pwc", "qpon", "quebec", "quest", "racing", "read", "realtor", "realty", "recipes", "red", "redstone", "redumbrella", "rehab", "reise", "reisen", "reit", "ren", "rent", "rentals", "repair", "report", "republican", "rest", com.google.android.libraries.places.api.model.PlaceTypes.RESTAURANT, "review", "reviews", "rexroth", "rich", "ricoh", "rio", "rip", "rocher", "rocks", "rodeo", com.google.android.libraries.places.api.model.PlaceTypes.ROOM, "rsvp", "ruhr", "run", "rwe", "ryukyu", "saarland", "safe", "safety", "sakura", "sale", "salon", com.adjust.sdk.Constants.REFERRER_API_SAMSUNG, "sandvik", "sandvikcoromant", "sanofi", "sap", "sapo", "sarl", "sas", "saxo", "sbi", "sbs", "sca", "scb", "schaeffler", "schmidt", "scholarships", com.google.android.libraries.places.api.model.PlaceTypes.SCHOOL, "schule", "schwarz", "science", "scor", "scot", "seat", "security", "seek", "select", "sener", com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.Services, "seven", "sew", "sex", "sexy", "sfr", "sharp", "shaw", "shell", "shia", "shiksha", "shoes", "shouji", "show", "shriram", "sina", "singles", com.datadog.trace.api.config.GeneralConfig.SITE, "ski", "skin", "sky", "skype", "smile", "sncf", "soccer", androidx.core.app.NotificationCompat.CATEGORY_SOCIAL, "softbank", "software", "sohu", "solar", "solutions", "song", "sony", "soy", "space", "spiegel", "spot", "spreadbetting", "srl", "stada", "star", "starhub", "statebank", "statefarm", "statoil", "stc", "stcgroup", "stockholm", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, com.google.android.libraries.places.api.model.PlaceTypes.STORE, "stream", "studio", "study", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "sucks", "supplies", "supply", com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.SUPPORT_PREFIX, "surf", "surgery", "suzuki", "swatch", "swiss", "sydney", "symantec", "systems", "tab", "taipei", "talk", "taobao", "tatamotors", "tatar", "tattoo", "tax", "taxi", "tci", "team", "tech", "technology", "tel", "telecity", "telefonica", "temasek", "tennis", "teva", "thd", "theater", "theatre", "tickets", "tienda", "tiffany", "tips", "tires", "tirol", "tmall", "today", "tokyo", "tools", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, "toray", "toshiba", "total", "tours", "town", "toyota", "toys", "trade", "trading", "training", "travel", "travelers", "travelersinsurance", "trust", "trv", "tube", "tui", "tunes", "tushu", "tvs", "ubs", "unicom", com.google.android.libraries.places.api.model.PlaceTypes.UNIVERSITY, "uno", "uol", "vacations", "vana", "vegas", "ventures", "verisign", "versicherung", "vet", "viajes", "video", "vig", "viking", "villas", "vin", "vip", "virgin", "vision", "vista", "vistaprint", "viva", "vlaanderen", "vodka", "volkswagen", "vote", "voting", "voto", "voyage", "vuelos", "wales", "walter", "wang", "wanggou", "watch", "watches", "weather", "weatherchannel", "webcam", "weber", com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.IDV_WEBSITE, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.WEDNESDAY, "wedding", "weibo", "weir", "whoswho", "wien", "wiki", "williamhill", "win", "windows", "wine", "wme", "wolterskluwer", "work", "works", "world", "wtc", "wtf", "xbox", "xerox", "xihuan", "xin", "xn--11b4c3d", "xn--1ck2e1b", "xn--1qqw23a", "xn--30rr7y", "xn--3bst00m", "xn--3ds443g", "xn--3pxu8k", "xn--42c2d9a", "xn--45q11c", "xn--4gbrim", "xn--55qw42g", "xn--55qx5d", "xn--5tzm5g", "xn--6frz82g", "xn--6qq986b3xl", "xn--80adxhks", "xn--80asehdb", "xn--80aswg", "xn--8y0a063a", "xn--9dbq2a", "xn--9et52u", "xn--9krt00a", "xn--b4w605ferd", "xn--bck1b9a5dre4c", "xn--c1avg", "xn--c2br7g", "xn--cck2b3b", "xn--cg4bki", "xn--czr694b", "xn--czrs0t", "xn--czru2d", "xn--d1acj3b", "xn--eckvdtc9d", "xn--efvy88h", "xn--estv75g", "xn--fct429k", "xn--fhbei", "xn--fiq228c5hs", "xn--fiq64b", "xn--fjq720a", "xn--flw351e", "xn--g2xx48c", "xn--gckr3f0f", "xn--hxt814e", "xn--i1b6b1a6a2e", "xn--imr513n", "xn--io0a7i", "xn--j1aef", "xn--jlq61u9w7b", "xn--jvr189m", "xn--kcrx77d1x4a", "xn--kpu716f", "xn--kput3i", "xn--mgba3a3ejt", "xn--mgbab2bd", "xn--mgbb9fbpob", "xn--mgbca7dzdo", "xn--mgbt3dhd", "xn--mk1bu44c", "xn--mxtq1m", "xn--ngbc5azd", "xn--ngbe9e0a", "xn--nqv7f", "xn--nqv7fs00ema", "xn--nyqy26a", "xn--p1acf", "xn--pbt977c", "xn--pssy2u", "xn--q9jyb4c", "xn--qcka1pmc", "xn--rhqv96g", "xn--rovu88b", "xn--ses554g", "xn--t60b56a", "xn--tckwe", "xn--unup4y", "xn--vermgensberater-ctb", "xn--vermgensberatung-pwb", "xn--vhquv", "xn--vuq861b", "xn--w4r85el8fhu5dnra", "xn--xhq521b", "xn--zfr164b", "xperia", com.datadog.android.sessionreplay.internal.recorder.mapper.NumberPickerMapper.DEFAULT_MASKED_TEXT_VALUE, "xyz", "yachts", "yahoo", "yamaxun", "yandex", "yodobashi", "yoga", "yokohama", "you", "youtube", "yun", "zara", "zero", "zip", "zone", "zuerich"};
    private static final java.lang.String[] getHighSpeedVideoFpsRanges = {"ac", "ad", "ae", "af", "ag", "ai", "al", "am", "ao", "aq", "ar", "as", "at", "au", "aw", "ax", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bm", "bn", "bo", "br", "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cd", "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn", "co", "cr", "cu", "cv", "cw", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "er", "es", "et", "eu", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gg", "gh", "gi", "gl", "gm", "gn", "gp", "gq", "gr", "gs", "gt", "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu", "id", "ie", "il", "im", "in", "io", "iq", "ir", "is", "it", "je", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn", "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", "me", "mg", "mh", "mk", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", com.paypal.oslo.feature.inappcheckout.Constants.MERCHANT_PATH_MU, "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nu", "nz", "om", "pa", "pe", "pf", "pg", "ph", "pk", "pl", "pm", "pn", "pr", "ps", "pt", "pw", "py", "qa", "re", "ro", "rs", "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", "so", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.SR_TRACK_NAME, "st", "su", "sv", "sx", "sy", "sz", "tc", lib.android.paypal.com.magnessdk.g.q2, "tf", "tg", "th", "tj", "tk", "tl", "tm", "tn", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "tr", "tt", "tv", "tw", "tz", "ua", "ug", "uk", "us", "uy", "uz", "va", "vc", "ve", "vg", "vi", "vn", "vu", "wf", "ws", "xn--3e0b707e", "xn--45brj9c", "xn--80ao21a", "xn--90a3ac", "xn--90ais", "xn--clchc0ea0b2g2a9gcd", "xn--d1alf", "xn--e1a4c", "xn--fiqs8s", "xn--fiqz9s", "xn--fpcrj9c3d", "xn--fzc2c9e2c", "xn--gecrj9c", "xn--h2brj9c", "xn--j1amh", "xn--j6w193g", "xn--kprw13d", "xn--kpry57d", "xn--l1acc", "xn--lgbbat1ad8j", "xn--mgb9awbf", "xn--mgba3a4f16a", "xn--mgbaam7a8h", "xn--mgbayh7gpa", "xn--mgbbh1a71e", "xn--mgbc0a9azcg", "xn--mgberp4a5d4ar", "xn--mgbpl2fh", "xn--mgbtx2b", "xn--mgbx4cd0ab", "xn--mix891f", "xn--node", "xn--o3cw4h", "xn--ogbpf8fl", "xn--p1ai", "xn--pgbs0dh", "xn--qxam", "xn--s9brj9c", "xn--wgbh1c", "xn--wgbl6a", "xn--xkc2al3hye2a", "xn--xkc2dl3a5ee0h", "xn--y9a3aq", "xn--yfro4i67o", "xn--ygbi2ammx", "ye", "yt", "za", "zm", "zw"};
    private static final java.lang.String[] getOutputMinFrameDuration = {"localdomain", com.datadog.trace.api.ConfigDefaults.DEFAULT_AGENT_HOST};
    private static boolean getOutputMinFrameDurationlomOqCM = false;

    public enum ArrayType {
        GENERIC_PLUS,
        GENERIC_MINUS,
        COUNTRY_CODE_PLUS,
        COUNTRY_CODE_MINUS,
        GENERIC_RO,
        COUNTRY_CODE_RO,
        INFRASTRUCTURE_RO,
        LOCAL_RO
    }

    static {
        java.lang.String[] strArr = new java.lang.String[0];
        getHighSpeedVideoSizes = strArr;
        getInputSizeshNQ4ISI = strArr;
        getOutputSizeshNQ4ISI = strArr;
        getInputFormats = strArr;
        getHighSpeedVideoSizesFor = strArr;
    }

    public static com.datatheorem.android.trustkit.config.DomainValidator getHighResolutionOutputSizeshNQ4ISI() {
        com.datatheorem.android.trustkit.config.DomainValidator domainValidator;
        synchronized (com.datatheorem.android.trustkit.config.DomainValidator.class) {
            getOutputMinFrameDurationlomOqCM = true;
            domainValidator = getHighResolutionOutputSizeshNQ4ISI;
        }
        return domainValidator;
    }

    public static com.datatheorem.android.trustkit.config.DomainValidator getHighSpeedVideoSizes() {
        com.datatheorem.android.trustkit.config.DomainValidator domainValidator;
        synchronized (com.datatheorem.android.trustkit.config.DomainValidator.class) {
            getOutputMinFrameDurationlomOqCM = true;
            domainValidator = Camera2StreamConfigurationMap;
        }
        return domainValidator;
    }

    private DomainValidator(boolean z) {
        this.getOutputSizes = z;
    }

    public final boolean getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str);
        if (highSpeedVideoFpsRangesFor.length() > 253) {
            return false;
        }
        java.lang.String[] highSpeedVideoFpsRangesFor2 = this.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor);
        if (highSpeedVideoFpsRangesFor2 == null || highSpeedVideoFpsRangesFor2.length <= 0) {
            return this.getOutputSizes && this.getOutputStallDurationlomOqCM.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
        }
        return getInputSizeshNQ4ISI(highSpeedVideoFpsRangesFor2[0]);
    }

    private boolean getInputSizeshNQ4ISI(java.lang.String str) {
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str);
        return (this.getOutputSizes && getOutputFormats(highSpeedVideoFpsRangesFor)) || Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor) || getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor) || getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.String str) {
        java.lang.String lowerCase = getHighSpeedVideoFpsRangesFor(str).toLowerCase(java.util.Locale.ENGLISH);
        if (lowerCase.startsWith(".")) {
            lowerCase = lowerCase.substring(1);
        }
        return java.util.Arrays.binarySearch(getOutputFormats, lowerCase) >= 0;
    }

    private static boolean getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.String lowerCase = getHighSpeedVideoFpsRangesFor(str).toLowerCase(java.util.Locale.ENGLISH);
        if (lowerCase.startsWith(".")) {
            lowerCase = lowerCase.substring(1);
        }
        return (java.util.Arrays.binarySearch(getHighSpeedVideoFpsRangesFor, lowerCase) >= 0 || java.util.Arrays.binarySearch(getOutputSizeshNQ4ISI, lowerCase) >= 0) && java.util.Arrays.binarySearch(getHighSpeedVideoSizesFor, lowerCase) < 0;
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.String lowerCase = getHighSpeedVideoFpsRangesFor(str).toLowerCase(java.util.Locale.ENGLISH);
        if (lowerCase.startsWith(".")) {
            lowerCase = lowerCase.substring(1);
        }
        return (java.util.Arrays.binarySearch(getHighSpeedVideoFpsRanges, lowerCase) >= 0 || java.util.Arrays.binarySearch(getInputSizeshNQ4ISI, lowerCase) >= 0) && java.util.Arrays.binarySearch(getInputFormats, lowerCase) < 0;
    }

    private static boolean getOutputFormats(java.lang.String str) {
        java.lang.String lowerCase = getHighSpeedVideoFpsRangesFor(str).toLowerCase(java.util.Locale.ENGLISH);
        if (lowerCase.startsWith(".")) {
            lowerCase = lowerCase.substring(1);
        }
        return java.util.Arrays.binarySearch(getOutputMinFrameDuration, lowerCase) >= 0;
    }

    /* renamed from: com.datatheorem.android.trustkit.config.DomainValidator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[com.datatheorem.android.trustkit.config.DomainValidator.ArrayType.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.datatheorem.android.trustkit.config.DomainValidator.ArrayType.COUNTRY_CODE_MINUS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.datatheorem.android.trustkit.config.DomainValidator.ArrayType.COUNTRY_CODE_PLUS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.datatheorem.android.trustkit.config.DomainValidator.ArrayType.GENERIC_MINUS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.datatheorem.android.trustkit.config.DomainValidator.ArrayType.GENERIC_PLUS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.datatheorem.android.trustkit.config.DomainValidator.ArrayType.COUNTRY_CODE_RO.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.datatheorem.android.trustkit.config.DomainValidator.ArrayType.GENERIC_RO.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.datatheorem.android.trustkit.config.DomainValidator.ArrayType.INFRASTRUCTURE_RO.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.datatheorem.android.trustkit.config.DomainValidator.ArrayType.LOCAL_RO.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    static class IDNBUGHOLDER {
        private static final boolean getHighSpeedVideoFpsRangesFor = "a.".equals(java.net.IDN.toASCII("a."));

        private IDNBUGHOLDER() {
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        if (str == null) {
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                try {
                    java.lang.String ascii = java.net.IDN.toASCII(str);
                    if (!com.datatheorem.android.trustkit.config.DomainValidator.IDNBUGHOLDER.getHighSpeedVideoFpsRangesFor) {
                        int length = str.length();
                        if (length == 0) {
                            return str;
                        }
                        char charAt = str.charAt(length - 1);
                        if (charAt == '.' || charAt == 12290 || charAt == 65294 || charAt == 65377) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(ascii);
                            sb.append(".");
                            return sb.toString();
                        }
                    }
                    return ascii;
                } catch (java.lang.IllegalArgumentException unused) {
                    return str;
                }
            }
        }
        return str;
    }
}
