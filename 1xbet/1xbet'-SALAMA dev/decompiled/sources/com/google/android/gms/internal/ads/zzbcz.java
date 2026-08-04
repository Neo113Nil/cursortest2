package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import java.util.List;
import p109p.g;
import p109p.n;
import p109p.q;

/* JADX INFO: loaded from: classes.dex */
public final class zzbcz {
    private q zza;
    private g zzb;
    private n zzc;
    private zzbcy zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i7 = 0; i7 < listQueryIntentActivities.size(); i7++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i7).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzhew.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final q zza() {
        g gVar = this.zzb;
        if (gVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = gVar.c(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzhew.zza(activity)) != null) {
            zzhex zzhexVar = new zzhex(this);
            this.zzc = zzhexVar;
            g.a(activity, strZza, zzhexVar);
        }
    }

    public final void zzc(g gVar) {
        this.zzb = gVar;
        gVar.getClass();
        try {
            ((p017c.b) gVar.f15647a).B0();
        } catch (RemoteException unused) {
        }
        zzbcy zzbcyVar = this.zzd;
        if (zzbcyVar != null) {
            zzbcyVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbcy zzbcyVar) {
        this.zzd = zzbcyVar;
    }

    public final void zzf(Activity activity) {
        n nVar = this.zzc;
        if (nVar == null) {
            return;
        }
        activity.unbindService(nVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
