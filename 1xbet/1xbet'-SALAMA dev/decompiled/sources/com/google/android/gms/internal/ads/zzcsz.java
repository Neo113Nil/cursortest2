package com.google.android.gms.internal.ads;

import C0.C0083b;
import E2.o;
import F2.C0254t;
import I2.L;
import I2.M;
import P2.v;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzcsz implements zzcxn, zzddb {
    private final Context zza;
    private final zzfba zzb;
    private final VersionInfoParcel zzc;
    private final L zzd;
    private final zzdsu zze;
    private final zzfgb zzf;

    public zzcsz(Context context, zzfba zzfbaVar, VersionInfoParcel versionInfoParcel, L l7, zzdsu zzdsuVar, zzfgb zzfgbVar) {
        this.zza = context;
        this.zzb = zzfbaVar;
        this.zzc = versionInfoParcel;
        this.zzd = l7;
        this.zze = zzdsuVar;
        this.zzf = zzfgbVar;
    }

    private final void zzc() {
        String strZzb;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeg)).booleanValue()) {
            L l7 = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzfba zzfbaVar = this.zzb;
            zzfgb zzfgbVar = this.zzf;
            String str = zzfbaVar.zzf;
            zzbyk zzbykVarN = ((M) l7).n();
            C0083b c0083b = o.f1952C.f1964k;
            if (zzbykVarN != null) {
                c0083b.getClass();
                strZzb = zzbykVarN.zzb();
            } else {
                strZzb = null;
            }
            c0083b.G(context, versionInfoParcel, false, zzbykVarN, strZzb, str, null, zzfgbVar, null, null);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdl(zzbuo zzbuoVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdm(zzfar zzfarVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zze(v vVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeh)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzf(String str) {
    }
}
