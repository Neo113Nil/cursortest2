package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzkr<MessageType extends com.google.android.gms.internal.measurement.zzkr<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzkq<MessageType, BuilderType>> implements com.google.android.gms.internal.measurement.zznl {
    protected int zza = 0;

    protected static void zzce(java.lang.Iterable iterable, java.util.List list) {
        com.google.android.gms.internal.measurement.zzkq.zzaU(iterable, list);
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final com.google.android.gms.internal.measurement.zzlg zzcb() {
        try {
            int zzcn = zzcn();
            com.google.android.gms.internal.measurement.zzlg zzlgVar = com.google.android.gms.internal.measurement.zzlg.zzb;
            byte[] bArr = new byte[zzcn];
            int i = com.google.android.gms.internal.measurement.zzll.zzb;
            com.google.android.gms.internal.measurement.zzlj zzljVar = new com.google.android.gms.internal.measurement.zzlj(bArr, 0, zzcn);
            zzcB(zzljVar);
            return com.google.android.gms.internal.measurement.zzld.zza(zzljVar, bArr);
        } catch (java.io.IOException e) {
            java.lang.String name = getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] zzcc() {
        try {
            int zzcn = zzcn();
            byte[] bArr = new byte[zzcn];
            int i = com.google.android.gms.internal.measurement.zzll.zzb;
            com.google.android.gms.internal.measurement.zzlj zzljVar = new com.google.android.gms.internal.measurement.zzlj(bArr, 0, zzcn);
            zzcB(zzljVar);
            zzljVar.zzE();
            return bArr;
        } catch (java.io.IOException e) {
            java.lang.String name = getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    int zzcd(com.google.android.gms.internal.measurement.zznw zznwVar) {
        throw null;
    }
}
