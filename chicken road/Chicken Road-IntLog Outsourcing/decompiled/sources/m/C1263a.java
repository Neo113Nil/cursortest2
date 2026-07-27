package m;

import U.d;
import a.AbstractC0169a;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1263a extends AbstractC0169a {

    /* renamed from: h, reason: collision with root package name */
    public static volatile C1263a f11081h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f11082i = new d(1);

    /* renamed from: g, reason: collision with root package name */
    public final C1265c f11083g = new C1265c();

    public static C1263a U() {
        if (f11081h != null) {
            return f11081h;
        }
        synchronized (C1263a.class) {
            try {
                if (f11081h == null) {
                    f11081h = new C1263a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f11081h;
    }
}
