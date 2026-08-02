package y3;

import android.os.Bundle;
import android.os.Parcel;
import m3.v;
import s3.BinderC2361b;

/* renamed from: y3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2672h extends o {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f21234o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f21235p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r f21236q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2672h(r rVar, Bundle bundle, int i) {
        super(rVar, true);
        this.f21234o = i;
        this.f21236q = rVar;
        this.f21235p = bundle;
    }

    @Override // y3.o
    public final void a() {
        switch (this.f21234o) {
            case 0:
                InterfaceC2669e interfaceC2669e = this.f21236q.f21276h;
                v.e(interfaceC2669e);
                Bundle bundle = (Bundle) this.f21235p;
                long j5 = this.f21262k;
                C2667c c2667c = (C2667c) interfaceC2669e;
                Parcel L5 = c2667c.L();
                AbstractC2665a.a(L5, bundle);
                L5.writeLong(j5);
                c2667c.N(L5, 8);
                break;
            case 1:
                InterfaceC2669e interfaceC2669e2 = this.f21236q.f21276h;
                v.e(interfaceC2669e2);
                Bundle bundle2 = (Bundle) this.f21235p;
                long j6 = this.f21262k;
                C2667c c2667c2 = (C2667c) interfaceC2669e2;
                Parcel L6 = c2667c2.L();
                AbstractC2665a.a(L6, bundle2);
                L6.writeLong(j6);
                c2667c2.N(L6, 44);
                break;
            default:
                InterfaceC2669e interfaceC2669e3 = this.f21236q.f21276h;
                v.e(interfaceC2669e3);
                BinderC2361b binderC2361b = new BinderC2361b((Exception) this.f21235p);
                BinderC2361b binderC2361b2 = new BinderC2361b(null);
                BinderC2361b binderC2361b3 = new BinderC2361b(null);
                C2667c c2667c3 = (C2667c) interfaceC2669e3;
                Parcel L7 = c2667c3.L();
                L7.writeInt(5);
                L7.writeString("Error with data collection. Data lost.");
                AbstractC2665a.b(L7, binderC2361b);
                AbstractC2665a.b(L7, binderC2361b2);
                AbstractC2665a.b(L7, binderC2361b3);
                c2667c3.N(L7, 33);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2672h(r rVar, Exception exc) {
        super(rVar, false);
        this.f21234o = 2;
        this.f21236q = rVar;
        this.f21235p = exc;
    }
}
