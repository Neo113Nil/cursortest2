package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzlb implements zzlv {
    private static final zzlh zza = new zzkz();
    private final zzlh zzb;

    public zzlb() {
        zzlh zzlhVar;
        zzjx zza2 = zzjx.zza();
        try {
            zzlhVar = (zzlh) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzlhVar = zza;
        }
        zzla zzlaVar = new zzla(zza2, zzlhVar);
        zzkk.zzf(zzlaVar, "messageInfoFactory");
        this.zzb = zzlaVar;
    }

    private static boolean zzb(zzlg zzlgVar) {
        return zzlgVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzlv
    public final zzlu zza(Class cls) {
        zzlw.zzG(cls);
        zzlg zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzkc.class.isAssignableFrom(cls) ? zzln.zzc(zzlw.zzB(), zzjr.zzb(), zzb.zza()) : zzln.zzc(zzlw.zzz(), zzjr.zza(), zzb.zza()) : zzkc.class.isAssignableFrom(cls) ? zzb(zzb) ? zzlm.zzl(cls, zzb, zzlp.zzb(), zzkx.zzd(), zzlw.zzB(), zzjr.zzb(), zzlf.zzb()) : zzlm.zzl(cls, zzb, zzlp.zzb(), zzkx.zzd(), zzlw.zzB(), null, zzlf.zzb()) : zzb(zzb) ? zzlm.zzl(cls, zzb, zzlp.zza(), zzkx.zzc(), zzlw.zzz(), zzjr.zza(), zzlf.zza()) : zzlm.zzl(cls, zzb, zzlp.zza(), zzkx.zzc(), zzlw.zzA(), null, zzlf.zza());
    }
}
