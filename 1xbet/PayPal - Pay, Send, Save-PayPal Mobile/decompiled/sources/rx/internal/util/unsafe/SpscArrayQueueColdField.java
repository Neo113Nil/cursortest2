package rx.internal.util.unsafe;

/* loaded from: classes18.dex */
abstract class SpscArrayQueueColdField<E> extends rx.internal.util.unsafe.ConcurrentCircularArrayQueue<E> {
    private static final java.lang.Integer getHighSpeedVideoSizes = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    protected final int lookAheadStep;

    public SpscArrayQueueColdField(int i) {
        super(i);
        this.lookAheadStep = java.lang.Math.min(i / 4, getHighSpeedVideoSizes.intValue());
    }
}
