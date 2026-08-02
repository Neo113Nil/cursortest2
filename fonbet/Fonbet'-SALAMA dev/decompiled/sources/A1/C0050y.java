package A1;

import G4.C0279l;
import G4.InterfaceC0290x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e4.C1036j;

/* renamed from: A1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0050y implements v2.e, Continuation, L4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f614a;

    /* renamed from: b, reason: collision with root package name */
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
        I4.i g3 = interfaceC0290x.g(i7);
        p3.f.O("Attempt to reject nonexistent batch!", g3 != null, new Object[0]);
        c0279l.f2993c.k(g3);
        c0279l.f2993c.a();
        c0279l.f2994d.G(i7);
        k1.g gVar = c0279l.f2996f;
        gVar.M(((G4.D) gVar.f14674a).n(g3.b()));
        return c0279l.f2996f.v(g3.b());
    }

    @Override // v2.e
    public void invoke(Object obj) {
        ((z0) obj).o((C0022h0) this.f615b, this.f614a);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task forResult;
        C4.d dVar = (C4.d) this.f615b;
        int i7 = this.f614a;
        synchronized (dVar) {
            try {
                if (i7 != dVar.f1577f) {
                    Q0.a.v(1, "FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                    forResult = dVar.Y();
                } else {
                    forResult = task.isSuccessful() ? Tasks.forResult(((C1036j) task.getResult()).f12681a) : Tasks.forException(task.getException());
                }
            } finally {
            }
        }
        return forResult;
    }
}
