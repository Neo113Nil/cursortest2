package I6;

import D6.U;
import D6.V;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3766b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size");
    private volatile int _size;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U[] f3767a;

    public final void a(U u4) {
        u4.c((V) this);
        U[] uArr = this.f3767a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3766b;
        if (uArr == null) {
            uArr = new U[4];
            this.f3767a = uArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= uArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(uArr, atomicIntegerFieldUpdater.get(this) * 2);
            t6.h.d(objArrCopyOf, "copyOf(this, newSize)");
            uArr = (U[]) objArrCopyOf;
            this.f3767a = uArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        uArr[i7] = u4;
        u4.f1806b = i7;
        c(i7);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final U b(int i7) {
        int i8;
        int i9;
        Object[] objArr;
        int i10;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f3767a;
        t6.h.b(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3766b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i7 < atomicIntegerFieldUpdater.get(this)) {
            d(i7, atomicIntegerFieldUpdater.get(this));
            int i11 = (i7 - 1) / 2;
            if (i7 > 0) {
                U u4 = objArr2[i7];
                t6.h.b(u4);
                Object obj2 = objArr2[i11];
                t6.h.b(obj2);
                if (u4.compareTo(obj2) < 0) {
                    d(i7, i11);
                    c(i11);
                } else {
                    while (true) {
                        i8 = i7 * 2;
                        i9 = i8 + 1;
                        if (i9 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f3767a;
                        t6.h.b(objArr);
                        i10 = i8 + 2;
                        if (i10 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i10];
                            t6.h.b(comparable3);
                            obj = objArr[i9];
                            t6.h.b(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i10 = i9;
                            }
                        } else {
                            i10 = i9;
                        }
                        comparable = objArr[i7];
                        t6.h.b(comparable);
                        comparable2 = objArr[i10];
                        t6.h.b(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i7, i10);
                        i7 = i10;
                    }
                }
            } else {
                while (true) {
                    i8 = i7 * 2;
                    i9 = i8 + 1;
                    if (i9 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f3767a;
                    t6.h.b(objArr);
                    i10 = i8 + 2;
                    if (i10 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i10];
                        t6.h.b(comparable3);
                        obj = objArr[i9];
                        t6.h.b(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i10 = i9;
                        }
                    } else {
                        i10 = i9;
                    }
                    comparable = objArr[i7];
                    t6.h.b(comparable);
                    comparable2 = objArr[i10];
                    t6.h.b(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i7, i10);
                    i7 = i10;
                }
            }
        }
        U u7 = objArr2[atomicIntegerFieldUpdater.get(this)];
        t6.h.b(u7);
        u7.c(null);
        u7.f1806b = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return u7;
    }

    public final void c(int i7) {
        while (i7 > 0) {
            U[] uArr = this.f3767a;
            t6.h.b(uArr);
            int i8 = (i7 - 1) / 2;
            U u4 = uArr[i8];
            t6.h.b(u4);
            U u7 = uArr[i7];
            t6.h.b(u7);
            if (u4.compareTo(u7) <= 0) {
                return;
            }
            d(i7, i8);
            i7 = i8;
        }
    }

    public final void d(int i7, int i8) {
        U[] uArr = this.f3767a;
        t6.h.b(uArr);
        U u4 = uArr[i8];
        t6.h.b(u4);
        U u7 = uArr[i7];
        t6.h.b(u7);
        uArr[i7] = u4;
        uArr[i8] = u7;
        u4.f1806b = i7;
        u7.f1806b = i8;
    }
}
