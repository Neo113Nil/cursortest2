package bc;

import l1.N0;

/* renamed from: bc.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5637m {
    public static final long a(float f7, float f11) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
        int i11 = N0.f72233c;
        return floatToRawIntBits;
    }
}
