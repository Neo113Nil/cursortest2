package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class TimedValueQueue<V> {
    private V[] Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private long[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public TimedValueQueue() {
        this(10);
    }

    public TimedValueQueue(int i) {
        this.getHighSpeedVideoFpsRangesFor = new long[i];
        this.Camera2StreamConfigurationMap = (V[]) new java.lang.Object[i];
    }

    public final void clear() {
        synchronized (this) {
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizes = 0;
            java.util.Arrays.fill(this.Camera2StreamConfigurationMap, (java.lang.Object) null);
        }
    }

    public final int size() {
        int i;
        synchronized (this) {
            i = this.getHighSpeedVideoSizes;
        }
        return i;
    }

    public final V pollFirst() {
        V highSpeedVideoSizes;
        synchronized (this) {
            highSpeedVideoSizes = this.getHighSpeedVideoSizes == 0 ? null : getHighSpeedVideoSizes();
        }
        return highSpeedVideoSizes;
    }

    public final V pollFloor(long j) {
        V Camera2StreamConfigurationMap;
        synchronized (this) {
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(j, true);
        }
        return Camera2StreamConfigurationMap;
    }

    public final V poll(long j) {
        V Camera2StreamConfigurationMap;
        synchronized (this) {
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(j, false);
        }
        return Camera2StreamConfigurationMap;
    }

    private V Camera2StreamConfigurationMap(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.getHighSpeedVideoSizes > 0) {
            long j3 = j - this.getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoFpsRanges];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = getHighSpeedVideoSizes();
            j2 = j3;
        }
        return v;
    }

    private V getHighSpeedVideoSizes() {
        com.google.common.base.Preconditions.checkState(this.getHighSpeedVideoSizes > 0);
        V[] vArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoFpsRanges;
        V v = vArr[i];
        vArr[i] = null;
        this.getHighSpeedVideoFpsRanges = (i + 1) % vArr.length;
        this.getHighSpeedVideoSizes--;
        return v;
    }

    public final void add(long j, V v) {
        synchronized (this) {
            if (this.getHighSpeedVideoSizes > 0) {
                int i = this.getHighSpeedVideoFpsRanges;
                if (j <= this.getHighSpeedVideoFpsRangesFor[((i + r0) - 1) % this.Camera2StreamConfigurationMap.length]) {
                    clear();
                }
            }
            int length = this.Camera2StreamConfigurationMap.length;
            if (this.getHighSpeedVideoSizes >= length) {
                int i2 = length * 2;
                long[] jArr = new long[i2];
                V[] vArr = (V[]) new java.lang.Object[i2];
                int i3 = this.getHighSpeedVideoFpsRanges;
                int i4 = length - i3;
                java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, i3, jArr, 0, i4);
                java.lang.System.arraycopy(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, vArr, 0, i4);
                int i5 = this.getHighSpeedVideoFpsRanges;
                if (i5 > 0) {
                    java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, 0, jArr, i4, i5);
                    java.lang.System.arraycopy(this.Camera2StreamConfigurationMap, 0, vArr, i4, this.getHighSpeedVideoFpsRanges);
                }
                this.getHighSpeedVideoFpsRangesFor = jArr;
                this.Camera2StreamConfigurationMap = vArr;
                this.getHighSpeedVideoFpsRanges = 0;
            }
            int i6 = this.getHighSpeedVideoFpsRanges;
            int i7 = this.getHighSpeedVideoSizes;
            V[] vArr2 = this.Camera2StreamConfigurationMap;
            int length2 = (i6 + i7) % vArr2.length;
            this.getHighSpeedVideoFpsRangesFor[length2] = j;
            vArr2[length2] = v;
            this.getHighSpeedVideoSizes = i7 + 1;
        }
    }
}
