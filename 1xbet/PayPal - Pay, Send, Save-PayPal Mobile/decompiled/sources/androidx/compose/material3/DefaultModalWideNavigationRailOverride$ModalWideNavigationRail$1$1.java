package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1", f = "WideNavigationRail.kt", i = {0}, l = {561}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.ModalWideNavigationRailState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<java.lang.Boolean> getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003a -> B:5:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ChannelIterator<java.lang.Boolean> it;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
            it = this.getHighSpeedVideoSizes.iterator();
            coroutineScope = coroutineScope2;
            this.Camera2StreamConfigurationMap = coroutineScope;
            this.getHighResolutionOutputSizeshNQ4ISI = it;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = it.hasNext(this);
            if (obj == coroutine_suspended) {
            }
            kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighResolutionOutputSizeshNQ4ISI;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope32 = coroutineScope;
            if (((java.lang.Boolean) obj).booleanValue()) {
                boolean booleanValue = it.next().booleanValue();
                java.lang.Boolean bool = (java.lang.Boolean) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(this.getHighSpeedVideoSizes.mo24073tryReceivePtdJZtk());
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                }
                coroutineScope = coroutineScope32;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1.AnonymousClass1(booleanValue, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
                this.Camera2StreamConfigurationMap = coroutineScope;
                this.getHighResolutionOutputSizeshNQ4ISI = it;
                this.getHighSpeedVideoFpsRanges = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kotlinx.coroutines.CoroutineScope coroutineScope322 = coroutineScope;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1$1", f = "WideNavigationRail.kt", i = {}, l = {565, 567}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.material3.ModalWideNavigationRailState getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (r4.getHighSpeedVideoFpsRanges.expand(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            if (r4.getHighSpeedVideoFpsRanges.collapse(r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighSpeedVideoFpsRangesFor = 1;
                } else {
                    this.getHighSpeedVideoFpsRangesFor = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, androidx.compose.material3.ModalWideNavigationRailState modalWideNavigationRailState, kotlin.coroutines.Continuation<? super androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getHighSpeedVideoFpsRanges = modalWideNavigationRailState;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1 defaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1 = new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        defaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1.Camera2StreamConfigurationMap = obj;
        return defaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1(kotlinx.coroutines.channels.Channel<java.lang.Boolean> channel, androidx.compose.material3.ModalWideNavigationRailState modalWideNavigationRailState, kotlin.coroutines.Continuation<? super androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = channel;
        this.getHighSpeedVideoFpsRangesFor = modalWideNavigationRailState;
    }
}
