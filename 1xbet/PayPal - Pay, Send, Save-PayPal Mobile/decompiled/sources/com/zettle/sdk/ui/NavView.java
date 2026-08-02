package com.zettle.sdk.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/zettle/sdk/ui/NavView;", "", "Landroidx/fragment/app/Fragment;", "fragment", "", "replace", "", "backstackTag", "<init>", "(Landroidx/fragment/app/Fragment;ZLjava/lang/String;)V", "component1", "()Landroidx/fragment/app/Fragment;", "component2", "()Z", "component3", "()Ljava/lang/String;", "copy", "(Landroidx/fragment/app/Fragment;ZLjava/lang/String;)Lcom/zettle/sdk/ui/NavView;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBackstackTag", "Landroidx/fragment/app/Fragment;", "getFragment", "Z", "getReplace"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NavView {
    private final java.lang.String backstackTag;
    private final androidx.fragment.app.Fragment fragment;
    private final boolean replace;

    public NavView(androidx.fragment.app.Fragment fragment, boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        this.fragment = fragment;
        this.replace = z;
        this.backstackTag = str;
    }

    public /* synthetic */ NavView(androidx.fragment.app.Fragment fragment, boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str);
    }

    public final java.lang.String getBackstackTag() {
        return this.backstackTag;
    }

    public final androidx.fragment.app.Fragment getFragment() {
        return this.fragment;
    }

    public final boolean getReplace() {
        return this.replace;
    }

    public final java.lang.String toString() {
        androidx.fragment.app.Fragment fragment = this.fragment;
        boolean z = this.replace;
        java.lang.String str = this.backstackTag;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavView(fragment=");
        sb.append(fragment);
        sb.append(", replace=");
        sb.append(z);
        sb.append(", backstackTag=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.fragment.hashCode();
        boolean z = this.replace;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        java.lang.String str = this.backstackTag;
        return (((hashCode * 31) + i) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.ui.NavView)) {
            return false;
        }
        com.zettle.sdk.ui.NavView navView = (com.zettle.sdk.ui.NavView) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fragment, navView.fragment) && this.replace == navView.replace && kotlin.jvm.internal.Intrinsics.areEqual(this.backstackTag, navView.backstackTag);
    }

    public final com.zettle.sdk.ui.NavView copy(androidx.fragment.app.Fragment fragment, boolean replace, java.lang.String backstackTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        return new com.zettle.sdk.ui.NavView(fragment, replace, backstackTag);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBackstackTag() {
        return this.backstackTag;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getReplace() {
        return this.replace;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.fragment.app.Fragment getFragment() {
        return this.fragment;
    }

    public static /* synthetic */ com.zettle.sdk.ui.NavView copy$default(com.zettle.sdk.ui.NavView navView, androidx.fragment.app.Fragment fragment, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fragment = navView.fragment;
        }
        if ((i & 2) != 0) {
            z = navView.replace;
        }
        if ((i & 4) != 0) {
            str = navView.backstackTag;
        }
        return navView.copy(fragment, z, str);
    }
}
