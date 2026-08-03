package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public class zzcn<MessageType extends com.google.android.gms.internal.play_billing.zzcs<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.play_billing.zzcn<MessageType, BuilderType>> extends com.google.android.gms.internal.play_billing.zzax<MessageType, BuilderType> {
    protected com.google.android.gms.internal.play_billing.zzcs zza;
    private final com.google.android.gms.internal.play_billing.zzcs zzb;

    protected zzcn(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzw()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzl();
    }

    private static void zzl(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.zzel.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzax
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.zzcn clone() {
        com.google.android.gms.internal.play_billing.zzcn zzcnVar = (com.google.android.gms.internal.play_billing.zzcn) this.zzb.zzx(5, null, null);
        zzcnVar.zza = zzg();
        return zzcnVar;
    }

    public final com.google.android.gms.internal.play_billing.zzcn zzc(com.google.android.gms.internal.play_billing.zzcs zzcsVar) {
        if (!this.zzb.equals(zzcsVar)) {
            if (!this.zza.zzw()) {
                zzj();
            }
            zzl(this.zza, zzcsVar);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeb
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final MessageType zzf() {
        MessageType zzg = zzg();
        if (zzg.zzk()) {
            return zzg;
        }
        throw new com.google.android.gms.internal.play_billing.zzfe(zzg);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeb
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public MessageType zzg() {
        if (!this.zza.zzw()) {
            return (MessageType) this.zza;
        }
        this.zza.zzr();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.zzec zzh() {
        throw null;
    }

    protected final void zzi() {
        if (this.zza.zzw()) {
            return;
        }
        zzj();
    }

    protected void zzj() {
        com.google.android.gms.internal.play_billing.zzcs zzl = this.zzb.zzl();
        zzl(zzl, this.zza);
        this.zza = zzl;
    }

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final boolean zzk() {
        return com.google.android.gms.internal.play_billing.zzcs.zzv(this.zza, false);
    }
}
