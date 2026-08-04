package B4;

import A1.C0042s;
import F2.C0247p;
import G4.C0282o;
import Y4.C0573g;
import Y4.C0575h;
import Y4.C0577i;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.C0884t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.J f1160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f1161b;

    public h0(E4.J j, FirebaseFirestore firebaseFirestore) {
        j.getClass();
        this.f1160a = j;
        firebaseFirestore.getClass();
        this.f1161b = firebaseFirestore;
    }

    public final C0072p a(C0070n c0070n) throws I {
        this.f1161b.k(c0070n);
        try {
            return (C0072p) Tasks.await(b(c0070n));
        } catch (InterruptedException e7) {
            throw new RuntimeException(e7);
        } catch (ExecutionException e8) {
            if (e8.getCause() instanceof I) {
                throw ((I) e8.getCause());
            }
            throw new RuntimeException(e8.getCause());
        }
    }

    public final Task b(C0070n c0070n) {
        Task taskContinueWithTask;
        E4.J j = this.f1160a;
        List listSingletonList = Collections.singletonList(c0070n.f1179a);
        p113p3.f.O("A transaction object cannot be used after its update callback has been invoked.", !j.f2135d, new Object[0]);
        if (j.f2134c.size() != 0) {
            taskContinueWithTask = Tasks.forException(new I("Firestore transactions require all reads to be executed before all writes.", H.INVALID_ARGUMENT));
        } else {
            K4.j jVar = j.f2132a;
            jVar.getClass();
            C0573g c0573gY = C0575h.y();
            String str = (String) jVar.f4024a.f17515c;
            c0573gY.d();
            C0575h.v((C0575h) c0573gY.f12096b, str);
            Iterator it = listSingletonList.iterator();
            while (it.hasNext()) {
                String strU = jVar.f4024a.u((H4.h) it.next());
                c0573gY.d();
                C0575h.w((C0575h) c0573gY.f12096b, strU);
            }
            ArrayList arrayList = new ArrayList();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            K4.r rVar = jVar.f4026c;
            H2.r rVar2 = Y4.D.f7689a;
            if (rVar2 == null) {
                synchronized (Y4.D.class) {
                    try {
                        rVar2 = Y4.D.f7689a;
                        if (rVar2 == null) {
                            C0282o c0282oC = H2.r.c();
                            c0282oC.f3012d = U5.c0.f6470b;
                            c0282oC.f3013e = H2.r.b("google.firestore.v1.Firestore", "BatchGetDocuments");
                            c0282oC.f3009a = true;
                            C0575h c0575hX = C0575h.x();
                            C0884t c0884t = p016b6.c.f10155a;
                            c0282oC.f3010b = new p016b6.b(c0575hX);
                            c0282oC.f3011c = new p016b6.b(C0577i.v());
                            H2.r rVarD = c0282oC.d();
                            Y4.D.f7689a = rVarD;
                            rVar2 = rVarD;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            H2.r rVar3 = rVar2;
            C0575h c0575h = (C0575h) c0573gY.b();
            p072k1.g gVar = new p072k1.g(jVar, arrayList, listSingletonList, taskCompletionSource, false);
            C0247p c0247p = rVar.f4056d;
            ((Task) c0247p.f2706a).continueWithTask(((L4.f) c0247p.f2707b).f4359a, new B1.c(12, c0247p, rVar3)).addOnCompleteListener(rVar.f4053a.f4359a, new K4.l(rVar, gVar, c0575h, 3));
            taskContinueWithTask = taskCompletionSource.getTask().continueWithTask(L4.l.f4377b, new C0042s(j, 16));
        }
        return taskContinueWithTask.continueWith(L4.l.f4377b, new C0042s(this, 14));
    }

    public final void c(C0070n c0070n, Map map, e0 e0Var) {
        FirebaseFirestore firebaseFirestore = this.f1161b;
        firebaseFirestore.k(c0070n);
        p003a.a.f(map, "Provided data must not be null.");
        p003a.a.f(e0Var, "Provided options must not be null.");
        boolean z4 = e0Var.f1153a;
        p145u1.c cVar = firebaseFirestore.f11969h;
        C1050x1 c1050x1L = z4 ? cVar.l(map, e0Var.f1154b) : cVar.n(map);
        E4.J j = this.f1160a;
        H4.h hVar = c0070n.f1179a;
        List listSingletonList = Collections.singletonList(c1050x1L.g0(hVar, j.a(hVar)));
        p113p3.f.O("A transaction object cannot be used after its update callback has been invoked.", !j.f2135d, new Object[0]);
        j.f2134c.addAll(listSingletonList);
        j.f2137f.add(hVar);
    }
}
