package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0019*\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\t"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "", "width", "height", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "create", "()Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "node", "", "update", "(Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", com.visa.cbp.getEncExpo.warmup, "getHeight", "getWidth"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LottieAnimationSizeElement extends androidx.compose.ui.node.ModifierNodeElement<com.airbnb.lottie.compose.LottieAnimationSizeNode> {
    public static final int $stable = 0;
    private final int height;
    private final int width;

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public LottieAnimationSizeElement(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final com.airbnb.lottie.compose.LottieAnimationSizeNode create() {
        return new com.airbnb.lottie.compose.LottieAnimationSizeNode(this.width, this.height);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(com.airbnb.lottie.compose.LottieAnimationSizeNode node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        node.setWidth(this.width);
        node.setHeight(this.height);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inspectorInfo, "");
        inspectorInfo.setName("Lottie Size");
        inspectorInfo.getProperties().set("width", java.lang.Integer.valueOf(this.width));
        inspectorInfo.getProperties().set("height", java.lang.Integer.valueOf(this.height));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.airbnb.lottie.compose.LottieAnimationSizeElement)) {
            return false;
        }
        com.airbnb.lottie.compose.LottieAnimationSizeElement lottieAnimationSizeElement = (com.airbnb.lottie.compose.LottieAnimationSizeElement) other;
        return this.width == lottieAnimationSizeElement.width && this.height == lottieAnimationSizeElement.height;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.width) * 31) + java.lang.Integer.hashCode(this.height);
    }

    public final java.lang.String toString() {
        int i = this.width;
        int i2 = this.height;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LottieAnimationSizeElement(width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final com.airbnb.lottie.compose.LottieAnimationSizeElement copy(int width, int height) {
        return new com.airbnb.lottie.compose.LottieAnimationSizeElement(width, height);
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public static /* synthetic */ com.airbnb.lottie.compose.LottieAnimationSizeElement copy$default(com.airbnb.lottie.compose.LottieAnimationSizeElement lottieAnimationSizeElement, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = lottieAnimationSizeElement.width;
        }
        if ((i3 & 2) != 0) {
            i2 = lottieAnimationSizeElement.height;
        }
        return lottieAnimationSizeElement.copy(i, i2);
    }
}
