package androidx.collection;

import java.util.Arrays;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J<E> extends Q<E> {
    public J() {
        this((Object) null);
    }

    public final void b(Object obj) {
        int i11 = this.f38647b + 1;
        Object[] objArr = this.f38646a;
        if (objArr.length < i11) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i11, (objArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f38646a = copyOf;
        }
        Object[] objArr2 = this.f38646a;
        int i12 = this.f38647b;
        objArr2[i12] = obj;
        this.f38647b = i12 + 1;
    }

    public final void c() {
        C7705l.x(this.f38646a, null, 0, this.f38647b);
        this.f38647b = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(t0.n nVar) {
        int i11;
        int a11 = a(nVar);
        if (a11 >= 0) {
            if (a11 < 0 || a11 >= (i11 = this.f38647b)) {
                StringBuilder f7 = P4.f.f(a11, "Index ", " must be in 0..");
                f7.append(this.f38647b - 1);
                throw new IndexOutOfBoundsException(f7.toString());
            }
            Object[] objArr = this.f38646a;
            Object obj = objArr[a11];
            if (a11 != i11 - 1) {
                C7705l.r(objArr, a11, objArr, a11 + 1, i11);
            }
            int i12 = this.f38647b - 1;
            this.f38647b = i12;
            objArr[i12] = null;
        }
    }

    public J(int i11) {
        this.f38646a = i11 == 0 ? S.f38649a : new Object[i11];
    }

    public /* synthetic */ J(Object obj) {
        this(16);
    }
}
