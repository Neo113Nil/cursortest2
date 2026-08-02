package com.paypal.oslo.feature.p2p.ui.scamalert.composables;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "GoodsServicesLowRisk", "GoodsServicesMediumRisk", "FriendsFamilyLowRisk", "FriendsFamilyMediumRisk"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class ScamAlertType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType FriendsFamilyLowRisk;
    public static final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType FriendsFamilyMediumRisk;
    public static final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType GoodsServicesLowRisk;
    public static final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType GoodsServicesMediumRisk;

    private ScamAlertType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType = new com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType("GoodsServicesLowRisk", 0);
        GoodsServicesLowRisk = scamAlertType;
        com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType2 = new com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType("GoodsServicesMediumRisk", 1);
        GoodsServicesMediumRisk = scamAlertType2;
        com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType3 = new com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType("FriendsFamilyLowRisk", 2);
        FriendsFamilyLowRisk = scamAlertType3;
        com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType4 = new com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType("FriendsFamilyMediumRisk", 3);
        FriendsFamilyMediumRisk = scamAlertType4;
        com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType[] scamAlertTypeArr = {scamAlertType, scamAlertType2, scamAlertType3, scamAlertType4};
        $VALUES = scamAlertTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(scamAlertTypeArr);
        INSTANCE = new com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType", com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, "Lcom/paypal/oslo/feature/p2p/domain/model/ScamRiskLevel;", "riskLevel", "Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "resolve", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;Lcom/paypal/oslo/feature/p2p/domain/model/ScamRiskLevel;)Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType resolve(com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType, com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel riskLevel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(riskLevel, "");
            int i = com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.Companion.WhenMappings.$EnumSwitchMapping$1[paymentType.ordinal()];
            if (i == 1) {
                if (com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.Companion.WhenMappings.$EnumSwitchMapping$0[riskLevel.ordinal()] == 1) {
                    return com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.FriendsFamilyLowRisk;
                }
                return com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.FriendsFamilyMediumRisk;
            }
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.Companion.WhenMappings.$EnumSwitchMapping$0[riskLevel.ordinal()] == 1) {
                return com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.GoodsServicesLowRisk;
            }
            return com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.GoodsServicesMediumRisk;
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.$cachedSerializer$delegate.getValue();
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel.values().length];
                try {
                    iArr[com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel.LOW_RISK.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[com.paypal.oslo.feature.p2p.domain.model.PaymentType.values().length];
                try {
                    iArr2[com.paypal.oslo.feature.p2p.domain.model.PaymentType.PERSONAL.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr2[com.paypal.oslo.feature.p2p.domain.model.PaymentType.PURCHASE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType[] values() {
        return (com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType> getEntries() {
        return $ENTRIES;
    }
}
