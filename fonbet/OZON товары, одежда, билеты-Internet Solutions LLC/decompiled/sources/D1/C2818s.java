package D1;

import ed.InterfaceC6346b;

@InterfaceC6346b
/* renamed from: D1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2818s {
    public static final int a(long j11, long j12) {
        boolean z11 = ((int) (j11 & 4294967295L)) != 0;
        return z11 != (((int) (4294967295L & j12)) != 0) ? z11 ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat((int) (j12 >> 32)));
    }
}
