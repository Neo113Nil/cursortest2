package androidx.collection;

import java.util.ConcurrentModificationException;
import k0.C7445a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.collection.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5135d {
    public static final <E> void a(@NotNull C5133b<E> c5133b, int i11) {
        Intrinsics.checkNotNullParameter(c5133b, "<this>");
        c5133b.k(new int[i11]);
        c5133b.i(new Object[i11]);
    }

    public static final <E> int b(@NotNull C5133b<E> c5133b, Object obj, int i11) {
        Intrinsics.checkNotNullParameter(c5133b, "<this>");
        int e11 = c5133b.e();
        if (e11 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(c5133b, "<this>");
        try {
            int a11 = C7445a.a(c5133b.e(), i11, c5133b.c());
            if (a11 < 0 || Intrinsics.d(obj, c5133b.b()[a11])) {
                return a11;
            }
            int i12 = a11 + 1;
            while (i12 < e11 && c5133b.c()[i12] == i11) {
                if (Intrinsics.d(obj, c5133b.b()[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = a11 - 1; i13 >= 0 && c5133b.c()[i13] == i11; i13--) {
                if (Intrinsics.d(obj, c5133b.b()[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
