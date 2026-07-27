package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴈ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0916 extends AbstractC0599 {
    static {
        StringFog.decrypt("O9JLd6UGdOY=\n", "XLc/McxjGII=\n");
        StringFog.decrypt("zMkzFWPvdZPY\n", "q6xHUwqKGfc=\n");
        StringFog.decrypt("rThLjj7rFcKMNFqkM9YA4rMtWg==\n", "yl0/yFeZZrY=\n");
        StringFog.decrypt("KMI6wQHB4hkJzivrDOT4GSf3POIO2uk=\n", "T6dOh2izkW0=\n");
        StringFog.decrypt("Q1AplAgPwo9FTiixGQzGk0lOKJAO\n", "ICJM9XxqhOY=\n");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Field m5720(ArrayList arrayList) {
        Field[] fields;
        Class cls = (Class) AbstractC0599.m5554(arrayList, 0, Class.class);
        String str = (String) AbstractC0599.m5554(arrayList, 1, String.class);
        C0929 c0929 = C0391.m5393().f503;
        synchronized (C0929.class) {
            if (c0929.f2579 == null) {
                c0929.f2579 = new ArrayList();
            }
            c0929.f2579.clear();
            ArrayList arrayList2 = c0929.f2579;
            try {
                fields = cls.getDeclaredFields();
            } catch (Error unused) {
                fields = cls.getFields();
            }
            for (Field field : fields) {
                if (field.getType().getName().toLowerCase().startsWith(str.toLowerCase())) {
                    field.setAccessible(true);
                    arrayList2.add(field);
                }
            }
            if (c0929.f2579.isEmpty()) {
                return null;
            }
            return (Field) c0929.f2579.get(0);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Field m5721(ArrayList arrayList) {
        if (!(arrayList.get(0) instanceof Class)) {
            Object m5554 = AbstractC0599.m5554(arrayList, 0, Object.class);
            return C0391.m5393().f503.m5738(m5554.getClass(), (Class) AbstractC0599.m5554(arrayList, 1, Class.class));
        }
        Class cls = (Class) AbstractC0599.m5554(arrayList, 0, Class.class);
        if (arrayList.get(1) instanceof Class) {
            return C0391.m5393().f503.m5738(cls, (Class) AbstractC0599.m5554(arrayList, 1, Class.class));
        }
        return C0391.m5393().f503.m5737(cls, (C0956) AbstractC0599.m5554(arrayList, 1, C0956.class));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List m5722(ArrayList arrayList) {
        if (!(arrayList.get(0) instanceof Class)) {
            Object m5554 = AbstractC0599.m5554(arrayList, 0, Object.class);
            boolean booleanValue = arrayList.size() > 1 ? ((Boolean) AbstractC0599.m5554(arrayList, 1, Boolean.class)).booleanValue() : false;
            C0929 c0929 = C0391.m5393().f503;
            return Arrays.asList(C0929.m5736(m5554.getClass(), booleanValue, -1, null));
        }
        if (arrayList.size() <= 1) {
            return new ArrayList();
        }
        Class cls = (Class) AbstractC0599.m5554(arrayList, 0, Class.class);
        C0956 c0956 = (C0956) AbstractC0599.m5554(arrayList, 1, C0956.class);
        C0929 c09292 = C0391.m5393().f503;
        ArrayList arrayList2 = new ArrayList();
        c09292.m5739(cls, c0956, arrayList2);
        return arrayList2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field m5724(ArrayList arrayList) {
        return C0391.m5393().f503.m5737((Class) AbstractC0599.m5554(arrayList, 0, Class.class), (C0956) AbstractC0599.m5554(arrayList, 1, C0956.class));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0998 m5723() {
        C0929 c0929 = C0391.m5393().f503;
        return new C0998();
    }
}
