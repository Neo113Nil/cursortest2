package androidx.camera.viewfinder.compose.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\u000e\u001a\u00020\u000b22\u0010\u000e\u001a.\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0002\b\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015RD\u0010\u0016\u001a0\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0006¢\u0006\u0002\b\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/camera/viewfinder/compose/internal/BaseViewfinderExternalSurfaceState;", "Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceScope;", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Lkotlin/Function3;", "Landroidx/camera/viewfinder/compose/internal/ViewfinderSurfaceCoroutineScope;", "Landroidx/camera/viewfinder/compose/internal/ViewfinderSurfaceHolder;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onSurface", "(Lkotlin/jvm/functions/Function3;)V", "holder", "dispatchSurfaceCreated", "(Landroidx/camera/viewfinder/compose/internal/ViewfinderSurfaceHolder;)V", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function3;", "Lkotlinx/coroutines/Job;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseViewfinderExternalSurfaceState implements androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceScope {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighSpeedVideoFpsRanges;
    private kotlin.jvm.functions.Function3<? super androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceCoroutineScope, ? super androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.CoroutineScope scope;

    public BaseViewfinderExternalSurfaceState(kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    public final kotlinx.coroutines.CoroutineScope getScope() {
        return this.scope;
    }

    @Override // androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceScope
    public void onSurface(kotlin.jvm.functions.Function3<? super androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceCoroutineScope, ? super androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onSurface) {
        this.getHighSpeedVideoSizes = onSurface;
    }

    public final void dispatchSurfaceCreated(androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder holder) {
        kotlinx.coroutines.Job launch$default;
        if (this.getHighSpeedVideoSizes != null) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1(this, holder, null), 1, null);
            this.getHighSpeedVideoFpsRanges = launch$default;
        }
    }
}
