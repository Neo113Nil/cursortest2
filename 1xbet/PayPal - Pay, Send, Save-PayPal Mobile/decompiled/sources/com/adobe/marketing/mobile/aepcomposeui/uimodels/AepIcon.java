package com.adobe.marketing.mobile.aepcomposeui.uimodels;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepIcon;", "", "", "drawableId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/adobe/marketing/mobile/aepcomposeui/uimodels/AepIcon;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getDrawableId"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AepIcon {
    public static final int $stable = 0;
    private final int drawableId;

    public AepIcon(int i) {
        this.drawableId = i;
    }

    public final int getDrawableId() {
        return this.drawableId;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AepIcon(drawableId=");
        sb.append(this.drawableId);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.drawableId);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.adobe.marketing.mobile.aepcomposeui.uimodels.AepIcon) && this.drawableId == ((com.adobe.marketing.mobile.aepcomposeui.uimodels.AepIcon) other).drawableId;
    }

    public final com.adobe.marketing.mobile.aepcomposeui.uimodels.AepIcon copy(int drawableId) {
        return new com.adobe.marketing.mobile.aepcomposeui.uimodels.AepIcon(drawableId);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDrawableId() {
        return this.drawableId;
    }

    public static /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.uimodels.AepIcon copy$default(com.adobe.marketing.mobile.aepcomposeui.uimodels.AepIcon aepIcon, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = aepIcon.drawableId;
        }
        return aepIcon.copy(i);
    }
}
