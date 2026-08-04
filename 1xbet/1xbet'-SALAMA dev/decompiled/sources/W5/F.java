package W5;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class F implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M0 f6768b;

    public /* synthetic */ F(M0 m7, int i7) {
        this.f6767a = i7;
        this.f6768b = m7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6767a) {
            case 0:
                this.f6768b.f6869f.b();
                break;
            default:
                M0 m7 = this.f6768b;
                LinkedHashSet linkedHashSet = m7.f6876n.f6886g.f6934E;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(m7);
                    N0 n2 = m7.f6876n;
                    if (n2.f6886g.f6934E.isEmpty()) {
                        Q0 q1 = n2.f6886g;
                        q1.c0.o(q1.f6935F, false);
                        Q0 q7 = n2.f6886g;
                        q7.f6934E = null;
                        if (q7.f6939J.get()) {
                            n2.f6886g.f6938I.C(Q0.f6925j0);
                        }
                    }
                }
                break;
        }
    }
}
