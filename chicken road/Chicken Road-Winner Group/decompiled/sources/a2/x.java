package a2;

import K.InterfaceC0041i;
import android.content.Context;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.InterfaceC1241u;

/* loaded from: classes.dex */
public final class x extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.q f1886e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1887g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0100J f1888h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.q f1889i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, C0100J c0100j, kotlin.jvm.internal.q qVar, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f1887g = str;
        this.f1888h = c0100j;
        this.f1889i = qVar;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new x(this.f1887g, this.f1888h, this.f1889i, interfaceC0319c);
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        kotlin.jvm.internal.q qVar;
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f;
        if (i3 == 0) {
            X0.a.L(obj);
            N.d dVar = new N.d(this.f1887g);
            Context context = this.f1888h.f1818a;
            if (context == null) {
                kotlin.jvm.internal.j.g("context");
                throw null;
            }
            C0119o c0119o = new C0119o(((InterfaceC0041i) AbstractC0101K.a(context).f729b).getData(), dVar, 2);
            kotlin.jvm.internal.q qVar2 = this.f1889i;
            this.f1886e = qVar2;
            this.f = 1;
            Object c3 = z2.q.c(c0119o, this);
            if (c3 == enumC0326a) {
                return enumC0326a;
            }
            qVar = qVar2;
            obj = c3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = this.f1886e;
            X0.a.L(obj);
        }
        qVar.f9672a = obj;
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
