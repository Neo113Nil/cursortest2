package com.google.protobuf;

import W5.AbstractC0486a1;
import androidx.datastore.preferences.protobuf.C0665j;
import com.google.crypto.tink.shaded.protobuf.C0824d;

/* JADX INFO: renamed from: com.google.protobuf.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0860g0 implements InterfaceC0881r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0847a f12199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0 f12200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0886u f12201c;

    public C0860g0(C0 c0, C0886u c0886u, AbstractC0847a abstractC0847a) {
        this.f12200b = c0;
        c0886u.getClass();
        this.f12201c = c0886u;
        this.f12199a = abstractC0847a;
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final void a(Object obj, Object obj2) {
        AbstractC0883s0.A(this.f12200b, obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final void b(Object obj) {
        this.f12200b.getClass();
        C0.b(obj);
        this.f12201c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final boolean c(Object obj) {
        this.f12201c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final C d() {
        AbstractC0847a abstractC0847a = this.f12199a;
        return abstractC0847a instanceof C ? ((C) abstractC0847a).q() : ((A) ((C) abstractC0847a).j(5)).c();
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final void e(Object obj, X x4) {
        this.f12201c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final int f(C c3) {
        this.f12200b.getClass();
        return c3.unknownFields.hashCode();
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final void g(Object obj, C0665j c0665j, C0884t c0884t) {
        this.f12200b.getClass();
        C0.a(obj);
        this.f12201c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final int h(C c3) {
        this.f12200b.getClass();
        B0 b7 = c3.unknownFields;
        int i7 = b7.f12102d;
        if (i7 != -1) {
            return i7;
        }
        int iY = 0;
        for (int i8 = 0; i8 < b7.f12099a; i8++) {
            int i9 = b7.f12100b[i8] >>> 3;
            iY += AbstractC0879q.Y(3, (AbstractC0867k) b7.f12101c[i8]) + AbstractC0879q.q0(2, i9) + (AbstractC0879q.p0(1) * 2);
        }
        b7.f12102d = iY;
        return iY;
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final void i(Object obj, byte[] bArr, int i7, int i8, C0824d c0824d) {
        C c3 = (C) obj;
        if (c3.unknownFields == B0.f12098f) {
            c3.unknownFields = B0.c();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final boolean j(C c3, Object obj) {
        this.f12200b.getClass();
        return c3.unknownFields.equals(((C) obj).unknownFields);
    }
}
