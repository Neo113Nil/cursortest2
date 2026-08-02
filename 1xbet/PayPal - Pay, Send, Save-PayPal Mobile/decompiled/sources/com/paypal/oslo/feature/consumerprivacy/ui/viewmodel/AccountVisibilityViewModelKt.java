package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountVisibilityViewModelKt {
    public static final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData access$applyToggleToData(com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle simpleVisibilityToggle, boolean z) {
        com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData copy;
        com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData copy2;
        com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData copy3;
        com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData copy4;
        com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData copy5;
        com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData copy6;
        com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData copy7;
        com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData copy8;
        com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData copy9;
        switch (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.WhenMappings.$EnumSwitchMapping$0[simpleVisibilityToggle.ordinal()]) {
            case 1:
                copy = accountVisibilityData.copy((r32 & 1) != 0 ? accountVisibilityData.searchPolicy : null, (r32 & 2) != 0 ? accountVisibilityData.allowFindByIdentifiers : null, (r32 & 4) != 0 ? accountVisibilityData.allowPaymentRequests : null, (r32 & 8) != 0 ? accountVisibilityData.paymentRequestsFrom : null, (r32 & 16) != 0 ? accountVisibilityData.allowVenmoDiscovery : null, (r32 & 32) != 0 ? accountVisibilityData.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? accountVisibilityData.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? accountVisibilityData.allowSendMoneyByEmail : null, (r32 & 256) != 0 ? accountVisibilityData.allowSendMoneyByPhone : null, (r32 & 512) != 0 ? accountVisibilityData.allowSendMoneyByName : java.lang.Boolean.valueOf(z), (r32 & 1024) != 0 ? accountVisibilityData.allowSendMoneyByUsername : null, (r32 & 2048) != 0 ? accountVisibilityData.allowRequestMoneyByEmail : null, (r32 & 4096) != 0 ? accountVisibilityData.allowRequestMoneyByPhone : null, (r32 & 8192) != 0 ? accountVisibilityData.allowRequestMoneyByName : null, (r32 & 16384) != 0 ? accountVisibilityData.allowRequestMoneyByUsername : null);
                return copy;
            case 2:
                copy2 = accountVisibilityData.copy((r32 & 1) != 0 ? accountVisibilityData.searchPolicy : null, (r32 & 2) != 0 ? accountVisibilityData.allowFindByIdentifiers : null, (r32 & 4) != 0 ? accountVisibilityData.allowPaymentRequests : null, (r32 & 8) != 0 ? accountVisibilityData.paymentRequestsFrom : null, (r32 & 16) != 0 ? accountVisibilityData.allowVenmoDiscovery : null, (r32 & 32) != 0 ? accountVisibilityData.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? accountVisibilityData.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? accountVisibilityData.allowSendMoneyByEmail : java.lang.Boolean.valueOf(z), (r32 & 256) != 0 ? accountVisibilityData.allowSendMoneyByPhone : null, (r32 & 512) != 0 ? accountVisibilityData.allowSendMoneyByName : null, (r32 & 1024) != 0 ? accountVisibilityData.allowSendMoneyByUsername : null, (r32 & 2048) != 0 ? accountVisibilityData.allowRequestMoneyByEmail : null, (r32 & 4096) != 0 ? accountVisibilityData.allowRequestMoneyByPhone : null, (r32 & 8192) != 0 ? accountVisibilityData.allowRequestMoneyByName : null, (r32 & 16384) != 0 ? accountVisibilityData.allowRequestMoneyByUsername : null);
                return copy2;
            case 3:
                copy3 = accountVisibilityData.copy((r32 & 1) != 0 ? accountVisibilityData.searchPolicy : null, (r32 & 2) != 0 ? accountVisibilityData.allowFindByIdentifiers : null, (r32 & 4) != 0 ? accountVisibilityData.allowPaymentRequests : null, (r32 & 8) != 0 ? accountVisibilityData.paymentRequestsFrom : null, (r32 & 16) != 0 ? accountVisibilityData.allowVenmoDiscovery : null, (r32 & 32) != 0 ? accountVisibilityData.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? accountVisibilityData.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? accountVisibilityData.allowSendMoneyByEmail : null, (r32 & 256) != 0 ? accountVisibilityData.allowSendMoneyByPhone : java.lang.Boolean.valueOf(z), (r32 & 512) != 0 ? accountVisibilityData.allowSendMoneyByName : null, (r32 & 1024) != 0 ? accountVisibilityData.allowSendMoneyByUsername : null, (r32 & 2048) != 0 ? accountVisibilityData.allowRequestMoneyByEmail : null, (r32 & 4096) != 0 ? accountVisibilityData.allowRequestMoneyByPhone : null, (r32 & 8192) != 0 ? accountVisibilityData.allowRequestMoneyByName : null, (r32 & 16384) != 0 ? accountVisibilityData.allowRequestMoneyByUsername : null);
                return copy3;
            case 4:
                copy4 = accountVisibilityData.copy((r32 & 1) != 0 ? accountVisibilityData.searchPolicy : null, (r32 & 2) != 0 ? accountVisibilityData.allowFindByIdentifiers : null, (r32 & 4) != 0 ? accountVisibilityData.allowPaymentRequests : null, (r32 & 8) != 0 ? accountVisibilityData.paymentRequestsFrom : null, (r32 & 16) != 0 ? accountVisibilityData.allowVenmoDiscovery : null, (r32 & 32) != 0 ? accountVisibilityData.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? accountVisibilityData.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? accountVisibilityData.allowSendMoneyByEmail : null, (r32 & 256) != 0 ? accountVisibilityData.allowSendMoneyByPhone : null, (r32 & 512) != 0 ? accountVisibilityData.allowSendMoneyByName : null, (r32 & 1024) != 0 ? accountVisibilityData.allowSendMoneyByUsername : java.lang.Boolean.valueOf(z), (r32 & 2048) != 0 ? accountVisibilityData.allowRequestMoneyByEmail : null, (r32 & 4096) != 0 ? accountVisibilityData.allowRequestMoneyByPhone : null, (r32 & 8192) != 0 ? accountVisibilityData.allowRequestMoneyByName : null, (r32 & 16384) != 0 ? accountVisibilityData.allowRequestMoneyByUsername : null);
                return copy4;
            case 5:
                copy5 = accountVisibilityData.copy((r32 & 1) != 0 ? accountVisibilityData.searchPolicy : null, (r32 & 2) != 0 ? accountVisibilityData.allowFindByIdentifiers : null, (r32 & 4) != 0 ? accountVisibilityData.allowPaymentRequests : null, (r32 & 8) != 0 ? accountVisibilityData.paymentRequestsFrom : null, (r32 & 16) != 0 ? accountVisibilityData.allowVenmoDiscovery : null, (r32 & 32) != 0 ? accountVisibilityData.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? accountVisibilityData.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? accountVisibilityData.allowSendMoneyByEmail : null, (r32 & 256) != 0 ? accountVisibilityData.allowSendMoneyByPhone : null, (r32 & 512) != 0 ? accountVisibilityData.allowSendMoneyByName : null, (r32 & 1024) != 0 ? accountVisibilityData.allowSendMoneyByUsername : null, (r32 & 2048) != 0 ? accountVisibilityData.allowRequestMoneyByEmail : null, (r32 & 4096) != 0 ? accountVisibilityData.allowRequestMoneyByPhone : null, (r32 & 8192) != 0 ? accountVisibilityData.allowRequestMoneyByName : java.lang.Boolean.valueOf(z), (r32 & 16384) != 0 ? accountVisibilityData.allowRequestMoneyByUsername : null);
                return copy5;
            case 6:
                copy6 = accountVisibilityData.copy((r32 & 1) != 0 ? accountVisibilityData.searchPolicy : null, (r32 & 2) != 0 ? accountVisibilityData.allowFindByIdentifiers : null, (r32 & 4) != 0 ? accountVisibilityData.allowPaymentRequests : null, (r32 & 8) != 0 ? accountVisibilityData.paymentRequestsFrom : null, (r32 & 16) != 0 ? accountVisibilityData.allowVenmoDiscovery : null, (r32 & 32) != 0 ? accountVisibilityData.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? accountVisibilityData.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? accountVisibilityData.allowSendMoneyByEmail : null, (r32 & 256) != 0 ? accountVisibilityData.allowSendMoneyByPhone : null, (r32 & 512) != 0 ? accountVisibilityData.allowSendMoneyByName : null, (r32 & 1024) != 0 ? accountVisibilityData.allowSendMoneyByUsername : null, (r32 & 2048) != 0 ? accountVisibilityData.allowRequestMoneyByEmail : java.lang.Boolean.valueOf(z), (r32 & 4096) != 0 ? accountVisibilityData.allowRequestMoneyByPhone : null, (r32 & 8192) != 0 ? accountVisibilityData.allowRequestMoneyByName : null, (r32 & 16384) != 0 ? accountVisibilityData.allowRequestMoneyByUsername : null);
                return copy6;
            case 7:
                copy7 = accountVisibilityData.copy((r32 & 1) != 0 ? accountVisibilityData.searchPolicy : null, (r32 & 2) != 0 ? accountVisibilityData.allowFindByIdentifiers : null, (r32 & 4) != 0 ? accountVisibilityData.allowPaymentRequests : null, (r32 & 8) != 0 ? accountVisibilityData.paymentRequestsFrom : null, (r32 & 16) != 0 ? accountVisibilityData.allowVenmoDiscovery : null, (r32 & 32) != 0 ? accountVisibilityData.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? accountVisibilityData.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? accountVisibilityData.allowSendMoneyByEmail : null, (r32 & 256) != 0 ? accountVisibilityData.allowSendMoneyByPhone : null, (r32 & 512) != 0 ? accountVisibilityData.allowSendMoneyByName : null, (r32 & 1024) != 0 ? accountVisibilityData.allowSendMoneyByUsername : null, (r32 & 2048) != 0 ? accountVisibilityData.allowRequestMoneyByEmail : null, (r32 & 4096) != 0 ? accountVisibilityData.allowRequestMoneyByPhone : java.lang.Boolean.valueOf(z), (r32 & 8192) != 0 ? accountVisibilityData.allowRequestMoneyByName : null, (r32 & 16384) != 0 ? accountVisibilityData.allowRequestMoneyByUsername : null);
                return copy7;
            case 8:
                copy8 = accountVisibilityData.copy((r32 & 1) != 0 ? accountVisibilityData.searchPolicy : null, (r32 & 2) != 0 ? accountVisibilityData.allowFindByIdentifiers : null, (r32 & 4) != 0 ? accountVisibilityData.allowPaymentRequests : null, (r32 & 8) != 0 ? accountVisibilityData.paymentRequestsFrom : null, (r32 & 16) != 0 ? accountVisibilityData.allowVenmoDiscovery : null, (r32 & 32) != 0 ? accountVisibilityData.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? accountVisibilityData.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? accountVisibilityData.allowSendMoneyByEmail : null, (r32 & 256) != 0 ? accountVisibilityData.allowSendMoneyByPhone : null, (r32 & 512) != 0 ? accountVisibilityData.allowSendMoneyByName : null, (r32 & 1024) != 0 ? accountVisibilityData.allowSendMoneyByUsername : null, (r32 & 2048) != 0 ? accountVisibilityData.allowRequestMoneyByEmail : null, (r32 & 4096) != 0 ? accountVisibilityData.allowRequestMoneyByPhone : null, (r32 & 8192) != 0 ? accountVisibilityData.allowRequestMoneyByName : null, (r32 & 16384) != 0 ? accountVisibilityData.allowRequestMoneyByUsername : java.lang.Boolean.valueOf(z));
                return copy8;
            case 9:
                copy9 = accountVisibilityData.copy((r32 & 1) != 0 ? accountVisibilityData.searchPolicy : null, (r32 & 2) != 0 ? accountVisibilityData.allowFindByIdentifiers : null, (r32 & 4) != 0 ? accountVisibilityData.allowPaymentRequests : null, (r32 & 8) != 0 ? accountVisibilityData.paymentRequestsFrom : null, (r32 & 16) != 0 ? accountVisibilityData.allowVenmoDiscovery : java.lang.Boolean.valueOf(z), (r32 & 32) != 0 ? accountVisibilityData.allowFindViaPayPalMe : null, (r32 & 64) != 0 ? accountVisibilityData.paypalMePersonalProfileId : null, (r32 & 128) != 0 ? accountVisibilityData.allowSendMoneyByEmail : null, (r32 & 256) != 0 ? accountVisibilityData.allowSendMoneyByPhone : null, (r32 & 512) != 0 ? accountVisibilityData.allowSendMoneyByName : null, (r32 & 1024) != 0 ? accountVisibilityData.allowSendMoneyByUsername : null, (r32 & 2048) != 0 ? accountVisibilityData.allowRequestMoneyByEmail : null, (r32 & 4096) != 0 ? accountVisibilityData.allowRequestMoneyByPhone : null, (r32 & 8192) != 0 ? accountVisibilityData.allowRequestMoneyByName : null, (r32 & 16384) != 0 ? accountVisibilityData.allowRequestMoneyByUsername : null);
                return copy9;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final /* synthetic */ java.lang.String access$getErrorMessage(com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError dataResultError) {
        if (dataResultError instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.GraphQLError) {
            return ((com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.GraphQLError) dataResultError).getMessage();
        }
        if (dataResultError instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.HttpError) {
            com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.HttpError httpError = (com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.HttpError) dataResultError;
            java.lang.String message = httpError.getMessage();
            return message == null ? "HTTP Error ".concat(java.lang.String.valueOf(httpError.getCode())) : message;
        }
        if (dataResultError instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.NoInternet) {
            return com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR;
        }
        if (dataResultError instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown) {
            return "Unknown error occurred";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType access$mapIndexToPaymentRequestsFrom(int i) {
        if (i == 0) {
            return com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType.EVERYONE;
        }
        if (i != 1) {
            return null;
        }
        return com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType.CONTACTS_ONLY;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.values().length];
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.SEND_MONEY_BY_NAME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.SEND_MONEY_BY_EMAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.SEND_MONEY_BY_PHONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.SEND_MONEY_BY_USERNAME.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.REQUEST_MONEY_BY_NAME.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.REQUEST_MONEY_BY_EMAIL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.REQUEST_MONEY_BY_PHONE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.REQUEST_MONEY_BY_USERNAME.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.VENMO_DISCOVERY.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
