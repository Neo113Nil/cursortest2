package kotlin.jdk7;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class AutoCloseableKt$AutoCloseable$1 implements java.lang.AutoCloseable {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRangesFor.invoke();
    }

    public AutoCloseableKt$AutoCloseable$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoFpsRangesFor = function0;
    }
}
