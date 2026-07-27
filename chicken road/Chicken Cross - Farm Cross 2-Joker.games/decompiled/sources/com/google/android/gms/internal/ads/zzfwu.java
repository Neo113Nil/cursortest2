package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfwu {
    private static final zzfwu zza = new zzfwu();
    private WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static zzfwu zza() {
        return zza;
    }

    public final void zzb(Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new zzfwt(this), intentFilter);
    }

    public final void zzc() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.zzb.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
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
        Iterator it = zzfwk.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfvq) it.next()).zzg().zzg(z2 || z);
        }
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzc = z;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzd;
    }
}
