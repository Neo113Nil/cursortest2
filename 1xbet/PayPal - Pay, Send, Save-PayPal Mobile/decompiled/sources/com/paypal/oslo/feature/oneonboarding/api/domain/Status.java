package com.paypal.oslo.feature.oneonboarding.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, "IN_PROGRESS", "IN_REVIEW", "COMPLETED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class Status {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.Status[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.Status CANCELED;
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.Status COMPLETED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.Status.Companion INSTANCE;
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.Status FAILED;
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.Status IN_PROGRESS;
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.Status IN_REVIEW;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.domain.Status> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.oneonboarding.api.domain.Status.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Status(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.oneonboarding.api.domain.Status status = new com.paypal.oslo.feature.oneonboarding.api.domain.Status(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, 0);
        CANCELED = status;
        com.paypal.oslo.feature.oneonboarding.api.domain.Status status2 = new com.paypal.oslo.feature.oneonboarding.api.domain.Status("IN_PROGRESS", 1);
        IN_PROGRESS = status2;
        com.paypal.oslo.feature.oneonboarding.api.domain.Status status3 = new com.paypal.oslo.feature.oneonboarding.api.domain.Status("IN_REVIEW", 2);
        IN_REVIEW = status3;
        com.paypal.oslo.feature.oneonboarding.api.domain.Status status4 = new com.paypal.oslo.feature.oneonboarding.api.domain.Status("COMPLETED", 3);
        COMPLETED = status4;
        com.paypal.oslo.feature.oneonboarding.api.domain.Status status5 = new com.paypal.oslo.feature.oneonboarding.api.domain.Status(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 4);
        FAILED = status5;
        com.paypal.oslo.feature.oneonboarding.api.domain.Status[] statusArr = {status, status2, status3, status4, status5};
        $VALUES = statusArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(statusArr);
        INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.domain.Status.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.api.domain.Status$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.oneonboarding.api.domain.Status", com.paypal.oslo.feature.oneonboarding.api.domain.Status.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.oneonboarding.api.domain.Status[] values() {
        return (com.paypal.oslo.feature.oneonboarding.api.domain.Status[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.api.domain.Status valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.api.domain.Status) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.api.domain.Status.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.oneonboarding.api.domain.Status> getEntries() {
        return $ENTRIES;
    }
}
