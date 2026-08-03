package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzibf extends com.google.android.gms.internal.ads.zzibg implements java.lang.Iterable {
    private final java.util.ArrayList zza = new java.util.ArrayList();

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.android.gms.internal.ads.zzibf) && ((com.google.android.gms.internal.ads.zzibf) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.zza.iterator();
    }

    public final void zza(com.google.android.gms.internal.ads.zzibg zzibgVar) {
        this.zza.add(zzibgVar);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final com.google.android.gms.internal.ads.zzibg zzc(int i) {
        return (com.google.android.gms.internal.ads.zzibg) this.zza.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzibg
    public final java.lang.String zzd() {
        java.util.ArrayList arrayList = this.zza;
        int size = arrayList.size();
        if (size == 1) {
            return ((com.google.android.gms.internal.ads.zzibg) arrayList.get(0)).zzd();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(size).length() + 37);
        sb.append("Array must have size 1, but has size ");
        sb.append(size);
        throw new java.lang.IllegalStateException(sb.toString());
    }
}
