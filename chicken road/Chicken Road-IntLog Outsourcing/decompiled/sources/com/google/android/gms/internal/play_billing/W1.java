package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class W1 extends AbstractC0334g1 {
    private static final W1 zzb;

    static {
        W1 w12 = new W1();
        zzb = w12;
        AbstractC0334g1.k(W1.class, w12);
    }

    public static W1 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0334g1
    public final Object d(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new C1(zzb, "\u0004\u0000", null);
        }
        if (i3 == 3) {
            return new W1();
        }
        if (i3 == 4) {
            return new V1(zzb);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
