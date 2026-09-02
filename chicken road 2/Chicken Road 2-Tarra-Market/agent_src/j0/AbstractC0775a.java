package j0;

import com.yandex.varioqub.config.FetchError;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0775a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6049a;

    static {
        int[] iArr = new int[FetchError.values().length];
        f6049a = iArr;
        try {
            iArr[FetchError.REQUEST_THROTTLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6049a[FetchError.EMPTY_RESULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6049a[FetchError.IDENTIFIERS_NULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6049a[FetchError.RESPONSE_PARSE_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6049a[FetchError.NETWORK_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6049a[FetchError.INTERNAL_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
