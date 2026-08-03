package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public abstract class zzit<MessageType extends com.google.android.gms.internal.drive.zzit<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.drive.zziu<MessageType, BuilderType>> implements com.google.android.gms.internal.drive.zzlq {
    private static boolean zznf = false;
    protected int zzne = 0;

    @Override // com.google.android.gms.internal.drive.zzlq
    public final com.google.android.gms.internal.drive.zzjc zzbl() {
        try {
            com.google.android.gms.internal.drive.zzjk zzu = com.google.android.gms.internal.drive.zzjc.zzu(zzcx());
            zzb(zzu.zzby());
            return zzu.zzbx();
        } catch (java.io.IOException e) {
            java.lang.String name = getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzcx()];
            com.google.android.gms.internal.drive.zzjr zzb = com.google.android.gms.internal.drive.zzjr.zzb(bArr);
            zzb(zzb);
            zzb.zzcb();
            return bArr;
        } catch (java.io.IOException e) {
            java.lang.String name = getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    int zzbm() {
        throw new java.lang.UnsupportedOperationException();
    }

    void zzo(int i) {
        throw new java.lang.UnsupportedOperationException();
    }
}
