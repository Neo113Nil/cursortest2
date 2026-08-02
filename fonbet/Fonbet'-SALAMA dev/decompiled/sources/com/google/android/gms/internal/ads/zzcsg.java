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

/* loaded from: classes.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (android.text.TextUtils.equals(r0, "service") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd() {
        zzbui zzbuiVar;
        int i7;
        int i8;
        zzbnq zza;
        if (!this.zzb.getAndSet(true)) {
            if (!((Boolean) zzbdy.zzj.zze()).booleanValue()) {
                i7 = 3;
                if (!((Boolean) zzbdy.zzk.zze()).booleanValue()) {
                    if (((Boolean) zzbdy.zzi.zze()).booleanValue()) {
                        try {
                            String optString = new JSONObject(((M) o.f1952C.f1961g.zzi()).n().zzc()).optString("local_flag_write");
                            if (TextUtils.equals(optString, "client")) {
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i7 = 1;
                }
                i8 = i7 - 1;
                if (i8 != 1) {
                    zza = o.f1952C.f1970q.zza(this.zzc, VersionInfoParcel.j(), this.zzd);
                } else if (i8 == 2) {
                    zza = o.f1952C.f1970q.zzb(this.zzc, VersionInfoParcel.j(), this.zzd);
                }
                zzbnk zzbnkVar = zzbnn.zza;
                this.zza = new zzbuk(this.zzc, zza.zza("google.afma.sdkConstants.getSdkConstants", zzbnkVar, zzbnkVar), this.zze);
                this.zzg = true;
            }
            i7 = 2;
            i8 = i7 - 1;
            if (i8 != 1) {
            }
            zzbnk zzbnkVar2 = zzbnn.zza;
            this.zza = new zzbuk(this.zzc, zza.zza("google.afma.sdkConstants.getSdkConstants", zzbnkVar2, zzbnkVar2), this.zze);
            this.zzg = true;
        }
        if (this.zzg && (zzbuiVar = this.zza) != null) {
            I3.b zza2 = zzbuiVar.zza();
            if (!this.zzh && ((Boolean) zzbdq.zzi.zze()).booleanValue()) {
                zza2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcsg.zzc(zzcsg.this);
                    }
                }, this.zzf);
            }
            zzbzd.zza(zza2, "persistFlagsClient");
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
