package com.google.android.gms.internal.ads;

import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzfqs extends zzfru {
    private final int zza;
    private final String zzb;

    public /* synthetic */ zzfqs(int i7, String str, zzfqr zzfqrVar) {
        this.zza = i7;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfru) {
            zzfru zzfruVar = (zzfru) obj;
            if (this.zza == zzfruVar.zza() && ((str = this.zzb) != null ? str.equals(zzfruVar.zzb()) : zzfruVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayState{statusCode=");
        sb.append(this.zza);
        sb.append(", sessionToken=");
        return k.i(sb, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    public final String zzb() {
        return this.zzb;
    }
}
