package io.sentry.util;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class UUIDGenerator {
    public static long randomHalfLengthUUID() {
        byte[] bArr = new byte[8];
        SentryRandom.current().nextBytes(bArr);
        byte b7 = (byte) (bArr[6] & 15);
        bArr[6] = b7;
        bArr[6] = (byte) (b7 | 64);
        long j = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            j = (j << 8) | ((long) (bArr[i7] & 255));
        }
        return j;
    }

    public static UUID randomUUID() {
        byte[] bArr = new byte[16];
        SentryRandom.current().nextBytes(bArr);
        byte b7 = (byte) (bArr[6] & 15);
        bArr[6] = b7;
        bArr[6] = (byte) (b7 | 64);
        byte b8 = (byte) (bArr[8] & 63);
        bArr[8] = b8;
        bArr[8] = (byte) (b8 | (-128));
        long j = 0;
        long j3 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            j3 = (j3 << 8) | ((long) (bArr[i7] & 255));
        }
        for (int i8 = 8; i8 < 16; i8++) {
            j = (j << 8) | ((long) (bArr[i8] & 255));
        }
        return new UUID(j3, j);
    }
}
