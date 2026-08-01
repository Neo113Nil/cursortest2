package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮂ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1174 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3356 = StringFog.decrypt("6eWwrY+6nuzI47+6\n", "pofayOzO2IU=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap f3355 = new HashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0388 m5903(Object obj, C1211 c1211, int i, C1303 c1303) {
        Field[] fieldArr;
        if (i != c1211.f3413.f3419.f3494 && obj != null && !c1211.f3411.contains(obj) && (i <= 0 || !(obj instanceof Activity))) {
            c1211.f3411.add(obj);
            try {
                Q q = c1211.f3413.f3417;
                if (q != null) {
                    C0929 c0929 = C0391.m5393().f503;
                    fieldArr = C0929.m5736(obj.getClass(), true, -1, q.f127);
                } else {
                    Class<?> cls = obj.getClass();
                    C1215 c1215 = c1211.f3413;
                    int i2 = C1215.m5924(i, c1215.f3419.f3492) ? c1215.f3419.f3491 : 0;
                    Field[] declaredFields = cls.getDeclaredFields();
                    for (int i3 = 0; cls != null && i3 != i2; i3++) {
                        cls = cls.getSuperclass();
                        if (cls != null) {
                            Field[] declaredFields2 = cls.getDeclaredFields();
                            String str = AbstractC0940.f2644;
                            int length = declaredFields.length;
                            int length2 = declaredFields2.length;
                            Field[] fieldArr2 = new Field[length + length2];
                            System.arraycopy(declaredFields, 0, fieldArr2, 0, length);
                            System.arraycopy(declaredFields2, 0, fieldArr2, length, length2);
                            declaredFields = fieldArr2;
                        }
                    }
                    fieldArr = declaredFields;
                }
                C0920 c0920 = c1211.f3412;
                for (Field field : fieldArr) {
                    field.setAccessible(true);
                    ((List) c0920.f2564.get(c0920.f2563)).add(field);
                    InterfaceC0388 m5902 = m5902(new C1303(field, obj, c1303), c1211, i);
                    if (m5902 != null && !c1211.f3410) {
                        return m5902;
                    }
                    ((List) c0920.f2564.get(c0920.f2563)).remove(field);
                }
            } catch (Throwable th) {
                String str2 = this.f3356;
                AbstractC0544.m5511(str2, str2, StringFog.decrypt("qWY6k1LQPV6YYCGSR9AVWYZxK4hmmT9XiA==\n", "7BRI/CDwWjs=\n"), th, null, false);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:35:0x0051, B:37:0x0055, B:14:0x0089, B:15:0x008d, B:17:0x0093, B:19:0x00a5, B:21:0x00b4, B:22:0x00b0, B:27:0x00be, B:38:0x005e, B:40:0x0062, B:41:0x006b, B:43:0x0075), top: B:34:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0045 A[SYNTHETIC] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0388 m5901(InterfaceC0388 interfaceC0388, C0920 c0920, int i) {
        C1303 c1303;
        Object obj;
        if (i >= c0920.f2564.size()) {
            return interfaceC0388;
        }
        List<Field> list = (List) c0920.f2564.get(i);
        C1303 c13032 = (C1303) interfaceC0388;
        Object m5943 = c13032.m5943();
        ArrayList m5900 = m5900(m5943, true, true, true);
        if (m5900 == null) {
            AbstractC0544.m5502(this.f3356, StringFog.decrypt("0B2897iCMkm1JqP+t5M0WfwKorK0hHdg9BXgsqmTNEj8E6n2+w==\n", "lWXMktv2Vy0=\n") + m5943.getClass());
            return null;
        }
        Iterator it = m5900.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (m5943 != null) {
                try {
                    if (m5943 instanceof Collection) {
                        c1303 = new C1303((Collection) m5943, next, c13032);
                    } else if (m5943 instanceof Map) {
                        c1303 = new C1303((Map) m5943, next, c13032);
                    } else if (m5943.getClass().isArray()) {
                        c1303 = new C1303(new ArrayList(Arrays.asList(m5943)), next, c13032);
                    }
                    for (Field field : list) {
                        if (WeakReference.class.isAssignableFrom(field.getType())) {
                            obj = ((WeakReference) field.get(next)).get();
                        } else {
                            obj = field.get(next);
                        }
                        C1303 c13033 = new C1303(field, next, c1303);
                        next = obj;
                        c1303 = c13033;
                    }
                } catch (Exception unused) {
                    continue;
                }
                if (c1303 == null) {
                    return m5901(c1303, c0920, i + 1);
                }
                continue;
            }
            c1303 = null;
            while (r7.hasNext()) {
            }
            if (c1303 == null) {
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0388 m5904(Object obj, C1215 c1215) {
        InterfaceC0388 interfaceC0388;
        boolean z;
        Object obj2;
        long currentTimeMillis = System.currentTimeMillis();
        Class<?> cls = obj.getClass();
        C1227 c1227 = c1215.f3419;
        c1227.f3498 = cls;
        C0920 c0920 = (C0920) this.f3355.get(c1227);
        if (c0920 != null) {
            try {
                Object obj3 = obj;
                C1303 c1303 = null;
                for (Field field : (List) c0920.f2564.get(0)) {
                    if (WeakReference.class.isAssignableFrom(field.getType())) {
                        obj2 = ((WeakReference) field.get(obj3)).get();
                    } else {
                        obj2 = field.get(obj3);
                    }
                    C1303 c13032 = new C1303(field, obj3, c1303);
                    obj3 = obj2;
                    c1303 = c13032;
                }
                interfaceC0388 = m5901(c1303, c0920, 1);
            } catch (Exception e) {
                String str = this.f3356;
                AbstractC0544.m5511(str, str, StringFog.decrypt("zj/DvZt+QDb/Odi8jn5oMeEo0qavN0I/723XoIYzByPqOdk=\n", "i02x0uleJ1M=\n"), e, null, false);
                interfaceC0388 = null;
            }
            if (interfaceC0388 != null) {
                try {
                    z = c1215.f3418.mo5322(interfaceC0388);
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    m5905(interfaceC0388, obj, AbstractC1257.m5940("mtk=\n", "96pnnD3I1lQ=\n", new StringBuilder().append(StringFog.decrypt("YDp/4iJyETVpOCr8JyYfZ287Kg==\n", "BlUKjEZSd0c=\n")).append(System.currentTimeMillis() - currentTimeMillis)));
                    return interfaceC0388;
                }
            }
            AbstractC0544.m5502(this.f3356, obj + StringFog.decrypt("hOnXhaTFjKTXutQ=\n", "vsmn5NCtrMk=\n"));
            this.f3355.remove(c1227);
        }
        C1211 c1211 = new C1211(c1215);
        InterfaceC0388 m5903 = m5903(obj, c1211, 0, (C1303) null);
        if (m5903 != null) {
            m5905(m5903, obj, AbstractC1257.m5940("04z/zVldNZnTivOHT1s1\n", "8+Odpzw+Qeo=\n", new StringBuilder().append(StringFog.decrypt("tzzVpveH68Dx\n", "0VOgyJOngq4=\n")).append(System.currentTimeMillis() - currentTimeMillis).append(StringFog.decrypt("4fTMKg==\n", "jIfgCilNsJM=\n")).append(c1211.f3411.size())));
            this.f3355.put(c1227, c1211.f3412);
            return m5903;
        }
        m5905((InterfaceC0388) null, obj, AbstractC1257.m5940("H+kc+aupHzIf7xCzva8f\n", "P4Z+k87Ka0E=\n", new StringBuilder().append(StringFog.decrypt("3PjAukTYUlTWt930Ag==\n", "spe0miK3Jzo=\n")).append(System.currentTimeMillis() - currentTimeMillis).append(StringFog.decrypt("SlD9/A==\n", "JyPR3HMlT7c=\n")).append(c1211.f3411.size())));
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0388 m5902(C1303 c1303, C1211 c1211, int i) {
        C1303 c13032;
        boolean z;
        Object m5943 = c1303.m5943();
        if (c1211.f3411.contains(m5943) || c1211.f3409.contains(m5943)) {
            return null;
        }
        if (C1215.m5924(i, c1211.f3413.f3419.f3493)) {
            try {
                z = c1211.f3413.f3418.mo5322(c1303);
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                if (c1211.f3410) {
                    c1211.f3408.add(c1303);
                    c1211.f3409.add(m5943);
                }
                return c1303;
            }
        }
        if (m5943 instanceof WeakReference) {
            WeakReference weakReference = (WeakReference) m5943;
            if (weakReference.get() != null && C1215.m5924(i, c1211.f3413.f3419.f3490)) {
                Object obj = weakReference.get();
                if (obj != null ? AbstractC0940.m5781(obj.getClass(), c1211.f3413.f3419.f3495) : false) {
                    return m5903(weakReference.get(), c1211, i + 1, c1303);
                }
            }
        }
        if (m5943 != null ? AbstractC0940.m5781(m5943.getClass(), c1211.f3413.f3419.f3495) : false) {
            return m5903(m5943, c1211, i + 1, c1303);
        }
        if (c1211.f3413.f3419.f3486 && m5943 != null) {
            c1211.f3411.add(m5943);
        }
        C1215 c1215 = c1211.f3413;
        ArrayList m5900 = m5900(m5943, C1215.m5924(i, c1215.f3419.f3489), C1215.m5924(i, c1215.f3419.f3488), C1215.m5924(i, c1215.f3419.f3487));
        C0920 c0920 = c1211.f3412;
        if (m5900 == null) {
            return null;
        }
        InterfaceC0388 interfaceC0388 = null;
        for (Object obj2 : m5900) {
            if (m5943 != null) {
                if (m5943 instanceof Collection) {
                    c13032 = new C1303((Collection) m5943, obj2, c1303);
                } else if (m5943 instanceof Map) {
                    c13032 = new C1303((Map) m5943, obj2, c1303);
                } else if (m5943.getClass().isArray()) {
                    c13032 = new C1303(new ArrayList(Arrays.asList(m5943)), obj2, c1303);
                }
                int i2 = c0920.f2563 + 1;
                c0920.f2563 = i2;
                c0920.f2564.add(i2, new ArrayList());
                interfaceC0388 = m5902(c13032, c1211, i);
                if (interfaceC0388 == null && !c1211.f3410) {
                    return interfaceC0388;
                }
                c0920.f2564.remove(c0920.f2563);
                c0920.f2563--;
            }
            c13032 = null;
            int i22 = c0920.f2563 + 1;
            c0920.f2563 = i22;
            c0920.f2564.add(i22, new ArrayList());
            interfaceC0388 = m5902(c13032, c1211, i);
            if (interfaceC0388 == null) {
            }
            c0920.f2564.remove(c0920.f2563);
            c0920.f2563--;
        }
        return interfaceC0388;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m5900(Object obj, boolean z, boolean z2, boolean z3) {
        if (obj != null) {
            if ((obj instanceof Collection) && z) {
                return new ArrayList((Collection) obj);
            }
            if (obj.getClass().isArray() && z3) {
                return new ArrayList(Arrays.asList(obj));
            }
            if ((obj instanceof Map) && z2) {
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                arrayList.addAll(map.keySet());
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5899(Object obj, Class cls, String str) {
        if (cls == null || cls.equals(Object.class)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Field field : cls.getDeclaredFields()) {
            if (field.getType().equals(String.class)) {
                arrayList.add(field);
            }
        }
        for (Field field2 : (Field[]) arrayList.toArray(new Field[0])) {
            field2.setAccessible(true);
            try {
                String str2 = (String) field2.get(obj);
                if (str2 != null && Pattern.compile(str).matcher(str2).matches()) {
                    return str2;
                }
            } catch (Exception unused) {
            }
        }
        return m5899(obj, cls.getSuperclass(), str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5905(InterfaceC0388 interfaceC0388, Object obj, String str) {
        if (interfaceC0388 != null) {
            AbstractC0544.m5503(this.f3356, AbstractC1196.m5920("Kqk=\n", "EImdMPVUphk=\n", new StringBuilder().append(obj), str).append(StringFog.decrypt("n9ZuPjFpeTs=\n", "s/YYX10cHBs=\n")).append(((C1303) interfaceC0388).m5943()).toString());
        } else {
            AbstractC0544.m5503(this.f3356, obj + StringFog.decrypt("dfs=\n", "T9tE1g+3QkE=\n") + str);
        }
    }
}
