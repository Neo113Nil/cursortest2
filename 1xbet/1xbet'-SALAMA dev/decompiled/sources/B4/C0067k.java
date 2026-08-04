package B4;

import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: B4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0067k implements InterfaceC0073q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1170c;

    public /* synthetic */ C0067k(int i7, Object obj, Object obj2) {
        this.f1168a = i7;
        this.f1170c = obj;
        this.f1169b = obj2;
    }

    @Override // B4.InterfaceC0073q
    public final void a(Object obj, I i7) {
        switch (this.f1168a) {
            case 0:
                E4.O o7 = (E4.O) obj;
                C0070n c0070n = (C0070n) this.f1170c;
                c0070n.getClass();
                InterfaceC0073q interfaceC0073q = (InterfaceC0073q) this.f1169b;
                if (i7 == null) {
                    p113p3.f.O("Got event without value or error set", o7 != null, new Object[0]);
                    p113p3.f.O("Too many documents returned on a document query", o7.f2157b.f3319a.size() <= 1, new Object[0]);
                    p075k4.c cVar = o7.f2157b.f3319a;
                    H4.h hVar = c0070n.f1179a;
                    H4.k kVar = (H4.k) cVar.m(hVar);
                    FirebaseFirestore firebaseFirestore = c0070n.f1180b;
                    boolean z4 = o7.f2160e;
                    interfaceC0073q.a(kVar != null ? new C0072p(firebaseFirestore, kVar.f3323a, kVar, z4, o7.f2161f.f14781a.l(kVar.f3323a)) : new C0072p(firebaseFirestore, hVar, null, z4, false), null);
                } else {
                    interfaceC0073q.a(null, i7);
                }
                break;
            case 1:
                E4.O o8 = (E4.O) obj;
                Z z7 = (Z) this.f1170c;
                z7.getClass();
                InterfaceC0073q interfaceC0073q2 = (InterfaceC0073q) this.f1169b;
                if (i7 == null) {
                    p113p3.f.O("Got event without value or error set", o8 != null, new Object[0]);
                    interfaceC0073q2.a(new c0(z7, o8, z7.f1136b), null);
                } else {
                    interfaceC0073q2.a(null, i7);
                }
                break;
            case 2:
                C0072p c0072p = (C0072p) obj;
                A5.h hVar2 = (A5.h) this.f1169b;
                I5.a aVar = (I5.a) this.f1170c;
                if (i7 == null) {
                    hVar2.c(p003a.a.r0(c0072p, aVar.f3695c).b());
                } else {
                    aVar.getClass();
                    hVar2.b("firebase_firestore", i7.getMessage(), Y4.D.m(i7));
                    hVar2.a();
                    aVar.b();
                }
                break;
            default:
                c0 c0Var = (c0) obj;
                I5.a aVar2 = (I5.a) this.f1170c;
                aVar2.getClass();
                A5.h hVar3 = (A5.h) this.f1169b;
                if (i7 == null) {
                    ArrayList arrayList = new ArrayList(3);
                    ArrayList arrayList2 = new ArrayList(c0Var.m().size());
                    ArrayList arrayList3 = new ArrayList(c0Var.l().size());
                    Iterator it = c0Var.m().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        EnumC0071o enumC0071o = aVar2.f3695c;
                        if (!zHasNext) {
                            Iterator it2 = c0Var.l().iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(p003a.a.q0((C0065i) it2.next(), enumC0071o).a());
                            }
                            arrayList.add(arrayList2);
                            arrayList.add(arrayList3);
                            arrayList.add(p003a.a.t0(c0Var.f1145f).b());
                            hVar3.c(arrayList);
                        } else {
                            arrayList2.add(p003a.a.r0((C0072p) it.next(), enumC0071o).b());
                        }
                    }
                } else {
                    hVar3.b("firebase_firestore", i7.getMessage(), Y4.D.m(i7));
                    hVar3.a();
                    aVar2.b();
                }
                break;
        }
    }
}
