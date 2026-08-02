package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsLeafState;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Condition", "Lcom/paypal/pds/analytics/AnalyticsLeafState$Condition;", "Lcom/paypal/pds/analytics/AnalyticsLeafState$None;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class AnalyticsLeafState {
    public static final int $stable = 0;

    private AnalyticsLeafState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsLeafState$None;", "Lcom/paypal/pds/analytics/AnalyticsLeafState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None extends com.paypal.pds.analytics.AnalyticsLeafState {
        public static final int $stable = 0;
        public static final com.paypal.pds.analytics.AnalyticsLeafState.None INSTANCE = new com.paypal.pds.analytics.AnalyticsLeafState.None();

        public final int hashCode() {
            return -2041090412;
        }

        private None() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.analytics.AnalyticsLeafState.None)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsLeafState$Condition;", "Lcom/paypal/pds/analytics/AnalyticsLeafState;", "", "tracked", "initialValue", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/pds/analytics/AnalyticsLeafState$Condition;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getTracked", "getInitialValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Condition extends com.paypal.pds.analytics.AnalyticsLeafState {
        public static final int $stable = 0;
        private final boolean initialValue;
        private final boolean tracked;

        public Condition(boolean z, boolean z2) {
            super(null);
            this.tracked = z;
            this.initialValue = z2;
        }

        public /* synthetic */ Condition(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, z2);
        }

        public final boolean getTracked() {
            return this.tracked;
        }

        public final boolean getInitialValue() {
            return this.initialValue;
        }

        public final java.lang.String toString() {
            boolean z = this.tracked;
            boolean z2 = this.initialValue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Condition(tracked=");
            sb.append(z);
            sb.append(", initialValue=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.tracked) * 31) + java.lang.Boolean.hashCode(this.initialValue);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.analytics.AnalyticsLeafState.Condition)) {
                return false;
            }
            com.paypal.pds.analytics.AnalyticsLeafState.Condition condition = (com.paypal.pds.analytics.AnalyticsLeafState.Condition) other;
            return this.tracked == condition.tracked && this.initialValue == condition.initialValue;
        }

        public final com.paypal.pds.analytics.AnalyticsLeafState.Condition copy(boolean tracked, boolean initialValue) {
            return new com.paypal.pds.analytics.AnalyticsLeafState.Condition(tracked, initialValue);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getInitialValue() {
            return this.initialValue;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getTracked() {
            return this.tracked;
        }

        public static /* synthetic */ com.paypal.pds.analytics.AnalyticsLeafState.Condition copy$default(com.paypal.pds.analytics.AnalyticsLeafState.Condition condition, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = condition.tracked;
            }
            if ((i & 2) != 0) {
                z2 = condition.initialValue;
            }
            return condition.copy(z, z2);
        }
    }

    public /* synthetic */ AnalyticsLeafState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
