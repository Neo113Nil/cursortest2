package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes.dex */
final class zzegi implements zzdez {
    private final Context zza;
    private final zzdnq zzb;
    private final zzfba zzc;
    private final VersionInfoParcel zzd;
    private final zzfaf zze;
    private final I3.b zzf;
    private final zzceb zzg;
    private final zzbjc zzh;
    private final boolean zzi;
    private final zzeaq zzj;
    private final zzdqk zzk;
    private final zzdqq zzl;

    public zzegi(Context context, zzdnq zzdnqVar, zzfba zzfbaVar, VersionInfoParcel versionInfoParcel, zzfaf zzfafVar, I3.b bVar, zzceb zzcebVar, zzbjc zzbjcVar, boolean z4, zzeaq zzeaqVar, zzdqk zzdqkVar, zzdqq zzdqqVar) {
        this.zza = context;
        this.zzb = zzdnqVar;
        this.zzc = zzfbaVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfafVar;
        this.zzf = bVar;
        this.zzg = zzcebVar;
        this.zzh = zzbjcVar;
        this.zzi = z4;
        this.zzj = zzeaqVar;
        this.zzk = zzdqkVar;
        this.zzl = zzdqqVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    @Override // com.google.android.gms.internal.ads.zzdez
    public final void zza(boolean z4, Context context, zzcvd zzcvdVar) {
        zzceb zzcebVar;
        zzceb zzcebVar2;
        boolean zZze;
        boolean z7;
        boolean zZzd;
        float fZza;
        zzdmv zzdmvVar = (zzdmv) zzgbc.zzq(this.zzf);
        try {
            zzfaf zzfafVar = this.zze;
            if (this.zzg.zzaG()) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzba)).booleanValue()) {
                    final zzceb zzcebVarZza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbjr.zzb(zzcebVarZza, zzdmvVar.zzg());
                    final zzdnu zzdnuVar = new zzdnu();
                    zzdnuVar.zza(this.zza, zzcebVarZza.zzF());
                    zzdmvVar.zzl().zzi(zzcebVarZza, true, this.zzi ? this.zzh : null, this.zzk.zza());
                    zzcebVarZza.zzN().zzC(new zzcfr() { // from class: com.google.android.gms.internal.ads.zzegg
                        @Override // com.google.android.gms.internal.ads.zzcfr
                        public final void zza(boolean z8, int i7, String str, String str2) {
                            zzdnuVar.zzb();
                            zzceb zzcebVar3 = zzcebVarZza;
                            zzcebVar3.zzab();
                            zzcebVar3.zzN().zzs();
                        }
                    });
                    zzcebVarZza.zzN().zzJ(new zzcfs() { // from class: com.google.android.gms.internal.ads.zzegh
                        @Override // com.google.android.gms.internal.ads.zzcfs
                        public final void zza() {
                            zzcebVarZza.zzaa();
                        }
                    });
                    zzfak zzfakVar = zzfafVar.zzs;
                    zzcebVarZza.zzae(zzfakVar.zzb, zzfakVar.zza, null);
                    zzcebVar = zzcebVarZza;
                } else {
                    zzcebVar2 = this.zzg;
                }
                zzcebVar.zzaq(true);
                if (this.zzi) {
                    zZze = this.zzh.zze(false);
                } else {
                    zZze = false;
                }
                P p5 = o.f1952C.f1957c;
                Context context2 = this.zza;
                z7 = this.zzi;
                boolean zH = P.h(context2);
                if (z7) {
                    zZzd = this.zzh.zzd();
                } else {
                    zZzd = false;
                }
                if (this.zzi) {
                    fZza = this.zzh.zza();
                } else {
                    fZza = 0.0f;
                }
                float f7 = fZza;
                zzfaf zzfafVar2 = this.zze;
                com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZze, zH, zZzd, f7, z4, zzfafVar2.zzO, zzfafVar2.zzP);
                if (zzcvdVar != null) {
                    zzcvdVar.zzf();
                }
                zzdeo zzdeoVarZzh = zzdmvVar.zzh();
                zzfaf zzfafVar3 = this.zze;
                VersionInfoParcel versionInfoParcel = this.zzd;
                int i7 = zzfafVar3.zzQ;
                String str = zzfafVar3.zzB;
                zzfak zzfakVar2 = zzfafVar3.zzs;
                C1009l0.o(context, new AdOverlayInfoParcel(zzdeoVarZzh, zzcebVar, i7, versionInfoParcel, str, zzlVar, zzfakVar2.zzb, zzfakVar2.zza, this.zzc.zzf, zzcvdVar, zzfafVar3.zzb() ? this.zzj : null, zzcebVar.zzr()), true, this.zzl);
            }
            zzcebVar2 = this.zzg;
            zzcebVar = zzcebVar2;
            zzcebVar.zzaq(true);
            if (this.zzi) {
                zZze = this.zzh.zze(false);
            } else {
                zZze = false;
            }
            P p7 = o.f1952C.f1957c;
            Context context3 = this.zza;
            z7 = this.zzi;
            boolean zH2 = P.h(context3);
            if (z7) {
                zZzd = this.zzh.zzd();
            } else {
                zZzd = false;
            }
            if (this.zzi) {
                fZza = this.zzh.zza();
            } else {
                fZza = 0.0f;
            }
            float f8 = fZza;
            zzfaf zzfafVar4 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zZze, zH2, zZzd, f8, z4, zzfafVar4.zzO, zzfafVar4.zzP);
            if (zzcvdVar != null) {
                zzcvdVar.zzf();
            }
            zzdeo zzdeoVarZzh2 = zzdmvVar.zzh();
            zzfaf zzfafVar5 = this.zze;
            VersionInfoParcel versionInfoParcel2 = this.zzd;
            int i8 = zzfafVar5.zzQ;
            String str2 = zzfafVar5.zzB;
            zzfak zzfakVar3 = zzfafVar5.zzs;
            if (zzfafVar5.zzb()) {
            }
            C1009l0.o(context, new AdOverlayInfoParcel(zzdeoVarZzh2, zzcebVar, i8, versionInfoParcel2, str2, zzlVar2, zzfakVar3.zzb, zzfakVar3.zza, this.zzc.zzf, zzcvdVar, zzfafVar5.zzb() ? this.zzj : null, zzcebVar.zzr()), true, this.zzl);
        } catch (zzcen e7) {
            int i9 = J.f3546b;
            j.e("", e7);
        }
    }
}
