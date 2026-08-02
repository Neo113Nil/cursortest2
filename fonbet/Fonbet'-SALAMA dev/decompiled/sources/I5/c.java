package I5;

import A1.C0042s;
import A1.RunnableC0032m0;
import A5.h;
import A5.i;
import B4.P;
import B4.Q;
import D4.f;
import E4.t;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.firestore.FirebaseFirestore;
import java.io.ByteArrayInputStream;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public h f3702a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f3703b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3704c;

    public c(FirebaseFirestore firebaseFirestore, byte[] bArr) {
        this.f3703b = firebaseFirestore;
        this.f3704c = bArr;
    }

    @Override // A5.i
    public final void b() {
        this.f3702a.a();
    }

    @Override // A5.i
    public final void c(Object obj, h hVar) {
        this.f3702a = hVar;
        FirebaseFirestore firebaseFirestore = this.f3703b;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f3704c);
        Q q7 = new Q();
        C1726n0 c1726n0 = firebaseFirestore.f11971k;
        synchronized (c1726n0) {
            c1726n0.k();
            t tVar = (t) c1726n0.f17806c;
            tVar.e();
            tVar.f2232d.a(new RunnableC0032m0(tVar, new f(tVar.f2233e, byteArrayInputStream), q7, 4));
        }
        C0042s c0042s = new C0042s(hVar, 21);
        P p5 = new P();
        p5.f1118a = TaskExecutors.MAIN_THREAD;
        p5.f1119b = c0042s;
        synchronized (q7.f1120a) {
            q7.f1124e.add(p5);
        }
        q7.addOnFailureListener(new b(this, hVar, 0));
    }
}
