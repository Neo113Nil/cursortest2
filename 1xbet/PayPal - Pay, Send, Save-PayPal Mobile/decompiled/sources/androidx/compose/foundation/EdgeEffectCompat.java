package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\t*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u0015\u0010\u001d\u001a\u00020\t*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/foundation/EdgeEffectCompat;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/widget/EdgeEffect;", "create", "(Landroid/content/Context;)Landroid/widget/EdgeEffect;", "", "deltaDistance", "displacement", "onPullDistanceCompat", "(Landroid/widget/EdgeEffect;FF)F", "", "velocity", "", "onAbsorbCompat", "(Landroid/widget/EdgeEffect;I)V", "edgeEffectLength", "Landroidx/compose/ui/unit/Density;", "density", "absorbToRelaxIfNeeded", "(Landroid/widget/EdgeEffect;FFLandroidx/compose/ui/unit/Density;)F", "delta", "onReleaseWithOppositeDelta", "(Landroid/widget/EdgeEffect;F)V", "getDistanceCompat", "(Landroid/widget/EdgeEffect;)F", "distanceCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EdgeEffectCompat {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.EdgeEffectCompat INSTANCE = new androidx.compose.foundation.EdgeEffectCompat();

    private EdgeEffectCompat() {
    }

    public final android.widget.EdgeEffect create(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.compose.foundation.Api31Impl.INSTANCE.getHighSpeedVideoSizes(context, null);
        }
        return new androidx.compose.foundation.GlowEdgeEffectCompat(context);
    }

    public final float onPullDistanceCompat(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.compose.foundation.Api31Impl.INSTANCE.getHighSpeedVideoFpsRangesFor(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public final void onAbsorbCompat(android.widget.EdgeEffect edgeEffect, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public final float absorbToRelaxIfNeeded(android.widget.EdgeEffect edgeEffect, float f, float f2, androidx.compose.ui.unit.Density density) {
        float highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.foundation.EdgeEffectCompat_androidKt.getHighSpeedVideoSizes(density, f);
        if (highSpeedVideoSizes > getDistanceCompat(edgeEffect) * f2) {
            return 0.0f;
        }
        onAbsorbCompat(edgeEffect, kotlin.math.MathKt.roundToInt(f));
        return f;
    }

    public final void onReleaseWithOppositeDelta(android.widget.EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof androidx.compose.foundation.GlowEdgeEffectCompat) {
            ((androidx.compose.foundation.GlowEdgeEffectCompat) edgeEffect).Camera2StreamConfigurationMap(f);
        } else {
            edgeEffect.onRelease();
        }
    }

    public final float getDistanceCompat(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.compose.foundation.Api31Impl.INSTANCE.getHighSpeedVideoSizes(edgeEffect);
        }
        return 0.0f;
    }
}
