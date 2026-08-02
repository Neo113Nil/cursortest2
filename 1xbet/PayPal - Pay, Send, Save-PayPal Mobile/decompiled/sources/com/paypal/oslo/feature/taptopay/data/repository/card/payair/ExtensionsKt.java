package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/payair/model/CompleteTokenizeData$AuthenticationMethod;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;", "toIdentityVerificationMethod", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExtensionsKt {
    public static final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> toIdentityVerificationMethod(java.util.List<com.payair.model.CompleteTokenizeData.AuthenticationMethod> list) {
        java.lang.String str;
        com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod appToApp;
        com.payair.model.ProductConfig.IssuerMobileApp.OpenIssuerMobileAppAndroidIntent openIssuerMobileAppAndroidIntent;
        java.lang.String action;
        com.payair.model.ProductConfig.IssuerMobileApp.OpenIssuerMobileAppAndroidIntent openIssuerMobileAppAndroidIntent2;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (list != null) {
            for (com.payair.model.CompleteTokenizeData.AuthenticationMethod authenticationMethod : list) {
                switch (com.paypal.oslo.feature.taptopay.data.repository.card.payair.ExtensionsKt.WhenMappings.$EnumSwitchMapping$0[authenticationMethod.getType().ordinal()]) {
                    case 1:
                        com.payair.model.ProductConfig.IssuerMobileApp issuerMobileApp = authenticationMethod.getIssuerMobileApp();
                        java.lang.String str2 = "Unknown";
                        if (issuerMobileApp == null || (openIssuerMobileAppAndroidIntent2 = issuerMobileApp.getOpenIssuerMobileAppAndroidIntent()) == null || (str = openIssuerMobileAppAndroidIntent2.getPackageName()) == null) {
                            str = "Unknown";
                        }
                        com.payair.model.ProductConfig.IssuerMobileApp issuerMobileApp2 = authenticationMethod.getIssuerMobileApp();
                        if (issuerMobileApp2 != null && (openIssuerMobileAppAndroidIntent = issuerMobileApp2.getOpenIssuerMobileAppAndroidIntent()) != null && (action = openIssuerMobileAppAndroidIntent.getAction()) != null) {
                            str2 = action;
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Using issuer mobile app for identity verification", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.visa.cbp.ConsumerInfo.setSignature, str), kotlin.TuplesKt.to("action", str2)), null, 4, null);
                        appToApp = new com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.AppToApp(str2, str);
                        break;
                    case 2:
                        java.lang.String id = authenticationMethod.getId();
                        java.lang.String value = authenticationMethod.getValue();
                        appToApp = new com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpSms(id, value != null ? value : "");
                        break;
                    case 3:
                        java.lang.String id2 = authenticationMethod.getId();
                        java.lang.String value2 = authenticationMethod.getValue();
                        appToApp = new com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.OtpEmail(id2, value2 != null ? value2 : "");
                        break;
                    case 4:
                        java.lang.String id3 = authenticationMethod.getId();
                        java.lang.String value3 = authenticationMethod.getValue();
                        appToApp = new com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.CallCustomerService(id3, value3 != null ? value3 : "");
                        break;
                    case 5:
                        java.lang.String id4 = authenticationMethod.getId();
                        java.lang.String value4 = authenticationMethod.getValue();
                        appToApp = new com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod.Emv3ds(id4, value4 != null ? value4 : "");
                        break;
                    case 6:
                        appToApp = null;
                        break;
                    default:
                        throw new kotlin.NoWhenBranchMatchedException();
                }
                if (appToApp != null) {
                    createListBuilder.add(appToApp);
                }
            }
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.values().length];
            try {
                iArr[com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.CARDHOLDER_TO_USE_ISSUER_MOBILE_APP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.TEXT_TO_CARDHOLDER_NUMBER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.EMAIL_TO_CARDHOLDER_ADDRESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.CARDHOLDER_TO_CALL_MANNED_NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.THREE_D_SECURE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.payair.model.CompleteTokenizeData.AuthenticationMethod.AuthenticationMethodType.UNKNOWN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
