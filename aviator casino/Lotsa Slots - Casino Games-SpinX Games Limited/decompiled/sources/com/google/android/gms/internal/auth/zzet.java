package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public class zzet<MessageType extends com.google.android.gms.internal.auth.zzev<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.auth.zzet<MessageType, BuilderType>> extends com.google.android.gms.internal.auth.zzdp<MessageType, BuilderType> {
    protected com.google.android.gms.internal.auth.zzev zza;
    private final com.google.android.gms.internal.auth.zzev zzb;

    protected zzet(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzm()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzc();
    }

    @Override // com.google.android.gms.internal.auth.zzdp
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.auth.zzet clone() {
        com.google.android.gms.internal.auth.zzet zzetVar = (com.google.android.gms.internal.auth.zzet) this.zzb.zzn(5, null, null);
        zzetVar.zza = zzd();
        return zzetVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfw
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public MessageType zzd() {
        if (!this.zza.zzm()) {
            return (MessageType) this.zza;
        }
        this.zza.zzi();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzfx zze() {
        throw null;
    }
}
