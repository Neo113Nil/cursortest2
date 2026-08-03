package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public abstract class zzay<MessageType extends com.google.android.gms.internal.play_billing.zzay<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.play_billing.zzax<MessageType, BuilderType>> implements com.google.android.gms.internal.play_billing.zzec {
    protected int zza = 0;

    int zza(com.google.android.gms.internal.play_billing.zzeo zzeoVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final com.google.android.gms.internal.play_billing.zzbq zzb() {
        try {
            int zzf = zzf();
            com.google.android.gms.internal.play_billing.zzbq zzbqVar = com.google.android.gms.internal.play_billing.zzbq.zzb;
            byte[] bArr = new byte[zzf];
            com.google.android.gms.internal.play_billing.zzby zzy = com.google.android.gms.internal.play_billing.zzby.zzy(bArr, 0, zzf);
            zze(zzy);
            zzy.zzz();
            return new com.google.android.gms.internal.play_billing.zzbn(bArr);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final byte[] zzc() {
        try {
            int zzf = zzf();
            byte[] bArr = new byte[zzf];
            com.google.android.gms.internal.play_billing.zzby zzy = com.google.android.gms.internal.play_billing.zzby.zzy(bArr, 0, zzf);
            zze(zzy);
            zzy.zzz();
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
