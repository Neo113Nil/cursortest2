package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalObserveTransactionsUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/ObserveTransactionsUseCase;", "observeTransactionsUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "getCardIdGroupUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/ObserveTransactionsUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/paypal/PayPalTransaction;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/ObserveTransactionsUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalObserveTransactionsUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObserveTransactionsUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PayPalObserveTransactionsUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObserveTransactionsUseCase observeTransactionsUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observeTransactionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardIdGroupUseCase, "");
        this.getHighSpeedVideoFpsRanges = observeTransactionsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = payPalGetCardIdGroupUseCase;
    }

    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction>> invoke() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running observe transactions use case", null, null, 6, null);
        final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>> invoke = this.getHighSpeedVideoFpsRanges.invoke();
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction>>() { // from class: com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;
                final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Code restructure failed: missing block: B:28:0x0205, code lost:
                
                    if (r10.emit(r0, r4) == r3) goto L29;
                 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0164  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x01b3  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x017d  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x014e -> B:17:0x0160). Please report as a decompilation issue!!! */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    java.lang.Object obj2;
                    java.lang.Object obj3;
                    java.util.List createListBuilder;
                    java.lang.Object obj4;
                    java.util.Iterator<T> it;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    java.lang.Object obj5;
                    com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass12;
                    java.util.List list;
                    java.util.List list2;
                    kotlinx.coroutines.flow.FlowCollector flowCollector2;
                    com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass13;
                    java.lang.Object obj6;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase;
                    com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass14;
                    java.lang.Object obj7;
                    com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1.AnonymousClass2<T> anonymousClass2 = this;
                    if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.unwrapAs & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.unwrapAs -= 2147483648;
                            java.lang.Object obj8 = anonymousClass1.toString;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.unwrapAs;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj8);
                                java.util.List list3 = (java.util.List) obj;
                                java.util.List list4 = list3;
                                flowCollector = anonymousClass2.Camera2StreamConfigurationMap;
                                obj2 = coroutine_suspended;
                                obj3 = anonymousClass1;
                                createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                                obj4 = list4;
                                it = list4.iterator();
                                i2 = 0;
                                i3 = 0;
                                i4 = 0;
                                i5 = 0;
                                obj5 = obj;
                                anonymousClass12 = anonymousClass1;
                                list = list3;
                                list2 = createListBuilder;
                                flowCollector2 = flowCollector;
                                anonymousClass13 = anonymousClass12;
                                obj6 = obj5;
                                if (it.hasNext()) {
                                }
                                return coroutine_suspended;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i6 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj9 = anonymousClass1.getOutputMinFrameDurationlomOqCM;
                                java.lang.Object obj10 = anonymousClass1.getHighSpeedVideoSizesFor;
                                kotlin.ResultKt.throwOnFailure(obj8);
                                return kotlin.Unit.INSTANCE;
                            }
                            int i7 = anonymousClass1.Camera2StreamConfigurationMap;
                            int i8 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            int i9 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            int i10 = anonymousClass1.getHighSpeedVideoSizes;
                            int i11 = anonymousClass1.getHighSpeedVideoFpsRanges;
                            com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction = (com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction) anonymousClass1.getInputSizeshNQ4ISI;
                            java.lang.Object obj11 = anonymousClass1.getOutputMinFrameDuration;
                            java.util.Iterator<T> it2 = (java.util.Iterator) anonymousClass1.getInputFormats;
                            java.lang.Object obj12 = (java.lang.Iterable) anonymousClass1.isOutputSupportedForhNQ4ISI;
                            java.util.List list5 = (java.util.List) anonymousClass1.isOutputSupportedFor;
                            java.util.List list6 = (java.util.List) anonymousClass1.getValidOutputFormatsForInputhNQ4ISI;
                            java.util.List list7 = (java.util.List) anonymousClass1.getOutputStallDuration;
                            java.lang.Object obj13 = (kotlin.coroutines.Continuation) anonymousClass1.getOutputStallDurationlomOqCM;
                            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getOutputSizeshNQ4ISI;
                            kotlinx.coroutines.flow.FlowCollector flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getOutputSizes;
                            java.lang.Object obj14 = anonymousClass1.getOutputMinFrameDurationlomOqCM;
                            com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass15 = (com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) anonymousClass1.getOutputFormats;
                            java.lang.Object obj15 = anonymousClass1.getHighSpeedVideoSizesFor;
                            kotlin.ResultKt.throwOnFailure(obj8);
                            com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass16 = anonymousClass1;
                            obj6 = obj14;
                            java.lang.Object obj16 = obj12;
                            int i12 = i10;
                            obj3 = obj13;
                            flowCollector2 = flowCollector4;
                            java.util.Iterator<T> it3 = it2;
                            int i13 = i9;
                            list = list7;
                            anonymousClass13 = anonymousClass15;
                            int i14 = i8;
                            flowCollector = flowCollector3;
                            list2 = list6;
                            int i15 = i11;
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj8;
                            if (cardIdGroup == null) {
                                anonymousClass14 = anonymousClass16;
                                obj7 = obj6;
                                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(list5.add(new com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction(cardIdGroup.getPayPalCardId(), cardIdGroup.getDeviceWalletServiceCardId(), transaction)));
                            } else {
                                anonymousClass14 = anonymousClass16;
                                obj7 = obj6;
                                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No card ID found for transaction", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", transaction.getCardId())), 2, null);
                            }
                            anonymousClass2 = this;
                            obj5 = obj15;
                            i2 = i13;
                            i3 = i12;
                            i4 = i15;
                            obj4 = obj16;
                            i5 = i14;
                            obj6 = obj7;
                            anonymousClass12 = anonymousClass14;
                            java.util.Iterator<T> it4 = it3;
                            obj2 = coroutine_suspended;
                            createListBuilder = list5;
                            it = it4;
                            if (it.hasNext()) {
                                T next = it.next();
                                int i16 = i2;
                                transaction = (com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction) next;
                                int i17 = i3;
                                payPalGetCardIdGroupUseCase = anonymousClass2.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId digitizedCardId = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId(transaction.getCardId());
                                anonymousClass12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj5);
                                anonymousClass12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass13);
                                anonymousClass12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj6);
                                anonymousClass12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
                                anonymousClass12.getOutputSizeshNQ4ISI = flowCollector;
                                anonymousClass12.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                                anonymousClass12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                                anonymousClass12.getValidOutputFormatsForInputhNQ4ISI = list2;
                                anonymousClass12.isOutputSupportedFor = createListBuilder;
                                anonymousClass12.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj4);
                                anonymousClass12.getInputFormats = it;
                                anonymousClass12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                                anonymousClass12.getInputSizeshNQ4ISI = transaction;
                                anonymousClass12.getHighSpeedVideoFpsRanges = i4;
                                anonymousClass12.getHighSpeedVideoSizes = i17;
                                java.util.List list8 = createListBuilder;
                                anonymousClass12.getHighResolutionOutputSizeshNQ4ISI = i16;
                                anonymousClass12.getHighSpeedVideoFpsRangesFor = i5;
                                anonymousClass12.Camera2StreamConfigurationMap = 0;
                                anonymousClass12.unwrapAs = 1;
                                java.lang.Object invoke = payPalGetCardIdGroupUseCase.invoke(digitizedCardId, anonymousClass12);
                                coroutine_suspended = obj2;
                                if (invoke != coroutine_suspended) {
                                    it3 = it;
                                    list5 = list8;
                                    i14 = i5;
                                    obj16 = obj4;
                                    i15 = i4;
                                    i12 = i17;
                                    i13 = i16;
                                    java.lang.Object obj17 = obj5;
                                    obj8 = invoke;
                                    anonymousClass16 = anonymousClass12;
                                    obj15 = obj17;
                                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj8;
                                    if (cardIdGroup2 == null) {
                                    }
                                    anonymousClass2 = this;
                                    obj5 = obj15;
                                    i2 = i13;
                                    i3 = i12;
                                    i4 = i15;
                                    obj4 = obj16;
                                    i5 = i14;
                                    obj6 = obj7;
                                    anonymousClass12 = anonymousClass14;
                                    java.util.Iterator<T> it42 = it3;
                                    obj2 = coroutine_suspended;
                                    createListBuilder = list5;
                                    it = it42;
                                    if (it.hasNext()) {
                                        coroutine_suspended = obj2;
                                        java.util.List build = kotlin.collections.CollectionsKt.build(list2);
                                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Mapped transactions", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("transactions", build)), null, 4, null);
                                        anonymousClass12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj5);
                                        anonymousClass12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass13);
                                        anonymousClass12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj6);
                                        anonymousClass12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
                                        anonymousClass12.getOutputSizeshNQ4ISI = null;
                                        anonymousClass12.getOutputStallDurationlomOqCM = null;
                                        anonymousClass12.getOutputStallDuration = null;
                                        anonymousClass12.getValidOutputFormatsForInputhNQ4ISI = null;
                                        anonymousClass12.isOutputSupportedFor = null;
                                        anonymousClass12.isOutputSupportedForhNQ4ISI = null;
                                        anonymousClass12.getInputFormats = null;
                                        anonymousClass12.getOutputMinFrameDuration = null;
                                        anonymousClass12.getInputSizeshNQ4ISI = null;
                                        anonymousClass12.getHighSpeedVideoFpsRanges = i4;
                                        anonymousClass12.unwrapAs = 2;
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    anonymousClass1 = anonymousClass2.new AnonymousClass1(continuation);
                    java.lang.Object obj82 = anonymousClass1.toString;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.unwrapAs;
                    if (i != 0) {
                    }
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1$2", f = "PayPalObserveTransactionsUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {54, 50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$completion", "transactions", "$this$invoke_u24lambda_u240_u240", "$this$forEach$iv", "element$iv", "transaction", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "$i$a$-map-PayPalObserveTransactionsUseCase$invoke$1", "$i$a$-buildList-PayPalObserveTransactionsUseCase$invoke$1$1", "$i$f$forEach", "$i$a$-forEach-PayPalObserveTransactionsUseCase$invoke$1$1$1", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {56, 49}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$8", "L$9", "L$11", "L$12", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    java.lang.Object getHighSpeedVideoSizesFor;
                    java.lang.Object getInputFormats;
                    java.lang.Object getInputSizeshNQ4ISI;
                    java.lang.Object getOutputFormats;
                    java.lang.Object getOutputMinFrameDuration;
                    java.lang.Object getOutputMinFrameDurationlomOqCM;
                    java.lang.Object getOutputSizes;
                    java.lang.Object getOutputSizeshNQ4ISI;
                    java.lang.Object getOutputStallDuration;
                    java.lang.Object getOutputStallDurationlomOqCM;
                    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
                    java.lang.Object isOutputSupportedFor;
                    java.lang.Object isOutputSupportedForhNQ4ISI;
                    /* synthetic */ java.lang.Object toString;
                    int unwrapAs;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.toString = obj;
                        this.unwrapAs |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase payPalObserveTransactionsUseCase) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = payPalObserveTransactionsUseCase;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObserveTransactionsUseCase$invoke$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }
}
