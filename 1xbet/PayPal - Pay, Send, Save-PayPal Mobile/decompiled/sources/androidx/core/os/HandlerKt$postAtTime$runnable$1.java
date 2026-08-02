package androidx.core.os;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class HandlerKt$postAtTime$runnable$1 implements java.lang.Runnable {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @Override // java.lang.Runnable
    public final void run() {
        this.getHighSpeedVideoSizes.invoke();
    }

    public HandlerKt$postAtTime$runnable$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoSizes = function0;
    }
}
