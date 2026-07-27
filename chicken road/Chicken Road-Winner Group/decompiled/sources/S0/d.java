package S0;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class d extends T0.a {
    public static final Parcelable.Creator<d> CREATOR = new H.j(14);

    /* renamed from: o, reason: collision with root package name */
    public static final Scope[] f1304o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    public static final P0.d[] f1305p = new P0.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f1306a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1307b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1308c;

    /* renamed from: d, reason: collision with root package name */
    public String f1309d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f1310e;
    public Scope[] f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f1311g;

    /* renamed from: h, reason: collision with root package name */
    public Account f1312h;

    /* renamed from: i, reason: collision with root package name */
    public P0.d[] f1313i;

    /* renamed from: j, reason: collision with root package name */
    public P0.d[] f1314j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1315k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1316l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1317m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1318n;

    public d(int i3, int i4, int i5, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, P0.d[] dVarArr, P0.d[] dVarArr2, boolean z3, int i6, boolean z4, String str2) {
        scopeArr = scopeArr == null ? f1304o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        P0.d[] dVarArr3 = f1305p;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.f1306a = i3;
        this.f1307b = i4;
        this.f1308c = i5;
        if ("com.google.android.gms".equals(str)) {
            this.f1309d = "com.google.android.gms";
        } else {
            this.f1309d = str;
        }
        if (i3 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i7 = AbstractBinderC0058a.f1298d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                e c3 = queryLocalInterface instanceof e ? (e) queryLocalInterface : new C(iBinder);
                if (c3 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((C) c3).a();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f1312h = account2;
        } else {
            this.f1310e = iBinder;
            this.f1312h = account;
        }
        this.f = scopeArr;
        this.f1311g = bundle;
        this.f1313i = dVarArr;
        this.f1314j = dVarArr2;
        this.f1315k = z3;
        this.f1316l = i6;
        this.f1317m = z4;
        this.f1318n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        H.j.a(this, parcel, i3);
    }
}
