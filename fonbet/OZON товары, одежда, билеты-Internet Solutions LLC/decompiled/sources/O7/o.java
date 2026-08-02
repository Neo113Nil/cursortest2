package O7;

import Gl.C3124a;
import g.C6594f;
import java.util.logging.Level;
import java.util.logging.Logger;
import x0.C10600e;

/* loaded from: classes.dex */
public final class o {
    public static final int a(int i11, U0.b bVar) {
        int m11 = bVar.m() - 1;
        int i12 = 0;
        while (i12 < m11) {
            int a11 = C3124a.a(m11, i12, 2, i12);
            int b11 = ((C10600e) bVar.l()[a11]).b();
            if (b11 != i11) {
                if (b11 < i11) {
                    i12 = a11 + 1;
                    if (i11 < ((C10600e) bVar.l()[i12]).b()) {
                    }
                } else {
                    m11 = a11 - 1;
                }
            }
            return a11;
        }
        return i12;
    }

    public static byte[] b(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            int digit = Character.digit(str.charAt(i12), 16);
            int digit2 = Character.digit(str.charAt(i12 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i11] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static String c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            int i11 = b11 & 255;
            sb2.append("0123456789abcdef".charAt(i11 / 16));
            sb2.append("0123456789abcdef".charAt(i11 % 16));
        }
        return sb2.toString();
    }

    public static String d(String str, Object... objArr) {
        int indexOf;
        String sb2;
        int i11 = 0;
        for (int i12 = 0; i12 < objArr.length; i12++) {
            Object obj = objArr[i12];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e11) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e11);
                    StringBuilder b11 = C6594f.b("<", str2, " threw ");
                    b11.append(e11.getClass().getName());
                    b11.append(">");
                    sb2 = b11.toString();
                }
            }
            objArr[i12] = sb2;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i13 = 0;
        while (i11 < objArr.length && (indexOf = str.indexOf("%s", i13)) != -1) {
            sb3.append((CharSequence) str, i13, indexOf);
            sb3.append(objArr[i11]);
            i13 = indexOf + 2;
            i11++;
        }
        sb3.append((CharSequence) str, i13, str.length());
        if (i11 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i11]);
            for (int i14 = i11 + 1; i14 < objArr.length; i14++) {
                sb3.append(", ");
                sb3.append(objArr[i14]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
