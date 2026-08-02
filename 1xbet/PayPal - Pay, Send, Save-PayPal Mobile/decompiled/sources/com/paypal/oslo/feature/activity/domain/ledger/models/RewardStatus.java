package com.paypal.oslo.feature.activity.domain.ledger.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "EARNED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class RewardStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus EARNED;
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus PENDING;
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus UNKNOWN__;
    private final java.lang.String rawValue;

    private RewardStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus rewardStatus = new com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus("EARNED", 0, "EARNED");
        EARNED = rewardStatus;
        com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus rewardStatus2 = new com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 1, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        PENDING = rewardStatus2;
        com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus rewardStatus3 = new com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = rewardStatus3;
        com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus[] rewardStatusArr = {rewardStatus, rewardStatus2, rewardStatus3};
        $VALUES = rewardStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(rewardStatusArr);
        INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus", com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardStatus;", "toRewardStatus", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardStatus;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus toRewardStatus(java.lang.String str) {
            java.lang.Object obj;
            java.lang.String str2 = str;
            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                java.util.Iterator<E> it = com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus) obj).getRawValue(), str)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus rewardStatus = (com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus) obj;
                return rewardStatus == null ? com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.UNKNOWN__ : rewardStatus;
            }
            return com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.UNKNOWN__;
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus[] values() {
        return (com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus> getEntries() {
        return $ENTRIES;
    }
}
