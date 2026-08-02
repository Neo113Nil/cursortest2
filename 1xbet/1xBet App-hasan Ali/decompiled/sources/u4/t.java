package u4;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p4.H;
import p4.I;

/* loaded from: classes.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20116b = AtomicIntegerFieldUpdater.newUpdater(t.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public H[] f20117a;

    public final void a(H h3) {
        h3.e((I) this);
        H[] hArr = this.f20117a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20116b;
        if (hArr == null) {
            hArr = new H[4];
            this.f20117a = hArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= hArr.length) {
            Object[] copyOf = Arrays.copyOf(hArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            hArr = (H[]) copyOf;
            this.f20117a = hArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        hArr[i] = h3;
        h3.f18748l = i;
        d(i);
    }

    public final void b(H h3) {
        synchronized (this) {
            if (h3.b() != null) {
                c(h3.f18748l);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H c(int i) {
        Object[] objArr = this.f20117a;
        kotlin.jvm.internal.l.c(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20116b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            e(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                H h3 = objArr[i];
                kotlin.jvm.internal.l.c(h3);
                Object obj = objArr[i5];
                kotlin.jvm.internal.l.c(obj);
                if (h3.compareTo(obj) < 0) {
                    e(i, i5);
                    d(i5);
                }
            }
            while (true) {
                int i6 = i * 2;
                int i7 = i6 + 1;
                if (i7 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f20117a;
                kotlin.jvm.internal.l.c(objArr2);
                int i8 = i6 + 2;
                if (i8 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i8];
                    kotlin.jvm.internal.l.c(comparable);
                    Object obj2 = objArr2[i7];
                    kotlin.jvm.internal.l.c(obj2);
                }
                i8 = i7;
                Comparable comparable2 = objArr2[i];
                kotlin.jvm.internal.l.c(comparable2);
                Comparable comparable3 = objArr2[i8];
                kotlin.jvm.internal.l.c(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                e(i, i8);
                i = i8;
            }
        }
        H h4 = objArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.l.c(h4);
        h4.e(null);
        h4.f18748l = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return h4;
    }

    public final void d(int i) {
        while (i > 0) {
            H[] hArr = this.f20117a;
            kotlin.jvm.internal.l.c(hArr);
            int i5 = (i - 1) / 2;
            H h3 = hArr[i5];
            kotlin.jvm.internal.l.c(h3);
            H h4 = hArr[i];
            kotlin.jvm.internal.l.c(h4);
            if (h3.compareTo(h4) <= 0) {
                return;
            }
            e(i, i5);
            i = i5;
        }
    }

    public final void e(int i, int i5) {
        H[] hArr = this.f20117a;
        kotlin.jvm.internal.l.c(hArr);
        H h3 = hArr[i5];
        kotlin.jvm.internal.l.c(h3);
        H h4 = hArr[i];
        kotlin.jvm.internal.l.c(h4);
        hArr[i] = h3;
        hArr[i5] = h4;
        h3.f18748l = i;
        h4.f18748l = i5;
    }
}
