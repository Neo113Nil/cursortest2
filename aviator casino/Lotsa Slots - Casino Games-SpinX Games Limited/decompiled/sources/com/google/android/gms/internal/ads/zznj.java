package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@java.lang.Deprecated
/* loaded from: classes4.dex */
public final class zznj {
    private final com.google.android.gms.internal.ads.zzjt zza;

    @java.lang.Deprecated
    public zznj(android.content.Context context, com.google.android.gms.internal.ads.zznf zznfVar) {
        this.zza = new com.google.android.gms.internal.ads.zzjt(context, zznfVar);
    }

    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zznj zza(final com.google.android.gms.internal.ads.zzabh zzabhVar) {
        com.google.android.gms.internal.ads.zzjt zzjtVar = this.zza;
        com.google.android.gms.internal.ads.zzgtj.zzi(!zzjtVar.zzw);
        zzabhVar.getClass();
        zzjtVar.zze = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzjq
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                int i = com.google.android.gms.internal.ads.zzjt.zzA;
                return com.google.android.gms.internal.ads.zzabh.this;
            }
        };
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zznj zzb(final com.google.android.gms.internal.ads.zzly zzlyVar) {
        com.google.android.gms.internal.ads.zzjt zzjtVar = this.zza;
        com.google.android.gms.internal.ads.zzgtj.zzi(!zzjtVar.zzw);
        zzlyVar.getClass();
        zzjtVar.zzf = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzjr
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                int i = com.google.android.gms.internal.ads.zzjt.zzA;
                return com.google.android.gms.internal.ads.zzly.this;
            }
        };
        return this;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zznk zzc() {
        com.google.android.gms.internal.ads.zzjt zzjtVar = this.zza;
        com.google.android.gms.internal.ads.zzgtj.zzi(!zzjtVar.zzw);
        zzjtVar.zzw = true;
        return new com.google.android.gms.internal.ads.zznk(zzjtVar);
    }
}
