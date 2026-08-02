package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/pds/components/AvatarStackSource;", "", "Lcom/paypal/pds/components/AvatarSource;", "source", "Lcom/paypal/pds/core/AnalyticsScope;", "analyticsScope", "<init>", "(Lcom/paypal/pds/components/AvatarSource;Lcom/paypal/pds/core/AnalyticsScope;)V", "component1", "()Lcom/paypal/pds/components/AvatarSource;", "component2", "()Lcom/paypal/pds/core/AnalyticsScope;", "copy", "(Lcom/paypal/pds/components/AvatarSource;Lcom/paypal/pds/core/AnalyticsScope;)Lcom/paypal/pds/components/AvatarStackSource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/components/AvatarSource;", "getSource", "Lcom/paypal/pds/core/AnalyticsScope;", "getAnalyticsScope"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AvatarStackSource {
    public static final int $stable = 0;
    private final com.paypal.pds.core.AnalyticsScope analyticsScope;
    private final com.paypal.pds.components.AvatarSource source;

    public AvatarStackSource(com.paypal.pds.components.AvatarSource avatarSource, com.paypal.pds.core.AnalyticsScope analyticsScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
        this.source = avatarSource;
        this.analyticsScope = analyticsScope;
    }

    public final com.paypal.pds.components.AvatarSource getSource() {
        return this.source;
    }

    public /* synthetic */ AvatarStackSource(com.paypal.pds.components.AvatarSource avatarSource, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(avatarSource, (i & 2) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : analyticsScope);
    }

    public final com.paypal.pds.core.AnalyticsScope getAnalyticsScope() {
        return this.analyticsScope;
    }

    public final java.lang.String toString() {
        com.paypal.pds.components.AvatarSource avatarSource = this.source;
        com.paypal.pds.core.AnalyticsScope analyticsScope = this.analyticsScope;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AvatarStackSource(source=");
        sb.append(avatarSource);
        sb.append(", analyticsScope=");
        sb.append(analyticsScope);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.source.hashCode() * 31) + this.analyticsScope.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.AvatarStackSource)) {
            return false;
        }
        com.paypal.pds.components.AvatarStackSource avatarStackSource = (com.paypal.pds.components.AvatarStackSource) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.source, avatarStackSource.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.analyticsScope, avatarStackSource.analyticsScope);
    }

    public final com.paypal.pds.components.AvatarStackSource copy(com.paypal.pds.components.AvatarSource source, com.paypal.pds.core.AnalyticsScope analyticsScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
        return new com.paypal.pds.components.AvatarStackSource(source, analyticsScope);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.core.AnalyticsScope getAnalyticsScope() {
        return this.analyticsScope;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.components.AvatarSource getSource() {
        return this.source;
    }

    public static /* synthetic */ com.paypal.pds.components.AvatarStackSource copy$default(com.paypal.pds.components.AvatarStackSource avatarStackSource, com.paypal.pds.components.AvatarSource avatarSource, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            avatarSource = avatarStackSource.source;
        }
        if ((i & 2) != 0) {
            analyticsScope = avatarStackSource.analyticsScope;
        }
        return avatarStackSource.copy(avatarSource, analyticsScope);
    }
}
