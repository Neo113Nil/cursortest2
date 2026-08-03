package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdhv extends com.google.android.gms.internal.ads.zzdip implements com.google.android.gms.internal.ads.zzboi {
    public zzdhv(java.util.Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final synchronized void zzb(final java.lang.String str, final java.lang.String str2) {
        zzs(new com.google.android.gms.internal.ads.zzdio() { // from class: com.google.android.gms.internal.ads.zzdhu
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.ads.admanager.AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
