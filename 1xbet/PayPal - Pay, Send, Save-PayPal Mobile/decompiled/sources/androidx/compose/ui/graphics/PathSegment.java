package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u001dB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "", "Landroidx/compose/ui/graphics/PathSegment$Type;", "type", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "", "weight", "<init>", "(Landroidx/compose/ui/graphics/PathSegment$Type;[FF)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/PathSegment$Type;", "getType", "()Landroidx/compose/ui/graphics/PathSegment$Type;", "[F", "getPoints", "()[F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getWeight", "()F", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathSegment {
    public static final int $stable = 8;
    private final float[] points;
    private final androidx.compose.ui.graphics.PathSegment.Type type;
    private final float weight;

    public PathSegment(androidx.compose.ui.graphics.PathSegment.Type type, float[] fArr, float f) {
        this.type = type;
        this.points = fArr;
        this.weight = f;
    }

    public final androidx.compose.ui.graphics.PathSegment.Type getType() {
        return this.type;
    }

    public final float[] getPoints() {
        return this.points;
    }

    public final float getWeight() {
        return this.weight;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Move", "Line", "Quadratic", "Conic", "Cubic", com.knotapi.knot.utilities.Constants.META_CLOSE, "Done"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ androidx.compose.ui.graphics.PathSegment.Type[] Camera2StreamConfigurationMap;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        public static final androidx.compose.ui.graphics.PathSegment.Type Move = new androidx.compose.ui.graphics.PathSegment.Type("Move", 0);
        public static final androidx.compose.ui.graphics.PathSegment.Type Line = new androidx.compose.ui.graphics.PathSegment.Type("Line", 1);
        public static final androidx.compose.ui.graphics.PathSegment.Type Quadratic = new androidx.compose.ui.graphics.PathSegment.Type("Quadratic", 2);
        public static final androidx.compose.ui.graphics.PathSegment.Type Conic = new androidx.compose.ui.graphics.PathSegment.Type("Conic", 3);
        public static final androidx.compose.ui.graphics.PathSegment.Type Cubic = new androidx.compose.ui.graphics.PathSegment.Type("Cubic", 4);
        public static final androidx.compose.ui.graphics.PathSegment.Type Close = new androidx.compose.ui.graphics.PathSegment.Type(com.knotapi.knot.utilities.Constants.META_CLOSE, 5);
        public static final androidx.compose.ui.graphics.PathSegment.Type Done = new androidx.compose.ui.graphics.PathSegment.Type("Done", 6);

        private Type(java.lang.String str, int i) {
        }

        static {
            androidx.compose.ui.graphics.PathSegment.Type[] highSpeedVideoSizes = getHighSpeedVideoSizes();
            Camera2StreamConfigurationMap = highSpeedVideoSizes;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoSizes);
        }

        public static androidx.compose.ui.graphics.PathSegment.Type[] values() {
            return (androidx.compose.ui.graphics.PathSegment.Type[]) Camera2StreamConfigurationMap.clone();
        }

        public static androidx.compose.ui.graphics.PathSegment.Type valueOf(java.lang.String str) {
            return (androidx.compose.ui.graphics.PathSegment.Type) java.lang.Enum.valueOf(androidx.compose.ui.graphics.PathSegment.Type.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.compose.ui.graphics.PathSegment.Type> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }

        private static final /* synthetic */ androidx.compose.ui.graphics.PathSegment.Type[] getHighSpeedVideoSizes() {
            return new androidx.compose.ui.graphics.PathSegment.Type[]{Move, Line, Quadratic, Conic, Cubic, Close, Done};
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && getClass() == other.getClass()) {
            androidx.compose.ui.graphics.PathSegment pathSegment = (androidx.compose.ui.graphics.PathSegment) other;
            if (this.type == pathSegment.type && java.util.Arrays.equals(this.points, pathSegment.points) && this.weight == pathSegment.weight) {
                return true;
            }
        }
        return false;
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
