package E5;

import A1.K0;
import B4.InterfaceC0073q;
import D6.y0;
import E4.C0169b;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p155w1.C1017n0;

/* JADX INFO: renamed from: E5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0184b implements A5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2353c;

    public /* synthetic */ C0184b() {
        this.f2351a = 2;
    }

    @Override // A5.i
    public final void b() {
        switch (this.f2351a) {
            case 0:
                C0183a c0183a = (C0183a) this.f2353c;
                if (c0183a != null) {
                    ((FirebaseAuth) this.f2352b).f11852d.remove(c0183a);
                    this.f2353c = null;
                }
                break;
            case 1:
                U u4 = (U) this.f2353c;
                if (u4 != null) {
                    ((FirebaseAuth) this.f2352b).f11850b.remove(u4);
                    this.f2353c = null;
                }
                break;
            default:
                B4.F f7 = (B4.F) this.f2352b;
                if (f7 != null) {
                    f7.remove();
                    this.f2352b = null;
                }
                break;
        }
    }

    @Override // A5.i
    public final void c(Object obj, A5.h hVar) {
        B4.F f7;
        switch (this.f2351a) {
            case 0:
                HashMap map = new HashMap();
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f2352b;
                Y3.i iVar = firebaseAuth.f11849a;
                iVar.b();
                map.put("appName", iVar.f7664b);
                C0183a c0183a = new C0183a(new AtomicBoolean(true), map, hVar);
                this.f2353c = c0183a;
                firebaseAuth.f11852d.add(c0183a);
                firebaseAuth.f11847A.execute(new y0(22, firebaseAuth, c0183a, false));
                return;
            case 1:
                HashMap map2 = new HashMap();
                FirebaseAuth firebaseAuth2 = (FirebaseAuth) this.f2352b;
                Y3.i iVar2 = firebaseAuth2.f11849a;
                iVar2.b();
                map2.put("appName", iVar2.f7664b);
                U u4 = new U(new AtomicBoolean(true), map2, hVar);
                this.f2353c = u4;
                firebaseAuth2.f11850b.add(u4);
                firebaseAuth2.f11847A.execute(new y0(20, firebaseAuth2, u4, false));
                return;
            default:
                final K0 k7 = new K0(hVar, 8);
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f2353c;
                C0169b c0169b = new C0169b(L4.l.f4376a, new InterfaceC0073q() { // from class: B4.D
                    @Override // B4.InterfaceC0073q
                    public final void a(Object obj2, I i7) {
                        p113p3.f.O("snapshots-in-sync listeners should never get errors.", i7 == null, new Object[0]);
                        k7.run();
                    }
                });
                C1017n0 c1017n0 = firebaseFirestore.f11971k;
                synchronized (c1017n0) {
                    c1017n0.k();
                    E4.t tVar = (E4.t) c1017n0.f17812c;
                    tVar.e();
                    tVar.f2232d.a(new A0.f(10, tVar, c0169b));
                    f7 = new B4.F(c0169b, tVar);
                }
                this.f2352b = f7;
                return;
        }
    }

    public /* synthetic */ C0184b(FirebaseAuth firebaseAuth, int i7) {
        this.f2351a = i7;
        this.f2352b = firebaseAuth;
    }
}
