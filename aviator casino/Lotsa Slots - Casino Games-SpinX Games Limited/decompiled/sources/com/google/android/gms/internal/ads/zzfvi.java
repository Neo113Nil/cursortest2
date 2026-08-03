package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfvi {
    private static final com.google.android.gms.internal.ads.zzfvi zza = new com.google.android.gms.internal.ads.zzfvi();
    private final java.util.ArrayList zzb = new java.util.ArrayList();
    private final java.util.ArrayList zzc = new java.util.ArrayList();

    private zzfvi() {
    }

    public static com.google.android.gms.internal.ads.zzfvi zza() {
        return zza;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfuo zzfuoVar) {
        this.zzb.add(zzfuoVar);
    }

    public final void zzc(com.google.android.gms.internal.ads.zzfuo zzfuoVar) {
        java.util.ArrayList arrayList = this.zzc;
        boolean zzg = zzg();
        arrayList.add(zzfuoVar);
        if (zzg) {
            return;
        }
        com.google.android.gms.internal.ads.zzfvq.zza().zzc();
    }

    public final void zzd(com.google.android.gms.internal.ads.zzfuo zzfuoVar) {
        java.util.ArrayList arrayList = this.zzb;
        boolean zzg = zzg();
        arrayList.remove(zzfuoVar);
        this.zzc.remove(zzfuoVar);
        if (!zzg || zzg()) {
            return;
        }
        com.google.android.gms.internal.ads.zzfvq.zza().zze();
    }

    public final java.util.Collection zze() {
        return java.util.Collections.unmodifiableCollection(this.zzb);
    }

    public final java.util.Collection zzf() {
        return java.util.Collections.unmodifiableCollection(this.zzc);
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
