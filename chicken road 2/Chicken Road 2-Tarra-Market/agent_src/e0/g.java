package e0;

import P.m;
import Q.s;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f961a;

    /* renamed from: b, reason: collision with root package name */
    public final j f962b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f963c;

    /* renamed from: d, reason: collision with root package name */
    public final f f964d;

    public g(j jVar, f fVar, int i2) {
        this.f961a = i2;
        switch (i2) {
            case 1:
                this.f963c = new Object();
                this.f962b = jVar;
                this.f964d = fVar;
                break;
            default:
                this.f963c = new Object();
                this.f962b = jVar;
                this.f964d = fVar;
                break;
        }
    }

    @Override // e0.h
    public final void a(Task task) {
        switch (this.f961a) {
            case 0:
                if (((k) task).f971d) {
                    synchronized (this.f963c) {
                        try {
                            if (this.f964d != null) {
                                j jVar = this.f962b;
                                m mVar = new m(5, this);
                                jVar.getClass();
                                mVar.run();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                if (task.d() || ((k) task).f971d) {
                    return;
                }
                synchronized (this.f963c) {
                    try {
                        if (this.f964d != null) {
                            this.f962b.getClass();
                            synchronized (this.f963c) {
                                try {
                                    f fVar = this.f964d;
                                    if (fVar != null) {
                                        Exception b2 = task.b();
                                        s.c(b2);
                                        ((k) fVar.f960d).e(b2);
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
