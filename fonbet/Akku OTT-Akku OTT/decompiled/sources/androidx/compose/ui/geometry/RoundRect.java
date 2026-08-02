package androidx.compose.ui.geometry;

import androidx.appcompat.view.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.t;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001>BP\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0019\u0010!\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u0011J\u0019\u0010#\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b$\u0010\u0011J\u0019\u0010%\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0011J\u0019\u0010'\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0011J\u001b\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.Jf\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J(\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H\u0002J\b\u0010;\u001a\u00020\u0000H\u0002J\b\u0010<\u001a\u00020=H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u000b\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "left", "", "top", "right", "bottom", "topLeftCornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_scaledRadiiRect", "getBottom", "()F", "getBottomLeftCornerRadius-kKHJgLs", "()J", "J", "getBottomRightCornerRadius-kKHJgLs", "height", "getHeight", "getLeft", "getRight", "getTop", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "width", "getWidth", "component1", "component2", "component3", "component4", "component5", "component5-kKHJgLs", "component6", "component6-kKHJgLs", "component7", "component7-kKHJgLs", "component8", "component8-kKHJgLs", "contains", "", "point", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "copy", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "equals", "other", "hashCode", "", "minRadius", "min", "radius1", "radius2", "limit", "scaledRadiiRect", "toString", "", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RoundRect {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final RoundRect Zero = RoundRectKt.m330RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.INSTANCE.m261getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    /* renamed from: copy-MDFrsts$default, reason: not valid java name */
    public static /* synthetic */ RoundRect m317copyMDFrsts$default(RoundRect roundRect, float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = roundRect.left;
        }
        if ((i & 2) != 0) {
            f2 = roundRect.top;
        }
        if ((i & 4) != 0) {
            f3 = roundRect.right;
        }
        if ((i & 8) != 0) {
            f4 = roundRect.bottom;
        }
        if ((i & 16) != 0) {
            j = roundRect.topLeftCornerRadius;
        }
        if ((i & 32) != 0) {
            j2 = roundRect.topRightCornerRadius;
        }
        if ((i & 64) != 0) {
            j3 = roundRect.bottomRightCornerRadius;
        }
        if ((i & 128) != 0) {
            j4 = roundRect.bottomLeftCornerRadius;
        }
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        long j8 = j;
        return roundRect.m323copyMDFrsts(f, f2, f3, f4, j8, j7, j6, j5);
    }

    public static final RoundRect getZero() {
        return INSTANCE.getZero();
    }

    private final float minRadius(float min, float radius1, float radius2, float limit) {
        float f = radius1 + radius2;
        return f > limit ? f == 0.0f ? min : Math.min(min, limit / f) : min;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m252getYimpl(m324getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m252getYimpl(m326getTopLeftCornerRadiuskKHJgLs()), getHeight()), CornerRadius.m251getXimpl(m326getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m251getXimpl(m327getTopRightCornerRadiuskKHJgLs()), getWidth()), CornerRadius.m252getYimpl(m327getTopRightCornerRadiuskKHJgLs()), CornerRadius.m252getYimpl(m325getBottomRightCornerRadiuskKHJgLs()), getHeight()), CornerRadius.m251getXimpl(m325getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m251getXimpl(m324getBottomLeftCornerRadiuskKHJgLs()), getWidth());
        RoundRect roundRect2 = new RoundRect(getLeft() * minRadius, getTop() * minRadius, getRight() * minRadius, getBottom() * minRadius, CornerRadiusKt.CornerRadius(CornerRadius.m251getXimpl(m326getTopLeftCornerRadiuskKHJgLs()) * minRadius, CornerRadius.m252getYimpl(m326getTopLeftCornerRadiuskKHJgLs()) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m251getXimpl(m327getTopRightCornerRadiuskKHJgLs()) * minRadius, CornerRadius.m252getYimpl(m327getTopRightCornerRadiuskKHJgLs()) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m251getXimpl(m325getBottomRightCornerRadiuskKHJgLs()) * minRadius, CornerRadius.m252getYimpl(m325getBottomRightCornerRadiuskKHJgLs()) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m251getXimpl(m324getBottomLeftCornerRadiuskKHJgLs()) * minRadius, CornerRadius.m252getYimpl(m324getBottomLeftCornerRadiuskKHJgLs()) * minRadius), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    /* renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0199 A[RETURN] */
    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m322containsk4lQ0M(long point) {
        float m276getXimpl;
        float m277getYimpl;
        float m251getXimpl;
        float m252getYimpl;
        if (Offset.m276getXimpl(point) < this.left || Offset.m276getXimpl(point) >= this.right || Offset.m277getYimpl(point) < this.top || Offset.m277getYimpl(point) >= this.bottom) {
            return false;
        }
        RoundRect scaledRadiiRect = scaledRadiiRect();
        if (Offset.m276getXimpl(point) < CornerRadius.m251getXimpl(scaledRadiiRect.m326getTopLeftCornerRadiuskKHJgLs()) + this.left) {
            if (Offset.m277getYimpl(point) < CornerRadius.m252getYimpl(scaledRadiiRect.m326getTopLeftCornerRadiuskKHJgLs()) + this.top) {
                m276getXimpl = (Offset.m276getXimpl(point) - this.left) - CornerRadius.m251getXimpl(scaledRadiiRect.m326getTopLeftCornerRadiuskKHJgLs());
                m277getYimpl = (Offset.m277getYimpl(point) - this.top) - CornerRadius.m252getYimpl(scaledRadiiRect.m326getTopLeftCornerRadiuskKHJgLs());
                m251getXimpl = CornerRadius.m251getXimpl(scaledRadiiRect.m326getTopLeftCornerRadiuskKHJgLs());
                m252getYimpl = CornerRadius.m252getYimpl(scaledRadiiRect.m326getTopLeftCornerRadiuskKHJgLs());
                float f = m276getXimpl / m251getXimpl;
                float f2 = m277getYimpl / m252getYimpl;
                return (f2 * f2) + (f * f) <= 1.0f;
            }
        }
        if (Offset.m276getXimpl(point) > this.right - CornerRadius.m251getXimpl(scaledRadiiRect.m327getTopRightCornerRadiuskKHJgLs())) {
            if (Offset.m277getYimpl(point) < CornerRadius.m252getYimpl(scaledRadiiRect.m327getTopRightCornerRadiuskKHJgLs()) + this.top) {
                m276getXimpl = (Offset.m276getXimpl(point) - this.right) + CornerRadius.m251getXimpl(scaledRadiiRect.m327getTopRightCornerRadiuskKHJgLs());
                m277getYimpl = (Offset.m277getYimpl(point) - this.top) - CornerRadius.m252getYimpl(scaledRadiiRect.m327getTopRightCornerRadiuskKHJgLs());
                m251getXimpl = CornerRadius.m251getXimpl(scaledRadiiRect.m327getTopRightCornerRadiuskKHJgLs());
                m252getYimpl = CornerRadius.m252getYimpl(scaledRadiiRect.m327getTopRightCornerRadiuskKHJgLs());
                float f3 = m276getXimpl / m251getXimpl;
                float f22 = m277getYimpl / m252getYimpl;
                if ((f22 * f22) + (f3 * f3) <= 1.0f) {
                }
            }
        }
        if (Offset.m276getXimpl(point) <= this.right - CornerRadius.m251getXimpl(scaledRadiiRect.m325getBottomRightCornerRadiuskKHJgLs()) || Offset.m277getYimpl(point) <= this.bottom - CornerRadius.m252getYimpl(scaledRadiiRect.m325getBottomRightCornerRadiuskKHJgLs())) {
            if (Offset.m276getXimpl(point) >= CornerRadius.m251getXimpl(scaledRadiiRect.m324getBottomLeftCornerRadiuskKHJgLs()) + this.left || Offset.m277getYimpl(point) <= this.bottom - CornerRadius.m252getYimpl(scaledRadiiRect.m324getBottomLeftCornerRadiuskKHJgLs())) {
                return true;
            }
            m276getXimpl = (Offset.m276getXimpl(point) - this.left) - CornerRadius.m251getXimpl(scaledRadiiRect.m324getBottomLeftCornerRadiuskKHJgLs());
            m277getYimpl = (Offset.m277getYimpl(point) - this.bottom) + CornerRadius.m252getYimpl(scaledRadiiRect.m324getBottomLeftCornerRadiuskKHJgLs());
            m251getXimpl = CornerRadius.m251getXimpl(scaledRadiiRect.m324getBottomLeftCornerRadiuskKHJgLs());
            m252getYimpl = CornerRadius.m252getYimpl(scaledRadiiRect.m324getBottomLeftCornerRadiuskKHJgLs());
        } else {
            m276getXimpl = (Offset.m276getXimpl(point) - this.right) + CornerRadius.m251getXimpl(scaledRadiiRect.m325getBottomRightCornerRadiuskKHJgLs());
            m277getYimpl = (Offset.m277getYimpl(point) - this.bottom) + CornerRadius.m252getYimpl(scaledRadiiRect.m325getBottomRightCornerRadiuskKHJgLs());
            m251getXimpl = CornerRadius.m251getXimpl(scaledRadiiRect.m325getBottomRightCornerRadiuskKHJgLs());
            m252getYimpl = CornerRadius.m252getYimpl(scaledRadiiRect.m325getBottomRightCornerRadiuskKHJgLs());
        }
        float f32 = m276getXimpl / m251getXimpl;
        float f222 = m277getYimpl / m252getYimpl;
        if ((f222 * f222) + (f32 * f32) <= 1.0f) {
        }
    }

    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m323copyMDFrsts(float left, float top, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new RoundRect(left, top, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.left), (Object) Float.valueOf(roundRect.left)) && Intrinsics.areEqual((Object) Float.valueOf(this.top), (Object) Float.valueOf(roundRect.top)) && Intrinsics.areEqual((Object) Float.valueOf(this.right), (Object) Float.valueOf(roundRect.right)) && Intrinsics.areEqual((Object) Float.valueOf(this.bottom), (Object) Float.valueOf(roundRect.bottom)) && CornerRadius.m250equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m250equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m250equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m250equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m324getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m325getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m326getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m327getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return CornerRadius.m253hashCodeimpl(this.bottomLeftCornerRadius) + ((CornerRadius.m253hashCodeimpl(this.bottomRightCornerRadius) + ((CornerRadius.m253hashCodeimpl(this.topRightCornerRadius) + ((CornerRadius.m253hashCodeimpl(this.topLeftCornerRadius) + t.a(this.bottom, t.a(this.right, t.a(this.top, Float.hashCode(this.left) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        long m326getTopLeftCornerRadiuskKHJgLs = m326getTopLeftCornerRadiuskKHJgLs();
        long m327getTopRightCornerRadiuskKHJgLs = m327getTopRightCornerRadiuskKHJgLs();
        long m325getBottomRightCornerRadiuskKHJgLs = m325getBottomRightCornerRadiuskKHJgLs();
        long m324getBottomLeftCornerRadiuskKHJgLs = m324getBottomLeftCornerRadiuskKHJgLs();
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m250equalsimpl0(m326getTopLeftCornerRadiuskKHJgLs, m327getTopRightCornerRadiuskKHJgLs) || !CornerRadius.m250equalsimpl0(m327getTopRightCornerRadiuskKHJgLs, m325getBottomRightCornerRadiuskKHJgLs) || !CornerRadius.m250equalsimpl0(m325getBottomRightCornerRadiuskKHJgLs, m324getBottomLeftCornerRadiuskKHJgLs)) {
            StringBuilder a = a.a("RoundRect(rect=", str, ", topLeft=");
            a.append((Object) CornerRadius.m257toStringimpl(m326getTopLeftCornerRadiuskKHJgLs));
            a.append(", topRight=");
            a.append((Object) CornerRadius.m257toStringimpl(m327getTopRightCornerRadiuskKHJgLs));
            a.append(", bottomRight=");
            a.append((Object) CornerRadius.m257toStringimpl(m325getBottomRightCornerRadiuskKHJgLs));
            a.append(", bottomLeft=");
            a.append((Object) CornerRadius.m257toStringimpl(m324getBottomLeftCornerRadiuskKHJgLs));
            a.append(')');
            return a.toString();
        }
        if (CornerRadius.m251getXimpl(m326getTopLeftCornerRadiuskKHJgLs) == CornerRadius.m252getYimpl(m326getTopLeftCornerRadiuskKHJgLs)) {
            StringBuilder a2 = a.a("RoundRect(rect=", str, ", radius=");
            a2.append(GeometryUtilsKt.toStringAsFixed(CornerRadius.m251getXimpl(m326getTopLeftCornerRadiuskKHJgLs), 1));
            a2.append(')');
            return a2.toString();
        }
        StringBuilder a3 = a.a("RoundRect(rect=", str, ", x=");
        a3.append(GeometryUtilsKt.toStringAsFixed(CornerRadius.m251getXimpl(m326getTopLeftCornerRadiuskKHJgLs), 1));
        a3.append(", y=");
        a3.append(GeometryUtilsKt.toStringAsFixed(CornerRadius.m252getYimpl(m326getTopLeftCornerRadiuskKHJgLs), 1));
        a3.append(')');
        return a3.toString();
    }

    private RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.topLeftCornerRadius = j;
        this.topRightCornerRadius = j2;
        this.bottomRightCornerRadius = j3;
        this.bottomLeftCornerRadius = j4;
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, (i & 16) != 0 ? CornerRadius.INSTANCE.m261getZerokKHJgLs() : j, (i & 32) != 0 ? CornerRadius.INSTANCE.m261getZerokKHJgLs() : j2, (i & 64) != 0 ? CornerRadius.INSTANCE.m261getZerokKHJgLs() : j3, (i & 128) != 0 ? CornerRadius.INSTANCE.m261getZerokKHJgLs() : j4, null);
    }
}
