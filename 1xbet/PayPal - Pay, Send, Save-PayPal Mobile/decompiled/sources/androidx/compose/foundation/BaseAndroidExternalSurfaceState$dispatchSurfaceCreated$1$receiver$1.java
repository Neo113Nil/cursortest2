package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003JC\u0010\n\u001a\u00020\b*\u00020\u00042-\u0010\n\u001a)\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\r\u001a\u00020\b*\u00020\u00042\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0002\b\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1;", "Landroidx/compose/foundation/SurfaceCoroutineScope;", "Landroidx/compose/foundation/SurfaceScope;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/Surface;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "", "Lkotlin/ExtensionFunctionType;", "onChanged", "(Landroid/view/Surface;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/Function1;", "onDestroyed", "(Landroid/view/Surface;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 implements androidx.compose.foundation.SurfaceCoroutineScope, androidx.compose.foundation.SurfaceScope, kotlinx.coroutines.CoroutineScope {
    private final /* synthetic */ kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
    private final /* synthetic */ androidx.compose.foundation.BaseAndroidExternalSurfaceState getHighSpeedVideoSizes;

    BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(androidx.compose.foundation.BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.getHighSpeedVideoSizes = baseAndroidExternalSurfaceState;
        this.Camera2StreamConfigurationMap = coroutineScope;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public final void onDestroyed(android.view.Surface surface, kotlin.jvm.functions.Function1<? super android.view.Surface, kotlin.Unit> function1) {
        this.getHighSpeedVideoSizes.onDestroyed(surface, function1);
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public final void onChanged(android.view.Surface surface, kotlin.jvm.functions.Function3<? super android.view.Surface, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.getHighSpeedVideoSizes.onChanged(surface, function3);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext */
    public final kotlin.coroutines.CoroutineContext getLocalContext() {
        return this.Camera2StreamConfigurationMap.getLocalContext();
    }
}
