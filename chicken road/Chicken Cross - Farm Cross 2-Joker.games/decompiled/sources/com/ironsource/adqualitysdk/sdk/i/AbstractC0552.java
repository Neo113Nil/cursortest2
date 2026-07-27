package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ԇ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0552 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Set f1251;

    static {
        StringFog.decrypt("dn/D9OOsM79Ied7E6A==\n", "Fxuyq4rCWss=\n");
        StringFog.decrypt("fxYqn+pXNXx5HiGC6lA/ZG8Z\n", "CndO7LUkUA8=\n");
        StringFog.decrypt("LRawLITn+rk2FIEqmOvRlicesCWf5Q==\n", "RHHeQ/aCpck=\n");
        f1251 = Collections.unmodifiableSet(new HashSet(Arrays.asList(StringFog.decrypt("VTStLS6pFflrMrAdJQ==\n", "NFDcckfHfI0=\n"), StringFog.decrypt("vrtSC/9ieWe4s1kW/2Vzf660\n", "y9o2eKARHBQ=\n"))));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m5520(AbstractMap abstractMap, String str) {
        if (abstractMap.containsKey(str)) {
            return false;
        }
        int size = abstractMap.size();
        Iterator it = f1251.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (abstractMap.containsKey((String) it.next())) {
                i++;
            }
        }
        return size >= i + 5;
    }
}
