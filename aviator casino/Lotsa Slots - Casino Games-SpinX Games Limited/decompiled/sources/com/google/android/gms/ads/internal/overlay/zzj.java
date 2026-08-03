package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzj {
    public final int zza;
    public final android.view.ViewGroup.LayoutParams zzb;
    public final android.view.ViewGroup zzc;
    public final android.content.Context zzd;

    public zzj(com.google.android.gms.internal.ads.zzcku zzckuVar) throws com.google.android.gms.ads.internal.overlay.zzh {
        this.zzb = zzckuVar.getLayoutParams();
        android.view.ViewParent parent = zzckuVar.getParent();
        this.zzd = zzckuVar.zzK();
        if (!(parent instanceof android.view.ViewGroup)) {
            throw new com.google.android.gms.ads.internal.overlay.zzh("Could not get the parent of the WebView for an overlay.");
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzckuVar.zzE());
        viewGroup.removeView(zzckuVar.zzE());
        zzckuVar.zzag(true);
    }
}
