package com.google.protobuf;

import W5.AbstractC0486a1;
import androidx.datastore.preferences.protobuf.C0686j;
import com.google.crypto.tink.shaded.protobuf.C0868d;

/* renamed from: com.google.protobuf.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0904g0 implements InterfaceC0925r0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0891a f12199a;

    /* renamed from: b, reason: collision with root package name */
    public final C0 f12200b;

    /* renamed from: c, reason: collision with root package name */
    public final C0930u f12201c;

    public C0904g0(C0 c0, C0930u c0930u, AbstractC0891a abstractC0891a) {
        this.f12200b = c0;
        c0930u.getClass();
        this.f12201c = c0930u;
        this.f12199a = abstractC0891a;
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final void a(Object obj, Object obj2) {
        AbstractC0927s0.A(this.f12200b, obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final void b(Object obj) {
        this.f12200b.getClass();
        C0.b(obj);
        this.f12201c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final boolean c(Object obj) {
        this.f12201c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final C d() {
        AbstractC0891a abstractC0891a = this.f12199a;
        return abstractC0891a instanceof C ? ((C) abstractC0891a).q() : ((A) ((C) abstractC0891a).j(5)).c();
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final void e(Object obj, X x4) {
        this.f12201c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final int f(C c3) {
        this.f12200b.getClass();
        return c3.unknownFields.hashCode();
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final void g(Object obj, C0686j c0686j, C0928t c0928t) {
        this.f12200b.getClass();
        C0.a(obj);
        this.f12201c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final int h(C c3) {
        this.f12200b.getClass();
        B0 b02 = c3.unknownFields;
        int i7 = b02.f12102d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < b02.f12099a; i9++) {
            int i10 = b02.f12100b[i9] >>> 3;
            i8 += AbstractC0923q.Y(3, (AbstractC0911k) b02.f12101c[i9]) + AbstractC0923q.q0(2, i10) + (AbstractC0923q.p0(1) * 2);
        }
        b02.f12102d = i8;
        return i8;
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final void i(Object obj, byte[] bArr, int i7, int i8, C0868d c0868d) {
        C c3 = (C) obj;
        if (c3.unknownFields == B0.f12098f) {
            c3.unknownFields = B0.c();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final boolean j(C c3, Object obj) {
        this.f12200b.getClass();
        return c3.unknownFields.equals(((C) obj).unknownFields);
    }
}
