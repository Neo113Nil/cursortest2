package Ve;

import kotlin.jvm.internal.Intrinsics;
import r.o;
import xe.C10737n;

/* renamed from: Ve.zm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4823zm extends o.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C10737n f32673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4164cn f32674b;

    public C4823zm(C10737n c10737n, C4164cn c4164cn) {
        this.f32673a = c10737n;
        this.f32674b = c4164cn;
    }

    @Override // r.o.a
    public final void onAuthenticationError(int i11, CharSequence errString) {
        Intrinsics.checkNotNullParameter(errString, "errString");
        super.onAuthenticationError(i11, errString);
        C4105am c4105am = new C4105am("Authentication error: " + ((Object) errString), false, 1);
        C10737n c10737n = this.f32673a;
        Intrinsics.checkNotNullParameter(c10737n, "<this>");
        if (c10737n.isActive()) {
            c10737n.u(c4105am, null);
        }
        this.f32674b.f30826b.b(new Bi(Xf.LC_FAIL_BIO_AUTH, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120));
    }

    @Override // r.o.a
    public final void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        C4164cn c4164cn = this.f32674b;
        int i11 = c4164cn.f30827c + 1;
        c4164cn.f30827c = i11;
        if (i11 >= 3) {
            C4105am c4105am = new C4105am("Authentication failed", false, 1);
            C10737n c10737n = this.f32673a;
            Intrinsics.checkNotNullParameter(c10737n, "<this>");
            if (c10737n.isActive()) {
                c10737n.u(c4105am, null);
            }
        }
        c4164cn.f30826b.b(new Bi(Xf.LC_FAIL_BIO_AUTH, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120));
    }

    @Override // r.o.a
    public final void onAuthenticationSucceeded(o.b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        super.onAuthenticationSucceeded(result);
        C4164cn c4164cn = this.f32674b;
        ((Yq) c4164cn.f30825a).f30523d = true;
        C4105am c4105am = new C4105am(null, true, 3);
        C10737n c10737n = this.f32673a;
        Intrinsics.checkNotNullParameter(c10737n, "<this>");
        if (c10737n.isActive()) {
            c10737n.u(c4105am, null);
        }
        c4164cn.f30826b.b(new Bi(Xf.LC_GOOD_BIO_AUTH, Ur.PAY_VIEW, Pe.LC, null, null, null, null, 120));
    }
}
