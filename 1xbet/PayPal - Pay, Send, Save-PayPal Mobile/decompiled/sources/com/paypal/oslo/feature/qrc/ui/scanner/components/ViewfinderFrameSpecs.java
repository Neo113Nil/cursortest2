package com.paypal.oslo.feature.qrc.ui.scanner.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/components/ViewfinderFrameSpecs;", "", "Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;", "topLeft", "topRight", "bottomLeft", "bottomRight", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;", "component2", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;)Lcom/paypal/oslo/feature/qrc/ui/scanner/components/ViewfinderFrameSpecs;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;", "getTopLeft", "getTopRight", "getBottomLeft", "getBottomRight"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ViewfinderFrameSpecs {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs bottomLeft;
    private final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs bottomRight;
    private final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs topLeft;
    private final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs topRight;

    public ViewfinderFrameSpecs(com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs, com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs2, com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs3, com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cornerSpecs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cornerSpecs2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cornerSpecs3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cornerSpecs4, "");
        this.topLeft = cornerSpecs;
        this.topRight = cornerSpecs2;
        this.bottomLeft = cornerSpecs3;
        this.bottomRight = cornerSpecs4;
    }

    public final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs getTopLeft() {
        return this.topLeft;
    }

    public final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs getTopRight() {
        return this.topRight;
    }

    public final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs getBottomLeft() {
        return this.bottomLeft;
    }

    public final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs getBottomRight() {
        return this.bottomRight;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs = this.topLeft;
        com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs2 = this.topRight;
        com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs3 = this.bottomLeft;
        com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs4 = this.bottomRight;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewfinderFrameSpecs(topLeft=");
        sb.append(cornerSpecs);
        sb.append(", topRight=");
        sb.append(cornerSpecs2);
        sb.append(", bottomLeft=");
        sb.append(cornerSpecs3);
        sb.append(", bottomRight=");
        sb.append(cornerSpecs4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.topLeft.hashCode() * 31) + this.topRight.hashCode()) * 31) + this.bottomLeft.hashCode()) * 31) + this.bottomRight.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.components.ViewfinderFrameSpecs)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.ui.scanner.components.ViewfinderFrameSpecs viewfinderFrameSpecs = (com.paypal.oslo.feature.qrc.ui.scanner.components.ViewfinderFrameSpecs) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.topLeft, viewfinderFrameSpecs.topLeft) && kotlin.jvm.internal.Intrinsics.areEqual(this.topRight, viewfinderFrameSpecs.topRight) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomLeft, viewfinderFrameSpecs.bottomLeft) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomRight, viewfinderFrameSpecs.bottomRight);
    }

    public final com.paypal.oslo.feature.qrc.ui.scanner.components.ViewfinderFrameSpecs copy(com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs topLeft, com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs topRight, com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs bottomLeft, com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs bottomRight) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topLeft, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topRight, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomLeft, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomRight, "");
        return new com.paypal.oslo.feature.qrc.ui.scanner.components.ViewfinderFrameSpecs(topLeft, topRight, bottomLeft, bottomRight);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs getBottomRight() {
        return this.bottomRight;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs getBottomLeft() {
        return this.bottomLeft;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs getTopRight() {
        return this.topRight;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs getTopLeft() {
        return this.topLeft;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.components.ViewfinderFrameSpecs copy$default(com.paypal.oslo.feature.qrc.ui.scanner.components.ViewfinderFrameSpecs viewfinderFrameSpecs, com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs, com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs2, com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs3, com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cornerSpecs = viewfinderFrameSpecs.topLeft;
        }
        if ((i & 2) != 0) {
            cornerSpecs2 = viewfinderFrameSpecs.topRight;
        }
        if ((i & 4) != 0) {
            cornerSpecs3 = viewfinderFrameSpecs.bottomLeft;
        }
        if ((i & 8) != 0) {
            cornerSpecs4 = viewfinderFrameSpecs.bottomRight;
        }
        return viewfinderFrameSpecs.copy(cornerSpecs, cornerSpecs2, cornerSpecs3, cornerSpecs4);
    }
}
