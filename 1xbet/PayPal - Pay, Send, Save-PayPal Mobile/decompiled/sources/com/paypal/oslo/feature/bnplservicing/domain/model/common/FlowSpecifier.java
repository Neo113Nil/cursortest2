package com.paypal.oslo.feature.bnplservicing.domain.model.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowSpecifier;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "PURCHASE", "SELF_SERVICING", "STANDALONE_APPLICATION", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlowSpecifier {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier PURCHASE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier SELF_SERVICING;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier STANDALONE_APPLICATION;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier[] getHighSpeedVideoFpsRangesFor;

    private FlowSpecifier(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier flowSpecifier = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier("PURCHASE", 0);
        PURCHASE = flowSpecifier;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier flowSpecifier2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier("SELF_SERVICING", 1);
        SELF_SERVICING = flowSpecifier2;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier flowSpecifier3 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier("STANDALONE_APPLICATION", 2);
        STANDALONE_APPLICATION = flowSpecifier3;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier flowSpecifier4 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier("UNKNOWN", 3);
        UNKNOWN = flowSpecifier4;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier[] flowSpecifierArr = {flowSpecifier, flowSpecifier2, flowSpecifier3, flowSpecifier4};
        getHighSpeedVideoFpsRangesFor = flowSpecifierArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(flowSpecifierArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowSpecifier$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowSpecifier;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowSpecifier;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier flowSpecifier = (com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier) obj;
            return flowSpecifier == null ? com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier.UNKNOWN : flowSpecifier;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
