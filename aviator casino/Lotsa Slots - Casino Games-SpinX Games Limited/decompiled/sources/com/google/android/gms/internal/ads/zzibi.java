package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzibi extends com.google.android.gms.internal.ads.zzibg {
    private final com.google.android.gms.internal.ads.zzibw zza = new com.google.android.gms.internal.ads.zzibw(false);

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.android.gms.internal.ads.zzibi) && ((com.google.android.gms.internal.ads.zzibi) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(java.lang.String str, com.google.android.gms.internal.ads.zzibg zzibgVar) {
        this.zza.put(str, zzibgVar);
    }

    public final java.util.Set zzb() {
        return this.zza.entrySet();
    }

    public final boolean zzc(java.lang.String str) {
        return this.zza.containsKey(str);
    }

    public final com.google.android.gms.internal.ads.zzibg zzh(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzibg) this.zza.get(str);
    }
}
