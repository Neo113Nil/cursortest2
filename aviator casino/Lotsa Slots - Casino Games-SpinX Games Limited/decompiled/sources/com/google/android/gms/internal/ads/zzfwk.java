package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfwk {
    private final com.google.android.gms.internal.ads.zzfvl zza;
    private final java.util.ArrayList zzb;

    public zzfwk(com.google.android.gms.internal.ads.zzfvl zzfvlVar, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.zzb = arrayList;
        this.zza = zzfvlVar;
        arrayList.add(str);
    }

    public final void zza(java.lang.String str) {
        this.zzb.add(str);
    }

    public final com.google.android.gms.internal.ads.zzfvl zzb() {
        return this.zza;
    }

    public final java.util.ArrayList zzc() {
        return this.zzb;
    }
}
