package sg.bigo.ads.c;

import java.lang.reflect.Method;
import sg.bigo.ads.a.AbstractC5015a;

/* renamed from: sg.bigo.ads.c.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5047m {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f12699a;
    public static final Method b;

    static {
        try {
            Class<?> cls = Class.forName(AbstractC5015a.p0);
            String str = AbstractC5015a.q0;
            f12699a = cls.getMethod(str, String.class);
            b = cls.getMethod(str, String.class, String.class);
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        try {
            Method method = f12699a;
            return method != null ? (String) method.invoke(null, str) : "";
        } catch (Throwable unused) {
            return "";
        }
    }
}
