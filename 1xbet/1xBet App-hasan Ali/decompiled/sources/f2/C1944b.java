package f2;

import A0.J0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1944b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f16975a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1943a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f16976b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1943a(true));

    /* renamed from: c, reason: collision with root package name */
    public final s f16977c;

    /* renamed from: d, reason: collision with root package name */
    public final Q1.j f16978d;

    /* renamed from: e, reason: collision with root package name */
    public final J0 f16979e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16980g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16981h;

    public C1944b(Q1.j jVar) {
        String str = t.f17009a;
        this.f16977c = new s();
        this.f16978d = new Q1.j(28);
        this.f16979e = new J0(28);
        this.f = 4;
        this.f16980g = Integer.MAX_VALUE;
        this.f16981h = 20;
    }
}
