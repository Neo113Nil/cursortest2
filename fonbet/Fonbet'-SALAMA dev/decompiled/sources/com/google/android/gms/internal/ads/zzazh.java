package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class zzazh extends zzayy {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzazh(int i7) {
        int i8 = i7 >> 3;
        this.zzc = (i7 & 7) > 0 ? i8 + 1 : i8;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzayy
    public final byte[] zzb(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest zza = zza();
                this.zzb = zza;
                if (zza == null) {
                    return new byte[0];
                }
                zza.reset();
                this.zzb.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] digest = this.zzb.digest();
                int length = digest.length;
                int i7 = this.zzc;
                if (length > i7) {
                    length = i7;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                if ((this.zzd & 7) > 0) {
                    long j = 0;
                    for (int i8 = 0; i8 < length; i8++) {
                        if (i8 > 0) {
                            j <<= 8;
                        }
                        j += bArr[i8] & 255;
                    }
                    long j3 = j >>> (8 - (this.zzd & 7));
                    int i9 = this.zzc;
                    while (true) {
                        i9--;
                        if (i9 < 0) {
                            break;
                        }
                        bArr[i9] = (byte) (255 & j3);
                        j3 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
