package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import java.util.List;
import p.AbstractC1520g;
import p.AbstractServiceConnectionC1527n;
import p.C1530q;

/* loaded from: classes.dex */
public final class zzbcz {
    private C1530q zza;
    private AbstractC1520g zzb;
    private AbstractServiceConnectionC1527n zzc;
    private zzbcy zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i7 = 0; i7 < queryIntentActivities.size(); i7++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i7).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(zzhew.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final C1530q zza() {
        AbstractC1520g abstractC1520g = this.zzb;
        if (abstractC1520g == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = abstractC1520g.c(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzhew.zza(activity)) != null) {
            zzhex zzhexVar = new zzhex(this);
            this.zzc = zzhexVar;
            AbstractC1520g.a(activity, zza, zzhexVar);
        }
    }

    public final void zzc(AbstractC1520g abstractC1520g) {
        this.zzb = abstractC1520g;
        abstractC1520g.getClass();
        try {
            ((c.b) abstractC1520g.f15641a).B0();
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
        AbstractServiceConnectionC1527n abstractServiceConnectionC1527n = this.zzc;
        if (abstractServiceConnectionC1527n == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC1527n);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
