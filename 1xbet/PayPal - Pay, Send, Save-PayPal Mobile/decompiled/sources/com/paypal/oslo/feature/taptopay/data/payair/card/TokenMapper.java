package com.paypal.oslo.feature.taptopay.data.payair.card;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/card/TokenMapper;", "Lcom/paypal/oslo/feature/taptopay/domain/core/Mapper;", "Lcom/payair/model/TokenDetailsWithAsset;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "Lkotlin/Function1;", "", "", "isDefault", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "input", "map", "(Lcom/payair/model/TokenDetailsWithAsset;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TokenMapper implements com.paypal.oslo.feature.taptopay.domain.core.Mapper<com.payair.model.TokenDetailsWithAsset, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public TokenMapper(kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = function1;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.core.Mapper
    public final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard map(com.payair.model.TokenDetailsWithAsset input) {
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String networkTokenReference = input.getTokenDetails().getNetworkTokenReference();
        java.lang.String accountPanSuffix = input.getTokenDetails().getTokenInfo().getAccountPanSuffix();
        java.lang.String str = accountPanSuffix == null ? "" : accountPanSuffix;
        java.lang.String tokenPanSuffix = input.getTokenDetails().getTokenInfo().getTokenPanSuffix();
        java.lang.String str2 = tokenPanSuffix == null ? "" : tokenPanSuffix;
        java.lang.String tokenExpiryMonth = input.getTokenDetails().getTokenInfo().getTokenExpiryMonth();
        if (tokenExpiryMonth == null) {
            tokenExpiryMonth = "";
        }
        java.lang.String tokenExpiryYear = input.getTokenDetails().getTokenInfo().getTokenExpiryYear();
        java.lang.String str3 = tokenExpiryYear != null ? tokenExpiryYear : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(tokenExpiryMonth);
        sb.append(str3);
        java.lang.String obj = sb.toString();
        boolean booleanValue = this.getHighSpeedVideoSizes.invoke(input.getTokenDetails().getNetworkTokenReference()).booleanValue();
        switch (com.paypal.oslo.feature.taptopay.data.payair.card.TokenMapper.WhenMappings.$EnumSwitchMapping$0[input.getTokenDetails().getTokenStatus().ordinal()]) {
            case 1:
                status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Active;
                break;
            case 2:
                status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Suspended;
                break;
            case 3:
                status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.PendingActivation;
                break;
            case 4:
            case 5:
            case 6:
                status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Expired;
                break;
            case 7:
                status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Unknown;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status2 = status;
        com.payair.model.Asset asset = input.getAsset();
        return new com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard(networkTokenReference, str, str2, obj, booleanValue, status2, asset != null ? com.payair.model.AssetKt.getByteFormatData(asset) : null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.payair.model.TokenStatus.values().length];
            try {
                iArr[com.payair.model.TokenStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.payair.model.TokenStatus.SUSPENDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.payair.model.TokenStatus.INACTIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.payair.model.TokenStatus.DEACTIVATED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.payair.model.TokenStatus.DECLINED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.payair.model.TokenStatus.DELETED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.payair.model.TokenStatus.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
