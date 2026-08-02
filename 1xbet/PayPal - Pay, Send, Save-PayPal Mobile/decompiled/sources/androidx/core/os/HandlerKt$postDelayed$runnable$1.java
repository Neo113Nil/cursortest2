package androidx.core.os;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class HandlerKt$postDelayed$runnable$1 implements java.lang.Runnable {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    @Override // java.lang.Runnable
    public final void run() {
        this.Camera2StreamConfigurationMap.invoke();
    }

    public HandlerKt$postDelayed$runnable$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.Camera2StreamConfigurationMap = function0;
    }
}
