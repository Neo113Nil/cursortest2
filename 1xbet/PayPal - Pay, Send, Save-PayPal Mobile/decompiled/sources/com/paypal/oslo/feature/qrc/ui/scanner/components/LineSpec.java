package com.paypal.oslo.feature.qrc.ui.scanner.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/components/LineSpec;", "", "Landroidx/compose/ui/geometry/Offset;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-F1C5BW0", "()J", "component1", "component2-F1C5BW0", "component2", "copy-0a9Yr6o", "(JJ)Lcom/paypal/oslo/feature/qrc/ui/scanner/components/LineSpec;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getStart-F1C5BW0", "getEnd-F1C5BW0"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LineSpec {
    public static final int $stable = 0;
    private final long end;
    private final long start;

    private LineSpec(long j, long j2) {
        this.start = j;
        this.end = j2;
    }

    /* renamed from: getStart-F1C5BW0, reason: not valid java name */
    public final long m17933getStartF1C5BW0() {
        return this.start;
    }

    /* renamed from: getEnd-F1C5BW0, reason: not valid java name */
    public final long m17932getEndF1C5BW0() {
        return this.end;
    }

    public final java.lang.String toString() {
        java.lang.String m5760toStringimpl = androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.start);
        java.lang.String m5760toStringimpl2 = androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.end);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineSpec(start=");
        sb.append(m5760toStringimpl);
        sb.append(", end=");
        sb.append(m5760toStringimpl2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.start) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.end);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec lineSpec = (com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec) other;
        return androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.start, lineSpec.start) && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.end, lineSpec.end);
    }

    /* renamed from: copy-0a9Yr6o, reason: not valid java name */
    public final com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec m17931copy0a9Yr6o(long start, long end) {
        return new com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec(start, end, null);
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name and from getter */
    public final long getEnd() {
        return this.end;
    }

    /* renamed from: component1-F1C5BW0, reason: not valid java name and from getter */
    public final long getStart() {
        return this.start;
    }

    /* renamed from: copy-0a9Yr6o$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec m17928copy0a9Yr6o$default(com.paypal.oslo.feature.qrc.ui.scanner.components.LineSpec lineSpec, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = lineSpec.start;
        }
        if ((i & 2) != 0) {
            j2 = lineSpec.end;
        }
        return lineSpec.m17931copy0a9Yr6o(j, j2);
    }

    public /* synthetic */ LineSpec(long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
