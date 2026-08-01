package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzion extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzion(zzbkh zzbkhVar) {
        this.zza = new WeakReference(zzbkhVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbkh zzbkhVar = (zzbkh) this.zza.get();
        if (zzbkhVar != null) {
            zzbkhVar.zzf(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbkh zzbkhVar = (zzbkh) this.zza.get();
        if (zzbkhVar != null) {
            zzbkhVar.zzg();
        }
    }
}
