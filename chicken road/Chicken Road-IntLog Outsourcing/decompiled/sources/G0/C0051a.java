package G0;

import b0.InterfaceC0262c;
import b0.InterfaceC0263d;

/* renamed from: G0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051a implements InterfaceC0263d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f812a;

    /* renamed from: b, reason: collision with root package name */
    public String f813b;

    @Override // b0.InterfaceC0263d
    public String a() {
        return this.f813b;
    }

    public C0061k c() {
        if (this.f813b == null) {
            throw new IllegalArgumentException("Product type must be set");
        }
        C0061k c0061k = new C0061k();
        c0061k.f864a = this.f813b;
        return c0061k;
    }

    public void d(String str) {
        this.f813b = str;
    }

    public String toString() {
        switch (this.f812a) {
            case 2:
                return B0.o.l(new StringBuilder("<"), this.f813b, '>');
            case 3:
                return this.f813b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0051a(String str, int i2) {
        this.f812a = i2;
        this.f813b = str;
    }

    public C0051a(String query) {
        this.f812a = 4;
        kotlin.jvm.internal.i.e(query, "query");
        this.f813b = query;
    }

    @Override // b0.InterfaceC0263d
    public void b(InterfaceC0262c interfaceC0262c) {
    }
}
