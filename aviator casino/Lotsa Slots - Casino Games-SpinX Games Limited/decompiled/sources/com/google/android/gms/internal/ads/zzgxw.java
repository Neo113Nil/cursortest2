package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgxw extends com.google.android.gms.internal.ads.zzgya {
    final /* synthetic */ java.util.Comparator zza;

    zzgxw(java.util.Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    final java.util.Map zza() {
        return new java.util.TreeMap(this.zza);
    }
}
