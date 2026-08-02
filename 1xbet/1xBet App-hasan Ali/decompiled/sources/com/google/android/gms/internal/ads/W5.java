package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class W5 extends BC {

    /* renamed from: m, reason: collision with root package name */
    public MessageDigest f12022m;

    public final byte[] p1(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int d5 = AbstractC1668us.d(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(d5);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int d6 = AbstractC1668us.d(split[i5]);
                    int i6 = (d6 >> 16) ^ ((char) d6);
                    byte b3 = (byte) i6;
                    byte b5 = (byte) (i6 >> 8);
                    int i7 = i5 + i5;
                    bArr[i7] = new byte[]{b3, b5}[0];
                    bArr[i7 + 1] = b5;
                }
            } else {
                bArr = new byte[length];
                for (int i8 = 0; i8 < split.length; i8++) {
                    int d7 = AbstractC1668us.d(split[i8]);
                    bArr[i8] = (byte) ((d7 >> 24) ^ (((d7 & 255) ^ ((d7 >> 8) & 255)) ^ ((d7 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.f12022m = X0();
        synchronized (this.f7794k) {
            try {
                MessageDigest messageDigest = this.f12022m;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f12022m.update(bArr2);
                byte[] digest = this.f12022m.digest();
                int length2 = digest.length;
                if (length2 <= 4) {
                    i = length2;
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(digest, 0, bArr3, 0, i);
                return bArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
