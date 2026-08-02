package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/pds/components/TabData;", "", "", "text", "Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/pds/core/AnalyticsScope;", "analyticsScope", "<init>", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/core/AnalyticsScope;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/pds/core/Icon;", "component3", "()Lcom/paypal/pds/core/AnalyticsScope;", "copy", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/core/AnalyticsScope;)Lcom/paypal/pds/components/TabData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "Lcom/paypal/pds/core/Icon;", "getIcon", "Lcom/paypal/pds/core/AnalyticsScope;", "getAnalyticsScope"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class TabData {
    public static final int $stable = 0;
    private final com.paypal.pds.core.AnalyticsScope analyticsScope;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String text;

    public TabData(java.lang.String str, com.paypal.pds.core.Icon icon, com.paypal.pds.core.AnalyticsScope analyticsScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
        this.text = str;
        this.icon = icon;
        this.analyticsScope = analyticsScope;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public /* synthetic */ TabData(java.lang.String str, com.paypal.pds.core.Icon icon, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : icon, (i & 4) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : analyticsScope);
    }

    public final com.paypal.pds.core.AnalyticsScope getAnalyticsScope() {
        return this.analyticsScope;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.text;
        com.paypal.pds.core.Icon icon = this.icon;
        com.paypal.pds.core.AnalyticsScope analyticsScope = this.analyticsScope;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TabData(text=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(", analyticsScope=");
        sb.append(analyticsScope);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode();
        com.paypal.pds.core.Icon icon = this.icon;
        return (((hashCode * 31) + (icon == null ? 0 : icon.hashCode())) * 31) + this.analyticsScope.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.TabData)) {
            return false;
        }
        com.paypal.pds.components.TabData tabData = (com.paypal.pds.components.TabData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, tabData.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, tabData.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.analyticsScope, tabData.analyticsScope);
    }

    public final com.paypal.pds.components.TabData copy(java.lang.String text, com.paypal.pds.core.Icon icon, com.paypal.pds.core.AnalyticsScope analyticsScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
        return new com.paypal.pds.components.TabData(text, icon, analyticsScope);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.core.AnalyticsScope getAnalyticsScope() {
        return this.analyticsScope;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.pds.components.TabData copy$default(com.paypal.pds.components.TabData tabData, java.lang.String str, com.paypal.pds.core.Icon icon, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = tabData.text;
        }
        if ((i & 2) != 0) {
            icon = tabData.icon;
        }
        if ((i & 4) != 0) {
            analyticsScope = tabData.analyticsScope;
        }
        return tabData.copy(str, icon, analyticsScope);
    }
}
