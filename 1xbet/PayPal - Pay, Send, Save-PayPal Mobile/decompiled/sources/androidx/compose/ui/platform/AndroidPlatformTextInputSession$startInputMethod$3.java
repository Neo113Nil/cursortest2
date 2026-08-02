package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "methodSession", "Landroidx/compose/ui/platform/InputMethodSession;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m = "invokeSuspend", n = {"methodSession"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class AndroidPlatformTextInputSession$startInputMethod$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.platform.InputMethodSession, kotlin.coroutines.Continuation<?>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.platform.AndroidPlatformTextInputSession getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.text.input.TextInputService textInputService;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.ui.platform.InputMethodSession inputMethodSession = (androidx.compose.ui.platform.InputMethodSession) this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.ui.platform.AndroidPlatformTextInputSession androidPlatformTextInputSession = this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = inputMethodSession;
            this.getHighSpeedVideoSizes = androidPlatformTextInputSession;
            this.getHighSpeedVideoFpsRangesFor = 1;
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = this;
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(androidPlatformTextInputSession$startInputMethod$3), 1);
            cancellableContinuationImpl.initCancellability();
            textInputService = androidPlatformTextInputSession.getHighSpeedVideoFpsRanges;
            textInputService.startInput();
            cancellableContinuationImpl.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    getHighSpeedVideoFpsRanges(th);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
                    androidx.compose.ui.text.input.TextInputService textInputService2;
                    androidx.compose.ui.platform.InputMethodSession inputMethodSession2 = androidx.compose.ui.platform.InputMethodSession.this;
                    synchronized (inputMethodSession2.getHighSpeedVideoSizes) {
                        inputMethodSession2.getHighResolutionOutputSizeshNQ4ISI = true;
                        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.WeakReference<androidx.compose.ui.text.input.NullableInputConnectionWrapper>> mutableVector = inputMethodSession2.Camera2StreamConfigurationMap;
                        androidx.compose.ui.node.WeakReference<androidx.compose.ui.text.input.NullableInputConnectionWrapper>[] weakReferenceArr = mutableVector.content;
                        int size = mutableVector.getSize();
                        for (int i2 = 0; i2 < size; i2++) {
                            androidx.compose.ui.text.input.NullableInputConnectionWrapper nullableInputConnectionWrapper = weakReferenceArr[i2].get();
                            if (nullableInputConnectionWrapper != null) {
                                nullableInputConnectionWrapper.disposeDelegate();
                            }
                        }
                        inputMethodSession2.Camera2StreamConfigurationMap.clear();
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    textInputService2 = androidPlatformTextInputSession.getHighSpeedVideoFpsRanges;
                    textInputService2.stopInput();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(androidPlatformTextInputSession$startInputMethod$3);
            }
            if (result == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.platform.InputMethodSession inputMethodSession, kotlin.coroutines.Continuation<?> continuation) {
        return ((androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3) create(inputMethodSession, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3(this.getHighSpeedVideoFpsRanges, continuation);
        androidPlatformTextInputSession$startInputMethod$3.getHighResolutionOutputSizeshNQ4ISI = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidPlatformTextInputSession$startInputMethod$3(androidx.compose.ui.platform.AndroidPlatformTextInputSession androidPlatformTextInputSession, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = androidPlatformTextInputSession;
    }
}
