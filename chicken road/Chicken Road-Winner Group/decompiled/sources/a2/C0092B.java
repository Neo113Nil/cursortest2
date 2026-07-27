package a2;

import android.content.Context;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.InterfaceC1241u;

/* renamed from: a2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092B extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1796e;
    public final /* synthetic */ String f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0100J f1797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1798h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0092B(String str, C0100J c0100j, boolean z3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = str;
        this.f1797g = c0100j;
        this.f1798h = z3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new C0092B(this.f, this.f1797g, this.f1798h, interfaceC0319c);
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f1796e;
        if (i3 == 0) {
            X0.a.L(obj);
            N.d dVar = new N.d(this.f);
            Context context = this.f1797g.f1818a;
            if (context == null) {
                kotlin.jvm.internal.j.g("context");
                throw null;
            }
            J1.i a3 = AbstractC0101K.a(context);
            C0091A c0091a = new C0091A(dVar, this.f1798h, null);
            this.f1796e = 1;
            if (a3.b(new N.h(c0091a, null), this) == enumC0326a) {
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
        return ((C0092B) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
