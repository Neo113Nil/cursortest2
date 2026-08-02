package r3;

import android.content.Context;
import g2.C1982f;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2350b {

    /* renamed from: b, reason: collision with root package name */
    public static final C2350b f19104b;

    /* renamed from: a, reason: collision with root package name */
    public C1982f f19105a;

    static {
        C2350b c2350b = new C2350b();
        c2350b.f19105a = null;
        f19104b = c2350b;
    }

    public static C1982f a(Context context) {
        C1982f c1982f;
        C2350b c2350b = f19104b;
        synchronized (c2350b) {
            try {
                if (c2350b.f19105a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c2350b.f19105a = new C1982f(context);
                }
                c1982f = c2350b.f19105a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1982f;
    }
}
