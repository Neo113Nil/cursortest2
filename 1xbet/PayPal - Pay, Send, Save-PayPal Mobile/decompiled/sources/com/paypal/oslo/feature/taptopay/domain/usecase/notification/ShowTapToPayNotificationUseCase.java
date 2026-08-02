package com.paypal.oslo.feature.taptopay.domain.usecase.notification;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/notification/ShowTapToPayNotificationUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/notification/TapToPayNotificationContentDispatcher;", "dispatcher", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;", "notificationRenderer", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "localCardDataRepository", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/notification/TapToPayNotificationContentDispatcher;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/paypal/PayPalTransaction;", "payPalTransaction", "", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/paypal/PayPalTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "getHighSpeedVideoSizes", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/notification/TapToPayNotificationContentDispatcher;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShowTapToPayNotificationUseCase {

    @java.lang.Deprecated
    public static final java.lang.String NOTIFICATION_TITLE = "";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase.Companion Companion = new com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public ShowTapToPayNotificationUseCase(com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationContentDispatcher tapToPayNotificationContentDispatcher, com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer notificationRenderer, com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository payPalLocalCardDataRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayNotificationContentDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationRenderer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalLocalCardDataRepository, "");
        this.getHighSpeedVideoSizes = tapToPayNotificationContentDispatcher;
        this.getHighSpeedVideoFpsRanges = notificationRenderer;
        this.getHighResolutionOutputSizeshNQ4ISI = payPalLocalCardDataRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction payPalTransaction, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase$invoke$1 showTapToPayNotificationUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction;
        com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationData content;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase$invoke$1) {
            showTapToPayNotificationUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase$invoke$1) continuation;
            if ((showTapToPayNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                showTapToPayNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = showTapToPayNotificationUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = showTapToPayNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction2 = payPalTransaction.getTransaction();
                    java.lang.String cardId = transaction2.getCardId();
                    showTapToPayNotificationUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalTransaction);
                    showTapToPayNotificationUseCase$invoke$1.Camera2StreamConfigurationMap = transaction2;
                    showTapToPayNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(cardId, showTapToPayNotificationUseCase$invoke$1);
                    if (highSpeedVideoSizes == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    transaction = transaction2;
                    obj = highSpeedVideoSizes;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    transaction = (com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction) showTapToPayNotificationUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType = (com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType) obj;
                content = this.getHighSpeedVideoSizes.getContent(new com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContext(cardType, transaction.getStatus() != com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.APPROVED, transaction.getAmount(), transaction.getCurrencyCode(), transaction.getCardId()));
                if (content != null) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No provider returned content, skipping notification", null, null, 6, null);
                    return kotlin.Unit.INSTANCE;
                }
                java.lang.String id = transaction.getId();
                if (kotlin.text.StringsKt.isBlank(id)) {
                    id = null;
                }
                if (id == null) {
                    id = "unknown";
                }
                arrow.core.Either<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError, kotlin.Unit> show = this.getHighSpeedVideoFpsRanges.show(new com.paypal.oslo.core.pushnotification.domain.notification.NotificationData("taptopay_txn_".concat(java.lang.String.valueOf(id)), com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default.GENERAL, "", content.getContent(), null, null, null, null, false, false, null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "taptopay"), kotlin.TuplesKt.to(com.paypal.oslo.feature.taptopay.domain.notification.TapToPayNotificationConstants.METADATA_DEEPLINK, content.getDeeplinkUri())), null, 6128, null));
                if (show instanceof arrow.core.Either.Right) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TapToPay notification shown", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, cardType.name())), null, 4, null);
                } else if (show instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError notificationRenderError = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError) ((arrow.core.Either.Left) show).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(notificationRenderError.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "";
                    }
                    com.paypal.android.logger.Logger.w$default(logger, "Failed to show notification", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName)), null, 4, null);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        showTapToPayNotificationUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = showTapToPayNotificationUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = showTapToPayNotificationUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType2 = (com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType) obj2;
        content = this.getHighSpeedVideoSizes.getContent(new com.paypal.oslo.feature.taptopay.api.notification.TapToPayNotificationContext(cardType2, transaction.getStatus() != com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.APPROVED, transaction.getAmount(), transaction.getCurrencyCode(), transaction.getCardId()));
        if (content != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase$resolveCardType$1 showTapToPayNotificationUseCase$resolveCardType$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase$resolveCardType$1) {
            showTapToPayNotificationUseCase$resolveCardType$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase$resolveCardType$1) continuation;
            if ((showTapToPayNotificationUseCase$resolveCardType$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                showTapToPayNotificationUseCase$resolveCardType$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = showTapToPayNotificationUseCase$resolveCardType$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = showTapToPayNotificationUseCase$resolveCardType$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository payPalLocalCardDataRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId digitizedCardId = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId(str);
                    showTapToPayNotificationUseCase$resolveCardType$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    showTapToPayNotificationUseCase$resolveCardType$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = payPalLocalCardDataRepository.getCardInfo(digitizedCardId, showTapToPayNotificationUseCase$resolveCardType$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cardInfo = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) obj;
                if (cardInfo != null || (r5 = cardInfo.getType()) == null) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.Unknown;
                }
                return com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiCardType(cardType);
            }
        }
        showTapToPayNotificationUseCase$resolveCardType$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.notification.ShowTapToPayNotificationUseCase$resolveCardType$1(this, continuation);
        java.lang.Object obj2 = showTapToPayNotificationUseCase$resolveCardType$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = showTapToPayNotificationUseCase$resolveCardType$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        cardInfo = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) obj2;
        if (cardInfo != null) {
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType2 = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.Unknown;
        return com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiCardType(cardType2);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/notification/ShowTapToPayNotificationUseCase$Companion;", "", "<init>", "()V", "", "NOTIFICATION_TITLE", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
