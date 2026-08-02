package com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "", "Lcom/paypal/pds/core/Icon;", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ILcom/paypal/pds/core/Icon;II)V", "icon", "Lcom/paypal/pds/core/Icon;", "getIcon", "()Lcom/paypal/pds/core/Icon;", "title", com.visa.cbp.getEncExpo.warmup, "getTitle", "()I", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "getDescription", "NetworkError", "GenericError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ErrorStateType {
    public static final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType GenericError;
    public static final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType NetworkError;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType[] getHighSpeedVideoFpsRanges;
    private final int description;
    private final com.paypal.pds.core.Icon icon;
    private final int title;

    private ErrorStateType(java.lang.String str, int i, com.paypal.pds.core.Icon icon, int i2, int i3) {
        this.icon = icon;
        this.title = i2;
        this.description = i3;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getDescription() {
        return this.description;
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType = new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType("NetworkError", 0, com.paypal.pds.core.Icon.Connection.INSTANCE, com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_internet_error_screen_title, com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_internet_error_screen_message);
        NetworkError = errorStateType;
        com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType2 = new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType("GenericError", 1, com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_generic_error_screen_title, com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_generic_error_screen_message);
        GenericError = errorStateType2;
        com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType[] errorStateTypeArr = {errorStateType, errorStateType2};
        getHighSpeedVideoFpsRanges = errorStateTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(errorStateTypeArr);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
