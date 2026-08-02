package w1;

import android.os.SystemClock;
import java.util.TimerTask;

/* renamed from: w1.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1746t0 extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17862b;

    public /* synthetic */ C1746t0(Object obj, int i7) {
        this.f17861a = i7;
        this.f17862b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f17861a) {
            case 0:
                ((A0) this.f17862b).h();
                break;
            case 1:
                B1 b12 = (B1) this.f17862b;
                b12.o();
                if (b12.f17290F) {
                    C1759x1.z().A(R1.d(6));
                    b12.f17290F = false;
                }
                b12.n();
                break;
            default:
                ((P1) this.f17862b).d();
                P1 p12 = (P1) this.f17862b;
                synchronized (AbstractC1706i0.class) {
                }
                if (p12.f17504i <= 0) {
                    p12.f17504i = SystemClock.elapsedRealtime();
                }
                long j = p12.f17502g;
                if (j > 0) {
                    p12.f(w2.c(j, p12.j, p12.f17503h, p12.f17504i));
                }
                p12.f(R1.d(4));
                u1.c cVar = p12.f17498c;
                if (cVar != null) {
                    ((D1) cVar.f16591b).d(new com.flurry.android.marketing.core.b(p12, false, 2));
                }
                p12.h();
                break;
        }
    }
}
