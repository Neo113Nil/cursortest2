package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbjm extends androidx.browser.customtabs.CustomTabsCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbjp zza;

    zzbjm(com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        java.util.Objects.requireNonNull(zzbjpVar);
        this.zza = zzbjpVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, android.os.Bundle bundle) {
        this.zza.zzc(i);
    }
}
