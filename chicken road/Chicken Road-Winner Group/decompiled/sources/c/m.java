package c;

import android.util.Log;
import d2.C0279i;
import e2.C0289d;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2519e;
    public final /* synthetic */ R0.n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(R0.n nVar, int i3) {
        super(0);
        this.f2519e = i3;
        this.f = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    @Override // o2.a
    public final Object invoke() {
        P.h hVar;
        switch (this.f2519e) {
            case 0:
                this.f.b();
                return C0279i.f4852a;
            case 1:
                R0.n nVar = this.f;
                P.h hVar2 = (P.h) nVar.f1225d;
                if (hVar2 == null) {
                    C0289d c0289d = (C0289d) nVar.f1224c;
                    ListIterator listIterator = c0289d.listIterator(c0289d.b());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            hVar = listIterator.previous();
                            if (((P.h) hVar).f1100a) {
                            }
                        } else {
                            hVar = 0;
                        }
                    }
                    hVar2 = hVar;
                }
                nVar.f1225d = null;
                if (hVar2 != null) {
                    boolean j3 = P.k.j(3);
                    P.k kVar = hVar2.f1101b;
                    if (j3) {
                        Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + kVar);
                    }
                    P.a aVar = kVar.f1105d;
                    if (aVar != null) {
                        aVar.f1075c = false;
                        aVar.a(false);
                        kVar.i();
                        throw null;
                    }
                    kVar.f1105d = null;
                }
                return C0279i.f4852a;
            default:
                this.f.b();
                return C0279i.f4852a;
        }
    }
}
