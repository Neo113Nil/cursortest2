package y3;

import android.os.Parcel;
import m3.v;

/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f21253o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f21254p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f21255q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BinderC2666b f21256r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f21257s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, String str, String str2, boolean z3, BinderC2666b binderC2666b) {
        super(rVar, true);
        this.f21257s = rVar;
        this.f21253o = str;
        this.f21254p = str2;
        this.f21255q = z3;
        this.f21256r = binderC2666b;
    }

    @Override // y3.o
    public final void a() {
        InterfaceC2669e interfaceC2669e = this.f21257s.f21276h;
        v.e(interfaceC2669e);
        String str = this.f21253o;
        String str2 = this.f21254p;
        boolean z3 = this.f21255q;
        BinderC2666b binderC2666b = this.f21256r;
        C2667c c2667c = (C2667c) interfaceC2669e;
        Parcel L5 = c2667c.L();
        L5.writeString(str);
        L5.writeString(str2);
        int i = AbstractC2665a.f21220a;
        L5.writeInt(z3 ? 1 : 0);
        AbstractC2665a.b(L5, binderC2666b);
        c2667c.N(L5, 5);
    }

    @Override // y3.o
    public final void b() {
        this.f21256r.t1(null);
    }
}
