package y3;

import android.app.Activity;
import android.os.Parcel;
import m3.v;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f21266o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Activity f21267p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q f21268q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Activity activity, int i) {
        super(qVar.f21269k, true);
        this.f21266o = i;
        switch (i) {
            case 1:
                this.f21268q = qVar;
                this.f21267p = activity;
                super(qVar.f21269k, true);
                break;
            case 2:
                this.f21268q = qVar;
                this.f21267p = activity;
                super(qVar.f21269k, true);
                break;
            case 3:
                this.f21268q = qVar;
                this.f21267p = activity;
                super(qVar.f21269k, true);
                break;
            case 4:
                this.f21268q = qVar;
                this.f21267p = activity;
                super(qVar.f21269k, true);
                break;
            default:
                this.f21268q = qVar;
                this.f21267p = activity;
                break;
        }
    }

    @Override // y3.o
    public final void a() {
        switch (this.f21266o) {
            case 0:
                InterfaceC2669e interfaceC2669e = this.f21268q.f21269k.f21276h;
                v.e(interfaceC2669e);
                BinderC2361b binderC2361b = new BinderC2361b(this.f21267p);
                long j5 = this.f21263l;
                C2667c c2667c = (C2667c) interfaceC2669e;
                Parcel L5 = c2667c.L();
                AbstractC2665a.b(L5, binderC2361b);
                L5.writeLong(j5);
                c2667c.N(L5, 25);
                break;
            case 1:
                InterfaceC2669e interfaceC2669e2 = this.f21268q.f21269k.f21276h;
                v.e(interfaceC2669e2);
                BinderC2361b binderC2361b2 = new BinderC2361b(this.f21267p);
                long j6 = this.f21263l;
                C2667c c2667c2 = (C2667c) interfaceC2669e2;
                Parcel L6 = c2667c2.L();
                AbstractC2665a.b(L6, binderC2361b2);
                L6.writeLong(j6);
                c2667c2.N(L6, 30);
                break;
            case 2:
                InterfaceC2669e interfaceC2669e3 = this.f21268q.f21269k.f21276h;
                v.e(interfaceC2669e3);
                BinderC2361b binderC2361b3 = new BinderC2361b(this.f21267p);
                long j7 = this.f21263l;
                C2667c c2667c3 = (C2667c) interfaceC2669e3;
                Parcel L7 = c2667c3.L();
                AbstractC2665a.b(L7, binderC2361b3);
                L7.writeLong(j7);
                c2667c3.N(L7, 29);
                break;
            case 3:
                InterfaceC2669e interfaceC2669e4 = this.f21268q.f21269k.f21276h;
                v.e(interfaceC2669e4);
                BinderC2361b binderC2361b4 = new BinderC2361b(this.f21267p);
                long j8 = this.f21263l;
                C2667c c2667c4 = (C2667c) interfaceC2669e4;
                Parcel L8 = c2667c4.L();
                AbstractC2665a.b(L8, binderC2361b4);
                L8.writeLong(j8);
                c2667c4.N(L8, 26);
                break;
            default:
                InterfaceC2669e interfaceC2669e5 = this.f21268q.f21269k.f21276h;
                v.e(interfaceC2669e5);
                BinderC2361b binderC2361b5 = new BinderC2361b(this.f21267p);
                long j9 = this.f21263l;
                C2667c c2667c5 = (C2667c) interfaceC2669e5;
                Parcel L9 = c2667c5.L();
                AbstractC2665a.b(L9, binderC2361b5);
                L9.writeLong(j9);
                c2667c5.N(L9, 28);
                break;
        }
    }
}
