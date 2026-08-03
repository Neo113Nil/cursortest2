package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public class zzma<MessageType extends com.google.android.gms.internal.measurement.zzme<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzma<MessageType, BuilderType>> extends com.google.android.gms.internal.measurement.zzkq<MessageType, BuilderType> {
    protected com.google.android.gms.internal.measurement.zzme zza;
    private final com.google.android.gms.internal.measurement.zzme zzb;

    protected zzma(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzcf()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzch();
    }

    private static void zza(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.zznt.zza().zzb(obj.getClass()).zzd(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzkq zzaS(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.measurement.zzmq {
        int i3 = com.google.android.gms.internal.measurement.zzlq.zzb;
        int i4 = com.google.android.gms.internal.measurement.zznt.zza;
        zzbe(bArr, 0, i2, com.google.android.gms.internal.measurement.zzlq.zza);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzkq zzaT(byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzlq zzlqVar) throws com.google.android.gms.internal.measurement.zzmq {
        zzbe(bArr, 0, i2, zzlqVar);
        return this;
    }

    protected final void zzaX() {
        if (this.zza.zzcf()) {
            return;
        }
        zzaY();
    }

    protected void zzaY() {
        com.google.android.gms.internal.measurement.zzme zzch = this.zzb.zzch();
        zza(zzch, this.zza);
        this.zza = zzch;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    /* renamed from: zzba, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzma zzaR() {
        com.google.android.gms.internal.measurement.zzma zzmaVar = (com.google.android.gms.internal.measurement.zzma) this.zzb.zzl(5, null, null);
        zzmaVar.zza = zzbf();
        return zzmaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public MessageType zzbf() {
        if (!this.zza.zzcf()) {
            return (MessageType) this.zza;
        }
        this.zza.zzcj();
        return (MessageType) this.zza;
    }

    public final MessageType zzbc() {
        MessageType zzbf = zzbf();
        if (zzbf.zzcD()) {
            return zzbf;
        }
        throw new com.google.android.gms.internal.measurement.zzog(zzbf);
    }

    public final com.google.android.gms.internal.measurement.zzma zzbd(com.google.android.gms.internal.measurement.zzme zzmeVar) {
        if (!this.zzb.equals(zzmeVar)) {
            if (!this.zza.zzcf()) {
                zzaY();
            }
            zza(this.zza, zzmeVar);
        }
        return this;
    }

    public final com.google.android.gms.internal.measurement.zzma zzbe(byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzlq zzlqVar) throws com.google.android.gms.internal.measurement.zzmq {
        if (!this.zza.zzcf()) {
            zzaY();
        }
        try {
            com.google.android.gms.internal.measurement.zznt.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new com.google.android.gms.internal.measurement.zzkv(zzlqVar));
            return this;
        } catch (com.google.android.gms.internal.measurement.zzmq e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final boolean zzcD() {
        boolean zzd;
        zzd = com.google.android.gms.internal.measurement.zzme.zzd(this.zza, false);
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zznl zzcE() {
        throw null;
    }
}
