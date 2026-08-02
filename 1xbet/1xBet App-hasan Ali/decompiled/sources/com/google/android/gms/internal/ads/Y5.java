package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class Y5 extends BC {

    /* renamed from: m, reason: collision with root package name */
    public MessageDigest f12276m;

    /* renamed from: n, reason: collision with root package name */
    public final int f12277n;

    /* renamed from: o, reason: collision with root package name */
    public final int f12278o;

    public Y5(int i) {
        super(2);
        int i5 = i >> 3;
        this.f12277n = (i & 7) > 0 ? i5 + 1 : i5;
        this.f12278o = i;
    }

    public final byte[] p1(String str) {
        synchronized (this.f7794k) {
            try {
                MessageDigest X02 = X0();
                this.f12276m = X02;
                if (X02 == null) {
                    return new byte[0];
                }
                X02.reset();
                this.f12276m.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] digest = this.f12276m.digest();
                int length = digest.length;
                int i = this.f12277n;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                if ((this.f12278o & 7) > 0) {
                    long j5 = 0;
                    for (int i5 = 0; i5 < length; i5++) {
                        if (i5 > 0) {
                            j5 <<= 8;
                        }
                        j5 += bArr[i5] & 255;
                    }
                    long j6 = j5 >>> (8 - (this.f12278o & 7));
                    int i6 = this.f12277n;
                    while (true) {
                        i6--;
                        if (i6 < 0) {
                            break;
                        }
                        bArr[i6] = (byte) (255 & j6);
                        j6 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
