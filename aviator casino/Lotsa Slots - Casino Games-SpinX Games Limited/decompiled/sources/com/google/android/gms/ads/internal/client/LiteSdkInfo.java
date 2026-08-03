package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class LiteSdkInfo extends com.google.android.gms.ads.internal.client.zzcu {
    public LiteSdkInfo(android.content.Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public com.google.android.gms.internal.ads.zzbvc getAdapterCreator() {
        return new com.google.android.gms.internal.ads.zzbuy();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public com.google.android.gms.ads.internal.client.zzez getLiteSdkVersion() {
        return new com.google.android.gms.ads.internal.client.zzez(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, "25.2.0");
    }
}
