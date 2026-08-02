package com.paypal.oslo.feature.paypalassistant.ui.token;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/ui/token/PdsButtonResolver;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonSize;", "buttonSize", "Lcom/paypal/pds/components/ButtonSize;", "findButtonSize", "(Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonSize;)Lcom/paypal/pds/components/ButtonSize;", "Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonStyle;", "buttonStyle", "Lcom/paypal/pds/components/ButtonStyle;", "findButtonStyle", "(Lcom/paypal/oslo/feature/paypalassistant/domain/model/ButtonStyle;)Lcom/paypal/pds/components/ButtonStyle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdsButtonResolver {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.paypalassistant.ui.token.PdsButtonResolver INSTANCE = new com.paypal.oslo.feature.paypalassistant.ui.token.PdsButtonResolver();

    private PdsButtonResolver() {
    }

    public final com.paypal.pds.components.ButtonSize findButtonSize(com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize buttonSize) {
        int i = buttonSize == null ? -1 : com.paypal.oslo.feature.paypalassistant.ui.token.PdsButtonResolver.WhenMappings.$EnumSwitchMapping$0[buttonSize.ordinal()];
        if (i == -1 || i == 1) {
            return null;
        }
        if (i == 2) {
            return com.paypal.pds.components.ButtonSize.Large.INSTANCE;
        }
        if (i == 3) {
            return com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.pds.components.ButtonSize.Small.INSTANCE;
    }

    public final com.paypal.pds.components.ButtonStyle findButtonStyle(com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle buttonStyle) {
        switch (buttonStyle == null ? -1 : com.paypal.oslo.feature.paypalassistant.ui.token.PdsButtonResolver.WhenMappings.$EnumSwitchMapping$1[buttonStyle.ordinal()]) {
            case -1:
            case 1:
                return null;
            case 0:
            default:
                throw new kotlin.NoWhenBranchMatchedException();
            case 2:
                return com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            case 3:
                return com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            case 4:
                return com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            case 5:
                return com.paypal.pds.components.ButtonStyle.Overlay.INSTANCE;
            case 6:
                return com.paypal.pds.components.ButtonStyle.TertiaryContained.INSTANCE;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize.values().length];
            try {
                iArr[com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize.LARGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize.MEDIUM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.paypalassistant.domain.model.ButtonSize.SMALL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle.values().length];
            try {
                iArr2[com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle.PRIMARY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle.SECONDARY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle.TERTIARY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle.OVERLAY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.paypalassistant.domain.model.ButtonStyle.TERTIARY_CONTAINED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
