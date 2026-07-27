package G1;

import a.AbstractC0169a;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import j1.C1199a;
import java.util.concurrent.locks.ReentrantLock;
import l.q0;
import m1.InterfaceC1276c;
import m1.i;
import m1.j;
import o1.C1365c;
import o1.p;
import o1.u;
import org.json.JSONException;
import y1.AbstractC1555a;

/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.a implements InterfaceC1276c {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f914H = 0;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f915D;

    /* renamed from: E, reason: collision with root package name */
    public final q0 f916E;

    /* renamed from: F, reason: collision with root package name */
    public final Bundle f917F;

    /* renamed from: G, reason: collision with root package name */
    public final Integer f918G;

    public a(Context context, Looper looper, q0 q0Var, Bundle bundle, i iVar, j jVar) {
        super(context, looper, 44, q0Var, iVar, jVar);
        this.f915D = true;
        this.f916E = q0Var;
        this.f917F = bundle;
        this.f918G = (Integer) q0Var.f10947g;
    }

    public final void A() {
        d(new C1365c(this));
    }

    public final void B(c cVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.f916E.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = this.f5000h;
                ReentrantLock reentrantLock = C1199a.f10463c;
                u.g(context);
                ReentrantLock reentrantLock2 = C1199a.f10463c;
                reentrantLock2.lock();
                try {
                    if (C1199a.f10464d == null) {
                        C1199a.f10464d = new C1199a(context.getApplicationContext());
                    }
                    C1199a c1199a = C1199a.f10464d;
                    reentrantLock2.unlock();
                    String a6 = c1199a.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(a6)) {
                        String a7 = c1199a.a("googleSignInAccount:" + a6);
                        if (a7 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.a(a7);
                            } catch (JSONException unused) {
                            }
                            Integer num = this.f918G;
                            u.g(num);
                            p pVar = new p(2, account, num.intValue(), googleSignInAccount);
                            e eVar = (e) t();
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken(eVar.f211f);
                            int i2 = AbstractC1555a.f12339a;
                            obtain.writeInt(1);
                            int R5 = AbstractC0169a.R(obtain, 20293);
                            AbstractC0169a.T(obtain, 1, 4);
                            obtain.writeInt(1);
                            AbstractC0169a.N(obtain, 2, pVar, 0);
                            AbstractC0169a.S(obtain, R5);
                            obtain.writeStrongBinder(cVar);
                            eVar.b(obtain, 12);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = this.f918G;
            u.g(num2);
            p pVar2 = new p(2, account, num2.intValue(), googleSignInAccount);
            e eVar2 = (e) t();
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(eVar2.f211f);
            int i22 = AbstractC1555a.f12339a;
            obtain2.writeInt(1);
            int R52 = AbstractC0169a.R(obtain2, 20293);
            AbstractC0169a.T(obtain2, 1, 4);
            obtain2.writeInt(1);
            AbstractC0169a.N(obtain2, 2, pVar2, 0);
            AbstractC0169a.S(obtain2, R52);
            obtain2.writeStrongBinder(cVar);
            eVar2.b(obtain2, 12);
        } catch (RemoteException e3) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.a(new g(1, new l1.b(8, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e3);
            }
        }
    }

    @Override // m1.InterfaceC1276c
    public final int f() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, m1.InterfaceC1276c
    public final boolean n() {
        return this.f915D;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder, "com.google.android.gms.signin.internal.ISignInService", 2);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle s() {
        q0 q0Var = this.f916E;
        boolean equals = this.f5000h.getPackageName().equals((String) q0Var.f10944d);
        Bundle bundle = this.f917F;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) q0Var.f10944d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
