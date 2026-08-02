package com.google.android.gms.internal.ads;

import e1.k;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzce {
    public static final zzce zza = new zzce(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzce(int i7, int i8, int i9) {
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = i9;
        this.zze = zzen.zzK(i9) ? zzen.zzk(i9) * i8 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzce)) {
            return false;
        }
        zzce zzceVar = (zzce) obj;
        return this.zzb == zzceVar.zzb && this.zzc == zzceVar.zzc && this.zzd == zzceVar.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.zzb);
        sb.append(", channelCount=");
        sb.append(this.zzc);
        sb.append(", encoding=");
        return k.g(sb, this.zzd, "]");
    }
}
