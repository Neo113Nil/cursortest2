package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.τ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0483 extends AbstractC0599 {
    static {
        StringFog.decrypt("zfx+saVSOO/O\n", "qpkK/MAmUIA=\n");
        StringFog.decrypt("l1Zs5V8nvjGUQA==\n", "8DMYqDpT1l4=\n");
        StringFog.decrypt("tzHbId5YrTigK9Ek7liGH6Eq0iTPTw==\n", "1EO+QKo94F0=\n");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static ArrayList m5470(ArrayList arrayList) {
        C0584 c0584 = (C0584) AbstractC0599.m5554(arrayList, 1, C0584.class);
        return arrayList.get(0) instanceof Class ? AbstractC0577.m5534((Class) AbstractC0599.m5554(arrayList, 0, Class.class), c0584) : AbstractC0577.m5534(AbstractC0599.m5554(arrayList, 0, Object.class).getClass(), c0584);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m5472(ArrayList arrayList) {
        C0584 c0584 = (C0584) AbstractC0599.m5554(arrayList, 1, C0584.class);
        if (arrayList.get(0) instanceof Class) {
            ArrayList m5534 = AbstractC0577.m5534((Class) AbstractC0599.m5554(arrayList, 0, Class.class), c0584);
            if (m5534.isEmpty()) {
                return null;
            }
            return (Method) m5534.get(0);
        }
        ArrayList m55342 = AbstractC0577.m5534(AbstractC0599.m5554(arrayList, 0, Object.class).getClass(), c0584);
        if (m55342.isEmpty()) {
            return null;
        }
        return (Method) m55342.get(0);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0600 m5471() {
        return new C0600();
    }
}
