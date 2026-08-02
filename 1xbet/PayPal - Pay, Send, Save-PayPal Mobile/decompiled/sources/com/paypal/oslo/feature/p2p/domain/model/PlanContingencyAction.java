package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "THREE_D_SECURE_DATA_COLLECTION_REQUIRED", "THREE_D_SECURE_AUTHENTICATION_REQUIRED", "CARD_VERIFICATION_DATA_COLLECTION_REQUIRED", "OBTAIN_REAL_TIME_BALANCE_CONSENT", "REFRESH_REAL_TIME_BALANCE", "TOPUP_INSTRUMENT", "USER_DATA_COLLECTION_REQUIRED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlanContingencyAction {
    private static final java.util.Set<com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction> AUTO_RESOLVE_ACTIONS;
    public static final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction CARD_VERIFICATION_DATA_COLLECTION_REQUIRED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.Companion INSTANCE;
    public static final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction OBTAIN_REAL_TIME_BALANCE_CONSENT;
    private static final java.util.Set<com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction> REDIRECTION_ACTIONS;
    public static final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction REFRESH_REAL_TIME_BALANCE;
    public static final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction THREE_D_SECURE_AUTHENTICATION_REQUIRED;
    public static final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction THREE_D_SECURE_DATA_COLLECTION_REQUIRED;
    public static final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction TOPUP_INSTRUMENT;
    public static final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction USER_DATA_COLLECTION_REQUIRED;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PlanContingencyAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction("THREE_D_SECURE_DATA_COLLECTION_REQUIRED", 0);
        THREE_D_SECURE_DATA_COLLECTION_REQUIRED = planContingencyAction;
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction2 = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction("THREE_D_SECURE_AUTHENTICATION_REQUIRED", 1);
        THREE_D_SECURE_AUTHENTICATION_REQUIRED = planContingencyAction2;
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction3 = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction("CARD_VERIFICATION_DATA_COLLECTION_REQUIRED", 2);
        CARD_VERIFICATION_DATA_COLLECTION_REQUIRED = planContingencyAction3;
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction4 = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction("OBTAIN_REAL_TIME_BALANCE_CONSENT", 3);
        OBTAIN_REAL_TIME_BALANCE_CONSENT = planContingencyAction4;
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction5 = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction("REFRESH_REAL_TIME_BALANCE", 4);
        REFRESH_REAL_TIME_BALANCE = planContingencyAction5;
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction6 = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction("TOPUP_INSTRUMENT", 5);
        TOPUP_INSTRUMENT = planContingencyAction6;
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction7 = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction("USER_DATA_COLLECTION_REQUIRED", 6);
        USER_DATA_COLLECTION_REQUIRED = planContingencyAction7;
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction[] planContingencyActionArr = {planContingencyAction, planContingencyAction2, planContingencyAction3, planContingencyAction4, planContingencyAction5, planContingencyAction6, planContingencyAction7};
        getHighSpeedVideoFpsRanges = planContingencyActionArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(planContingencyActionArr);
        INSTANCE = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.Companion(null);
        REDIRECTION_ACTIONS = kotlin.collections.SetsKt.setOf(planContingencyAction4);
        AUTO_RESOLVE_ACTIONS = kotlin.collections.SetsKt.setOf(planContingencyAction5);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;", "REDIRECTION_ACTIONS", "Ljava/util/Set;", "getREDIRECTION_ACTIONS$p2p_prodRelease", "()Ljava/util/Set;", "AUTO_RESOLVE_ACTIONS", "getAUTO_RESOLVE_ACTIONS$p2p_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Set<com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction> getREDIRECTION_ACTIONS$p2p_prodRelease() {
            return com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.REDIRECTION_ACTIONS;
        }

        public final java.util.Set<com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction> getAUTO_RESOLVE_ACTIONS$p2p_prodRelease() {
            return com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.AUTO_RESOLVE_ACTIONS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
