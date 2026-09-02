package o0;

/* loaded from: classes.dex */
public final class v extends C0.c implements n0.g, n0.h {

    /* renamed from: i, reason: collision with root package name */
    public static final B0.b f8189i = B0.c.f6a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f8190b;

    /* renamed from: c, reason: collision with root package name */
    public final A0.a f8191c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.b f8192d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f8193e;

    /* renamed from: f, reason: collision with root package name */
    public final P1.h f8194f;

    /* renamed from: g, reason: collision with root package name */
    public C0.a f8195g;

    /* renamed from: h, reason: collision with root package name */
    public o0.o f8196h;

    public v(android.content.Context context, A0.a aVar, P1.h hVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f8190b = context;
        this.f8191c = aVar;
        this.f8194f = hVar;
        this.f8193e = (java.util.Set) hVar.f1483a;
        this.f8192d = f8189i;
    }

    @Override // n0.g
    public final void a(int i2) {
        o0.o oVar = this.f8196h;
        o0.m mVar = (o0.m) oVar.f8173f.f8142j.get(oVar.f8169b);
        if (mVar != null) {
            if (mVar.f8161i) {
                mVar.p(new m0.b(17));
            } else {
                mVar.a(i2);
            }
        }
    }

    @Override // n0.h
    public final void b(m0.b bVar) {
        this.f8196h.b(bVar);
    }

    @Override // n0.g
    public final void c() {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount;
        android.os.Parcel obtain;
        android.os.Parcel obtain2;
        C0.a aVar = this.f8195g;
        aVar.getClass();
        try {
            aVar.f101z.getClass();
            android.accounts.Account account = new android.accounts.Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    android.content.Context context = aVar.f2601c;
                    java.util.concurrent.locks.ReentrantLock reentrantLock = l0.C0926a.f8013c;
                    p0.AbstractC0966r.c(context);
                    java.util.concurrent.locks.ReentrantLock reentrantLock2 = l0.C0926a.f8013c;
                    reentrantLock2.lock();
                    try {
                        if (l0.C0926a.f8014d == null) {
                            l0.C0926a.f8014d = new l0.C0926a(context.getApplicationContext());
                        }
                        l0.C0926a c0926a = l0.C0926a.f8014d;
                        reentrantLock2.unlock();
                        java.lang.String a2 = c0926a.a("defaultGoogleSignInAccount");
                        if (!android.text.TextUtils.isEmpty(a2)) {
                            java.lang.String a3 = c0926a.a("googleSignInAccount:" + a2);
                            if (a3 != null) {
                                try {
                                    googleSignInAccount = com.google.android.gms.auth.api.signin.GoogleSignInAccount.a(a3);
                                } catch (org.json.JSONException unused) {
                                }
                                java.lang.Integer num = aVar.f99B;
                                p0.AbstractC0966r.c(num);
                                p0.C0961m c0961m = new p0.C0961m(2, account, num.intValue(), googleSignInAccount);
                                C0.d dVar = (C0.d) aVar.q();
                                obtain = android.os.Parcel.obtain();
                                obtain.writeInterfaceToken(dVar.f8481b);
                                int i2 = y0.b.f8482a;
                                obtain.writeInt(1);
                                int G = a.AbstractC0059a.G(obtain, 20293);
                                a.AbstractC0059a.I(obtain, 1, 4);
                                obtain.writeInt(1);
                                a.AbstractC0059a.C(obtain, 2, c0961m, 0);
                                a.AbstractC0059a.H(obtain, G);
                                obtain.writeStrongBinder(this);
                                obtain2 = android.os.Parcel.obtain();
                                dVar.f8480a.transact(12, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain.recycle();
                                obtain2.recycle();
                                return;
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                dVar.f8480a.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (java.lang.Throwable th2) {
                obtain.recycle();
                obtain2.recycle();
                throw th2;
            }
            googleSignInAccount = null;
            java.lang.Integer num2 = aVar.f99B;
            p0.AbstractC0966r.c(num2);
            p0.C0961m c0961m2 = new p0.C0961m(2, account, num2.intValue(), googleSignInAccount);
            C0.d dVar2 = (C0.d) aVar.q();
            obtain = android.os.Parcel.obtain();
            obtain.writeInterfaceToken(dVar2.f8481b);
            int i22 = y0.b.f8482a;
            obtain.writeInt(1);
            int G2 = a.AbstractC0059a.G(obtain, 20293);
            a.AbstractC0059a.I(obtain, 1, 4);
            obtain.writeInt(1);
            a.AbstractC0059a.C(obtain, 2, c0961m2, 0);
            a.AbstractC0059a.H(obtain, G2);
            obtain.writeStrongBinder(this);
            obtain2 = android.os.Parcel.obtain();
        } catch (android.os.RemoteException e2) {
            android.util.Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f8191c.post(new D0.f(7, this, new C0.f(1, new m0.b(8, null), null)));
            } catch (android.os.RemoteException unused2) {
                android.util.Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }
}
