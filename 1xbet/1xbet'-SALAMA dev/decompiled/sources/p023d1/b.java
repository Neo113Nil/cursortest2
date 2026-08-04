package p023d1;

import M4.e;
import com.google.android.gms.common.api.f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p036e6.c;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f12340a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f12341b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f12342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f12343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final R4.c f12344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12347h;

    public b(e eVar) {
        String str = u.f12378a;
        this.f12342c = new t();
        this.f12343d = new c(16);
        this.f12344e = new R4.c(14);
        this.f12345f = 4;
        this.f12346g = f.API_PRIORITY_OTHER;
        this.f12347h = 20;
    }
}
