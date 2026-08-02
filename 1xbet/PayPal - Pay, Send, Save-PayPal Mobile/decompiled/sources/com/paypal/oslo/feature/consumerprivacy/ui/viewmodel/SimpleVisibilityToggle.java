package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/SimpleVisibilityToggle;", "", "<init>", "(Ljava/lang/String;I)V", "SEND_MONEY_BY_NAME", "SEND_MONEY_BY_EMAIL", "SEND_MONEY_BY_PHONE", "SEND_MONEY_BY_USERNAME", "REQUEST_MONEY_BY_NAME", "REQUEST_MONEY_BY_EMAIL", "REQUEST_MONEY_BY_PHONE", "REQUEST_MONEY_BY_USERNAME", "VENMO_DISCOVERY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SimpleVisibilityToggle {
    public static final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle REQUEST_MONEY_BY_EMAIL;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle REQUEST_MONEY_BY_NAME;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle REQUEST_MONEY_BY_PHONE;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle REQUEST_MONEY_BY_USERNAME;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle SEND_MONEY_BY_EMAIL;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle SEND_MONEY_BY_NAME;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle SEND_MONEY_BY_PHONE;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle SEND_MONEY_BY_USERNAME;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle VENMO_DISCOVERY;
    private static final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SimpleVisibilityToggle(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle simpleVisibilityToggle = new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle("SEND_MONEY_BY_NAME", 0);
        SEND_MONEY_BY_NAME = simpleVisibilityToggle;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle simpleVisibilityToggle2 = new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle("SEND_MONEY_BY_EMAIL", 1);
        SEND_MONEY_BY_EMAIL = simpleVisibilityToggle2;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle simpleVisibilityToggle3 = new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle("SEND_MONEY_BY_PHONE", 2);
        SEND_MONEY_BY_PHONE = simpleVisibilityToggle3;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle simpleVisibilityToggle4 = new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle("SEND_MONEY_BY_USERNAME", 3);
        SEND_MONEY_BY_USERNAME = simpleVisibilityToggle4;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle simpleVisibilityToggle5 = new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle("REQUEST_MONEY_BY_NAME", 4);
        REQUEST_MONEY_BY_NAME = simpleVisibilityToggle5;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle simpleVisibilityToggle6 = new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle("REQUEST_MONEY_BY_EMAIL", 5);
        REQUEST_MONEY_BY_EMAIL = simpleVisibilityToggle6;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle simpleVisibilityToggle7 = new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle("REQUEST_MONEY_BY_PHONE", 6);
        REQUEST_MONEY_BY_PHONE = simpleVisibilityToggle7;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle simpleVisibilityToggle8 = new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle("REQUEST_MONEY_BY_USERNAME", 7);
        REQUEST_MONEY_BY_USERNAME = simpleVisibilityToggle8;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle simpleVisibilityToggle9 = new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle("VENMO_DISCOVERY", 8);
        VENMO_DISCOVERY = simpleVisibilityToggle9;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle[] simpleVisibilityToggleArr = {simpleVisibilityToggle, simpleVisibilityToggle2, simpleVisibilityToggle3, simpleVisibilityToggle4, simpleVisibilityToggle5, simpleVisibilityToggle6, simpleVisibilityToggle7, simpleVisibilityToggle8, simpleVisibilityToggle9};
        getHighSpeedVideoFpsRanges = simpleVisibilityToggleArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(simpleVisibilityToggleArr);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle[] values() {
        return (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle) java.lang.Enum.valueOf(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
