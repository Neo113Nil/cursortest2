package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzaau<T> implements zzaba<T> {
    private final zzaaq zzbvr;
    private final zzabo<?, ?> zzbvs;
    private final boolean zzbvt;
    private final zzzo<?> zzbvu;

    private zzaau(zzabo<?, ?> zzaboVar, zzzo<?> zzzoVar, zzaaq zzaaqVar) {
        this.zzbvs = zzaboVar;
        this.zzbvt = zzzoVar.zza(zzaaqVar);
        this.zzbvu = zzzoVar;
        this.zzbvr = zzaaqVar;
    }

    static <T> zzaau<T> zza(zzabo<?, ?> zzaboVar, zzzo<?> zzzoVar, zzaaq zzaaqVar) {
        return new zzaau<>(zzaboVar, zzzoVar, zzaaqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzaba
    public final boolean equals(T t, T t2) {
        if (!this.zzbvs.zzu(t).equals(this.zzbvs.zzu(t2))) {
            return false;
        }
        if (this.zzbvt) {
            return this.zzbvu.zzs(t).equals(this.zzbvu.zzs(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzaba
    public final int hashCode(T t) {
        int hashCode = this.zzbvs.zzu(t).hashCode();
        return this.zzbvt ? (hashCode * 53) + this.zzbvu.zzs(t).hashCode() : hashCode;
    }
}
