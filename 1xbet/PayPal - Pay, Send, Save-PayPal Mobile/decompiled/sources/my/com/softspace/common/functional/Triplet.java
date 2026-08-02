package my.com.softspace.common.functional;

/* loaded from: classes17.dex */
public class Triplet<T, U, V> {
    private final T getHighSpeedVideoFpsRanges;
    private final V getHighSpeedVideoFpsRangesFor;
    private final U getHighSpeedVideoSizes;

    public Triplet(T t, U u, V v) {
        this.getHighSpeedVideoFpsRanges = t;
        this.getHighSpeedVideoSizes = u;
        this.getHighSpeedVideoFpsRangesFor = v;
    }

    public T getFirst() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public U getSecond() {
        return this.getHighSpeedVideoSizes;
    }

    public V getThird() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
