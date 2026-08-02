package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "request", "", "startInputMethod", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 implements androidx.compose.ui.platform.PlatformTextInputSessionScope {
    private final /* synthetic */ androidx.compose.ui.platform.PlatformTextInputSessionScope Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.platform.PlatformTextInputSessionScope getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<kotlin.Unit>> getHighSpeedVideoSizes;

    ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1(androidx.compose.ui.platform.PlatformTextInputSessionScope platformTextInputSessionScope, java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<kotlin.Unit>> atomicReference, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.getHighResolutionOutputSizeshNQ4ISI = platformTextInputSessionScope;
        this.getHighSpeedVideoSizes = atomicReference;
        this.getHighSpeedVideoFpsRanges = chainedPlatformTextInputInterceptor;
        this.Camera2StreamConfigurationMap = platformTextInputSessionScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest platformTextInputMethodRequest, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1;
        int i;
        if (continuation instanceof androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) {
            chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) continuation;
            if ((chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex.Session<kotlin.Unit>> atomicReference = this.getHighSpeedVideoSizes;
                    androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 = new kotlin.jvm.functions.Function1<kotlinx.coroutines.CoroutineScope, kotlin.Unit>() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                        public final void getHighSpeedVideoSizes(kotlinx.coroutines.CoroutineScope coroutineScope) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(kotlinx.coroutines.CoroutineScope coroutineScope) {
                            getHighSpeedVideoSizes(coroutineScope);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.getHighSpeedVideoFpsRanges, platformTextInputMethodRequest, this.getHighResolutionOutputSizeshNQ4ISI, null);
                    chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (androidx.compose.ui.SessionMutex.m5523withSessionCancellingPreviousimpl(atomicReference, chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2, chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3, chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(this, continuation);
        java.lang.Object obj2 = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public final android.view.View getView() {
        return this.Camera2StreamConfigurationMap.getView();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext */
    public final kotlin.coroutines.CoroutineContext getGetHighSpeedVideoFpsRangesFor() {
        return this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor();
    }
}
