package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetMode;", "", "<init>", "(Ljava/lang/String;I)V", "", "isLoading", "()Z", "NORMAL", "LOADING", "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BottomSheetMode {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode ERROR;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode LOADING;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode NORMAL;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private BottomSheetMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode("NORMAL", 0);
        NORMAL = bottomSheetMode;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode("LOADING", 1);
        LOADING = bottomSheetMode2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode bottomSheetMode3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode("ERROR", 2);
        ERROR = bottomSheetMode3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode[] bottomSheetModeArr = {bottomSheetMode, bottomSheetMode2, bottomSheetMode3};
        getHighResolutionOutputSizeshNQ4ISI = bottomSheetModeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(bottomSheetModeArr);
    }

    public final boolean isLoading() {
        return this == LOADING;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetMode> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
