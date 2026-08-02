package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new E(3);

    /* renamed from: F, reason: collision with root package name */
    public static final Scope[] f11243F = new Scope[0];

    /* renamed from: G, reason: collision with root package name */
    public static final Feature[] f11244G = new Feature[0];

    /* renamed from: A, reason: collision with root package name */
    public Feature[] f11245A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f11246B;

    /* renamed from: C, reason: collision with root package name */
    public final int f11247C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f11248D;

    /* renamed from: E, reason: collision with root package name */
    public final String f11249E;

    /* renamed from: a, reason: collision with root package name */
    public final int f11250a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11251b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11252c;

    /* renamed from: d, reason: collision with root package name */
    public String f11253d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f11254e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f11255f;

    /* renamed from: x, reason: collision with root package name */
    public Bundle f11256x;

    /* renamed from: y, reason: collision with root package name */
    public Account f11257y;

    /* renamed from: z, reason: collision with root package name */
    public Feature[] f11258z;

    public GetServiceRequest(int i7, int i8, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z4, int i10, boolean z7, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f11243F : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = f11244G;
        Feature[] featureArr4 = featureArr == null ? featureArr3 : featureArr;
        featureArr3 = featureArr2 != null ? featureArr2 : featureArr3;
        this.f11250a = i7;
        this.f11251b = i8;
        this.f11252c = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f11253d = "com.google.android.gms";
        } else {
            this.f11253d = str;
        }
        if (i7 < 2) {
            account2 = null;
            if (iBinder != null) {
                int i11 = AbstractBinderC0849a.f11301a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC0860l p5 = queryLocalInterface instanceof InterfaceC0860l ? (InterfaceC0860l) queryLocalInterface : new P(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                if (p5 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            P p7 = (P) p5;
                            Parcel zzB = p7.zzB(2, p7.zza());
                            Account account3 = (Account) zzc.zza(zzB, Account.CREATOR);
                            zzB.recycle();
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
        } else {
            this.f11254e = iBinder;
            account2 = account;
        }
        this.f11257y = account2;
        this.f11255f = scopeArr2;
        this.f11256x = bundle2;
        this.f11258z = featureArr4;
        this.f11245A = featureArr3;
        this.f11246B = z4;
        this.f11247C = i10;
        this.f11248D = z7;
        this.f11249E = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        E.a(this, parcel, i7);
    }
}
