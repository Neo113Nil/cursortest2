package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzieo extends java.util.AbstractList {
    private final com.google.android.gms.internal.ads.zziem zza;
    private final com.google.android.gms.internal.ads.zzien zzb;

    public zzieo(com.google.android.gms.internal.ads.zziem zziemVar, com.google.android.gms.internal.ads.zzien zzienVar) {
        this.zza = zziemVar;
        this.zzb = zzienVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        return this.zzb.zzb(this.zza.zzf(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
