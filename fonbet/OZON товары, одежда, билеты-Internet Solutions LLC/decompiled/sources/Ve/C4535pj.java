package Ve;

import R2.InterfaceC3917k;
import W2.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.pj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4535pj extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31800d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f31802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4593rk f31803g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f.a f31804h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4535pj(String str, C4593rk c4593rk, f.a aVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31802f = str;
        this.f31803g = c4593rk;
        this.f31804h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        C4535pj c4535pj = new C4535pj(this.f31802f, this.f31803g, this.f31804h, dVar);
        c4535pj.f31801e = obj;
        return c4535pj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4535pj) create((W2.b) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31800d;
        if (i11 == 0) {
            Sc.s.b(obj);
            W2.b bVar = (W2.b) this.f31801e;
            f.a aVar = this.f31804h;
            String str = this.f31802f;
            if (str == null) {
                this.f31800d = 1;
                C4571qq c4571qq = (C4571qq) this.f31803g.f31982c.getValue();
                Object a11 = W2.j.a((InterfaceC3917k) AbstractC4255g.f31066c.getValue(c4571qq.f31921a, AbstractC4255g.f31064a[0]), new Qj(aVar, null), this);
                if (a11 != obj2) {
                    a11 = Unit.f71690a;
                }
                if (a11 != obj2) {
                    a11 = Unit.f71690a;
                }
                if (a11 == obj2) {
                    return obj2;
                }
            } else {
                bVar.i(aVar, str);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
