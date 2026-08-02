package org.jctools.util;

/* loaded from: classes18.dex */
public class PaddedAtomicLong extends org.jctools.util.PaddedAtomicLongL2Pad {
    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ boolean casVal(long j, long j2) {
        return super.casVal(j, j2);
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ long getAndAddVal(long j) {
        return super.getAndAddVal(j);
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ long getAndSetVal(long j) {
        return super.getAndSetVal(j);
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ long lpVal() {
        return super.lpVal();
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ long lvVal() {
        return super.lvVal();
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ void soVal(long j) {
        super.soVal(j);
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ void spVal(long j) {
        super.spVal(j);
    }

    @Override // org.jctools.util.PaddedAtomicLongL1Field
    public /* bridge */ /* synthetic */ void svVal(long j) {
        super.svVal(j);
    }

    public PaddedAtomicLong() {
    }

    public PaddedAtomicLong(long j) {
        svVal(j);
    }

    public long get() {
        return lvVal();
    }

    public void set(long j) {
        svVal(j);
    }

    public void lazySet(long j) {
        soVal(j);
    }

    public long getAndSet(long j) {
        return getAndSetVal(j);
    }

    public boolean compareAndSet(long j, long j2) {
        return casVal(j, j2);
    }

    public boolean weakCompareAndSet(long j, long j2) {
        return casVal(j, j2);
    }

    public long getAndIncrement() {
        return getAndAddVal(1L);
    }

    public long getAndDecrement() {
        return getAndAddVal(-1L);
    }

    public long getAndAdd(long j) {
        return getAndAddVal(j);
    }

    public long incrementAndGet() {
        return getAndAddVal(1L) + 1;
    }

    public long decrementAndGet() {
        return getAndAddVal(-1L) - 1;
    }

    public long addAndGet(long j) {
        return getAndAddVal(j) + j;
    }

    public long getAndUpdate(java.util.function.LongUnaryOperator longUnaryOperator) {
        long lvVal;
        do {
            lvVal = lvVal();
        } while (!casVal(lvVal, longUnaryOperator.applyAsLong(lvVal)));
        return lvVal;
    }

    public long updateAndGet(java.util.function.LongUnaryOperator longUnaryOperator) {
        long lvVal;
        long applyAsLong;
        do {
            lvVal = lvVal();
            applyAsLong = longUnaryOperator.applyAsLong(lvVal);
        } while (!casVal(lvVal, applyAsLong));
        return applyAsLong;
    }

    public long getAndAccumulate(long j, java.util.function.LongBinaryOperator longBinaryOperator) {
        long lvVal;
        do {
            lvVal = lvVal();
        } while (!casVal(lvVal, longBinaryOperator.applyAsLong(lvVal, j)));
        return lvVal;
    }

    public long accumulateAndGet(long j, java.util.function.LongBinaryOperator longBinaryOperator) {
        long lvVal;
        long applyAsLong;
        do {
            lvVal = lvVal();
            applyAsLong = longBinaryOperator.applyAsLong(lvVal, j);
        } while (!casVal(lvVal, applyAsLong));
        return applyAsLong;
    }

    public java.lang.String toString() {
        return java.lang.Long.toString(lvVal());
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) lvVal();
    }

    @Override // java.lang.Number
    public long longValue() {
        return lvVal();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return lvVal();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return lvVal();
    }
}
