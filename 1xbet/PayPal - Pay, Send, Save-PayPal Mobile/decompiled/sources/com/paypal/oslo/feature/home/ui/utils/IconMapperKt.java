package com.paypal.oslo.feature.home.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/HomeIcon;", "Lcom/paypal/pds/core/Icon;", "toPdsIcon", "(Lcom/paypal/oslo/feature/home/domain/model/HomeIcon;)Lcom/paypal/pds/core/Icon;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IconMapperKt {
    public static final com.paypal.pds.core.Icon toPdsIcon(com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeIcon, "");
        switch (com.paypal.oslo.feature.home.ui.utils.IconMapperKt.WhenMappings.$EnumSwitchMapping$0[homeIcon.ordinal()]) {
            case 1:
                return com.paypal.pds.core.Icon.Trophy.INSTANCE;
            case 2:
                return com.paypal.pds.core.Icon.Info.INSTANCE;
            case 3:
                return com.paypal.pds.core.Icon.Contactless.INSTANCE;
            case 4:
                return com.paypal.pds.core.Icon.Wallet.INSTANCE;
            case 5:
                return com.paypal.pds.core.Icon.Alert.INSTANCE;
            case 6:
                return com.paypal.pds.core.Icon.Bank.INSTANCE;
            case 7:
                return com.paypal.pds.core.Icon.Card.INSTANCE;
            case 8:
                return com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE;
            case 9:
                return com.paypal.pds.core.Icon.Plus.INSTANCE;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.home.domain.model.HomeIcon.values().length];
            try {
                iArr[com.paypal.oslo.feature.home.domain.model.HomeIcon.Trophy.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.domain.model.HomeIcon.Information.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.domain.model.HomeIcon.Nfc.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.domain.model.HomeIcon.Wallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.domain.model.HomeIcon.Warning.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.domain.model.HomeIcon.Bank.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.domain.model.HomeIcon.Card.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.domain.model.HomeIcon.PayPal.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.home.domain.model.HomeIcon.Add.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
