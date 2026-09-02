package e0;

import P.q;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f implements InterfaceC0060b, h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f957a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f958b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f959c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f960d;

    public f(P.k kVar, C0.a aVar, k kVar2) {
        this.f957a = 0;
        this.f958b = kVar;
        this.f959c = aVar;
        this.f960d = kVar2;
    }

    @Override // e0.h
    public final void a(Task task) {
        switch (this.f957a) {
            case 0:
                ((P.k) this.f958b).execute(new q(3, this, task));
                return;
            case 1:
                synchronized (this.f959c) {
                    try {
                        if (((InterfaceC0059a) this.f960d) == null) {
                            return;
                        }
                        this.f958b.execute(new q(4, this, task));
                        return;
                    } finally {
                    }
                }
            default:
                if (task.d()) {
                    synchronized (this.f959c) {
                        try {
                            if (((InterfaceC0060b) this.f960d) != null) {
                                this.f958b.execute(new q(5, this, task));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // e0.InterfaceC0060b
    public void onSuccess(Object obj) {
        ((k) this.f960d).f(obj);
    }

    public f(Executor executor, InterfaceC0059a interfaceC0059a) {
        this.f957a = 1;
        this.f959c = new Object();
        this.f958b = executor;
        this.f960d = interfaceC0059a;
    }

    public f(Executor executor, InterfaceC0060b interfaceC0060b) {
        this.f957a = 2;
        this.f959c = new Object();
        this.f958b = executor;
        this.f960d = interfaceC0060b;
    }
}
