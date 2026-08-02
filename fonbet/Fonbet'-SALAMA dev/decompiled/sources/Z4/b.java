package Z4;

import java.io.File;
import java.io.IOException;
import t6.h;

/* loaded from: classes2.dex */
public class b extends IOException {
    public /* synthetic */ b(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(File file, File file2, String str) {
        super(r3);
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String sb2 = sb.toString();
        h.d(sb2, "toString(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, IndexOutOfBoundsException indexOutOfBoundsException, int i7) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        switch (i7) {
            case 3:
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
                break;
            default:
                break;
        }
    }
}
