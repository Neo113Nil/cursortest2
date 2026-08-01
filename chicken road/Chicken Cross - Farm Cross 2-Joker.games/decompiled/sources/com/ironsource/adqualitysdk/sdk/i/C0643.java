package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ە, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0643 extends AbstractC0599 {
    static {
        StringFog.decrypt("jAEa\n", "4mRtGXKLm7k=\n");
        StringFog.decrypt("JLyU1A==\n", "R9T1pmKqZ7A=\n");
        StringFog.decrypt("kdOtxlhMRCOV\n", "8KHfpyEYPVM=\n");
        StringFog.decrypt("oXP1QgLp3QW9XPpTCfLx\n", "zhGfJ2GdlWQ=\n");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static char m5598(ArrayList arrayList) {
        return (char) ((Number) AbstractC0599.m5554(arrayList, 0, Number.class)).intValue();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m5599(ArrayList arrayList) {
        return AbstractC0940.m5780(AbstractC0599.m5554(arrayList, 0, Object.class), (String) AbstractC0599.m5554(arrayList, 1, String.class), (List) AbstractC0599.m5554(arrayList, 2, List.class)) != null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m5601(C1226 c1226, ArrayList arrayList) {
        Constructor<?> constructor;
        int i = 0;
        Class cls = (Class) AbstractC0599.m5554(arrayList, 0, Class.class);
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 1) {
            arrayList2 = (List) AbstractC0599.m5554(arrayList, 1, List.class);
        }
        List list = arrayList.size() > 2 ? (List) AbstractC0599.m5554(arrayList, 2, List.class) : null;
        try {
            if (list != null) {
                Class<?>[] clsArr = new Class[list.size()];
                list.toArray(clsArr);
                String str = AbstractC0940.f2644;
                return cls.getConstructor(clsArr).newInstance(arrayList2.toArray());
            }
            String str2 = AbstractC0940.f2644;
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == arrayList2.size() && AbstractC0940.m5782(constructor.getParameterTypes(), arrayList2)) {
                    break;
                }
                i++;
            }
            return constructor.newInstance(arrayList2.toArray());
        } catch (Exception e) {
            AbstractC1086.m5875(c1226.f3477.f2812.f3104, StringFog.decrypt("KPiCVqLBwZII64RQvoaCjgj90A==\n", "bYrwOdDhouA=\n") + cls.getName() + StringFog.decrypt("M/bAsF9VYLR08ok=\n", "E4GpxDd1AcY=\n") + arrayList2 + (list != null ? StringFog.decrypt("kz5fFMaqwsnALFQDxg==\n", "s18xcObJrqg=\n") + list : ""), e, null);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Class m5600(ArrayList arrayList) {
        return Array.newInstance((Class<?>) AbstractC0599.m5554(arrayList, 0, Class.class), 0).getClass();
    }
}
