package androidx.core.view;

/* loaded from: classes3.dex */
public final class RoundedCornerCompat {
    public static final int POSITION_BOTTOM_LEFT = 3;
    public static final int POSITION_BOTTOM_RIGHT = 2;
    public static final int POSITION_TOP_LEFT = 0;
    public static final int POSITION_TOP_RIGHT = 1;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final android.graphics.Point getHighSpeedVideoSizes;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Position {
    }

    public RoundedCornerCompat(int i, int i2, int i3, int i4) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighSpeedVideoSizes = new android.graphics.Point(i3, i4);
    }

    private RoundedCornerCompat(int i, int i2, android.graphics.Point point) {
        this(i, i2, point.x, point.y);
    }

    private static int getHighSpeedVideoFpsRangesFor(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw new java.lang.IllegalArgumentException("Invalid position: ".concat(java.lang.String.valueOf(i)));
            }
        }
        return i2;
    }

    static androidx.core.view.RoundedCornerCompat cy_(android.view.RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            return new androidx.core.view.RoundedCornerCompat(getHighSpeedVideoFpsRangesFor(roundedCorner.getPosition()), roundedCorner.getRadius(), roundedCorner.getCenter());
        }
        return null;
    }

    static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw new java.lang.IllegalArgumentException("Invalid position: ".concat(java.lang.String.valueOf(i)));
            }
        }
        return i2;
    }

    static android.view.RoundedCorner cx_(androidx.core.view.RoundedCornerCompat roundedCornerCompat) {
        if (roundedCornerCompat != null) {
            return new android.view.RoundedCorner(getHighResolutionOutputSizeshNQ4ISI(roundedCornerCompat.getPosition()), roundedCornerCompat.getRadius(), roundedCornerCompat.getCenterX(), roundedCornerCompat.getCenterY());
        }
        return null;
    }

    public final int getPosition() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int getRadius() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final android.graphics.Point getCenter() {
        return new android.graphics.Point(this.getHighSpeedVideoSizes);
    }

    public final int getCenterX() {
        return this.getHighSpeedVideoSizes.x;
    }

    public final int getCenterY() {
        return this.getHighSpeedVideoSizes.y;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.core.view.RoundedCornerCompat)) {
            return false;
        }
        androidx.core.view.RoundedCornerCompat roundedCornerCompat = (androidx.core.view.RoundedCornerCompat) obj;
        return this.getHighSpeedVideoFpsRanges == roundedCornerCompat.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoFpsRangesFor == roundedCornerCompat.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes.equals(roundedCornerCompat.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return (((this.getHighSpeedVideoFpsRanges * 31) + this.getHighSpeedVideoFpsRangesFor) * 31) + this.getHighSpeedVideoSizes.hashCode();
    }

    private java.lang.String getHighSpeedVideoSizes(int i) {
        if (i == 0) {
            return "TopLeft";
        }
        if (i == 1) {
            return "TopRight";
        }
        if (i == 2) {
            return "BottomRight";
        }
        if (i == 3) {
            return "BottomLeft";
        }
        return "Invalid";
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RoundedCornerCompat{position=");
        sb.append(getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges));
        sb.append(", radius=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", center=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
