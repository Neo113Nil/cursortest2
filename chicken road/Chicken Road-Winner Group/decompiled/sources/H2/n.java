package H2;

import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.y6;
import d2.C0279i;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f543b;

    public /* synthetic */ n(int i3, Object obj) {
        this.f542a = i3;
        this.f543b = obj;
    }

    @Override // o2.a
    public final Object invoke() {
        h hVar;
        switch (this.f542a) {
            case 0:
                p pVar = (p) this.f543b;
                if (pVar.f558n && (hVar = pVar.f550e) != null) {
                    hVar.d();
                }
                return C0279i.f4852a;
            case 1:
                ((c.k) this.f543b).reportFullyDrawn();
                return null;
            default:
                return y6.a((ib) this.f543b);
        }
    }
}
