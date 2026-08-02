package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5376w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5369o {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C5369o f42595b;

    /* renamed from: c, reason: collision with root package name */
    static final C5369o f42596c = new C5369o(0);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, AbstractC5376w.e<?, ?>> f42597a;

    /* renamed from: androidx.datastore.preferences.protobuf.o$a */
    /* loaded from: classes8.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Q f42598a;

        /* renamed from: b, reason: collision with root package name */
        private final int f42599b;

        a(int i11, Q q11) {
            this.f42598a = q11;
            this.f42599b = i11;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f42598a == aVar.f42598a && this.f42599b == aVar.f42599b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f42598a) * 65535) + this.f42599b;
        }
    }

    C5369o() {
        this.f42597a = new HashMap();
    }

    public static C5369o b() {
        C5369o c5369o;
        int i11 = c0.f42503d;
        C5369o c5369o2 = f42595b;
        if (c5369o2 != null) {
            return c5369o2;
        }
        synchronized (C5369o.class) {
            try {
                c5369o = f42595b;
                if (c5369o == null) {
                    Class<?> cls = C5368n.f42588a;
                    C5369o c5369o3 = null;
                    if (cls != null) {
                        try {
                            c5369o3 = (C5369o) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c5369o = c5369o3 != null ? c5369o3 : f42596c;
                    f42595b = c5369o;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5369o;
    }

    public final AbstractC5376w.e a(int i11, Q q11) {
        return this.f42597a.get(new a(i11, q11));
    }

    C5369o(int i11) {
        this.f42597a = Collections.EMPTY_MAP;
    }
}
