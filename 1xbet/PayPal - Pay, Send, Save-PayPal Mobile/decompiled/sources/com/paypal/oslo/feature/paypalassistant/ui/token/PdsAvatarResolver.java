package com.paypal.oslo.feature.paypalassistant.ui.token;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/ui/token/PdsAvatarResolver;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/paypalassistant/domain/model/AvatarSize;", "avatarSize", "Lcom/paypal/pds/components/AvatarSize;", "findAvatarSize", "(Lcom/paypal/oslo/feature/paypalassistant/domain/model/AvatarSize;)Lcom/paypal/pds/components/AvatarSize;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdsAvatarResolver {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.paypalassistant.ui.token.PdsAvatarResolver INSTANCE = new com.paypal.oslo.feature.paypalassistant.ui.token.PdsAvatarResolver();

    private PdsAvatarResolver() {
    }

    public final com.paypal.pds.components.AvatarSize findAvatarSize(com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize avatarSize) {
        switch (avatarSize == null ? -1 : com.paypal.oslo.feature.paypalassistant.ui.token.PdsAvatarResolver.WhenMappings.$EnumSwitchMapping$0[avatarSize.ordinal()]) {
            case -1:
            case 1:
                return null;
            case 0:
            default:
                throw new kotlin.NoWhenBranchMatchedException();
            case 2:
                return com.paypal.pds.components.AvatarSize.XSmall.INSTANCE;
            case 3:
                return com.paypal.pds.components.AvatarSize.Small.INSTANCE;
            case 4:
                return com.paypal.pds.components.AvatarSize.Medium.INSTANCE;
            case 5:
                return com.paypal.pds.components.AvatarSize.Large.INSTANCE;
            case 6:
                return com.paypal.pds.components.AvatarSize.XLarge.INSTANCE;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize.values().length];
            try {
                iArr[com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize.EXTRA_SMALL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize.SMALL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize.MEDIUM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize.LARGE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.paypalassistant.domain.model.AvatarSize.EXTRA_LARGE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
