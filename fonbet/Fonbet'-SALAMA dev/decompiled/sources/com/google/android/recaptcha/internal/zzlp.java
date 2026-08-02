package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzlp implements zzml {
    private static final zzlv zza = new zzln();
    private final zzlv zzb;

    public zzlp() {
        zzlv zzlvVar;
        zzkl zza2 = zzkl.zza();
        try {
            zzlvVar = (zzlv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzlvVar = zza;
        }
        zzlo zzloVar = new zzlo(zza2, zzlvVar);
        byte[] bArr = zzla.zzb;
        this.zzb = zzloVar;
    }

    private static boolean zzb(zzlu zzluVar) {
        return zzluVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.recaptcha.internal.zzml
    public final zzmk zza(Class cls) {
        zzmm.zzs(cls);
        zzlu zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            return zzks.class.isAssignableFrom(cls) ? zzmb.zzc(zzmm.zzn(), zzkg.zzb(), zzb.zza()) : zzmb.zzc(zzmm.zzm(), zzkg.zza(), zzb.zza());
        }
        if (zzks.class.isAssignableFrom(cls)) {
            return zzma.zzm(cls, zzb, zzme.zzb(), zzll.zzb(), zzmm.zzn(), zzb(zzb) ? zzkg.zzb() : null, zzlt.zzb());
        }
        return zzma.zzm(cls, zzb, zzme.zza(), zzll.zza(), zzmm.zzm(), zzb(zzb) ? zzkg.zza() : null, zzlt.zza());
    }
}
