package H30;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s {
    @NotNull
    public static final byte[] a(@NotNull String str) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalStateException("Must have an even length");
        }
        ArrayList r11 = kotlin.text.h.r(2, str);
        ArrayList arrayList = new ArrayList(C7714v.z(r11, 10));
        Iterator it = r11.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), CharsKt.checkRadix(16))));
        }
        return C7714v.Q0(arrayList);
    }

    public static final String b(String str) {
        if (str != null) {
            return kotlin.text.h.X(str, "'", " ", false);
        }
        return null;
    }

    public static final String c(String str) {
        if (str == null || kotlin.text.h.K(str)) {
            return null;
        }
        return str;
    }
}
