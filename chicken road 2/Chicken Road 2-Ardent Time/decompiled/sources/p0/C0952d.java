package p0;

/* renamed from: p0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952d extends q0.AbstractC0980a {
    public static final android.os.Parcelable.Creator<p0.C0952d> CREATOR = new C.l(21);

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Scope[] f8228o = new com.google.android.gms.common.api.Scope[0];

    /* renamed from: p, reason: collision with root package name */
    public static final m0.d[] f8229p = new m0.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f8230a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8231b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8232c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f8233d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.IBinder f8234e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.gms.common.api.Scope[] f8235f;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Bundle f8236g;

    /* renamed from: h, reason: collision with root package name */
    public android.accounts.Account f8237h;

    /* renamed from: i, reason: collision with root package name */
    public m0.d[] f8238i;

    /* renamed from: j, reason: collision with root package name */
    public m0.d[] f8239j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8240k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8241l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8242m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f8243n;

    public C0952d(int i2, int i3, int i4, java.lang.String str, android.os.IBinder iBinder, com.google.android.gms.common.api.Scope[] scopeArr, android.os.Bundle bundle, android.accounts.Account account, m0.d[] dVarArr, m0.d[] dVarArr2, boolean z2, int i5, boolean z3, java.lang.String str2) {
        scopeArr = scopeArr == null ? f8228o : scopeArr;
        bundle = bundle == null ? new android.os.Bundle() : bundle;
        m0.d[] dVarArr3 = f8229p;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.f8230a = i2;
        this.f8231b = i3;
        this.f8232c = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f8233d = "com.google.android.gms";
        } else {
            this.f8233d = str;
        }
        if (i2 < 2) {
            android.accounts.Account account2 = null;
            if (iBinder != null) {
                int i6 = p0.AbstractBinderC0949a.f8221b;
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                p0.InterfaceC0953e c0948c = queryLocalInterface instanceof p0.InterfaceC0953e ? (p0.InterfaceC0953e) queryLocalInterface : new p0.C0948C(iBinder);
                if (c0948c != null) {
                    long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((p0.C0948C) c0948c).a();
                        } catch (android.os.RemoteException unused) {
                            android.util.Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f8237h = account2;
        } else {
            this.f8234e = iBinder;
            this.f8237h = account;
        }
        this.f8235f = scopeArr;
        this.f8236g = bundle;
        this.f8238i = dVarArr;
        this.f8239j = dVarArr2;
        this.f8240k = z2;
        this.f8241l = i5;
        this.f8242m = z3;
        this.f8243n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        C.l.a(this, parcel, i2);
    }
}
