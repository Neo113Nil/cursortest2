package com.google.android.gms.internal.ads;

import io.sentry.protocol.DebugImage;
import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaqk implements zzaql {
    private static final Logger zzb = Logger.getLogger(zzaqk.class.getName());
    final ThreadLocal zza = new zzaqj(this);

    public abstract zzaqo zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzaql
    public final zzaqo zzb(zzhds zzhdsVar, zzaqp zzaqpVar) throws EOFException {
        int iZza;
        long jZzc;
        long jZzb = zzhdsVar.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            iZza = zzhdsVar.zza((ByteBuffer) this.zza.get());
            if (iZza == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long jZze = zzaqn.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (jZze < 8 && jZze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jZze);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jZze == 1) {
                        ((ByteBuffer) this.zza.get()).limit(16);
                        zzhdsVar.zza((ByteBuffer) this.zza.get());
                        ((ByteBuffer) this.zza.get()).position(8);
                        jZzc = zzaqn.zzf((ByteBuffer) this.zza.get()) - 16;
                    } else {
                        jZzc = jZze == 0 ? zzhdsVar.zzc() - zzhdsVar.zzb() : jZze - 8;
                    }
                    if (DebugImage.JsonKeys.UUID.equals(str)) {
                        ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                        zzhdsVar.zza((ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) this.zza.get()).position() - 16; iPosition < ((ByteBuffer) this.zza.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(iPosition);
                        }
                        jZzc -= 16;
                    }
                    long j = jZzc;
                    zzaqo zzaqoVarZza = zza(str, bArr, zzaqpVar instanceof zzaqo ? ((zzaqo) zzaqpVar).zza() : "");
                    ((ByteBuffer) this.zza.get()).rewind();
                    zzaqoVarZza.zzb(zzhdsVar, (ByteBuffer) this.zza.get(), j, this);
                    return zzaqoVarZza;
                } catch (UnsupportedEncodingException e7) {
                    throw new RuntimeException(e7);
                }
            }
        } while (iZza >= 0);
        zzhdsVar.zze(jZzb);
        throw new EOFException();
    }
}
