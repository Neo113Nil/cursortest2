package l3;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.ads.Jt;
import i3.C2014a;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import k4.AbstractC2036a;
import org.json.JSONException;
import w3.AbstractC2552a;

/* loaded from: classes.dex */
public final class u extends C3.c implements k3.g, k3.h {

    /* renamed from: s, reason: collision with root package name */
    public static final B3.b f17836s = B3.c.f754a;

    /* renamed from: l, reason: collision with root package name */
    public final Context f17837l;

    /* renamed from: m, reason: collision with root package name */
    public final Jt f17838m;

    /* renamed from: n, reason: collision with root package name */
    public final B3.b f17839n;

    /* renamed from: o, reason: collision with root package name */
    public final Set f17840o;

    /* renamed from: p, reason: collision with root package name */
    public final C0.c f17841p;

    /* renamed from: q, reason: collision with root package name */
    public C3.a f17842q;

    /* renamed from: r, reason: collision with root package name */
    public S2.r f17843r;

    public u(Context context, Jt jt, C0.c cVar) {
        super(0);
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f17837l = context;
        this.f17838m = jt;
        this.f17841p = cVar;
        this.f17840o = (Set) cVar.f811b;
        this.f17839n = f17836s;
    }

    @Override // k3.g
    public final void L(int i) {
        this.f17842q.l();
    }

    @Override // k3.g
    public final void N() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        int i = 20;
        C3.a aVar = this.f17842q;
        aVar.getClass();
        try {
            aVar.f835A.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = aVar.f18025c;
                    ReentrantLock reentrantLock = C2014a.f17341c;
                    m3.v.e(context);
                    ReentrantLock reentrantLock2 = C2014a.f17341c;
                    reentrantLock2.lock();
                    try {
                        if (C2014a.f17342d == null) {
                            C2014a.f17342d = new C2014a(context.getApplicationContext());
                        }
                        C2014a c2014a = C2014a.f17342d;
                        reentrantLock2.unlock();
                        String a5 = c2014a.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a5)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(a5).length() + 20);
                            sb.append("googleSignInAccount:");
                            sb.append(a5);
                            String a6 = c2014a.a(sb.toString());
                            if (a6 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.a(a6);
                                } catch (JSONException unused) {
                                }
                                Integer num = aVar.f837C;
                                m3.v.e(num);
                                m3.q qVar = new m3.q(2, account, num.intValue(), googleSignInAccount);
                                C3.d dVar = (C3.d) aVar.t();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(dVar.f8166m);
                                int i5 = AbstractC2552a.f20529a;
                                obtain.writeInt(1);
                                int k02 = AbstractC2036a.k0(obtain, 20293);
                                AbstractC2036a.n0(obtain, 1, 4);
                                obtain.writeInt(1);
                                AbstractC2036a.e0(obtain, 2, qVar, 0);
                                AbstractC2036a.m0(obtain, k02);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                dVar.f8165l.transact(12, obtain, obtain2, 0);
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
                dVar.f8165l.transact(12, obtain, obtain2, 0);
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
            Integer num2 = aVar.f837C;
            m3.v.e(num2);
            m3.q qVar2 = new m3.q(2, account, num2.intValue(), googleSignInAccount);
            C3.d dVar2 = (C3.d) aVar.t();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(dVar2.f8166m);
            int i52 = AbstractC2552a.f20529a;
            obtain.writeInt(1);
            int k022 = AbstractC2036a.k0(obtain, 20293);
            AbstractC2036a.n0(obtain, 1, 4);
            obtain.writeInt(1);
            AbstractC2036a.e0(obtain, 2, qVar2, 0);
            AbstractC2036a.m0(obtain, k022);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e3) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f17838m.post(new D3.h(i, this, new C3.f(1, new j3.b(8, null), null)));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e3);
            }
        }
    }

    @Override // k3.h
    public final void Y(j3.b bVar) {
        this.f17843r.b(bVar);
    }
}
