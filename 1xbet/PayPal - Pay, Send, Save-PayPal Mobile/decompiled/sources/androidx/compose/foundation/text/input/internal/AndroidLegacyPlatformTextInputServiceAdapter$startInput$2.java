package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSession;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.platform.PlatformTextInputSession, kotlin.coroutines.Continuation<?>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<?>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest, kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.ui.platform.PlatformTextInputSession getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter getHighSpeedVideoSizes;
        private /* synthetic */ java.lang.Object getInputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
                    androidx.compose.foundation.text.input.internal.InputMethodManager invoke = androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt.getInputMethodManagerFactory().invoke(this.getHighResolutionOutputSizeshNQ4ISI.getView());
                    androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest legacyTextInputMethodRequest = new androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest(this.getHighResolutionOutputSizeshNQ4ISI.getView(), new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(this.getHighSpeedVideoFpsRangesFor), invoke);
                    if (androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00231(this.getHighSpeedVideoSizes, invoke, null), 3, null);
                    }
                    kotlin.jvm.functions.Function1<androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
                    if (function1 != null) {
                        function1.invoke(legacyTextInputMethodRequest);
                    }
                    this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI = legacyTextInputMethodRequest;
                    this.getHighSpeedVideoFpsRanges = 1;
                    if (this.getHighResolutionOutputSizeshNQ4ISI.startInputMethod(legacyTextInputMethodRequest, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI = null;
                throw th;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {140, 141}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00231 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ androidx.compose.foundation.text.input.internal.InputMethodManager Camera2StreamConfigurationMap;
            int getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter getHighSpeedVideoSizes;

            /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
            
                if (r5.collect(new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00231.AnonymousClass2(), r4) == r0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
            
                if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$$ExternalSyntheticLambda0(), r4) != r0) goto L12;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlinx.coroutines.flow.MutableSharedFlow highResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI();
                if (highResolutionOutputSizeshNQ4ISI == null) {
                    return kotlin.Unit.INSTANCE;
                }
                final androidx.compose.foundation.text.input.internal.InputMethodManager inputMethodManager = this.Camera2StreamConfigurationMap;
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00231) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00231(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00231(androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, androidx.compose.foundation.text.input.internal.InputMethodManager inputMethodManager, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00231> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoSizes = androidLegacyPlatformTextInputServiceAdapter;
                this.Camera2StreamConfigurationMap = inputMethodManager;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<?> continuation) {
            return ((androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getInputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(androidx.compose.ui.platform.PlatformTextInputSession platformTextInputSession, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest, kotlin.Unit> function1, androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = platformTextInputSession;
            this.Camera2StreamConfigurationMap = function1;
            this.getHighSpeedVideoSizes = androidLegacyPlatformTextInputServiceAdapter;
            this.getHighSpeedVideoFpsRangesFor = legacyPlatformTextInputNode;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1((androidx.compose.ui.platform.PlatformTextInputSession) this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.platform.PlatformTextInputSession platformTextInputSession, kotlin.coroutines.Continuation<?> continuation) {
        return ((androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) create(platformTextInputSession, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest, kotlin.Unit> function1, androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoFpsRanges = androidLegacyPlatformTextInputServiceAdapter;
        this.getHighSpeedVideoSizes = legacyPlatformTextInputNode;
    }
}
