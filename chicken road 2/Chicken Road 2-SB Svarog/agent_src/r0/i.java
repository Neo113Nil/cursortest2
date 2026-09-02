package r0;

import m0.AbstractC0059p;
import m0.AbstractC0062t;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f1174c;

    public i(j jVar, Runnable runnable) {
        this.f1174c = jVar;
        this.f1173b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f1174c;
        AbstractC0059p abstractC0059p = jVar.f1176d;
        int i2 = 0;
        while (true) {
            try {
                this.f1173b.run();
            } catch (Throwable th) {
                AbstractC0062t.c(Y.j.f410b, th);
            }
            Runnable i3 = jVar.i();
            if (i3 == null) {
                return;
            }
            this.f1173b = i3;
            i2++;
            if (i2 >= 16 && abstractC0059p.h()) {
                abstractC0059p.f(jVar, this);
                return;
            }
        }
    }
}
