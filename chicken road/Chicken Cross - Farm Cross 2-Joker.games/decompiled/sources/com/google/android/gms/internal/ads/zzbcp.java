package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbcp {
    private static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private long zzb = 0;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;

    zzbcp(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new zzbco(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static zzbcp zza(Context context, Executor executor) {
        return new zzbcp(context, executor, zza);
    }

    public final void zzb() {
        if (this.zze) {
            this.zzc = System.currentTimeMillis();
        }
    }

    public final long zzc() {
        if (this.zze) {
            return this.zzc - this.zzb;
        }
        return -1L;
    }

    public final long zzd() {
        long j = this.zzd;
        this.zzd = -1L;
        return j;
    }

    final /* synthetic */ void zze(long j) {
        this.zzb = j;
    }

    final /* synthetic */ long zzf() {
        return this.zzc;
    }

    final /* synthetic */ void zzg(long j) {
        this.zzd = j;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zze = z;
    }
}
