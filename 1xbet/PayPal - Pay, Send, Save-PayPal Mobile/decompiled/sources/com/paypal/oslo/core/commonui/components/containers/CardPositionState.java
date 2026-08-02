package com.paypal.oslo.core.commonui.components.containers;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/containers/CardPositionState;", "", "", "scale", "xOffset", "yOffset", androidx.constraintlayout.motion.widget.Key.ROTATION, "zIndex", "<init>", "(FFFFF)V", "component1", "()F", "component2", "component3", "component4", "component5", "copy", "(FFFFF)Lcom/paypal/oslo/core/commonui/components/containers/CardPositionState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getScale", "getXOffset", "getYOffset", "getRotation", "getZIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CardPositionState {
    public static final int $stable = 0;
    private final float rotation;
    private final float scale;
    private final float xOffset;
    private final float yOffset;
    private final float zIndex;

    public CardPositionState(float f, float f2, float f3, float f4, float f5) {
        this.scale = f;
        this.xOffset = f2;
        this.yOffset = f3;
        this.rotation = f4;
        this.zIndex = f5;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getXOffset() {
        return this.xOffset;
    }

    public final float getYOffset() {
        return this.yOffset;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    public final java.lang.String toString() {
        float f = this.scale;
        float f2 = this.xOffset;
        float f3 = this.yOffset;
        float f4 = this.rotation;
        float f5 = this.zIndex;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardPositionState(scale=");
        sb.append(f);
        sb.append(", xOffset=");
        sb.append(f2);
        sb.append(", yOffset=");
        sb.append(f3);
        sb.append(", rotation=");
        sb.append(f4);
        sb.append(", zIndex=");
        sb.append(f5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Float.hashCode(this.scale) * 31) + java.lang.Float.hashCode(this.xOffset)) * 31) + java.lang.Float.hashCode(this.yOffset)) * 31) + java.lang.Float.hashCode(this.rotation)) * 31) + java.lang.Float.hashCode(this.zIndex);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.commonui.components.containers.CardPositionState)) {
            return false;
        }
        com.paypal.oslo.core.commonui.components.containers.CardPositionState cardPositionState = (com.paypal.oslo.core.commonui.components.containers.CardPositionState) other;
        return java.lang.Float.compare(this.scale, cardPositionState.scale) == 0 && java.lang.Float.compare(this.xOffset, cardPositionState.xOffset) == 0 && java.lang.Float.compare(this.yOffset, cardPositionState.yOffset) == 0 && java.lang.Float.compare(this.rotation, cardPositionState.rotation) == 0 && java.lang.Float.compare(this.zIndex, cardPositionState.zIndex) == 0;
    }

    public final com.paypal.oslo.core.commonui.components.containers.CardPositionState copy(float scale, float xOffset, float yOffset, float rotation, float zIndex) {
        return new com.paypal.oslo.core.commonui.components.containers.CardPositionState(scale, xOffset, yOffset, rotation, zIndex);
    }

    /* renamed from: component5, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    /* renamed from: component4, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* renamed from: component3, reason: from getter */
    public final float getYOffset() {
        return this.yOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final float getXOffset() {
        return this.xOffset;
    }

    /* renamed from: component1, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    public static /* synthetic */ com.paypal.oslo.core.commonui.components.containers.CardPositionState copy$default(com.paypal.oslo.core.commonui.components.containers.CardPositionState cardPositionState, float f, float f2, float f3, float f4, float f5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = cardPositionState.scale;
        }
        if ((i & 2) != 0) {
            f2 = cardPositionState.xOffset;
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = cardPositionState.yOffset;
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = cardPositionState.rotation;
        }
        float f8 = f4;
        if ((i & 16) != 0) {
            f5 = cardPositionState.zIndex;
        }
        return cardPositionState.copy(f, f6, f7, f8, f5);
    }
}
