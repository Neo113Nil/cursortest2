package Hf;

import C.o0;

/* loaded from: classes6.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private u f10926a = null;

    /* renamed from: b, reason: collision with root package name */
    private u f10927b = null;

    /* renamed from: c, reason: collision with root package name */
    private u f10928c = null;

    /* renamed from: d, reason: collision with root package name */
    private u f10929d = null;

    /* renamed from: e, reason: collision with root package name */
    private u f10930e = null;

    public abstract void a(B b11);

    public final void b(u uVar) {
        uVar.l();
        uVar.j(this);
        u uVar2 = this.f10928c;
        if (uVar2 == null) {
            this.f10927b = uVar;
            this.f10928c = uVar;
        } else {
            uVar2.f10930e = uVar;
            uVar.f10929d = uVar2;
            this.f10928c = uVar;
        }
    }

    public final u c() {
        return this.f10927b;
    }

    public final u d() {
        return this.f10928c;
    }

    public final u e() {
        return this.f10930e;
    }

    public u f() {
        return this.f10926a;
    }

    public final u g() {
        return this.f10929d;
    }

    public final void h(u uVar) {
        uVar.l();
        u uVar2 = this.f10930e;
        uVar.f10930e = uVar2;
        if (uVar2 != null) {
            uVar2.f10929d = uVar;
        }
        uVar.f10929d = this;
        this.f10930e = uVar;
        u uVar3 = this.f10926a;
        uVar.f10926a = uVar3;
        if (uVar.f10930e == null) {
            uVar3.f10928c = uVar;
        }
    }

    public final void i(u uVar) {
        uVar.l();
        u uVar2 = this.f10929d;
        uVar.f10929d = uVar2;
        if (uVar2 != null) {
            uVar2.f10930e = uVar;
        }
        uVar.f10930e = this;
        this.f10929d = uVar;
        u uVar3 = this.f10926a;
        uVar.f10926a = uVar3;
        if (uVar.f10929d == null) {
            uVar3.f10927b = uVar;
        }
    }

    protected void j(u uVar) {
        this.f10926a = uVar;
    }

    protected String k() {
        return "";
    }

    public final void l() {
        u uVar = this.f10929d;
        if (uVar != null) {
            uVar.f10930e = this.f10930e;
        } else {
            u uVar2 = this.f10926a;
            if (uVar2 != null) {
                uVar2.f10927b = this.f10930e;
            }
        }
        u uVar3 = this.f10930e;
        if (uVar3 != null) {
            uVar3.f10929d = uVar;
        } else {
            u uVar4 = this.f10926a;
            if (uVar4 != null) {
                uVar4.f10928c = uVar;
            }
        }
        this.f10926a = null;
        this.f10930e = null;
        this.f10929d = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        return o0.c(sb2, k(), "}");
    }
}
