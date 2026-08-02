package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalObserveCardsUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/ObserveCardsUseCase;", "observeCardsUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardArtUseCase;", "payPalGetCardArtUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;", "payPalGetCardInfoUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupsUseCase;", "payPalGetCardIdGroupsUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/ObserveCardsUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardArtUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupsUseCase;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/ObserveCardsUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardArtUseCase;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupsUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalObserveCardsUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.ObserveCardsUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PayPalObserveCardsUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.card.ObserveCardsUseCase observeCardsUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase payPalGetCardIdGroupsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observeCardsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardArtUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardInfoUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardIdGroupsUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = observeCardsUseCase;
        this.Camera2StreamConfigurationMap = payPalGetCardArtUseCase;
        this.getHighSpeedVideoFpsRanges = payPalGetCardInfoUseCase;
        this.getHighSpeedVideoSizes = payPalGetCardIdGroupsUseCase;
    }

    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>> invoke() {
        final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>>() { // from class: com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase getHighSpeedVideoFpsRanges;

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0176, code lost:
                
                    if (r6.emit(r1, r2) != r3) goto L27;
                 */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0148  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    java.lang.Object obj2;
                    java.lang.Object coroutine_suspended;
                    int i;
                    java.util.List list;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase payPalGetCardIdGroupsUseCase;
                    int i2;
                    java.lang.Object obj3;
                    java.lang.Object obj4;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    kotlinx.coroutines.flow.FlowCollector flowCollector2;
                    java.lang.Object obj5;
                    int i3;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass12;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase;
                    kotlinx.coroutines.flow.FlowCollector flowCollector3;
                    kotlinx.coroutines.flow.FlowCollector flowCollector4;
                    java.lang.Object obj6;
                    java.lang.Object obj7;
                    if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputSizeshNQ4ISI -= 2147483648;
                            obj2 = anonymousClass1.getOutputStallDuration;
                            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector5 = this.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj8 = anonymousClass1;
                                list = (java.util.List) obj;
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Refresh cards", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card_count", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()))), null, 4, null);
                                payPalGetCardIdGroupsUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector5);
                                anonymousClass1.getInputSizeshNQ4ISI = flowCollector5;
                                anonymousClass1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj8);
                                anonymousClass1.getHighSpeedVideoSizesFor = list;
                                i2 = 0;
                                anonymousClass1.getHighSpeedVideoSizes = 0;
                                anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                anonymousClass1.getOutputSizeshNQ4ISI = 1;
                                java.lang.Object invoke = payPalGetCardIdGroupsUseCase.invoke(anonymousClass1);
                                if (invoke != coroutine_suspended) {
                                    obj3 = obj;
                                    obj4 = obj3;
                                    flowCollector = flowCollector5;
                                    flowCollector2 = flowCollector;
                                    obj2 = invoke;
                                    obj5 = obj8;
                                    i3 = 0;
                                    anonymousClass12 = anonymousClass1;
                                }
                                return coroutine_suspended;
                            }
                            if (i == 1) {
                                int i4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                int i5 = anonymousClass1.getHighSpeedVideoSizes;
                                list = (java.util.List) anonymousClass1.getHighSpeedVideoSizesFor;
                                java.lang.Object obj9 = (kotlin.coroutines.Continuation) anonymousClass1.getInputFormats;
                                kotlinx.coroutines.flow.FlowCollector flowCollector6 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getInputSizeshNQ4ISI;
                                flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getOutputMinFrameDuration;
                                obj3 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass13 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj2);
                                i2 = i4;
                                i3 = i5;
                                flowCollector = flowCollector6;
                                obj5 = obj9;
                                anonymousClass12 = anonymousClass13;
                            } else {
                                if (i != 2) {
                                    if (i != 3) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i6 = anonymousClass1.getHighSpeedVideoSizes;
                                    java.lang.Object obj10 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                    java.lang.Object obj11 = anonymousClass1.Camera2StreamConfigurationMap;
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    return kotlin.Unit.INSTANCE;
                                }
                                int i7 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                i3 = anonymousClass1.getHighSpeedVideoSizes;
                                kotlinx.coroutines.flow.FlowCollector flowCollector7 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getInputSizeshNQ4ISI;
                                flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.getOutputMinFrameDuration;
                                obj6 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                anonymousClass12 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                obj7 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj2);
                                flowCollector3 = flowCollector7;
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj7);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass12);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj6);
                                anonymousClass1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector4);
                                anonymousClass1.getInputSizeshNQ4ISI = null;
                                anonymousClass1.getInputFormats = null;
                                anonymousClass1.getHighSpeedVideoSizesFor = null;
                                anonymousClass1.getOutputFormats = null;
                                anonymousClass1.getHighSpeedVideoSizes = i3;
                                anonymousClass1.getOutputSizeshNQ4ISI = 3;
                            }
                            java.util.List list2 = (java.util.List) obj2;
                            payPalGetCardArtUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                            payPalGetCardInfoUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                            anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj4);
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass12);
                            anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                            anonymousClass1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
                            anonymousClass1.getInputSizeshNQ4ISI = flowCollector;
                            anonymousClass1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj5);
                            anonymousClass1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                            anonymousClass1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                            anonymousClass1.getHighSpeedVideoSizes = i3;
                            anonymousClass1.getHighSpeedVideoFpsRanges = i2;
                            anonymousClass1.getOutputSizeshNQ4ISI = 2;
                            obj2 = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt.toPayPalDigitizedCards(list, list2, payPalGetCardArtUseCase, payPalGetCardInfoUseCase, anonymousClass1);
                            if (obj2 != coroutine_suspended) {
                                flowCollector3 = flowCollector;
                                flowCollector4 = flowCollector2;
                                obj6 = obj3;
                                obj7 = obj4;
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj7);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass12);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj6);
                                anonymousClass1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector4);
                                anonymousClass1.getInputSizeshNQ4ISI = null;
                                anonymousClass1.getInputFormats = null;
                                anonymousClass1.getHighSpeedVideoSizesFor = null;
                                anonymousClass1.getOutputFormats = null;
                                anonymousClass1.getHighSpeedVideoSizes = i3;
                                anonymousClass1.getOutputSizeshNQ4ISI = 3;
                            }
                            return coroutine_suspended;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    obj2 = anonymousClass1.getOutputStallDuration;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    java.util.List list22 = (java.util.List) obj2;
                    payPalGetCardArtUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                    payPalGetCardInfoUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                    anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj4);
                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass12);
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                    anonymousClass1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
                    anonymousClass1.getInputSizeshNQ4ISI = flowCollector;
                    anonymousClass1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj5);
                    anonymousClass1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    anonymousClass1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list22);
                    anonymousClass1.getHighSpeedVideoSizes = i3;
                    anonymousClass1.getHighSpeedVideoFpsRanges = i2;
                    anonymousClass1.getOutputSizeshNQ4ISI = 2;
                    obj2 = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt.toPayPalDigitizedCards(list, list22, payPalGetCardArtUseCase, payPalGetCardInfoUseCase, anonymousClass1);
                    if (obj2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1$2", f = "PayPalObserveCardsUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 58, 50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$completion", "cards", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "$i$a$-map-PayPalObserveCardsUseCase$invoke$1", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$completion", "cards", "ids", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "$i$a$-map-PayPalObserveCardsUseCase$invoke$1", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {58, 62, 49}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    java.lang.Object getHighSpeedVideoSizesFor;
                    java.lang.Object getInputFormats;
                    java.lang.Object getInputSizeshNQ4ISI;
                    java.lang.Object getOutputFormats;
                    java.lang.Object getOutputMinFrameDuration;
                    int getOutputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getOutputStallDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputStallDuration = obj;
                        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase payPalObserveCardsUseCase) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    this.getHighSpeedVideoFpsRanges = payPalObserveCardsUseCase;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardsUseCase$invoke$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }
}
