package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zzlb implements zzlv {
    private static final zzlh zza = new zzkz();
    private final zzlh zzb;

    public zzlb() {
        zzlh zzlhVar;
        zzjx zzjxVarZza = zzjx.zza();
        try {
            zzlhVar = (zzlh) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzlhVar = zza;
        }
        zzla zzlaVar = new zzla(zzjxVarZza, zzlhVar);
        zzkk.zzf(zzlaVar, "messageInfoFactory");
        this.zzb = zzlaVar;
    }

    private static boolean zzb(zzlg zzlgVar) {
        return zzlgVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzlv
    public final zzlu zza(Class cls) {
        zzlw.zzG(cls);
        zzlg zzlgVarZzb = this.zzb.zzb(cls);
        if (zzlgVarZzb.zzb()) {
            return zzkc.class.isAssignableFrom(cls) ? zzln.zzc(zzlw.zzB(), zzjr.zzb(), zzlgVarZzb.zza()) : zzln.zzc(zzlw.zzz(), zzjr.zza(), zzlgVarZzb.zza());
        }
        if (zzkc.class.isAssignableFrom(cls)) {
            return zzb(zzlgVarZzb) ? zzlm.zzl(cls, zzlgVarZzb, zzlp.zzb(), zzkx.zzd(), zzlw.zzB(), zzjr.zzb(), zzlf.zzb()) : zzlm.zzl(cls, zzlgVarZzb, zzlp.zzb(), zzkx.zzd(), zzlw.zzB(), null, zzlf.zzb());
        }
        return zzb(zzlgVarZzb) ? zzlm.zzl(cls, zzlgVarZzb, zzlp.zza(), zzkx.zzc(), zzlw.zzz(), zzjr.zza(), zzlf.zza()) : zzlm.zzl(cls, zzlgVarZzb, zzlp.zza(), zzkx.zzc(), zzlw.zzA(), null, zzlf.zza());
    }
}
