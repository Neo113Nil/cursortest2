package R5;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* renamed from: R5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0406b extends A5.x {
    @Override // A5.x
    public Object f(byte b7, ByteBuffer byteBuffer) {
        t6.h.e(byteBuffer, "buffer");
        int i7 = 0;
        if (b7 == -127) {
            Long l7 = (Long) e(byteBuffer);
            if (l7 == null) {
                return null;
            }
            int longValue = (int) l7.longValue();
            r.f6204b.getClass();
            r[] values = r.values();
            int length = values.length;
            while (i7 < length) {
                r rVar = values[i7];
                if (rVar.f6210a == longValue) {
                    return rVar;
                }
                i7++;
            }
            return null;
        }
        if (b7 == -126) {
            Long l8 = (Long) e(byteBuffer);
            if (l8 == null) {
                return null;
            }
            int longValue2 = (int) l8.longValue();
            EnumC0414j.f6179b.getClass();
            EnumC0414j[] values2 = EnumC0414j.values();
            int length2 = values2.length;
            while (i7 < length2) {
                EnumC0414j enumC0414j = values2[i7];
                if (enumC0414j.f6187a == longValue2) {
                    return enumC0414j;
                }
                i7++;
            }
            return null;
        }
        if (b7 == -125) {
            Long l9 = (Long) e(byteBuffer);
            if (l9 == null) {
                return null;
            }
            int longValue3 = (int) l9.longValue();
            EnumC0428y.f6221b.getClass();
            EnumC0428y[] values3 = EnumC0428y.values();
            int length3 = values3.length;
            while (i7 < length3) {
                EnumC0428y enumC0428y = values3[i7];
                if (enumC0428y.f6224a == longValue3) {
                    return enumC0428y;
                }
                i7++;
            }
            return null;
        }
        if (b7 == -124) {
            Long l10 = (Long) e(byteBuffer);
            if (l10 == null) {
                return null;
            }
            int longValue4 = (int) l10.longValue();
            U.f6103b.getClass();
            U[] values4 = U.values();
            int length4 = values4.length;
            while (i7 < length4) {
                U u4 = values4[i7];
                if (u4.f6111a == longValue4) {
                    return u4;
                }
                i7++;
            }
            return null;
        }
        if (b7 != -123) {
            return super.f(b7, byteBuffer);
        }
        Long l11 = (Long) e(byteBuffer);
        if (l11 == null) {
            return null;
        }
        int longValue5 = (int) l11.longValue();
        EnumC0427x.f6218b.getClass();
        EnumC0427x[] values5 = EnumC0427x.values();
        int length5 = values5.length;
        while (i7 < length5) {
            EnumC0427x enumC0427x = values5[i7];
            if (enumC0427x.f6220a == longValue5) {
                return enumC0427x;
            }
            i7++;
        }
        return null;
    }

    @Override // A5.x
    public void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        t6.h.e(byteArrayOutputStream, "stream");
        if (obj instanceof r) {
            byteArrayOutputStream.write(129);
            k(byteArrayOutputStream, Integer.valueOf(((r) obj).f6210a));
            return;
        }
        if (obj instanceof EnumC0414j) {
            byteArrayOutputStream.write(130);
            k(byteArrayOutputStream, Integer.valueOf(((EnumC0414j) obj).f6187a));
            return;
        }
        if (obj instanceof EnumC0428y) {
            byteArrayOutputStream.write(131);
            k(byteArrayOutputStream, Integer.valueOf(((EnumC0428y) obj).f6224a));
        } else if (obj instanceof U) {
            byteArrayOutputStream.write(132);
            k(byteArrayOutputStream, Integer.valueOf(((U) obj).f6111a));
        } else if (!(obj instanceof EnumC0427x)) {
            super.k(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(133);
            k(byteArrayOutputStream, Integer.valueOf(((EnumC0427x) obj).f6220a));
        }
    }
}
