package com.paypal.oslo.core.telemetry.vendors.fpti.transformer;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "", "FPTI", "(Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FPTIContextRegistryModuleKt {
    public static final java.lang.String FPTI(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        int i = com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModuleKt.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            return "cl";
        }
        if (i == 2) {
            return "im";
        }
        if (i == 3) {
            return "av";
        }
        if (i == 4) {
            return "im";
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "ac";
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Clicked.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Available.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Disappeared.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Activity.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
