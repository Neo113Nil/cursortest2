package G0;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A0.k f400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f401c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f402d;

    public /* synthetic */ f(l lVar, A0.k kVar, int i3, Runnable runnable) {
        this.f399a = lVar;
        this.f400b = kVar;
        this.f401c = i3;
        this.f402d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final A0.k kVar = this.f400b;
        final int i3 = this.f401c;
        Runnable runnable = this.f402d;
        final l lVar = this.f399a;
        I0.c cVar = lVar.f;
        try {
            try {
                H0.d dVar = lVar.f421c;
                Objects.requireNonNull(dVar);
                ((H0.i) cVar).f(new F1.b(2, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) lVar.f419a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((H0.i) cVar).f(new I0.b() { // from class: G0.g
                        @Override // I0.b
                        public final Object execute() {
                            l.this.f422d.a(kVar, i3 + 1, false);
                            return null;
                        }
                    });
                } else {
                    lVar.a(kVar, i3);
                }
                runnable.run();
            } catch (I0.a unused) {
                lVar.f422d.a(kVar, i3 + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
