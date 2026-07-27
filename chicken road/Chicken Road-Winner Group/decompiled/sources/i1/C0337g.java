package i1;

import A0.q;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: i1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337g implements InterfaceC0333c, InterfaceC0339i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5014a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5015b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5016c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5017d;

    public C0337g(q qVar, b0.i iVar, C0341k c0341k) {
        this.f5014a = 0;
        this.f5015b = qVar;
        this.f5016c = iVar;
        this.f5017d = c0341k;
    }

    @Override // i1.InterfaceC0339i
    public final void a(Task task) {
        switch (this.f5014a) {
            case 0:
                ((q) this.f5015b).execute(new A.a(this, task, 6, false));
                return;
            case 1:
                synchronized (this.f5016c) {
                }
                this.f5015b.execute(new A.a(this, task, 7, false));
                return;
            default:
                if (task.c()) {
                    synchronized (this.f5016c) {
                        try {
                            if (((InterfaceC0333c) this.f5017d) != null) {
                                this.f5015b.execute(new A.a(this, task, 8, false));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // i1.InterfaceC0333c
    public void onSuccess(Object obj) {
        ((C0341k) this.f5017d).e(obj);
    }

    public C0337g(Executor executor, InterfaceC0332b interfaceC0332b) {
        this.f5014a = 1;
        this.f5016c = new Object();
        this.f5015b = executor;
        this.f5017d = interfaceC0332b;
    }

    public C0337g(Executor executor, InterfaceC0333c interfaceC0333c) {
        this.f5014a = 2;
        this.f5016c = new Object();
        this.f5015b = executor;
        this.f5017d = interfaceC0333c;
    }
}
