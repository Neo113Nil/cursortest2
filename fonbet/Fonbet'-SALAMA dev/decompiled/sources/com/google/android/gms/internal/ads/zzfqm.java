package com.google.android.gms.internal.ads;

import e1.k;

/* loaded from: classes.dex */
final class zzfqm extends zzfqx {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzfqm(String str, String str2, zzfql zzfqlVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqx) {
            zzfqx zzfqxVar = (zzfqx) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfqxVar.zzb()) : zzfqxVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfqxVar.zza()) : zzfqxVar.zza() == null) {
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
        StringBuilder sb = new StringBuilder("OverlayDisplayDismissRequest{sessionToken=");
        sb.append(this.zza);
        sb.append(", appId=");
        return k.i(sb, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfqx
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqx
    public final String zzb() {
        return this.zza;
    }
}
