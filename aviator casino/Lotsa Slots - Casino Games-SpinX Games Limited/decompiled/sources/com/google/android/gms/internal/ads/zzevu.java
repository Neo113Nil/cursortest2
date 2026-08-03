package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzevu implements com.google.android.gms.internal.ads.zzhbe {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzevu zza = new com.google.android.gms.internal.ads.zzevu();

    private /* synthetic */ zzevu() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
        com.google.android.gms.appset.AppSetIdInfo appSetIdInfo = (com.google.android.gms.appset.AppSetIdInfo) obj;
        return appSetIdInfo == null ? com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzevy(null, -1)) : com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzevy(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
