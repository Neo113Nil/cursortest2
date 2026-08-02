package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzax {
    public final int zza;
    public final int zzb;

    public zzax(int i7, int i8) {
        this.zza = i7;
        this.zzb = i8;
    }

    public final int zza() {
        int i7 = this.zzb;
        if (i7 == 2) {
            return 10;
        }
        if (i7 == 5) {
            return 11;
        }
        if (i7 == 29) {
            return 12;
        }
        if (i7 == 42) {
            return 16;
        }
        if (i7 != 22) {
            return i7 != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
