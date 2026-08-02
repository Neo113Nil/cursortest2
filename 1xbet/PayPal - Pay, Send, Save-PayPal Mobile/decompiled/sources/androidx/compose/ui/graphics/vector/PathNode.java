package androidx.compose.ui.graphics.vector;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0013\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t\u0082\u0001\u0013\u001e\u001f !\"#$%&'()*+,-./0"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode;", "", "", "p0", "p1", "<init>", "(ZZ)V", "isCurve", "Z", "()Z", "isQuad", com.knotapi.knot.utilities.Constants.META_CLOSE, "RelativeMoveTo", "MoveTo", "RelativeLineTo", "LineTo", "RelativeHorizontalTo", "HorizontalTo", "RelativeVerticalTo", "VerticalTo", "RelativeCurveTo", "CurveTo", "RelativeReflectiveCurveTo", "ReflectiveCurveTo", "RelativeQuadTo", "QuadTo", "RelativeReflectiveQuadTo", "ReflectiveQuadTo", "RelativeArcTo", "ArcTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PathNode {
    public static final int $stable = 0;
    private final boolean isCurve;
    private final boolean isQuad;

    private PathNode(boolean z, boolean z2) {
        this.isCurve = z;
        this.isQuad = z2;
    }

    public /* synthetic */ PathNode(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, null);
    }

    /* renamed from: isCurve, reason: from getter */
    public final boolean getIsCurve() {
        return this.isCurve;
    }

    /* renamed from: isQuad, reason: from getter */
    public final boolean getIsQuad() {
        return this.isQuad;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Close extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        public static final androidx.compose.ui.graphics.vector.PathNode.Close INSTANCE = new androidx.compose.ui.graphics.vector.PathNode.Close();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Close() {
            super(r2, r2, 3, null);
            boolean z = false;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "dy", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDx", "getDy"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class RelativeMoveTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float dx;
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RelativeMoveTo(float f, float f2) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.dx = f;
            this.dy = f2;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeMoveTo(dx=");
            sb.append(this.dx);
            sb.append(", dy=");
            sb.append(this.dy);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Float.hashCode(this.dx) * 31) + java.lang.Float.hashCode(this.dy);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo relativeMoveTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo) other;
            return java.lang.Float.compare(this.dx, relativeMoveTo.dx) == 0 && java.lang.Float.compare(this.dy, relativeMoveTo.dy) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo copy(float dx, float dy) {
            return new androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo(dx, dy);
        }

        /* renamed from: component2, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        /* renamed from: component1, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo copy$default(androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo relativeMoveTo, float f, float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = relativeMoveTo.dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeMoveTo.dy;
            }
            return relativeMoveTo.copy(f, f2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", "y", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getX", "getY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class MoveTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float x;
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MoveTo(float f, float f2) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.x = f;
            this.y = f2;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoveTo(x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Float.hashCode(this.x) * 31) + java.lang.Float.hashCode(this.y);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.MoveTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.MoveTo moveTo = (androidx.compose.ui.graphics.vector.PathNode.MoveTo) other;
            return java.lang.Float.compare(this.x, moveTo.x) == 0 && java.lang.Float.compare(this.y, moveTo.y) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.MoveTo copy(float x, float y) {
            return new androidx.compose.ui.graphics.vector.PathNode.MoveTo(x, y);
        }

        /* renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.MoveTo copy$default(androidx.compose.ui.graphics.vector.PathNode.MoveTo moveTo, float f, float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = moveTo.x;
            }
            if ((i & 2) != 0) {
                f2 = moveTo.y;
            }
            return moveTo.copy(f, f2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "dy", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDx", "getDy"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class RelativeLineTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float dx;
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RelativeLineTo(float f, float f2) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.dx = f;
            this.dy = f2;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeLineTo(dx=");
            sb.append(this.dx);
            sb.append(", dy=");
            sb.append(this.dy);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Float.hashCode(this.dx) * 31) + java.lang.Float.hashCode(this.dy);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo relativeLineTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo) other;
            return java.lang.Float.compare(this.dx, relativeLineTo.dx) == 0 && java.lang.Float.compare(this.dy, relativeLineTo.dy) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo copy(float dx, float dy) {
            return new androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo(dx, dy);
        }

        /* renamed from: component2, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        /* renamed from: component1, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo copy$default(androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo relativeLineTo, float f, float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = relativeLineTo.dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeLineTo.dy;
            }
            return relativeLineTo.copy(f, f2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", "y", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getX", "getY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class LineTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float x;
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public LineTo(float f, float f2) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.x = f;
            this.y = f2;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LineTo(x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Float.hashCode(this.x) * 31) + java.lang.Float.hashCode(this.y);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.LineTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.LineTo lineTo = (androidx.compose.ui.graphics.vector.PathNode.LineTo) other;
            return java.lang.Float.compare(this.x, lineTo.x) == 0 && java.lang.Float.compare(this.y, lineTo.y) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.LineTo copy(float x, float y) {
            return new androidx.compose.ui.graphics.vector.PathNode.LineTo(x, y);
        }

        /* renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.LineTo copy$default(androidx.compose.ui.graphics.vector.PathNode.LineTo lineTo, float f, float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = lineTo.x;
            }
            if ((i & 2) != 0) {
                f2 = lineTo.y;
            }
            return lineTo.copy(f, f2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDx"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class RelativeHorizontalTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float dx;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RelativeHorizontalTo(float f) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.dx = f;
        }

        public final float getDx() {
            return this.dx;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeHorizontalTo(dx=");
            sb.append(this.dx);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Float.hashCode(this.dx);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo) && java.lang.Float.compare(this.dx, ((androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo) other).dx) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo copy(float dx) {
            return new androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo(dx);
        }

        /* renamed from: component1, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo copy$default(androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo relativeHorizontalTo, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = relativeHorizontalTo.dx;
            }
            return relativeHorizontalTo.copy(f);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getX"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class HorizontalTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float x;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public HorizontalTo(float f) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.x = f;
        }

        public final float getX() {
            return this.x;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HorizontalTo(x=");
            sb.append(this.x);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Float.hashCode(this.x);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.ui.graphics.vector.PathNode.HorizontalTo) && java.lang.Float.compare(this.x, ((androidx.compose.ui.graphics.vector.PathNode.HorizontalTo) other).x) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.HorizontalTo copy(float x) {
            return new androidx.compose.ui.graphics.vector.PathNode.HorizontalTo(x);
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.HorizontalTo copy$default(androidx.compose.ui.graphics.vector.PathNode.HorizontalTo horizontalTo, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = horizontalTo.x;
            }
            return horizontalTo.copy(f);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dy", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDy"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class RelativeVerticalTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RelativeVerticalTo(float f) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.dy = f;
        }

        public final float getDy() {
            return this.dy;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeVerticalTo(dy=");
            sb.append(this.dy);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Float.hashCode(this.dy);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo) && java.lang.Float.compare(this.dy, ((androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo) other).dy) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo copy(float dy) {
            return new androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo(dy);
        }

        /* renamed from: component1, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo copy$default(androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo relativeVerticalTo, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = relativeVerticalTo.dy;
            }
            return relativeVerticalTo.copy(f);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "y", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class VerticalTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public VerticalTo(float f) {
            super(r2, r2, 3, null);
            boolean z = false;
            this.y = f;
        }

        public final float getY() {
            return this.y;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerticalTo(y=");
            sb.append(this.y);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Float.hashCode(this.y);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.ui.graphics.vector.PathNode.VerticalTo) && java.lang.Float.compare(this.y, ((androidx.compose.ui.graphics.vector.PathNode.VerticalTo) other).y) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.VerticalTo copy(float y) {
            return new androidx.compose.ui.graphics.vector.PathNode.VerticalTo(y);
        }

        /* renamed from: component1, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.VerticalTo copy$default(androidx.compose.ui.graphics.vector.PathNode.VerticalTo verticalTo, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = verticalTo.y;
            }
            return verticalTo.copy(f);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010\f"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "<init>", "(FFFFFF)V", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "copy", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDx1", "getDy1", "getDx2", "getDy2", "getDx3", "getDy3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class RelativeCurveTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float dx1;
        private final float dx2;
        private final float dx3;
        private final float dy1;
        private final float dy2;
        private final float dy3;

        public RelativeCurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
            this.dx3 = f5;
            this.dy3 = f6;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final float getDx3() {
            return this.dx3;
        }

        public final float getDy3() {
            return this.dy3;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeCurveTo(dx1=");
            sb.append(this.dx1);
            sb.append(", dy1=");
            sb.append(this.dy1);
            sb.append(", dx2=");
            sb.append(this.dx2);
            sb.append(", dy2=");
            sb.append(this.dy2);
            sb.append(", dx3=");
            sb.append(this.dx3);
            sb.append(", dy3=");
            sb.append(this.dy3);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((java.lang.Float.hashCode(this.dx1) * 31) + java.lang.Float.hashCode(this.dy1)) * 31) + java.lang.Float.hashCode(this.dx2)) * 31) + java.lang.Float.hashCode(this.dy2)) * 31) + java.lang.Float.hashCode(this.dx3)) * 31) + java.lang.Float.hashCode(this.dy3);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo relativeCurveTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo) other;
            return java.lang.Float.compare(this.dx1, relativeCurveTo.dx1) == 0 && java.lang.Float.compare(this.dy1, relativeCurveTo.dy1) == 0 && java.lang.Float.compare(this.dx2, relativeCurveTo.dx2) == 0 && java.lang.Float.compare(this.dy2, relativeCurveTo.dy2) == 0 && java.lang.Float.compare(this.dx3, relativeCurveTo.dx3) == 0 && java.lang.Float.compare(this.dy3, relativeCurveTo.dy3) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo copy(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
            return new androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3);
        }

        /* renamed from: component6, reason: from getter */
        public final float getDy3() {
            return this.dy3;
        }

        /* renamed from: component5, reason: from getter */
        public final float getDx3() {
            return this.dx3;
        }

        /* renamed from: component4, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        /* renamed from: component3, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        /* renamed from: component2, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* renamed from: component1, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo copy$default(androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo relativeCurveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = relativeCurveTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeCurveTo.dy1;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = relativeCurveTo.dx2;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = relativeCurveTo.dy2;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = relativeCurveTo.dx3;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = relativeCurveTo.dy3;
            }
            return relativeCurveTo.copy(f, f7, f8, f9, f10, f6);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010\f"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x1", "y1", "x2", "y2", "x3", "y3", "<init>", "(FFFFFF)V", "component1", "()F", "component2", "component3", "component4", "component5", "component6", "copy", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getX1", "getY1", "getX2", "getY2", "getX3", "getY3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class CurveTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float x1;
        private final float x2;
        private final float x3;
        private final float y1;
        private final float y2;
        private final float y3;

        public CurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.x1 = f;
            this.y1 = f2;
            this.x2 = f3;
            this.y2 = f4;
            this.x3 = f5;
            this.y3 = f6;
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getY2() {
            return this.y2;
        }

        public final float getX3() {
            return this.x3;
        }

        public final float getY3() {
            return this.y3;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurveTo(x1=");
            sb.append(this.x1);
            sb.append(", y1=");
            sb.append(this.y1);
            sb.append(", x2=");
            sb.append(this.x2);
            sb.append(", y2=");
            sb.append(this.y2);
            sb.append(", x3=");
            sb.append(this.x3);
            sb.append(", y3=");
            sb.append(this.y3);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((java.lang.Float.hashCode(this.x1) * 31) + java.lang.Float.hashCode(this.y1)) * 31) + java.lang.Float.hashCode(this.x2)) * 31) + java.lang.Float.hashCode(this.y2)) * 31) + java.lang.Float.hashCode(this.x3)) * 31) + java.lang.Float.hashCode(this.y3);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.CurveTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.CurveTo curveTo = (androidx.compose.ui.graphics.vector.PathNode.CurveTo) other;
            return java.lang.Float.compare(this.x1, curveTo.x1) == 0 && java.lang.Float.compare(this.y1, curveTo.y1) == 0 && java.lang.Float.compare(this.x2, curveTo.x2) == 0 && java.lang.Float.compare(this.y2, curveTo.y2) == 0 && java.lang.Float.compare(this.x3, curveTo.x3) == 0 && java.lang.Float.compare(this.y3, curveTo.y3) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.CurveTo copy(float x1, float y1, float x2, float y2, float x3, float y3) {
            return new androidx.compose.ui.graphics.vector.PathNode.CurveTo(x1, y1, x2, y2, x3, y3);
        }

        /* renamed from: component6, reason: from getter */
        public final float getY3() {
            return this.y3;
        }

        /* renamed from: component5, reason: from getter */
        public final float getX3() {
            return this.x3;
        }

        /* renamed from: component4, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        /* renamed from: component3, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        /* renamed from: component2, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* renamed from: component1, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.CurveTo copy$default(androidx.compose.ui.graphics.vector.PathNode.CurveTo curveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = curveTo.x1;
            }
            if ((i & 2) != 0) {
                f2 = curveTo.y1;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = curveTo.x2;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = curveTo.y2;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = curveTo.x3;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = curveTo.y3;
            }
            return curveTo.copy(f, f7, f8, f9, f10, f6);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDx1", "getDy1", "getDx2", "getDy2"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class RelativeReflectiveCurveTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb.append(this.dx1);
            sb.append(", dy1=");
            sb.append(this.dy1);
            sb.append(", dx2=");
            sb.append(this.dx2);
            sb.append(", dy2=");
            sb.append(this.dy2);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Float.hashCode(this.dx1) * 31) + java.lang.Float.hashCode(this.dy1)) * 31) + java.lang.Float.hashCode(this.dx2)) * 31) + java.lang.Float.hashCode(this.dy2);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo) other;
            return java.lang.Float.compare(this.dx1, relativeReflectiveCurveTo.dx1) == 0 && java.lang.Float.compare(this.dy1, relativeReflectiveCurveTo.dy1) == 0 && java.lang.Float.compare(this.dx2, relativeReflectiveCurveTo.dx2) == 0 && java.lang.Float.compare(this.dy2, relativeReflectiveCurveTo.dy2) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo copy(float dx1, float dy1, float dx2, float dy2) {
            return new androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2);
        }

        /* renamed from: component4, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        /* renamed from: component3, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        /* renamed from: component2, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* renamed from: component1, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo copy$default(androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveCurveTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveCurveTo.dy1;
            }
            if ((i & 4) != 0) {
                f3 = relativeReflectiveCurveTo.dx2;
            }
            if ((i & 8) != 0) {
                f4 = relativeReflectiveCurveTo.dy2;
            }
            return relativeReflectiveCurveTo.copy(f, f2, f3, f4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getX1", "getY1", "getX2", "getY2"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class ReflectiveCurveTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        public ReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.x1 = f;
            this.y1 = f2;
            this.x2 = f3;
            this.y2 = f4;
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getY2() {
            return this.y2;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReflectiveCurveTo(x1=");
            sb.append(this.x1);
            sb.append(", y1=");
            sb.append(this.y1);
            sb.append(", x2=");
            sb.append(this.x2);
            sb.append(", y2=");
            sb.append(this.y2);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Float.hashCode(this.x1) * 31) + java.lang.Float.hashCode(this.y1)) * 31) + java.lang.Float.hashCode(this.x2)) * 31) + java.lang.Float.hashCode(this.y2);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo reflectiveCurveTo = (androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo) other;
            return java.lang.Float.compare(this.x1, reflectiveCurveTo.x1) == 0 && java.lang.Float.compare(this.y1, reflectiveCurveTo.y1) == 0 && java.lang.Float.compare(this.x2, reflectiveCurveTo.x2) == 0 && java.lang.Float.compare(this.y2, reflectiveCurveTo.y2) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo copy(float x1, float y1, float x2, float y2) {
            return new androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo(x1, y1, x2, y2);
        }

        /* renamed from: component4, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        /* renamed from: component3, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        /* renamed from: component2, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* renamed from: component1, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo copy$default(androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo reflectiveCurveTo, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveCurveTo.x1;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveCurveTo.y1;
            }
            if ((i & 4) != 0) {
                f3 = reflectiveCurveTo.x2;
            }
            if ((i & 8) != 0) {
                f4 = reflectiveCurveTo.y2;
            }
            return reflectiveCurveTo.copy(f, f2, f3, f4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx1", "dy1", "dx2", "dy2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDx1", "getDy1", "getDx2", "getDy2"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class RelativeQuadTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeQuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeQuadTo(dx1=");
            sb.append(this.dx1);
            sb.append(", dy1=");
            sb.append(this.dy1);
            sb.append(", dx2=");
            sb.append(this.dx2);
            sb.append(", dy2=");
            sb.append(this.dy2);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Float.hashCode(this.dx1) * 31) + java.lang.Float.hashCode(this.dy1)) * 31) + java.lang.Float.hashCode(this.dx2)) * 31) + java.lang.Float.hashCode(this.dy2);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo relativeQuadTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo) other;
            return java.lang.Float.compare(this.dx1, relativeQuadTo.dx1) == 0 && java.lang.Float.compare(this.dy1, relativeQuadTo.dy1) == 0 && java.lang.Float.compare(this.dx2, relativeQuadTo.dx2) == 0 && java.lang.Float.compare(this.dy2, relativeQuadTo.dy2) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo copy(float dx1, float dy1, float dx2, float dy2) {
            return new androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo(dx1, dy1, dx2, dy2);
        }

        /* renamed from: component4, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        /* renamed from: component3, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        /* renamed from: component2, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* renamed from: component1, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo copy$default(androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo relativeQuadTo, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = relativeQuadTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeQuadTo.dy1;
            }
            if ((i & 4) != 0) {
                f3 = relativeQuadTo.dx2;
            }
            if ((i & 8) != 0) {
                f4 = relativeQuadTo.dy2;
            }
            return relativeQuadTo.copy(f, f2, f3, f4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x1", "y1", "x2", "y2", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getX1", "getY1", "getX2", "getY2"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class QuadTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        public QuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.x1 = f;
            this.y1 = f2;
            this.x2 = f3;
            this.y2 = f4;
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getY2() {
            return this.y2;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("QuadTo(x1=");
            sb.append(this.x1);
            sb.append(", y1=");
            sb.append(this.y1);
            sb.append(", x2=");
            sb.append(this.x2);
            sb.append(", y2=");
            sb.append(this.y2);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Float.hashCode(this.x1) * 31) + java.lang.Float.hashCode(this.y1)) * 31) + java.lang.Float.hashCode(this.x2)) * 31) + java.lang.Float.hashCode(this.y2);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.QuadTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.QuadTo quadTo = (androidx.compose.ui.graphics.vector.PathNode.QuadTo) other;
            return java.lang.Float.compare(this.x1, quadTo.x1) == 0 && java.lang.Float.compare(this.y1, quadTo.y1) == 0 && java.lang.Float.compare(this.x2, quadTo.x2) == 0 && java.lang.Float.compare(this.y2, quadTo.y2) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.QuadTo copy(float x1, float y1, float x2, float y2) {
            return new androidx.compose.ui.graphics.vector.PathNode.QuadTo(x1, y1, x2, y2);
        }

        /* renamed from: component4, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        /* renamed from: component3, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        /* renamed from: component2, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* renamed from: component1, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.QuadTo copy$default(androidx.compose.ui.graphics.vector.PathNode.QuadTo quadTo, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = quadTo.x1;
            }
            if ((i & 2) != 0) {
                f2 = quadTo.y1;
            }
            if ((i & 4) != 0) {
                f3 = quadTo.x2;
            }
            if ((i & 8) != 0) {
                f4 = quadTo.y2;
            }
            return quadTo.copy(f, f2, f3, f4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "dx", "dy", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDx", "getDy"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class RelativeReflectiveQuadTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float dx;
        private final float dy;

        public RelativeReflectiveQuadTo(float f, float f2) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx = f;
            this.dy = f2;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb.append(this.dx);
            sb.append(", dy=");
            sb.append(this.dy);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Float.hashCode(this.dx) * 31) + java.lang.Float.hashCode(this.dy);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo) other;
            return java.lang.Float.compare(this.dx, relativeReflectiveQuadTo.dx) == 0 && java.lang.Float.compare(this.dy, relativeReflectiveQuadTo.dy) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo copy(float dx, float dy) {
            return new androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo(dx, dy);
        }

        /* renamed from: component2, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        /* renamed from: component1, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo copy$default(androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f, float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveQuadTo.dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveQuadTo.dy;
            }
            return relativeReflectiveQuadTo.copy(f, f2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "x", "y", "<init>", "(FF)V", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getX", "getY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class ReflectiveQuadTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float x;
        private final float y;

        public ReflectiveQuadTo(float f, float f2) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.x = f;
            this.y = f2;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReflectiveQuadTo(x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Float.hashCode(this.x) * 31) + java.lang.Float.hashCode(this.y);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo reflectiveQuadTo = (androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo) other;
            return java.lang.Float.compare(this.x, reflectiveQuadTo.x) == 0 && java.lang.Float.compare(this.y, reflectiveQuadTo.y) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo copy(float x, float y) {
            return new androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo(x, y);
        }

        /* renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo copy$default(androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo reflectiveQuadTo, float f, float f2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveQuadTo.x;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveQuadTo.y;
            }
            return reflectiveQuadTo.copy(f, f2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b\u0007\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b'\u0010\u000eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b(\u0010\u000e"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartDx", "arcStartDy", "<init>", "(FFFZZFF)V", "component1", "()F", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "copy", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHorizontalEllipseRadius", "getVerticalEllipseRadius", "getTheta", "Z", "getArcStartDx", "getArcStartDy"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class RelativeArcTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float arcStartDx;
        private final float arcStartDy;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RelativeArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(r2, r2, 3, null);
            boolean z3 = false;
            this.horizontalEllipseRadius = f;
            this.verticalEllipseRadius = f2;
            this.theta = f3;
            this.isMoreThanHalf = z;
            this.isPositiveArc = z2;
            this.arcStartDx = f4;
            this.arcStartDy = f5;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb.append(this.horizontalEllipseRadius);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.verticalEllipseRadius);
            sb.append(", theta=");
            sb.append(this.theta);
            sb.append(", isMoreThanHalf=");
            sb.append(this.isMoreThanHalf);
            sb.append(", isPositiveArc=");
            sb.append(this.isPositiveArc);
            sb.append(", arcStartDx=");
            sb.append(this.arcStartDx);
            sb.append(", arcStartDy=");
            sb.append(this.arcStartDy);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((java.lang.Float.hashCode(this.horizontalEllipseRadius) * 31) + java.lang.Float.hashCode(this.verticalEllipseRadius)) * 31) + java.lang.Float.hashCode(this.theta)) * 31) + java.lang.Boolean.hashCode(this.isMoreThanHalf)) * 31) + java.lang.Boolean.hashCode(this.isPositiveArc)) * 31) + java.lang.Float.hashCode(this.arcStartDx)) * 31) + java.lang.Float.hashCode(this.arcStartDy);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo relativeArcTo = (androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo) other;
            return java.lang.Float.compare(this.horizontalEllipseRadius, relativeArcTo.horizontalEllipseRadius) == 0 && java.lang.Float.compare(this.verticalEllipseRadius, relativeArcTo.verticalEllipseRadius) == 0 && java.lang.Float.compare(this.theta, relativeArcTo.theta) == 0 && this.isMoreThanHalf == relativeArcTo.isMoreThanHalf && this.isPositiveArc == relativeArcTo.isPositiveArc && java.lang.Float.compare(this.arcStartDx, relativeArcTo.arcStartDx) == 0 && java.lang.Float.compare(this.arcStartDy, relativeArcTo.arcStartDy) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo copy(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float arcStartDx, float arcStartDy) {
            return new androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, arcStartDx, arcStartDy);
        }

        /* renamed from: component7, reason: from getter */
        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        /* renamed from: component6, reason: from getter */
        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsPositiveArc() {
            return this.isPositiveArc;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        /* renamed from: component3, reason: from getter */
        public final float getTheta() {
            return this.theta;
        }

        /* renamed from: component2, reason: from getter */
        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        /* renamed from: component1, reason: from getter */
        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo copy$default(androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo relativeArcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = relativeArcTo.horizontalEllipseRadius;
            }
            if ((i & 2) != 0) {
                f2 = relativeArcTo.verticalEllipseRadius;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = relativeArcTo.theta;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = relativeArcTo.isMoreThanHalf;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = relativeArcTo.isPositiveArc;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = relativeArcTo.arcStartDx;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = relativeArcTo.arcStartDy;
            }
            return relativeArcTo.copy(f, f6, f7, z3, z4, f8, f5);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b\u0007\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b'\u0010\u000eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b(\u0010\u000e"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcStartX", "arcStartY", "<init>", "(FFFZZFF)V", "component1", "()F", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "copy", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHorizontalEllipseRadius", "getVerticalEllipseRadius", "getTheta", "Z", "getArcStartX", "getArcStartY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class ArcTo extends androidx.compose.ui.graphics.vector.PathNode {
        public static final int $stable = 0;
        private final float arcStartX;
        private final float arcStartY;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(r2, r2, 3, null);
            boolean z3 = false;
            this.horizontalEllipseRadius = f;
            this.verticalEllipseRadius = f2;
            this.theta = f3;
            this.isMoreThanHalf = z;
            this.isPositiveArc = z2;
            this.arcStartX = f4;
            this.arcStartY = f5;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        public final float getArcStartX() {
            return this.arcStartX;
        }

        public final float getArcStartY() {
            return this.arcStartY;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb.append(this.horizontalEllipseRadius);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.verticalEllipseRadius);
            sb.append(", theta=");
            sb.append(this.theta);
            sb.append(", isMoreThanHalf=");
            sb.append(this.isMoreThanHalf);
            sb.append(", isPositiveArc=");
            sb.append(this.isPositiveArc);
            sb.append(", arcStartX=");
            sb.append(this.arcStartX);
            sb.append(", arcStartY=");
            sb.append(this.arcStartY);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((java.lang.Float.hashCode(this.horizontalEllipseRadius) * 31) + java.lang.Float.hashCode(this.verticalEllipseRadius)) * 31) + java.lang.Float.hashCode(this.theta)) * 31) + java.lang.Boolean.hashCode(this.isMoreThanHalf)) * 31) + java.lang.Boolean.hashCode(this.isPositiveArc)) * 31) + java.lang.Float.hashCode(this.arcStartX)) * 31) + java.lang.Float.hashCode(this.arcStartY);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.vector.PathNode.ArcTo)) {
                return false;
            }
            androidx.compose.ui.graphics.vector.PathNode.ArcTo arcTo = (androidx.compose.ui.graphics.vector.PathNode.ArcTo) other;
            return java.lang.Float.compare(this.horizontalEllipseRadius, arcTo.horizontalEllipseRadius) == 0 && java.lang.Float.compare(this.verticalEllipseRadius, arcTo.verticalEllipseRadius) == 0 && java.lang.Float.compare(this.theta, arcTo.theta) == 0 && this.isMoreThanHalf == arcTo.isMoreThanHalf && this.isPositiveArc == arcTo.isPositiveArc && java.lang.Float.compare(this.arcStartX, arcTo.arcStartX) == 0 && java.lang.Float.compare(this.arcStartY, arcTo.arcStartY) == 0;
        }

        public final androidx.compose.ui.graphics.vector.PathNode.ArcTo copy(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float arcStartX, float arcStartY) {
            return new androidx.compose.ui.graphics.vector.PathNode.ArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, arcStartX, arcStartY);
        }

        /* renamed from: component7, reason: from getter */
        public final float getArcStartY() {
            return this.arcStartY;
        }

        /* renamed from: component6, reason: from getter */
        public final float getArcStartX() {
            return this.arcStartX;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsPositiveArc() {
            return this.isPositiveArc;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        /* renamed from: component3, reason: from getter */
        public final float getTheta() {
            return this.theta;
        }

        /* renamed from: component2, reason: from getter */
        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        /* renamed from: component1, reason: from getter */
        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public static /* synthetic */ androidx.compose.ui.graphics.vector.PathNode.ArcTo copy$default(androidx.compose.ui.graphics.vector.PathNode.ArcTo arcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = arcTo.horizontalEllipseRadius;
            }
            if ((i & 2) != 0) {
                f2 = arcTo.verticalEllipseRadius;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = arcTo.theta;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = arcTo.isMoreThanHalf;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = arcTo.isPositiveArc;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = arcTo.arcStartX;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = arcTo.arcStartY;
            }
            return arcTo.copy(f, f6, f7, z3, z4, f8, f5);
        }
    }

    public /* synthetic */ PathNode(boolean z, boolean z2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }
}
