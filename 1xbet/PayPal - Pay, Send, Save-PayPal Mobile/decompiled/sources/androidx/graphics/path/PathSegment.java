package androidx.graphics.path;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u001eB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/graphics/path/PathSegment;", "", "Landroidx/graphics/path/PathSegment$Type;", "type", "", "Landroid/graphics/PointF;", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "", "weight", "<init>", "(Landroidx/graphics/path/PathSegment$Type;[Landroid/graphics/PointF;F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[Landroid/graphics/PointF;", "getPoints", "()[Landroid/graphics/PointF;", "Landroidx/graphics/path/PathSegment$Type;", "getType", "()Landroidx/graphics/path/PathSegment$Type;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getWeight", "()F", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PathSegment {
    private final android.graphics.PointF[] points;
    private final androidx.graphics.path.PathSegment.Type type;
    private final float weight;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Landroidx/graphics/path/PathSegment$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Move", "Line", "Quadratic", "Conic", "Cubic", com.knotapi.knot.utilities.Constants.META_CLOSE, "Done"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done
    }

    public PathSegment(androidx.graphics.path.PathSegment.Type type, android.graphics.PointF[] pointFArr, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointFArr, "");
        this.type = type;
        this.points = pointFArr;
        this.weight = f;
    }

    public final androidx.graphics.path.PathSegment.Type getType() {
        return this.type;
    }

    public final android.graphics.PointF[] getPoints() {
        return this.points;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        androidx.graphics.path.PathSegment pathSegment = (androidx.graphics.path.PathSegment) other;
        return this.type == pathSegment.type && java.util.Arrays.equals(this.points, pathSegment.points) && this.weight == pathSegment.weight;
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + java.util.Arrays.hashCode(this.points)) * 31) + java.lang.Float.hashCode(this.weight);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PathSegment(type=");
        sb.append(this.type);
        sb.append(", points=");
        java.lang.String arrays = java.util.Arrays.toString(this.points);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "");
        sb.append(arrays);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(')');
        return sb.toString();
    }
}
