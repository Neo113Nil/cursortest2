package bd;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes.dex */
class i {
    private static final int a(String str) {
        int I11;
        char c11 = File.separatorChar;
        int I12 = kotlin.text.h.I(c11, 0, 4, str);
        if (I12 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c11 || (I11 = kotlin.text.h.I(c11, 2, 4, str)) < 0) {
                return 1;
            }
            int I13 = kotlin.text.h.I(c11, I11 + 1, 4, str);
            return I13 >= 0 ? I13 + 1 : str.length();
        }
        if (I12 > 0 && str.charAt(I12 - 1) == ':') {
            return I12 + 1;
        }
        if (I12 == -1 && kotlin.text.h.C(str, ':')) {
            return str.length();
        }
        return 0;
    }

    public static final boolean b(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return a(path) > 0;
    }

    @NotNull
    public static final e c(@NotNull File file) {
        List list;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.f(path);
        int a11 = a(path);
        String substring = path.substring(0, a11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = path.substring(a11);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        if (substring2.length() == 0) {
            list = K.f71697a;
        } else {
            List l11 = kotlin.text.h.l(substring2, new char[]{File.separatorChar}, 0, 6);
            ArrayList arrayList = new ArrayList(C7714v.z(l11, 10));
            Iterator it = l11.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new e(new File(substring), list);
    }
}
