package com.paypal.oslo.feature.xoom.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/ForbiddenErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "BLOCKED", "BLOCKED_BUSINESS", "BLOCKED_COUNTRY", "LIMITED_COMPLIANCE", "LIMITED_PAYMENTS", "TERMINATED", "UNAUTHORIZED_USER", "UNSUPPORTED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ForbiddenErrorType {
    public static final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType BLOCKED;
    public static final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType BLOCKED_BUSINESS;
    public static final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType BLOCKED_COUNTRY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType LIMITED_COMPLIANCE;
    public static final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType LIMITED_PAYMENTS;
    public static final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType TERMINATED;
    public static final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType UNAUTHORIZED_USER;
    public static final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType UNSUPPORTED;
    private static final /* synthetic */ com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ForbiddenErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType forbiddenErrorType = new com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType("BLOCKED", 0);
        BLOCKED = forbiddenErrorType;
        com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType forbiddenErrorType2 = new com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType("BLOCKED_BUSINESS", 1);
        BLOCKED_BUSINESS = forbiddenErrorType2;
        com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType forbiddenErrorType3 = new com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType("BLOCKED_COUNTRY", 2);
        BLOCKED_COUNTRY = forbiddenErrorType3;
        com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType forbiddenErrorType4 = new com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType("LIMITED_COMPLIANCE", 3);
        LIMITED_COMPLIANCE = forbiddenErrorType4;
        com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType forbiddenErrorType5 = new com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType("LIMITED_PAYMENTS", 4);
        LIMITED_PAYMENTS = forbiddenErrorType5;
        com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType forbiddenErrorType6 = new com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType("TERMINATED", 5);
        TERMINATED = forbiddenErrorType6;
        com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType forbiddenErrorType7 = new com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType("UNAUTHORIZED_USER", 6);
        UNAUTHORIZED_USER = forbiddenErrorType7;
        com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType forbiddenErrorType8 = new com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType("UNSUPPORTED", 7);
        UNSUPPORTED = forbiddenErrorType8;
        com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType[] forbiddenErrorTypeArr = {forbiddenErrorType, forbiddenErrorType2, forbiddenErrorType3, forbiddenErrorType4, forbiddenErrorType5, forbiddenErrorType6, forbiddenErrorType7, forbiddenErrorType8};
        getHighResolutionOutputSizeshNQ4ISI = forbiddenErrorTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(forbiddenErrorTypeArr);
        INSTANCE = new com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/ForbiddenErrorType$Companion;", "", "<init>", "()V", "", "errorType", "Lcom/paypal/oslo/feature/xoom/domain/model/ForbiddenErrorType;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/xoom/domain/model/ForbiddenErrorType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType fromString(java.lang.String errorType) {
            java.lang.Object obj;
            if (errorType != null) {
                java.lang.String upperCase = errorType.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                if (upperCase != null) {
                    java.util.Iterator<E> it = com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType) obj).name(), upperCase)) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType forbiddenErrorType = (com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType) obj;
                    if (forbiddenErrorType != null) {
                        return forbiddenErrorType;
                    }
                }
            }
            return com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.UNSUPPORTED;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType[] values() {
        return (com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
