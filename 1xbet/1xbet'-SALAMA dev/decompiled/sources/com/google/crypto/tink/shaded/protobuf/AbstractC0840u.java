package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0840u implements Q, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0842w f11826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC0842w f11827b;

    public AbstractC0840u(AbstractC0842w abstractC0842w) {
        this.f11826a = abstractC0842w;
        if (abstractC0842w.p()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f11827b = abstractC0842w.s();
    }

    public static void f(Object obj, Object obj2) {
        Z z4 = Z.f11748c;
        z4.getClass();
        z4.a(obj.getClass()).a(obj, obj2);
    }

    public final AbstractC0842w b() {
        AbstractC0842w abstractC0842wC = c();
        abstractC0842wC.getClass();
        if (AbstractC0842w.o(abstractC0842wC, true)) {
            return abstractC0842wC;
        }
        throw new e0();
    }

    public final AbstractC0842w c() {
        if (!this.f11827b.p()) {
            return this.f11827b;
        }
        AbstractC0842w abstractC0842w = this.f11827b;
        abstractC0842w.getClass();
        Z z4 = Z.f11748c;
        z4.getClass();
        z4.a(abstractC0842w.getClass()).b(abstractC0842w);
        abstractC0842w.q();
        return this.f11827b;
    }

    public final AbstractC0840u d() {
        AbstractC0840u abstractC0840uD = this.f11826a.d();
        abstractC0840uD.f11827b = c();
        return abstractC0840uD;
    }

    public final void e() {
        if (this.f11827b.p()) {
            return;
        }
        AbstractC0842w abstractC0842wS = this.f11826a.s();
        f(abstractC0842wS, this.f11827b);
        this.f11827b = abstractC0842wS;
    }
}
