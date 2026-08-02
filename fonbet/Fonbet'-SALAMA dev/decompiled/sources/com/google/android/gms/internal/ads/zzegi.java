package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import w1.C1718l0;

/* loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0092  */
    @Override // com.google.android.gms.internal.ads.zzdez
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z4, Context context, zzcvd zzcvdVar) {
        zzceb zzcebVar;
        zzceb zzcebVar2;
        zzdmv zzdmvVar = (zzdmv) zzgbc.zzq(this.zzf);
        try {
            zzfaf zzfafVar = this.zze;
            if (this.zzg.zzaG()) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzba)).booleanValue()) {
                    final zzceb zza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbjr.zzb(zza, zzdmvVar.zzg());
                    final zzdnu zzdnuVar = new zzdnu();
                    zzdnuVar.zza(this.zza, zza.zzF());
                    zzdmvVar.zzl().zzi(zza, true, this.zzi ? this.zzh : null, this.zzk.zza());
                    zza.zzN().zzC(new zzcfr() { // from class: com.google.android.gms.internal.ads.zzegg
                        @Override // com.google.android.gms.internal.ads.zzcfr
                        public final void zza(boolean z7, int i7, String str, String str2) {
                            zzdnu.this.zzb();
                            zzceb zzcebVar3 = zza;
                            zzcebVar3.zzab();
                            zzcebVar3.zzN().zzs();
                        }
                    });
                    zza.zzN().zzJ(new zzcfs() { // from class: com.google.android.gms.internal.ads.zzegh
                        @Override // com.google.android.gms.internal.ads.zzcfs
                        public final void zza() {
                            zzceb.this.zzaa();
                        }
                    });
                    zzfak zzfakVar = zzfafVar.zzs;
                    zza.zzae(zzfakVar.zzb, zzfakVar.zza, null);
                    zzcebVar = zza;
                    zzcebVar.zzaq(true);
                    boolean zze = !this.zzi ? this.zzh.zze(false) : false;
                    P p5 = o.f1952C.f1957c;
                    Context context2 = this.zza;
                    boolean z7 = this.zzi;
                    boolean h6 = P.h(context2);
                    boolean zzd = !z7 ? this.zzh.zzd() : false;
                    float zza2 = !this.zzi ? this.zzh.zza() : 0.0f;
                    zzfaf zzfafVar2 = this.zze;
                    com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zze, h6, zzd, zza2, z4, zzfafVar2.zzO, zzfafVar2.zzP);
                    if (zzcvdVar != null) {
                        zzcvdVar.zzf();
                    }
                    zzdeo zzh = zzdmvVar.zzh();
                    zzfaf zzfafVar3 = this.zze;
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    int i7 = zzfafVar3.zzQ;
                    String str = zzfafVar3.zzB;
                    zzfak zzfakVar2 = zzfafVar3.zzs;
                    String str2 = zzfakVar2.zzb;
                    String str3 = zzfakVar2.zza;
                    zzfba zzfbaVar = this.zzc;
                    C1718l0.o(context, new AdOverlayInfoParcel(zzh, zzcebVar, i7, versionInfoParcel, str, zzlVar, str2, str3, zzfbaVar.zzf, zzcvdVar, zzfafVar3.zzb() ? this.zzj : null, zzcebVar.zzr()), true, this.zzl);
                }
                zzcebVar2 = this.zzg;
            } else {
                zzcebVar2 = this.zzg;
            }
            zzcebVar = zzcebVar2;
            zzcebVar.zzaq(true);
            if (!this.zzi) {
            }
            P p52 = o.f1952C.f1957c;
            Context context22 = this.zza;
            boolean z72 = this.zzi;
            boolean h62 = P.h(context22);
            if (!z72) {
            }
            float zza22 = !this.zzi ? this.zzh.zza() : 0.0f;
            zzfaf zzfafVar22 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar2 = new com.google.android.gms.ads.internal.zzl(zze, h62, zzd, zza22, z4, zzfafVar22.zzO, zzfafVar22.zzP);
            if (zzcvdVar != null) {
            }
            zzdeo zzh2 = zzdmvVar.zzh();
            zzfaf zzfafVar32 = this.zze;
            VersionInfoParcel versionInfoParcel2 = this.zzd;
            int i72 = zzfafVar32.zzQ;
            String str4 = zzfafVar32.zzB;
            zzfak zzfakVar22 = zzfafVar32.zzs;
            String str22 = zzfakVar22.zzb;
            String str32 = zzfakVar22.zza;
            zzfba zzfbaVar2 = this.zzc;
            if (zzfafVar32.zzb()) {
            }
            C1718l0.o(context, new AdOverlayInfoParcel(zzh2, zzcebVar, i72, versionInfoParcel2, str4, zzlVar2, str22, str32, zzfbaVar2.zzf, zzcvdVar, zzfafVar32.zzb() ? this.zzj : null, zzcebVar.zzr()), true, this.zzl);
        } catch (zzcen e7) {
            int i8 = J.f3546b;
            j.e("", e7);
        }
    }
}
