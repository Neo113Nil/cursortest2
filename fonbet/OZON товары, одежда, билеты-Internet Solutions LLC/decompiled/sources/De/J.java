package De;

import De.K;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10734l0;

/* loaded from: classes.dex */
public class J<T extends K & Comparable<? super T>> {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f6610b = AtomicIntegerFieldUpdater.newUpdater(J.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    private T[] f6611a;

    private final void f(int i11) {
        while (i11 > 0) {
            T[] tArr = this.f6611a;
            Intrinsics.f(tArr);
            int i12 = (i11 - 1) / 2;
            T t2 = tArr[i12];
            Intrinsics.f(t2);
            T t11 = tArr[i11];
            Intrinsics.f(t11);
            if (((Comparable) t2).compareTo(t11) <= 0) {
                return;
            }
            g(i11, i12);
            i11 = i12;
        }
    }

    private final void g(int i11, int i12) {
        T[] tArr = this.f6611a;
        Intrinsics.f(tArr);
        T t2 = tArr[i12];
        Intrinsics.f(t2);
        T t11 = tArr[i11];
        Intrinsics.f(t11);
        tArr[i11] = t2;
        tArr[i12] = t11;
        t2.setIndex(i11);
        t11.setIndex(i12);
    }

    public final void a(@NotNull AbstractC10734l0.c cVar) {
        cVar.b(this);
        T[] tArr = this.f6611a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6610b;
        if (tArr == null) {
            tArr = (T[]) new K[4];
            this.f6611a = tArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            tArr = (T[]) ((K[]) copyOf);
            this.f6611a = tArr;
        }
        int i11 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i11 + 1);
        tArr[i11] = cVar;
        cVar.setIndex(i11);
        f(i11);
    }

    public final T b() {
        T[] tArr = this.f6611a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final boolean c() {
        return f6610b.get(this) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (((java.lang.Comparable) r6).compareTo(r7) < 0) goto L18;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T d(int i11) {
        T[] tArr = this.f6611a;
        Intrinsics.f(tArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6610b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i11 < atomicIntegerFieldUpdater.get(this)) {
            g(i11, atomicIntegerFieldUpdater.get(this));
            int i12 = (i11 - 1) / 2;
            if (i11 > 0) {
                T t2 = tArr[i11];
                Intrinsics.f(t2);
                T t11 = tArr[i12];
                Intrinsics.f(t11);
                if (((Comparable) t2).compareTo(t11) < 0) {
                    g(i11, i12);
                    f(i12);
                }
            }
            while (true) {
                int i13 = i11 * 2;
                int i14 = i13 + 1;
                if (i14 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                T[] tArr2 = this.f6611a;
                Intrinsics.f(tArr2);
                int i15 = i13 + 2;
                if (i15 < atomicIntegerFieldUpdater.get(this)) {
                    T t12 = tArr2[i15];
                    Intrinsics.f(t12);
                    T t13 = tArr2[i14];
                    Intrinsics.f(t13);
                }
                i15 = i14;
                T t14 = tArr2[i11];
                Intrinsics.f(t14);
                T t15 = tArr2[i15];
                Intrinsics.f(t15);
                if (((Comparable) t14).compareTo(t15) <= 0) {
                    break;
                }
                g(i11, i15);
                i11 = i15;
            }
        }
        T t16 = tArr[atomicIntegerFieldUpdater.get(this)];
        Intrinsics.f(t16);
        t16.b(null);
        t16.setIndex(-1);
        tArr[atomicIntegerFieldUpdater.get(this)] = null;
        return t16;
    }

    public final T e() {
        T d11;
        synchronized (this) {
            d11 = f6610b.get(this) > 0 ? d(0) : null;
        }
        return d11;
    }
}
