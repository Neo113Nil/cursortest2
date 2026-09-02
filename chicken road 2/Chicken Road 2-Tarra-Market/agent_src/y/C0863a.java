package y;

import A.i;
import M0.d;
import O0.g;
import U0.p;
import b1.r;
import e1.c;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0863a extends g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f6795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f6796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f6797g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0863a(c cVar, i iVar, d dVar) {
        super(dVar);
        this.f6796f = cVar;
        this.f6797g = iVar;
    }

    @Override // O0.b
    public final d a(Object obj, d dVar) {
        return new C0863a(this.f6796f, this.f6797g, dVar);
    }

    @Override // O0.b
    public final Object b(Object obj) {
        N0.a aVar = N0.a.f260a;
        int i2 = this.f6795e;
        if (i2 == 0) {
            V.a.C(obj);
            io.flutter.plugin.editing.a aVar2 = new io.flutter.plugin.editing.a(14, this.f6797g);
            this.f6795e = 1;
            if (this.f6796f.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.a.C(obj);
        }
        return K0.i.f206a;
    }

    @Override // U0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0863a) a((r) obj, (d) obj2)).b(K0.i.f206a);
    }
}
