package I5;

import A1.RunnableC0032m0;
import A5.h;
import A5.i;
import B4.E;
import B4.G;
import B4.i0;
import E4.J;
import E4.K;
import E4.t;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B1.c f3708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f3709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f3710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f3711d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3713f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f3714x;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Semaphore f3712e = new Semaphore(0);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Handler f3715y = new Handler(Looper.getMainLooper());

    public e(B1.c cVar, FirebaseFirestore firebaseFirestore, Long l7, Long l8) {
        this.f3708a = cVar;
        this.f3709b = firebaseFirestore;
        this.f3710c = l7;
        this.f3711d = l8;
    }

    @Override // A5.i
    public final void b() {
        this.f3712e.release();
    }

    @Override // A5.i
    public final void c(Object obj, h hVar) {
        Task task;
        FirebaseFirestore firebaseFirestore = this.f3709b;
        int iIntValue = this.f3711d.intValue();
        if (iIntValue < 1) {
            throw new IllegalArgumentException("Max attempts must be at least 1");
        }
        i0 i0Var = new i0(iIntValue);
        B1.c cVar = new B1.c(10, this, hVar);
        firebaseFirestore.getClass();
        ThreadPoolExecutor threadPoolExecutor = J.f2131g;
        firebaseFirestore.f11971k.k();
        E e7 = new E(firebaseFirestore, threadPoolExecutor, cVar, 0);
        C1017n0 c1017n0 = firebaseFirestore.f11971k;
        synchronized (c1017n0) {
            c1017n0.k();
            t tVar = (t) c1017n0.f17812c;
            tVar.e();
            L4.d dVar = tVar.f2232d.f4359a;
            G g3 = new G(tVar, i0Var, e7, 1);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            dVar.execute(new RunnableC0032m0(g3, dVar, taskCompletionSource, 14));
            task = taskCompletionSource.getTask();
        }
        task.addOnCompleteListener(new K(4, this, hVar));
    }
}
