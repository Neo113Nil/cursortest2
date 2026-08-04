package p028d6;

import U5.AbstractC0440g;
import U5.AbstractC0442i;
import U5.C0441h;
import U5.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC0440g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f12470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f12471b;

    public r(l lVar, r rVar) {
        this.f12470a = lVar;
        this.f12471b = rVar;
    }

    @Override // U5.AbstractC0440g
    public final AbstractC0442i a(C0441h c0441h, b0 b0Var) {
        r rVar = this.f12471b;
        return rVar != null ? new p(this, rVar.a(c0441h, b0Var)) : new q(this);
    }
}
