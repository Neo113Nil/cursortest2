package R0;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c1.AbstractBinderC0169a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import g1.AbstractC0316b;
import h1.C0325a;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class u extends AbstractBinderC0169a implements Q0.g, Q0.h {

    /* renamed from: k, reason: collision with root package name */
    public static final U0.b f1242k = AbstractC0316b.f4976a;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1243d;

    /* renamed from: e, reason: collision with root package name */
    public final b1.e f1244e;
    public final U0.b f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f1245g;

    /* renamed from: h, reason: collision with root package name */
    public final A0.h f1246h;

    /* renamed from: i, reason: collision with root package name */
    public C0325a f1247i;

    /* renamed from: j, reason: collision with root package name */
    public n f1248j;

    public u(Context context, b1.e eVar, A0.h hVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f1243d = context;
        this.f1244e = eVar;
        this.f1246h = hVar;
        this.f1245g = (Set) hVar.f56d;
        this.f = f1242k;
    }

    @Override // Q0.h
    public final void a(P0.b bVar) {
        this.f1248j.c(bVar);
    }

    @Override // Q0.g
    public final void b(int i3) {
        n nVar = this.f1248j;
        l lVar = (l) ((c) nVar.f).f1200j.get((a) nVar.f1224c);
        if (lVar != null) {
            if (lVar.f1215k) {
                lVar.p(new P0.b(17));
            } else {
                lVar.b(i3);
            }
        }
    }

    @Override // Q0.g
    public final void c() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        boolean z3 = false;
        int i3 = 4;
        C0325a c0325a = this.f1247i;
        c0325a.getClass();
        try {
            c0325a.f4985z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = c0325a.f2574c;
                    ReentrantLock reentrantLock = O0.a.f1060c;
                    S0.r.c(context);
                    ReentrantLock reentrantLock2 = O0.a.f1060c;
                    reentrantLock2.lock();
                    try {
                        if (O0.a.f1061d == null) {
                            O0.a.f1061d = new O0.a(context.getApplicationContext());
                        }
                        O0.a aVar = O0.a.f1061d;
                        reentrantLock2.unlock();
                        String a3 = aVar.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a3)) {
                            String a4 = aVar.a("googleSignInAccount:" + a3);
                            if (a4 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.a(a4);
                                } catch (JSONException unused) {
                                }
                                Integer num = c0325a.f4984B;
                                S0.r.c(num);
                                S0.m mVar = new S0.m(2, account, num.intValue(), googleSignInAccount);
                                h1.c cVar = (h1.c) c0325a.q();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(cVar.f2473e);
                                int i4 = b1.b.f2474a;
                                obtain.writeInt(1);
                                int Q2 = F2.b.Q(obtain, 20293);
                                F2.b.S(obtain, 1, 4);
                                obtain.writeInt(1);
                                F2.b.M(obtain, 2, mVar, 0);
                                F2.b.R(obtain, Q2);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                cVar.f2472d.transact(12, obtain, obtain2, 0);
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
                cVar.f2472d.transact(12, obtain, obtain2, 0);
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
            Integer num2 = c0325a.f4984B;
            S0.r.c(num2);
            S0.m mVar2 = new S0.m(2, account, num2.intValue(), googleSignInAccount);
            h1.c cVar2 = (h1.c) c0325a.q();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(cVar2.f2473e);
            int i42 = b1.b.f2474a;
            obtain.writeInt(1);
            int Q22 = F2.b.Q(obtain, 20293);
            F2.b.S(obtain, 1, 4);
            obtain.writeInt(1);
            F2.b.M(obtain, 2, mVar2, 0);
            F2.b.R(obtain, Q22);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e3) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f1244e.post(new A.a(this, new h1.e(1, new P0.b(8, null), null), i3, z3));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e3);
            }
        }
    }
}
