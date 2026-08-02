package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/ContingencyMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment;", "input", "Lcom/paypal/oslo/feature/p2p/domain/model/Contingency;", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentContingencyFragment;)Lcom/paypal/oslo/feature/p2p/domain/model/Contingency;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContingencyMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ContingencyMapper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        if (r9 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.p2p.domain.model.Contingency map(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment input) {
        com.paypal.oslo.feature.p2p.domain.model.ContingencyAction contingencyAction;
        com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus contingencyStatus;
        com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.UserDataCollection userDataCollection;
        com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute userDataCollectionAttribute;
        com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel scamRiskLevel;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnScamWarningContingency onScamWarningContingency;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.OnPaymentUserDataCollection onPaymentUserDataCollection;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int i = com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper.WhenMappings.$EnumSwitchMapping$0[input.getAction().ordinal()];
        if (i == 1) {
            contingencyAction = com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.USER_DATA_COLLECTION_REQUIRED;
        } else if (i == 2) {
            contingencyAction = com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.DISPLAY_SCAM_WARNING;
        } else if (i == 3 || i == 4 || i == 5) {
            contingencyAction = com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.UNKNOWN;
        } else {
            contingencyAction = com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.UNKNOWN;
        }
        int i2 = com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper.WhenMappings.$EnumSwitchMapping$1[input.getStatus().ordinal()];
        if (i2 == 1) {
            contingencyStatus = com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus.UNRESOLVED;
        } else if (i2 == 2) {
            contingencyStatus = com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus.RESOLVED;
        } else if (i2 == 3) {
            contingencyStatus = com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus.UNKNOWN;
        } else {
            contingencyStatus = com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus.UNKNOWN;
        }
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details details = input.getDetails();
        java.util.ArrayList arrayList = null;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionAttribute> requiredFields = (details == null || (onPaymentUserDataCollection = details.getOnPaymentUserDataCollection()) == null) ? null : onPaymentUserDataCollection.getRequiredFields();
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentContingencyFragment.Details details2 = input.getDetails();
        com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningType riskLevel = (details2 == null || (onScamWarningContingency = details2.getOnScamWarningContingency()) == null) ? null : onScamWarningContingency.getRiskLevel();
        int i3 = com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper.WhenMappings.$EnumSwitchMapping$2[contingencyAction.ordinal()];
        if (i3 == 1) {
            if (requiredFields != null) {
                java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionAttribute> list = requiredFields;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper.WhenMappings.$EnumSwitchMapping$3[((com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionAttribute) it.next()).ordinal()] == 1) {
                        userDataCollectionAttribute = com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute.RECEIVER_NAME;
                    } else {
                        userDataCollectionAttribute = com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute.UNKNOWN;
                    }
                    arrayList2.add(userDataCollectionAttribute);
                }
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            userDataCollection = new com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.UserDataCollection(arrayList);
        } else if (i3 == 2) {
            if (riskLevel != null) {
                int i4 = com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper.WhenMappings.$EnumSwitchMapping$4[riskLevel.ordinal()];
                if (i4 == 1) {
                    scamRiskLevel = com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel.LOW_RISK;
                } else if (i4 == 2) {
                    scamRiskLevel = com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel.MEDIUM_RISK;
                } else {
                    scamRiskLevel = com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel.UNKNOWN;
                }
            }
            scamRiskLevel = com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel.UNKNOWN;
            userDataCollection = new com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning(scamRiskLevel);
        } else {
            userDataCollection = com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.Unknown.INSTANCE;
        }
        return new com.paypal.oslo.feature.p2p.domain.model.Contingency(contingencyAction, contingencyStatus, userDataCollection);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.USER_DATA_COLLECTION_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.DISPLAY_SCAM_WARNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.SENDER_CIP_VERIFICATION_REQUIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.PURPOSE_CODE_COLLECTION_REQUIRED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentContingencyAction.FEATURE_PROVISIONING_REQUIRED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.ContingencyStatus.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ContingencyStatus.UNRESOLVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ContingencyStatus.RESOLVED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ContingencyStatus.FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.values().length];
            try {
                iArr3[com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.USER_DATA_COLLECTION_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.DISPLAY_SCAM_WARNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionAttribute.values().length];
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.PaymentUserDataCollectionAttribute.RECEIVER_NAME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningType.values().length];
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningType.LOW_RISK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.PaymentScamWarningType.MEDIUM_RISK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }
}
