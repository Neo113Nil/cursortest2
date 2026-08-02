package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "", "<init>", "(Ljava/lang/String;I)V", "toggle", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "", "isLocked", "()Z", "Companion", "LOCKED", "UNLOCKED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CardLockState {
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.Companion INSTANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState LOCKED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState UNLOCKED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private CardLockState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState("LOCKED", 0);
        LOCKED = cardLockState;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState cardLockState2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState("UNLOCKED", 1);
        UNLOCKED = cardLockState2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState[] cardLockStateArr = {cardLockState, cardLockState2};
        Camera2StreamConfigurationMap = cardLockStateArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cardLockStateArr);
        INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState$Companion;", "", "<init>", "()V", "", "isLocked", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;", "fromBoolean", "(Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardLockState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState fromBoolean(boolean isLocked) {
            return isLocked ? com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.LOCKED : com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.UNLOCKED;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState toggle() {
        int i = com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return UNLOCKED;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return LOCKED;
    }

    public final boolean isLocked() {
        return this == LOCKED;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState[]) Camera2StreamConfigurationMap.clone();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.LOCKED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.UNLOCKED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
