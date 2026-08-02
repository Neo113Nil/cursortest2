package com.paypal.oslo.feature.bnplservicing.domain.model.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowAttribute;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "BRAND_PAYPAL", "EXPERIENCE_LEGACY", "USAGE_CHANNEL_CONTACTLESS_MOBILE_WALLET", "USAGE_CHANNEL_EXTERNAL_ECOMMERCE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlowAttribute {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute BRAND_PAYPAL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute EXPERIENCE_LEGACY;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute UNKNOWN;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute USAGE_CHANNEL_CONTACTLESS_MOBILE_WALLET;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute USAGE_CHANNEL_EXTERNAL_ECOMMERCE;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private FlowAttribute(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute flowAttribute = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute("BRAND_PAYPAL", 0);
        BRAND_PAYPAL = flowAttribute;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute flowAttribute2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute("EXPERIENCE_LEGACY", 1);
        EXPERIENCE_LEGACY = flowAttribute2;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute flowAttribute3 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute("USAGE_CHANNEL_CONTACTLESS_MOBILE_WALLET", 2);
        USAGE_CHANNEL_CONTACTLESS_MOBILE_WALLET = flowAttribute3;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute flowAttribute4 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute("USAGE_CHANNEL_EXTERNAL_ECOMMERCE", 3);
        USAGE_CHANNEL_EXTERNAL_ECOMMERCE = flowAttribute4;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute flowAttribute5 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute("UNKNOWN", 4);
        UNKNOWN = flowAttribute5;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute[] flowAttributeArr = {flowAttribute, flowAttribute2, flowAttribute3, flowAttribute4, flowAttribute5};
        getHighResolutionOutputSizeshNQ4ISI = flowAttributeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(flowAttributeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowAttribute$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowAttribute;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowAttribute;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute flowAttribute = (com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute) obj;
            return flowAttribute == null ? com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute.UNKNOWN : flowAttribute;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
