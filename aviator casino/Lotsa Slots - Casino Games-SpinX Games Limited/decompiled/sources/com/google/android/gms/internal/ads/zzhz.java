package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhz extends com.google.android.gms.internal.ads.zzgwc {
    private final java.util.Map zza;

    public zzhz(java.util.Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return super.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, java.util.Map
    public final java.util.Set entrySet() {
        return com.google.android.gms.internal.ads.zzgyw.zzb(this.zza.entrySet(), com.google.android.gms.internal.ads.zzhx.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return obj != null && super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, java.util.Map
    public final /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return (java.util.List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, java.util.Map
    public final int hashCode() {
        return super.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, java.util.Map
    public final java.util.Set keySet() {
        return com.google.android.gms.internal.ads.zzgyw.zzb(this.zza.keySet(), com.google.android.gms.internal.ads.zzhy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwc
    protected final java.util.Map zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwc, com.google.android.gms.internal.ads.zzgwd
    protected final /* synthetic */ java.lang.Object zzb() {
        return this.zza;
    }
}
