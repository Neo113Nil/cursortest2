package com.zettle.sdk.common.ui.components.pagerindicator;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\"\u0010\u0016\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010%R\"\u0010)\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u0010\"\u0004\b+\u0010 R\"\u0010,\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010 "}, d2 = {"Lcom/zettle/sdk/common/ui/components/pagerindicator/OttoPagerIndicatorAttributes;", "", "Landroid/content/res/TypedArray;", "attrsTypedArray", "<init>", "(Landroid/content/res/TypedArray;)V", "component1", "()Landroid/content/res/TypedArray;", "copy", "(Landroid/content/res/TypedArray;)Lcom/zettle/sdk/common/ui/components/pagerindicator/OttoPagerIndicatorAttributes;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/content/res/TypedArray;", "getAttrsTypedArray", "hideNavigationCta", "Z", "getHideNavigationCta", "()Z", "setHideNavigationCta", "(Z)V", "maxVisibleDots", com.visa.cbp.getEncExpo.warmup, "getMaxVisibleDots", "setMaxVisibleDots", "(I)V", "navLeftContentDescription", "Ljava/lang/String;", "getNavLeftContentDescription", "setNavLeftContentDescription", "(Ljava/lang/String;)V", "navRightContentDescription", "getNavRightContentDescription", "setNavRightContentDescription", "selectedDotColor", "getSelectedDotColor", "setSelectedDotColor", "unselectedDotColor", "getUnselectedDotColor", "setUnselectedDotColor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class OttoPagerIndicatorAttributes {
    private final android.content.res.TypedArray attrsTypedArray;
    private boolean hideNavigationCta;
    private int maxVisibleDots;
    private java.lang.String navLeftContentDescription;
    private java.lang.String navRightContentDescription;
    private int selectedDotColor;
    private int unselectedDotColor;

    public OttoPagerIndicatorAttributes(android.content.res.TypedArray typedArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "");
        this.attrsTypedArray = typedArray;
        this.maxVisibleDots = 5;
        try {
            this.maxVisibleDots = typedArray.getInt(com.zettle.sdk.common.ui.R.styleable.OttoPagerIndicator_pi_maxVisibleDots, 5);
            this.unselectedDotColor = typedArray.getColor(com.zettle.sdk.common.ui.R.styleable.OttoPagerIndicator_pi_unselectedDotColor, androidx.core.content.res.ResourcesCompat.getColor(typedArray.getResources(), com.zettle.sdk.common.ui.R.color.borderDivider, null));
            this.selectedDotColor = typedArray.getColor(com.zettle.sdk.common.ui.R.styleable.OttoPagerIndicator_pi_selectedDotColor, androidx.core.content.res.ResourcesCompat.getColor(typedArray.getResources(), com.zettle.sdk.common.ui.R.color.borderAction, null));
            this.hideNavigationCta = typedArray.getBoolean(com.zettle.sdk.common.ui.R.styleable.OttoPagerIndicator_pi_hideNavigationCta, false);
            this.navLeftContentDescription = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoPagerIndicator_pi_navLeftContentDescription);
            this.navRightContentDescription = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoPagerIndicator_pi_navRightContentDescription);
            typedArray.recycle();
        } catch (java.lang.Throwable th) {
            this.attrsTypedArray.recycle();
            throw th;
        }
    }

    public final android.content.res.TypedArray getAttrsTypedArray() {
        return this.attrsTypedArray;
    }

    public final int getMaxVisibleDots() {
        return this.maxVisibleDots;
    }

    public final void setMaxVisibleDots(int i) {
        this.maxVisibleDots = i;
    }

    public final int getUnselectedDotColor() {
        return this.unselectedDotColor;
    }

    public final void setUnselectedDotColor(int i) {
        this.unselectedDotColor = i;
    }

    public final int getSelectedDotColor() {
        return this.selectedDotColor;
    }

    public final void setSelectedDotColor(int i) {
        this.selectedDotColor = i;
    }

    public final boolean getHideNavigationCta() {
        return this.hideNavigationCta;
    }

    public final void setHideNavigationCta(boolean z) {
        this.hideNavigationCta = z;
    }

    public final java.lang.String getNavLeftContentDescription() {
        return this.navLeftContentDescription;
    }

    public final void setNavLeftContentDescription(java.lang.String str) {
        this.navLeftContentDescription = str;
    }

    public final java.lang.String getNavRightContentDescription() {
        return this.navRightContentDescription;
    }

    public final void setNavRightContentDescription(java.lang.String str) {
        this.navRightContentDescription = str;
    }

    public final java.lang.String toString() {
        android.content.res.TypedArray typedArray = this.attrsTypedArray;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OttoPagerIndicatorAttributes(attrsTypedArray=");
        sb.append(typedArray);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.attrsTypedArray.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorAttributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.attrsTypedArray, ((com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorAttributes) other).attrsTypedArray);
    }

    public final com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorAttributes copy(android.content.res.TypedArray attrsTypedArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrsTypedArray, "");
        return new com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorAttributes(attrsTypedArray);
    }

    /* renamed from: component1, reason: from getter */
    public final android.content.res.TypedArray getAttrsTypedArray() {
        return this.attrsTypedArray;
    }

    public static /* synthetic */ com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorAttributes copy$default(com.zettle.sdk.common.ui.components.pagerindicator.OttoPagerIndicatorAttributes ottoPagerIndicatorAttributes, android.content.res.TypedArray typedArray, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            typedArray = ottoPagerIndicatorAttributes.attrsTypedArray;
        }
        return ottoPagerIndicatorAttributes.copy(typedArray);
    }
}
