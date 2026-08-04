package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC0810f;
import com.google.android.gms.common.internal.C0812h;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p173z3.b implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final W2.g f11131y = p168y3.b.f18201a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f11133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W2.g f11134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f11135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0812h f11136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p173z3.a f11137f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public H2.r f11138x;

    public M(Context context, Handler handler, C0812h c0812h) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f11132a = context;
        this.f11133b = handler;
        this.f11136e = c0812h;
        this.f11135d = c0812h.f11305a;
        this.f11134c = f11131y;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0786g
    public final void Z() {
        p173z3.a aVar = this.f11137f;
        aVar.getClass();
        try {
            aVar.f18461b.getClass();
            Account account = new Account(AbstractC0810f.DEFAULT_ACCOUNT, "com.google");
            GoogleSignInAccount googleSignInAccountB = AbstractC0810f.DEFAULT_ACCOUNT.equals(account.name) ? p033e3.a.a(aVar.getContext()).b() : null;
            Integer num = aVar.f18463d;
            com.google.android.gms.common.internal.D.i(num);
            zat zatVar = new zat(2, account, num.intValue(), googleSignInAccountB);
            p173z3.c cVar = (p173z3.c) aVar.getService();
            zai zaiVar = new zai(1, zatVar);
            Parcel parcelZaa = cVar.zaa();
            zac.zad(parcelZaa, zaiVar);
            zac.zae(parcelZaa, this);
            cVar.zac(12, parcelZaa);
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f11133b.post(new X(2, this, new zak(1, new ConnectionResult(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0795p
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f11138x.f(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0786g
    public final void onConnectionSuspended(int i7) {
        this.f11137f.disconnect();
    }
}
