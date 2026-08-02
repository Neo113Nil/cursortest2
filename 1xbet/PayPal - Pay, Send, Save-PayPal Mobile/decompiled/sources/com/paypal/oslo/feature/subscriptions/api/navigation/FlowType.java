package com.paypal.oslo.feature.subscriptions.api.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/api/navigation/FlowType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "toAgreementType", "()Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "raw", "Ljava/lang/String;", "getRaw", "()Ljava/lang/String;", "Companion", "LINKED_BUSINESSES", "LINKED_SUBSCRIPTIONS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FlowType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.subscriptions.api.navigation.FlowType LINKED_BUSINESSES;
    public static final com.paypal.oslo.feature.subscriptions.api.navigation.FlowType LINKED_SUBSCRIPTIONS;
    private static final /* synthetic */ com.paypal.oslo.feature.subscriptions.api.navigation.FlowType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String raw;

    private FlowType(java.lang.String str, int i, java.lang.String str2) {
        this.raw = str2;
    }

    public final java.lang.String getRaw() {
        return this.raw;
    }

    static {
        com.paypal.oslo.feature.subscriptions.api.navigation.FlowType flowType = new com.paypal.oslo.feature.subscriptions.api.navigation.FlowType("LINKED_BUSINESSES", 0, "linked_businesses");
        LINKED_BUSINESSES = flowType;
        com.paypal.oslo.feature.subscriptions.api.navigation.FlowType flowType2 = new com.paypal.oslo.feature.subscriptions.api.navigation.FlowType("LINKED_SUBSCRIPTIONS", 1, "linked_subscriptions");
        LINKED_SUBSCRIPTIONS = flowType2;
        com.paypal.oslo.feature.subscriptions.api.navigation.FlowType[] flowTypeArr = {flowType, flowType2};
        getHighSpeedVideoFpsRanges = flowTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(flowTypeArr);
        INSTANCE = new com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.Companion(null);
    }

    public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType toAgreementType() {
        int i = com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/api/navigation/FlowType$Companion;", "", "<init>", "()V", "", "string", "Lcom/paypal/oslo/feature/subscriptions/api/navigation/FlowType;", "flowTypeFromString$subscriptions_api_prodRelease", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/api/navigation/FlowType;", "rawFlowType", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementTypeFromRawFlowType", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.subscriptions.api.navigation.FlowType flowTypeFromString$subscriptions_api_prodRelease(java.lang.String string) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.subscriptions.api.navigation.FlowType) obj).getRaw(), string, true)) {
                    break;
                }
            }
            com.paypal.oslo.feature.subscriptions.api.navigation.FlowType flowType = (com.paypal.oslo.feature.subscriptions.api.navigation.FlowType) obj;
            return flowType == null ? com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.LINKED_SUBSCRIPTIONS : flowType;
        }

        public final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementTypeFromRawFlowType(java.lang.String rawFlowType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawFlowType, "");
            return flowTypeFromString$subscriptions_api_prodRelease(rawFlowType).toAgreementType();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.subscriptions.api.navigation.FlowType[] values() {
        return (com.paypal.oslo.feature.subscriptions.api.navigation.FlowType[]) getHighSpeedVideoFpsRanges.clone();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.LINKED_BUSINESSES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.LINKED_SUBSCRIPTIONS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static com.paypal.oslo.feature.subscriptions.api.navigation.FlowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.subscriptions.api.navigation.FlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.subscriptions.api.navigation.FlowType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
