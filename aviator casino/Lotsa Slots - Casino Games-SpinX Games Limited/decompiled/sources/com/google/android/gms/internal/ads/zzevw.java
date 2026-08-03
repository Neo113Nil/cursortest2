package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzevw implements com.google.android.gms.internal.ads.zzgta {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzevw zza = new com.google.android.gms.internal.ads.zzevw();

    private /* synthetic */ zzevw() {
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        com.google.android.gms.appset.AppSetIdInfo appSetIdInfo = (com.google.android.gms.appset.AppSetIdInfo) obj;
        return new com.google.android.gms.internal.ads.zzevy(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
