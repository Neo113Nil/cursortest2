package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzd extends com.google.android.gms.measurement.internal.zzf {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private long zzc;

    public zzd(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
        this.zzb = new androidx.collection.ArrayMap();
        this.zza = new androidx.collection.ArrayMap();
    }

    private final void zzh(long j, com.google.android.gms.measurement.internal.zzlt zzltVar) {
        if (zzltVar == null) {
            this.zzu.zzaV().zzk().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.zzu.zzaV().zzk().zzb("Not logging ad exposure. Less than 1000 ms. exposure", java.lang.Long.valueOf(j));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_xt", j);
        com.google.android.gms.measurement.internal.zzpo.zzav(zzltVar, bundle, true);
        this.zzu.zzj().zzF("am", "_xa", bundle);
    }

    private final void zzi(java.lang.String str, long j, com.google.android.gms.measurement.internal.zzlt zzltVar) {
        if (zzltVar == null) {
            this.zzu.zzaV().zzk().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.zzu.zzaV().zzk().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", java.lang.Long.valueOf(j));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        com.google.android.gms.measurement.internal.zzpo.zzav(zzltVar, bundle, true);
        this.zzu.zzj().zzF("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final void zzf(long j) {
        java.util.Map map = this.zza;
        java.util.Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((java.lang.String) it.next(), java.lang.Long.valueOf(j));
        }
        if (map.isEmpty()) {
            return;
        }
        this.zzc = j;
    }

    public final void zza(java.lang.String str, long j) {
        if (str == null || str.length() == 0) {
            this.zzu.zzaV().zzb().zza("Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zza(this, str, j));
        }
    }

    public final void zzb(java.lang.String str, long j) {
        if (str == null || str.length() == 0) {
            this.zzu.zzaV().zzb().zza("Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzb(this, str, j));
        }
    }

    public final void zzc(long j) {
        com.google.android.gms.measurement.internal.zzlt zzh = this.zzu.zzs().zzh(false);
        java.util.Map map = this.zza;
        for (java.lang.String str : map.keySet()) {
            zzi(str, j - ((java.lang.Long) map.get(str)).longValue(), zzh);
        }
        if (!map.isEmpty()) {
            zzh(j - this.zzc, zzh);
        }
        zzf(j);
    }

    final /* synthetic */ void zzd(java.lang.String str, long j) {
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        java.util.Map map = this.zzb;
        if (map.isEmpty()) {
            this.zzc = j;
        }
        java.lang.Integer num = (java.lang.Integer) map.get(str);
        if (num != null) {
            map.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            this.zzu.zzaV().zze().zza("Too many ads visible");
        } else {
            map.put(str, 1);
            this.zza.put(str, java.lang.Long.valueOf(j));
        }
    }

    final /* synthetic */ void zze(java.lang.String str, long j) {
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        java.util.Map map = this.zzb;
        java.lang.Integer num = (java.lang.Integer) map.get(str);
        if (num == null) {
            this.zzu.zzaV().zzb().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        com.google.android.gms.measurement.internal.zzlt zzh = this.zzu.zzs().zzh(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            map.put(str, java.lang.Integer.valueOf(intValue));
            return;
        }
        map.remove(str);
        java.util.Map map2 = this.zza;
        java.lang.Long l = (java.lang.Long) map2.get(str);
        if (l == null) {
            this.zzu.zzaV().zzb().zza("First ad unit exposure time was never set");
        } else {
            long longValue = j - l.longValue();
            map2.remove(str);
            zzi(str, longValue, zzh);
        }
        if (map.isEmpty()) {
            long j2 = this.zzc;
            if (j2 == 0) {
                this.zzu.zzaV().zzb().zza("First ad exposure time was never set");
            } else {
                zzh(j - j2, zzh);
                this.zzc = 0L;
            }
        }
    }
}
