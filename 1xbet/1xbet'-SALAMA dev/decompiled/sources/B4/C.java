package B4;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C implements L4.n, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseFirestore f1072a;

    public /* synthetic */ C(FirebaseFirestore firebaseFirestore) {
        this.f1072a = firebaseFirestore;
    }

    @Override // L4.n
    public Object apply(Object obj) {
        E4.t tVar;
        FirebaseFirestore firebaseFirestore = this.f1072a;
        L4.f fVar = (L4.f) obj;
        synchronized (firebaseFirestore.f11971k) {
            H4.f fVar2 = firebaseFirestore.f11964c;
            String str = firebaseFirestore.f11965d;
            K k7 = firebaseFirestore.j;
            tVar = new E4.t(firebaseFirestore.f11963b, new D3.j(fVar2, str, k7.f1105a, k7.f1106b, 1), firebaseFirestore.f11966e, firebaseFirestore.f11967f, fVar, firebaseFirestore.f11972l, (E4.z) firebaseFirestore.f11962a.apply(k7));
        }
        return tVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        FirebaseFirestore firebaseFirestore = this.f1072a;
        firebaseFirestore.getClass();
        E4.C c3 = (E4.C) task.getResult();
        if (c3 != null) {
            return new Z(c3, firebaseFirestore);
        }
        return null;
    }
}
