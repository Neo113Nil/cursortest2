package d1;

import e6.C1054c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f12334a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0948a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f12335b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0948a(true));

    /* renamed from: c, reason: collision with root package name */
    public final t f12336c;

    /* renamed from: d, reason: collision with root package name */
    public final C1054c f12337d;

    /* renamed from: e, reason: collision with root package name */
    public final R4.c f12338e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12339f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12340g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12341h;

    public C0949b(M4.e eVar) {
        String str = u.f12372a;
        this.f12336c = new t();
        this.f12337d = new C1054c(16);
        this.f12338e = new R4.c(14);
        this.f12339f = 4;
        this.f12340g = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f12341h = 20;
    }
}
