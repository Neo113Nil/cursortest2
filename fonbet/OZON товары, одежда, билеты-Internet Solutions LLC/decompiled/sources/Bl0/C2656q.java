package Bl0;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import x1.C10627b;

/* renamed from: Bl0.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2656q {
    public static final float a(float f7) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f7) & 8589934591L) / 3)) + 709952852);
        float f11 = intBitsToFloat - ((intBitsToFloat - (f7 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f7 / (f11 * f11))) * 0.33333334f);
    }

    public static final float b(float f7, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f7);
    }

    public static final int c(float f7, int i11, int i12) {
        return i11 + ((int) Math.round((i12 - i11) * f7));
    }

    public static androidx.compose.ui.e d(androidx.compose.ui.e eVar, C10627b c10627b) {
        return eVar.l0(new PointerHoverIconModifierElement(c10627b));
    }
}
