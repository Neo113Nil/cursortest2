package i;

import P.U;
import P.b0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f13716b;

    public /* synthetic */ n(v vVar, int i7) {
        this.f13715a = i7;
        this.f13716b = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r3.isLaidOut() != false) goto L15;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z4 = true;
        v vVar = this.f13716b;
        switch (this.f13715a) {
            case 0:
                if ((1 & vVar.f13789q0) != 0) {
                    vVar.w(0);
                }
                if ((vVar.f13789q0 & 4096) != 0) {
                    vVar.w(108);
                }
                vVar.f13788p0 = false;
                vVar.f13789q0 = 0;
                break;
            default:
                vVar.f13761N.showAtLocation(vVar.f13760M, 55, 0, 0);
                b0 b0Var = vVar.f13763P;
                if (b0Var != null) {
                    b0Var.b();
                }
                if (vVar.f13764Q && (r3 = vVar.f13765R) != null) {
                    WeakHashMap weakHashMap = U.f5037a;
                    break;
                }
                z4 = false;
                if (!z4) {
                    vVar.f13760M.setAlpha(1.0f);
                    vVar.f13760M.setVisibility(0);
                    break;
                } else {
                    vVar.f13760M.setAlpha(0.0f);
                    b0 a2 = U.a(vVar.f13760M);
                    a2.a(1.0f);
                    vVar.f13763P = a2;
                    a2.d(new o(this, 0));
                    break;
                }
                break;
        }
    }
}
