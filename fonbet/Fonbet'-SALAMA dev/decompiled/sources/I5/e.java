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
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final B1.c f3708a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f3709b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f3710c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f3711d;

    /* renamed from: f, reason: collision with root package name */
    public int f3713f;

    /* renamed from: x, reason: collision with root package name */
    public List f3714x;

    /* renamed from: e, reason: collision with root package name */
    public final Semaphore f3712e = new Semaphore(0);

    /* renamed from: y, reason: collision with root package name */
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
        int intValue = this.f3711d.intValue();
        if (intValue < 1) {
            throw new IllegalArgumentException("Max attempts must be at least 1");
        }
        i0 i0Var = new i0(intValue);
        B1.c cVar = new B1.c(10, this, hVar);
        firebaseFirestore.getClass();
        ThreadPoolExecutor threadPoolExecutor = J.f2131g;
        firebaseFirestore.f11971k.k();
        E e7 = new E(firebaseFirestore, threadPoolExecutor, cVar, 0);
        C1726n0 c1726n0 = firebaseFirestore.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            t tVar = (t) c1726n0.f17806c;
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
