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
import f4.InterfaceC1089a;
import f4.InterfaceC1090b;
import g4.C1142o;

/* loaded from: classes2.dex */
public final class d extends P6.b {

    /* renamed from: c, reason: collision with root package name */
    public final c f1574c = new InterfaceC1089a() { // from class: C4.c
        @Override // f4.InterfaceC1089a
        public final void a(O4.b bVar) {
            d.this.b0();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1090b f1575d;

    /* renamed from: e, reason: collision with root package name */
    public o f1576e;

    /* renamed from: f, reason: collision with root package name */
    public int f1577f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1578g;

    /* JADX WARN: Type inference failed for: r0v0, types: [C4.c] */
    public d(C1142o c1142o) {
        c1142o.a(new C0042s(this, 15));
    }

    public final synchronized Task Y() {
        InterfaceC1090b interfaceC1090b = this.f1575d;
        if (interfaceC1090b == null) {
            return Tasks.forException(new Y3.c("auth is not available"));
        }
        FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC1090b;
        Task h6 = firebaseAuth.h(firebaseAuth.f11854f, this.f1578g);
        this.f1578g = false;
        return h6.continueWithTask(l.f4377b, new C0050y(this, this.f1577f));
    }

    public final synchronized e Z() {
        String str;
        FirebaseUser firebaseUser;
        try {
            InterfaceC1090b interfaceC1090b = this.f1575d;
            str = null;
            if (interfaceC1090b != null && (firebaseUser = ((FirebaseAuth) interfaceC1090b).f11854f) != null) {
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
