package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cB!\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001b\u0010!J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0005\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/miteksystems/misnap/controller/a/e;", "Lcom/miteksystems/misnap/controller/a/a0;", "Lcom/miteksystems/misnap/core/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "Lcom/miteksystems/misnap/controller/a/b0;", "a", "(Lcom/miteksystems/misnap/core/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "settings", "Lcom/miteksystems/misnap/controller/a/h;", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/controller/a/h;", "documentController", "Lcom/miteksystems/misnap/controller/a/a;", "c", "Lcom/miteksystems/misnap/controller/a/a;", "barcodeController", "Lcom/miteksystems/misnap/barcode/MiSnapBarcodeDetector;", "d", "Lcom/miteksystems/misnap/barcode/MiSnapBarcodeDetector;", "barcodeDetector", "Lcom/miteksystems/misnap/controller/a/b;", "e", "Lcom/miteksystems/misnap/controller/a/b;", "barcodeControllerResult", "<init>", "(Lcom/miteksystems/misnap/core/MiSnapSettings;Lcom/miteksystems/misnap/controller/a/h;Lcom/miteksystems/misnap/controller/a/a;Lcom/miteksystems/misnap/barcode/MiSnapBarcodeDetector;)V", "Landroid/content/Context;", "activityContext", "", com.miteksystems.misnap.core.MiSnapSettings.KEY_LICENSE, "(Landroid/content/Context;Lcom/miteksystems/misnap/core/MiSnapSettings;Ljava/lang/String;)V", "controller_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class e implements com.miteksystems.misnap.controller.a.a0 {
    private final com.miteksystems.misnap.barcode.MiSnapBarcodeDetector Camera2StreamConfigurationMap;
    private final com.miteksystems.misnap.core.MiSnapSettings getHighResolutionOutputSizeshNQ4ISI;
    private final com.miteksystems.misnap.controller.a.h getHighSpeedVideoFpsRanges;
    private final com.miteksystems.misnap.controller.a.a getHighSpeedVideoFpsRangesFor;
    private com.miteksystems.misnap.controller.a.b getHighSpeedVideoSizes;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, java.lang.String str) {
        this(miSnapSettings, new com.miteksystems.misnap.controller.a.h(context, miSnapSettings.analysis.document, str, false, null, 24, null), new com.miteksystems.misnap.controller.a.a(context, miSnapSettings.analysis.barcode, str), new com.miteksystems.misnap.barcode.MiSnapBarcodeDetector(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public e(com.miteksystems.misnap.core.MiSnapSettings miSnapSettings, com.miteksystems.misnap.controller.a.h hVar, com.miteksystems.misnap.controller.a.a aVar, com.miteksystems.misnap.barcode.MiSnapBarcodeDetector miSnapBarcodeDetector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapBarcodeDetector, "");
        this.getHighResolutionOutputSizeshNQ4ISI = miSnapSettings;
        this.getHighSpeedVideoFpsRanges = hVar;
        this.getHighSpeedVideoFpsRangesFor = aVar;
        this.Camera2StreamConfigurationMap = miSnapBarcodeDetector;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.miteksystems.misnap.controller.a.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ java.lang.Object a(com.miteksystems.misnap.core.Frame frame, kotlin.coroutines.Continuation continuation) {
        com.miteksystems.misnap.controller.a.e.a aVar;
        java.lang.Object coroutine_suspended;
        int i;
        com.miteksystems.misnap.controller.a.e eVar;
        com.miteksystems.misnap.controller.a.e.b bVar;
        com.miteksystems.misnap.controller.a.j jVar;
        com.miteksystems.misnap.controller.a.e eVar2;
        com.miteksystems.misnap.core.UserAction userAction;
        com.miteksystems.misnap.controller.a.b bVar2;
        if (continuation instanceof com.miteksystems.misnap.controller.a.e.a) {
            aVar = (com.miteksystems.misnap.controller.a.e.a) continuation;
            int i2 = aVar.getHighSpeedVideoFpsRanges;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.getHighSpeedVideoFpsRanges = i2 - 2147483648;
                java.lang.Object obj = aVar.getHighSpeedVideoFpsRangesFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.miteksystems.misnap.controller.a.e.c cVar = new com.miteksystems.misnap.controller.a.e.c(frame, null);
                    aVar.Camera2StreamConfigurationMap = this;
                    aVar.getHighSpeedVideoSizes = frame;
                    aVar.getHighSpeedVideoFpsRanges = 1;
                    obj = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(cVar, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jVar = (com.miteksystems.misnap.controller.a.j) aVar.getHighSpeedVideoSizes;
                        eVar2 = (com.miteksystems.misnap.controller.a.e) aVar.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (kotlin.jvm.internal.Intrinsics.areEqual(jVar.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE) && com.miteksystems.misnap.document.DocumentAnalysisSettings.getBarcodeExtractionRequirement(eVar2.getHighResolutionOutputSizeshNQ4ISI.analysis.document) == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.ExtractionRequirement.REQUIRED) {
                            bVar2 = eVar2.getHighSpeedVideoSizes;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(bVar2 != null ? bVar2.getUserAction() : null, com.miteksystems.misnap.core.UserAction.NONE.INSTANCE)) {
                                userAction = com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.INSTANCE;
                                return new com.miteksystems.misnap.controller.a.f(userAction, eVar2.getHighSpeedVideoSizes, jVar);
                            }
                        }
                        userAction = jVar.getUserAction();
                        return new com.miteksystems.misnap.controller.a.f(userAction, eVar2.getHighSpeedVideoSizes, jVar);
                    }
                    frame = (com.miteksystems.misnap.core.Frame) aVar.getHighSpeedVideoSizes;
                    eVar = (com.miteksystems.misnap.controller.a.e) aVar.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.miteksystems.misnap.controller.a.j jVar2 = (com.miteksystems.misnap.controller.a.j) obj;
                bVar = eVar.new b(frame, null);
                aVar.Camera2StreamConfigurationMap = eVar;
                aVar.getHighSpeedVideoSizes = jVar2;
                aVar.getHighSpeedVideoFpsRanges = 2;
                if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(bVar, aVar) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                jVar = jVar2;
                eVar2 = eVar;
                if (kotlin.jvm.internal.Intrinsics.areEqual(jVar.getUserAction(), com.miteksystems.misnap.core.UserAction.NONE.INSTANCE)) {
                    bVar2 = eVar2.getHighSpeedVideoSizes;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(bVar2 != null ? bVar2.getUserAction() : null, com.miteksystems.misnap.core.UserAction.NONE.INSTANCE)) {
                    }
                }
                userAction = jVar.getUserAction();
                return new com.miteksystems.misnap.controller.a.f(userAction, eVar2.getHighSpeedVideoSizes, jVar);
            }
        }
        aVar = new com.miteksystems.misnap.controller.a.e.a(continuation);
        java.lang.Object obj2 = aVar.getHighSpeedVideoFpsRangesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.miteksystems.misnap.controller.a.j jVar22 = (com.miteksystems.misnap.controller.a.j) obj2;
        bVar = eVar.new b(frame, null);
        aVar.Camera2StreamConfigurationMap = eVar;
        aVar.getHighSpeedVideoSizes = jVar22;
        aVar.getHighSpeedVideoFpsRanges = 2;
        if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(bVar, aVar) != coroutine_suspended) {
        }
    }

    @Override // com.miteksystems.misnap.controller.a.a0
    public final /* synthetic */ void a() {
        this.getHighSpeedVideoFpsRanges.a();
        this.getHighSpeedVideoFpsRangesFor.a();
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.miteksystems.misnap.controller.internal.DocumentBarcodeController$analyze$2", f = "DocumentBarcodeController.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.miteksystems.misnap.core.Frame Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.miteksystems.misnap.controller.a.e.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (r5.isDetected() != false) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.miteksystems.misnap.controller.a.e eVar;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.miteksystems.misnap.controller.a.b bVar = com.miteksystems.misnap.controller.a.e.this.getHighSpeedVideoSizes;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(bVar != null ? bVar.getUserAction() : null, com.miteksystems.misnap.core.UserAction.NONE.INSTANCE)) {
                    if (com.miteksystems.misnap.barcode.BarcodeAnalysisSettings.getType(com.miteksystems.misnap.controller.a.e.this.getHighResolutionOutputSizeshNQ4ISI.analysis.barcode) == 64) {
                        com.miteksystems.misnap.barcode.MiSnapBarcodeDetector.Result.Processed detect = com.miteksystems.misnap.controller.a.e.this.Camera2StreamConfigurationMap.detect(this.Camera2StreamConfigurationMap);
                        if (!(detect instanceof com.miteksystems.misnap.barcode.MiSnapBarcodeDetector.Result.Processed)) {
                            if (detect instanceof com.miteksystems.misnap.barcode.MiSnapBarcodeDetector.Result.Failure) {
                                throw new com.miteksystems.misnap.controller.a.c(new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.BarcodeDetection((com.miteksystems.misnap.barcode.MiSnapBarcodeDetector.Result.Failure) detect));
                            }
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    com.miteksystems.misnap.controller.a.e eVar2 = com.miteksystems.misnap.controller.a.e.this;
                    com.miteksystems.misnap.controller.a.a aVar = eVar2.getHighSpeedVideoFpsRangesFor;
                    com.miteksystems.misnap.core.Frame frame = this.Camera2StreamConfigurationMap;
                    this.getHighSpeedVideoSizes = eVar2;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    java.lang.Object a2 = aVar.a(frame, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eVar = eVar2;
                    obj = a2;
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (com.miteksystems.misnap.controller.a.e) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            eVar.getHighSpeedVideoSizes = (com.miteksystems.misnap.controller.a.b) obj;
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.miteksystems.misnap.controller.a.e.this.new b(this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.miteksystems.misnap.core.Frame frame, kotlin.coroutines.Continuation<? super com.miteksystems.misnap.controller.a.e.b> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = frame;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/miteksystems/misnap/controller/a/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.miteksystems.misnap.controller.internal.DocumentBarcodeController$analyze$documentControllerResult$1", f = "DocumentBarcodeController.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.miteksystems.misnap.controller.a.j>, java.lang.Object> {
        final /* synthetic */ com.miteksystems.misnap.core.Frame getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.miteksystems.misnap.controller.a.j> continuation) {
            return ((com.miteksystems.misnap.controller.a.e.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.miteksystems.misnap.controller.a.h hVar = com.miteksystems.misnap.controller.a.e.this.getHighSpeedVideoFpsRanges;
                com.miteksystems.misnap.core.Frame frame = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = 1;
                obj = hVar.a(frame, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return (com.miteksystems.misnap.controller.a.j) obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.miteksystems.misnap.controller.a.e.this.new c(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.miteksystems.misnap.core.Frame frame, kotlin.coroutines.Continuation<? super com.miteksystems.misnap.controller.a.e.c> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = frame;
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.miteksystems.misnap.controller.internal.DocumentBarcodeController", f = "DocumentBarcodeController.kt", i = {0, 0, 1, 1}, l = {38, 42}, m = "analyze", n = {"this", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "this", "documentControllerResult"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.getHighSpeedVideoFpsRangesFor = obj;
            this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
            return com.miteksystems.misnap.controller.a.e.this.a((com.miteksystems.misnap.core.Frame) null, this);
        }

        a(kotlin.coroutines.Continuation<? super com.miteksystems.misnap.controller.a.e.a> continuation) {
            super(continuation);
        }
    }
}
