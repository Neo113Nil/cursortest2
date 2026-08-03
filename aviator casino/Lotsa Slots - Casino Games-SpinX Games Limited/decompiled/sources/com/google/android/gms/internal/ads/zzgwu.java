package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzgwu<K, V> extends com.google.android.gms.internal.ads.zzgvg<K, V> implements java.io.Serializable {
    final transient com.google.android.gms.internal.ads.zzgwp<K, ? extends com.google.android.gms.internal.ads.zzgwi<V>> map;
    final transient int size;

    zzgwu(com.google.android.gms.internal.ads.zzgwp zzgwpVar, int i) {
        this.map = zzgwpVar;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final int zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvf, com.google.android.gms.internal.ads.zzgxu
    @java.lang.Deprecated
    public final boolean zze(java.lang.Object obj, java.lang.Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    @java.lang.Deprecated
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvf
    final java.util.Set zzh() {
        throw new java.lang.AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.zzgvf
    final /* synthetic */ java.util.Collection zzj() {
        return new com.google.android.gms.internal.ads.zzgwt(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvf
    final java.util.Map zzl() {
        throw new java.lang.AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.zzgvf
    public final boolean zzr(java.lang.Object obj) {
        return obj != null && super.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvf, com.google.android.gms.internal.ads.zzgxu
    public final /* bridge */ /* synthetic */ java.util.Collection zzt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvf, com.google.android.gms.internal.ads.zzgxu
    public /* synthetic */ java.util.Map zzu() {
        return this.map;
    }
}
