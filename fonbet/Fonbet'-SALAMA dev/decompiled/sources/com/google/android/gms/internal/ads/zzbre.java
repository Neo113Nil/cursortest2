package com.google.android.gms.internal.ads;

import H2.m;
import J2.j;

/* loaded from: classes.dex */
final class zzbre implements m {
    final /* synthetic */ zzbrg zza;

    public zzbre(zzbrg zzbrgVar) {
        this.zza = zzbrgVar;
    }

    @Override // H2.m
    public final void zzdE() {
        j.b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // H2.m
    public final void zzdi() {
        j.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // H2.m
    public final void zzdo() {
        j.b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // H2.m
    public final void zzdp() {
        L2.m mVar;
        j.b("Opening AdMobCustomTabsAdapter overlay.");
        zzbrg zzbrgVar = this.zza;
        mVar = zzbrgVar.zzb;
        mVar.onAdOpened(zzbrgVar);
    }

    @Override // H2.m
    public final void zzdr() {
    }

    @Override // H2.m
    public final void zzds(int i7) {
        L2.m mVar;
        j.b("AdMobCustomTabsAdapter overlay is closed.");
        zzbrg zzbrgVar = this.zza;
        mVar = zzbrgVar.zzb;
        mVar.onAdClosed(zzbrgVar);
    }
}
