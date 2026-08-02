package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsEvent;", "Lcom/paypal/pds/analytics/AnalyticsChainHolder;", "<init>", "()V", "", "getTimestamp", "()J", "timestamp", "Click", "Show", "Hide", "Condition", "Lcom/paypal/pds/analytics/AnalyticsEvent$Click;", "Lcom/paypal/pds/analytics/AnalyticsEvent$Condition;", "Lcom/paypal/pds/analytics/AnalyticsEvent$Hide;", "Lcom/paypal/pds/analytics/AnalyticsEvent$Show;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AnalyticsEvent extends com.paypal.pds.analytics.AnalyticsChainHolder {
    public static final int $stable = 0;

    public abstract long getTimestamp();

    private AnalyticsEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004HÀ\u0003¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022 \b\u0002\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR2\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsEvent$Click;", "Lcom/paypal/pds/analytics/AnalyticsEvent;", "", "timestamp", "", "", "Lcom/paypal/pds/analytics/TypedKey;", "", "chain", "<init>", "(JLjava/util/List;)V", "component1", "()J", "component2$analytics_release", "()Ljava/util/List;", "copy", "(JLjava/util/List;)Lcom/paypal/pds/analytics/AnalyticsEvent$Click;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getTimestamp", "Ljava/util/List;", "getChain$analytics_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final /* data */ class Click extends com.paypal.pds.analytics.AnalyticsEvent {
        public static final int $stable = 0;
        private final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> chain;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Click(long j, java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.timestamp = j;
            this.chain = list;
        }

        public /* synthetic */ Click(long j, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, list);
        }

        @Override // com.paypal.pds.analytics.AnalyticsEvent
        public final long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.paypal.pds.analytics.AnalyticsChainHolder
        public final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> getChain$analytics_release() {
            return this.chain;
        }

        public final java.lang.String toString() {
            long j = this.timestamp;
            java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> list = this.chain;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Click(timestamp=");
            sb.append(j);
            sb.append(", chain=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.timestamp) * 31) + this.chain.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.analytics.AnalyticsEvent.Click)) {
                return false;
            }
            com.paypal.pds.analytics.AnalyticsEvent.Click click = (com.paypal.pds.analytics.AnalyticsEvent.Click) other;
            return this.timestamp == click.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.chain, click.chain);
        }

        public final com.paypal.pds.analytics.AnalyticsEvent.Click copy(long timestamp, java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>> chain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
            return new com.paypal.pds.analytics.AnalyticsEvent.Click(timestamp, chain);
        }

        public final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> component2$analytics_release() {
            return this.chain;
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.pds.analytics.AnalyticsEvent.Click copy$default(com.paypal.pds.analytics.AnalyticsEvent.Click click, long j, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = click.timestamp;
            }
            if ((i & 2) != 0) {
                list = click.chain;
            }
            return click.copy(j, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t0\bHÀ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062 \b\u0002\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t0\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R2\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t0\b8\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010\u0016"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsEvent$Show;", "Lcom/paypal/pds/analytics/AnalyticsEvent;", "Lcom/paypal/pds/analytics/AnalyticsChainHolder;", "kidChain", "Lcom/paypal/pds/analytics/AnalyticsLeafState;", "kidState", "", "timestamp", "", "", "Lcom/paypal/pds/analytics/TypedKey;", "", "chain", "<init>", "(Lcom/paypal/pds/analytics/AnalyticsChainHolder;Lcom/paypal/pds/analytics/AnalyticsLeafState;JLjava/util/List;)V", "component1", "()Lcom/paypal/pds/analytics/AnalyticsChainHolder;", "component2", "()Lcom/paypal/pds/analytics/AnalyticsLeafState;", "component3", "()J", "component4$analytics_release", "()Ljava/util/List;", "copy", "(Lcom/paypal/pds/analytics/AnalyticsChainHolder;Lcom/paypal/pds/analytics/AnalyticsLeafState;JLjava/util/List;)Lcom/paypal/pds/analytics/AnalyticsEvent$Show;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/analytics/AnalyticsChainHolder;", "getKidChain", "Lcom/paypal/pds/analytics/AnalyticsLeafState;", "getKidState", "J", "getTimestamp", "Ljava/util/List;", "getChain$analytics_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final /* data */ class Show extends com.paypal.pds.analytics.AnalyticsEvent {
        public static final int $stable = 0;
        private final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> chain;
        private final com.paypal.pds.analytics.AnalyticsChainHolder kidChain;
        private final com.paypal.pds.analytics.AnalyticsLeafState kidState;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Show(com.paypal.pds.analytics.AnalyticsChainHolder analyticsChainHolder, com.paypal.pds.analytics.AnalyticsLeafState analyticsLeafState, long j, java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.kidChain = analyticsChainHolder;
            this.kidState = analyticsLeafState;
            this.timestamp = j;
            this.chain = list;
        }

        public /* synthetic */ Show(com.paypal.pds.analytics.AnalyticsChainHolder analyticsChainHolder, com.paypal.pds.analytics.AnalyticsLeafState analyticsLeafState, long j, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : analyticsChainHolder, (i & 2) != 0 ? null : analyticsLeafState, (i & 4) != 0 ? 0L : j, list);
        }

        public final com.paypal.pds.analytics.AnalyticsChainHolder getKidChain() {
            return this.kidChain;
        }

        public final com.paypal.pds.analytics.AnalyticsLeafState getKidState() {
            return this.kidState;
        }

        @Override // com.paypal.pds.analytics.AnalyticsEvent
        public final long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.paypal.pds.analytics.AnalyticsChainHolder
        public final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> getChain$analytics_release() {
            return this.chain;
        }

        public final java.lang.String toString() {
            com.paypal.pds.analytics.AnalyticsChainHolder analyticsChainHolder = this.kidChain;
            com.paypal.pds.analytics.AnalyticsLeafState analyticsLeafState = this.kidState;
            long j = this.timestamp;
            java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> list = this.chain;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Show(kidChain=");
            sb.append(analyticsChainHolder);
            sb.append(", kidState=");
            sb.append(analyticsLeafState);
            sb.append(", timestamp=");
            sb.append(j);
            sb.append(", chain=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.pds.analytics.AnalyticsChainHolder analyticsChainHolder = this.kidChain;
            int hashCode = analyticsChainHolder == null ? 0 : analyticsChainHolder.hashCode();
            com.paypal.pds.analytics.AnalyticsLeafState analyticsLeafState = this.kidState;
            return (((((hashCode * 31) + (analyticsLeafState != null ? analyticsLeafState.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.timestamp)) * 31) + this.chain.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.analytics.AnalyticsEvent.Show)) {
                return false;
            }
            com.paypal.pds.analytics.AnalyticsEvent.Show show = (com.paypal.pds.analytics.AnalyticsEvent.Show) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.kidChain, show.kidChain) && kotlin.jvm.internal.Intrinsics.areEqual(this.kidState, show.kidState) && this.timestamp == show.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.chain, show.chain);
        }

        public final com.paypal.pds.analytics.AnalyticsEvent.Show copy(com.paypal.pds.analytics.AnalyticsChainHolder kidChain, com.paypal.pds.analytics.AnalyticsLeafState kidState, long timestamp, java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>> chain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
            return new com.paypal.pds.analytics.AnalyticsEvent.Show(kidChain, kidState, timestamp, chain);
        }

        public final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> component4$analytics_release() {
            return this.chain;
        }

        /* renamed from: component3, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.pds.analytics.AnalyticsLeafState getKidState() {
            return this.kidState;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.analytics.AnalyticsChainHolder getKidChain() {
            return this.kidChain;
        }

        public static /* synthetic */ com.paypal.pds.analytics.AnalyticsEvent.Show copy$default(com.paypal.pds.analytics.AnalyticsEvent.Show show, com.paypal.pds.analytics.AnalyticsChainHolder analyticsChainHolder, com.paypal.pds.analytics.AnalyticsLeafState analyticsLeafState, long j, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                analyticsChainHolder = show.kidChain;
            }
            if ((i & 2) != 0) {
                analyticsLeafState = show.kidState;
            }
            com.paypal.pds.analytics.AnalyticsLeafState analyticsLeafState2 = analyticsLeafState;
            if ((i & 4) != 0) {
                j = show.timestamp;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                list = show.chain;
            }
            return show.copy(analyticsChainHolder, analyticsLeafState2, j2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005HÀ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR2\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00058\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsEvent$Hide;", "Lcom/paypal/pds/analytics/AnalyticsEvent;", "", "dwellTime", "timestamp", "", "", "Lcom/paypal/pds/analytics/TypedKey;", "", "chain", "<init>", "(JJLjava/util/List;)V", "component1", "()J", "component2", "component3$analytics_release", "()Ljava/util/List;", "copy", "(JJLjava/util/List;)Lcom/paypal/pds/analytics/AnalyticsEvent$Hide;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getDwellTime", "getTimestamp", "Ljava/util/List;", "getChain$analytics_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final /* data */ class Hide extends com.paypal.pds.analytics.AnalyticsEvent {
        public static final int $stable = 0;
        private final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> chain;
        private final long dwellTime;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Hide(long j, long j2, java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.dwellTime = j;
            this.timestamp = j2;
            this.chain = list;
        }

        public /* synthetic */ Hide(long j, long j2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? 0L : j2, list);
        }

        public final long getDwellTime() {
            return this.dwellTime;
        }

        @Override // com.paypal.pds.analytics.AnalyticsEvent
        public final long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.paypal.pds.analytics.AnalyticsChainHolder
        public final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> getChain$analytics_release() {
            return this.chain;
        }

        public final java.lang.String toString() {
            long j = this.dwellTime;
            long j2 = this.timestamp;
            java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> list = this.chain;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Hide(dwellTime=");
            sb.append(j);
            sb.append(", timestamp=");
            sb.append(j2);
            sb.append(", chain=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Long.hashCode(this.dwellTime) * 31) + java.lang.Long.hashCode(this.timestamp)) * 31) + this.chain.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.analytics.AnalyticsEvent.Hide)) {
                return false;
            }
            com.paypal.pds.analytics.AnalyticsEvent.Hide hide = (com.paypal.pds.analytics.AnalyticsEvent.Hide) other;
            return this.dwellTime == hide.dwellTime && this.timestamp == hide.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.chain, hide.chain);
        }

        public final com.paypal.pds.analytics.AnalyticsEvent.Hide copy(long dwellTime, long timestamp, java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>> chain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
            return new com.paypal.pds.analytics.AnalyticsEvent.Hide(dwellTime, timestamp, chain);
        }

        public final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> component3$analytics_release() {
            return this.chain;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component1, reason: from getter */
        public final long getDwellTime() {
            return this.dwellTime;
        }

        public static /* synthetic */ com.paypal.pds.analytics.AnalyticsEvent.Hide copy$default(com.paypal.pds.analytics.AnalyticsEvent.Hide hide, long j, long j2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = hide.dwellTime;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = hide.timestamp;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                list = hide.chain;
            }
            return hide.copy(j3, j4, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t0\bHÀ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JP\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062 \b\u0002\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t0\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0014R2\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t0\b8\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010\u0016"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsEvent$Condition;", "Lcom/paypal/pds/analytics/AnalyticsEvent;", "", "key", "", "initialValue", "", "timestamp", "", "", "Lcom/paypal/pds/analytics/TypedKey;", "", "chain", "<init>", "(Ljava/lang/String;ZJLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()J", "component4$analytics_release", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ZJLjava/util/List;)Lcom/paypal/pds/analytics/AnalyticsEvent$Condition;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getKey", "Z", "getInitialValue", "J", "getTimestamp", "Ljava/util/List;", "getChain$analytics_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Condition extends com.paypal.pds.analytics.AnalyticsEvent {
        public static final int $stable = 0;
        private final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> chain;
        private final boolean initialValue;
        private final java.lang.String key;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Condition(java.lang.String str, boolean z, long j, java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.key = str;
            this.initialValue = z;
            this.timestamp = j;
            this.chain = list;
        }

        public /* synthetic */ Condition(java.lang.String str, boolean z, long j, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, (i & 4) != 0 ? 0L : j, list);
        }

        public final java.lang.String getKey() {
            return this.key;
        }

        public final boolean getInitialValue() {
            return this.initialValue;
        }

        @Override // com.paypal.pds.analytics.AnalyticsEvent
        public final long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.paypal.pds.analytics.AnalyticsChainHolder
        public final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> getChain$analytics_release() {
            return this.chain;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.key;
            boolean z = this.initialValue;
            long j = this.timestamp;
            java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> list = this.chain;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Condition(key=");
            sb.append(str);
            sb.append(", initialValue=");
            sb.append(z);
            sb.append(", timestamp=");
            sb.append(j);
            sb.append(", chain=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.key.hashCode() * 31) + java.lang.Boolean.hashCode(this.initialValue)) * 31) + java.lang.Long.hashCode(this.timestamp)) * 31) + this.chain.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.analytics.AnalyticsEvent.Condition)) {
                return false;
            }
            com.paypal.pds.analytics.AnalyticsEvent.Condition condition = (com.paypal.pds.analytics.AnalyticsEvent.Condition) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.key, condition.key) && this.initialValue == condition.initialValue && this.timestamp == condition.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.chain, condition.chain);
        }

        public final com.paypal.pds.analytics.AnalyticsEvent.Condition copy(java.lang.String key, boolean initialValue, long timestamp, java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>> chain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
            return new com.paypal.pds.analytics.AnalyticsEvent.Condition(key, initialValue, timestamp, chain);
        }

        public final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> component4$analytics_release() {
            return this.chain;
        }

        /* renamed from: component3, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getInitialValue() {
            return this.initialValue;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getKey() {
            return this.key;
        }

        public static /* synthetic */ com.paypal.pds.analytics.AnalyticsEvent.Condition copy$default(com.paypal.pds.analytics.AnalyticsEvent.Condition condition, java.lang.String str, boolean z, long j, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = condition.key;
            }
            if ((i & 2) != 0) {
                z = condition.initialValue;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                j = condition.timestamp;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                list = condition.chain;
            }
            return condition.copy(str, z2, j2, list);
        }
    }

    public /* synthetic */ AnalyticsEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
