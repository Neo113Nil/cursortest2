package y3;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import game.betting133.sports1xbet.R;
import m3.v;
import s3.BinderC2361b;
import t3.C2422a;
import t3.C2424c;

/* loaded from: classes.dex */
public final class j extends o {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f21242o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f21243p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f21244q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f21245r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f21246s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(r rVar, String str, Object obj, Object obj2, int i) {
        super(rVar, true);
        this.f21242o = i;
        this.f21245r = rVar;
        this.f21243p = str;
        this.f21244q = obj;
        this.f21246s = obj2;
    }

    @Override // y3.o
    public final void a() {
        boolean z3;
        String str;
        String str2;
        String str3;
        String packageName;
        switch (this.f21242o) {
            case 0:
                InterfaceC2669e interfaceC2669e = this.f21245r.f21276h;
                v.e(interfaceC2669e);
                String str4 = this.f21243p;
                String str5 = (String) this.f21244q;
                BinderC2666b binderC2666b = (BinderC2666b) this.f21246s;
                C2667c c2667c = (C2667c) interfaceC2669e;
                Parcel L5 = c2667c.L();
                L5.writeString(str4);
                L5.writeString(str5);
                AbstractC2665a.b(L5, binderC2666b);
                c2667c.N(L5, 10);
                break;
            case 1:
                InterfaceC2669e interfaceC2669e2 = this.f21245r.f21276h;
                v.e(interfaceC2669e2);
                BinderC2361b binderC2361b = new BinderC2361b((Activity) this.f21246s);
                String str6 = this.f21243p;
                String str7 = (String) this.f21244q;
                long j5 = this.f21262k;
                C2667c c2667c2 = (C2667c) interfaceC2669e2;
                Parcel L6 = c2667c2.L();
                AbstractC2665a.b(L6, binderC2361b);
                L6.writeString(str6);
                L6.writeString(str7);
                L6.writeLong(j5);
                c2667c2.N(L6, 15);
                break;
            case 2:
                try {
                    if (this.f21243p != null) {
                        try {
                            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                        } catch (ClassNotFoundException unused) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                    InterfaceC2669e interfaceC2669e3 = null;
                    if (z3) {
                        str3 = this.f21243p;
                        str2 = "am";
                        str = this.f21245r.f21270a;
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    v.e((Context) this.f21244q);
                    r rVar = this.f21245r;
                    Context context = (Context) this.f21244q;
                    rVar.getClass();
                    try {
                        IBinder b3 = C2424c.c(context, C2424c.f19571c, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService");
                        int i = AbstractBinderC2668d.f21224l;
                        if (b3 != null) {
                            IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
                            interfaceC2669e3 = queryLocalInterface instanceof InterfaceC2669e ? (InterfaceC2669e) queryLocalInterface : new C2667c(b3);
                        }
                    } catch (C2422a e3) {
                        rVar.a(e3, true, false);
                    }
                    rVar.f21276h = interfaceC2669e3;
                    if (this.f21245r.f21276h != null) {
                        int a5 = C2424c.a((Context) this.f21244q, "com.google.android.gms.measurement.dynamite");
                        int d5 = C2424c.d((Context) this.f21244q, "com.google.android.gms.measurement.dynamite", false);
                        int max = Math.max(a5, d5);
                        boolean z5 = d5 < a5;
                        long j6 = max;
                        Bundle bundle = (Bundle) this.f21246s;
                        Context context2 = (Context) this.f21244q;
                        try {
                            packageName = context2.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                        } catch (Resources.NotFoundException unused2) {
                            packageName = context2.getPackageName();
                        }
                        C2670f c2670f = new C2670f(61000L, j6, z5, str, str2, str3, bundle, packageName);
                        InterfaceC2669e interfaceC2669e4 = this.f21245r.f21276h;
                        v.e(interfaceC2669e4);
                        BinderC2361b binderC2361b2 = new BinderC2361b((Context) this.f21244q);
                        long j7 = this.f21262k;
                        C2667c c2667c3 = (C2667c) interfaceC2669e4;
                        Parcel L7 = c2667c3.L();
                        AbstractC2665a.b(L7, binderC2361b2);
                        AbstractC2665a.a(L7, c2670f);
                        L7.writeLong(j7);
                        c2667c3.N(L7, 1);
                        break;
                    } else {
                        Log.w(this.f21245r.f21270a, "Failed to connect to measurement client.");
                        break;
                    }
                } catch (Exception e5) {
                    this.f21245r.a(e5, true, false);
                    return;
                }
            default:
                InterfaceC2669e interfaceC2669e5 = this.f21245r.f21276h;
                v.e(interfaceC2669e5);
                String str8 = this.f21243p;
                String str9 = (String) this.f21244q;
                BinderC2361b binderC2361b3 = new BinderC2361b(this.f21246s);
                long j8 = this.f21262k;
                C2667c c2667c4 = (C2667c) interfaceC2669e5;
                Parcel L8 = c2667c4.L();
                L8.writeString(str8);
                L8.writeString(str9);
                AbstractC2665a.b(L8, binderC2361b3);
                L8.writeInt(1);
                L8.writeLong(j8);
                c2667c4.N(L8, 4);
                break;
        }
    }

    @Override // y3.o
    public void b() {
        switch (this.f21242o) {
            case 0:
                ((BinderC2666b) this.f21246s).t1(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, Activity activity, String str, String str2) {
        super(rVar, true);
        this.f21242o = 1;
        this.f21245r = rVar;
        this.f21246s = activity;
        this.f21243p = str;
        this.f21244q = str2;
    }
}
