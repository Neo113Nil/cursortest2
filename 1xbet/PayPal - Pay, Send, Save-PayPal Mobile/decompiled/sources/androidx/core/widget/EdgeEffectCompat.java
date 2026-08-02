package androidx.core.widget;

/* loaded from: classes3.dex */
public final class EdgeEffectCompat {
    private final android.widget.EdgeEffect getHighSpeedVideoFpsRangesFor;

    @java.lang.Deprecated
    public EdgeEffectCompat(android.content.Context context) {
        this.getHighSpeedVideoFpsRangesFor = new android.widget.EdgeEffect(context);
    }

    public static android.widget.EdgeEffect create(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.EdgeEffectCompat.Api31Impl.getHighSpeedVideoFpsRanges(context, attributeSet);
        }
        return new android.widget.EdgeEffect(context);
    }

    public static float getDistance(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.EdgeEffectCompat.Api31Impl.getHighSpeedVideoFpsRanges(edgeEffect);
        }
        return 0.0f;
    }

    @java.lang.Deprecated
    public final void setSize(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.setSize(i, i2);
    }

    @java.lang.Deprecated
    public final boolean isFinished() {
        return this.getHighSpeedVideoFpsRangesFor.isFinished();
    }

    @java.lang.Deprecated
    public final void finish() {
        this.getHighSpeedVideoFpsRangesFor.finish();
    }

    @java.lang.Deprecated
    public final boolean onPull(float f) {
        this.getHighSpeedVideoFpsRangesFor.onPull(f);
        return true;
    }

    @java.lang.Deprecated
    public final boolean onPull(float f, float f2) {
        onPull(this.getHighSpeedVideoFpsRangesFor, f, f2);
        return true;
    }

    public static void onPull(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        edgeEffect.onPull(f, f2);
    }

    public static float onPullDistance(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.EdgeEffectCompat.Api31Impl.getHighSpeedVideoSizes(edgeEffect, f, f2);
        }
        onPull(edgeEffect, f, f2);
        return f;
    }

    @java.lang.Deprecated
    public final boolean onRelease() {
        this.getHighSpeedVideoFpsRangesFor.onRelease();
        return this.getHighSpeedVideoFpsRangesFor.isFinished();
    }

    @java.lang.Deprecated
    public final boolean onAbsorb(int i) {
        this.getHighSpeedVideoFpsRangesFor.onAbsorb(i);
        return true;
    }

    @java.lang.Deprecated
    public final boolean draw(android.graphics.Canvas canvas) {
        return this.getHighSpeedVideoFpsRangesFor.draw(canvas);
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        public static android.widget.EdgeEffect getHighSpeedVideoFpsRanges(android.content.Context context, android.util.AttributeSet attributeSet) {
            try {
                return new android.widget.EdgeEffect(context, attributeSet);
            } catch (java.lang.Throwable unused) {
                return new android.widget.EdgeEffect(context);
            }
        }

        public static float getHighSpeedVideoSizes(android.widget.EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (java.lang.Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }

        public static float getHighSpeedVideoFpsRanges(android.widget.EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (java.lang.Throwable unused) {
                return 0.0f;
            }
        }
    }
}
