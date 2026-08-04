package C4;

import A1.C0042s;
import A1.C0050y;
import L4.l;
import L4.o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzad;
import p042f4.InterfaceC0892a;
import p042f4.InterfaceC0893b;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends P6.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f1574c = new InterfaceC0892a() { // from class: C4.c
        @Override // p042f4.InterfaceC0892a
        public final void a(O4.b bVar) {
            this.f1573a.b0();
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0893b f1575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f1576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1578g;

    /* JADX WARN: Type inference failed for: r0v0, types: [C4.c] */
    public d(p048g4.o oVar) {
        oVar.a(new C0042s(this, 15));
    }

    public final synchronized Task Y() {
        InterfaceC0893b interfaceC0893b = this.f1575d;
        if (interfaceC0893b == null) {
            return Tasks.forException(new Y3.c("auth is not available"));
        }
        FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0893b;
        Task taskH = firebaseAuth.h(firebaseAuth.f11854f, this.f1578g);
        this.f1578g = false;
        return taskH.continueWithTask(l.f4377b, new C0050y(this, this.f1577f));
    }

    public final synchronized e Z() {
        String str;
        FirebaseUser firebaseUser;
        try {
            InterfaceC0893b interfaceC0893b = this.f1575d;
            str = null;
            if (interfaceC0893b != null && (firebaseUser = ((FirebaseAuth) interfaceC0893b).f11854f) != null) {
                str = ((zzad) firebaseUser).f11909b.f11939a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return str != null ? new e(str) : e.f1579b;
    }

    public final synchronized void a0() {
        this.f1578g = true;
    }

    public final synchronized void b0() {
        this.f1577f++;
        o oVar = this.f1576e;
        if (oVar != null) {
            oVar.a(Z());
        }
    }
}
