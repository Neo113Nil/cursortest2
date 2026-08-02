package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatusReason;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ACCOUNT_PAST_DUE", "ACCOUNT_STATUS_NOT_NORMAL", "CUSTOMER_DECLINE", "PENDING_CUSTOMER_ACCEPTANCE", "PENDING_INCOME_VERIFICATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIOfferStatusReason {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason ACCOUNT_PAST_DUE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason ACCOUNT_STATUS_NOT_NORMAL;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason CUSTOMER_DECLINE;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.Companion INSTANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason PENDING_CUSTOMER_ACCEPTANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason PENDING_INCOME_VERIFICATION;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason[] getHighSpeedVideoFpsRangesFor;

    private CLIOfferStatusReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason cLIOfferStatusReason = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason("ACCOUNT_PAST_DUE", 0);
        ACCOUNT_PAST_DUE = cLIOfferStatusReason;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason cLIOfferStatusReason2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason("ACCOUNT_STATUS_NOT_NORMAL", 1);
        ACCOUNT_STATUS_NOT_NORMAL = cLIOfferStatusReason2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason cLIOfferStatusReason3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason("CUSTOMER_DECLINE", 2);
        CUSTOMER_DECLINE = cLIOfferStatusReason3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason cLIOfferStatusReason4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason("PENDING_CUSTOMER_ACCEPTANCE", 3);
        PENDING_CUSTOMER_ACCEPTANCE = cLIOfferStatusReason4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason cLIOfferStatusReason5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason("PENDING_INCOME_VERIFICATION", 4);
        PENDING_INCOME_VERIFICATION = cLIOfferStatusReason5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason[] cLIOfferStatusReasonArr = {cLIOfferStatusReason, cLIOfferStatusReason2, cLIOfferStatusReason3, cLIOfferStatusReason4, cLIOfferStatusReason5};
        getHighSpeedVideoFpsRangesFor = cLIOfferStatusReasonArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cLIOfferStatusReasonArr);
        INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatusReason$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseOfferStatusReason;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/type/RevolvingCreditLineIncreaseOfferStatusReason;", "graphqlValue", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatusReason;", "from", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseOfferStatusReason;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatusReason;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason from(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason graphqlValue) {
            switch (graphqlValue == null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.Companion.WhenMappings.$EnumSwitchMapping$0[graphqlValue.ordinal()]) {
                case -1:
                case 6:
                    return null;
                case 0:
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
                case 1:
                    return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.ACCOUNT_PAST_DUE;
                case 2:
                    return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.ACCOUNT_STATUS_NOT_NORMAL;
                case 3:
                    return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.CUSTOMER_DECLINE;
                case 4:
                    return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.PENDING_CUSTOMER_ACCEPTANCE;
                case 5:
                    return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.PENDING_INCOME_VERIFICATION;
            }
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.values().length];
                try {
                    iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.ACCOUNT_PAST_DUE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.ACCOUNT_STATUS_NOT_NORMAL.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.CUSTOMER_DECLINE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.PENDING_CUSTOMER_ACCEPTANCE.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.PENDING_INCOME_VERIFICATION.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.UNKNOWN__.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
