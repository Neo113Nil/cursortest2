package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
abstract class zzhm {
    final sun.misc.Unsafe zza;

    zzhm(sun.misc.Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(java.lang.Object obj, long j, byte b);

    public abstract boolean zzb(java.lang.Object obj, long j);

    public abstract void zzc(java.lang.Object obj, long j, boolean z);

    public abstract float zzd(java.lang.Object obj, long j);

    public abstract void zze(java.lang.Object obj, long j, float f);

    public abstract double zzf(java.lang.Object obj, long j);

    public abstract void zzg(java.lang.Object obj, long j, double d);

    public final long zzh(java.lang.reflect.Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final int zzi(java.lang.Class cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzj(java.lang.Class cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzk(java.lang.Object obj, long j) {
        return this.zza.getInt(obj, j);
    }

    public final void zzl(java.lang.Object obj, long j, int i) {
        this.zza.putInt(obj, j, i);
    }

    public final long zzm(java.lang.Object obj, long j) {
        return this.zza.getLong(obj, j);
    }

    public final void zzn(java.lang.Object obj, long j, long j2) {
        this.zza.putLong(obj, j, j2);
    }

    public final java.lang.Object zzo(java.lang.Object obj, long j) {
        return this.zza.getObject(obj, j);
    }

    public final void zzp(java.lang.Object obj, long j, java.lang.Object obj2) {
        this.zza.putObject(obj, j, obj2);
    }
}
