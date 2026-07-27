package a2;

import K.InterfaceC0041i;
import android.content.Context;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.InterfaceC1241u;

/* renamed from: a2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122r extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.q f1865e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1866g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0100J f1867h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.q f1868i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0122r(String str, C0100J c0100j, kotlin.jvm.internal.q qVar, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f1866g = str;
        this.f1867h = c0100j;
        this.f1868i = qVar;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new C0122r(this.f1866g, this.f1867h, this.f1868i, interfaceC0319c);
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        kotlin.jvm.internal.q qVar;
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f;
        if (i3 == 0) {
            X0.a.L(obj);
            N.d dVar = new N.d(this.f1866g);
            C0100J c0100j = this.f1867h;
            Context context = c0100j.f1818a;
            if (context == null) {
                kotlin.jvm.internal.j.g("context");
                throw null;
            }
            A0.j jVar = new A0.j(((InterfaceC0041i) AbstractC0101K.a(context).f729b).getData(), dVar, c0100j, 15);
            kotlin.jvm.internal.q qVar2 = this.f1868i;
            this.f1865e = qVar2;
            this.f = 1;
            Object c3 = z2.q.c(jVar, this);
            if (c3 == enumC0326a) {
                return enumC0326a;
            }
            qVar = qVar2;
            obj = c3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = this.f1865e;
            X0.a.L(obj);
        }
        qVar.f9672a = obj;
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0122r) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
