package androidx.collection;

import k0.C7445a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f38692a = new Object();

    public static final void a(a0 a0Var) {
        int i11 = a0Var.f38687d;
        int[] iArr = a0Var.f38685b;
        Object[] objArr = a0Var.f38686c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != f38692a) {
                if (i13 != i12) {
                    iArr[i12] = iArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        a0Var.f38684a = false;
        a0Var.f38687d = i12;
    }

    public static final <E> E c(@NotNull a0<E> a0Var, int i11) {
        E e11;
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        int a11 = C7445a.a(a0Var.f38687d, i11, a0Var.f38685b);
        if (a11 < 0 || (e11 = (E) a0Var.f38686c[a11]) == f38692a) {
            return null;
        }
        return e11;
    }

    public static final <E> E d(@NotNull a0<E> a0Var, int i11, E e11) {
        E e12;
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        int a11 = C7445a.a(a0Var.f38687d, i11, a0Var.f38685b);
        return (a11 < 0 || (e12 = (E) a0Var.f38686c[a11]) == f38692a) ? e11 : e12;
    }
}
