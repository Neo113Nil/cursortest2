package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ArrayPoolsKt {
    private static final int getHighSpeedVideoFpsRangesFor;

    static {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String property = java.lang.System.getProperty("kotlinx.serialization.json.pool.size");
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(property != null ? kotlin.text.StringsKt.toIntOrNull(property) : null);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Integer num = (java.lang.Integer) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
        getHighSpeedVideoFpsRangesFor = num != null ? num.intValue() : 2097152;
    }
}
