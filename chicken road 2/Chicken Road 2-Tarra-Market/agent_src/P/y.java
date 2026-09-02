package P;

import Q.C0005c;
import a0.AbstractBinderC0010a;
import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c0.AbstractC0041b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import d0.C0052a;
import d0.C0054c;
import d0.C0056e;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class y extends AbstractBinderC0010a implements O.g, O.h {

    /* renamed from: i, reason: collision with root package name */
    public static final S.b f367i = AbstractC0041b.f700a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f368b;

    /* renamed from: c, reason: collision with root package name */
    public final Z.e f369c;

    /* renamed from: d, reason: collision with root package name */
    public final S.b f370d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f371e;

    /* renamed from: f, reason: collision with root package name */
    public final C0005c f372f;

    /* renamed from: g, reason: collision with root package name */
    public C0052a f373g;

    /* renamed from: h, reason: collision with root package name */
    public r f374h;

    public y(Context context, Z.e eVar, C0005c c0005c) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f368b = context;
        this.f369c = eVar;
        this.f372f = c0005c;
        this.f371e = (Set) c0005c.f400a;
        this.f370d = f367i;
    }

    @Override // O.h
    public final void a(N.b bVar) {
        this.f374h.b(bVar);
    }

    @Override // O.g
    public final void b(int i2) {
        r rVar = this.f374h;
        o oVar = (o) ((C0002c) rVar.f351f).f311j.get((C0000a) rVar.f348c);
        if (oVar != null) {
            if (oVar.f336i) {
                oVar.p(new N.b(17));
            } else {
                oVar.b(i2);
            }
        }
    }

    @Override // O.g
    public final void c() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        int i2 = 1;
        C0052a c0052a = this.f373g;
        c0052a.getClass();
        try {
            c0052a.f892z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = c0052a.f734c;
                    ReentrantLock reentrantLock = M.a.f217c;
                    Q.s.c(context);
                    ReentrantLock reentrantLock2 = M.a.f217c;
                    reentrantLock2.lock();
                    try {
                        if (M.a.f218d == null) {
                            M.a.f218d = new M.a(context.getApplicationContext());
                        }
                        M.a aVar = M.a.f218d;
                        reentrantLock2.unlock();
                        String a2 = aVar.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a2)) {
                            String a3 = aVar.a("googleSignInAccount:" + a2);
                            if (a3 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.a(a3);
                                } catch (JSONException unused) {
                                }
                                Integer num = c0052a.f890B;
                                Q.s.c(num);
                                Q.n nVar = new Q.n(2, account, num.intValue(), googleSignInAccount);
                                C0054c c0054c = (C0054c) c0052a.q();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(c0054c.f531b);
                                int i3 = Z.b.f532a;
                                obtain.writeInt(1);
                                int L = V.a.L(obtain, 20293);
                                V.a.N(obtain, 1, 4);
                                obtain.writeInt(1);
                                V.a.H(obtain, 2, nVar, 0);
                                V.a.M(obtain, L);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                c0054c.f530a.transact(12, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain.recycle();
                                obtain2.recycle();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                c0054c.f530a.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (Throwable th2) {
                obtain.recycle();
                obtain2.recycle();
                throw th2;
            }
            googleSignInAccount = null;
            Integer num2 = c0052a.f890B;
            Q.s.c(num2);
            Q.n nVar2 = new Q.n(2, account, num2.intValue(), googleSignInAccount);
            C0054c c0054c2 = (C0054c) c0052a.q();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c0054c2.f531b);
            int i32 = Z.b.f532a;
            obtain.writeInt(1);
            int L2 = V.a.L(obtain, 20293);
            V.a.N(obtain, 1, 4);
            obtain.writeInt(1);
            V.a.H(obtain, 2, nVar2, 0);
            V.a.M(obtain, L2);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f369c.post(new q(i2, this, new C0056e(1, new N.b(8, null), null)));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }
}
