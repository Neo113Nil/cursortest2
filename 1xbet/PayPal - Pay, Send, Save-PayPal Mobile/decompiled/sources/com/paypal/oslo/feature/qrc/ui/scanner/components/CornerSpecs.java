package com.paypal.oslo.feature.qrc.ui.scanner.components;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;", "", "Lcom/paypal/oslo/feature/qrc/ui/scanner/components/LineSpec;", "horizontal", "vertical", "Lcom/paypal/oslo/feature/qrc/ui/scanner/components/ArcSpec;", "arc", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/scanner/components/LineSpec;Lcom/paypal/oslo/feature/qrc/ui/scanner/components/LineSpec;Lcom/paypal/oslo/feature/qrc/ui/scanner/components/ArcSpec;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/scanner/components/LineSpec;", "component2", "component3", "()Lcom/paypal/oslo/feature/qrc/ui/scanner/components/ArcSpec;", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/scanner/components/LineSpec;Lcom/paypal/oslo/feature/qrc/ui/scanner/components/LineSpec;Lcom/paypal/oslo/feature/qrc/ui/scanner/components/ArcSpec;)Lcom/paypal/oslo/feature/qrc/ui/scanner/components/CornerSpecs;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/components/LineSpec;", "getHorizontal", "getVertical", "Lcom/paypal/oslo/feature/qrc/ui/scanner/components/ArcSpec;", "getArc"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CornerSpecs {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec arc;
    private final com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec horizontal;
    private final com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec vertical;

    public CornerSpecs(com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec lineSpec, com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec lineSpec2, com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec arcSpec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineSpec2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arcSpec, "");
        this.horizontal = lineSpec;
        this.vertical = lineSpec2;
        this.arc = arcSpec;
    }

    public final com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec getHorizontal() {
        return this.horizontal;
    }

    public final com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec getVertical() {
        return this.vertical;
    }

    public final com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec getArc() {
        return this.arc;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec lineSpec = this.horizontal;
        com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec lineSpec2 = this.vertical;
        com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec arcSpec = this.arc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CornerSpecs(horizontal=");
        sb.append(lineSpec);
        sb.append(", vertical=");
        sb.append(lineSpec2);
        sb.append(", arc=");
        sb.append(arcSpec);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.horizontal.hashCode() * 31) + this.vertical.hashCode()) * 31) + this.arc.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs = (com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.horizontal, cornerSpecs.horizontal) && kotlin.jvm.internal.Intrinsics.areEqual(this.vertical, cornerSpecs.vertical) && kotlin.jvm.internal.Intrinsics.areEqual(this.arc, cornerSpecs.arc);
    }

    public final com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs copy(com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec horizontal, com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec vertical, com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec arc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(horizontal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vertical, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arc, "");
        return new com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs(horizontal, vertical, arc);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec getArc() {
        return this.arc;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec getVertical() {
        return this.vertical;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec getHorizontal() {
        return this.horizontal;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs copy$default(com.paypal.oslo.feature.qrc.ui.scanner.components.CornerSpecs cornerSpecs, com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec lineSpec, com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec lineSpec2, com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec arcSpec, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            lineSpec = cornerSpecs.horizontal;
        }
        if ((i & 2) != 0) {
            lineSpec2 = cornerSpecs.vertical;
        }
        if ((i & 4) != 0) {
            arcSpec = cornerSpecs.arc;
        }
        return cornerSpecs.copy(lineSpec, lineSpec2, arcSpec);
    }
}
