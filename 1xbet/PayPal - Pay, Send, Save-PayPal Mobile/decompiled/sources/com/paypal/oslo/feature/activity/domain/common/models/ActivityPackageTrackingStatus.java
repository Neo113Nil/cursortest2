package com.paypal.oslo.feature.activity.domain.common.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityPackageTrackingStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "INFORMATION_RECEIVED", "IN_TRANSIT", "EXCEPTION", "OUT_FOR_DELIVERY", "DELIVERED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class ActivityPackageTrackingStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus DELIVERED;
    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus EXCEPTION;
    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus INFORMATION_RECEIVED;
    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus IN_TRANSIT;
    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus OUT_FOR_DELIVERY;
    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus UNKNOWN;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityPackageTrackingStatus$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityPackageTrackingStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ActivityPackageTrackingStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus = new com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus("INFORMATION_RECEIVED", 0);
        INFORMATION_RECEIVED = activityPackageTrackingStatus;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus2 = new com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus("IN_TRANSIT", 1);
        IN_TRANSIT = activityPackageTrackingStatus2;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus3 = new com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus("EXCEPTION", 2);
        EXCEPTION = activityPackageTrackingStatus3;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus4 = new com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus("OUT_FOR_DELIVERY", 3);
        OUT_FOR_DELIVERY = activityPackageTrackingStatus4;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus5 = new com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus("DELIVERED", 4);
        DELIVERED = activityPackageTrackingStatus5;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus activityPackageTrackingStatus6 = new com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus("UNKNOWN", 5);
        UNKNOWN = activityPackageTrackingStatus6;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus[] activityPackageTrackingStatusArr = {activityPackageTrackingStatus, activityPackageTrackingStatus2, activityPackageTrackingStatus3, activityPackageTrackingStatus4, activityPackageTrackingStatus5, activityPackageTrackingStatus6};
        $VALUES = activityPackageTrackingStatusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(activityPackageTrackingStatusArr);
        INSTANCE = new com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus", com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus[] values() {
        return (com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.activity.domain.common.models.ActivityPackageTrackingStatus> getEntries() {
        return $ENTRIES;
    }
}
