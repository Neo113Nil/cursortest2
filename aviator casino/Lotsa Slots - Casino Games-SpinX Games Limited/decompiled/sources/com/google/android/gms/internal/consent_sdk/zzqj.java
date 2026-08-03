package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public class zzqj<MessageType extends com.google.android.gms.internal.consent_sdk.zzqm<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.consent_sdk.zzqj<MessageType, BuilderType>> extends com.google.android.gms.internal.consent_sdk.zzoz<MessageType, BuilderType> {
    protected com.google.android.gms.internal.consent_sdk.zzqm zza;
    private final com.google.android.gms.internal.consent_sdk.zzqm zzb;

    protected zzqj(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzD()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzr();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzoz
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.consent_sdk.zzqj clone() {
        com.google.android.gms.internal.consent_sdk.zzqj zzqjVar = (com.google.android.gms.internal.consent_sdk.zzqj) this.zzb.zzb(5, null, null);
        zzqjVar.zza = zzk();
        return zzqjVar;
    }

    public final MessageType zzi() {
        MessageType zzk = zzk();
        if (zzk.zzo()) {
            return zzk;
        }
        throw new com.google.android.gms.internal.consent_sdk.zzso(zzk);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrp
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public MessageType zzk() {
        if (!this.zza.zzD()) {
            return (MessageType) this.zza;
        }
        this.zza.zzx();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.consent_sdk.zzrq zzl() {
        throw null;
    }

    protected final void zzm() {
        if (this.zza.zzD()) {
            return;
        }
        zzn();
    }

    protected void zzn() {
        com.google.android.gms.internal.consent_sdk.zzqm zzr = this.zzb.zzr();
        com.google.android.gms.internal.consent_sdk.zzrx.zza().zzb(zzr.getClass()).zze(zzr, this.zza);
        this.zza = zzr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final boolean zzo() {
        boolean zzc;
        zzc = com.google.android.gms.internal.consent_sdk.zzqm.zzc(this.zza, false);
        return zzc;
    }
}
