package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"", "ANDROID_DETECTED", "Z", "getANDROID_DETECTED", "()Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED;

    static {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Class.forName("android.os.Build"));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        ANDROID_DETECTED = kotlin.Result.m23442isSuccessimpl(m23436constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }
}
