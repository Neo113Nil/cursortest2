package K1;

import java.util.ArrayList;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: K1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3435o {
    public static final int a(int i11, @NotNull ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            C3437q c3437q = (C3437q) arrayList.get(i13);
            char c11 = c3437q.f() > i11 ? (char) 1 : c3437q.b() <= i11 ? (char) 65535 : (char) 0;
            if (c11 < 0) {
                i12 = i13 + 1;
            } else {
                if (c11 <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int b(int i11, @NotNull ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            C3437q c3437q = (C3437q) arrayList.get(i13);
            char c11 = c3437q.g() > i11 ? (char) 1 : c3437q.c() <= i11 ? (char) 65535 : (char) 0;
            if (c11 < 0) {
                i12 = i13 + 1;
            } else {
                if (c11 <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int c(@NotNull ArrayList arrayList, float f7) {
        if (f7 <= 0.0f) {
            return 0;
        }
        if (f7 >= ((C3437q) C7714v.X(arrayList)).a()) {
            return C7714v.P(arrayList);
        }
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C3437q c3437q = (C3437q) arrayList.get(i12);
            char c11 = c3437q.h() > f7 ? (char) 1 : c3437q.a() <= f7 ? (char) 65535 : (char) 0;
            if (c11 < 0) {
                i11 = i12 + 1;
            } else {
                if (c11 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void d(@NotNull ArrayList arrayList, long j11, @NotNull Function1 function1) {
        int size = arrayList.size();
        for (int a11 = a(Q.h(j11), arrayList); a11 < size; a11++) {
            C3437q c3437q = (C3437q) arrayList.get(a11);
            if (c3437q.f() >= Q.g(j11)) {
                return;
            }
            if (c3437q.f() != c3437q.b()) {
                function1.invoke(c3437q);
            }
        }
    }
}
