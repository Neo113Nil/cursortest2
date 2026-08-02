package W0;

import Bl0.j0;
import W0.b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j<E> extends b<E> implements V0.a<E> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final j f33185c = new j(new Object[0]);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object[] f33186b;

    public j(@NotNull Object[] objArr) {
        this.f33186b = objArr;
        int length = objArr.length;
    }

    @Override // java.util.List, V0.c
    @NotNull
    public final V0.c<E> add(int i11, E e11) {
        Object[] objArr = this.f33186b;
        j0.e(i11, objArr.length);
        if (i11 == objArr.length) {
            return add((j<E>) e11);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            C7705l.u(objArr, 0, objArr2, i11, 6);
            C7705l.r(objArr, i11 + 1, objArr2, i11, objArr.length);
            objArr2[i11] = e11;
            return new j(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        C7705l.r(objArr, i11 + 1, copyOf, i11, objArr.length - 1);
        copyOf[i11] = e11;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // W0.b, java.util.Collection, java.util.List, V0.c
    @NotNull
    public final V0.c<E> addAll(@NotNull Collection<? extends E> collection) {
        Object[] objArr = this.f33186b;
        if (collection.size() + objArr.length > 32) {
            f d11 = d();
            d11.addAll(collection);
            return d11.e();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int length = objArr.length;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new j(copyOf);
    }

    @Override // V0.c
    @NotNull
    public final f d() {
        return new f(this, null, this.f33186b, 0);
    }

    @Override // V0.c
    @NotNull
    public final V0.c<E> d1(int i11) {
        Object[] objArr = this.f33186b;
        j0.d(i11, objArr.length);
        if (objArr.length == 1) {
            return f33185c;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        C7705l.r(objArr, i11, copyOf, i11 + 1, objArr.length);
        return new j(copyOf);
    }

    @Override // java.util.List
    public final E get(int i11) {
        j0.d(i11, getSize());
        return (E) this.f33186b[i11];
    }

    @Override // kotlin.collections.AbstractC7694a
    public final int getSize() {
        return this.f33186b.length;
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    public final int indexOf(Object obj) {
        return C7705l.M(this.f33186b, obj);
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f33186b;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i12 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    length2 = i12;
                }
            }
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    @NotNull
    public final ListIterator<E> listIterator(int i11) {
        Object[] objArr = this.f33186b;
        j0.e(i11, objArr.length);
        return new c(objArr, i11, objArr.length);
    }

    @Override // V0.c
    @NotNull
    public final V0.c<E> s0(@NotNull Function1<? super E, Boolean> function1) {
        Object[] objArr = this.f33186b;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z11 = false;
        for (int i11 = 0; i11 < length2; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) ((b.a) function1).invoke(obj)).booleanValue()) {
                if (!z11) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(this, size)");
                    z11 = true;
                    length = i11;
                }
            } else if (z11) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f33185c : new j(C7705l.w(0, length, objArr2));
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List, V0.c
    @NotNull
    public final V0.c<E> set(int i11, E e11) {
        j0.d(i11, getSize());
        Object[] objArr = this.f33186b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i11] = e11;
        return new j(copyOf);
    }

    @Override // java.util.Collection, java.util.List, V0.c
    @NotNull
    public final V0.c<E> add(E e11) {
        Object[] objArr = this.f33186b;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[objArr.length] = e11;
            return new j(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e11;
        return new e(objArr, objArr2, objArr.length + 1, 0);
    }
}
