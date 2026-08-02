package S2;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class e extends AbstractC2187a {
    public static final Parcelable.Creator<e> CREATOR = new C2.a(9);

    /* renamed from: k, reason: collision with root package name */
    public final String f5313k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5314l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5315m;

    /* renamed from: n, reason: collision with root package name */
    public final String f5316n;

    /* renamed from: o, reason: collision with root package name */
    public final String f5317o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5318p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5319q;

    /* renamed from: r, reason: collision with root package name */
    public final Intent f5320r;

    /* renamed from: s, reason: collision with root package name */
    public final a f5321s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5322t;

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z3) {
        this.f5313k = str;
        this.f5314l = str2;
        this.f5315m = str3;
        this.f5316n = str4;
        this.f5317o = str5;
        this.f5318p = str6;
        this.f5319q = str7;
        this.f5320r = intent;
        this.f5321s = (a) BinderC2361b.t1(BinderC2361b.h1(iBinder));
        this.f5322t = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 2, this.f5313k);
        AbstractC2036a.f0(parcel, 3, this.f5314l);
        AbstractC2036a.f0(parcel, 4, this.f5315m);
        AbstractC2036a.f0(parcel, 5, this.f5316n);
        AbstractC2036a.f0(parcel, 6, this.f5317o);
        AbstractC2036a.f0(parcel, 7, this.f5318p);
        AbstractC2036a.f0(parcel, 8, this.f5319q);
        AbstractC2036a.e0(parcel, 9, this.f5320r, i);
        AbstractC2036a.d0(parcel, 10, new BinderC2361b(this.f5321s));
        AbstractC2036a.n0(parcel, 11, 4);
        parcel.writeInt(this.f5322t ? 1 : 0);
        AbstractC2036a.m0(parcel, k02);
    }

    public e(Intent intent, a aVar) {
        this(null, null, null, null, null, null, null, intent, new BinderC2361b(aVar), false);
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new BinderC2361b(aVar), false);
    }
}
