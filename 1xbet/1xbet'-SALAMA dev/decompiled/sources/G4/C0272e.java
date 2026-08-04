package G4;

import java.util.concurrent.TimeUnit;
import p155w1.C1017n0;

/* JADX INFO: renamed from: G4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0272e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f2968f = TimeUnit.SECONDS.toMillis(15);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f2969g = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1017n0 f2970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P6.b f2971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0271d f2972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0271d f2973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2974e;

    public C0272e(P6.b bVar, L4.f fVar, C0279l c0279l) {
        C0271d c0271d = new C0271d(c0279l, 0);
        C0271d c0271d2 = new C0271d(c0279l, 1);
        this.f2974e = 50;
        this.f2971b = bVar;
        this.f2970a = new C1017n0(this, fVar);
        this.f2972c = c0271d;
        this.f2973d = c0271d2;
    }
}
