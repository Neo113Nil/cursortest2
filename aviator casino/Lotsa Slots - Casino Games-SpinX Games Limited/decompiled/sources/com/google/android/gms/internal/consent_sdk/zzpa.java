package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public abstract class zzpa<MessageType extends com.google.android.gms.internal.consent_sdk.zzpa<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.consent_sdk.zzoz<MessageType, BuilderType>> implements com.google.android.gms.internal.consent_sdk.zzrq {
    protected int zza = 0;

    public final void zzE(java.io.OutputStream outputStream) throws java.io.IOException {
        int zzn = zzn();
        int i = com.google.android.gms.internal.consent_sdk.zzpv.zzf;
        if (zzn > 4096) {
            zzn = 4096;
        }
        com.google.android.gms.internal.consent_sdk.zzpt zzptVar = new com.google.android.gms.internal.consent_sdk.zzpt(outputStream, zzn);
        zzB(zzptVar);
        zzptVar.zzI();
    }

    int zzj(com.google.android.gms.internal.consent_sdk.zzsa zzsaVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final com.google.android.gms.internal.consent_sdk.zzpm zzk() {
        try {
            int zzn = zzn();
            com.google.android.gms.internal.consent_sdk.zzpm zzpmVar = com.google.android.gms.internal.consent_sdk.zzpm.zzb;
            byte[] bArr = new byte[zzn];
            int i = com.google.android.gms.internal.consent_sdk.zzpv.zzf;
            com.google.android.gms.internal.consent_sdk.zzpr zzprVar = new com.google.android.gms.internal.consent_sdk.zzpr(bArr, 0, zzn);
            zzB(zzprVar);
            if (zzprVar.zzb() == 0) {
                return new com.google.android.gms.internal.consent_sdk.zzpk(bArr);
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
