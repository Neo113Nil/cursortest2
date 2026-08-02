package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/viewmodel/NavigationState;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "COMPLETED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationState {
    public static final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState COMPLETED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState INITIAL;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState[] getHighSpeedVideoSizes;

    private NavigationState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState navigationState = new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState("INITIAL", 0);
        INITIAL = navigationState;
        com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState navigationState2 = new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState("COMPLETED", 1);
        COMPLETED = navigationState2;
        com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState[] navigationStateArr = {navigationState, navigationState2};
        getHighSpeedVideoSizes = navigationStateArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(navigationStateArr);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState[] values() {
        return (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.NavigationState> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
