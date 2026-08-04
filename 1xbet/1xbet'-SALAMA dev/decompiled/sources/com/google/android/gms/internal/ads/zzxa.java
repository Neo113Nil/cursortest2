package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzxa {
    public final long zza;
    public final long zzb;

    public zzxa(long j, long j3) {
        this.zza = j;
        this.zzb = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxa)) {
            return false;
        }
        zzxa zzxaVar = (zzxa) obj;
        return this.zza == zzxaVar.zza && this.zzb == zzxaVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
