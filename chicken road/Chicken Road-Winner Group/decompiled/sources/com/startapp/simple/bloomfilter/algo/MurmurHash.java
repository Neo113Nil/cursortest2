package com.startapp.simple.bloomfilter.algo;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class MurmurHash {
    public static long hash64(ByteBuffer byteBuffer, int i3, int i4, long j3) {
        long j4 = -4132994306676758123L;
        long j5 = (j3 & 4294967295L) ^ (i4 * (-4132994306676758123L));
        int i5 = 0;
        while (i5 < (i4 >> 3)) {
            int i6 = i3 + (i5 << 3);
            long j6 = j4;
            long j7 = ((byteBuffer.get(i6) & 255) + ((byteBuffer.get(i6 + 1) & 255) << 8) + ((byteBuffer.get(i6 + 2) & 255) << 16) + ((byteBuffer.get(i6 + 3) & 255) << 24) + ((byteBuffer.get(i6 + 4) & 255) << 32) + ((byteBuffer.get(i6 + 5) & 255) << 40) + ((byteBuffer.get(i6 + 6) & 255) << 48) + ((byteBuffer.get(i6 + 7) & 255) << 56)) * j6;
            j5 = (j5 ^ ((j7 ^ (j7 >>> 47)) * j6)) * j6;
            i5++;
            j4 = j6;
        }
        long j8 = j4;
        switch (i4 & 7) {
            case 7:
                j5 ^= byteBuffer.get(((i3 + i4) - r4) + 6) << 48;
            case 6:
                j5 ^= byteBuffer.get(((i3 + i4) - r4) + 5) << 40;
            case 5:
                j5 ^= byteBuffer.get(((i3 + i4) - r4) + 4) << 32;
            case 4:
                j5 ^= byteBuffer.get(((i3 + i4) - r4) + 3) << 24;
            case 3:
                j5 ^= byteBuffer.get(((i3 + i4) - r4) + 2) << 16;
            case 2:
                j5 ^= byteBuffer.get(((i3 + i4) - r4) + 1) << 8;
            case 1:
                j5 = (byteBuffer.get((i3 + i4) - r4) ^ j5) * j8;
                break;
        }
        long j9 = ((j5 >>> 47) ^ j5) * j8;
        return j9 ^ (j9 >>> 47);
    }
}
