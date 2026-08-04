package K4;

import C0.C0083b;
import U5.AbstractC0439f;
import U5.AbstractC0457y;
import U5.b0;
import U5.l0;
import com.google.protobuf.AbstractC0847a;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends AbstractC0457y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B1.m f4041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0439f[] f4042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f4043c;

    public n(r rVar, B1.m mVar, AbstractC0439f[] abstractC0439fArr) {
        this.f4043c = rVar;
        this.f4041a = mVar;
        this.f4042b = abstractC0439fArr;
    }

    @Override // U5.AbstractC0457y
    public final void g(l0 l0Var, b0 b0Var) {
        try {
            B1.m mVar = this.f4041a;
            ((C0083b) mVar.f1015c).E(new A0.f(26, mVar, l0Var));
        } catch (Throwable th) {
            this.f4043c.f4053a.c(th);
        }
    }

    @Override // U5.AbstractC0457y
    public final void h(b0 b0Var) {
        try {
            B1.m mVar = this.f4041a;
            ((C0083b) mVar.f1015c).E(new A0.f(25, mVar, b0Var));
        } catch (Throwable th) {
            this.f4043c.f4053a.c(th);
        }
    }

    @Override // U5.AbstractC0457y
    public final void i(AbstractC0847a abstractC0847a) {
        try {
            B1.m mVar = this.f4041a;
            int i7 = mVar.f1014b + 1;
            ((C0083b) mVar.f1015c).E(new A0.a(mVar, i7, abstractC0847a, 2));
            mVar.f1014b = i7;
            this.f4042b[0].c(1);
        } catch (Throwable th) {
            this.f4043c.f4053a.c(th);
        }
    }

    @Override // U5.AbstractC0457y
    public final void j() {
    }
}
