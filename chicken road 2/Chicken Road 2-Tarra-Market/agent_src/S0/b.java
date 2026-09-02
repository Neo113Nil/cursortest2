package S0;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public class b extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(File file, File file2, String str) {
        super(r3);
        j.e(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
    }
}
