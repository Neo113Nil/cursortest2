package p010b0;

import j6.a;
import p065i6.d;
import p077k6.i;
import s6.o;

/* JADX INFO: loaded from: classes.dex */
public final class r extends i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10090a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10092c;

    public /* synthetic */ r(int i7, d dVar) {
        super(i7, dVar);
    }

    @Override // s6.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10090a) {
            case 0:
                return new r((O) this.f10092c, (d) obj3).invokeSuspend(p044f6.i.f13014a);
            default:
                ((Boolean) obj2).getClass();
                r rVar = new r(3, (d) obj3);
                rVar.f10092c = (Q) obj;
                return rVar.invokeSuspend(p044f6.i.f13014a);
        }
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10090a) {
            case 0:
                a aVar = a.f14648a;
                int i7 = this.f10091b;
                if (i7 == 0) {
                    p003a.a.p0(obj);
                    this.f10091b = 1;
                    if (O.b((O) this.f10092c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj);
                }
                return p044f6.i.f13014a;
            default:
                a aVar2 = a.f14648a;
                int i8 = this.f10091b;
                if (i8 == 0) {
                    p003a.a.p0(obj);
                    Q q7 = (Q) this.f10092c;
                    this.f10091b = 1;
                    q7.getClass();
                    obj = Q.a(q7, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj);
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(O o7, d dVar) {
        super(3, dVar);
        this.f10092c = o7;
    }
}
