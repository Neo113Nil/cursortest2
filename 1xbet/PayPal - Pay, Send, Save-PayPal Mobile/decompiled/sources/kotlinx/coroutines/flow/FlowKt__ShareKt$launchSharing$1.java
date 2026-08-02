package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, 215, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FlowKt__ShareKt$launchSharing$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ T Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow<T> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.SharingStarted getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        if (r7.getHighResolutionOutputSizeshNQ4ISI.collect(r7.getHighSpeedVideoFpsRanges, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r7.getHighResolutionOutputSizeshNQ4ISI.collect(r7.getHighSpeedVideoFpsRanges, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r7.getHighSpeedVideoFpsRanges.getSubscriptionCount(), new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass1(null), r7) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r7.getHighSpeedVideoFpsRangesFor.command(r7.getHighSpeedVideoFpsRanges.getSubscriptionCount())), new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2(r7.getHighResolutionOutputSizeshNQ4ISI, r7.getHighSpeedVideoFpsRanges, r7.Camera2StreamConfigurationMap, null), r7) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoFpsRangesFor == kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly()) {
                this.getHighSpeedVideoSizes = 1;
            } else if (this.getHighSpeedVideoFpsRangesFor == kotlinx.coroutines.flow.SharingStarted.INSTANCE.getLazily()) {
                this.getHighSpeedVideoSizes = 2;
            } else {
                this.getHighSpeedVideoSizes = 4;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoSizes = 3;
                } else if (i != 3 && i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        /* synthetic */ int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoFpsRanges > 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass1) create(java.lang.Integer.valueOf(num.intValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass1 anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass1(continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = ((java.lang.Number) obj).intValue();
            return anonymousClass1;
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.SharingCommand, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow<T> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ T getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                int i2 = kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2.WhenMappings.$EnumSwitchMapping$0[((kotlinx.coroutines.flow.SharingCommand) this.getHighSpeedVideoFpsRangesFor).ordinal()];
                if (i2 == 1) {
                    this.getHighSpeedVideoFpsRanges = 1;
                    if (this.Camera2StreamConfigurationMap.collect(this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (this.getHighSpeedVideoSizes == kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                        this.getHighResolutionOutputSizeshNQ4ISI.resetReplayCache();
                    } else {
                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighResolutionOutputSizeshNQ4ISI.tryEmit(this.getHighSpeedVideoSizes));
                    }
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.SharingCommand sharingCommand, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2) create(sharingCommand, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$WhenMappings */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[kotlinx.coroutines.flow.SharingCommand.values().length];
                try {
                    iArr[kotlinx.coroutines.flow.SharingCommand.START.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlinx.coroutines.flow.SharingCommand.STOP.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2 anonymousClass2 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
            anonymousClass2.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.flow.MutableSharedFlow<T> mutableSharedFlow, T t, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = flow;
            this.getHighResolutionOutputSizeshNQ4ISI = mutableSharedFlow;
            this.getHighSpeedVideoSizes = t;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ShareKt$launchSharing$1(kotlinx.coroutines.flow.SharingStarted sharingStarted, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.flow.MutableSharedFlow<T> mutableSharedFlow, T t, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = sharingStarted;
        this.getHighResolutionOutputSizeshNQ4ISI = flow;
        this.getHighSpeedVideoFpsRanges = mutableSharedFlow;
        this.Camera2StreamConfigurationMap = t;
    }
}
