package y3;

import android.os.Parcel;
import m3.v;

/* loaded from: classes.dex */
public final class l extends o {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f21250o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ BinderC2666b f21251p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r f21252q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(r rVar, BinderC2666b binderC2666b, int i) {
        super(rVar, true);
        this.f21250o = i;
        this.f21252q = rVar;
        this.f21251p = binderC2666b;
    }

    @Override // y3.o
    public final void a() {
        switch (this.f21250o) {
            case 0:
                InterfaceC2669e interfaceC2669e = this.f21252q.f21276h;
                v.e(interfaceC2669e);
                BinderC2666b binderC2666b = this.f21251p;
                C2667c c2667c = (C2667c) interfaceC2669e;
                Parcel L5 = c2667c.L();
                AbstractC2665a.b(L5, binderC2666b);
                c2667c.N(L5, 21);
                break;
            case 1:
                InterfaceC2669e interfaceC2669e2 = this.f21252q.f21276h;
                v.e(interfaceC2669e2);
                BinderC2666b binderC2666b2 = this.f21251p;
                C2667c c2667c2 = (C2667c) interfaceC2669e2;
                Parcel L6 = c2667c2.L();
                AbstractC2665a.b(L6, binderC2666b2);
                c2667c2.N(L6, 19);
                break;
            case 2:
                InterfaceC2669e interfaceC2669e3 = this.f21252q.f21276h;
                v.e(interfaceC2669e3);
                BinderC2666b binderC2666b3 = this.f21251p;
                C2667c c2667c3 = (C2667c) interfaceC2669e3;
                Parcel L7 = c2667c3.L();
                AbstractC2665a.b(L7, binderC2666b3);
                c2667c3.N(L7, 22);
                break;
            case 3:
                InterfaceC2669e interfaceC2669e4 = this.f21252q.f21276h;
                v.e(interfaceC2669e4);
                BinderC2666b binderC2666b4 = this.f21251p;
                C2667c c2667c4 = (C2667c) interfaceC2669e4;
                Parcel L8 = c2667c4.L();
                AbstractC2665a.b(L8, binderC2666b4);
                c2667c4.N(L8, 16);
                break;
            default:
                InterfaceC2669e interfaceC2669e5 = this.f21252q.f21276h;
                v.e(interfaceC2669e5);
                BinderC2666b binderC2666b5 = this.f21251p;
                C2667c c2667c5 = (C2667c) interfaceC2669e5;
                Parcel L9 = c2667c5.L();
                AbstractC2665a.b(L9, binderC2666b5);
                c2667c5.N(L9, 17);
                break;
        }
    }

    @Override // y3.o
    public final void b() {
        switch (this.f21250o) {
            case 0:
                this.f21251p.t1(null);
                break;
            case 1:
                this.f21251p.t1(null);
                break;
            case 2:
                this.f21251p.t1(null);
                break;
            case 3:
                this.f21251p.t1(null);
                break;
            default:
                this.f21251p.t1(null);
                break;
        }
    }
}
