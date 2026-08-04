package R5;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: R5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
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
            int iLongValue = (int) l7.longValue();
            r.f6204b.getClass();
            r[] rVarArrValues = r.values();
            int length = rVarArrValues.length;
            while (i7 < length) {
                r rVar = rVarArrValues[i7];
                if (rVar.f6210a == iLongValue) {
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
            int iLongValue2 = (int) l8.longValue();
            EnumC0414j.f6179b.getClass();
            EnumC0414j[] enumC0414jArrValues = EnumC0414j.values();
            int length2 = enumC0414jArrValues.length;
            while (i7 < length2) {
                EnumC0414j enumC0414j = enumC0414jArrValues[i7];
                if (enumC0414j.f6187a == iLongValue2) {
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
            int iLongValue3 = (int) l9.longValue();
            EnumC0428y.f6221b.getClass();
            EnumC0428y[] enumC0428yArrValues = EnumC0428y.values();
            int length3 = enumC0428yArrValues.length;
            while (i7 < length3) {
                EnumC0428y enumC0428y = enumC0428yArrValues[i7];
                if (enumC0428y.f6224a == iLongValue3) {
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
            int iLongValue4 = (int) l10.longValue();
            U.f6103b.getClass();
            U[] uArrValues = U.values();
            int length4 = uArrValues.length;
            while (i7 < length4) {
                U u4 = uArrValues[i7];
                if (u4.f6111a == iLongValue4) {
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
        int iLongValue5 = (int) l11.longValue();
        EnumC0427x.f6218b.getClass();
        EnumC0427x[] enumC0427xArrValues = EnumC0427x.values();
        int length5 = enumC0427xArrValues.length;
        while (i7 < length5) {
            EnumC0427x enumC0427x = enumC0427xArrValues[i7];
            if (enumC0427x.f6220a == iLongValue5) {
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
