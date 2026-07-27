package P4;

import a.AbstractC0169a;
import b2.AbstractC0279e;
import f4.EnumC0429f;

/* renamed from: P4.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143w implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2411a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2412b;

    public C0143w() {
        this.f2411a = 1;
        this.f2412b = AbstractC0169a.z(EnumC0429f.f5665a, new M.U(3, this));
    }

    @Override // M4.a
    public final Object a(O4.b decoder) {
        switch (this.f2411a) {
            case 0:
                kotlin.jvm.internal.i.e(decoder, "decoder");
                throw new IllegalStateException("unsupported");
            default:
                kotlin.jvm.internal.i.e(decoder, "decoder");
                N4.e c2 = c();
                O4.a o2 = decoder.o(c2);
                int g6 = o2.g(c());
                if (g6 != -1) {
                    throw new M4.c(AbstractC0279e.d(g6, "Unexpected index "));
                }
                o2.l(c2);
                return f4.v.f5689a;
        }
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object value) {
        switch (this.f2411a) {
            case 0:
                throw new IllegalStateException("unsupported");
            default:
                kotlin.jvm.internal.i.e(value, "value");
                sVar.a(c()).p(c());
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [f4.e, java.lang.Object] */
    @Override // M4.a
    public final N4.e c() {
        switch (this.f2411a) {
            case 0:
                throw new IllegalStateException("unsupported");
            default:
                return (N4.e) this.f2412b.getValue();
        }
    }

    public C0143w(M4.a aVar) {
        this.f2411a = 0;
        this.f2412b = aVar;
    }
}
