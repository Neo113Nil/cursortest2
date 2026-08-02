package O4;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorC0255a f4138a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0256b f4139b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0256b f4140c;

    static {
        int i = 7;
        int i5 = 6;
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f4138a = null;
            f4139b = new C0256b(i);
            f4140c = new C0256b(i5);
        } else {
            if (!property.equals("Dalvik")) {
                f4138a = null;
                f4139b = new M(1);
                f4140c = new C0258d(i5);
                return;
            }
            f4138a = new ExecutorC0255a();
            if (Build.VERSION.SDK_INT >= 24) {
                f4139b = new M(0);
                f4140c = new C0258d(i5);
            } else {
                f4139b = new C0256b(i);
                f4140c = new C0256b(i5);
            }
        }
    }
}
