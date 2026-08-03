package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzp implements java.util.Comparator {
    static final /* synthetic */ com.google.android.gms.ads.internal.client.zzp zza = new com.google.android.gms.ads.internal.client.zzp();

    private /* synthetic */ zzp() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List list = com.google.android.gms.ads.RequestConfiguration.zza;
        return list.indexOf((java.lang.String) obj) - list.indexOf((java.lang.String) obj2);
    }
}
