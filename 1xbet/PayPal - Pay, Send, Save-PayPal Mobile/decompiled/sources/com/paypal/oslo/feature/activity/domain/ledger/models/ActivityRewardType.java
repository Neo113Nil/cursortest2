package com.paypal.oslo.feature.activity.domain.ledger.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityRewardType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "POINTS", "PERCENTAGE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class ActivityRewardType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType PERCENTAGE;
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType POINTS;
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType UNKNOWN__;
    private final java.lang.String rawValue;

    private ActivityRewardType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType activityRewardType = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType("POINTS", 0, "POINTS");
        POINTS = activityRewardType;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType activityRewardType2 = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType("PERCENTAGE", 1, "PERCENTAGE");
        PERCENTAGE = activityRewardType2;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType activityRewardType3 = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = activityRewardType3;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType[] activityRewardTypeArr = {activityRewardType, activityRewardType2, activityRewardType3};
        $VALUES = activityRewardTypeArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(activityRewardTypeArr);
        INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType", com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityRewardType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityRewardType;", "toActivityRewardType", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityRewardType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType toActivityRewardType(java.lang.String str) {
            java.lang.Object obj;
            java.lang.String str2 = str;
            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                java.util.Iterator<E> it = com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType) obj).getRawValue(), str)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType activityRewardType = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType) obj;
                return activityRewardType == null ? com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.UNKNOWN__ : activityRewardType;
            }
            return com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.UNKNOWN__;
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType[] values() {
        return (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType) java.lang.Enum.valueOf(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType> getEntries() {
        return $ENTRIES;
    }
}
