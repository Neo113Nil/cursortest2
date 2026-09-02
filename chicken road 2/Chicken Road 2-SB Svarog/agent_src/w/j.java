package w;

import F.C0017s;
import a.AbstractC0018a;
import android.app.Activity;
import f0.p;
import o.ExecutorC0072d;
import o0.r;
import x.InterfaceC0099a;

/* loaded from: classes.dex */
public final class j extends a0.f implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1301f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0093b f1303h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Activity f1304i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0093b c0093b, Activity activity, Y.d dVar) {
        super(dVar);
        this.f1303h = c0093b;
        this.f1304i = activity;
    }

    @Override // a0.b
    public final Y.d b(Y.d dVar, Object obj) {
        j jVar = new j(this.f1303h, this.f1304i, dVar);
        jVar.f1302g = obj;
        return jVar;
    }

    @Override // a0.b
    public final Object c(Object obj) {
        int i2 = this.f1301f;
        if (i2 == 0) {
            AbstractC0018a.C(obj);
            r rVar = (r) this.f1302g;
            C0017s c0017s = new C0017s(1, rVar);
            C0093b c0093b = this.f1303h;
            ((InterfaceC0099a) c0093b.f1285c).a(this.f1304i, new ExecutorC0072d(), c0017s);
            i iVar = new i(c0093b, c0017s);
            this.f1301f = 1;
            Object a2 = o0.j.a(rVar, iVar, this);
            Z.a aVar = Z.a.f411b;
            if (a2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0018a.C(obj);
        }
        return W.g.f394a;
    }

    @Override // f0.p
    public final Object g(Object obj, Object obj2) {
        return ((j) b((Y.d) obj2, (r) obj)).c(W.g.f394a);
    }
}
