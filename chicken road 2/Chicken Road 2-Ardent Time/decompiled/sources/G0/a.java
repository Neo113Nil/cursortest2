package G0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f555a;

    static {
        int[] iArr = new int[com.yandex.varioqub.config.FetchError.values().length];
        f555a = iArr;
        try {
            iArr[com.yandex.varioqub.config.FetchError.REQUEST_THROTTLED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f555a[com.yandex.varioqub.config.FetchError.EMPTY_RESULT.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            f555a[com.yandex.varioqub.config.FetchError.IDENTIFIERS_NULL.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f555a[com.yandex.varioqub.config.FetchError.RESPONSE_PARSE_ERROR.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f555a[com.yandex.varioqub.config.FetchError.NETWORK_ERROR.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f555a[com.yandex.varioqub.config.FetchError.INTERNAL_ERROR.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
    }
}
