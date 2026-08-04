package com.google.crypto.tink.shaded.protobuf;

import W5.AbstractC0486a1;
import androidx.datastore.preferences.protobuf.C0665j;

/* JADX INFO: loaded from: classes2.dex */
public final class U implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0821a f11743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f11744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0836p f11745c;

    public U(g0 g0Var, C0836p c0836p, AbstractC0821a abstractC0821a) {
        this.f11744b = g0Var;
        c0836p.getClass();
        this.f11745c = c0836p;
        this.f11743a = abstractC0821a;
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
        AbstractC0821a abstractC0821a = this.f11743a;
        return abstractC0821a instanceof AbstractC0842w ? ((AbstractC0842w) abstractC0821a).s() : abstractC0821a.d().c();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final int e(AbstractC0842w abstractC0842w) {
        this.f11744b.getClass();
        return abstractC0842w.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final int f(AbstractC0842w abstractC0842w) {
        this.f11744b.getClass();
        f0 f0Var = abstractC0842w.unknownFields;
        int i7 = f0Var.f11773d;
        if (i7 != -1) {
            return i7;
        }
        int iI0 = 0;
        for (int i8 = 0; i8 < f0Var.f11770a; i8++) {
            int i9 = f0Var.f11771b[i8] >>> 3;
            iI0 += C0832l.i0(3, (AbstractC0829i) f0Var.f11772c[i8]) + C0832l.A0(2, i9) + (C0832l.z0(1) * 2);
        }
        f0Var.f11773d = iI0;
        return iI0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void g(Object obj, byte[] bArr, int i7, int i8, C0824d c0824d) {
        AbstractC0842w abstractC0842w = (AbstractC0842w) obj;
        if (abstractC0842w.unknownFields == f0.f11769f) {
            abstractC0842w.unknownFields = f0.c();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final boolean h(AbstractC0842w abstractC0842w, Object obj) {
        this.f11744b.getClass();
        return abstractC0842w.unknownFields.equals(((AbstractC0842w) obj).unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void i(Object obj, L l7) {
        this.f11745c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void j(Object obj, C0665j c0665j, C0835o c0835o) {
        this.f11744b.getClass();
        g0.a(obj);
        this.f11745c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
