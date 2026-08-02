package kotlin.uuid;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\u0080\u0004R\u000f\u0010\u0004\u001a\u00020\u0005X\u0082Ô\b¢\u0006\u0002\n\u0000R\u000f\u0010\u0006\u001a\u00020\u0005X\u0082Ô\b¢\u0006\u0002\n\u0000R\u000f\u0010\u0007\u001a\u00020\bX\u0082Ô\b¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\nX\u0082\u0084\b¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0010"}, d2 = {"Lkotlin/uuid/UuidV7Generator;", "", "<init>", "()V", "TIMESTAMP_BIAS_BITS", "", "VERSION_MASK", "OVERFLOW_MASK", "", "timestampAndCounter", "Lkotlin/concurrent/atomics/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "generate", "Lkotlin/uuid/Uuid;", "clock", "Lkotlin/time/Clock;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final class UuidV7Generator {
    public static final kotlin.uuid.UuidV7Generator getHighSpeedVideoFpsRanges = new kotlin.uuid.UuidV7Generator();
    private static final java.util.concurrent.atomic.AtomicLong getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong(0);

    private UuidV7Generator() {
    }

    public static kotlin.uuid.Uuid getHighResolutionOutputSizeshNQ4ISI(kotlin.time.Clock clock) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
        byte[] bArr = new byte[10];
        kotlin.uuid.UuidKt.secureRandomBytes(bArr);
        int i = ((bArr[8] & 7) << 8) | (bArr[9] & 255) | 28672;
        while (true) {
            java.util.concurrent.atomic.AtomicLong atomicLong = getHighResolutionOutputSizeshNQ4ISI;
            long j2 = atomicLong.get();
            long epochMilliseconds = clock.now().toEpochMilliseconds();
            long j3 = j2 >>> 16;
            if (j3 < epochMilliseconds) {
                j = (epochMilliseconds << 16) | i;
                if (atomicLong.compareAndSet(j2, j)) {
                    break;
                }
            } else {
                long j4 = j2 + 1;
                j = (32768 & j4) != 0 ? ((j3 + 1) << 16) | i : j4;
                if (atomicLong.compareAndSet(j2, j)) {
                    break;
                }
            }
        }
        bArr[0] = (byte) (((byte) (bArr[0] & 63)) | Byte.MIN_VALUE);
        return kotlin.uuid.Uuid.INSTANCE.fromLongs(j, kotlin.uuid.UuidKt.getLongAt(bArr, 0));
    }
}
