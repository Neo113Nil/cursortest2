package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdaw implements zzdgv, zzdmi {
    private zzcbo zza;
    private final Context zzc;
    private final zzfrj zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    zzdaw(Context context, zzfrj zzfrjVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzfrjVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (android.text.TextUtils.equals(r0, androidx.core.app.NotificationCompat.CATEGORY_SERVICE) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() {
        zzcbo zzcboVar;
        int i;
        int i2;
        zzbva zzb;
        if (!this.zzb.getAndSet(true)) {
            if (!((Boolean) zzblh.zzo.zze()).booleanValue()) {
                i = 3;
                if (!((Boolean) zzblh.zzp.zze()).booleanValue()) {
                    if (((Boolean) zzblh.zzn.zze()).booleanValue()) {
                        try {
                            String optString = new JSONObject(com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzd()).optString("local_flag_write");
                            if (TextUtils.equals(optString, "client")) {
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i = 1;
                }
                i2 = i - 1;
                if (i2 != 1) {
                    zzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                } else if (i2 == 2) {
                    zzb = com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                }
                zzbuu zzbuuVar = zzbux.zza;
                this.zza = new zzcbr(this.zzc, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbuuVar, zzbuuVar), this.zze, this.zzf);
                this.zzg = true;
            }
            i = 2;
            i2 = i - 1;
            if (i2 != 1) {
            }
            zzbuu zzbuuVar2 = zzbux.zza;
            this.zza = new zzcbr(this.zzc, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbuuVar2, zzbuuVar2), this.zze, this.zzf);
            this.zzg = true;
        }
        if (this.zzg && (zzcboVar = this.zza) != null) {
            ListenableFuture zzb2 = zzcboVar.zzb();
            if (!this.zzh && ((Boolean) zzbkz.zzi.zze()).booleanValue()) {
                zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdav
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzdaw.this.zzf();
                    }
                }, this.zzf);
            }
            zzcgm.zza(zzb2, "persistFlagsClient", zzcgj.zzh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdP(zzcbv zzcbvVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdQ(zzflo zzfloVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zze(String str) {
        zzc();
    }

    final /* synthetic */ void zzf() {
        zzbir.zze(this.zzc);
        this.zzh = true;
    }
}
