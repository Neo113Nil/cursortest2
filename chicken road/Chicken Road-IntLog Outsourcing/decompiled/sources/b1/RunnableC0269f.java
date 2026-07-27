package b1;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* renamed from: b1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0269f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0273j f4774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V0.i f4775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f4777d;

    public /* synthetic */ RunnableC0269f(C0273j c0273j, V0.i iVar, int i2, Runnable runnable) {
        this.f4774a = c0273j;
        this.f4775b = iVar;
        this.f4776c = i2;
        this.f4777d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final V0.i iVar = this.f4775b;
        final int i2 = this.f4776c;
        Runnable runnable = this.f4777d;
        final C0273j c0273j = this.f4774a;
        d1.c cVar = c0273j.f4792f;
        try {
            try {
                c1.d dVar = c0273j.f4789c;
                Objects.requireNonNull(dVar);
                ((c1.i) cVar).p(new D3.g(14, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) c0273j.f4787a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((c1.i) cVar).p(new d1.b() { // from class: b1.g
                        @Override // d1.b
                        public final Object execute() {
                            C0273j.this.f4790d.a(iVar, i2 + 1, false);
                            return null;
                        }
                    });
                } else {
                    c0273j.a(iVar, i2);
                }
            } catch (d1.a unused) {
                c0273j.f4790d.a(iVar, i2 + 1, false);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
