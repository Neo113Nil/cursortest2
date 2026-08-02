package v;

import android.text.InputFilter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import o4.AbstractC2227e;

/* renamed from: v.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2527w {
    public static final C2526v a(float f, long j5) {
        return new C2526v(f, new i0.M(j5));
    }

    public static void b(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(z4.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static void c(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(z4.b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                sb.append(z4.b.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static y4.m e(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i5 = 0; i5 < length; i5++) {
            String str = strArr2[i5];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i5] = AbstractC2227e.Q0(str).toString();
        }
        int A3 = G4.l.A(0, strArr2.length - 1, 2);
        if (A3 >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                b(str2);
                c(str3, str2);
                if (i == A3) {
                    break;
                }
                i += 2;
            }
        }
        return new y4.m(strArr2);
    }

    public static w1.b f(MappedByteBuffer mappedByteBuffer) {
        long j5;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i5 = 0;
        while (true) {
            if (i5 >= i) {
                j5 = -1;
                break;
            }
            int i6 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j5 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i6) {
                break;
            }
            i5++;
        }
        if (j5 != -1) {
            duplicate.position(duplicate.position() + ((int) (j5 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j6 = duplicate.getInt() & 4294967295L;
            for (int i7 = 0; i7 < j6; i7++) {
                int i8 = duplicate.getInt();
                long j7 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i8 || 1701669481 == i8) {
                    duplicate.position((int) (j7 + j5));
                    w1.b bVar = new w1.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f6158n = duplicate;
                    bVar.f6155k = position;
                    int i9 = position - duplicate.getInt(position);
                    bVar.f6156l = i9;
                    bVar.f6157m = ((ByteBuffer) bVar.f6158n).getShort(i9);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public abstract InputFilter[] d(InputFilter[] inputFilterArr);

    public abstract void g(boolean z3);

    public abstract void h(boolean z3);
}
