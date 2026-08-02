package g4;

import java.io.File;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import o4.AbstractC2227e;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1985a extends AbstractC2036a {
    public static File o0(File file) {
        int length;
        int F02;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        l.e("getPath(...)", path);
        char c5 = File.separatorChar;
        int F03 = AbstractC2227e.F0(path, c5, 0, 4);
        if (F03 != 0) {
            length = (F03 <= 0 || path.charAt(F03 + (-1)) != ':') ? (F03 == -1 && AbstractC2227e.C0(path, ':')) ? path.length() : 0 : F03 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c5 || (F02 = AbstractC2227e.F0(path, c5, 2, 4)) < 0) {
            length = 1;
        } else {
            int F04 = AbstractC2227e.F0(path, c5, F02 + 1, 4);
            length = F04 >= 0 ? F04 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String file3 = file.toString();
        l.e("toString(...)", file3);
        if ((file3.length() == 0) || AbstractC2227e.C0(file3, c5)) {
            return new File(file3 + file2);
        }
        return new File(file3 + c5 + file2);
    }
}
