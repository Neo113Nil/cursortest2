package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "MenuBehavior enum is deprecated and no longer used in the new Menu API. Selection behavior can be implemented in your onItemClick handler by comparing the selected item.")
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/pds/components/MenuBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "SELECTION", "ACTION", "SEARCH"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MenuBehavior {
    public static final com.paypal.pds.components.MenuBehavior ACTION;
    public static final com.paypal.pds.components.MenuBehavior SEARCH;
    public static final com.paypal.pds.components.MenuBehavior SELECTION;
    private static final /* synthetic */ com.paypal.pds.components.MenuBehavior[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private MenuBehavior(java.lang.String str, int i) {
    }

    static {
        com.paypal.pds.components.MenuBehavior menuBehavior = new com.paypal.pds.components.MenuBehavior("SELECTION", 0);
        SELECTION = menuBehavior;
        com.paypal.pds.components.MenuBehavior menuBehavior2 = new com.paypal.pds.components.MenuBehavior("ACTION", 1);
        ACTION = menuBehavior2;
        com.paypal.pds.components.MenuBehavior menuBehavior3 = new com.paypal.pds.components.MenuBehavior("SEARCH", 2);
        SEARCH = menuBehavior3;
        com.paypal.pds.components.MenuBehavior[] menuBehaviorArr = {menuBehavior, menuBehavior2, menuBehavior3};
        getHighResolutionOutputSizeshNQ4ISI = menuBehaviorArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(menuBehaviorArr);
    }

    public static com.paypal.pds.components.MenuBehavior[] values() {
        return (com.paypal.pds.components.MenuBehavior[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.pds.components.MenuBehavior valueOf(java.lang.String str) {
        return (com.paypal.pds.components.MenuBehavior) java.lang.Enum.valueOf(com.paypal.pds.components.MenuBehavior.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.MenuBehavior> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
