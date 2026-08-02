package com.paypal.oslo.core.session;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2", f = "NetworkCacheClearerImpl.kt", i = {0}, l = {46}, m = "invokeSuspend", n = {"$this$withContext"}, nl = {50}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class NetworkCacheClearerImpl$clearAllCaches$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlin.Unit>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.session.NetworkCacheClearerImpl Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        kotlinx.coroutines.Deferred async$default3;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2.AnonymousClass1(this.Camera2StreamConfigurationMap, null), 3, null);
        async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2.AnonymousClass2(this.Camera2StreamConfigurationMap, null), 3, null);
        async$default3 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2.AnonymousClass3(this.Camera2StreamConfigurationMap, null), 3, null);
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object awaitAll = kotlinx.coroutines.AwaitKt.awaitAll(new kotlinx.coroutines.Deferred[]{async$default, async$default2, async$default3}, this);
        return awaitAll == coroutine_suspended ? coroutine_suspended : awaitAll;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2$1", f = "NetworkCacheClearerImpl.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.session.NetworkCacheClearerImpl getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.core.session.ApolloCacheClearer apolloCacheClearer;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                apolloCacheClearer = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = 1;
                if (apolloCacheClearer.clearCache(this) == coroutine_suspended) {
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
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.session.NetworkCacheClearerImpl networkCacheClearerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = networkCacheClearerImpl;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2$2", f = "NetworkCacheClearerImpl.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.session.NetworkCacheClearerImpl getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.core.session.OkHttpCacheClearer okHttpCacheClearer;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                okHttpCacheClearer = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (okHttpCacheClearer.clearCache(this) == coroutine_suspended) {
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
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2.AnonymousClass2(this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.paypal.oslo.core.session.NetworkCacheClearerImpl networkCacheClearerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = networkCacheClearerImpl;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2$3", f = "NetworkCacheClearerImpl.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.session.NetworkCacheClearerImpl getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.core.session.CronetCacheClearer cronetCacheClearer;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                cronetCacheClearer = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (cronetCacheClearer.clearCache(this) == coroutine_suspended) {
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
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2.AnonymousClass3(this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(com.paypal.oslo.core.session.NetworkCacheClearerImpl networkCacheClearerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2.AnonymousClass3> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = networkCacheClearerImpl;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlin.Unit>> continuation) {
        return ((com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2 networkCacheClearerImpl$clearAllCaches$2 = new com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2(this.Camera2StreamConfigurationMap, continuation);
        networkCacheClearerImpl$clearAllCaches$2.getHighSpeedVideoFpsRanges = obj;
        return networkCacheClearerImpl$clearAllCaches$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkCacheClearerImpl$clearAllCaches$2(com.paypal.oslo.core.session.NetworkCacheClearerImpl networkCacheClearerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.session.NetworkCacheClearerImpl$clearAllCaches$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = networkCacheClearerImpl;
    }
}
