package Q;

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

/* renamed from: Q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007e extends R.a {
    public static final Parcelable.Creator<C0007e> CREATOR = new K.c(13);

    /* renamed from: o, reason: collision with root package name */
    public static final Scope[] f412o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    public static final N.d[] f413p = new N.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f414a;

    /* renamed from: b, reason: collision with root package name */
    public final int f415b;

    /* renamed from: c, reason: collision with root package name */
    public final int f416c;

    /* renamed from: d, reason: collision with root package name */
    public String f417d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f418e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f419f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f420g;

    /* renamed from: h, reason: collision with root package name */
    public Account f421h;

    /* renamed from: i, reason: collision with root package name */
    public N.d[] f422i;

    /* renamed from: j, reason: collision with root package name */
    public N.d[] f423j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f424k;

    /* renamed from: l, reason: collision with root package name */
    public final int f425l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f426m;

    /* renamed from: n, reason: collision with root package name */
    public final String f427n;

    public C0007e(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, N.d[] dVarArr, N.d[] dVarArr2, boolean z2, int i5, boolean z3, String str2) {
        scopeArr = scopeArr == null ? f412o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        N.d[] dVarArr3 = f413p;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.f414a = i2;
        this.f415b = i3;
        this.f416c = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f417d = "com.google.android.gms";
        } else {
            this.f417d = str;
        }
        if (i2 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i6 = AbstractBinderC0003a.f399b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface f2 = queryLocalInterface instanceof InterfaceC0008f ? (InterfaceC0008f) queryLocalInterface : new F(iBinder);
                if (f2 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((F) f2).a();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f421h = account2;
        } else {
            this.f418e = iBinder;
            this.f421h = account;
        }
        this.f419f = scopeArr;
        this.f420g = bundle;
        this.f422i = dVarArr;
        this.f423j = dVarArr2;
        this.f424k = z2;
        this.f425l = i5;
        this.f426m = z3;
        this.f427n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        K.c.a(this, parcel, i2);
    }
}
