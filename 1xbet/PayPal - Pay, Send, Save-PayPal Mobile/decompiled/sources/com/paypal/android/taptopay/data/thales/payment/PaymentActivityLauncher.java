package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/PaymentActivityLauncher;", "Lcom/paypal/android/taptopay/domain/di/OrphanedPaymentLifecycleDependency;", "Landroid/content/Context;", "context", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;", "paymentDataSource", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Landroid/content/Context;Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesPaymentDataSource;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentActivityLauncher implements com.paypal.android.taptopay.domain.di.OrphanedPaymentLifecycleDependency {
    public static final java.lang.String INTENT_EXTRA_PAYMENT_STATE = "EXTRA_PAYMENT_STATE";
    private final android.content.Context context;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource getHighSpeedVideoFpsRangesFor;

    public PaymentActivityLauncher(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource thalesPaymentDataSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thalesPaymentDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.context = context;
        this.getHighSpeedVideoFpsRangesFor = thalesPaymentDataSource;
        this.dispatcher = coroutineDispatcher;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher.AnonymousClass1(null), 3, null);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public /* synthetic */ PaymentActivityLauncher(android.content.Context context, com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource thalesPaymentDataSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, thalesPaymentDataSource, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    public final kotlinx.coroutines.CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1", f = "PaymentActivityLauncher.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.payment.PaymentState> paymentFlow = com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher.this.getHighSpeedVideoFpsRangesFor.getPaymentFlow();
                    this.getHighSpeedVideoSizes = 1;
                    if (new kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.payment.PaymentState>() { // from class: com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1$invokeSuspend$$inlined$filter$1

                        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $getHighSpeedVideoFpsRanges;

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                int i;
                                if (continuation instanceof com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                                    anonymousClass1 = (com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                                    if ((anonymousClass1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.getHighSpeedVideoSizes -= 2147483648;
                                        java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.getHighSpeedVideoSizes;
                                        if (i != 0) {
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            kotlinx.coroutines.flow.FlowCollector flowCollector = this.$getHighSpeedVideoFpsRanges;
                                            if (com.paypal.android.taptopay.data.thales.init.ThalesInitializer.INSTANCE.getPaymentActivityLauncherPredicateFun().invoke((com.paypal.android.taptopay.domain.model.payment.PaymentState) obj).booleanValue()) {
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
                                anonymousClass1 = new com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                                java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getHighSpeedVideoSizes;
                                if (i != 0) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }

                            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1$invokeSuspend$$inlined$filter$1$2", f = "PaymentActivityLauncher.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                            /* renamed from: com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                                int getHighSpeedVideoSizes;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    this.getHighSpeedVideoFpsRangesFor = obj;
                                    this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
                                    return com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
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
                        public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.android.taptopay.domain.model.payment.PaymentState> flowCollector, kotlin.coroutines.Continuation continuation) {
                            java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                        }
                    }.collect(new com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher.AnonymousClass1.AnonymousClass2(com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher.this), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            } catch (java.lang.Throwable th) {
                com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("PaymentActivityLauncher failed to collect payment flow", th);
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$1$2, reason: invalid class name */
        final /* synthetic */ class AnonymousClass2 implements kotlinx.coroutines.flow.FlowCollector, kotlin.jvm.internal.FunctionAdapter {
            final /* synthetic */ com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher getHighSpeedVideoFpsRangesFor;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                java.lang.Object access$launchPaymentActivity = com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher.access$launchPaymentActivity(this.getHighSpeedVideoFpsRangesFor, (com.paypal.android.taptopay.domain.model.payment.PaymentState) obj, continuation);
                return access$launchPaymentActivity == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? access$launchPaymentActivity : kotlin.Unit.INSTANCE;
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final kotlin.Function<?> getFunctionDelegate() {
                return new kotlin.jvm.internal.FunctionReferenceImpl(2, this.getHighSpeedVideoFpsRangesFor, com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher.class, "launchPaymentActivity", "launchPaymentActivity(Lcom/paypal/android/taptopay/domain/model/payment/PaymentState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final boolean equals(java.lang.Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.FlowCollector) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
                    return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            AnonymousClass2(com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher paymentActivityLauncher) {
                this.getHighSpeedVideoFpsRangesFor = paymentActivityLauncher;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public static final /* synthetic */ java.lang.Object access$launchPaymentActivity(com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher paymentActivityLauncher, com.paypal.android.taptopay.domain.model.payment.PaymentState paymentState, kotlin.coroutines.Continuation continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.android.taptopay.data.thales.payment.PaymentActivityLauncher$launchPaymentActivity$2(paymentState, paymentActivityLauncher, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
