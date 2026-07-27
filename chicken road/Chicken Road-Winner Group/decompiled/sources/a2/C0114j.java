package a2;

import android.content.Context;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import java.util.List;
import w2.InterfaceC1241u;

/* renamed from: a2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114j extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1845e;
    public final /* synthetic */ C0100J f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f1846g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0114j(C0100J c0100j, List list, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = c0100j;
        this.f1846g = list;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new C0114j(this.f, this.f1846g, interfaceC0319c);
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f1845e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
            return obj;
        }
        X0.a.L(obj);
        Context context = this.f.f1818a;
        if (context == null) {
            kotlin.jvm.internal.j.g("context");
            throw null;
        }
        J1.i a3 = AbstractC0101K.a(context);
        C0113i c0113i = new C0113i(this.f1846g, null);
        this.f1845e = 1;
        Object b3 = a3.b(new N.h(c0113i, null), this);
        return b3 == enumC0326a ? enumC0326a : b3;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0114j) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
