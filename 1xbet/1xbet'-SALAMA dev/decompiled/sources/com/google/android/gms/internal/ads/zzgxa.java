package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxa;
import com.google.android.gms.internal.ads.zzgxg;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class zzgxa<MessageType extends zzgxg<MessageType, BuilderType>, BuilderType extends zzgxa<MessageType, BuilderType>> extends zzgvg<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    public zzgxa(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzcd()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzgzb.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvg
    public /* bridge */ /* synthetic */ zzgvg zzaD(zzgvh zzgvhVar) {
        zzbi((zzgxg) zzgvhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvg
    /* JADX INFO: renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzgvg zzaW(zzgwe zzgweVar, zzgwq zzgwqVar) throws IOException {
        zzbk(zzgweVar, zzgwqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvg
    /* JADX INFO: renamed from: zzaN */
    public /* bridge */ /* synthetic */ zzgvg zzaZ(byte[] bArr, int i7, int i8) throws zzgxv {
        zzbl(bArr, i7, i8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvg
    /* JADX INFO: renamed from: zzaO */
    public /* bridge */ /* synthetic */ zzgvg zzba(byte[] bArr, int i7, int i8, zzgwq zzgwqVar) throws zzgxv {
        zzbm(bArr, i7, i8, zzgwqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvg
    public /* bridge */ /* synthetic */ zzgyq zzaW(zzgwe zzgweVar, zzgwq zzgwqVar) throws IOException {
        zzbk(zzgweVar, zzgwqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvg
    public /* bridge */ /* synthetic */ zzgyq zzaZ(byte[] bArr, int i7, int i8) throws zzgxv {
        zzbl(bArr, i7, i8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvg
    public /* bridge */ /* synthetic */ zzgyq zzba(byte[] bArr, int i7, int i8, zzgwq zzgwqVar) throws zzgxv {
        zzbm(bArr, i7, i8, zzgwqVar);
        return this;
    }

    public final BuilderType zzbg() {
        if (this.zzb.zzcd()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgvg
    /* JADX INFO: renamed from: zzbh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzaP() {
        BuilderType buildertype = (BuilderType) zzbt().zzcX();
        buildertype.zza = (MessageType) zzbs();
        return buildertype;
    }

    public BuilderType zzbi(MessageType messagetype) {
        zzbj(messagetype);
        return this;
    }

    public BuilderType zzbj(MessageType messagetype) {
        if (zzbt().equals(messagetype)) {
            return this;
        }
        zzbu();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbk(zzgwe zzgweVar, zzgwq zzgwqVar) throws IOException {
        zzbu();
        try {
            zzgzb.zza().zzb(this.zza.getClass()).zzh(this.zza, zzgwf.zzq(zzgweVar), zzgwqVar);
            return this;
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof IOException) {
                throw ((IOException) e7.getCause());
            }
            throw e7;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i7, int i8) throws zzgxv {
        int i9 = zzgwq.zzb;
        int i10 = zzgzb.zza;
        zzbm(bArr, i7, i8, zzgwq.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i7, int i8, zzgwq zzgwqVar) throws zzgxv {
        zzbu();
        try {
            zzgzb.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i7, i7 + i8, new zzgvm(zzgwqVar));
            return this;
        } catch (zzgxv e7) {
            throw e7;
        } catch (IOException e8) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e8);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: zzbn, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbr() {
        MessageType messagetype = (MessageType) zzbs();
        if (messagetype.zzbw()) {
            return messagetype;
        }
        throw zzgvg.zzbb(messagetype);
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    /* JADX INFO: renamed from: zzbo, reason: merged with bridge method [inline-methods] */
    public MessageType zzbs() {
        if (!this.zza.zzcd()) {
            return this.zza;
        }
        this.zza.zzbU();
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgys
    /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzgyq zzbq() {
        zzbg();
        return this;
    }

    public final void zzbu() {
        if (this.zza.zzcd()) {
            return;
        }
        zzbv();
    }

    public void zzbv() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzgys
    public final boolean zzbw() {
        return zzgxg.zzk(this.zza, false);
    }
}
