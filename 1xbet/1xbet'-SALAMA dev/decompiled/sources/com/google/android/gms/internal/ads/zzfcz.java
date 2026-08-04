package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzfcz implements zzfcx {
    private final String zza;

    public zzfcz(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcx
    public final boolean equals(Object obj) {
        if (obj instanceof zzfcz) {
            return this.zza.equals(((zzfcz) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfcx
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
