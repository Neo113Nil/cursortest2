package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002"}, d2 = {"Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "constructor-impl", "(Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/graphics/Shape;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class BlurredEdgeTreatment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.draw.BlurredEdgeTreatment.Companion INSTANCE = new androidx.compose.ui.draw.BlurredEdgeTreatment.Companion(null);
    private static final androidx.compose.ui.graphics.Shape Rectangle = m5544constructorimpl(androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape());
    private static final androidx.compose.ui.graphics.Shape Unbounded = m5544constructorimpl(null);
    private final androidx.compose.ui.graphics.Shape shape;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static androidx.compose.ui.graphics.Shape m5544constructorimpl(androidx.compose.ui.graphics.Shape shape) {
        return shape;
    }

    private /* synthetic */ BlurredEdgeTreatment(androidx.compose.ui.graphics.Shape shape) {
        this.shape = shape;
    }

    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/ui/draw/BlurredEdgeTreatment$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "Rectangle", "Landroidx/compose/ui/graphics/Shape;", "getRectangle---Goahg", "()Landroidx/compose/ui/graphics/Shape;", "Unbounded", "getUnbounded---Goahg"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getRectangle---Goahg, reason: not valid java name */
        public final androidx.compose.ui.graphics.Shape m5550getRectangleGoahg() {
            return androidx.compose.ui.draw.BlurredEdgeTreatment.Rectangle;
        }

        /* renamed from: getUnbounded---Goahg, reason: not valid java name */
        public final androidx.compose.ui.graphics.Shape m5551getUnboundedGoahg() {
            return androidx.compose.ui.draw.BlurredEdgeTreatment.Unbounded;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.graphics.Shape m5549unboximpl() {
        return this.shape;
    }

    public final java.lang.String toString() {
        return m5548toStringimpl(this.shape);
    }

    public final int hashCode() {
        return m5547hashCodeimpl(this.shape);
    }

    public final boolean equals(java.lang.Object other) {
        return m5545equalsimpl(this.shape, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5548toStringimpl(androidx.compose.ui.graphics.Shape shape) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BlurredEdgeTreatment(shape=");
        sb.append(shape);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5547hashCodeimpl(androidx.compose.ui.graphics.Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5546equalsimpl0(androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.graphics.Shape shape2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(shape, shape2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5545equalsimpl(androidx.compose.ui.graphics.Shape shape, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.draw.BlurredEdgeTreatment) && kotlin.jvm.internal.Intrinsics.areEqual(shape, ((androidx.compose.ui.draw.BlurredEdgeTreatment) obj).m5549unboximpl());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.draw.BlurredEdgeTreatment m5543boximpl(androidx.compose.ui.graphics.Shape shape) {
        return new androidx.compose.ui.draw.BlurredEdgeTreatment(shape);
    }
}
