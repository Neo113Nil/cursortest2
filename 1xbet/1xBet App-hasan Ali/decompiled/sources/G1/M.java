package G1;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final K f1871a = new K(1, false);

    /* renamed from: b, reason: collision with root package name */
    public static final K f1872b = new K(2, false);

    /* renamed from: c, reason: collision with root package name */
    public static final K f1873c = new K(0, false);

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public abstract Object c(String str);

    public Object d(String str, Object obj) {
        return c(str);
    }

    public abstract void e(Bundle bundle, String str, Object obj);

    public boolean f(Object obj, Object obj2) {
        return kotlin.jvm.internal.l.a(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
