package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/material3/internal/PredictiveBack;", "", "<init>", "()V", "", "progress", "transform$material3", "(F)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PredictiveBack {
    public static final int $stable = 0;
    public static final androidx.compose.material3.internal.PredictiveBack INSTANCE = new androidx.compose.material3.internal.PredictiveBack();

    private PredictiveBack() {
    }

    public final float transform$material3(float progress) {
        androidx.compose.animation.core.Easing easing;
        easing = androidx.compose.material3.internal.BackHandlerKt.Camera2StreamConfigurationMap;
        return easing.transform(progress);
    }
}
