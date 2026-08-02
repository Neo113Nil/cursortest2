package p000;

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

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class z70 extends AbstractC0823w0 {
    public static final Parcelable.Creator<z70> CREATOR = new jm1(23);

    /* JADX INFO: renamed from: x */
    public static final Scope[] f9624x = new Scope[0];

    /* JADX INFO: renamed from: y */
    public static final C0451lz[] f9625y = new C0451lz[0];

    /* JADX INFO: renamed from: j */
    public final int f9626j;

    /* JADX INFO: renamed from: k */
    public final int f9627k;

    /* JADX INFO: renamed from: l */
    public final int f9628l;

    /* JADX INFO: renamed from: m */
    public String f9629m;

    /* JADX INFO: renamed from: n */
    public IBinder f9630n;

    /* JADX INFO: renamed from: o */
    public Scope[] f9631o;

    /* JADX INFO: renamed from: p */
    public Bundle f9632p;

    /* JADX INFO: renamed from: q */
    public Account f9633q;

    /* JADX INFO: renamed from: r */
    public C0451lz[] f9634r;

    /* JADX INFO: renamed from: s */
    public C0451lz[] f9635s;

    /* JADX INFO: renamed from: t */
    public final boolean f9636t;

    /* JADX INFO: renamed from: u */
    public final int f9637u;

    /* JADX INFO: renamed from: v */
    public final boolean f9638v;

    /* JADX INFO: renamed from: w */
    public final String f9639w;

    public z70(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C0451lz[] c0451lzArr, C0451lz[] c0451lzArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f9624x : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        C0451lz[] c0451lzArr3 = f9625y;
        C0451lz[] c0451lzArr4 = c0451lzArr == null ? c0451lzArr3 : c0451lzArr;
        c0451lzArr3 = c0451lzArr2 != null ? c0451lzArr2 : c0451lzArr3;
        this.f9626j = i;
        this.f9627k = i2;
        this.f9628l = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f9629m = "com.google.android.gms";
        } else {
            this.f9629m = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = AbstractBinderC0935z1.f9565c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                wb0 x82Var = iInterfaceQueryLocalInterface instanceof wb0 ? (wb0) iInterfaceQueryLocalInterface : new x82(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        x82 x82Var2 = (x82) x82Var;
                        Parcel parcelM5808a = x82Var2.m5808a(x82Var2.m5810d(), 2);
                        Account account3 = (Account) ru1.m4407a(parcelM5808a, Account.CREATOR);
                        parcelM5808a.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.f9630n = iBinder;
            account2 = account;
        }
        this.f9633q = account2;
        this.f9631o = scopeArr2;
        this.f9632p = bundle2;
        this.f9634r = c0451lzArr4;
        this.f9635s = c0451lzArr3;
        this.f9636t = z;
        this.f9637u = i4;
        this.f9638v = z2;
        this.f9639w = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jm1.m2935a(this, parcel, i);
    }
}
