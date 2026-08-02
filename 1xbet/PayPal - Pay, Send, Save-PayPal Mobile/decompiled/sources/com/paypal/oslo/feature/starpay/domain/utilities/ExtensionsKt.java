package com.paypal.oslo.feature.starpay.domain.utilities;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u00020\u0000*\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u000bH\u0000¢\u0006\u0004\b\t\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"", "Lcom/paypal/oslo/feature/starpay/api/TokenState;", "toTokenState", "(I)Lcom/paypal/oslo/feature/starpay/api/TokenState;", "Lcom/google/android/gms/tapandpay/issuer/TokenInfo;", "Lcom/paypal/oslo/feature/starpay/api/Token;", "mapToken", "(Lcom/google/android/gms/tapandpay/issuer/TokenInfo;)Lcom/paypal/oslo/feature/starpay/api/Token;", "Lcom/paypal/oslo/feature/starpay/api/TokenServiceProvider;", "toInt", "(Lcom/paypal/oslo/feature/starpay/api/TokenServiceProvider;)I", "Lcom/paypal/oslo/feature/starpay/api/CardNetwork;", "(Lcom/paypal/oslo/feature/starpay/api/CardNetwork;)I", "Lcom/paypal/oslo/feature/starpay/api/ProvisioningMetadata;", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "createPushTokenizeRequest", "(Lcom/paypal/oslo/feature/starpay/api/ProvisioningMetadata;)Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "UnknownTokenProvider", com.visa.cbp.getEncExpo.warmup}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExtensionsKt {
    public static final int UnknownTokenProvider = -1;

    public static final com.paypal.oslo.feature.starpay.api.TokenState toTokenState(int i) {
        if (i == 2) {
            return com.paypal.oslo.feature.starpay.api.TokenState.ACTIVATING;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.starpay.api.TokenState.REQUIRES_ACTIVATION;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.starpay.api.TokenState.SUSPENDED;
        }
        if (i == 5) {
            return com.paypal.oslo.feature.starpay.api.TokenState.ACTIVE;
        }
        return com.paypal.oslo.feature.starpay.api.TokenState.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.starpay.api.Token mapToken(com.google.android.gms.tapandpay.issuer.TokenInfo tokenInfo) {
        if (tokenInfo == null) {
            return null;
        }
        java.lang.String issuerTokenId = tokenInfo.getIssuerTokenId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(issuerTokenId, "");
        java.lang.String fpanLastFour = tokenInfo.getFpanLastFour();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fpanLastFour, "");
        java.lang.String dpanLastFour = tokenInfo.getDpanLastFour();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dpanLastFour, "");
        boolean isDefaultToken = tokenInfo.getIsDefaultToken();
        java.lang.String issuerName = tokenInfo.getIssuerName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(issuerName, "");
        return new com.paypal.oslo.feature.starpay.api.Token(issuerTokenId, fpanLastFour, dpanLastFour, isDefaultToken, issuerName, toTokenState(tokenInfo.getTokenState()));
    }

    public static final int toInt(com.paypal.oslo.feature.starpay.api.TokenServiceProvider tokenServiceProvider) {
        int i = tokenServiceProvider == null ? -1 : com.paypal.oslo.feature.starpay.domain.utilities.ExtensionsKt.WhenMappings.$EnumSwitchMapping$0[tokenServiceProvider.ordinal()];
        if (i != 1) {
            return i != 2 ? -1 : 4;
        }
        return 3;
    }

    public static final int toInt(com.paypal.oslo.feature.starpay.api.CardNetwork cardNetwork) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNetwork, "");
        int i = com.paypal.oslo.feature.starpay.domain.utilities.ExtensionsKt.WhenMappings.$EnumSwitchMapping$1[cardNetwork.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.google.android.gms.tapandpay.issuer.PushTokenizeRequest createPushTokenizeRequest(com.paypal.oslo.feature.starpay.api.ProvisioningMetadata provisioningMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisioningMetadata, "");
        com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder builder = new com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder();
        byte[] bytes = provisioningMetadata.getOpaquePaymentCard().getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder tokenServiceProvider = builder.setOpaquePaymentCard(bytes).setDisplayName(provisioningMetadata.getDisplayName()).setNetwork(toInt(provisioningMetadata.getNetwork())).setLastDigits(provisioningMetadata.getFpanLastFour()).setTokenServiceProvider(toInt(provisioningMetadata.getTokenServiceProvider()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tokenServiceProvider, "");
        com.paypal.oslo.feature.starpay.api.UserAddress userAddress = provisioningMetadata.getUserAddress();
        if (userAddress != null) {
            com.google.android.gms.tapandpay.issuer.UserAddress.Builder newBuilder = com.google.android.gms.tapandpay.issuer.UserAddress.newBuilder();
            newBuilder.setName(userAddress.getName());
            newBuilder.setAddress1(userAddress.getAddress1());
            newBuilder.setAddress2(userAddress.getAddress2());
            java.lang.String administrativeArea = userAddress.getAdministrativeArea();
            if (administrativeArea == null) {
                administrativeArea = "";
            }
            newBuilder.setAdministrativeArea(administrativeArea);
            java.lang.String locality = userAddress.getLocality();
            if (locality == null) {
                locality = "";
            }
            newBuilder.setLocality(locality);
            newBuilder.setCountryCode(userAddress.getCountryCode());
            newBuilder.setPostalCode(userAddress.getPostalCode());
            java.lang.String phoneNumber = userAddress.getPhoneNumber();
            if (phoneNumber == null) {
                phoneNumber = "";
            }
            newBuilder.setPhoneNumber(phoneNumber);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "");
            tokenServiceProvider.setUserAddress(newBuilder.build());
        }
        com.google.android.gms.tapandpay.issuer.PushTokenizeRequest build = tokenServiceProvider.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.starpay.api.TokenServiceProvider.values().length];
            try {
                iArr[com.paypal.oslo.feature.starpay.api.TokenServiceProvider.MASTERCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.starpay.api.TokenServiceProvider.VISA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.starpay.api.CardNetwork.values().length];
            try {
                iArr2[com.paypal.oslo.feature.starpay.api.CardNetwork.MASTERCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.starpay.api.CardNetwork.VISA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
