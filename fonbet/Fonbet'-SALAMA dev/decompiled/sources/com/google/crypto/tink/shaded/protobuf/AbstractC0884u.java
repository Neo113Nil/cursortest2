package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0884u implements Q, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0886w f11826a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0886w f11827b;

    public AbstractC0884u(AbstractC0886w abstractC0886w) {
        this.f11826a = abstractC0886w;
        if (abstractC0886w.p()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f11827b = abstractC0886w.s();
    }

    public static void f(Object obj, Object obj2) {
        Z z4 = Z.f11748c;
        z4.getClass();
        z4.a(obj.getClass()).a(obj, obj2);
    }

    public final AbstractC0886w b() {
        AbstractC0886w c3 = c();
        c3.getClass();
        if (AbstractC0886w.o(c3, true)) {
            return c3;
        }
        throw new e0();
    }

    public final AbstractC0886w c() {
        if (!this.f11827b.p()) {
            return this.f11827b;
        }
        AbstractC0886w abstractC0886w = this.f11827b;
        abstractC0886w.getClass();
        Z z4 = Z.f11748c;
        z4.getClass();
        z4.a(abstractC0886w.getClass()).b(abstractC0886w);
        abstractC0886w.q();
        return this.f11827b;
    }

    public final AbstractC0884u d() {
        AbstractC0884u d7 = this.f11826a.d();
        d7.f11827b = c();
        return d7;
    }

    public final void e() {
        if (this.f11827b.p()) {
            return;
        }
        AbstractC0886w s7 = this.f11826a.s();
        f(s7, this.f11827b);
        this.f11827b = s7;
    }
}
