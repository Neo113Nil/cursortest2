package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class Random implements Serializable {
    static final String BadBound = "bound must be positive";
    private static final double DOUBLE_UNIT = 1.1102230246251565E-16d;
    private static final long addend = 11;
    private static final long mask = 281474976710655L;
    private static final long multiplier = 25214903917L;
    private static final AtomicLong seedUniquifier = new AtomicLong(8682522807148012L);
    private static final long serialVersionUID = 3905348978240129619L;
    private final AtomicLong seed;

    public Random() {
        this(seedUniquifier() ^ System.nanoTime());
    }

    private static long initialScramble(long j) {
        return (j ^ multiplier) & mask;
    }

    private int next(int i7) {
        long j;
        long j3;
        AtomicLong atomicLong = this.seed;
        do {
            j = atomicLong.get();
            j3 = ((multiplier * j) + addend) & mask;
        } while (!atomicLong.compareAndSet(j, j3));
        return (int) (j3 >>> (48 - i7));
    }

    private static long seedUniquifier() {
        AtomicLong atomicLong;
        long j;
        long j3;
        do {
            atomicLong = seedUniquifier;
            j = atomicLong.get();
            j3 = 1181783497276652981L * j;
        } while (!atomicLong.compareAndSet(j, j3));
        return j3;
    }

    public final double internalNextDouble(double d7, double d8) {
        double dNextDouble = nextDouble();
        if (d7 >= d8) {
            return dNextDouble;
        }
        double d9 = ((d8 - d7) * dNextDouble) + d7;
        return d9 >= d8 ? Double.longBitsToDouble(Double.doubleToLongBits(d8) - 1) : d9;
    }

    public final int internalNextInt(int i7, int i8) {
        if (i7 >= i8) {
            return nextInt();
        }
        int i9 = i8 - i7;
        if (i9 > 0) {
            return nextInt(i9) + i7;
        }
        while (true) {
            int iNextInt = nextInt();
            if (iNextInt >= i7 && iNextInt < i8) {
                return iNextInt;
            }
        }
    }

    public final long internalNextLong(long j, long j3) {
        long jNextLong = nextLong();
        if (j >= j3) {
            return jNextLong;
        }
        long j7 = j3 - j;
        long j8 = j7 - 1;
        if ((j7 & j8) == 0) {
            return (jNextLong & j8) + j;
        }
        if (j7 > 0) {
            while (true) {
                long j9 = jNextLong >>> 1;
                long j10 = j9 + j8;
                long j11 = j9 % j7;
                if (j10 - j11 >= 0) {
                    return j11 + j;
                }
                jNextLong = nextLong();
            }
        } else {
            while (true) {
                if (jNextLong >= j && jNextLong < j3) {
                    return jNextLong;
                }
                jNextLong = nextLong();
            }
        }
    }

    public boolean nextBoolean() {
        return next(1) != 0;
    }

    public void nextBytes(byte[] bArr) {
        int length = bArr.length;
        int i7 = 0;
        while (i7 < length) {
            int iNextInt = nextInt();
            int iMin = Math.min(length - i7, 4);
            while (true) {
                int i8 = iMin - 1;
                if (iMin > 0) {
                    bArr[i7] = (byte) iNextInt;
                    iNextInt >>= 8;
                    i7++;
                    iMin = i8;
                }
            }
        }
    }

    public double nextDouble() {
        return ((((long) next(26)) << 27) + ((long) next(27))) * DOUBLE_UNIT;
    }

    public float nextFloat() {
        return next(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return next(32);
    }

    public long nextLong() {
        return (((long) next(32)) << 32) + ((long) next(32));
    }

    public synchronized void setSeed(long j) {
        this.seed.set(initialScramble(j));
    }

    public Random(long j) {
        this.seed = new AtomicLong(initialScramble(j));
    }

    public int nextInt(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException(BadBound);
        }
        int next = next(31);
        int i8 = i7 - 1;
        if ((i7 & i8) == 0) {
            return (int) ((((long) i7) * ((long) next)) >> 31);
        }
        while (true) {
            int i9 = next % i7;
            if ((next - i9) + i8 >= 0) {
                return i9;
            }
            next = next(31);
        }
    }
}
