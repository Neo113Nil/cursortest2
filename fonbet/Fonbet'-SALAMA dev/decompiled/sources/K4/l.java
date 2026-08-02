package K4;

import A1.K0;
import C0.C0083b;
import U5.AbstractC0439f;
import U5.C0450q;
import U5.b0;
import U5.l0;
import W5.C0501f1;
import W5.InterfaceC0540t;
import Y4.C0575h;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4035c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4036d;

    public /* synthetic */ l(Task task, C0501f1 c0501f1, Task task2) {
        this.f4033a = 0;
        this.f4034b = task;
        this.f4036d = c0501f1;
        this.f4035c = task2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f4033a) {
            case 0:
                b0 b0Var = new b0();
                Task task2 = (Task) this.f4034b;
                boolean isSuccessful = task2.isSuccessful();
                C0501f1 c0501f1 = (C0501f1) this.f4036d;
                if (isSuccessful) {
                    String str = (String) task2.getResult();
                    Q0.a.v(1, "FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
                    if (str != null) {
                        b0Var.f(m.f4037c, "Bearer ".concat(str));
                    }
                } else {
                    Exception exception = task2.getException();
                    if (exception instanceof Y3.c) {
                        Q0.a.v(1, "FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
                    } else {
                        if (!(exception instanceof P4.a)) {
                            Q0.a.v(2, "FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                            c0501f1.a(l0.j.f(exception));
                            return;
                        }
                        Q0.a.v(1, "FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
                    }
                }
                Task task3 = (Task) this.f4035c;
                if (task3.isSuccessful()) {
                    String str2 = (String) task3.getResult();
                    if (str2 != null && !str2.isEmpty()) {
                        Q0.a.v(1, "FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                        b0Var.f(m.f4038d, str2);
                    }
                } else {
                    Exception exception2 = task3.getException();
                    if (!(exception2 instanceof Y3.c)) {
                        Q0.a.v(2, "FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception2);
                        c0501f1.a(l0.j.f(exception2));
                        return;
                    }
                    Q0.a.v(1, "FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
                }
                p3.f.q("apply() or fail() already called", !c0501f1.j);
                b0 b0Var2 = c0501f1.f7208c;
                b0Var2.d(b0Var);
                C0450q c0450q = c0501f1.f7210e;
                C0450q a2 = c0450q.a();
                try {
                    InterfaceC0540t a4 = c0501f1.f7206a.a(c0501f1.f7207b, b0Var2, c0501f1.f7209d, c0501f1.f7212g);
                    c0450q.c(a2);
                    c0501f1.b(a4);
                    return;
                } catch (Throwable th) {
                    c0450q.c(a2);
                    throw th;
                }
            case 1:
                r rVar = (r) this.f4034b;
                rVar.getClass();
                AbstractC0439f abstractC0439f = (AbstractC0439f) task.getResult();
                AbstractC0439f[] abstractC0439fArr = (AbstractC0439f[]) this.f4035c;
                abstractC0439fArr[0] = abstractC0439f;
                B1.m mVar = (B1.m) this.f4036d;
                abstractC0439f.e(new n(rVar, mVar, abstractC0439fArr), rVar.a());
                ((C0083b) mVar.f1015c).E(new K0(mVar, 9));
                abstractC0439fArr[0].c(1);
                return;
            case 2:
                r rVar2 = (r) this.f4034b;
                rVar2.getClass();
                AbstractC0439f abstractC0439f2 = (AbstractC0439f) task.getResult();
                abstractC0439f2.e(new q(rVar2, (TaskCompletionSource) this.f4035c), rVar2.a());
                abstractC0439f2.c(2);
                abstractC0439f2.d((com.google.protobuf.C) this.f4036d);
                abstractC0439f2.b();
                return;
            case 3:
                r rVar3 = (r) this.f4034b;
                rVar3.getClass();
                AbstractC0439f abstractC0439f3 = (AbstractC0439f) task.getResult();
                abstractC0439f3.e(new q((k1.g) this.f4035c, abstractC0439f3), rVar3.a());
                abstractC0439f3.c(1);
                abstractC0439f3.d((C0575h) this.f4036d);
                abstractC0439f3.b();
                return;
            default:
                Continuation continuation = (Continuation) this.f4035c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f4036d;
                com.google.firebase.storage.s sVar = (com.google.firebase.storage.s) this.f4034b;
                sVar.getClass();
                try {
                    Object then = continuation.then(sVar);
                    if (taskCompletionSource.getTask().isComplete()) {
                        return;
                    }
                    taskCompletionSource.setResult(then);
                    return;
                } catch (RuntimeExecutionException e7) {
                    if (e7.getCause() instanceof Exception) {
                        taskCompletionSource.setException((Exception) e7.getCause());
                        return;
                    } else {
                        taskCompletionSource.setException(e7);
                        return;
                    }
                } catch (Exception e8) {
                    taskCompletionSource.setException(e8);
                    return;
                }
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i7) {
        this.f4033a = i7;
        this.f4034b = obj;
        this.f4035c = obj2;
        this.f4036d = obj3;
    }
}
