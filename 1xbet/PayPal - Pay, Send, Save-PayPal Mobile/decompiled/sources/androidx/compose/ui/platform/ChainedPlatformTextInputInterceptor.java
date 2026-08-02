package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00072'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0002\b\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R+\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u000f\u0010\u0015"}, d2 = {"Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;", "", "Landroidx/compose/ui/platform/PlatformTextInputInterceptor;", "p0", "p1", "<init>", "(Landroidx/compose/ui/platform/PlatformTextInputInterceptor;Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;)V", "Landroidx/compose/ui/node/Owner;", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/node/Owner;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/ui/platform/PlatformTextInputInterceptor;", "(Landroidx/compose/ui/platform/PlatformTextInputInterceptor;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChainedPlatformTextInputInterceptor {
    private final androidx.compose.runtime.MutableState getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor getHighSpeedVideoFpsRangesFor;

    public ChainedPlatformTextInputInterceptor(androidx.compose.ui.platform.PlatformTextInputInterceptor platformTextInputInterceptor, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.getHighSpeedVideoFpsRangesFor = chainedPlatformTextInputInterceptor;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(platformTextInputInterceptor, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.platform.PlatformTextInputInterceptor getHighSpeedVideoFpsRangesFor() {
        return (androidx.compose.ui.platform.PlatformTextInputInterceptor) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    final void getHighSpeedVideoSizes(androidx.compose.ui.platform.PlatformTextInputInterceptor platformTextInputInterceptor) {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(platformTextInputInterceptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(androidx.compose.ui.node.Owner owner, kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 chainedPlatformTextInputInterceptor$textInputSession$1;
        int i;
        java.lang.Object Camera2StreamConfigurationMap;
        if (continuation instanceof androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1) {
            chainedPlatformTextInputInterceptor$textInputSession$1 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1) continuation;
            if ((chainedPlatformTextInputInterceptor$textInputSession$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                chainedPlatformTextInputInterceptor$textInputSession$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = chainedPlatformTextInputInterceptor$textInputSession$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chainedPlatformTextInputInterceptor$textInputSession$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = this.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2(function2, this, null);
                    chainedPlatformTextInputInterceptor$textInputSession$1.Camera2StreamConfigurationMap = 1;
                    Camera2StreamConfigurationMap = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.Camera2StreamConfigurationMap(owner, chainedPlatformTextInputInterceptor, chainedPlatformTextInputInterceptor$textInputSession$2, chainedPlatformTextInputInterceptor$textInputSession$1);
                    if (Camera2StreamConfigurationMap == coroutine_suspended) {
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
        chainedPlatformTextInputInterceptor$textInputSession$1 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1(this, continuation);
        java.lang.Object obj2 = chainedPlatformTextInputInterceptor$textInputSession$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chainedPlatformTextInputInterceptor$textInputSession$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }
}
