package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfzi implements Serializable {
    private final int[] zza;
    private final int zzb;

    private zzfzi(int[] iArr, int i7, int i8) {
        this.zza = iArr;
        this.zzb = i8;
    }

    public static zzfzi zzb(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzfzi(copyOf, 0, copyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfzi)) {
            return false;
        }
        zzfzi zzfziVar = (zzfzi) obj;
        if (this.zzb != zzfziVar.zzb) {
            return false;
        }
        for (int i7 = 0; i7 < this.zzb; i7++) {
            if (zza(i7) != zzfziVar.zza(i7)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            i7 = (i7 * 31) + this.zza[i8];
        }
        return i7;
    }

    public final String toString() {
        int i7 = this.zzb;
        if (i7 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i7 * 5);
        sb.append('[');
        sb.append(this.zza[0]);
        for (int i8 = 1; i8 < this.zzb; i8++) {
            sb.append(", ");
            sb.append(this.zza[i8]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zza(int i7) {
        zzfth.zza(i7, this.zzb, "index");
        return this.zza[i7];
    }
}
