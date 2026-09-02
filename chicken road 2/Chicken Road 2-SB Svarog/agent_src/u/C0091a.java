package u;

import W.g;
import Y.d;
import a.AbstractC0018a;
import a0.f;
import f0.p;
import io.flutter.plugin.platform.i;
import m0.r;
import p0.c;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091a extends f implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1273f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f1274g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l.a f1275h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091a(c cVar, l.a aVar, d dVar) {
        super(dVar);
        this.f1274g = cVar;
        this.f1275h = aVar;
    }

    @Override // a0.b
    public final d b(d dVar, Object obj) {
        return new C0091a(this.f1274g, this.f1275h, dVar);
    }

    @Override // a0.b
    public final Object c(Object obj) {
        int i2 = this.f1273f;
        if (i2 == 0) {
            AbstractC0018a.C(obj);
            i iVar = new i(3, this.f1275h);
            this.f1273f = 1;
            Object b2 = this.f1274g.b(iVar, this);
            Z.a aVar = Z.a.f411b;
            if (b2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0018a.C(obj);
        }
        return g.f394a;
    }

    @Override // f0.p
    public final Object g(Object obj, Object obj2) {
        return ((C0091a) b((d) obj2, (r) obj)).c(g.f394a);
    }
}
