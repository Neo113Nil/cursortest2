package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzfkm {
    private static final zzfkm zza = new zzfkm();
    private WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static zzfkm zza() {
        return zza;
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

    public final void zzd(boolean z4, boolean z7) {
        if ((z7 || z4) == (this.zzd || this.zzc)) {
            return;
        }
        Iterator it = zzfkc.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzfjl) it.next()).zzg().zzm(z7 || z4);
        }
    }

    public final void zze(Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new zzfkl(this), intentFilter);
    }
}
