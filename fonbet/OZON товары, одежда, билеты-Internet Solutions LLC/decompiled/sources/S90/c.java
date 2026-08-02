package S90;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ozon.fintech.settings.models.FeatureValue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c MOB_AD_PARAMS;
    public static final c MOB_ANTIFRAUD_CELLS_INFO;
    public static final c MOB_APP_HEALTH;
    public static final c MOB_APP_SHOW_REQUIRED_VERSION;
    public static final c MOB_AUDIO_CONFIG;
    public static final c MOB_BANK_CARD_ENCRYPT;
    public static final c MOB_BIO_SEC_DELAY;
    public static final c MOB_CERT_ANTIFRAUD;
    public static final c MOB_DISCLOSURE_SCREEN;
    public static final c MOB_ESK;
    public static final c MOB_FAST_BIO_AUTH;
    public static final c MOB_GRAYLOG;
    public static final c MOB_INSTALLED_BANK;
    public static final c MOB_INTERFACE_SCALE;
    public static final c MOB_LAZY_PAYMENT_ADDITIONAL_WEBVIEW_CREATION;
    public static final c MOB_METRIX_START_TIME;
    public static final c MOB_METRIX_TRACKER;
    public static final c MOB_OFFLINE;
    public static final c MOB_OZON_PAYMENT_FULLSCREEN;
    public static final c MOB_PAGES_LOAD_TICK_LOGS;
    public static final c MOB_PDF_QUALITY;
    public static final c MOB_PHOTO_COMPRESS_PERCENT;
    public static final c MOB_PINPAD;
    public static final c MOB_QUERY_APPS;
    public static final c MOB_SCANNER_CONFIG;
    public static final c MOB_SHOW_REVIEW_APP;
    public static final c MOB_SSL_PINNING;
    public static final c MOB_SSO20;
    public static final c MOB_TABS_CONFIGURATION;
    public static final c MOB_ULTRA;
    public static final c MOB_WEBVIEW_TIMERS;
    public static final c MOB_WEBVIEW_WHITELIST;

    @NotNull
    private final FeatureValue defaultFeatureValue;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        c cVar = new c("MOB_WEBVIEW_WHITELIST", 0, new FeatureValue(true, null, C7714v.b0("esia.gosuslugi.ru", "ozon.ru", "finance.ozon.ru", "docs.ozon.ru", "esia-portal1.test.gosuslugi.ru"), null, null, null, 32, null));
        MOB_WEBVIEW_WHITELIST = cVar;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        c cVar2 = new c("MOB_PDF_QUALITY", 1, new FeatureValue(true, null, objArr2, "medium", objArr, null, 32, null));
        MOB_PDF_QUALITY = cVar2;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        c cVar3 = new c("MOB_WEBVIEW_TIMERS", 2, new FeatureValue(false, objArr4, null, objArr3, 0 == true ? 1 : 0, null, 32, null));
        MOB_WEBVIEW_TIMERS = cVar3;
        JSONObject jSONObject = null;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        c cVar4 = new c("MOB_GRAYLOG", 3, new FeatureValue(true, 0 == true ? 1 : 0, C7714v.b0("true", "10"), objArr5, objArr6, jSONObject, 32, null));
        MOB_GRAYLOG = cVar4;
        c cVar5 = new c("MOB_SSL_PINNING", 4, new FeatureValue(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, jSONObject, null, 32, null));
        MOB_SSL_PINNING = cVar5;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        c cVar6 = new c("MOB_PHOTO_COMPRESS_PERCENT", 5, new FeatureValue(false, objArr7, objArr8, "0.8", 0 == true ? 1 : 0, null, 32, null));
        MOB_PHOTO_COMPRESS_PERCENT = cVar6;
        Object[] objArr9 = 0 == true ? 1 : 0;
        c cVar7 = new c("MOB_TABS_CONFIGURATION", 6, new FeatureValue(false, objArr9, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32, null));
        MOB_TABS_CONFIGURATION = cVar7;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        c cVar8 = new c("MOB_APP_SHOW_REQUIRED_VERSION", 7, new FeatureValue(false, 0 == true ? 1 : 0, objArr10, objArr11, objArr12, null, 32, null));
        MOB_APP_SHOW_REQUIRED_VERSION = cVar8;
        c cVar9 = new c("MOB_DISCLOSURE_SCREEN", 8, new FeatureValue(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32, null));
        MOB_DISCLOSURE_SCREEN = cVar9;
        c cVar10 = new c("MOB_INSTALLED_BANK", 9, new FeatureValue(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32, null));
        MOB_INSTALLED_BANK = cVar10;
        c cVar11 = new c("MOB_ULTRA", 10, new FeatureValue(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32, null));
        MOB_ULTRA = cVar11;
        c cVar12 = new c("MOB_PAGES_LOAD_TICK_LOGS", 11, new FeatureValue(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32, null));
        MOB_PAGES_LOAD_TICK_LOGS = cVar12;
        c cVar13 = new c("MOB_OZON_PAYMENT_FULLSCREEN", 12, new FeatureValue(true, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32, null));
        MOB_OZON_PAYMENT_FULLSCREEN = cVar13;
        c cVar14 = new c("MOB_LAZY_PAYMENT_ADDITIONAL_WEBVIEW_CREATION", 13, new FeatureValue(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 32, null));
        MOB_LAZY_PAYMENT_ADDITIONAL_WEBVIEW_CREATION = cVar14;
        c cVar15 = new c("MOB_METRIX_TRACKER", 14, new FeatureValue(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 32, null));
        MOB_METRIX_TRACKER = cVar15;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        c cVar16 = new c("MOB_BIO_SEC_DELAY", 15, new FeatureValue(false, objArr13, objArr14, 0 == true ? 1 : 0, objArr15, null, 32, null));
        MOB_BIO_SEC_DELAY = cVar16;
        String str = null;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        c cVar17 = new c("MOB_ANTIFRAUD_CELLS_INFO", 16, new FeatureValue(false, objArr16, 0 == true ? 1 : 0, objArr17, 0 == true ? 1 : 0, str, 32, defaultConstructorMarker));
        MOB_ANTIFRAUD_CELLS_INFO = cVar17;
        c cVar18 = new c("MOB_SHOW_REVIEW_APP", 17, new FeatureValue(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, null, defaultConstructorMarker, 32, null));
        MOB_SHOW_REVIEW_APP = cVar18;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("qrScanners", new JSONArray((Collection) C7714v.a0("MLKIT")));
        jSONObject2.put("phoneScanners", new JSONArray((Collection) C7714v.a0("MLKIT")));
        K k11 = K.f71697a;
        jSONObject2.put("disabledSalute", new JSONArray((Collection) k11));
        jSONObject2.put("maxSize", 2000);
        jSONObject2.put("scannerQueueDebounce", 150L);
        jSONObject2.put("sharpnessThreshold", 15);
        Unit unit = Unit.f71690a;
        int i11 = 32;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        Object obj = null;
        c cVar19 = new c("MOB_SCANNER_CONFIG", 18, new FeatureValue(true, str2, list, str3, jSONObject2, obj, i11, defaultConstructorMarker2));
        MOB_SCANNER_CONFIG = cVar19;
        JSONObject jSONObject3 = null;
        boolean z11 = false;
        c cVar20 = new c("MOB_FAST_BIO_AUTH", 19, new FeatureValue(z11, str2, list, str3, jSONObject3, obj, i11, defaultConstructorMarker2));
        MOB_FAST_BIO_AUTH = cVar20;
        c cVar21 = new c("MOB_INTERFACE_SCALE", 20, new FeatureValue(z11, str2, list, str3, jSONObject3, obj, i11, defaultConstructorMarker2));
        MOB_INTERFACE_SCALE = cVar21;
        c cVar22 = new c("MOB_AUDIO_CONFIG", 21, new FeatureValue(true, null, null, null, null, null, 32, null));
        MOB_AUDIO_CONFIG = cVar22;
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("whitelist", new JSONArray((Collection) k11));
        int i12 = 32;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        boolean z12 = false;
        String str4 = null;
        JSONObject jSONObject5 = null;
        c cVar23 = new c("MOB_QUERY_APPS", 22, new FeatureValue(z12, str4, null, null, jSONObject4, jSONObject5, i12, defaultConstructorMarker3));
        MOB_QUERY_APPS = cVar23;
        c cVar24 = new c("MOB_CERT_ANTIFRAUD", 23, new FeatureValue(z12, str4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, jSONObject5, i12, defaultConstructorMarker3));
        MOB_CERT_ANTIFRAUD = cVar24;
        c cVar25 = new c("MOB_SSO20", 24, new FeatureValue(z12, str4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, jSONObject5, i12, defaultConstructorMarker3));
        MOB_SSO20 = cVar25;
        c cVar26 = new c("MOB_APP_HEALTH", 25, new FeatureValue(z12, str4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, jSONObject5, i12, defaultConstructorMarker3));
        MOB_APP_HEALTH = cVar26;
        c cVar27 = new c("MOB_AD_PARAMS", 26, new FeatureValue(z12, str4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, jSONObject5, i12, defaultConstructorMarker3));
        MOB_AD_PARAMS = cVar27;
        c cVar28 = new c("MOB_OFFLINE", 27, new FeatureValue(z12, str4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, jSONObject5, i12, defaultConstructorMarker3));
        MOB_OFFLINE = cVar28;
        c cVar29 = new c("MOB_BANK_CARD_ENCRYPT", 28, new FeatureValue(z12, str4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, jSONObject5, i12, defaultConstructorMarker3));
        MOB_BANK_CARD_ENCRYPT = cVar29;
        c cVar30 = new c("MOB_ESK", 29, new FeatureValue(z12, str4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, jSONObject5, i12, defaultConstructorMarker3));
        MOB_ESK = cVar30;
        c cVar31 = new c("MOB_PINPAD", 30, new FeatureValue(z12, str4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, jSONObject5, i12, defaultConstructorMarker3));
        MOB_PINPAD = cVar31;
        c cVar32 = new c("MOB_METRIX_START_TIME", 31, new FeatureValue(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, jSONObject5, null, 32, null));
        MOB_METRIX_START_TIME = cVar32;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30, cVar31, cVar32};
        $VALUES = cVarArr;
        $ENTRIES = Xc.b.a(cVarArr);
    }

    private c(String str, int i11, FeatureValue featureValue) {
        this.defaultFeatureValue = featureValue;
    }

    @NotNull
    public static Xc.a<c> b() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @NotNull
    public final FeatureValue a() {
        return this.defaultFeatureValue;
    }
}
