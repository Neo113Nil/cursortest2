package A1;

import G4.C0279l;
import G4.InterfaceC0290x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: renamed from: A1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0050y implements p151v2.e, Continuation, L4.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f615b;

    public /* synthetic */ C0050y(Object obj, int i7) {
        this.f615b = obj;
        this.f614a = i7;
    }

    @Override // L4.p
    public Object get() {
        C0279l c0279l = (C0279l) this.f615b;
        InterfaceC0290x interfaceC0290x = c0279l.f2993c;
        int i7 = this.f614a;
        I4.i iVarG = interfaceC0290x.g(i7);
        p113p3.f.O("Attempt to reject nonexistent batch!", iVarG != null, new Object[0]);
        c0279l.f2993c.k(iVarG);
        c0279l.f2993c.a();
        c0279l.f2994d.G(i7);
        p072k1.g gVar = c0279l.f2996f;
        gVar.M(((G4.D) gVar.f14680a).n(iVarG.b()));
        return c0279l.f2996f.v(iVarG.b());
    }

    @Override // p151v2.e
    public void invoke(Object obj) {
        ((z0) obj).o((C0022h0) this.f615b, this.f614a);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task taskForResult;
        C4.d dVar = (C4.d) this.f615b;
        int i7 = this.f614a;
        synchronized (dVar) {
            try {
                if (i7 != dVar.f1577f) {
                    Q0.a.v(1, "FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                    taskForResult = dVar.Y();
                } else {
                    taskForResult = task.isSuccessful() ? Tasks.forResult(((p034e4.j) task.getResult()).f12687a) : Tasks.forException(task.getException());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return taskForResult;
    }
}
