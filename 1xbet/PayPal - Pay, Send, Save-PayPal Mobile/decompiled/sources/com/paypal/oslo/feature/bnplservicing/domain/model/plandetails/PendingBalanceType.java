package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PendingBalanceType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ACCRUED_INTEREST", "FEE", "FEE_AND_ACCRUED_INTEREST", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PendingBalanceType {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType ACCRUED_INTEREST;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType FEE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType FEE_AND_ACCRUED_INTEREST;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PendingBalanceType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType pendingBalanceType = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType("ACCRUED_INTEREST", 0);
        ACCRUED_INTEREST = pendingBalanceType;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType pendingBalanceType2 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType("FEE", 1);
        FEE = pendingBalanceType2;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType pendingBalanceType3 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType("FEE_AND_ACCRUED_INTEREST", 2);
        FEE_AND_ACCRUED_INTEREST = pendingBalanceType3;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType pendingBalanceType4 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType("UNKNOWN", 3);
        UNKNOWN = pendingBalanceType4;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType[] pendingBalanceTypeArr = {pendingBalanceType, pendingBalanceType2, pendingBalanceType3, pendingBalanceType4};
        getHighSpeedVideoFpsRanges = pendingBalanceTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(pendingBalanceTypeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0086\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PendingBalanceType$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPendingBalanceType;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLServicingPendingBalanceType;", "type", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PendingBalanceType;", "from", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPendingBalanceType;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PendingBalanceType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType from(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPendingBalanceType type) {
            int i = type == null ? -1 : com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType.Companion.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i == -1) {
                return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType.UNKNOWN;
            }
            if (i == 1) {
                return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType.ACCRUED_INTEREST;
            }
            if (i == 2) {
                return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType.FEE;
            }
            if (i == 3) {
                return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType.FEE_AND_ACCRUED_INTEREST;
            }
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType.UNKNOWN;
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPendingBalanceType.values().length];
                try {
                    iArr[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPendingBalanceType.ACCRUED_INTEREST.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPendingBalanceType.FEE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPendingBalanceType.FEE_AND_ACCRUED_INTEREST.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPendingBalanceType.UNKNOWN__.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
