package com.paypal.oslo.feature.inappcheckout.features.analytics.domain;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/AnalyticsEventType;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnalyticsEventType {
    public static final int $stable = 0;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType.Companion(null);
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType Click = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType("cl");
    private static final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType Impression = new com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType("im");

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/AnalyticsEventType$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/AnalyticsEventType;", "Click", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/AnalyticsEventType;", "getClick", "()Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/AnalyticsEventType;", "Impression", "getImpression"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType getClick() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType.Click;
        }

        public final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType getImpression() {
            return com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType.Impression;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AnalyticsEventType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    public final java.lang.String getName() {
        return this.name;
    }
}
