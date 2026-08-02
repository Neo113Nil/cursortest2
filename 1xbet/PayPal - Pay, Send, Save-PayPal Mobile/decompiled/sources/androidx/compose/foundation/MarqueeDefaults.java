package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0007X\u0086D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0007X\u0086D¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/MarqueeDefaults;", "", "<init>", "()V", "", "Iterations", com.visa.cbp.getEncExpo.warmup, "getIterations", "()I", "getIterations$annotations", "RepeatDelayMillis", "getRepeatDelayMillis", "getRepeatDelayMillis$annotations", "Landroidx/compose/foundation/MarqueeSpacing;", "Spacing", "Landroidx/compose/foundation/MarqueeSpacing;", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "Landroidx/compose/ui/unit/Dp;", "Velocity", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getVelocity-D9Ej5fM", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MarqueeDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.MarqueeDefaults INSTANCE = new androidx.compose.foundation.MarqueeDefaults();
    private static final int Iterations = 3;
    private static final int RepeatDelayMillis = 1200;
    private static final androidx.compose.foundation.MarqueeSpacing Spacing = androidx.compose.foundation.MarqueeSpacing.INSTANCE.fractionOfContainer(0.33333334f);
    private static final float Velocity = androidx.compose.ui.unit.Dp.m8601constructorimpl(30.0f);

    public static /* synthetic */ void getIterations$annotations() {
    }

    public static /* synthetic */ void getRepeatDelayMillis$annotations() {
    }

    private MarqueeDefaults() {
    }

    public final int getIterations() {
        return Iterations;
    }

    public final int getRepeatDelayMillis() {
        return RepeatDelayMillis;
    }

    public final androidx.compose.foundation.MarqueeSpacing getSpacing() {
        return Spacing;
    }

    /* renamed from: getVelocity-D9Ej5fM, reason: not valid java name */
    public final float m1358getVelocityD9Ej5fM() {
        return Velocity;
    }
}
