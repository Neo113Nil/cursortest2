package Y0;

import K0.C0204i;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    public static String a(List list, String str, C0204i c0204i, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            c0204i = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = list.get(i6);
            i5++;
            if (i5 > 1) {
                sb.append((CharSequence) str);
            }
            if (c0204i != null) {
                sb.append((CharSequence) c0204i.c(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
