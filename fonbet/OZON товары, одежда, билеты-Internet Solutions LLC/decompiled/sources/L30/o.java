package L30;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<Integer> f16530a = C7714v.b0(1000000, 1000, 1);

    @NotNull
    public static final String a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            int i11 = 0;
            List m11 = kotlin.text.h.m((CharSequence) C7714v.K(kotlin.text.h.m(str, new String[]{"-"}, 0, 6)), new String[]{"."}, 0, 6);
            if (!m11.isEmpty()) {
                ListIterator listIterator = m11.listIterator(m11.size());
                while (listIterator.hasPrevious()) {
                    i11 += Integer.parseInt((String) listIterator.previous()) * f16530a.get(listIterator.previousIndex()).intValue();
                }
            }
            return String.valueOf(i11);
        } catch (Exception unused) {
            return "0";
        }
    }
}
