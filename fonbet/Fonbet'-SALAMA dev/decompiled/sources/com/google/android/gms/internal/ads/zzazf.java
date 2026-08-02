package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzazf {
    final long zza;
    final String zzb;
    final int zzc;

    public zzazf(long j, String str, int i7) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i7;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzazf)) {
            zzazf zzazfVar = (zzazf) obj;
            if (zzazfVar.zza == this.zza && zzazfVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
