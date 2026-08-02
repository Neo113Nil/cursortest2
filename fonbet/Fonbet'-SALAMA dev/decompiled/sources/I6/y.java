package I6;

import D6.U;
import D6.V;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3766b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public U[] f3767a;

    public final void a(U u4) {
        u4.c((V) this);
        U[] uArr = this.f3767a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3766b;
        if (uArr == null) {
            uArr = new U[4];
            this.f3767a = uArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= uArr.length) {
            Object[] copyOf = Arrays.copyOf(uArr, atomicIntegerFieldUpdater.get(this) * 2);
            t6.h.d(copyOf, "copyOf(this, newSize)");
            uArr = (U[]) copyOf;
            this.f3767a = uArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        uArr[i7] = u4;
        u4.f1806b = i7;
        c(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final U b(int i7) {
        Object[] objArr = this.f3767a;
        t6.h.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3766b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i7 < atomicIntegerFieldUpdater.get(this)) {
            d(i7, atomicIntegerFieldUpdater.get(this));
            int i8 = (i7 - 1) / 2;
            if (i7 > 0) {
                U u4 = objArr[i7];
                t6.h.b(u4);
                Object obj = objArr[i8];
                t6.h.b(obj);
                if (u4.compareTo(obj) < 0) {
                    d(i7, i8);
                    c(i8);
                }
            }
            while (true) {
                int i9 = i7 * 2;
                int i10 = i9 + 1;
                if (i10 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f3767a;
                t6.h.b(objArr2);
                int i11 = i9 + 2;
                if (i11 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i11];
                    t6.h.b(comparable);
                    Object obj2 = objArr2[i10];
                    t6.h.b(obj2);
                }
                i11 = i10;
                Comparable comparable2 = objArr2[i7];
                t6.h.b(comparable2);
                Comparable comparable3 = objArr2[i11];
                t6.h.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i7, i11);
                i7 = i11;
            }
        }
        U u7 = objArr[atomicIntegerFieldUpdater.get(this)];
        t6.h.b(u7);
        u7.c(null);
        u7.f1806b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
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
