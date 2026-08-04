package com.google.android.gms.internal.ads;

import E2.o;
import I2.M;
import P2.v;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzcsg implements zzcxn, zzddb {
    private zzbui zza;
    private final Context zzc;
    private final zzfgb zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    public zzcsg(Context context, zzfgb zzfgbVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzfgbVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    public static /* synthetic */ void zzc(zzcsg zzcsgVar) {
        zzbbi.zze(zzcsgVar.zzc);
        zzcsgVar.zzh = true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void zzd() {
        zzbui zzbuiVar;
        int i7;
        zzbnq zzbnqVarZza;
        if (!this.zzb.getAndSet(true)) {
            if (((Boolean) zzbdy.zzj.zze()).booleanValue()) {
                i7 = 2;
            } else {
                i7 = 3;
                if (!((Boolean) zzbdy.zzk.zze()).booleanValue()) {
                    if (((Boolean) zzbdy.zzi.zze()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(((M) o.f1952C.f1961g.zzi()).n().zzc()).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i7 = 2;
                            } else if (!TextUtils.equals(strOptString, "service")) {
                                i7 = 1;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i7 = 1;
                    }
                }
            }
            int i8 = i7 - 1;
            if (i8 == 1) {
                zzbnqVarZza = o.f1952C.f1970q.zza(this.zzc, VersionInfoParcel.j(), this.zzd);
            } else if (i8 == 2) {
                zzbnqVarZza = o.f1952C.f1970q.zzb(this.zzc, VersionInfoParcel.j(), this.zzd);
            }
            zzbnk zzbnkVar = zzbnn.zza;
            this.zza = new zzbuk(this.zzc, zzbnqVarZza.zza("google.afma.sdkConstants.getSdkConstants", zzbnkVar, zzbnkVar), this.zze);
            this.zzg = true;
        }
        if (this.zzg && (zzbuiVar = this.zza) != null) {
            I3.b bVarZza = zzbuiVar.zza();
            if (!this.zzh && ((Boolean) zzbdq.zzi.zze()).booleanValue()) {
                bVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcsg.zzc(this.zza);
                    }
                }, this.zzf);
            }
            zzbzd.zza(bVarZza, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdl(zzbuo zzbuoVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdm(zzfar zzfarVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zze(v vVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzf(String str) {
        zzd();
    }
}
