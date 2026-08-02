package Tc;

import E0.C2942q;
import java.util.List;
import kotlin.collections.AbstractC7699f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {
    public static final boolean a(Object[] objArr, int i11, int i12, List list) {
        if (i12 == list.size()) {
            for (int i13 = 0; i13 < i12; i13++) {
                if (Intrinsics.d(objArr[i11 + i13], list.get(i13))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String b(Object[] objArr, int i11, int i12, AbstractC7699f abstractC7699f) {
        StringBuilder sb2 = new StringBuilder((i12 * 3) + 2);
        sb2.append("[");
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i11 + i13];
            if (obj == abstractC7699f) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        return C2942q.c(sb2, "]", "toString(...)");
    }

    public static final void c(int i11, int i12, @NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i11 < i12) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            objArr[i11] = null;
            i11++;
        }
    }
}
