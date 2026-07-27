package i1;

import S0.r;
import com.google.android.gms.tasks.Task;

/* renamed from: i1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338h implements InterfaceC0339i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5018a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorC0340j f5019b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5020c;

    /* renamed from: d, reason: collision with root package name */
    public final C0337g f5021d;

    public C0338h(ExecutorC0340j executorC0340j, C0337g c0337g, int i3) {
        this.f5018a = i3;
        switch (i3) {
            case 1:
                this.f5020c = new Object();
                this.f5019b = executorC0340j;
                this.f5021d = c0337g;
                break;
            default:
                this.f5020c = new Object();
                this.f5019b = executorC0340j;
                this.f5021d = c0337g;
                break;
        }
    }

    @Override // i1.InterfaceC0339i
    public final void a(Task task) {
        switch (this.f5018a) {
            case 0:
                if (((C0341k) task).f5025d) {
                    synchronized (this.f5020c) {
                        try {
                            if (this.f5021d != null) {
                                ExecutorC0340j executorC0340j = this.f5019b;
                                A.b bVar = new A.b(13, this);
                                executorC0340j.getClass();
                                bVar.run();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                if (task.c() || ((C0341k) task).f5025d) {
                    return;
                }
                synchronized (this.f5020c) {
                    try {
                        if (this.f5021d != null) {
                            this.f5019b.getClass();
                            synchronized (this.f5020c) {
                                try {
                                    C0337g c0337g = this.f5021d;
                                    if (c0337g != null) {
                                        Exception a3 = task.a();
                                        r.c(a3);
                                        ((C0341k) c0337g.f5017d).d(a3);
                                    }
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
