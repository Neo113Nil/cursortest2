package m3;

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
import n3.AbstractC2187a;
import x3.AbstractC2644a;

/* renamed from: m3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2097g extends AbstractC2187a {
    public static final Parcelable.Creator<C2097g> CREATOR = new C2.a(28);

    /* renamed from: y, reason: collision with root package name */
    public static final Scope[] f18050y = new Scope[0];

    /* renamed from: z, reason: collision with root package name */
    public static final j3.d[] f18051z = new j3.d[0];

    /* renamed from: k, reason: collision with root package name */
    public final int f18052k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18053l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18054m;

    /* renamed from: n, reason: collision with root package name */
    public String f18055n;

    /* renamed from: o, reason: collision with root package name */
    public IBinder f18056o;

    /* renamed from: p, reason: collision with root package name */
    public Scope[] f18057p;

    /* renamed from: q, reason: collision with root package name */
    public Bundle f18058q;

    /* renamed from: r, reason: collision with root package name */
    public Account f18059r;

    /* renamed from: s, reason: collision with root package name */
    public j3.d[] f18060s;

    /* renamed from: t, reason: collision with root package name */
    public j3.d[] f18061t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f18062u;

    /* renamed from: v, reason: collision with root package name */
    public final int f18063v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18064w;

    /* renamed from: x, reason: collision with root package name */
    public final String f18065x;

    public C2097g(int i, int i5, int i6, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, j3.d[] dVarArr, j3.d[] dVarArr2, boolean z3, int i7, boolean z5, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f18050y : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        j3.d[] dVarArr3 = f18051z;
        j3.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f18052k = i;
        this.f18053l = i5;
        this.f18054m = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f18055n = "com.google.android.gms";
        } else {
            this.f18055n = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i8 = AbstractBinderC2091a.f18021l;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                i g5 = queryLocalInterface instanceof i ? (i) queryLocalInterface : new G(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                if (g5 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            G g6 = (G) g5;
                            Parcel L5 = g6.L(g6.N(), 2);
                            Account account3 = (Account) AbstractC2644a.a(L5, Account.CREATOR);
                            L5.recycle();
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f18059r = account2;
        } else {
            this.f18056o = iBinder;
            this.f18059r = account;
        }
        this.f18057p = scopeArr2;
        this.f18058q = bundle2;
        this.f18060s = dVarArr4;
        this.f18061t = dVarArr3;
        this.f18062u = z3;
        this.f18063v = i7;
        this.f18064w = z5;
        this.f18065x = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C2.a.a(this, parcel, i);
    }
}
