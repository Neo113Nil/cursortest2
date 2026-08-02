package com.google.crypto.tink.shaded.protobuf;

import W5.AbstractC0486a1;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class N {
    public static void a(Object obj) {
        AbstractC0486a1.n(obj);
        throw null;
    }

    public static void b(Object obj, Object obj2) {
        M m7 = (M) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (m7.isEmpty()) {
            return;
        }
        Iterator it = m7.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static boolean c(Object obj) {
        return !((M) obj).f11724a;
    }

    public static M d(Object obj, Object obj2) {
        M m7 = (M) obj;
        M m8 = (M) obj2;
        if (!m8.isEmpty()) {
            if (!m7.f11724a) {
                m7 = m7.c();
            }
            m7.b();
            if (!m8.isEmpty()) {
                m7.putAll(m8);
            }
        }
        return m7;
    }

    public static M e() {
        return M.f11723b.c();
    }

    public static void f(Object obj) {
        ((M) obj).f11724a = false;
    }
}
