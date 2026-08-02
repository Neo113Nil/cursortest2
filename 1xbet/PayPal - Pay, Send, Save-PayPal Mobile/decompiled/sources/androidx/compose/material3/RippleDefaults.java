package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/material3/RippleDefaults;", "", "<init>", "()V", "Landroidx/compose/material/ripple/RippleAlpha;", "RippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "getRippleAlpha", "()Landroidx/compose/material/ripple/RippleAlpha;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RippleDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.RippleDefaults INSTANCE = new androidx.compose.material3.RippleDefaults();
    private static final androidx.compose.material.ripple.RippleAlpha RippleAlpha = new androidx.compose.material.ripple.RippleAlpha(0.16f, 0.1f, 0.08f, 0.1f);

    private RippleDefaults() {
    }

    public final androidx.compose.material.ripple.RippleAlpha getRippleAlpha() {
        return RippleAlpha;
    }
}
