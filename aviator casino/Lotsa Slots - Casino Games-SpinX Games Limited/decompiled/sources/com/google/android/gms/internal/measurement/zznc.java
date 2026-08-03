package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zznc implements com.google.android.gms.internal.measurement.zznx {
    private static final com.google.android.gms.internal.measurement.zznj zzb = new com.google.android.gms.internal.measurement.zzna();
    private final com.google.android.gms.internal.measurement.zznj zza;

    public zznc() {
        com.google.android.gms.internal.measurement.zznj zznjVar = zzb;
        int i = com.google.android.gms.internal.measurement.zznt.zza;
        com.google.android.gms.internal.measurement.zznb zznbVar = new com.google.android.gms.internal.measurement.zznb(com.google.android.gms.internal.measurement.zzlz.zza(), zznjVar);
        byte[] bArr = com.google.android.gms.internal.measurement.zzmo.zzb;
        this.zza = zznbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final com.google.android.gms.internal.measurement.zznw zza(java.lang.Class cls) {
        int i = com.google.android.gms.internal.measurement.zzny.zza;
        if (!com.google.android.gms.internal.measurement.zzme.class.isAssignableFrom(cls)) {
            int i2 = com.google.android.gms.internal.measurement.zznt.zza;
        }
        com.google.android.gms.internal.measurement.zzni zzc = this.zza.zzc(cls);
        if (zzc.zza()) {
            int i3 = com.google.android.gms.internal.measurement.zznt.zza;
            return com.google.android.gms.internal.measurement.zznp.zzg(com.google.android.gms.internal.measurement.zzny.zzA(), com.google.android.gms.internal.measurement.zzlt.zza(), zzc.zzb());
        }
        int i4 = com.google.android.gms.internal.measurement.zznt.zza;
        return com.google.android.gms.internal.measurement.zzno.zzl(cls, zzc, com.google.android.gms.internal.measurement.zznr.zza(), com.google.android.gms.internal.measurement.zzmy.zza(), com.google.android.gms.internal.measurement.zzny.zzA(), zzc.zzc() + (-1) != 1 ? com.google.android.gms.internal.measurement.zzlt.zza() : null, com.google.android.gms.internal.measurement.zznh.zza());
    }
}
