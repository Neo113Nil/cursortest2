package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public class zzidy<MessageType extends com.google.android.gms.internal.ads.zziee<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzidy<MessageType, BuilderType>> extends com.google.android.gms.internal.ads.zzici<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    protected zzidy(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaX()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbg();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        com.google.android.gms.internal.ads.zzifz.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzici
    /* renamed from: zzaE */
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzici zzbd(com.google.android.gms.internal.ads.zzide zzideVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        zzbr(zzideVar, zzidoVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzici
    /* renamed from: zzaI */
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzici zzaZ(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zziet {
        zzbq(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzici
    /* renamed from: zzaK */
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzici zzaX(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        zzbp(bArr, i, i2, zzidoVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzici
    protected /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzici zzaQ(com.google.android.gms.internal.ads.zzicj zzicjVar) {
        zzbn((com.google.android.gms.internal.ads.zziee) zzicjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzici
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzifo zzaX(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        zzbp(bArr, i, i2, zzidoVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzici
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzifo zzaZ(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zziet {
        zzbq(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzici
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzifo zzbd(com.google.android.gms.internal.ads.zzide zzideVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        zzbr(zzideVar, zzidoVar);
        return this;
    }

    protected final void zzbg() {
        if (this.zza.zzaX()) {
            return;
        }
        zzbh();
    }

    protected void zzbh() {
        MessageType zza = zza();
        zzb(zza, this.zza);
        this.zza = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifq
    public final boolean zzbi() {
        boolean zzg;
        zzg = com.google.android.gms.internal.ads.zziee.zzg(this.zza, false);
        return zzg;
    }

    public final BuilderType zzbj() {
        if (this.zzb.zzaX()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzici
    /* renamed from: zzbk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzbf() {
        BuilderType buildertype = (BuilderType) zzbw().zzcY();
        buildertype.zza = zzbt();
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzifo
    /* renamed from: zzbl, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        if (!this.zza.zzaX()) {
            return this.zza;
        }
        this.zza.zzbm();
        return this.zza;
    }

    /* renamed from: zzbm, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbu() {
        MessageType zzbt = zzbt();
        if (zzbt.zzbi()) {
            return zzbt;
        }
        throw zzaR(zzbt);
    }

    protected BuilderType zzbn(MessageType messagetype) {
        zzbo(messagetype);
        return this;
    }

    public BuilderType zzbo(MessageType messagetype) {
        if (zzbw().equals(messagetype)) {
            return this;
        }
        zzbg();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbp(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        zzbg();
        try {
            com.google.android.gms.internal.ads.zzifz.zza().zzb(this.zza.getClass()).zzj(this.zza, bArr, i, i + i2, new com.google.android.gms.internal.ads.zzico(zzidoVar));
            return this;
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public BuilderType zzbq(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zziet {
        int i3 = com.google.android.gms.internal.ads.zzido.zzb;
        int i4 = com.google.android.gms.internal.ads.zzicn.zza;
        zzbp(bArr, i, i2, com.google.android.gms.internal.ads.zzido.zza);
        return this;
    }

    public BuilderType zzbr(com.google.android.gms.internal.ads.zzide zzideVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws java.io.IOException {
        zzbg();
        try {
            com.google.android.gms.internal.ads.zzifz.zza().zzb(this.zza.getClass()).zzg(this.zza, com.google.android.gms.internal.ads.zzidf.zza(zzideVar), zzidoVar);
            return this;
        } catch (java.lang.RuntimeException e) {
            if (e.getCause() instanceof java.io.IOException) {
                throw ((java.io.IOException) e.getCause());
            }
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifq
    /* renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public MessageType zzbw() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzifo zzbv() {
        zzbj();
        return this;
    }
}
