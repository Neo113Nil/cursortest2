package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2", f = "UserModule.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class UserModuleKt$awaitUserId$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.core.user.UserModule getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.auth.Merchant> merchant = this.getHighSpeedVideoSizes.getMerchant();
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(new kotlinx.coroutines.flow.Flow<java.lang.Object>() { // from class: com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2$invokeSuspend$$inlined$filterIsInstance$1

                @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $getHighSpeedVideoFpsRanges;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.getHighSpeedVideoSizes -= 2147483648;
                                java.lang.Object obj2 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getHighSpeedVideoSizes;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.$getHighSpeedVideoFpsRanges;
                                    if (obj instanceof com.zettle.sdk.core.auth.Merchant.LoggedIn) {
                                        anonymousClass1.getHighSpeedVideoSizes = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.Camera2StreamConfigurationMap;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.getHighSpeedVideoSizes;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "UserModule.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                    /* renamed from: com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                        int getHighSpeedVideoSizes;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.Camera2StreamConfigurationMap = obj;
                            this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
                            return com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2.this.emit(null, this);
                        }

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                        this.$getHighSpeedVideoFpsRanges = flowCollector;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2$invokeSuspend$$inlined$filterIsInstance$1.AnonymousClass2(flowCollector), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }
            }, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return ((com.zettle.sdk.core.auth.Merchant.LoggedIn) obj).getUserId();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserModuleKt$awaitUserId$2(com.zettle.sdk.core.user.UserModule userModule, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.user.UserModuleKt$awaitUserId$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = userModule;
    }
}
