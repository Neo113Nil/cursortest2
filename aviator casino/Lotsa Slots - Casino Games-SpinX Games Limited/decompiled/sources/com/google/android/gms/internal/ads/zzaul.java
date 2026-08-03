package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzaul implements com.google.android.gms.internal.ads.zzaum {
    private static final java.util.logging.Logger zzb = java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.zzaul.class.getName());
    final java.lang.ThreadLocal zza = new com.google.android.gms.internal.ads.zzauk(this);

    public abstract com.google.android.gms.internal.ads.zzaup zza(java.lang.String str, byte[] bArr, java.lang.String str2);

    @Override // com.google.android.gms.internal.ads.zzaum
    public final com.google.android.gms.internal.ads.zzaup zzb(com.google.android.gms.internal.ads.zzimg zzimgVar, com.google.android.gms.internal.ads.zzauq zzauqVar) throws java.io.IOException {
        int zza;
        long zzb2;
        long j;
        long zzc = zzimgVar.zzc();
        java.lang.ThreadLocal threadLocal = this.zza;
        ((java.nio.ByteBuffer) threadLocal.get()).rewind().limit(8);
        do {
            zza = zzimgVar.zza((java.nio.ByteBuffer) threadLocal.get());
            if (zza == 8) {
                ((java.nio.ByteBuffer) threadLocal.get()).rewind();
                long zza2 = com.google.android.gms.internal.ads.zzauo.zza((java.nio.ByteBuffer) threadLocal.get());
                byte[] bArr = null;
                if (zza2 < 8 && zza2 > 1) {
                    java.util.logging.Logger logger = zzb;
                    java.util.logging.Level level = java.util.logging.Level.SEVERE;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(zza2);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((java.nio.ByteBuffer) threadLocal.get()).get(bArr2);
                try {
                    java.lang.String str = new java.lang.String(bArr2, com.google.android.exoplayer2.C.ISO88591_NAME);
                    if (zza2 == 1) {
                        java.lang.ThreadLocal threadLocal2 = this.zza;
                        ((java.nio.ByteBuffer) threadLocal2.get()).limit(16);
                        zzimgVar.zza((java.nio.ByteBuffer) threadLocal2.get());
                        ((java.nio.ByteBuffer) threadLocal2.get()).position(8);
                        zzb2 = com.google.android.gms.internal.ads.zzauo.zzd((java.nio.ByteBuffer) threadLocal2.get()) - 16;
                    } else {
                        zzb2 = zza2 == 0 ? zzimgVar.zzb() - zzimgVar.zzc() : zza2 - 8;
                    }
                    if ("uuid".equals(str)) {
                        java.lang.ThreadLocal threadLocal3 = this.zza;
                        ((java.nio.ByteBuffer) threadLocal3.get()).limit(((java.nio.ByteBuffer) threadLocal3.get()).limit() + 16);
                        zzimgVar.zza((java.nio.ByteBuffer) threadLocal3.get());
                        byte[] bArr3 = new byte[16];
                        for (int position = ((java.nio.ByteBuffer) threadLocal3.get()).position() - 16; position < ((java.nio.ByteBuffer) threadLocal3.get()).position(); position++) {
                            bArr3[position - (((java.nio.ByteBuffer) threadLocal3.get()).position() - 16)] = ((java.nio.ByteBuffer) threadLocal3.get()).get(position);
                        }
                        j = zzb2 - 16;
                        bArr = bArr3;
                    } else {
                        j = zzb2;
                    }
                    com.google.android.gms.internal.ads.zzaup zza3 = zza(str, bArr, zzauqVar instanceof com.google.android.gms.internal.ads.zzaup ? ((com.google.android.gms.internal.ads.zzaup) zzauqVar).zza() : "");
                    java.lang.ThreadLocal threadLocal4 = this.zza;
                    ((java.nio.ByteBuffer) threadLocal4.get()).rewind();
                    zza3.zzb(zzimgVar, (java.nio.ByteBuffer) threadLocal4.get(), j, this);
                    return zza3;
                } catch (java.io.UnsupportedEncodingException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        } while (zza >= 0);
        zzimgVar.zzd(zzc);
        throw new java.io.EOFException();
    }
}
