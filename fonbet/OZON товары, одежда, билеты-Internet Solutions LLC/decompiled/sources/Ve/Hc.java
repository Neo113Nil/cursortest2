package Ve;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;
import xe.C10720e0;

/* loaded from: classes10.dex */
public final class Hc extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public Qd f29137d;

    /* renamed from: e, reason: collision with root package name */
    public C4442md f29138e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2395h f29139f;

    /* renamed from: g, reason: collision with root package name */
    public xe.I f29140g;

    /* renamed from: h, reason: collision with root package name */
    public Qd f29141h;

    /* renamed from: i, reason: collision with root package name */
    public Object f29142i;

    /* renamed from: j, reason: collision with root package name */
    public int f29143j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f29144k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Qd f29145l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C4442md f29146m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f29147n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xe.I f29148o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hc(Qd qd2, C4442md c4442md, InterfaceC2395h interfaceC2395h, xe.I i11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29145l = qd2;
        this.f29146m = c4442md;
        this.f29147n = interfaceC2395h;
        this.f29148o = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        Hc hc2 = new Hc(this.f29145l, this.f29146m, this.f29147n, this.f29148o, dVar);
        hc2.f29144k = obj;
        return hc2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Hc) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Qd qd2;
        C4442md c4442md;
        InterfaceC2395h interfaceC2395h;
        xe.M m11;
        xe.I i11;
        Qd qd3;
        Qd qd4;
        InterfaceC2395h interfaceC2395h2;
        InterfaceC2395h interfaceC2395h3;
        Qd qd5;
        xe.I i12;
        InterfaceC2395h interfaceC2395h4;
        C4442md c4442md2;
        Qd qd6;
        xe.M m12;
        SpasiboBonusesRequestBody spasiboBonusesRequestBody;
        int i13 = 0;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i14 = this.f29143j;
        kotlin.coroutines.d dVar = null;
        if (i14 == 0) {
            Sc.s.b(obj);
            xe.M m13 = (xe.M) this.f29144k;
            qd2 = this.f29145l;
            String str = qd2.f29772d;
            this.f29144k = m13;
            this.f29137d = qd2;
            C4442md c4442md3 = this.f29146m;
            this.f29138e = c4442md3;
            InterfaceC2395h interfaceC2395h5 = this.f29147n;
            this.f29139f = interfaceC2395h5;
            xe.I i15 = this.f29148o;
            this.f29140g = i15;
            this.f29141h = qd2;
            this.f29142i = qd2;
            this.f29143j = 1;
            Object b11 = C4442md.b(c4442md3, str, qd2.f29770b, this);
            if (b11 != aVar) {
                c4442md = c4442md3;
                interfaceC2395h = interfaceC2395h5;
                m11 = m13;
                obj = b11;
                i11 = i15;
                qd3 = qd2;
                qd4 = qd3;
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2395h3 = (InterfaceC2395h) this.f29142i;
            qd5 = this.f29141h;
            i12 = this.f29140g;
            interfaceC2395h4 = this.f29139f;
            c4442md2 = this.f29138e;
            qd6 = this.f29137d;
            m12 = (xe.M) this.f29144k;
            Sc.s.b(obj);
            InterfaceC2395h interfaceC2395h6 = (InterfaceC2395h) obj;
            C2399j.C(new C2408n0(C2399j.B(new C4239fc(interfaceC2395h3 == null ? new Be.q(interfaceC2395h3, interfaceC2395h4, new C4525p9(3, null)) : interfaceC2395h6 != null ? new Be.q(interfaceC2395h6, interfaceC2395h4, new R9(3, null)) : C2399j.Q(interfaceC2395h4, new C4727wa(3, i13, dVar)), c4442md2, qd5, i12), i12), new M8(c4442md2, dVar, i13)), m12);
            return qd6;
        }
        qd2 = (Qd) this.f29142i;
        qd3 = this.f29141h;
        i11 = this.f29140g;
        interfaceC2395h = this.f29139f;
        c4442md = this.f29138e;
        qd4 = this.f29137d;
        m11 = (xe.M) this.f29144k;
        Sc.s.b(obj);
        InterfaceC2395h interfaceC2395h7 = (InterfaceC2395h) obj;
        String str2 = qd2.f29772d;
        this.f29144k = m11;
        this.f29137d = qd4;
        this.f29138e = c4442md;
        this.f29139f = interfaceC2395h;
        this.f29140g = i11;
        this.f29141h = qd3;
        this.f29142i = interfaceC2395h7;
        this.f29143j = 2;
        if (!Intrinsics.d(((C4654tn) c4442md.f31584e).j(), PayStrategy.PayWithBonuses.INSTANCE) || (spasiboBonusesRequestBody = qd2.f29771c) == null) {
            interfaceC2395h2 = null;
        } else {
            C4190dk c4190dk = new C4190dk(str2, spasiboBonusesRequestBody);
            C10720e0 c10720e0 = C10720e0.f105451a;
            interfaceC2395h2 = C2399j.A(new Yi(c4442md.f31583d, c4190dk, He.b.f10879b, null));
        }
        if (interfaceC2395h2 != aVar) {
            interfaceC2395h3 = interfaceC2395h7;
            obj = interfaceC2395h2;
            qd5 = qd3;
            i12 = i11;
            interfaceC2395h4 = interfaceC2395h;
            c4442md2 = c4442md;
            qd6 = qd4;
            m12 = m11;
            InterfaceC2395h interfaceC2395h62 = (InterfaceC2395h) obj;
            C2399j.C(new C2408n0(C2399j.B(new C4239fc(interfaceC2395h3 == null ? new Be.q(interfaceC2395h3, interfaceC2395h4, new C4525p9(3, null)) : interfaceC2395h62 != null ? new Be.q(interfaceC2395h62, interfaceC2395h4, new R9(3, null)) : C2399j.Q(interfaceC2395h4, new C4727wa(3, i13, dVar)), c4442md2, qd5, i12), i12), new M8(c4442md2, dVar, i13)), m12);
            return qd6;
        }
        return aVar;
    }
}
