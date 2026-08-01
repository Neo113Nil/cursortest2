package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴢ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0929 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public ArrayList f2579;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public C0956 f2580;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public C0930 f2581;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Field m5738(Class cls, Class cls2) {
        Field m5737;
        synchronized (AbstractC0494.class) {
            if (this.f2580 == null) {
                this.f2580 = new C0956();
            }
            C0956 c0956 = this.f2580;
            c0956.f2666 = cls2;
            m5737 = m5737(cls, c0956);
        }
        return m5737;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Field m5737(Class cls, C0956 c0956) {
        synchronized (AbstractC0494.class) {
            if (this.f2579 == null) {
                this.f2579 = new ArrayList();
            }
            this.f2579.clear();
            m5739(cls, c0956, this.f2579);
            if (this.f2579.isEmpty()) {
                return null;
            }
            return (Field) this.f2579.get(0);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5739(Class cls, C0956 c0956, ArrayList arrayList) {
        synchronized (C0929.class) {
            if (this.f2581 == null) {
                this.f2581 = new C0930();
            }
            C0930 c0930 = this.f2581;
            c0930.f2583 = c0956;
            c0930.f2582 = c0956.f2665;
            m5735(cls, c0930, arrayList);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field[] m5736(Class cls, boolean z, int i, List list) {
        while (cls != null && !AbstractC0940.m5781(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArr = new Field[0];
        if (cls != null) {
            Field[] fieldArr2 = new Field[0];
            Field[] fieldArr3 = new Field[0];
            try {
                fieldArr2 = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fieldArr3 = cls.getFields();
            } catch (Error unused2) {
            }
            String str = AbstractC0940.f2644;
            int length = fieldArr2.length;
            int length2 = fieldArr3.length;
            Field[] fieldArr4 = new Field[length + length2];
            System.arraycopy(fieldArr2, 0, fieldArr4, 0, length);
            System.arraycopy(fieldArr3, 0, fieldArr4, length, length2);
            if (!z) {
                return fieldArr4;
            }
            Class superclass = cls.getSuperclass();
            fieldArr = fieldArr4;
            for (int i2 = 0; superclass != null && i2 != i; i2++) {
                try {
                    Field[] declaredFields = superclass.getDeclaredFields();
                    int length3 = fieldArr.length;
                    int length4 = declaredFields.length;
                    Field[] fieldArr5 = new Field[length3 + length4];
                    System.arraycopy(fieldArr, 0, fieldArr5, 0, length3);
                    System.arraycopy(declaredFields, 0, fieldArr5, length3, length4);
                    fieldArr = fieldArr5;
                } catch (Error unused3) {
                }
                try {
                    Field[] fields = superclass.getFields();
                    int length5 = fieldArr.length;
                    int length6 = fields.length;
                    Field[] fieldArr6 = new Field[length5 + length6];
                    System.arraycopy(fieldArr, 0, fieldArr6, 0, length5);
                    System.arraycopy(fields, 0, fieldArr6, length5, length6);
                    fieldArr = fieldArr6;
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArr;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5735(Class cls, C0930 c0930, ArrayList arrayList) {
        Field[] fields;
        boolean isAssignableFrom;
        boolean z;
        C0956 c0956 = c0930.f2583;
        if (c0956 != null && (z = c0956.f1239)) {
            fields = m5736(cls, z, c0956.f1238, null);
        } else {
            try {
                fields = cls.getDeclaredFields();
            } catch (Error unused) {
                fields = cls.getFields();
            }
        }
        for (Field field : fields) {
            if (c0930.f2583 != null) {
                int modifiers = field.getModifiers();
                int i = c0930.f2583.f1237;
                if ((modifiers & i) == i) {
                    int modifiers2 = field.getModifiers();
                    C0956 c09562 = c0930.f2583;
                    if ((modifiers2 & c09562.f1236) == 0 && !c09562.f2663.contains(field.getType())) {
                        C0956 c09563 = c0930.f2583;
                        if (c09563.f2664) {
                            isAssignableFrom = field.getType().equals(c0930.f2583.f2666);
                        } else {
                            isAssignableFrom = c09563.f2666.isAssignableFrom(field.getType());
                        }
                        if (isAssignableFrom) {
                            int i2 = c0930.f2582;
                            if (i2 != 0) {
                                c0930.f2582 = i2 - 1;
                            } else {
                                field.setAccessible(true);
                                arrayList.add(field);
                            }
                        }
                    }
                }
            }
        }
    }
}
