package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC0854f;
import com.google.android.gms.common.internal.C0856h;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import e3.C1016a;
import java.util.Set;
import y3.AbstractC1801b;
import z3.AbstractBinderC1817b;
import z3.C1816a;
import z3.C1818c;

/* loaded from: classes.dex */
public final class M extends AbstractBinderC1817b implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* renamed from: y, reason: collision with root package name */
    public static final W2.g f11131y = AbstractC1801b.f18195a;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11132a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f11133b;

    /* renamed from: c, reason: collision with root package name */
    public final W2.g f11134c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f11135d;

    /* renamed from: e, reason: collision with root package name */
    public final C0856h f11136e;

    /* renamed from: f, reason: collision with root package name */
    public C1816a f11137f;

    /* renamed from: x, reason: collision with root package name */
    public H2.r f11138x;

    public M(Context context, Handler handler, C0856h c0856h) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f11132a = context;
        this.f11133b = handler;
        this.f11136e = c0856h;
        this.f11135d = c0856h.f11305a;
        this.f11134c = f11131y;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0830g
    public final void Z() {
        C1816a c1816a = this.f11137f;
        c1816a.getClass();
        try {
            c1816a.f18455b.getClass();
            Account account = new Account(AbstractC0854f.DEFAULT_ACCOUNT, "com.google");
            GoogleSignInAccount b7 = AbstractC0854f.DEFAULT_ACCOUNT.equals(account.name) ? C1016a.a(c1816a.getContext()).b() : null;
            Integer num = c1816a.f18457d;
            com.google.android.gms.common.internal.D.i(num);
            zat zatVar = new zat(2, account, num.intValue(), b7);
            C1818c c1818c = (C1818c) c1816a.getService();
            zai zaiVar = new zai(1, zatVar);
            Parcel zaa = c1818c.zaa();
            zac.zad(zaa, zaiVar);
            zac.zae(zaa, this);
            c1818c.zac(12, zaa);
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f11133b.post(new X(2, this, new zak(1, new ConnectionResult(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0839p
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f11138x.f(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0830g
    public final void onConnectionSuspended(int i7) {
        this.f11137f.disconnect();
    }
}
