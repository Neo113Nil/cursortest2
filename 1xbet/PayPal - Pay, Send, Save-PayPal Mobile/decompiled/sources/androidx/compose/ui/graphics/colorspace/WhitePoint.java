package androidx.compose.ui.graphics.colorspace;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bB)\b\u0012\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0012"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "", "", "x", "y", "<init>", "(FF)V", "z", "(FFF)V", "p0", "p1", "p2", "p3", "(FFFB)V", "", "toXyz$ui_graphics", "()[F", "component1", "()F", "component2", "copy", "(FF)Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getX", "getY"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class WhitePoint {
    public static final int $stable = 0;
    private final float x;
    private final float y;

    public WhitePoint(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public WhitePoint(float f, float f2, float f3) {
        this(f, f2, f + f2 + f3, (byte) 0);
    }

    private WhitePoint(float f, float f2, float f3, byte b) {
        this(f / f3, f2 / f3);
    }

    public final float[] toXyz$ui_graphics() {
        float f = this.x;
        float f2 = this.y;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WhitePoint(x=");
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
        if (!(other instanceof androidx.compose.ui.graphics.colorspace.WhitePoint)) {
            return false;
        }
        androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint = (androidx.compose.ui.graphics.colorspace.WhitePoint) other;
        return java.lang.Float.compare(this.x, whitePoint.x) == 0 && java.lang.Float.compare(this.y, whitePoint.y) == 0;
    }

    public final androidx.compose.ui.graphics.colorspace.WhitePoint copy(float x, float y) {
        return new androidx.compose.ui.graphics.colorspace.WhitePoint(x, y);
    }

    /* renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    public static /* synthetic */ androidx.compose.ui.graphics.colorspace.WhitePoint copy$default(androidx.compose.ui.graphics.colorspace.WhitePoint whitePoint, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = whitePoint.x;
        }
        if ((i & 2) != 0) {
            f2 = whitePoint.y;
        }
        return whitePoint.copy(f, f2);
    }
}
