package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzyx implements zzxn {
    private final zzhr zza;
    private final zzyg zzb;
    private int zzc;
    private final zzabz zzd;

    public zzyx(zzhr zzhrVar, final zzagn zzagnVar) {
        zzyg zzygVar = new zzyg() { // from class: com.google.android.gms.internal.ads.zzyw
            @Override // com.google.android.gms.internal.ads.zzyg
            public final /* synthetic */ zzyh zza(zzqj zzqjVar) {
                return new zzws(zzagn.this);
            }
        };
        zzabz zzabzVar = new zzabz(-1);
        this.zza = zzhrVar;
        this.zzb = zzygVar;
        this.zzd = zzabzVar;
        this.zzc = 1048576;
    }

    public final zzyx zza(int i) {
        this.zzc = i;
        return this;
    }

    public final zzyy zzb(zzak zzakVar) {
        zzag zzagVar = zzakVar.zzb;
        zzagVar.getClass();
        zzhr zzhrVar = this.zza;
        zzyg zzygVar = this.zzb;
        zzagVar.getClass();
        return new zzyy(zzakVar, zzhrVar, zzygVar, zzus.zza, this.zzd, this.zzc, false, 0, null, null, null);
    }
}
