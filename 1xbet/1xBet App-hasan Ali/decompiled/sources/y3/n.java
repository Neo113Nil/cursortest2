package y3;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import m3.v;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f21258o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f21259p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f21260q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f21261r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(r rVar, Object obj, BinderC2666b binderC2666b, int i) {
        super(rVar, true);
        this.f21258o = i;
        this.f21260q = rVar;
        this.f21261r = obj;
        this.f21259p = binderC2666b;
    }

    @Override // y3.o
    public final void a() {
        Bundle bundle;
        switch (this.f21258o) {
            case 0:
                InterfaceC2669e interfaceC2669e = ((r) this.f21260q).f21276h;
                v.e(interfaceC2669e);
                Bundle bundle2 = (Bundle) this.f21261r;
                BinderC2666b binderC2666b = (BinderC2666b) this.f21259p;
                long j5 = this.f21262k;
                C2667c c2667c = (C2667c) interfaceC2669e;
                Parcel L5 = c2667c.L();
                AbstractC2665a.a(L5, bundle2);
                AbstractC2665a.b(L5, binderC2666b);
                L5.writeLong(j5);
                c2667c.N(L5, 32);
                break;
            case 1:
                InterfaceC2669e interfaceC2669e2 = ((r) this.f21260q).f21276h;
                v.e(interfaceC2669e2);
                String str = (String) this.f21261r;
                BinderC2666b binderC2666b2 = (BinderC2666b) this.f21259p;
                C2667c c2667c2 = (C2667c) interfaceC2669e2;
                Parcel L6 = c2667c2.L();
                L6.writeString(str);
                AbstractC2665a.b(L6, binderC2666b2);
                c2667c2.N(L6, 6);
                break;
            case 2:
                if (((Bundle) this.f21261r) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f21261r).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f21261r).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                InterfaceC2669e interfaceC2669e3 = ((q) this.f21260q).f21269k.f21276h;
                v.e(interfaceC2669e3);
                BinderC2361b binderC2361b = new BinderC2361b((Activity) this.f21259p);
                long j6 = this.f21263l;
                C2667c c2667c3 = (C2667c) interfaceC2669e3;
                Parcel L7 = c2667c3.L();
                AbstractC2665a.b(L7, binderC2361b);
                AbstractC2665a.a(L7, bundle);
                L7.writeLong(j6);
                c2667c3.N(L7, 27);
                break;
            default:
                InterfaceC2669e interfaceC2669e4 = ((q) this.f21260q).f21269k.f21276h;
                v.e(interfaceC2669e4);
                BinderC2361b binderC2361b2 = new BinderC2361b((Activity) this.f21261r);
                BinderC2666b binderC2666b3 = (BinderC2666b) this.f21259p;
                long j7 = this.f21263l;
                C2667c c2667c4 = (C2667c) interfaceC2669e4;
                Parcel L8 = c2667c4.L();
                AbstractC2665a.b(L8, binderC2361b2);
                AbstractC2665a.b(L8, binderC2666b3);
                L8.writeLong(j7);
                c2667c4.N(L8, 31);
                break;
        }
    }

    @Override // y3.o
    public void b() {
        switch (this.f21258o) {
            case 0:
                ((BinderC2666b) this.f21259p).t1(null);
                break;
            case 1:
                ((BinderC2666b) this.f21259p).t1(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, Activity activity, BinderC2666b binderC2666b) {
        super(qVar.f21269k, true);
        this.f21258o = 3;
        this.f21260q = qVar;
        this.f21261r = activity;
        this.f21259p = binderC2666b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, Bundle bundle, Activity activity) {
        super(qVar.f21269k, true);
        this.f21258o = 2;
        this.f21260q = qVar;
        this.f21261r = bundle;
        this.f21259p = activity;
    }
}
