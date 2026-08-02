package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.mapper;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/mapper/ProvisioningMetadataMapper;", "", "<init>", "()V", "", "opaquePaymentCard", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "debitInstrument", "phoneNumber", "Lcom/paypal/oslo/feature/starpay/api/ProvisioningMetadata;", "createProvisioningMetadata", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Ljava/lang/String;)Lcom/paypal/oslo/feature/starpay/api/ProvisioningMetadata;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentCardBrand;", "Lcom/paypal/oslo/feature/starpay/api/CardNetwork;", "toCardNetwork$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentCardBrand;)Lcom/paypal/oslo/feature/starpay/api/CardNetwork;", "Lcom/paypal/oslo/feature/starpay/api/TokenServiceProvider;", "toTokenServiceProvider$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/starpay/api/CardNetwork;)Lcom/paypal/oslo/feature/starpay/api/TokenServiceProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProvisioningMetadataMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.mapper.ProvisioningMetadataMapper INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.mapper.ProvisioningMetadataMapper();

    private ProvisioningMetadataMapper() {
    }

    public final com.paypal.oslo.feature.starpay.api.ProvisioningMetadata createProvisioningMetadata(java.lang.String opaquePaymentCard, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, java.lang.String phoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opaquePaymentCard, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        com.paypal.oslo.feature.starpay.api.CardNetwork cardNetwork$debit_card_prodRelease = toCardNetwork$debit_card_prodRelease(debitInstrument.getProductDetails().getBrand());
        java.lang.String legalName = debitInstrument.getProductDetails().getLegalName();
        java.lang.String lastNChars = debitInstrument.getLastNChars();
        com.paypal.oslo.feature.starpay.api.TokenServiceProvider tokenServiceProvider$debit_card_prodRelease = toTokenServiceProvider$debit_card_prodRelease(cardNetwork$debit_card_prodRelease);
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder cardHolder = debitInstrument.getCardHolder();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBillingAddress billingAddress = cardHolder.getBillingAddress();
        com.paypal.oslo.core.userstore.model.ProfileAddress.Address address = billingAddress != null ? billingAddress.getAddress() : null;
        java.lang.String firstName = cardHolder.getFirstName();
        java.lang.String lastName = cardHolder.getLastName();
        java.lang.String[] strArr = new java.lang.String[2];
        if (firstName == null || kotlin.text.StringsKt.isBlank(firstName)) {
            firstName = null;
        }
        strArr[0] = firstName;
        if (lastName == null || kotlin.text.StringsKt.isBlank(lastName)) {
            lastName = null;
        }
        strArr[1] = lastName;
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) strArr), " ", null, null, 0, null, null, 62, null);
        java.lang.String addressLine1 = address != null ? address.getAddressLine1() : null;
        if (addressLine1 == null) {
            addressLine1 = "";
        }
        java.lang.String addressLine2 = address != null ? address.getAddressLine2() : null;
        if (addressLine2 == null) {
            addressLine2 = "";
        }
        java.lang.String adminArea2 = address != null ? address.getAdminArea2() : null;
        if (adminArea2 == null) {
            adminArea2 = "";
        }
        java.lang.String adminArea1 = address != null ? address.getAdminArea1() : null;
        if (adminArea1 == null) {
            adminArea1 = "";
        }
        java.lang.String postalCode = address != null ? address.getPostalCode() : null;
        java.lang.String str = postalCode == null ? "" : postalCode;
        java.lang.String countryCode = address != null ? address.getCountryCode() : null;
        return new com.paypal.oslo.feature.starpay.api.ProvisioningMetadata(opaquePaymentCard, cardNetwork$debit_card_prodRelease, tokenServiceProvider$debit_card_prodRelease, legalName, lastNChars, new com.paypal.oslo.feature.starpay.api.UserAddress(joinToString$default, addressLine1, addressLine2, adminArea2, adminArea1, countryCode == null ? "" : countryCode, str, phoneNumber));
    }

    public final com.paypal.oslo.feature.starpay.api.CardNetwork toCardNetwork$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand debitInstrumentCardBrand) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentCardBrand, "");
        int i = com.paypal.oslo.feature.debitcard.pushprovisioning.domain.mapper.ProvisioningMetadataMapper.WhenMappings.$EnumSwitchMapping$0[debitInstrumentCardBrand.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.starpay.api.CardNetwork.MASTERCARD;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.starpay.api.CardNetwork.MASTERCARD;
    }

    public final com.paypal.oslo.feature.starpay.api.TokenServiceProvider toTokenServiceProvider$debit_card_prodRelease(com.paypal.oslo.feature.starpay.api.CardNetwork cardNetwork) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNetwork, "");
        int i = com.paypal.oslo.feature.debitcard.pushprovisioning.domain.mapper.ProvisioningMetadataMapper.WhenMappings.$EnumSwitchMapping$1[cardNetwork.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.starpay.api.TokenServiceProvider.VISA;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.starpay.api.TokenServiceProvider.MASTERCARD;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand.MASTER_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardBrand.UNKNOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.starpay.api.CardNetwork.values().length];
            try {
                iArr2[com.paypal.oslo.feature.starpay.api.CardNetwork.VISA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.starpay.api.CardNetwork.MASTERCARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
