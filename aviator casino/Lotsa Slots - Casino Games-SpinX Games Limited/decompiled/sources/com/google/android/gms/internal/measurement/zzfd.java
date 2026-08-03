package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzfd extends com.google.android.gms.internal.measurement.zzme implements com.google.android.gms.internal.measurement.zznm {
    private static final com.google.android.gms.internal.measurement.zzfd zzi;
    private int zzb;
    private int zzd;
    private com.google.android.gms.internal.measurement.zzmn zze = zzcv();
    private com.google.android.gms.internal.measurement.zzmn zzf = zzcv();
    private boolean zzg;
    private boolean zzh;

    static {
        com.google.android.gms.internal.measurement.zzfd zzfdVar = new com.google.android.gms.internal.measurement.zzfd();
        zzi = zzfdVar;
        com.google.android.gms.internal.measurement.zzme.zzcp(com.google.android.gms.internal.measurement.zzfd.class, zzfdVar);
    }

    private zzfd() {
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final java.util.List zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final com.google.android.gms.internal.measurement.zzfn zze(int i) {
        return (com.google.android.gms.internal.measurement.zzfn) this.zze.get(i);
    }

    public final java.util.List zzf() {
        return this.zzf;
    }

    public final int zzg() {
        return this.zzf.size();
    }

    public final com.google.android.gms.internal.measurement.zzff zzh(int i) {
        return (com.google.android.gms.internal.measurement.zzff) this.zzf.get(i);
    }

    final /* synthetic */ void zzi(int i, com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        zzfnVar.getClass();
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zze;
        if (!zzmnVar.zza()) {
            this.zze = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
        }
        this.zze.set(i, zzfnVar);
    }

    final /* synthetic */ void zzj(int i, com.google.android.gms.internal.measurement.zzff zzffVar) {
        zzffVar.getClass();
        com.google.android.gms.internal.measurement.zzmn zzmnVar = this.zzf;
        if (!zzmnVar.zza()) {
            this.zzf = com.google.android.gms.internal.measurement.zzme.zzcw(zzmnVar);
        }
        this.zzf.set(i, zzffVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    protected final java.lang.Object zzl(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzcq(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new java.lang.Object[]{"zzb", "zzd", "zze", com.google.android.gms.internal.measurement.zzfn.class, "zzf", com.google.android.gms.internal.measurement.zzff.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.measurement.zzfd();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.measurement.zzfc(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
