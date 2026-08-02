package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/pds/components/TimelineHorizontalItem;", "", "Lcom/paypal/pds/components/TimelineState;", "state", "", "title", "subtitle", "metadata", "Lcom/paypal/pds/core/AnalyticsScope;", "analyticsScope", "<init>", "(Lcom/paypal/pds/components/TimelineState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/AnalyticsScope;)V", "component1", "()Lcom/paypal/pds/components/TimelineState;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/paypal/pds/core/AnalyticsScope;", "copy", "(Lcom/paypal/pds/components/TimelineState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/AnalyticsScope;)Lcom/paypal/pds/components/TimelineHorizontalItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/pds/components/TimelineState;", "getState", "Ljava/lang/String;", "getTitle", "getSubtitle", "getMetadata", "Lcom/paypal/pds/core/AnalyticsScope;", "getAnalyticsScope"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TimelineHorizontalItem {
    public static final int $stable = 0;
    private final com.paypal.pds.core.AnalyticsScope analyticsScope;
    private final java.lang.String metadata;
    private final com.paypal.pds.components.TimelineState state;
    private final java.lang.String subtitle;
    private final java.lang.String title;

    public TimelineHorizontalItem(com.paypal.pds.components.TimelineState timelineState, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.pds.core.AnalyticsScope analyticsScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timelineState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
        this.state = timelineState;
        this.title = str;
        this.subtitle = str2;
        this.metadata = str3;
        this.analyticsScope = analyticsScope;
    }

    public /* synthetic */ TimelineHorizontalItem(com.paypal.pds.components.TimelineState.NotStarted notStarted, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.pds.components.TimelineState.INSTANCE.getNotStarted() : notStarted, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : analyticsScope);
    }

    public final com.paypal.pds.components.TimelineState getState() {
        return this.state;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    public final java.lang.String getMetadata() {
        return this.metadata;
    }

    public final com.paypal.pds.core.AnalyticsScope getAnalyticsScope() {
        return this.analyticsScope;
    }

    public final java.lang.String toString() {
        com.paypal.pds.components.TimelineState timelineState = this.state;
        java.lang.String str = this.title;
        java.lang.String str2 = this.subtitle;
        java.lang.String str3 = this.metadata;
        com.paypal.pds.core.AnalyticsScope analyticsScope = this.analyticsScope;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimelineHorizontalItem(state=");
        sb.append(timelineState);
        sb.append(", title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", metadata=");
        sb.append(str3);
        sb.append(", analyticsScope=");
        sb.append(analyticsScope);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.state.hashCode();
        java.lang.String str = this.title;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.subtitle;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.metadata;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.analyticsScope.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.TimelineHorizontalItem)) {
            return false;
        }
        com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem = (com.paypal.pds.components.TimelineHorizontalItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.state, timelineHorizontalItem.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, timelineHorizontalItem.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, timelineHorizontalItem.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, timelineHorizontalItem.metadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.analyticsScope, timelineHorizontalItem.analyticsScope);
    }

    public final com.paypal.pds.components.TimelineHorizontalItem copy(com.paypal.pds.components.TimelineState state, java.lang.String title, java.lang.String subtitle, java.lang.String metadata, com.paypal.pds.core.AnalyticsScope analyticsScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
        return new com.paypal.pds.components.TimelineHorizontalItem(state, title, subtitle, metadata, analyticsScope);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.pds.core.AnalyticsScope getAnalyticsScope() {
        return this.analyticsScope;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMetadata() {
        return this.metadata;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.components.TimelineState getState() {
        return this.state;
    }

    public static /* synthetic */ com.paypal.pds.components.TimelineHorizontalItem copy$default(com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem, com.paypal.pds.components.TimelineState timelineState, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            timelineState = timelineHorizontalItem.state;
        }
        if ((i & 2) != 0) {
            str = timelineHorizontalItem.title;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = timelineHorizontalItem.subtitle;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = timelineHorizontalItem.metadata;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            analyticsScope = timelineHorizontalItem.analyticsScope;
        }
        return timelineHorizontalItem.copy(timelineState, str4, str5, str6, analyticsScope);
    }

    public TimelineHorizontalItem() {
        this(null, null, null, null, null, 31, null);
    }
}
