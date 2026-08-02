package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public class zzbdk<MessageType extends com.google.android.libraries.places.internal.zzbdq<MessageType, BuilderType>, BuilderType extends com.google.android.libraries.places.internal.zzbdk<MessageType, BuilderType>> extends com.google.android.libraries.places.internal.zzbbx<MessageType, BuilderType> {
    protected com.google.android.libraries.places.internal.zzbdq zza;
    private final com.google.android.libraries.places.internal.zzbdq zzb;

    protected zzbdk(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzbp()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzbs();
    }

    private static void zza(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbfh.zza().zzb(obj.getClass()).zzd(obj, obj2);
    }

    @Override // com.google.android.libraries.places.internal.zzbbx
    /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final com.google.android.libraries.places.internal.zzbdk clone() {
        com.google.android.libraries.places.internal.zzbdk zzbdkVar = (com.google.android.libraries.places.internal.zzbdk) this.zzb.zzb(5, null, null);
        zzbdkVar.zza = zzF();
        return zzbdkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbew
    /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public MessageType zzF() {
        if (!this.zza.zzbp()) {
            return (MessageType) this.zza;
        }
        this.zza.zzbu();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbew
    /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final MessageType zzG() {
        MessageType zzF = zzF();
        if (zzF.zzbM()) {
            return zzF;
        }
        throw new com.google.android.libraries.places.internal.zzbfx(zzF);
    }

    public final com.google.android.libraries.places.internal.zzbdk zzE(com.google.android.libraries.places.internal.zzbdq zzbdqVar) {
        if (!this.zzb.equals(zzbdqVar)) {
            if (!this.zza.zzbp()) {
                zzz();
            }
            zza(this.zza, zzbdqVar);
        }
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbey
    public final boolean zzbM() {
        boolean zze;
        zze = com.google.android.libraries.places.internal.zzbdq.zze(this.zza, false);
        return zze;
    }

    @Override // com.google.android.libraries.places.internal.zzbbx
    protected final /* synthetic */ com.google.android.libraries.places.internal.zzbbx zzu(com.google.android.libraries.places.internal.zzbby zzbbyVar) {
        zzE((com.google.android.libraries.places.internal.zzbdq) zzbbyVar);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbbx, com.google.android.libraries.places.internal.zzbew
    public final /* synthetic */ com.google.android.libraries.places.internal.zzbew zzx(com.google.android.libraries.places.internal.zzbco zzbcoVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        if (!this.zza.zzbp()) {
            zzz();
        }
        try {
            com.google.android.libraries.places.internal.zzbfh.zza().zzb(this.zza.getClass()).zzg(this.zza, com.google.android.libraries.places.internal.zzbcp.zza(zzbcoVar), zzbdbVar);
            return this;
        } catch (java.lang.RuntimeException e) {
            if (e.getCause() instanceof java.io.IOException) {
                throw ((java.io.IOException) e.getCause());
            }
            throw e;
        }
    }

    protected final void zzy() {
        if (this.zza.zzbp()) {
            return;
        }
        zzz();
    }

    protected void zzz() {
        com.google.android.libraries.places.internal.zzbdq zzbs = this.zzb.zzbs();
        zza(zzbs, this.zza);
        this.zza = zzbs;
    }

    @Override // com.google.android.libraries.places.internal.zzbey
    public final /* synthetic */ com.google.android.libraries.places.internal.zzbex zzbN() {
        return this.zzb;
    }
}
