package com.google.crypto.tink.shaded.protobuf;

import W5.AbstractC0486a1;
import androidx.datastore.preferences.protobuf.C0686j;

/* loaded from: classes2.dex */
public final class U implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0865a f11743a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f11744b;

    /* renamed from: c, reason: collision with root package name */
    public final C0880p f11745c;

    public U(g0 g0Var, C0880p c0880p, AbstractC0865a abstractC0865a) {
        this.f11744b = g0Var;
        c0880p.getClass();
        this.f11745c = c0880p;
        this.f11743a = abstractC0865a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void a(Object obj, Object obj2) {
        d0.B(this.f11744b, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void b(Object obj) {
        this.f11744b.getClass();
        g0.b(obj);
        this.f11745c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final boolean c(Object obj) {
        this.f11745c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final Object d() {
        AbstractC0865a abstractC0865a = this.f11743a;
        return abstractC0865a instanceof AbstractC0886w ? ((AbstractC0886w) abstractC0865a).s() : abstractC0865a.d().c();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final int e(AbstractC0886w abstractC0886w) {
        this.f11744b.getClass();
        return abstractC0886w.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final int f(AbstractC0886w abstractC0886w) {
        this.f11744b.getClass();
        f0 f0Var = abstractC0886w.unknownFields;
        int i7 = f0Var.f11773d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < f0Var.f11770a; i9++) {
            int i10 = f0Var.f11771b[i9] >>> 3;
            i8 += C0876l.i0(3, (AbstractC0873i) f0Var.f11772c[i9]) + C0876l.A0(2, i10) + (C0876l.z0(1) * 2);
        }
        f0Var.f11773d = i8;
        return i8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void g(Object obj, byte[] bArr, int i7, int i8, C0868d c0868d) {
        AbstractC0886w abstractC0886w = (AbstractC0886w) obj;
        if (abstractC0886w.unknownFields == f0.f11769f) {
            abstractC0886w.unknownFields = f0.c();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final boolean h(AbstractC0886w abstractC0886w, Object obj) {
        this.f11744b.getClass();
        return abstractC0886w.unknownFields.equals(((AbstractC0886w) obj).unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void i(Object obj, L l7) {
        this.f11745c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void j(Object obj, C0686j c0686j, C0879o c0879o) {
        this.f11744b.getClass();
        g0.a(obj);
        this.f11745c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
