package W5;

import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M0 f6768b;

    public /* synthetic */ F(M0 m02, int i7) {
        this.f6767a = i7;
        this.f6768b = m02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6767a) {
            case 0:
                this.f6768b.f6869f.b();
                break;
            default:
                M0 m02 = this.f6768b;
                LinkedHashSet linkedHashSet = m02.f6876n.f6886g.f6934E;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(m02);
                    N0 n02 = m02.f6876n;
                    if (n02.f6886g.f6934E.isEmpty()) {
                        Q0 q02 = n02.f6886g;
                        q02.c0.o(q02.f6935F, false);
                        Q0 q03 = n02.f6886g;
                        q03.f6934E = null;
                        if (q03.f6939J.get()) {
                            n02.f6886g.f6938I.C(Q0.f6925j0);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
