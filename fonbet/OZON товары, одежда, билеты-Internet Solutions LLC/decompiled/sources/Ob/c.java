package Ob;

import Sc.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final long f20178a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20179b = 0;

    static {
        C.Companion companion = C.INSTANCE;
        f20178a = 4294967295L;
    }

    @NotNull
    public static final void a(long j11, long j12, long j13, @NotNull long[] output) {
        Intrinsics.checkNotNullParameter(output, "output");
        C.Companion companion = C.INSTANCE;
        long j14 = j11 + j12 + j13;
        output[0] = j14;
        output[1] = (((j11 | j12) & (~j14)) | (j11 & j12)) >>> 63;
    }

    @NotNull
    public static final void b(long j11, long j12, @NotNull long[] output) {
        Intrinsics.checkNotNullParameter(output, "output");
        long j13 = f20178a;
        long j14 = j11 & j13;
        C.Companion companion = C.INSTANCE;
        long j15 = j11 >>> 32;
        long j16 = j12 & j13;
        long j17 = j12 >>> 32;
        long j18 = (j16 * j15) + ((j14 * j16) >>> 32);
        long j19 = j15 * j17;
        output[0] = j19 + (j18 >>> 32) + (((j14 * j17) + (j13 & j18)) >>> 32);
        output[1] = j11 * j12;
    }

    public static long[] c(long j11) {
        long[] storage = new long[2];
        Intrinsics.checkNotNullParameter(storage, "storage");
        b(j11, 121666L, storage);
        return storage;
    }
}
