package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.play.core.hsdp.protocol.PrewarmRequest;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
final class zzai implements zzr, zzbb {
    private final Context zza;
    private final zzbc zzb;
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private zzaf zzd;

    public zzai(Intent intent, Context context) {
        this.zza = context;
        if (!com.google.android.gms.internal.playcore_hsdp.zzf.zza(context)) {
            throw new IllegalStateException("HSDP service is not available.");
        }
        this.zzb = new zzbn(context.getApplicationContext(), "HsdpService", intent, new zzba() { // from class: com.google.android.play.core.hsdp.service.zzv
            @Override // com.google.android.play.core.hsdp.service.zzba
            public final Object zza(IBinder iBinder) {
                return com.google.android.play.core.hsdp.protocol.zzg.zzb(iBinder);
            }
        });
    }

    public static /* synthetic */ void zzi(zzai zzaiVar) {
        Iterator it = zzaiVar.zzc.values().iterator();
        while (it.hasNext()) {
            ((zzay) it.next()).zzd(4);
            it.remove();
        }
        Log.d("HsdpClientImpl", "HSDP overlays: empty");
    }

    public static /* synthetic */ void zzm(zzai zzaiVar, String str, int i, Runnable runnable) {
        zzay zzayVar = (zzay) zzaiVar.zzc.get(str);
        if (zzayVar == null || !zzayVar.zzd(i) || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final Handler zzs() {
        return this.zzb.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ void zzt(String str, Bundle bundle) {
        try {
            zzbc zzbcVar = this.zzb;
            zzbc zzbcVar2 = zzbcVar;
            com.google.android.play.core.hsdp.protocol.zzh zzhVar = (com.google.android.play.core.hsdp.protocol.zzh) zzbcVar.zzb();
            if (zzhVar == null) {
                return;
            }
            zzhVar.zzc(this.zza.getPackageName(), str, bundle, this.zzd);
        } catch (DeadObjectException e) {
            Log.e("HsdpClientImpl", "hsdpService is dead", e);
        } catch (RemoteException e2) {
            Log.e("HsdpClientImpl", "Failed to call hsdpService.dismiss", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ void zzu(Bundle bundle) {
        try {
            zzbc zzbcVar = this.zzb;
            zzbc zzbcVar2 = zzbcVar;
            com.google.android.play.core.hsdp.protocol.zzh zzhVar = (com.google.android.play.core.hsdp.protocol.zzh) zzbcVar.zzb();
            if (zzhVar == null) {
                return;
            }
            zzhVar.zzd(bundle, this.zzd);
        } catch (DeadObjectException e) {
            Log.e("HsdpClientImpl", "hsdpService is dead", e);
        } catch (RemoteException e2) {
            Log.e("HsdpClientImpl", "Failed to call hsdpService.endSession", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ void zzv(List list, HsdpDeepLinkService.HsdpPrewarmListener hsdpPrewarmListener) {
        try {
            zzbc zzbcVar = this.zzb;
            zzbc zzbcVar2 = zzbcVar;
            com.google.android.play.core.hsdp.protocol.zzh zzhVar = (com.google.android.play.core.hsdp.protocol.zzh) zzbcVar.zzb();
            if (zzhVar == null) {
                return;
            }
            String packageName = this.zza.getPackageName();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HsdpPrewarmRequest hsdpPrewarmRequest = (HsdpPrewarmRequest) it.next();
                arrayList.add(new PrewarmRequest(hsdpPrewarmRequest.targetAppPackageName(), zzq.zzc(hsdpPrewarmRequest.targetAppPackageName(), hsdpPrewarmRequest.referrer(), hsdpPrewarmRequest.extraQueryParams()).toString(), hsdpPrewarmRequest.windowToken(), null));
            }
            zzhVar.zze(packageName, arrayList, new zzaa(this, hsdpPrewarmListener));
        } catch (DeadObjectException e) {
            Log.e("HsdpClientImpl", "hsdpService is dead", e);
        } catch (RemoteException e2) {
            Log.e("HsdpClientImpl", "Failed to call hsdpService.prewarm", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ void zzw(String str, String str2, Bundle bundle) {
        try {
            zzbc zzbcVar = this.zzb;
            zzbc zzbcVar2 = zzbcVar;
            com.google.android.play.core.hsdp.protocol.zzh zzhVar = (com.google.android.play.core.hsdp.protocol.zzh) zzbcVar.zzb();
            if (zzhVar == null) {
                return;
            }
            zzhVar.zzf(this.zza.getPackageName(), str, str2, bundle, this.zzd);
        } catch (DeadObjectException e) {
            Log.e("HsdpClientImpl", "hsdpService is dead", e);
        } catch (RemoteException e2) {
            Log.e("HsdpClientImpl", "Failed to call hsdpService.show", e2);
        }
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final void zzb(final String str) {
        if (((zzay) this.zzc.get(str)) == null) {
            Log.w("HsdpClientImpl", "No active overlay for target package: " + str + ". Please call show() first.");
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("sdkVersion", HsdpDeepLinkService.SDK_VERSION);
        bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
        this.zzb.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzt
            @Override // java.lang.Runnable
            public final void run() {
                zzai.this.zzt(str, bundle);
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final void zzc(String str) {
        if (((zzay) this.zzc.get(str)) == null) {
            Log.w("HsdpClientImpl", "No active overlay for target package: " + str + ". Please call show() first.");
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("callingPackage", this.zza.getPackageName());
        bundle.putString("targetPackage", str);
        bundle.putString("sdkVersion", HsdpDeepLinkService.SDK_VERSION);
        bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
        this.zzb.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzx
            @Override // java.lang.Runnable
            public final void run() {
                zzai.this.zzu(bundle);
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final void zzd(final List list, final HsdpDeepLinkService.HsdpPrewarmListener hsdpPrewarmListener) {
        this.zzb.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzy
            @Override // java.lang.Runnable
            public final void run() {
                zzai.this.zzv(list, hsdpPrewarmListener);
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final void zze(final String str, final String str2, IBinder iBinder, int i, int i2, boolean z, HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener) {
        zzay zzayVar = (zzay) this.zzc.putIfAbsent(str, new zzay(str, hsdpDeepLinkServiceListener));
        if (zzayVar != null) {
            zzayVar.zzb(hsdpDeepLinkServiceListener);
        }
        final Bundle bundle = new Bundle();
        bundle.putBinder("windowToken", iBinder);
        bundle.putInt("clientWindowWidthPx", i);
        bundle.putInt("clientWindowHeightPx", i2);
        bundle.putString("sdkVersion", HsdpDeepLinkService.SDK_VERSION);
        bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
        bundle.putBoolean("autoTrigger", z);
        this.zzb.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzu
            @Override // java.lang.Runnable
            public final void run() {
                zzai.this.zzw(str, str2, bundle);
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final boolean zzf() {
        com.google.android.play.core.hsdp.protocol.zzh zzhVar = (com.google.android.play.core.hsdp.protocol.zzh) this.zzb.zzb();
        return zzhVar != null && zzhVar.asBinder().isBinderAlive();
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final boolean zzg(String str) {
        zzay zzayVar = (zzay) this.zzc.get(str);
        return zzayVar != null && zzayVar.zzc();
    }

    public final void zzp() {
        this.zzd = new zzae(this);
        this.zzb.zzc(this);
    }

    @Override // com.google.android.play.core.hsdp.service.zzbb
    public final void zzq() {
        Log.i("HsdpClientImpl", "HSDP bound service connected");
    }

    @Override // com.google.android.play.core.hsdp.service.zzbb
    public final void zzr() {
        Log.i("HsdpClientImpl", "HSDP bound service disconnected");
        zzs().post(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzz
            @Override // java.lang.Runnable
            public final void run() {
                zzai.zzi(zzai.this);
            }
        });
    }
}
