package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzlp implements zzml {
    private static final zzlv zza = new zzln();
    private final zzlv zzb;

    public zzlp() {
        zzlv zzlvVar;
        zzkl zzklVarZza = zzkl.zza();
        try {
            zzlvVar = (zzlv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzlvVar = zza;
        }
        zzlo zzloVar = new zzlo(zzklVarZza, zzlvVar);
        byte[] bArr = zzla.zzb;
        this.zzb = zzloVar;
    }

    private static boolean zzb(zzlu zzluVar) {
        return zzluVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.recaptcha.internal.zzml
    public final zzmk zza(Class cls) {
        zzmm.zzs(cls);
        zzlu zzluVarZzb = this.zzb.zzb(cls);
        if (zzluVarZzb.zzb()) {
            return zzks.class.isAssignableFrom(cls) ? zzmb.zzc(zzmm.zzn(), zzkg.zzb(), zzluVarZzb.zza()) : zzmb.zzc(zzmm.zzm(), zzkg.zza(), zzluVarZzb.zza());
        }
        if (zzks.class.isAssignableFrom(cls)) {
            return zzma.zzm(cls, zzluVarZzb, zzme.zzb(), zzll.zzb(), zzmm.zzn(), zzb(zzluVarZzb) ? zzkg.zzb() : null, zzlt.zzb());
        }
        return zzma.zzm(cls, zzluVarZzb, zzme.zza(), zzll.zza(), zzmm.zzm(), zzb(zzluVarZzb) ? zzkg.zza() : null, zzlt.zza());
    }
}
