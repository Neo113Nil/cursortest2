package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfx extends com.google.android.gms.internal.ads.zzfz {
    public final long zza;
    public final java.util.List zzb;
    public final java.util.List zzc;

    public zzfx(int i, long j) {
        super(i, null);
        this.zza = j;
        this.zzb = new java.util.ArrayList();
        this.zzc = new java.util.ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final java.lang.String toString() {
        java.util.List list = this.zzb;
        java.lang.String zze = zze(this.zzd);
        java.lang.String arrays = java.util.Arrays.toString(list.toArray());
        java.lang.String arrays2 = java.util.Arrays.toString(this.zzc.toArray());
        int length = zze.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 9 + java.lang.String.valueOf(arrays).length() + 13 + java.lang.String.valueOf(arrays2).length());
        sb.append(zze);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final void zza(com.google.android.gms.internal.ads.zzfy zzfyVar) {
        this.zzb.add(zzfyVar);
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfx zzfxVar) {
        this.zzc.add(zzfxVar);
    }

    public final com.google.android.gms.internal.ads.zzfy zzc(int i) {
        java.util.List list = this.zzb;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.gms.internal.ads.zzfy zzfyVar = (com.google.android.gms.internal.ads.zzfy) list.get(i2);
            if (zzfyVar.zzd == i) {
                return zzfyVar;
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.ads.zzfx zzd(int i) {
        java.util.List list = this.zzc;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.gms.internal.ads.zzfx zzfxVar = (com.google.android.gms.internal.ads.zzfx) list.get(i2);
            if (zzfxVar.zzd == i) {
                return zzfxVar;
            }
        }
        return null;
    }
}
