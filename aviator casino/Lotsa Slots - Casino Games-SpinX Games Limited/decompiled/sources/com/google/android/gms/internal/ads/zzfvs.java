package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfvs {
    private static final com.google.android.gms.internal.ads.zzfvs zza = new com.google.android.gms.internal.ads.zzfvs();
    private java.lang.ref.WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static com.google.android.gms.internal.ads.zzfvs zza() {
        return zza;
    }

    public final void zzb(android.content.Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new java.lang.ref.WeakReference(context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new com.google.android.gms.internal.ads.zzfvr(this), intentFilter);
    }

    public final void zzc() {
        android.app.KeyguardManager keyguardManager;
        android.content.Context context = (android.content.Context) this.zzb.get();
        if (context == null || (keyguardManager = (android.app.KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean isDeviceLocked = keyguardManager.isDeviceLocked();
        zzd(this.zzc, isDeviceLocked);
        this.zzd = isDeviceLocked;
    }

    public final void zzd(boolean z, boolean z2) {
        if ((z2 || z) == (this.zzd || this.zzc)) {
            return;
        }
        java.util.Iterator it = com.google.android.gms.internal.ads.zzfvi.zza().zze().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzfuo) it.next()).zzg().zzg(z2 || z);
        }
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzc = z;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzd;
    }
}
