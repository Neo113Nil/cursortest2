package Y3;

import android.content.Context;
import g4.C1128a;
import g4.C1133f;
import g4.C1145r;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements N4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7655b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7656c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f7654a = i7;
        this.f7655b = obj;
        this.f7656c = obj2;
    }

    @Override // N4.b
    public final Object get() {
        switch (this.f7654a) {
            case 0:
                i iVar = (i) this.f7655b;
                return new O4.a((Context) this.f7656c, iVar.g(), (A4.b) iVar.f7666d.a(A4.b.class));
            default:
                C1133f c1133f = (C1133f) this.f7655b;
                c1133f.getClass();
                C1128a c1128a = (C1128a) this.f7656c;
                return c1128a.f13188f.e(new C1145r(c1128a, c1133f));
        }
    }
}
