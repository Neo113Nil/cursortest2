package p155w1;

import android.os.SystemClock;
import com.flurry.android.marketing.core.b;
import java.util.TimerTask;
import p145u1.c;

/* JADX INFO: renamed from: w1.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1037t0 extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17868b;

    public /* synthetic */ C1037t0(Object obj, int i7) {
        this.f17867a = i7;
        this.f17868b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f17867a) {
            case 0:
                ((A0) this.f17868b).h();
                break;
            case 1:
                B1 b7 = (B1) this.f17868b;
                b7.o();
                if (b7.f17296F) {
                    C1050x1.z().A(R1.d(6));
                    b7.f17296F = false;
                }
                b7.n();
                break;
            default:
                ((P1) this.f17868b).d();
                P1 p5 = (P1) this.f17868b;
                synchronized (AbstractC0997i0.class) {
                }
                if (p5.f17510i <= 0) {
                    p5.f17510i = SystemClock.elapsedRealtime();
                }
                long j = p5.f17508g;
                if (j > 0) {
                    p5.f(w2.c(j, p5.j, p5.f17509h, p5.f17510i));
                }
                p5.f(R1.d(4));
                c cVar = p5.f17504c;
                if (cVar != null) {
                    ((D1) cVar.f16597b).d(new b(p5, false, 2));
                }
                p5.h();
                break;
        }
    }
}
