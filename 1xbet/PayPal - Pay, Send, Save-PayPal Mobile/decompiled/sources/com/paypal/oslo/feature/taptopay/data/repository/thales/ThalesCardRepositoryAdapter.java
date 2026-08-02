package com.paypal.oslo.feature.taptopay.data.repository.thales;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J*\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00162\u0006\u0010\u0010\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010\u0010\u001a\u00020\nH\u0096@¢\u0006\u0004\b!\u0010\u001eJ$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010\u0010\u001a\u00020\nH\u0096@¢\u0006\u0004\b#\u0010\u001eJ$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010\u0010\u001a\u00020\nH\u0096@¢\u0006\u0004\b%\u0010\u001eJ\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016H\u0096@¢\u0006\u0004\b'\u0010(J$\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010\u0010\u001a\u00020\nH\u0096@¢\u0006\u0004\b*\u0010\u001eJ$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010\u0010\u001a\u00020\nH\u0096@¢\u0006\u0004\b,\u0010\u001eJ$\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060\u00162\u0006\u0010\u0010\u001a\u00020\nH\u0096@¢\u0006\u0004\b.\u0010\u001eJ\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020/0\fH\u0016¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\fH\u0016¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u00104J\u0011\u00105\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b5\u00104J\u0010\u00106\u001a\u00020 H\u0096@¢\u0006\u0004\b6\u0010(J$\u00109\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002080\u00162\u0006\u0010\u0010\u001a\u00020\nH\u0096@¢\u0006\u0004\b9\u0010\u001eR\u0014\u0010<\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/thales/ThalesCardRepositoryAdapter;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesCardRepository;", "thalesCardRepository", "<init>", "(Lcom/paypal/android/taptopay/data/thales/card/ThalesCardRepository;)V", "", "encryptedCardInfo", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardScheme;", "cardScheme", "", "consumerEntryMode", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;", com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, "([BLcom/paypal/oslo/feature/taptopay/domain/model/card/CardScheme;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "digitizedCardId", "activateCard", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "continueAddCard", "", "waitForRefresh", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetAllCardsError;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "getAllCards", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetCardError;", "getCard", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DeleteCardError;", "", "deleteCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/ResumeCardError;", "resumeCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/SuspendCardError;", "suspendCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetDefaultCardError;", "getDefaultCard", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/SetDefaultCardError;", "setDefaultCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IsDefaultCardError;", "isDefaultCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetCardArtError;", "getCardArt", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardStateChange;", "observeCardState", "()Lkotlinx/coroutines/flow/Flow;", "observeCards", "getWalletPartner", "()Ljava/lang/String;", "getWalletID", "wipeAllTokens", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetCardMetaDataError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardMetadata;", "getCardMetaData", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/data/thales/card/ThalesCardRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThalesCardRepositoryAdapter implements com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.card.ThalesCardRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ThalesCardRepositoryAdapter(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thalesCardRepository, "");
        this.getHighSpeedVideoFpsRanges = thalesCardRepository;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> addCard(byte[] encryptedCardInfo, com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme, java.lang.String consumerEntryMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedCardInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerEntryMode, "");
        final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> addCard = this.getHighSpeedVideoFpsRanges.addCard(encryptedCardInfo, cardScheme != null ? com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toThales(cardScheme) : null, consumerEntryMode);
        return new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>() { // from class: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$addCard$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$addCard$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$addCard$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$addCard$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$addCard$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputMinFrameDuration;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState oslo = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.AddCardState) obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.Camera2StreamConfigurationMap = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(oslo, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$addCard$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$addCard$$inlined$map$1$2", f = "ThalesCardRepositoryAdapter.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$addCard$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getInputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputMinFrameDuration = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$addCard$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$addCard$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> activateCard(java.lang.String digitizedCardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
        final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> activateCard = this.getHighSpeedVideoFpsRanges.activateCard(digitizedCardId);
        return new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>() { // from class: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$activateCard$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$activateCard$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$activateCard$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$activateCard$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$activateCard$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputFormats -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState oslo = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.AddCardState) obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                anonymousClass1.getInputFormats = 1;
                                if (flowCollector.emit(oslo, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$activateCard$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$activateCard$$inlined$map$1$2", f = "ThalesCardRepositoryAdapter.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$activateCard$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getInputFormats;
                    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputSizeshNQ4ISI = obj;
                        this.getInputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$activateCard$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$activateCard$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> continueAddCard(java.lang.String digitizedCardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
        final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> continueAddCard = this.getHighSpeedVideoFpsRanges.continueAddCard(digitizedCardId);
        return new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>() { // from class: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$continueAddCard$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$continueAddCard$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$continueAddCard$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$continueAddCard$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$continueAddCard$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState oslo = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.AddCardState) obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoSizes = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(oslo, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj3 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$continueAddCard$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$continueAddCard$$inlined$map$1$2", f = "ThalesCardRepositoryAdapter.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$continueAddCard$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getInputFormats;
                    int getInputSizeshNQ4ISI;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputFormats = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$continueAddCard$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$continueAddCard$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAllCards(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getAllCards$1 thalesCardRepositoryAdapter$getAllCards$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getAllCards$1) {
            thalesCardRepositoryAdapter$getAllCards$1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getAllCards$1) continuation;
            if ((thalesCardRepositoryAdapter$getAllCards$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                thalesCardRepositoryAdapter$getAllCards$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = thalesCardRepositoryAdapter$getAllCards$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesCardRepositoryAdapter$getAllCards$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighSpeedVideoFpsRanges;
                    thalesCardRepositoryAdapter$getAllCards$1.getHighSpeedVideoSizes = z;
                    thalesCardRepositoryAdapter$getAllCards$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = thalesCardRepository.getAllCards(z, thalesCardRepositoryAdapter$getAllCards$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = thalesCardRepositoryAdapter$getAllCards$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj);
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.GetAllCardsError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    java.util.List list = (java.util.List) ((arrow.core.Either.Right) right).getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.DigitizedCard) it.next()));
                    }
                    return new arrow.core.Either.Right(arrayList);
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        thalesCardRepositoryAdapter$getAllCards$1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getAllCards$1(this, continuation);
        java.lang.Object obj2 = thalesCardRepositoryAdapter$getAllCards$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesCardRepositoryAdapter$getAllCards$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj2);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCard$1 thalesCardRepositoryAdapter$getCard$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCard$1) {
            thalesCardRepositoryAdapter$getCard$1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCard$1) continuation;
            if ((thalesCardRepositoryAdapter$getCard$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                thalesCardRepositoryAdapter$getCard$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = thalesCardRepositoryAdapter$getCard$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesCardRepositoryAdapter$getCard$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighSpeedVideoFpsRanges;
                    thalesCardRepositoryAdapter$getCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    thalesCardRepositoryAdapter$getCard$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = thalesCardRepository.getCard(str, thalesCardRepositoryAdapter$getCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj);
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.GetCardError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) ((arrow.core.Either.Right) right).getValue();
                    return new arrow.core.Either.Right(digitizedCard != null ? com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo(digitizedCard) : null);
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        thalesCardRepositoryAdapter$getCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCard$1(this, continuation);
        java.lang.Object obj2 = thalesCardRepositoryAdapter$getCard$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesCardRepositoryAdapter$getCard$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj2);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.DeleteCardError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$deleteCard$1 thalesCardRepositoryAdapter$deleteCard$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$deleteCard$1) {
            thalesCardRepositoryAdapter$deleteCard$1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$deleteCard$1) continuation;
            if ((thalesCardRepositoryAdapter$deleteCard$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                thalesCardRepositoryAdapter$deleteCard$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = thalesCardRepositoryAdapter$deleteCard$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesCardRepositoryAdapter$deleteCard$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighSpeedVideoFpsRanges;
                    thalesCardRepositoryAdapter$deleteCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    thalesCardRepositoryAdapter$deleteCard$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = thalesCardRepository.deleteCard(str, thalesCardRepositoryAdapter$deleteCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj);
                if (!(either instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.DeleteCardError) ((arrow.core.Either.Left) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        thalesCardRepositoryAdapter$deleteCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$deleteCard$1(this, continuation);
        java.lang.Object obj2 = thalesCardRepositoryAdapter$deleteCard$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesCardRepositoryAdapter$deleteCard$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj2);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object resumeCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.ResumeCardError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$resumeCard$1 thalesCardRepositoryAdapter$resumeCard$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$resumeCard$1) {
            thalesCardRepositoryAdapter$resumeCard$1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$resumeCard$1) continuation;
            if ((thalesCardRepositoryAdapter$resumeCard$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                thalesCardRepositoryAdapter$resumeCard$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = thalesCardRepositoryAdapter$resumeCard$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesCardRepositoryAdapter$resumeCard$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighSpeedVideoFpsRanges;
                    thalesCardRepositoryAdapter$resumeCard$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    thalesCardRepositoryAdapter$resumeCard$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = thalesCardRepository.resumeCard(str, thalesCardRepositoryAdapter$resumeCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj);
                if (!(either instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.ResumeCardError) ((arrow.core.Either.Left) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        thalesCardRepositoryAdapter$resumeCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$resumeCard$1(this, continuation);
        java.lang.Object obj2 = thalesCardRepositoryAdapter$resumeCard$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesCardRepositoryAdapter$resumeCard$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj2);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object suspendCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.SuspendCardError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$suspendCard$1 thalesCardRepositoryAdapter$suspendCard$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$suspendCard$1) {
            thalesCardRepositoryAdapter$suspendCard$1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$suspendCard$1) continuation;
            if ((thalesCardRepositoryAdapter$suspendCard$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                thalesCardRepositoryAdapter$suspendCard$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = thalesCardRepositoryAdapter$suspendCard$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesCardRepositoryAdapter$suspendCard$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighSpeedVideoFpsRanges;
                    thalesCardRepositoryAdapter$suspendCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    thalesCardRepositoryAdapter$suspendCard$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = thalesCardRepository.suspendCard(str, thalesCardRepositoryAdapter$suspendCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj);
                if (!(either instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.SuspendCardError) ((arrow.core.Either.Left) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        thalesCardRepositoryAdapter$suspendCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$suspendCard$1(this, continuation);
        java.lang.Object obj2 = thalesCardRepositoryAdapter$suspendCard$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesCardRepositoryAdapter$suspendCard$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj2);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getDefaultCard(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetDefaultCardError, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getDefaultCard$1 thalesCardRepositoryAdapter$getDefaultCard$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getDefaultCard$1) {
            thalesCardRepositoryAdapter$getDefaultCard$1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getDefaultCard$1) continuation;
            if ((thalesCardRepositoryAdapter$getDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                thalesCardRepositoryAdapter$getDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = thalesCardRepositoryAdapter$getDefaultCard$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesCardRepositoryAdapter$getDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighSpeedVideoFpsRanges;
                    thalesCardRepositoryAdapter$getDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = thalesCardRepository.getDefaultCard(thalesCardRepositoryAdapter$getDefaultCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj);
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.GetDefaultCardError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) ((arrow.core.Either.Right) right).getValue();
                    return new arrow.core.Either.Right(digitizedCard != null ? com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo(digitizedCard) : null);
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        thalesCardRepositoryAdapter$getDefaultCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getDefaultCard$1(this, continuation);
        java.lang.Object obj2 = thalesCardRepositoryAdapter$getDefaultCard$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesCardRepositoryAdapter$getDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj2);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object setDefaultCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$setDefaultCard$1 thalesCardRepositoryAdapter$setDefaultCard$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$setDefaultCard$1) {
            thalesCardRepositoryAdapter$setDefaultCard$1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$setDefaultCard$1) continuation;
            if ((thalesCardRepositoryAdapter$setDefaultCard$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                thalesCardRepositoryAdapter$setDefaultCard$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = thalesCardRepositoryAdapter$setDefaultCard$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesCardRepositoryAdapter$setDefaultCard$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighSpeedVideoFpsRanges;
                    thalesCardRepositoryAdapter$setDefaultCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    thalesCardRepositoryAdapter$setDefaultCard$1.getHighSpeedVideoSizes = 1;
                    obj = thalesCardRepository.setDefaultCard(str, thalesCardRepositoryAdapter$setDefaultCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj);
                if (!(either instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.SetDefaultCardError) ((arrow.core.Either.Left) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        thalesCardRepositoryAdapter$setDefaultCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$setDefaultCard$1(this, continuation);
        java.lang.Object obj2 = thalesCardRepositoryAdapter$setDefaultCard$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesCardRepositoryAdapter$setDefaultCard$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj2);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isDefaultCard(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.IsDefaultCardError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$isDefaultCard$1 thalesCardRepositoryAdapter$isDefaultCard$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$isDefaultCard$1) {
            thalesCardRepositoryAdapter$isDefaultCard$1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$isDefaultCard$1) continuation;
            if ((thalesCardRepositoryAdapter$isDefaultCard$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                thalesCardRepositoryAdapter$isDefaultCard$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = thalesCardRepositoryAdapter$isDefaultCard$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesCardRepositoryAdapter$isDefaultCard$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighSpeedVideoFpsRanges;
                    thalesCardRepositoryAdapter$isDefaultCard$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    thalesCardRepositoryAdapter$isDefaultCard$1.Camera2StreamConfigurationMap = 1;
                    obj = thalesCardRepository.isDefaultCard(str, thalesCardRepositoryAdapter$isDefaultCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj);
                if (!(either instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.IsDefaultCardError) ((arrow.core.Either.Left) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        thalesCardRepositoryAdapter$isDefaultCard$1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$isDefaultCard$1(this, continuation);
        java.lang.Object obj2 = thalesCardRepositoryAdapter$isDefaultCard$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesCardRepositoryAdapter$isDefaultCard$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj2);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardArt(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetCardArtError, byte[]>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCardArt$1 thalesCardRepositoryAdapter$getCardArt$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCardArt$1) {
            thalesCardRepositoryAdapter$getCardArt$1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCardArt$1) continuation;
            if ((thalesCardRepositoryAdapter$getCardArt$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                thalesCardRepositoryAdapter$getCardArt$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = thalesCardRepositoryAdapter$getCardArt$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesCardRepositoryAdapter$getCardArt$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighSpeedVideoFpsRanges;
                    thalesCardRepositoryAdapter$getCardArt$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    thalesCardRepositoryAdapter$getCardArt$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = thalesCardRepository.getCardArt(str, thalesCardRepositoryAdapter$getCardArt$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj);
                if (!(either instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.GetCardArtError) ((arrow.core.Either.Left) either).getValue()));
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        thalesCardRepositoryAdapter$getCardArt$1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCardArt$1(this, continuation);
        java.lang.Object obj2 = thalesCardRepositoryAdapter$getCardArt$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesCardRepositoryAdapter$getCardArt$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj2);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange> observeCardState() {
        final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.CardStateChange> observeCardState = this.getHighSpeedVideoFpsRanges.observeCardState();
        return new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange>() { // from class: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCardState$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCardState$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCardState$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCardState$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCardState$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCardState$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputFormats -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange oslo = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.CardStateChange) obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                anonymousClass1.getInputFormats = 1;
                                if (flowCollector.emit(oslo, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj3 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCardState$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCardState$$inlined$map$1$2", f = "ThalesCardRepositoryAdapter.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCardState$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                    int getInputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizesFor = obj;
                        this.getInputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCardState$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                }
            }
        };
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> observeCards() {
        final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>> observeCards = this.getHighSpeedVideoFpsRanges.observeCards();
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>>() { // from class: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCards$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCards$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCards$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCards$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCards$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCards$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                java.util.List list = (java.util.List) obj;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                java.util.Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.DigitizedCard) it.next()));
                                }
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj4 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCards$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCards$$inlined$map$1$2", f = "ThalesCardRepositoryAdapter.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCards$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getInputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$observeCards$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                }
            }
        };
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final java.lang.String getWalletPartner() {
        return this.getHighSpeedVideoFpsRanges.getWalletPartner();
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final java.lang.String getWalletID() {
        return this.getHighSpeedVideoFpsRanges.getWalletID();
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object wipeAllTokens(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object wipeAllTokens = this.getHighSpeedVideoFpsRanges.wipeAllTokens(continuation);
        return wipeAllTokens == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? wipeAllTokens : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCardMetaData(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetCardMetaDataError, com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCardMetaData$1 thalesCardRepositoryAdapter$getCardMetaData$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCardMetaData$1) {
            thalesCardRepositoryAdapter$getCardMetaData$1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCardMetaData$1) continuation;
            if ((thalesCardRepositoryAdapter$getCardMetaData$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                thalesCardRepositoryAdapter$getCardMetaData$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = thalesCardRepositoryAdapter$getCardMetaData$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesCardRepositoryAdapter$getCardMetaData$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighSpeedVideoFpsRanges;
                    thalesCardRepositoryAdapter$getCardMetaData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    thalesCardRepositoryAdapter$getCardMetaData$1.Camera2StreamConfigurationMap = 1;
                    obj = thalesCardRepository.getCardMetaData(str, thalesCardRepositoryAdapter$getCardMetaData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj);
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.GetCardMetaDataError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    return new arrow.core.Either.Right(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.card.CardMetadata) ((arrow.core.Either.Right) right).getValue()));
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        thalesCardRepositoryAdapter$getCardMetaData$1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesCardRepositoryAdapter$getCardMetaData$1(this, continuation);
        java.lang.Object obj2 = thalesCardRepositoryAdapter$getCardMetaData$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesCardRepositoryAdapter$getCardMetaData$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj2);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }
}
