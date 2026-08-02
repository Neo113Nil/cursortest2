package com.paypal.oslo.feature.directdeposit.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRouteStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SmartRouteStatus {
    public static final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus ACTIVE;
    private static final /* synthetic */ com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus INACTIVE;
    public static final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SmartRouteStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus smartRouteStatus = new com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = smartRouteStatus;
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus smartRouteStatus2 = new com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus(com.payair.model.TokenStatusKt.TOKEN_INACTIVE, 1);
        INACTIVE = smartRouteStatus2;
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus smartRouteStatus3 = new com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus("UNKNOWN", 2);
        UNKNOWN = smartRouteStatus3;
        com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus[] smartRouteStatusArr = {smartRouteStatus, smartRouteStatus2, smartRouteStatus3};
        Camera2StreamConfigurationMap = smartRouteStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(smartRouteStatusArr);
        INSTANCE = new com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRouteStatus$Companion;", "", "<init>", "()V", "", "status", "Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRouteStatus;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/domain/model/SmartRouteStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus fromString(java.lang.String status) {
            java.lang.String str;
            if (status != null) {
                str = status.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            } else {
                str = null;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(str, com.payair.model.TokenStatusKt.TOKEN_ACTIVE) ? com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus.ACTIVE : kotlin.jvm.internal.Intrinsics.areEqual(str, com.payair.model.TokenStatusKt.TOKEN_INACTIVE) ? com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus.INACTIVE : com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus.UNKNOWN;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus[] values() {
        return (com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.directdeposit.domain.model.SmartRouteStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
