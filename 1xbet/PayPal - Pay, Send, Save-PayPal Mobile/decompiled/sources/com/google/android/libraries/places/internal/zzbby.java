package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbby<MessageType extends com.google.android.libraries.places.internal.zzbby<MessageType, BuilderType>, BuilderType extends com.google.android.libraries.places.internal.zzbbx<MessageType, BuilderType>> implements com.google.android.libraries.places.internal.zzbex {
    protected transient int zza = 0;

    protected static void zzbo(java.lang.Iterable iterable, java.util.List list) {
        com.google.android.libraries.places.internal.zzbbx.zzv(iterable, list);
    }

    @Override // com.google.android.libraries.places.internal.zzbex
    public final com.google.android.libraries.places.internal.zzbcl zzbk() {
        try {
            int zzbx = zzbx();
            byte[] bArr = new byte[zzbx];
            com.google.android.libraries.places.internal.zzbcr zzbcrVar = new com.google.android.libraries.places.internal.zzbcr(bArr, 0, zzbx);
            zzbL(zzbcrVar);
            zzbcrVar.zzC();
            return new com.google.android.libraries.places.internal.zzbck(bArr);
        } catch (java.io.IOException e) {
            java.lang.String name2 = getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name2).length() + 72);
            sb.append("Serializing ");
            sb.append(name2);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbex
    public final byte[] zzbl() {
        try {
            int zzbx = zzbx();
            byte[] bArr = new byte[zzbx];
            com.google.android.libraries.places.internal.zzbcr zzbcrVar = new com.google.android.libraries.places.internal.zzbcr(bArr, 0, zzbx);
            zzbL(zzbcrVar);
            zzbcrVar.zzC();
            return bArr;
        } catch (java.io.IOException e) {
            java.lang.String name2 = getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name2).length() + 72);
            sb.append("Serializing ");
            sb.append(name2);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbex
    public final void zzbm(java.io.OutputStream outputStream) throws java.io.IOException {
        int zzbx = zzbx();
        if (zzbx > 4096) {
            zzbx = 4096;
        }
        com.google.android.libraries.places.internal.zzbct zzbctVar = new com.google.android.libraries.places.internal.zzbct(outputStream, zzbx);
        zzbL(zzbctVar);
        zzbctVar.zzw();
    }

    int zzbn(com.google.android.libraries.places.internal.zzbfl zzbflVar) {
        throw null;
    }
}
