package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC0869k;

/* renamed from: com.google.android.gms.common.internal.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0865g extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0865g> CREATOR = new i0();
    public static final Scope[] q = new Scope[0];
    public static final C0854d[] r = new C0854d[0];
    public final int a;
    public final int b;
    public final int c;
    public String d;

    @Nullable
    public IBinder e;
    public Scope[] f;
    public Bundle i;

    @Nullable
    public Account j;
    public C0854d[] k;
    public C0854d[] l;
    public final boolean m;
    public final int n;
    public boolean o;

    @Nullable
    public final String p;

    public C0865g(int i, int i2, int i3, String str, @Nullable IBinder iBinder, Scope[] scopeArr, Bundle bundle, @Nullable Account account, C0854d[] c0854dArr, C0854d[] c0854dArr2, boolean z, int i4, boolean z2, @Nullable String str2) {
        scopeArr = scopeArr == null ? q : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        C0854d[] c0854dArr3 = r;
        c0854dArr = c0854dArr == null ? c0854dArr3 : c0854dArr;
        c0854dArr2 = c0854dArr2 == null ? c0854dArr3 : c0854dArr2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = InterfaceC0869k.a.a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC0869k q0Var = queryLocalInterface instanceof InterfaceC0869k ? (InterfaceC0869k) queryLocalInterface : new q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                int i6 = BinderC0859a.b;
                if (q0Var != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = q0Var.zzb();
                    } catch (RemoteException unused) {
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.j = account2;
        } else {
            this.e = iBinder;
            this.j = account;
        }
        this.f = scopeArr;
        this.i = bundle;
        this.k = c0854dArr;
        this.l = c0854dArr2;
        this.m = z;
        this.n = i4;
        this.o = z2;
        this.p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        i0.a(this, parcel, i);
    }
}
