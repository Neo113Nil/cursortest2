package com.paypal.oslo.feature.inappcheckout.ui.util;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/util/CardPayloadBuilder;", "", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;", "cardDetails", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;", "billingAddress", "", "isBillingAddressExpanded", "", "selectedAddressId", "fiId", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationPayloadEntity;", "buildCardOperationPayload", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/CardDetails;Lcom/paypal/oslo/feature/inappcheckout/domain/model/BillingAddress;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationPayloadEntity;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardPayloadBuilder {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CardPayloadBuilder(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        this.getHighSpeedVideoSizes = localeProvider;
        this.getHighSpeedVideoFpsRangesFor = appSwitchSession;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity buildCardOperationPayload(com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails, com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress, boolean isBillingAddressExpanded, java.lang.String selectedAddressId, java.lang.String fiId) {
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardAddressInputEntity cardAddressInputEntity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
        java.lang.String expirationDate = cardDetails.getExpirationDate();
        java.lang.String take = kotlin.text.StringsKt.take(expirationDate, 2);
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(kotlin.text.StringsKt.drop(expirationDate, 2));
        int intValue = intOrNull != null ? intOrNull.intValue() : 0;
        int i = java.util.Calendar.getInstance().get(1) / 100;
        if (isBillingAddressExpanded) {
            cardAddressInputEntity = new com.paypal.oslo.feature.inappcheckout.domain.entity.CardAddressInputEntity(null, billingAddress.getStreetAddress(), billingAddress.getAddressLine2(), billingAddress.getCity(), billingAddress.getState(), billingAddress.getZipCode(), com.paypal.oslo.feature.inappcheckout.extensions.InAppCheckoutExtensionsKt.getCountryAndLanguage(this.getHighSpeedVideoSizes).component1(), 1, null);
        } else {
            cardAddressInputEntity = new com.paypal.oslo.feature.inappcheckout.domain.entity.CardAddressInputEntity(selectedAddressId, null, null, null, null, null, null, 126, null);
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationPayloadEntity(this.getHighSpeedVideoFpsRangesFor.getCheckoutTokenValueOrEmpty(), new com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderInputEntity(cardDetails.getFirstName(), cardDetails.getLastName()), cardAddressInputEntity, null, cardDetails.getCardNumber(), false, fiId, cardDetails.getCvv(), take, java.lang.String.valueOf((i * 100) + intValue), 8, null);
    }
}
