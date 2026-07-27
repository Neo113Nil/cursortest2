package a2;

import android.content.Context;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.InterfaceC1241u;

/* renamed from: a2.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098H extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1812e;
    public final /* synthetic */ String f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0100J f1813g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1814h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098H(String str, C0100J c0100j, long j3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = str;
        this.f1813g = c0100j;
        this.f1814h = j3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new C0098H(this.f, this.f1813g, this.f1814h, interfaceC0319c);
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f1812e;
        if (i3 == 0) {
            X0.a.L(obj);
            N.d dVar = new N.d(this.f);
            Context context = this.f1813g.f1818a;
            if (context == null) {
                kotlin.jvm.internal.j.g("context");
                throw null;
            }
            J1.i a3 = AbstractC0101K.a(context);
            C0097G c0097g = new C0097G(dVar, this.f1814h, null);
            this.f1812e = 1;
            if (a3.b(new N.h(c0097g, null), this) == enumC0326a) {
                return enumC0326a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
        }
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0098H) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
