package y3;

import android.os.Parcel;
import m3.v;

/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f21247o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f21248p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r f21249q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(r rVar, String str, int i) {
        super(rVar, true);
        this.f21247o = i;
        this.f21249q = rVar;
        this.f21248p = str;
    }

    @Override // y3.o
    public final void a() {
        switch (this.f21247o) {
            case 0:
                InterfaceC2669e interfaceC2669e = this.f21249q.f21276h;
                v.e(interfaceC2669e);
                String str = this.f21248p;
                long j5 = this.f21263l;
                C2667c c2667c = (C2667c) interfaceC2669e;
                Parcel L5 = c2667c.L();
                L5.writeString(str);
                L5.writeLong(j5);
                c2667c.N(L5, 23);
                break;
            default:
                InterfaceC2669e interfaceC2669e2 = this.f21249q.f21276h;
                v.e(interfaceC2669e2);
                String str2 = this.f21248p;
                long j6 = this.f21263l;
                C2667c c2667c2 = (C2667c) interfaceC2669e2;
                Parcel L6 = c2667c2.L();
                L6.writeString(str2);
                L6.writeLong(j6);
                c2667c2.N(L6, 24);
                break;
        }
    }
}
