package E4;

import A1.C0042s;
import E5.C0199q;
import F2.C0247p;
import G4.C0282o;
import U5.c0;
import Y4.C0583l;
import Y4.C0585m;
import Y4.C0587n;
import Y4.L0;
import android.util.Log;
import b6.AbstractC0791c;
import b6.C0790b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseUser;
import com.google.protobuf.C0928t;
import i4.C1266c;
import i4.C1267d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final /* synthetic */ class K implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2140c;

    public /* synthetic */ K(int i7, Object obj, Object obj2) {
        this.f2138a = i7;
        this.f2139b = obj;
        this.f2140c = obj2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Task continueWithTask;
        G5.e b7;
        int i7 = 12;
        int i8 = 1;
        switch (this.f2138a) {
            case 0:
                L l7 = (L) this.f2139b;
                J j = (J) this.f2140c;
                l7.getClass();
                if (!task.isSuccessful()) {
                    l7.p(task);
                    return;
                }
                p3.f.O("A transaction object cannot be used after its update callback has been invoked.", !j.f2135d, new Object[0]);
                B4.I i9 = j.f2136e;
                if (i9 != null) {
                    continueWithTask = Tasks.forException(i9);
                } else {
                    HashSet hashSet = new HashSet(j.f2133b.keySet());
                    Iterator it = j.f2134c.iterator();
                    while (it.hasNext()) {
                        hashSet.remove(((I4.h) it.next()).f3670a);
                    }
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        H4.h hVar = (H4.h) it2.next();
                        j.f2134c.add(new I4.r(hVar, j.a(hVar)));
                    }
                    j.f2135d = true;
                    K4.j jVar = j.f2132a;
                    ArrayList arrayList = j.f2134c;
                    jVar.getClass();
                    C0583l y4 = C0585m.y();
                    String str = (String) jVar.f4024a.f17509c;
                    y4.d();
                    C0585m.v((C0585m) y4.f12096b, str);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        L0 v6 = jVar.f4024a.v((I4.h) it3.next());
                        y4.d();
                        C0585m.w((C0585m) y4.f12096b, v6);
                    }
                    K4.r rVar = jVar.f4026c;
                    H2.r rVar2 = Y4.D.f7690b;
                    if (rVar2 == null) {
                        synchronized (Y4.D.class) {
                            try {
                                rVar2 = Y4.D.f7690b;
                                if (rVar2 == null) {
                                    C0282o c3 = H2.r.c();
                                    c3.f3012d = c0.f6469a;
                                    c3.f3013e = H2.r.b("google.firestore.v1.Firestore", "Commit");
                                    c3.f3009a = true;
                                    C0585m x4 = C0585m.x();
                                    C0928t c0928t = AbstractC0791c.f10155a;
                                    c3.f3010b = new C0790b(x4);
                                    c3.f3011c = new C0790b(C0587n.w());
                                    rVar2 = c3.d();
                                    Y4.D.f7690b = rVar2;
                                }
                            } finally {
                            }
                        }
                    }
                    C0585m c0585m = (C0585m) y4.b();
                    rVar.getClass();
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    C0247p c0247p = rVar.f4056d;
                    ((Task) c0247p.f2706a).continueWithTask(((L4.f) c0247p.f2707b).f4359a, new B1.c(i7, c0247p, rVar2)).addOnCompleteListener(rVar.f4053a.f4359a, new K4.l(rVar, taskCompletionSource, c0585m, 2));
                    continueWithTask = taskCompletionSource.getTask().continueWith(jVar.f4025b.f4359a, new C0042s(jVar, 22)).continueWithTask(L4.l.f4377b, new B1.f(i7));
                }
                continueWithTask.addOnCompleteListener(((L4.f) l7.f2142b).f4359a, new K(i8, l7, task));
                return;
            case 1:
                L l8 = (L) this.f2139b;
                l8.getClass();
                if (task.isSuccessful()) {
                    ((TaskCompletionSource) l8.f2146f).setResult(((Task) this.f2140c).getResult());
                    return;
                } else {
                    l8.p(task);
                    return;
                }
            case 2:
                boolean isSuccessful = task.isSuccessful();
                E5.r rVar3 = (E5.r) this.f2139b;
                if (isSuccessful) {
                    rVar3.success(AbstractC1464a.L((FirebaseUser) this.f2140c));
                    return;
                } else {
                    rVar3.a(Y4.D.L(task.getException()));
                    return;
                }
            case 3:
                HashMap hashMap = G5.d.f3055e;
                boolean isSuccessful2 = task.isSuccessful();
                A5.p pVar = (A5.p) this.f2139b;
                if (isSuccessful2) {
                    pVar.success(task.getResult());
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof G5.e) {
                    b7 = (G5.e) exception;
                } else if (exception instanceof C1267d) {
                    int i10 = G5.e.f3060d;
                    b7 = G5.e.a(C1266c.a((C1267d) exception));
                } else {
                    Log.e("firebase_database", "An unknown error occurred handling native method call " + ((A5.o) this.f2140c).f676a, exception);
                    if (exception == null) {
                        b7 = G5.e.b(null);
                    } else {
                        int i11 = G5.e.f3060d;
                        b7 = G5.e.b(exception.getMessage());
                    }
                }
                pVar.error(b7.f3061a, b7.f3062b, b7.f3063c);
                return;
            case 4:
                I5.e eVar = (I5.e) this.f2139b;
                eVar.getClass();
                HashMap hashMap2 = new HashMap();
                if (task.getException() != null || ((H5.f) task.getResult()).f3369a != null) {
                    Exception exception2 = task.getException() != null ? task.getException() : ((H5.f) task.getResult()).f3369a;
                    Y3.i iVar = eVar.f3709b.f11968g;
                    iVar.b();
                    hashMap2.put("appName", iVar.f7664b);
                    hashMap2.put("error", Y4.D.m(exception2));
                } else if (task.getResult() != null) {
                    hashMap2.put("complete", Boolean.TRUE);
                }
                eVar.f3715y.post(new I5.d((A5.h) this.f2140c, hashMap2, 0));
                return;
            case 5:
                HashMap hashMap3 = K5.b.f4087c;
                ((K5.b) this.f2139b).getClass();
                boolean isSuccessful3 = task.isSuccessful();
                C0199q c0199q = (C0199q) this.f2140c;
                if (!isSuccessful3) {
                    c0199q.b(Q0.a.I(task.getException()));
                    return;
                }
                HashMap f7 = K5.b.f((com.google.firebase.storage.j) task.getResult());
                K5.j jVar2 = new K5.j();
                jVar2.f4112a = f7;
                c0199q.success(jVar2);
                return;
            case 6:
                HashMap hashMap4 = K5.b.f4087c;
                ((K5.b) this.f2139b).getClass();
                boolean isSuccessful4 = task.isSuccessful();
                C0199q c0199q2 = (C0199q) this.f2140c;
                if (isSuccessful4) {
                    c0199q2.success(K5.b.b((com.google.firebase.storage.h) task.getResult()));
                    return;
                } else {
                    c0199q2.b(Q0.a.I(task.getException()));
                    return;
                }
            case 7:
                HashMap hashMap5 = K5.b.f4087c;
                ((K5.b) this.f2139b).getClass();
                boolean isSuccessful5 = task.isSuccessful();
                K5.e eVar2 = (K5.e) this.f2140c;
                if (!isSuccessful5) {
                    eVar2.a(Q0.a.I(task.getException()));
                    return;
                }
                HashMap f8 = K5.b.f((com.google.firebase.storage.j) task.getResult());
                K5.j jVar3 = new K5.j();
                jVar3.f4112a = f8;
                eVar2.b(jVar3);
                return;
            default:
                HashMap hashMap6 = K5.b.f4087c;
                ((K5.b) this.f2139b).getClass();
                boolean isSuccessful6 = task.isSuccessful();
                K5.f fVar = (K5.f) this.f2140c;
                if (isSuccessful6) {
                    fVar.b(K5.b.b((com.google.firebase.storage.h) task.getResult()));
                    return;
                } else {
                    fVar.a(Q0.a.I(task.getException()));
                    return;
                }
        }
    }
}
