package rx.internal.util;

/* loaded from: classes18.dex */
public final class OpenHashSet<T> {
    int Camera2StreamConfigurationMap;
    T[] getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final float getHighSpeedVideoSizes;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    public OpenHashSet(int i) {
        this(i, 0.75f);
    }

    public OpenHashSet(int i, float f) {
        this.getHighSpeedVideoSizes = f;
        int roundToPowerOfTwo = rx.internal.util.unsafe.Pow2.roundToPowerOfTwo(i);
        this.Camera2StreamConfigurationMap = roundToPowerOfTwo - 1;
        this.getHighSpeedVideoFpsRangesFor = (int) (f * roundToPowerOfTwo);
        this.getHighResolutionOutputSizeshNQ4ISI = (T[]) new java.lang.Object[roundToPowerOfTwo];
    }

    public final boolean add(T t) {
        T t2;
        T t3;
        T[] tArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.Camera2StreamConfigurationMap;
        int hashCode = t.hashCode() * (-1640531527);
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        T t4 = tArr[i2];
        if (t4 != null) {
            if (t4.equals(t)) {
                return false;
            }
            do {
                i2 = (i2 + 1) & i;
                t3 = tArr[i2];
                if (t3 == null) {
                }
            } while (!t3.equals(t));
            return false;
        }
        tArr[i2] = t;
        int i3 = this.getHighSpeedVideoFpsRanges + 1;
        this.getHighSpeedVideoFpsRanges = i3;
        if (i3 >= this.getHighSpeedVideoFpsRangesFor) {
            T[] tArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int length = tArr2.length;
            int i4 = length << 1;
            int i5 = i4 - 1;
            T[] tArr3 = (T[]) new java.lang.Object[i4];
            while (i3 != 0) {
                do {
                    length--;
                    t2 = tArr2[length];
                } while (t2 == null);
                int hashCode2 = t2.hashCode() * (-1640531527);
                int i6 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
                if (tArr3[i6] != null) {
                    do {
                        i6 = (i6 + 1) & i5;
                    } while (tArr3[i6] != null);
                }
                tArr3[i6] = tArr2[length];
                i3--;
            }
            this.Camera2StreamConfigurationMap = i5;
            this.getHighSpeedVideoFpsRangesFor = (int) (i4 * this.getHighSpeedVideoSizes);
            this.getHighResolutionOutputSizeshNQ4ISI = tArr3;
        }
        return true;
    }

    public final boolean remove(T t) {
        T t2;
        T[] tArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.Camera2StreamConfigurationMap;
        int hashCode = t.hashCode() * (-1640531527);
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        T t3 = tArr[i2];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return getHighSpeedVideoFpsRangesFor(i2, tArr, i);
        }
        do {
            i2 = (i2 + 1) & i;
            t2 = tArr[i2];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return getHighSpeedVideoFpsRangesFor(i2, tArr, i);
    }

    private boolean getHighSpeedVideoFpsRangesFor(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.getHighSpeedVideoFpsRanges--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int hashCode = t.hashCode() * (-1640531527);
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i > i3) {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < i5 && i5 <= i3) {
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public final void clear(rx.functions.Action1<? super T> action1) {
        if (this.getHighSpeedVideoFpsRanges == 0) {
            return;
        }
        T[] tArr = this.getHighResolutionOutputSizeshNQ4ISI;
        for (a.d dVar : tArr) {
            if (dVar != null) {
                action1.call(dVar);
            }
        }
        java.util.Arrays.fill(tArr, (java.lang.Object) null);
        this.getHighSpeedVideoFpsRanges = 0;
    }

    public final void terminate() {
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = (T[]) new java.lang.Object[0];
    }

    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges == 0;
    }

    public final T[] values() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
