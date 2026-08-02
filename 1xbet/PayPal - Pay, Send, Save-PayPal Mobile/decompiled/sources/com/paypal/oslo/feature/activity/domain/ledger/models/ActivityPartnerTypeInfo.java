package com.paypal.oslo.feature.activity.domain.ledger.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerTypeInfo;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "XOOM", "INGO", "PIX", "SYNCHRONY", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class ActivityPartnerTypeInfo {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo.Companion INSTANCE;
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo INGO;
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo PIX;
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo SYNCHRONY;
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo UNKNOWN__;
    public static final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo XOOM;
    private final java.lang.String rawValue;

    private ActivityPartnerTypeInfo(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo("XOOM", 0, "XOOM");
        XOOM = activityPartnerTypeInfo;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo2 = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo("INGO", 1, "INGO");
        INGO = activityPartnerTypeInfo2;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo3 = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo("PIX", 2, "PIX");
        PIX = activityPartnerTypeInfo3;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo4 = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo("SYNCHRONY", 3, "SYNCHRONY");
        SYNCHRONY = activityPartnerTypeInfo4;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo5 = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = activityPartnerTypeInfo5;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo[] activityPartnerTypeInfoArr = {activityPartnerTypeInfo, activityPartnerTypeInfo2, activityPartnerTypeInfo3, activityPartnerTypeInfo4, activityPartnerTypeInfo5};
        $VALUES = activityPartnerTypeInfoArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(activityPartnerTypeInfoArr);
        INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo", com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerTypeInfo$Companion;", "", "<init>", "()V", "", "rawValue", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerTypeInfo;", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityPartnerTypeInfo;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo activityPartnerTypeInfo = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo) obj;
            return activityPartnerTypeInfo == null ? com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo.UNKNOWN__ : activityPartnerTypeInfo;
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo[] values() {
        return (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo) java.lang.Enum.valueOf(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo> getEntries() {
        return $ENTRIES;
    }
}
