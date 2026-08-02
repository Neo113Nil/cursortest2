package com.google.android.gms.internal.ads;

import e1.k;

/* loaded from: classes.dex */
final class zzfqv extends zzfrx {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzfqv(String str, String str2, zzfqu zzfquVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfrx) {
            zzfrx zzfrxVar = (zzfrx) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfrxVar.zzb()) : zzfrxVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfrxVar.zza()) : zzfrxVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(this.zza);
        sb.append(", appId=");
        return k.i(sb, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final String zzb() {
        return this.zza;
    }
}
