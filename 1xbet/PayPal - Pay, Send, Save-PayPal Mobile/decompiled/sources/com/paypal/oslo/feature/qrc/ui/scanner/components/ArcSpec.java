package com.paypal.oslo.feature.qrc.ui.scanner.components;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b%\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/components/ArcSpec;", "", "", "startAngle", "sweepAngle", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(FFJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()F", "component2", "component3-F1C5BW0", "()J", "component3", "component4-NH-jbRc", "component4", "copy-UxnYL8s", "(FFJJ)Lcom/paypal/oslo/feature/qrc/ui/scanner/components/ArcSpec;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getStartAngle", "getSweepAngle", "J", "getTopLeft-F1C5BW0", "getSize-NH-jbRc"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ArcSpec {
    public static final int $stable = 0;
    private final long size;
    private final float startAngle;
    private final float sweepAngle;
    private final long topLeft;

    private ArcSpec(float f, float f2, long j, long j2) {
        this.startAngle = f;
        this.sweepAngle = f2;
        this.topLeft = j;
        this.size = j2;
    }

    public final float getStartAngle() {
        return this.startAngle;
    }

    public final float getSweepAngle() {
        return this.sweepAngle;
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m17924getTopLeftF1C5BW0() {
        return this.topLeft;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m17923getSizeNHjbRc() {
        return this.size;
    }

    public final java.lang.String toString() {
        float f = this.startAngle;
        float f2 = this.sweepAngle;
        java.lang.String m5760toStringimpl = androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.topLeft);
        java.lang.String m5825toStringimpl = androidx.compose.ui.geometry.Size.m5825toStringimpl(this.size);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ArcSpec(startAngle=");
        sb.append(f);
        sb.append(", sweepAngle=");
        sb.append(f2);
        sb.append(", topLeft=");
        sb.append(m5760toStringimpl);
        sb.append(", size=");
        sb.append(m5825toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Float.hashCode(this.startAngle) * 31) + java.lang.Float.hashCode(this.sweepAngle)) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.topLeft)) * 31) + androidx.compose.ui.geometry.Size.m5822hashCodeimpl(this.size);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec arcSpec = (com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec) other;
        return java.lang.Float.compare(this.startAngle, arcSpec.startAngle) == 0 && java.lang.Float.compare(this.sweepAngle, arcSpec.sweepAngle) == 0 && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.topLeft, arcSpec.topLeft) && androidx.compose.ui.geometry.Size.m5817equalsimpl0(this.size, arcSpec.size);
    }

    /* renamed from: copy-UxnYL8s, reason: not valid java name */
    public final com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec m17922copyUxnYL8s(float startAngle, float sweepAngle, long topLeft, long size) {
        return new com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec(startAngle, sweepAngle, topLeft, size, null);
    }

    /* renamed from: component4-NH-jbRc, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name and from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    /* renamed from: component2, reason: from getter */
    public final float getSweepAngle() {
        return this.sweepAngle;
    }

    /* renamed from: component1, reason: from getter */
    public final float getStartAngle() {
        return this.startAngle;
    }

    /* renamed from: copy-UxnYL8s$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec m17919copyUxnYL8s$default(com.paypal.oslo.feature.qrc.ui.scanner.components.ArcSpec arcSpec, float f, float f2, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = arcSpec.startAngle;
        }
        if ((i & 2) != 0) {
            f2 = arcSpec.sweepAngle;
        }
        float f3 = f2;
        if ((i & 4) != 0) {
            j = arcSpec.topLeft;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = arcSpec.size;
        }
        return arcSpec.m17922copyUxnYL8s(f, f3, j3, j2);
    }

    public /* synthetic */ ArcSpec(float f, float f2, long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, j, j2);
    }
}
