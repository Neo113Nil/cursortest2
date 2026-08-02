package com.paypal.oslo.feature.balance.common.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0086\u0001\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001!B?\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b("}, d2 = {"Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum;", "", "", "p0", "p1", "Lcom/paypal/pds/components/AvatarSource;", "p2", "p3", "Lcom/paypal/pds/components/ButtonStyle;", "p4", "p5", "<init>", "(Ljava/lang/String;IIILcom/paypal/pds/components/AvatarSource;ILcom/paypal/pds/components/ButtonStyle;Ljava/lang/Integer;)V", "headerTextResId", com.visa.cbp.getEncExpo.warmup, "getHeaderTextResId", "()I", "bodyTextResId", "getBodyTextResId", "iconAvatarSource", "Lcom/paypal/pds/components/AvatarSource;", "getIconAvatarSource", "()Lcom/paypal/pds/components/AvatarSource;", "primaryButtonTextResId", "getPrimaryButtonTextResId", "primaryButtonStyle", "Lcom/paypal/pds/components/ButtonStyle;", "getPrimaryButtonStyle", "()Lcom/paypal/pds/components/ButtonStyle;", "secondaryButtonTextResId", "Ljava/lang/Integer;", "getSecondaryButtonTextResId", "()Ljava/lang/Integer;", "Companion", "NSF", "FI_DECLINED", "GENERIC_AUTO_RELOAD_ERROR", "FUNDS_ERROR", com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, "GENERIC_API_ERROR", "RISK_DECLINED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceErrorBottomSheetEnum {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.Companion INSTANCE;
    public static final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum FI_DECLINED;
    public static final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum FUNDS_ERROR;
    public static final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum GENERIC_API_ERROR;
    public static final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum GENERIC_AUTO_RELOAD_ERROR;
    public static final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum GENERIC_ERROR;
    public static final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum NSF;
    public static final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum RISK_DECLINED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum[] getHighSpeedVideoFpsRanges;
    private final int bodyTextResId;
    private final int headerTextResId;
    private final com.paypal.pds.components.AvatarSource iconAvatarSource;
    private final com.paypal.pds.components.ButtonStyle primaryButtonStyle;
    private final int primaryButtonTextResId;
    private final java.lang.Integer secondaryButtonTextResId;

    private BalanceErrorBottomSheetEnum(java.lang.String str, int i, int i2, int i3, com.paypal.pds.components.AvatarSource avatarSource, int i4, com.paypal.pds.components.ButtonStyle buttonStyle, java.lang.Integer num) {
        this.headerTextResId = i2;
        this.bodyTextResId = i3;
        this.iconAvatarSource = avatarSource;
        this.primaryButtonTextResId = i4;
        this.primaryButtonStyle = buttonStyle;
        this.secondaryButtonTextResId = num;
    }

    public final int getHeaderTextResId() {
        return this.headerTextResId;
    }

    public final int getBodyTextResId() {
        return this.bodyTextResId;
    }

    public final com.paypal.pds.components.AvatarSource getIconAvatarSource() {
        return this.iconAvatarSource;
    }

    public final int getPrimaryButtonTextResId() {
        return this.primaryButtonTextResId;
    }

    /* synthetic */ BalanceErrorBottomSheetEnum(java.lang.String str, int i, int i2, int i3, com.paypal.pds.components.AvatarSource avatarSource, int i4, com.paypal.pds.components.ButtonStyle buttonStyle, java.lang.Integer num, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, avatarSource, i4, (i5 & 16) != 0 ? com.paypal.pds.components.ButtonStyle.Primary.INSTANCE : buttonStyle, (i5 & 32) != 0 ? null : num);
    }

    public final com.paypal.pds.components.ButtonStyle getPrimaryButtonStyle() {
        return this.primaryButtonStyle;
    }

    public final java.lang.Integer getSecondaryButtonTextResId() {
        return this.secondaryButtonTextResId;
    }

    static {
        com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum = new com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum("NSF", 0, com.paypal.oslo.feature.balance.R.string.feature_balance_error_transfer_failed_title, com.paypal.oslo.feature.balance.R.string.feature_balance_error_transfer_failed_description, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource(), com.paypal.oslo.feature.balance.R.string.feature_balance_error_transfer_failed_button, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_error_not_now), 16, null);
        NSF = balanceErrorBottomSheetEnum;
        com.paypal.pds.components.ButtonStyle buttonStyle = null;
        int i = 16;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum2 = new com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum("FI_DECLINED", 1, com.paypal.oslo.feature.balance.R.string.feature_balance_error_transfer_failed_title, com.paypal.oslo.feature.balance.R.string.feature_balance_error_fi_declined_description, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource(), com.paypal.oslo.feature.balance.R.string.feature_balance_error_fi_declined_button, buttonStyle, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_error_not_now), i, defaultConstructorMarker);
        FI_DECLINED = balanceErrorBottomSheetEnum2;
        com.paypal.pds.components.ButtonStyle buttonStyle2 = null;
        int i2 = 16;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker2 = null;
        com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum3 = new com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum("GENERIC_AUTO_RELOAD_ERROR", 2, com.paypal.oslo.feature.balance.R.string.feature_balance_error_transfer_failed_title, com.paypal.oslo.feature.balance.R.string.feature_balance_error_generic_reload_description, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource(), com.paypal.oslo.feature.balance.R.string.feature_balance_error_generic_reload_button, buttonStyle2, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_error_not_now), i2, defaultConstructorMarker2);
        GENERIC_AUTO_RELOAD_ERROR = balanceErrorBottomSheetEnum3;
        com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum4 = new com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum("FUNDS_ERROR", 3, com.paypal.oslo.feature.balance.R.string.feature_balance_error_funds_title, com.paypal.oslo.feature.balance.R.string.feature_balance_error_funds_description, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource(), com.paypal.oslo.feature.balance.R.string.feature_balance_error_funds_button, buttonStyle, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_error_not_now), i, defaultConstructorMarker);
        FUNDS_ERROR = balanceErrorBottomSheetEnum4;
        com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum5 = new com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, 4, com.paypal.oslo.feature.balance.R.string.feature_balance_error_screen_generic_title, com.paypal.oslo.feature.balance.R.string.feature_balance_error_screen_generic_subtitle, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource(), com.paypal.oslo.feature.balance.R.string.feature_balance_error_screen_reload_button, buttonStyle2, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_error_not_now), i2, defaultConstructorMarker2);
        GENERIC_ERROR = balanceErrorBottomSheetEnum5;
        com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum6 = new com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum("GENERIC_API_ERROR", 5, com.paypal.oslo.feature.balance.R.string.feature_balance_error_generic_title, com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_generic_api_error_description, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource(), com.paypal.oslo.feature.balance.R.string.feature_balance_error_retry_button, buttonStyle, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_error_not_now), i, defaultConstructorMarker);
        GENERIC_API_ERROR = balanceErrorBottomSheetEnum6;
        com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum7 = new com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum("RISK_DECLINED", 6, com.paypal.oslo.feature.balance.R.string.feature_balance_error_risk_title, com.paypal.oslo.feature.balance.R.string.feature_balance_error_risk_description, com.paypal.pds.core.Icon.Warning.INSTANCE.getAvatarSource(), com.paypal.oslo.feature.balance.R.string.feature_balance_error_risk_button, buttonStyle2, null, 48, defaultConstructorMarker2);
        RISK_DECLINED = balanceErrorBottomSheetEnum7;
        com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum[] balanceErrorBottomSheetEnumArr = {balanceErrorBottomSheetEnum, balanceErrorBottomSheetEnum2, balanceErrorBottomSheetEnum3, balanceErrorBottomSheetEnum4, balanceErrorBottomSheetEnum5, balanceErrorBottomSheetEnum6, balanceErrorBottomSheetEnum7};
        getHighSpeedVideoFpsRanges = balanceErrorBottomSheetEnumArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(balanceErrorBottomSheetEnumArr);
        INSTANCE = new com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum$Companion;", "", "<init>", "()V", "", "errorType", "Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum fromString(java.lang.String errorType) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj).name(), errorType)) {
                    break;
                }
            }
            com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum = (com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj;
            return balanceErrorBottomSheetEnum == null ? com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.GENERIC_ERROR : balanceErrorBottomSheetEnum;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum[] values() {
        return (com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
