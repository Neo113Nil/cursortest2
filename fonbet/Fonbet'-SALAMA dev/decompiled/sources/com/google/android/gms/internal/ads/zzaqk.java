package com.google.android.gms.internal.ads;

import io.sentry.protocol.DebugImage;
import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzaqk implements zzaql {
    private static final Logger zzb = Logger.getLogger(zzaqk.class.getName());
    final ThreadLocal zza = new zzaqj(this);

    public abstract zzaqo zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzaql
    public final zzaqo zzb(zzhds zzhdsVar, zzaqp zzaqpVar) {
        int zza;
        long zzc;
        long zzb2 = zzhdsVar.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            zza = zzhdsVar.zza((ByteBuffer) this.zza.get());
            if (zza == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long zze = zzaqn.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (zze < 8 && zze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(zze);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (zze == 1) {
                        ((ByteBuffer) this.zza.get()).limit(16);
                        zzhdsVar.zza((ByteBuffer) this.zza.get());
                        ((ByteBuffer) this.zza.get()).position(8);
                        zzc = zzaqn.zzf((ByteBuffer) this.zza.get()) - 16;
                    } else {
                        zzc = zze == 0 ? zzhdsVar.zzc() - zzhdsVar.zzb() : zze - 8;
                    }
                    if (DebugImage.JsonKeys.UUID.equals(str)) {
                        ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                        zzhdsVar.zza((ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.zza.get()).position() - 16; position < ((ByteBuffer) this.zza.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(position);
                        }
                        zzc -= 16;
                    }
                    long j = zzc;
                    zzaqo zza2 = zza(str, bArr, zzaqpVar instanceof zzaqo ? ((zzaqo) zzaqpVar).zza() : "");
                    ((ByteBuffer) this.zza.get()).rewind();
                    zza2.zzb(zzhdsVar, (ByteBuffer) this.zza.get(), j, this);
                    return zza2;
                } catch (UnsupportedEncodingException e7) {
                    throw new RuntimeException(e7);
                }
            }
        } while (zza >= 0);
        zzhdsVar.zze(zzb2);
        throw new EOFException();
    }
}
