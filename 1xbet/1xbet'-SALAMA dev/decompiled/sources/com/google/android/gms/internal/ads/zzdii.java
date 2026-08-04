package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzdii implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdmf zzd;
    private final p090m3.a zze;
    private zzbha zzf;
    private zzbiz zzg;

    public zzdii(zzdmf zzdmfVar, p090m3.a aVar) {
        this.zzd = zzdmfVar;
        this.zze = aVar;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            ((p090m3.b) this.zze).getClass();
            map.put("time_interval", String.valueOf(System.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzj("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final zzbha zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void zzc(final zzbha zzbhaVar) {
        this.zzf = zzbhaVar;
        zzbiz zzbizVar = this.zzg;
        if (zzbizVar != null) {
            this.zzd.zzn("/unconfirmedClick", zzbizVar);
        }
        zzbiz zzbizVar2 = new zzbiz() { // from class: com.google.android.gms.internal.ads.zzdih
            @Override // com.google.android.gms.internal.ads.zzbiz
            public final void zza(Object obj, Map map) {
                zzdii zzdiiVar = this.zza;
                try {
                    zzdiiVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i7 = J.f3546b;
                    j.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbha zzbhaVar2 = zzbhaVar;
                zzdiiVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbhaVar2 == null) {
                    int i8 = J.f3546b;
                    j.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzbhaVar2.zzf(str);
                    } catch (RemoteException e7) {
                        j.i("#007 Could not call remote method.", e7);
                    }
                }
            }
        };
        this.zzg = zzbizVar2;
        this.zzd.zzl("/unconfirmedClick", zzbizVar2);
    }
}
