package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzicj<MessageType extends com.google.android.gms.internal.ads.zzicj<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzici<MessageType, BuilderType>> implements com.google.android.gms.internal.ads.zzifp {
    protected transient int zzq = 0;

    protected static void zzaV(com.google.android.gms.internal.ads.zzida zzidaVar) throws java.lang.IllegalArgumentException {
        if (!zzidaVar.zzi()) {
            throw new java.lang.IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    protected static <T> void zzaW(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        com.google.android.gms.internal.ads.zzici.zzaT(iterable, list);
    }

    private java.lang.String zzdV(java.lang.String str) {
        java.lang.String name = getClass().getName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 18 + java.lang.String.valueOf(str).length() + 44);
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public com.google.android.gms.internal.ads.zzida zzaM() {
        try {
            int zzbr = zzbr();
            com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
            byte[] bArr = new byte[zzbr];
            int i = com.google.android.gms.internal.ads.zzidj.zzb;
            com.google.android.gms.internal.ads.zzidg zzidgVar = new com.google.android.gms.internal.ads.zzidg(bArr, 0, zzbr);
            zzcX(zzidgVar);
            return com.google.android.gms.internal.ads.zzicw.zza(zzidgVar, bArr);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(zzdV("ByteString"), e);
        }
    }

    public byte[] zzaN() {
        try {
            int zzbr = zzbr();
            byte[] bArr = new byte[zzbr];
            int i = com.google.android.gms.internal.ads.zzidj.zzb;
            com.google.android.gms.internal.ads.zzidg zzidgVar = new com.google.android.gms.internal.ads.zzidg(bArr, 0, zzbr);
            zzcX(zzidgVar);
            zzidgVar.zzI();
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(zzdV("byte array"), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifp
    public void zzaO(java.io.OutputStream outputStream) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzidi zzidiVar = new com.google.android.gms.internal.ads.zzidi(outputStream, com.google.android.gms.internal.ads.zzidj.zzE(zzbr()));
        zzcX(zzidiVar);
        zzidiVar.zzx();
    }

    public void zzaP(java.io.OutputStream outputStream) throws java.io.IOException {
        int zzbr = zzbr();
        com.google.android.gms.internal.ads.zzidi zzidiVar = new com.google.android.gms.internal.ads.zzidi(outputStream, com.google.android.gms.internal.ads.zzidj.zzE(com.google.android.gms.internal.ads.zzidj.zzF(zzbr) + zzbr));
        zzidiVar.zzr(zzbr);
        zzcX(zzidiVar);
        zzidiVar.zzx();
    }

    int zzaQ() {
        throw new java.lang.UnsupportedOperationException();
    }

    void zzaR(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    public com.google.android.gms.internal.ads.zzifu zzaS() {
        throw new java.lang.UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    int zzaT(com.google.android.gms.internal.ads.zzigh zzighVar) {
        return zzaQ();
    }

    com.google.android.gms.internal.ads.zzigs zzaU() {
        return new com.google.android.gms.internal.ads.zzigs(this);
    }
}
