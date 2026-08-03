package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzdu implements com.google.android.gms.internal.play_billing.zzep {
    private static final com.google.android.gms.internal.play_billing.zzea zza = new com.google.android.gms.internal.play_billing.zzds();
    private final com.google.android.gms.internal.play_billing.zzea zzb;

    public zzdu() {
        com.google.android.gms.internal.play_billing.zzea zzeaVar;
        com.google.android.gms.internal.play_billing.zzea[] zzeaVarArr = new com.google.android.gms.internal.play_billing.zzea[2];
        zzeaVarArr[0] = com.google.android.gms.internal.play_billing.zzcm.zza();
        try {
            zzeaVar = (com.google.android.gms.internal.play_billing.zzea) java.lang.Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzeaVar = zza;
        }
        zzeaVarArr[1] = zzeaVar;
        com.google.android.gms.internal.play_billing.zzdt zzdtVar = new com.google.android.gms.internal.play_billing.zzdt(zzeaVarArr);
        byte[] bArr = com.google.android.gms.internal.play_billing.zzda.zzd;
        this.zzb = zzdtVar;
    }

    private static boolean zzb(com.google.android.gms.internal.play_billing.zzdz zzdzVar) {
        return zzdzVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final com.google.android.gms.internal.play_billing.zzeo zza(java.lang.Class cls) {
        com.google.android.gms.internal.play_billing.zzeq.zzr(cls);
        com.google.android.gms.internal.play_billing.zzdz zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? com.google.android.gms.internal.play_billing.zzcs.class.isAssignableFrom(cls) ? com.google.android.gms.internal.play_billing.zzeg.zzc(com.google.android.gms.internal.play_billing.zzeq.zzn(), com.google.android.gms.internal.play_billing.zzcg.zzb(), zzb.zza()) : com.google.android.gms.internal.play_billing.zzeg.zzc(com.google.android.gms.internal.play_billing.zzeq.zzm(), com.google.android.gms.internal.play_billing.zzcg.zza(), zzb.zza()) : com.google.android.gms.internal.play_billing.zzcs.class.isAssignableFrom(cls) ? zzb(zzb) ? com.google.android.gms.internal.play_billing.zzef.zzl(cls, zzb, com.google.android.gms.internal.play_billing.zzej.zzb(), com.google.android.gms.internal.play_billing.zzdq.zzd(), com.google.android.gms.internal.play_billing.zzeq.zzn(), com.google.android.gms.internal.play_billing.zzcg.zzb(), com.google.android.gms.internal.play_billing.zzdy.zzb()) : com.google.android.gms.internal.play_billing.zzef.zzl(cls, zzb, com.google.android.gms.internal.play_billing.zzej.zzb(), com.google.android.gms.internal.play_billing.zzdq.zzd(), com.google.android.gms.internal.play_billing.zzeq.zzn(), null, com.google.android.gms.internal.play_billing.zzdy.zzb()) : zzb(zzb) ? com.google.android.gms.internal.play_billing.zzef.zzl(cls, zzb, com.google.android.gms.internal.play_billing.zzej.zza(), com.google.android.gms.internal.play_billing.zzdq.zzc(), com.google.android.gms.internal.play_billing.zzeq.zzm(), com.google.android.gms.internal.play_billing.zzcg.zza(), com.google.android.gms.internal.play_billing.zzdy.zza()) : com.google.android.gms.internal.play_billing.zzef.zzl(cls, zzb, com.google.android.gms.internal.play_billing.zzej.zza(), com.google.android.gms.internal.play_billing.zzdq.zzc(), com.google.android.gms.internal.play_billing.zzeq.zzm(), null, com.google.android.gms.internal.play_billing.zzdy.zza());
    }
}
