package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class LottieAnimatableImpl$animate$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.airbnb.lottie.compose.LottieClipSpec Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.airbnb.lottie.LottieComposition getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.airbnb.lottie.compose.LottieCancellationBehavior getHighSpeedVideoSizes;
    final /* synthetic */ int getHighSpeedVideoSizesFor;
    final /* synthetic */ boolean getInputFormats;
    final /* synthetic */ boolean getInputSizeshNQ4ISI;
    final /* synthetic */ int getOutputFormats;
    final /* synthetic */ float getOutputMinFrameDuration;
    final /* synthetic */ com.airbnb.lottie.compose.LottieAnimatableImpl getOutputMinFrameDurationlomOqCM;
    int getOutputStallDurationlomOqCM;

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.NonCancellable nonCancellable;
        float highSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDurationlomOqCM;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes(this.getOutputFormats);
                this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor);
                this.getOutputMinFrameDurationlomOqCM.getOutputStallDuration.setValue(java.lang.Boolean.valueOf(this.getInputFormats));
                this.getOutputMinFrameDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDuration);
                this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
                this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
                com.airbnb.lottie.compose.LottieAnimatableImpl.getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRangesFor);
                this.getOutputMinFrameDurationlomOqCM.getOutputMinFrameDurationlomOqCM.setValue(java.lang.Boolean.valueOf(this.getInputSizeshNQ4ISI));
                if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRangesFor(Long.MIN_VALUE);
                }
                if (this.getHighSpeedVideoFpsRanges == null) {
                    this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges(false);
                    return kotlin.Unit.INSTANCE;
                }
                if (!java.lang.Float.isInfinite(this.getOutputMinFrameDuration)) {
                    this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges(true);
                    int i2 = com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.ordinal()];
                    if (i2 == 1) {
                        nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                    } else {
                        if (i2 != 2) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        nonCancellable = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
                    }
                    kotlinx.coroutines.Job job = kotlinx.coroutines.JobKt.getJob(getGetHighSpeedVideoSizes());
                    this.getOutputStallDurationlomOqCM = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, new com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1(this.getHighSpeedVideoSizes, job, this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getOutputMinFrameDurationlomOqCM, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    com.airbnb.lottie.compose.LottieAnimatableImpl lottieAnimatableImpl = this.getOutputMinFrameDurationlomOqCM;
                    highSpeedVideoSizes = lottieAnimatableImpl.getHighSpeedVideoSizes();
                    com.airbnb.lottie.compose.LottieAnimatableImpl.getHighResolutionOutputSizeshNQ4ISI(lottieAnimatableImpl, highSpeedVideoSizes);
                    this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges(false);
                    this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor);
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlinx.coroutines.JobKt.ensureActive(getGetHighSpeedVideoSizes());
            this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges(false);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges(false);
            throw th;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.Job Camera2StreamConfigurationMap;
        final /* synthetic */ com.airbnb.lottie.compose.LottieCancellationBehavior getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ int getHighSpeedVideoSizes;
        final /* synthetic */ com.airbnb.lottie.compose.LottieAnimatableImpl getInputSizeshNQ4ISI;

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:5:0x0041). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.getHighSpeedVideoFpsRangesFor
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r5)
                goto L41
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.throwOnFailure(r5)
            L1a:
                com.airbnb.lottie.compose.LottieCancellationBehavior r5 = r4.getHighResolutionOutputSizeshNQ4ISI
                int[] r1 = com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0
                int r5 = r5.ordinal()
                r5 = r1[r5]
                if (r5 != r2) goto L31
                kotlinx.coroutines.Job r5 = r4.Camera2StreamConfigurationMap
                boolean r5 = r5.isActive()
                if (r5 != 0) goto L31
                int r5 = r4.getHighSpeedVideoFpsRanges
                goto L33
            L31:
                int r5 = r4.getHighSpeedVideoSizes
            L33:
                com.airbnb.lottie.compose.LottieAnimatableImpl r1 = r4.getInputSizeshNQ4ISI
                r3 = r4
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r4.getHighSpeedVideoFpsRangesFor = r2
                java.lang.Object r5 = com.airbnb.lottie.compose.LottieAnimatableImpl.getHighSpeedVideoFpsRangesFor(r1, r5, r3)
                if (r5 != r0) goto L41
                return r0
            L41:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L1a
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1$WhenMappings */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.airbnb.lottie.compose.LottieCancellationBehavior.values().length];
                try {
                    iArr[com.airbnb.lottie.compose.LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.airbnb.lottie.compose.LottieCancellationBehavior lottieCancellationBehavior, kotlinx.coroutines.Job job, int i, int i2, com.airbnb.lottie.compose.LottieAnimatableImpl lottieAnimatableImpl, kotlin.coroutines.Continuation<? super com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = lottieCancellationBehavior;
            this.Camera2StreamConfigurationMap = job;
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRanges = i2;
            this.getInputSizeshNQ4ISI = lottieAnimatableImpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.airbnb.lottie.compose.LottieCancellationBehavior.values().length];
            try {
                iArr[com.airbnb.lottie.compose.LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.airbnb.lottie.compose.LottieCancellationBehavior.Immediately.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2(this.getOutputMinFrameDurationlomOqCM, this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.getInputFormats, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LottieAnimatableImpl$animate$2(com.airbnb.lottie.compose.LottieAnimatableImpl lottieAnimatableImpl, int i, int i2, boolean z, float f, com.airbnb.lottie.compose.LottieClipSpec lottieClipSpec, com.airbnb.lottie.LottieComposition lottieComposition, float f2, boolean z2, boolean z3, com.airbnb.lottie.compose.LottieCancellationBehavior lottieCancellationBehavior, kotlin.coroutines.Continuation<? super com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2> continuation) {
        super(1, continuation);
        this.getOutputMinFrameDurationlomOqCM = lottieAnimatableImpl;
        this.getOutputFormats = i;
        this.getHighSpeedVideoSizesFor = i2;
        this.getInputFormats = z;
        this.getOutputMinFrameDuration = f;
        this.Camera2StreamConfigurationMap = lottieClipSpec;
        this.getHighSpeedVideoFpsRanges = lottieComposition;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getInputSizeshNQ4ISI = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = z3;
        this.getHighSpeedVideoSizes = lottieCancellationBehavior;
    }
}
