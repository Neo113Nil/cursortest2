package Ve;

import W2.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Dd extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28854d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f28855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f28856f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Le f28857g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f.a f28858h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dd(String str, Le le2, f.a aVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28856f = str;
        this.f28857g = le2;
        this.f28858h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        Dd dd = new Dd(this.f28856f, this.f28857g, this.f28858h, dVar);
        dd.f28855e = obj;
        return dd;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Dd) create((W2.f) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28854d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            W2.b bVar = (W2.b) this.f28855e;
            Sc.s.b(obj);
            return bVar;
        }
        Sc.s.b(obj);
        W2.b d11 = ((W2.f) this.f28855e).d();
        String str = this.f28856f;
        f.a aVar = this.f28858h;
        if (str != null) {
            d11.i(aVar, str);
            return d11;
        }
        this.f28855e = d11;
        this.f28854d = 1;
        Object a11 = AbstractC4445mg.f31590b.getValue(this.f28857g.f29422b, AbstractC4445mg.f31589a[0]).a(new C4356je(aVar, null), this);
        if (a11 != obj2) {
            a11 = Unit.f71690a;
        }
        return a11 == obj2 ? obj2 : d11;
    }
}
