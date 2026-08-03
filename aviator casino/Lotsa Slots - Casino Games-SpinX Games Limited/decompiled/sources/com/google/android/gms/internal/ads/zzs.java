package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzs {
    private final android.util.SparseBooleanArray zza;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzs)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzs zzsVar = (com.google.android.gms.internal.ads.zzs) obj;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return this.zza.equals(zzsVar.zza);
        }
        android.util.SparseBooleanArray sparseBooleanArray = this.zza;
        if (sparseBooleanArray.size() != zzsVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            if (zzc(i) != zzsVar.zzc(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return this.zza.hashCode();
        }
        android.util.SparseBooleanArray sparseBooleanArray = this.zza;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            size = (size * 31) + zzc(i);
        }
        return size;
    }

    public final boolean zza(int i) {
        return this.zza.get(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i) {
        android.util.SparseBooleanArray sparseBooleanArray = this.zza;
        com.google.android.gms.internal.ads.zzgtj.zzm(i, sparseBooleanArray.size(), com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return sparseBooleanArray.keyAt(i);
    }
}
