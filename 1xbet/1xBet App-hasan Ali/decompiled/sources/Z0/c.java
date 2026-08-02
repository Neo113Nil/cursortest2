package Z0;

import A0.F;
import A0.r;
import android.view.WindowInsets;
import java.util.HashMap;
import n1.C;
import n1.k0;
import x0.InterfaceC2637x;
import z0.C2731G;
import z0.n0;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6264l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f6265m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2731G f6266n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(q qVar, C2731G c2731g, int i) {
        super(1);
        this.f6264l = i;
        this.f6265m = qVar;
        this.f6266n = c2731g;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        WindowInsets b3;
        switch (this.f6264l) {
            case 0:
                n0 n0Var = (n0) obj;
                F f = n0Var instanceof F ? (F) n0Var : null;
                q qVar = this.f6265m;
                if (f != null) {
                    HashMap<j, C2731G> holderToLayoutNode = f.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    C2731G c2731g = this.f6266n;
                    holderToLayoutNode.put(qVar, c2731g);
                    f.getAndroidViewsHandler$ui_release().addView(qVar);
                    f.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(c2731g, qVar);
                    qVar.setImportantForAccessibility(1);
                    C.d(qVar, new r(f, c2731g, f));
                }
                if (qVar.getView().getParent() != qVar) {
                    qVar.addView(qVar.getView());
                }
                break;
            case 1:
                k.d(this.f6265m, this.f6266n);
                break;
            default:
                q qVar2 = this.f6265m;
                k.d(qVar2, this.f6266n);
                ((F) qVar2.f6296m).K = true;
                int[] iArr = qVar2.f6307x;
                int i = iArr[0];
                int i5 = iArr[1];
                qVar2.getView().getLocationOnScreen(iArr);
                long j5 = qVar2.f6308y;
                long I5 = ((InterfaceC2637x) obj).I();
                qVar2.f6308y = I5;
                k0 k0Var = qVar2.f6309z;
                if (k0Var != null && ((i != iArr[0] || i5 != iArr[1] || !W0.l.a(j5, I5)) && (b3 = qVar2.m(k0Var).b()) != null)) {
                    qVar2.getView().dispatchApplyWindowInsets(b3);
                }
                break;
        }
        return W3.o.f6046a;
    }
}
