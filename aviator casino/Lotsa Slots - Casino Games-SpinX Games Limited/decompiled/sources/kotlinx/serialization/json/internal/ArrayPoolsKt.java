package kotlinx.serialization.json.internal;

/* compiled from: ArrayPools.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"MAX_CHARS_IN_POOL", "", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ArrayPoolsKt {
    private static final int MAX_CHARS_IN_POOL;

    static {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String property = java.lang.System.getProperty("kotlinx.serialization.json.pool.size");
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(property != null ? kotlin.text.StringsKt.toIntOrNull(property) : null);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Integer num = (java.lang.Integer) (kotlin.Result.m10804isFailureimpl(m10798constructorimpl) ? null : m10798constructorimpl);
        MAX_CHARS_IN_POOL = num != null ? num.intValue() : 2097152;
    }
}
