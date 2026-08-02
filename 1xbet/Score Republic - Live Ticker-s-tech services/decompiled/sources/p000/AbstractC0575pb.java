package p000;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: pb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0575pb {

    /* JADX INFO: renamed from: y */
    public static final C0451lz[] f6045y = new C0451lz[0];

    /* JADX INFO: renamed from: b */
    public C0272h3 f6047b;

    /* JADX INFO: renamed from: c */
    public final Context f6048c;

    /* JADX INFO: renamed from: d */
    public final j72 f6049d;

    /* JADX INFO: renamed from: e */
    public final i90 f6050e;

    /* JADX INFO: renamed from: f */
    public final tt1 f6051f;

    /* JADX INFO: renamed from: i */
    public om1 f6054i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0538ob f6055j;

    /* JADX INFO: renamed from: k */
    public IInterface f6056k;

    /* JADX INFO: renamed from: m */
    public fw1 f6058m;

    /* JADX INFO: renamed from: o */
    public final InterfaceC0464mb f6060o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC0501nb f6061p;

    /* JADX INFO: renamed from: q */
    public final int f6062q;

    /* JADX INFO: renamed from: r */
    public final String f6063r;

    /* JADX INFO: renamed from: s */
    public volatile String f6064s;

    /* JADX INFO: renamed from: t */
    public volatile nu1 f6065t;

    /* JADX INFO: renamed from: a */
    public volatile String f6046a = null;

    /* JADX INFO: renamed from: g */
    public final Object f6052g = new Object();

    /* JADX INFO: renamed from: h */
    public final Object f6053h = new Object();

    /* JADX INFO: renamed from: l */
    public final ArrayList f6057l = new ArrayList();

    /* JADX INFO: renamed from: n */
    public int f6059n = 1;

    /* JADX INFO: renamed from: u */
    public C0253gl f6066u = null;

    /* JADX INFO: renamed from: v */
    public boolean f6067v = false;

    /* JADX INFO: renamed from: w */
    public volatile y02 f6068w = null;

    /* JADX INFO: renamed from: x */
    public final AtomicInteger f6069x = new AtomicInteger(0);

    public AbstractC0575pb(Context context, Looper looper, j72 j72Var, i90 i90Var, int i, InterfaceC0464mb interfaceC0464mb, InterfaceC0501nb interfaceC0501nb, String str) {
        p80.m3864i(context, "Context must not be null");
        this.f6048c = context;
        p80.m3864i(looper, "Looper must not be null");
        p80.m3864i(j72Var, "Supervisor must not be null");
        this.f6049d = j72Var;
        p80.m3864i(i90Var, "API availability must not be null");
        this.f6050e = i90Var;
        this.f6051f = new tt1(this, looper);
        this.f6062q = i;
        this.f6060o = interfaceC0464mb;
        this.f6061p = interfaceC0501nb;
        this.f6063r = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m3886a() {
        int iM2575b = this.f6050e.m2575b(this.f6048c, mo719i());
        if (iM2575b == 0) {
            this.f6055j = new b90(this);
            m3895t(2, null);
            return;
        }
        m3895t(1, null);
        this.f6055j = new b90(this);
        int i = this.f6069x.get();
        tt1 tt1Var = this.f6051f;
        tt1Var.sendMessage(tt1Var.obtainMessage(3, i, iM2575b, null));
    }

    /* JADX INFO: renamed from: b */
    public abstract IInterface mo717b(IBinder iBinder);

    /* JADX INFO: renamed from: c */
    public final void m3887c() {
        this.f6069x.incrementAndGet();
        ArrayList arrayList = this.f6057l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    km1 km1Var = (km1) arrayList.get(i);
                    synchronized (km1Var) {
                        km1Var.f4448a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f6053h) {
            this.f6054i = null;
        }
        m3895t(1, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m3888d(String str) {
        this.f6046a = str;
        m3887c();
    }

    /* JADX INFO: renamed from: e */
    public Account mo1391e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public C0451lz[] mo718f() {
        return f6045y;
    }

    /* JADX INFO: renamed from: g */
    public Executor mo1392g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public Bundle mo1464h() {
        return new Bundle();
    }

    /* JADX INFO: renamed from: i */
    public abstract int mo719i();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m3889j(wb0 wb0Var, Set set) {
        AttributionSource attributionSource;
        Bundle bundleMo1464h = mo1464h();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.f6065t == null || (attributionSource = (AttributionSource) this.f6065t.f5551k) == null || attributionSource.getAttributionTag() == null) ? this.f6064s : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.f6062q;
        int i2 = i90.f3484a;
        Scope[] scopeArr = z70.f9624x;
        Bundle bundle = new Bundle();
        C0451lz[] c0451lzArr = z70.f9625y;
        z70 z70Var = new z70(6, i, i2, null, null, scopeArr, bundle, null, c0451lzArr, c0451lzArr, true, 0, false, str);
        z70Var.f9629m = this.f6048c.getPackageName();
        z70Var.f9632p = bundleMo1464h;
        if (set != null) {
            z70Var.f9631o = (Scope[]) set.toArray(new Scope[0]);
        }
        if (mo3893r()) {
            Account accountMo1391e = mo1391e();
            if (accountMo1391e == null) {
                accountMo1391e = new Account("<<default account>>", "com.google");
            }
            z70Var.f9633q = accountMo1391e;
            if (wb0Var != 0) {
                z70Var.f9630n = ((yk1) wb0Var).f9318c;
            }
        }
        z70Var.f9634r = f6045y;
        z70Var.f9635s = mo718f();
        try {
            try {
                synchronized (this.f6053h) {
                    try {
                        om1 om1Var = this.f6054i;
                        if (om1Var != null) {
                            om1Var.m3704a(new nv1(this, this.f6069x.get()), z70Var);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RemoteException | RuntimeException e) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
                int i3 = this.f6069x.get();
                nw1 nw1Var = new nw1(this, 8, null, null);
                tt1 tt1Var = this.f6051f;
                tt1Var.sendMessage(tt1Var.obtainMessage(1, i3, -1, nw1Var));
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            int i4 = this.f6069x.get();
            tt1 tt1Var2 = this.f6051f;
            tt1Var2.sendMessage(tt1Var2.obtainMessage(6, i4, 3));
        } catch (SecurityException e3) {
            throw e3;
        }
    }

    /* JADX INFO: renamed from: k */
    public Set mo1393k() {
        return Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: l */
    public final IInterface m3890l() {
        IInterface iInterface;
        synchronized (this.f6052g) {
            try {
                if (this.f6059n == 5) {
                    throw new DeadObjectException();
                }
                if (!m3891p()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f6056k;
                p80.m3864i(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    /* JADX INFO: renamed from: m */
    public abstract String mo720m();

    /* JADX INFO: renamed from: n */
    public abstract String mo721n();

    /* JADX INFO: renamed from: o */
    public boolean mo722o() {
        return mo719i() >= 211700000;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m3891p() {
        boolean z;
        synchronized (this.f6052g) {
            z = this.f6059n == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m3892q() {
        boolean z;
        synchronized (this.f6052g) {
            int i = this.f6059n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo3893r() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ boolean m3894s(int i, int i2, IInterface iInterface) {
        synchronized (this.f6052g) {
            try {
                if (this.f6059n != i) {
                    return false;
                }
                m3895t(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m3895t(int i, IInterface iInterface) {
        C0272h3 c0272h3;
        p80.m3858b((i == 4) == (iInterface != null));
        synchronized (this.f6052g) {
            try {
                this.f6059n = i;
                this.f6056k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    fw1 fw1Var = this.f6058m;
                    if (fw1Var != null) {
                        j72 j72Var = this.f6049d;
                        String str = (String) this.f6047b.f3021b;
                        p80.m3863h(str);
                        this.f6047b.getClass();
                        if (this.f6063r == null) {
                            this.f6048c.getClass();
                        }
                        j72Var.m2825c(str, fw1Var, this.f6047b.f3022c);
                        this.f6058m = null;
                    }
                } else if (i == 2 || i == 3) {
                    fw1 fw1Var2 = this.f6058m;
                    if (fw1Var2 != null && (c0272h3 = this.f6047b) != null) {
                        String str2 = (String) c0272h3.f3021b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        j72 j72Var2 = this.f6049d;
                        String str3 = (String) this.f6047b.f3021b;
                        p80.m3863h(str3);
                        this.f6047b.getClass();
                        if (this.f6063r == null) {
                            this.f6048c.getClass();
                        }
                        j72Var2.m2825c(str3, fw1Var2, this.f6047b.f3022c);
                        this.f6069x.incrementAndGet();
                    }
                    fw1 fw1Var3 = new fw1(this, this.f6069x.get());
                    this.f6058m = fw1Var3;
                    String strMo721n = mo721n();
                    boolean zMo722o = mo722o();
                    this.f6047b = new C0272h3(1, strMo721n, zMo722o);
                    if (zMo722o && mo719i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f6047b.f3021b)));
                    }
                    j72 j72Var3 = this.f6049d;
                    String str4 = (String) this.f6047b.f3021b;
                    p80.m3863h(str4);
                    this.f6047b.getClass();
                    String name = this.f6063r;
                    if (name == null) {
                        name = this.f6048c.getClass().getName();
                    }
                    C0253gl c0253glM2824b = j72Var3.m2824b(new k42(str4, this.f6047b.f3022c), fw1Var3, name, mo1392g());
                    if (!(c0253glM2824b.f2796k == 0)) {
                        String str5 = (String) this.f6047b.f3021b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = c0253glM2824b.f2796k;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (c0253glM2824b.f2797l != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c0253glM2824b.f2797l);
                        }
                        int i3 = this.f6069x.get();
                        lx1 lx1Var = new lx1(this, i2, bundle);
                        tt1 tt1Var = this.f6051f;
                        tt1Var.sendMessage(tt1Var.obtainMessage(7, i3, -1, lx1Var));
                    }
                } else if (i == 4) {
                    p80.m3863h(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
