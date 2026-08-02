package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0004\u0010\b"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/ScrollContext;", "", "", "isTop", "isBottom", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/ingo/sdk/android/ux/viewprovider/ScrollContext;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ScrollContext {
    public static final int $stable = 0;
    private final boolean isBottom;
    private final boolean isTop;

    public ScrollContext(boolean z, boolean z2) {
        this.isTop = z;
        this.isBottom = z2;
    }

    public final boolean isTop() {
        return this.isTop;
    }

    public final boolean isBottom() {
        return this.isBottom;
    }

    public final java.lang.String toString() {
        boolean z = this.isTop;
        boolean z2 = this.isBottom;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScrollContext(isTop=");
        sb.append(z);
        sb.append(", isBottom=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.isTop) * 31) + java.lang.Boolean.hashCode(this.isBottom);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.android.ux.viewprovider.ScrollContext)) {
            return false;
        }
        com.ingo.sdk.android.ux.viewprovider.ScrollContext scrollContext = (com.ingo.sdk.android.ux.viewprovider.ScrollContext) other;
        return this.isTop == scrollContext.isTop && this.isBottom == scrollContext.isBottom;
    }

    public final com.ingo.sdk.android.ux.viewprovider.ScrollContext copy(boolean isTop, boolean isBottom) {
        return new com.ingo.sdk.android.ux.viewprovider.ScrollContext(isTop, isBottom);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBottom() {
        return this.isBottom;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsTop() {
        return this.isTop;
    }

    public static /* synthetic */ com.ingo.sdk.android.ux.viewprovider.ScrollContext copy$default(com.ingo.sdk.android.ux.viewprovider.ScrollContext scrollContext, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = scrollContext.isTop;
        }
        if ((i & 2) != 0) {
            z2 = scrollContext.isBottom;
        }
        return scrollContext.copy(z, z2);
    }
}
