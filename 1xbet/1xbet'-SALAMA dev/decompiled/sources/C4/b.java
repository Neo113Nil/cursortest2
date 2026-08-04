package C4;

import B1.f;
import L4.l;
import L4.o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends P6.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f1569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p026d4.b f1570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f1572f = new a(this);

    public b(p048g4.o oVar) {
        oVar.a(new a(this));
    }

    public final synchronized Task Y() {
        p026d4.b bVar = this.f1570d;
        if (bVar == null) {
            return Tasks.forException(new Y3.c("AppCheck is not available"));
        }
        Task taskB = ((p014b4.d) bVar).b(this.f1571e);
        this.f1571e = false;
        return taskB.continueWithTask(l.f4377b, new f(9));
    }

    public final synchronized void Z() {
        this.f1571e = true;
    }
}
