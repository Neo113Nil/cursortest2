package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcwn implements com.google.android.gms.internal.ads.zzddl {
    private final com.google.android.gms.internal.ads.zzcku zza;
    private final com.google.android.gms.internal.ads.zzdzl zzb;
    private final com.google.android.gms.internal.ads.zzfkf zzc;

    zzcwn(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        this.zza = zzckuVar;
        this.zzb = zzdzlVar;
        this.zzc = zzfkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final void zzdr() {
        com.google.android.gms.internal.ads.zzcku zzckuVar;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzot)).booleanValue() || (zzckuVar = this.zza) == null) {
            return;
        }
        java.lang.String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzckuVar.zzE()) ? "0" : "1";
        com.google.android.gms.internal.ads.zzdzk zza = this.zzb.zza();
        zza.zzc("action", "hcp");
        zza.zzc("hcp", str);
        zza.zzb(this.zzc);
        zza.zzd();
    }
}
