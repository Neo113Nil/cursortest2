package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzinl extends androidx.browser.customtabs.CustomTabsServiceConnection {
    private final java.lang.ref.WeakReference zza;

    public zzinl(com.google.android.gms.internal.ads.zzbjr zzbjrVar) {
        this.zza = new java.lang.ref.WeakReference(zzbjrVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(android.content.ComponentName componentName, androidx.browser.customtabs.CustomTabsClient customTabsClient) {
        com.google.android.gms.internal.ads.zzbjr zzbjrVar = (com.google.android.gms.internal.ads.zzbjr) this.zza.get();
        if (zzbjrVar != null) {
            zzbjrVar.zzf(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.internal.ads.zzbjr zzbjrVar = (com.google.android.gms.internal.ads.zzbjr) this.zza.get();
        if (zzbjrVar != null) {
            zzbjrVar.zzg();
        }
    }
}
