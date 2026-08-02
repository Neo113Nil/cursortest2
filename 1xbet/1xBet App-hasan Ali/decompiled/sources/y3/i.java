package y3;

import android.os.Bundle;
import android.os.Parcel;
import m3.v;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f21237o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f21238p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f21239q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f21240r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f21241s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(r rVar, String str, String str2, Bundle bundle, int i) {
        super(rVar, true);
        this.f21237o = i;
        this.f21241s = rVar;
        this.f21238p = str;
        this.f21239q = str2;
        this.f21240r = bundle;
    }

    @Override // y3.o
    public final void a() {
        switch (this.f21237o) {
            case 0:
                InterfaceC2669e interfaceC2669e = this.f21241s.f21276h;
                v.e(interfaceC2669e);
                String str = this.f21238p;
                String str2 = this.f21239q;
                Bundle bundle = this.f21240r;
                C2667c c2667c = (C2667c) interfaceC2669e;
                Parcel L5 = c2667c.L();
                L5.writeString(str);
                L5.writeString(str2);
                AbstractC2665a.a(L5, bundle);
                c2667c.N(L5, 9);
                break;
            default:
                long j5 = this.f21262k;
                InterfaceC2669e interfaceC2669e2 = this.f21241s.f21276h;
                v.e(interfaceC2669e2);
                String str3 = this.f21238p;
                String str4 = this.f21239q;
                Bundle bundle2 = this.f21240r;
                C2667c c2667c2 = (C2667c) interfaceC2669e2;
                Parcel L6 = c2667c2.L();
                L6.writeString(str3);
                L6.writeString(str4);
                AbstractC2665a.a(L6, bundle2);
                L6.writeInt(1);
                L6.writeInt(1);
                L6.writeLong(j5);
                c2667c2.N(L6, 2);
                break;
        }
    }
}
