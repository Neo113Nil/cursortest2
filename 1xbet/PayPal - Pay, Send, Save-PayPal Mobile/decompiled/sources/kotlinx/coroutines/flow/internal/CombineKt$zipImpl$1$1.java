package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, m = "invokeSuspend", n = {"second", "collectJob"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class CombineKt$zipImpl$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T2> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ReceiveChannel produce$default;
        final kotlinx.coroutines.CompletableJob Job$default;
        kotlinx.coroutines.CompletableJob completableJob;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
                produce$default = kotlinx.coroutines.channels.ProduceKt.produce$default(coroutineScope, null, 0, new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
                Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
                kotlin.jvm.internal.Intrinsics.checkNotNull(produce$default, "");
                ((kotlinx.coroutines.channels.SendChannel) produce$default).invokeOnClose(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                        getHighSpeedVideoFpsRanges(th);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
                        if (kotlinx.coroutines.CompletableJob.this.isActive()) {
                            kotlinx.coroutines.CompletableJob.this.cancel((java.util.concurrent.CancellationException) new kotlinx.coroutines.flow.internal.AbortFlowException(kotlinx.coroutines.CompletableJob.this));
                        }
                    }
                });
                try {
                    kotlin.coroutines.CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
                    java.lang.Object threadContextElements = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(coroutineContext);
                    this.getInputFormats = produce$default;
                    this.Camera2StreamConfigurationMap = Job$default;
                    this.getHighSpeedVideoSizesFor = 1;
                    if (kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched$default(coroutineScope.getCoroutineContext().plus(Job$default), kotlin.Unit.INSTANCE, null, new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, coroutineContext, threadContextElements, produce$default, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, Job$default, null), this, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (kotlinx.coroutines.flow.internal.AbortFlowException e) {
                    e = e;
                    completableJob = Job$default;
                    kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, completableJob);
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(produce$default, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                completableJob = (kotlinx.coroutines.CompletableJob) this.Camera2StreamConfigurationMap;
                produce$default = (kotlinx.coroutines.channels.ReceiveChannel) this.getInputFormats;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                    e = e2;
                    kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, completableJob);
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(produce$default, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(produce$default, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(produce$default, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            throw th;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.coroutines.CoroutineContext Camera2StreamConfigurationMap;
        final /* synthetic */ kotlinx.coroutines.CompletableJob getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
        final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getInputFormats;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> getInputSizeshNQ4ISI;
        int getOutputFormats;

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ kotlin.coroutines.CoroutineContext Camera2StreamConfigurationMap;
            final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ kotlinx.coroutines.CompletableJob getHighSpeedVideoSizes;
            final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getOutputMinFrameDuration;

            @kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {126, 129, 129}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C02181 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ kotlinx.coroutines.CompletableJob Camera2StreamConfigurationMap;
                final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> getHighSpeedVideoFpsRanges;
                final /* synthetic */ T1 getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoSizes;
                java.lang.Object getHighSpeedVideoSizesFor;
                int getInputSizeshNQ4ISI;

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
                
                    if (r1.emit(r9, r8) == r0) goto L30;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
                
                    if (r9 != r0) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
                
                    if (r9 != r0) goto L14;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.flow.FlowCollector] */
                /* JADX WARN: Type inference failed for: r1v8 */
                /* JADX WARN: Type inference failed for: r1v9 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object mo24072receiveCatchingJP2dKIU;
                    ?? r1;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getInputSizeshNQ4ISI;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getInputSizeshNQ4ISI = 1;
                        mo24072receiveCatchingJP2dKIU = this.getHighResolutionOutputSizeshNQ4ISI.mo24072receiveCatchingJP2dKIU(this);
                    } else if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mo24072receiveCatchingJP2dKIU = ((kotlinx.coroutines.channels.ChannelResult) obj).getGetHighSpeedVideoFpsRanges();
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        r1 = flowCollector;
                        this.getHighSpeedVideoSizesFor = null;
                        this.getInputSizeshNQ4ISI = 3;
                    }
                    kotlinx.coroutines.CompletableJob completableJob = this.Camera2StreamConfigurationMap;
                    if (mo24072receiveCatchingJP2dKIU instanceof kotlinx.coroutines.channels.ChannelResult.Failed) {
                        java.lang.Throwable m24083exceptionOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(mo24072receiveCatchingJP2dKIU);
                        if (m24083exceptionOrNullimpl == null) {
                            throw new kotlinx.coroutines.flow.internal.AbortFlowException(completableJob);
                        }
                        throw m24083exceptionOrNullimpl;
                    }
                    java.lang.Object obj2 = this.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function3 function3 = this.getHighSpeedVideoSizes;
                    java.lang.Object obj3 = this.getHighSpeedVideoFpsRangesFor;
                    if (mo24072receiveCatchingJP2dKIU == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        mo24072receiveCatchingJP2dKIU = null;
                    }
                    this.getHighSpeedVideoSizesFor = obj2;
                    this.getInputSizeshNQ4ISI = 2;
                    obj = function3.invoke(obj3, mo24072receiveCatchingJP2dKIU, this);
                    r1 = obj2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C02181) create(unit, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    return new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C02181(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C02181(kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> receiveChannel, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, T1 t1, kotlinx.coroutines.CompletableJob completableJob, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C02181> continuation) {
                    super(2, continuation);
                    this.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
                    this.getHighSpeedVideoFpsRanges = flowCollector;
                    this.getHighSpeedVideoSizes = function3;
                    this.getHighSpeedVideoFpsRangesFor = t1;
                    this.Camera2StreamConfigurationMap = completableJob;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(T1 t1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
                int i;
                if (continuation instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) {
                    combineKt$zipImpl$1$1$2$1$emit$1 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) continuation;
                    if ((combineKt$zipImpl$1$1$2$1$emit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                        combineKt$zipImpl$1$1$2$1$emit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                        java.lang.Object obj = combineKt$zipImpl$1$1$2$1$emit$1.getHighSpeedVideoSizes;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = combineKt$zipImpl$1$1$2$1$emit$1.getHighSpeedVideoFpsRanges;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.coroutines.CoroutineContext coroutineContext = this.Camera2StreamConfigurationMap;
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            java.lang.Object obj2 = this.getHighSpeedVideoFpsRanges;
                            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C02181 c02181 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C02181(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, t1, this.getHighSpeedVideoSizes, null);
                            combineKt$zipImpl$1$1$2$1$emit$1.getHighSpeedVideoFpsRanges = 1;
                            if (kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched(coroutineContext, unit, obj2, c02181, combineKt$zipImpl$1$1$2$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                combineKt$zipImpl$1$1$2$1$emit$1 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1(this, continuation);
                java.lang.Object obj3 = combineKt$zipImpl$1$1$2$1$emit$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = combineKt$zipImpl$1$1$2$1$emit$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                }
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj, kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> receiveChannel, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlinx.coroutines.CompletableJob completableJob) {
                this.Camera2StreamConfigurationMap = coroutineContext;
                this.getHighSpeedVideoFpsRanges = obj;
                this.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
                this.getHighSpeedVideoFpsRangesFor = flowCollector;
                this.getOutputMinFrameDuration = function3;
                this.getHighSpeedVideoSizes = completableJob;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getOutputFormats;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getOutputFormats = 1;
                if (this.getHighSpeedVideoFpsRangesFor.collect(new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
                    return coroutine_suspended;
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
        public final /* synthetic */ java.lang.Object invoke(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2) create(unit, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj, kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> receiveChannel, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlinx.coroutines.CompletableJob completableJob, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = flow;
            this.Camera2StreamConfigurationMap = coroutineContext;
            this.getHighSpeedVideoSizes = obj;
            this.getHighSpeedVideoFpsRanges = receiveChannel;
            this.getInputSizeshNQ4ISI = flowCollector;
            this.getInputFormats = function3;
            this.getHighResolutionOutputSizeshNQ4ISI = completableJob;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        combineKt$zipImpl$1$1.getInputFormats = obj;
        return combineKt$zipImpl$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CombineKt$zipImpl$1$1(kotlinx.coroutines.flow.Flow<? extends T2> flow, kotlinx.coroutines.flow.Flow<? extends T1> flow2, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = flow;
        this.getHighResolutionOutputSizeshNQ4ISI = flow2;
        this.getHighSpeedVideoFpsRanges = flowCollector;
        this.getHighSpeedVideoSizes = function3;
    }
}
