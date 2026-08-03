package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzgwz<K, V> extends com.google.android.gms.internal.ads.zzgwu<K, V> implements com.google.android.gms.internal.ads.zzgxu<K, V> {
    private final transient com.google.android.gms.internal.ads.zzgww<V> emptySet;
    private transient com.google.android.gms.internal.ads.zzgww zza;

    zzgwz(com.google.android.gms.internal.ads.zzgwp zzgwpVar, int i, java.util.Comparator comparator) {
        super(zzgwpVar, i);
        this.emptySet = com.google.android.gms.internal.ads.zzgyn.zza;
    }

    public final com.google.android.gms.internal.ads.zzgww zza() {
        com.google.android.gms.internal.ads.zzgww zzgwwVar = this.zza;
        if (zzgwwVar != null) {
            return zzgwwVar;
        }
        com.google.android.gms.internal.ads.zzgwy zzgwyVar = new com.google.android.gms.internal.ads.zzgwy(this);
        this.zza = zzgwyVar;
        return zzgwyVar;
    }
}
