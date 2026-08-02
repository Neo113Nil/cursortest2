package com.miteksystems.misnap.controller;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$3", f = "MiSnapController.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class MiSnapController$analyzeFrame$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.miteksystems.misnap.controller.MiSnapController Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.miteksystems.misnap.core.Frame getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$3$1", f = "MiSnapController.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.miteksystems.misnap.controller.MiSnapController Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$3.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            long j;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                j = this.Camera2StreamConfigurationMap.getInputFormats;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.Camera2StreamConfigurationMap.getOutputSizes = true;
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$3.AnonymousClass1(this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.miteksystems.misnap.controller.MiSnapController miSnapController, kotlin.coroutines.Continuation<? super com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$3.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = miSnapController;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.miteksystems.misnap.core.MibiData.Session session;
        androidx.view.MutableLiveData mutableLiveData;
        androidx.view.MutableLiveData mutableLiveData2;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        com.miteksystems.misnap.core.MibiData.Session session2;
        long j2;
        com.miteksystems.misnap.controller.a.p pVar;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z4 = false;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                z = this.Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM;
                if (z && this.Camera2StreamConfigurationMap.shouldTrackFinalFrameDispatched$controller_release()) {
                    return kotlin.Unit.INSTANCE;
                }
                com.miteksystems.misnap.controller.a.a0 getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap.getGetHighSpeedVideoSizes();
                com.miteksystems.misnap.core.Frame frame = this.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = getHighSpeedVideoSizes.a(frame, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.miteksystems.misnap.controller.a.b0 b0Var = (com.miteksystems.misnap.controller.a.b0) obj;
            if (com.miteksystems.misnap.controller.AnalysisSettings.shouldEnableAiBasedRts(this.Camera2StreamConfigurationMap.getGetOutputFormats().analysis, this.Camera2StreamConfigurationMap.getGetOutputFormats().getUseCase())) {
                pVar = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                pVar.a(this.getHighSpeedVideoSizes);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(b0Var.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE) && !this.getHighSpeedVideoFpsRanges) {
                z4 = true;
            }
            j = this.Camera2StreamConfigurationMap.getInputFormats;
            if (j > 0) {
                z2 = this.Camera2StreamConfigurationMap.getOutputSizes;
                if (!z2 && z4 && this.Camera2StreamConfigurationMap.isImageQualityPriority$controller_release()) {
                    z3 = this.Camera2StreamConfigurationMap.getOutputSizeshNQ4ISI;
                    if (!z3) {
                        this.Camera2StreamConfigurationMap.getOutputSizeshNQ4ISI = true;
                        session2 = this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM;
                        j2 = this.Camera2StreamConfigurationMap.getInputFormats;
                        session2.addUxpEvent("MCSPT", java.lang.String.valueOf(j2));
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.MainScope(), null, null, new com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$3.AnonymousClass1(this.Camera2StreamConfigurationMap, null), 3, null);
                    }
                    com.miteksystems.misnap.controller.a.a0 getHighSpeedVideoSizes2 = this.Camera2StreamConfigurationMap.getGetHighSpeedVideoSizes();
                    com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL hold_still = ((getHighSpeedVideoSizes2 instanceof com.miteksystems.misnap.controller.a.h) || (getHighSpeedVideoSizes2 instanceof com.miteksystems.misnap.controller.a.l) || (getHighSpeedVideoSizes2 instanceof com.miteksystems.misnap.controller.a.e) || (getHighSpeedVideoSizes2 instanceof com.miteksystems.misnap.controller.a.g)) ? com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.INSTANCE : null;
                    if (hold_still != null) {
                        com.miteksystems.misnap.controller.MiSnapController miSnapController = this.Camera2StreamConfigurationMap;
                        com.miteksystems.misnap.controller.MiSnapController.access$logUserActionInUxp(miSnapController, hold_still);
                        com.miteksystems.misnap.core.LiveDataUtil.INSTANCE.updateValue(miSnapController.getOutputStallDuration, new com.miteksystems.misnap.controller.MiSnapController.FeedbackResult(hold_still, null, null, null, null, 30, null));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            com.miteksystems.misnap.controller.MiSnapController.access$logUserActionInUxp(this.Camera2StreamConfigurationMap, b0Var.getUserAction());
            com.miteksystems.misnap.controller.MiSnapController.access$handleControllerResult(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, b0Var, this.getHighSpeedVideoFpsRanges);
            return kotlin.Unit.INSTANCE;
        } catch (com.miteksystems.misnap.controller.a.c e) {
            com.miteksystems.misnap.core.LiveDataUtil liveDataUtil = com.miteksystems.misnap.core.LiveDataUtil.INSTANCE;
            mutableLiveData2 = this.Camera2StreamConfigurationMap.ArtificialStackFrames;
            liveDataUtil.updateValue(mutableLiveData2, e.getCom.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String());
            return kotlin.Unit.INSTANCE;
        } catch (com.miteksystems.misnap.controller.a.q e2) {
            session = this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM;
            session.addUxpEvent(com.miteksystems.misnap.controller.MiSnapController.access$getIadProcessingErrorUxp(this.Camera2StreamConfigurationMap, e2), new java.lang.String[0]);
            com.miteksystems.misnap.core.LiveDataUtil liveDataUtil2 = com.miteksystems.misnap.core.LiveDataUtil.INSTANCE;
            mutableLiveData = this.Camera2StreamConfigurationMap.ArtificialStackFrames;
            liveDataUtil2.updateValue(mutableLiveData, com.miteksystems.misnap.controller.MiSnapController.ErrorResult.AiBasedRtsProcessingError.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$3(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiSnapController$analyzeFrame$3(com.miteksystems.misnap.controller.MiSnapController miSnapController, com.miteksystems.misnap.core.Frame frame, boolean z, kotlin.coroutines.Continuation<? super com.miteksystems.misnap.controller.MiSnapController$analyzeFrame$3> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = miSnapController;
        this.getHighSpeedVideoSizes = frame;
        this.getHighSpeedVideoFpsRanges = z;
    }
}
