package E1;

/* loaded from: classes.dex */
public final class s {
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> array;

    public s(int i2) {
        this.array = new java.util.concurrent.atomic.AtomicReferenceArray<>(i2);
    }

    public final int a() {
        return this.array.length();
    }

    public final java.lang.Object b(int i2) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.array;
        if (i2 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i2);
        }
        return null;
    }

    public final void c(int i2, G1.a aVar) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i2 < length) {
            atomicReferenceArray.set(i2, aVar);
            return;
        }
        int i3 = i2 + 1;
        int i4 = length * 2;
        if (i3 < i4) {
            i3 = i4;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(i3);
        for (int i5 = 0; i5 < length; i5++) {
            atomicReferenceArray2.set(i5, atomicReferenceArray.get(i5));
        }
        atomicReferenceArray2.set(i2, aVar);
        this.array = atomicReferenceArray2;
    }
}
