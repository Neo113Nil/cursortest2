package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.氵, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1129 extends AbstractC0599 {
    static {
        StringFog.decrypt("g29Ohx8eHDu3fkioGAs=\n", "5Ao6wXZsb08=\n");
        StringFog.decrypt("JS4KuRlPko4nLgywKU+nqTM1A7wIWA==\n", "Rlxv2G0qwes=\n");
        StringFog.decrypt("9ypK8ivv+/3k\n", "kE8+vUmFnp4=\n");
        StringFog.decrypt("WUW1yJ0+I/ZKUw==\n", "PiDBh/9URpU=\n");
        StringFog.decrypt("Nqt9bklPSugliGBER0E=\n", "Uc4JISslL4s=\n");
        StringFog.decrypt("LLUzlfTcMjw/hia249M=\n", "S9BH2pa2V18=\n");
        StringFog.decrypt("gel2koQ+M/KSymu4ijAl\n", "5owC3eZUVpE=\n");
        StringFog.decrypt("6lkauWw7QIf5ag+aezRW\n", "jTxu9g5RJeQ=\n");
        StringFog.decrypt("G02zPc5ZgZI4Tb8t22uBhRVGug==\n", "fCjdWLw49fc=\n");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static ArrayList m5882(ArrayList arrayList) {
        Object m5554;
        C0956 c0956;
        Class<?> cls;
        int size = arrayList.size();
        Class<?> cls2 = null;
        cls2 = null;
        Object m55542 = null;
        if (size == 2) {
            if (arrayList.get(0) instanceof Class) {
                cls2 = (Class) AbstractC0599.m5554(arrayList, 0, Class.class);
                m5554 = null;
            } else {
                m5554 = AbstractC0599.m5554(arrayList, 0, Object.class);
                if (m5554 != null) {
                    cls2 = m5554.getClass();
                }
            }
            c0956 = (C0956) AbstractC0599.m5554(arrayList, 1, C0956.class);
        } else if (size != 3) {
            c0956 = null;
            m5554 = null;
        } else {
            if (arrayList.get(0) instanceof Class) {
                cls = (Class) AbstractC0599.m5554(arrayList, 0, Class.class);
                if (arrayList.get(1) instanceof C0956) {
                    c0956 = (C0956) AbstractC0599.m5554(arrayList, 1, C0956.class);
                } else {
                    m55542 = AbstractC0599.m5554(arrayList, 1, Object.class);
                    c0956 = (C0956) AbstractC0599.m5554(arrayList, 2, C0956.class);
                }
            } else {
                m55542 = AbstractC0599.m5554(arrayList, 0, Object.class);
                cls = m55542.getClass();
                c0956 = (C0956) AbstractC0599.m5554(arrayList, 1, C0956.class);
            }
            Object obj = m55542;
            cls2 = cls;
            m5554 = obj;
        }
        C1174 c1174 = C0391.m5393().f502;
        c1174.getClass();
        ArrayList arrayList2 = new ArrayList();
        try {
            C0929 c0929 = C0391.m5393().f503;
            ArrayList arrayList3 = new ArrayList();
            c0929.m5739(cls2, c0956, arrayList3);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Field) it.next()).get(m5554));
            }
        } catch (Throwable unused) {
            AbstractC0544.m5502(c1174.f3356, StringFog.decrypt("NN6wgE23DeAF2KuBWLc=\n", "cazC7z+XaoU=\n") + c0956.f2666 + StringFog.decrypt("kyFglZNJNzncODk=\n", "s1UZ5fZpUUs=\n") + cls2 + StringFog.decrypt("FCeyHkYI\n", "NETefzV7HUE=\n"));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #0 {all -> 0x00d6, blocks: (B:10:0x00c3, B:12:0x00cf), top: B:9:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m5883(ArrayList arrayList) {
        Object obj;
        Class<?> cls;
        Object obj2;
        C0956 c0956;
        Object obj3;
        C1174 c1174;
        int size = arrayList.size();
        try {
            if (size != 2) {
                if (size != 3) {
                    if (size != 4) {
                        obj3 = null;
                        cls = null;
                        obj2 = null;
                        c0956 = null;
                    } else {
                        cls = (Class) AbstractC0599.m5554(arrayList, 0, Class.class);
                        obj2 = AbstractC0599.m5554(arrayList, 1, Object.class);
                        c0956 = (C0956) AbstractC0599.m5554(arrayList, 2, C0956.class);
                        obj3 = AbstractC0599.m5554(arrayList, 3, Object.class);
                    }
                } else if (arrayList.get(0) instanceof Class) {
                    cls = (Class) AbstractC0599.m5554(arrayList, 0, Class.class);
                    if (arrayList.get(1) instanceof C0956) {
                        c0956 = (C0956) AbstractC0599.m5554(arrayList, 1, C0956.class);
                        obj3 = AbstractC0599.m5554(arrayList, 2, Object.class);
                        obj2 = null;
                    } else {
                        obj2 = AbstractC0599.m5554(arrayList, 1, Object.class);
                        c0956 = (C0956) AbstractC0599.m5554(arrayList, 2, C0956.class);
                    }
                } else {
                    Object m5554 = AbstractC0599.m5554(arrayList, 0, Object.class);
                    Class<?> cls2 = m5554.getClass();
                    C0956 c09562 = (C0956) AbstractC0599.m5554(arrayList, 1, C0956.class);
                    obj3 = AbstractC0599.m5554(arrayList, 2, Object.class);
                    obj2 = m5554;
                    cls = cls2;
                    c0956 = c09562;
                }
                c1174 = C0391.m5393().f502;
                c1174.getClass();
                Field m5737 = C0391.m5393().f503.m5737(cls, c0956);
                return m5737 == null ? m5737.get(obj2) : obj3;
            }
            if (arrayList.get(0) instanceof Class) {
                cls = (Class) AbstractC0599.m5554(arrayList, 0, Class.class);
                obj = null;
            } else {
                Object m55542 = AbstractC0599.m5554(arrayList, 0, Object.class);
                if (m55542 != null) {
                    obj = m55542;
                    cls = m55542.getClass();
                } else {
                    obj = m55542;
                    cls = null;
                }
            }
            obj2 = obj;
            c0956 = (C0956) AbstractC0599.m5554(arrayList, 1, C0956.class);
            Field m57372 = C0391.m5393().f503.m5737(cls, c0956);
            if (m57372 == null) {
            }
        } catch (Throwable unused) {
            AbstractC0544.m5502(c1174.f3356, StringFog.decrypt("ikizcSNyL0y7TqhwNnI=\n", "zzrBHlFSSCk=\n") + c0956.f2666 + StringFog.decrypt("41PN1TnR7gOsSpQ=\n", "wye0pVzxiHE=\n") + cls + StringFog.decrypt("IZNuQN6l\n", "AfACIa3WbQc=\n"));
            return null;
        }
        obj3 = null;
        c1174 = C0391.m5393().f502;
        c1174.getClass();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static ArrayList m5885(C1226 c1226, C1074 c1074, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = m5889(c1226, c1074, arrayList).iterator();
        while (it.hasNext()) {
            InterfaceC0388 interfaceC0388 = (InterfaceC0388) it.next();
            if (interfaceC0388 != null) {
                arrayList2.add(((C1303) interfaceC0388).m5943());
            }
        }
        return arrayList2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Object m5886(C1226 c1226, C1074 c1074, ArrayList arrayList) {
        InterfaceC0388 interfaceC0388;
        Object m5554 = AbstractC0599.m5554(arrayList, 0, Object.class);
        C1261 c1261 = (C1261) AbstractC0599.m5554(arrayList, 1, C1261.class);
        List m5555 = AbstractC0599.m5555(arrayList, 2);
        if (c1261 != null) {
            interfaceC0388 = C0391.m5393().f502.m5904(m5554, c1261.f3566.m5939(new C1162(c1261, c1074, c1226, m5555), null, c1261.f3564, c1261.f3563));
        } else {
            interfaceC0388 = null;
        }
        if (interfaceC0388 != null) {
            return ((C1303) interfaceC0388).m5943();
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C1301 m5888(ArrayList arrayList) {
        return new C1301((List) AbstractC0599.m5554(arrayList, 0, List.class), ((Integer) AbstractC0599.m5554(arrayList, 1, Integer.class)).intValue());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m5889(C1226 c1226, C1074 c1074, ArrayList arrayList) {
        Object m5554 = AbstractC0599.m5554(arrayList, 0, Object.class);
        C1261 c1261 = (C1261) AbstractC0599.m5554(arrayList, 1, C1261.class);
        List m5555 = AbstractC0599.m5555(arrayList, 2);
        if (c1261 == null) {
            return null;
        }
        C1215 m5939 = c1261.f3566.m5939(new C1130(c1261, c1074, c1226, m5555), null, c1261.f3564, c1261.f3563);
        C1174 c1174 = C0391.m5393().f502;
        c1174.getClass();
        C1211 c1211 = new C1211(m5939);
        c1211.f3410 = true;
        c1174.m5903(m5554, c1211, 0, (C1303) null);
        return new ArrayList(c1211.f3408);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m5884(ArrayList arrayList) {
        int i = 0;
        if (arrayList.get(0) instanceof Class) {
            Class cls = (Class) AbstractC0599.m5554(arrayList, 0, Class.class);
            String str = (String) AbstractC0599.m5554(arrayList, 1, String.class);
            C0391.m5393().f502.getClass();
            return C1174.m5899((Object) null, cls, str);
        }
        Object m5554 = AbstractC0599.m5554(arrayList, 0, Object.class);
        if (arrayList.get(1) instanceof List) {
            JSONArray jSONArray = new JSONArray((Collection) AbstractC0599.m5554(arrayList, 1, List.class));
            C0391.m5393().f502.getClass();
            while (i < jSONArray.length()) {
                String m5899 = C1174.m5899(m5554, m5554.getClass(), jSONArray.optString(i));
                if (m5899 != null) {
                    return m5899;
                }
                i++;
            }
            return null;
        }
        if (arrayList.get(1) instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) AbstractC0599.m5554(arrayList, 1, JSONArray.class);
            C0391.m5393().f502.getClass();
            if (jSONArray2 == null) {
                return null;
            }
            while (i < jSONArray2.length()) {
                String m58992 = C1174.m5899(m5554, m5554.getClass(), jSONArray2.optString(i));
                if (m58992 != null) {
                    return m58992;
                }
                i++;
            }
            return null;
        }
        String str2 = (String) AbstractC0599.m5554(arrayList, 1, String.class);
        C0391.m5393().f502.getClass();
        return C1174.m5899(m5554, m5554.getClass(), str2);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String m5887(ArrayList arrayList) {
        Object m5554 = AbstractC0599.m5554(arrayList, 0, Object.class);
        List list = (List) AbstractC0599.m5554(arrayList, 1, List.class);
        int intValue = ((Integer) AbstractC0599.m5554(arrayList, 2, Integer.class)).intValue();
        C0391.m5393().f502.getClass();
        return new C0551(list, intValue).m5517(m5554);
    }
}
