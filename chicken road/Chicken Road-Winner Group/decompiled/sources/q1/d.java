package q1;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static volatile d f10264d;

    /* renamed from: a, reason: collision with root package name */
    public volatile Boolean f10265a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f10266b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f10267c;

    public d(Context context) {
        this.f10267c = context;
        b();
    }

    public static d a(Context context) {
        if (f10264d == null) {
            synchronized (d.class) {
                try {
                    if (f10264d == null) {
                        f10264d = new d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10264d;
    }

    public final boolean b() {
        boolean z3;
        if (this.f10265a != null) {
            return this.f10265a.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.f10265a != null) {
                    z3 = this.f10265a.booleanValue();
                } else {
                    z3 = this.f10267c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && Build.VERSION.SDK_INT <= 30;
                    this.f10265a = Boolean.valueOf(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }
}
