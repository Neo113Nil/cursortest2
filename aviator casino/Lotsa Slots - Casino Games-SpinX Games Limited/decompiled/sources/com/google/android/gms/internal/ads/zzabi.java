package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzabi {
    public final int zza;
    public final com.google.android.gms.internal.ads.zznd[] zzb;
    public final com.google.android.gms.internal.ads.zzaba[] zzc;
    public final com.google.android.gms.internal.ads.zzbn zzd;
    public final java.lang.Object zze;

    public zzabi(com.google.android.gms.internal.ads.zznd[] zzndVarArr, com.google.android.gms.internal.ads.zzaba[] zzabaVarArr, com.google.android.gms.internal.ads.zzbn zzbnVar, java.lang.Object obj) {
        int length = zzndVarArr.length;
        com.google.android.gms.internal.ads.zzgtj.zza(length == zzabaVarArr.length);
        this.zzb = zzndVarArr;
        this.zzc = (com.google.android.gms.internal.ads.zzaba[]) zzabaVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i) {
        return this.zzb[i] != null;
    }

    public final boolean zzb(com.google.android.gms.internal.ads.zzabi zzabiVar, int i) {
        return zzabiVar != null && java.util.Objects.equals(this.zzb[i], zzabiVar.zzb[i]) && java.util.Objects.equals(this.zzc[i], zzabiVar.zzc[i]);
    }
}
