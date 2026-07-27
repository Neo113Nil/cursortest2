package G0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractBinderC0320c;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.C0317b;
import com.google.android.gms.internal.play_billing.InterfaceC0323d;
import com.google.android.gms.internal.play_billing.P1;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.T1;
import com.google.android.gms.internal.play_billing.U1;
import com.google.android.gms.internal.play_billing.W1;
import com.google.android.gms.internal.play_billing.k2;
import com.google.android.gms.internal.play_billing.l2;
import com.google.android.gms.internal.play_billing.m2;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class B implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0055e f742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0054d f743b;

    public /* synthetic */ B(C0054d c0054d, InterfaceC0055e interfaceC0055e) {
        this.f743b = c0054d;
        this.f742a = interfaceC0055e;
    }

    public final void a(C0060j c0060j) {
        synchronized (this.f743b.f824a) {
            try {
                if (this.f743b.f825b == 3) {
                    return;
                }
                this.f742a.onBillingSetupFinished(c0060j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        AbstractC0357o0.g("BillingClient", "Billing service died.");
        try {
            C0054d c0054d = this.f743b;
            synchronized (c0054d.f824a) {
                z = true;
                if (c0054d.f825b != 1) {
                    z = false;
                }
            }
            if (z) {
                B0.l lVar = this.f743b.f830g;
                P1 r5 = Q1.r();
                r5.f(6);
                T1 r6 = U1.r();
                r6.f(122);
                r5.e(r6);
                lVar.h((Q1) r5.b());
            } else {
                this.f743b.f830g.l(W1.n());
            }
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f743b.f824a) {
            if (this.f743b.f825b != 3 && this.f743b.f825b != 0) {
                this.f743b.t(0);
                this.f743b.u();
                this.f742a.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0323d c0317b;
        AbstractC0357o0.f("BillingClient", "Billing service connected.");
        synchronized (this.f743b.f824a) {
            try {
                if (this.f743b.f825b == 3) {
                    return;
                }
                C0054d c0054d = this.f743b;
                int i2 = AbstractBinderC0320c.f5157e;
                if (iBinder == null) {
                    c0317b = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    c0317b = queryLocalInterface instanceof InterfaceC0323d ? (InterfaceC0323d) queryLocalInterface : new C0317b(iBinder, "com.android.vending.billing.IInAppBillingService", 1);
                }
                c0054d.f831h = c0317b;
                C0054d c0054d2 = this.f743b;
                if (C0054d.m(new Callable() { // from class: G0.A
                    /* JADX WARN: Removed duplicated region for block: B:180:0x0218  */
                    /* JADX WARN: Removed duplicated region for block: B:182:0x021d  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object call() {
                        Bundle bundle;
                        int i3;
                        int i6;
                        int i7;
                        String str;
                        boolean z;
                        InterfaceC0323d interfaceC0323d;
                        B b6 = B.this;
                        synchronized (b6.f743b.f824a) {
                            try {
                                if (b6.f743b.f825b != 3) {
                                    int i8 = b6.f743b.f825b;
                                    if (TextUtils.isEmpty(null)) {
                                        bundle = null;
                                    } else {
                                        bundle = new Bundle();
                                        bundle.putString("accountName", null);
                                        C0054d c0054d3 = b6.f743b;
                                        AbstractC0357o0.b(bundle, c0054d3.f826c, c0054d3.f823E.longValue());
                                    }
                                    try {
                                        synchronized (b6.f743b.f824a) {
                                            interfaceC0323d = b6.f743b.f831h;
                                        }
                                    } catch (Exception e3) {
                                        boolean z5 = i8 != 1;
                                        AbstractC0357o0.h("BillingClient", "Exception while checking if billing is supported; try to reconnect", e3);
                                        if (e3 instanceof DeadObjectException) {
                                            i6 = 101;
                                        } else if (e3 instanceof RemoteException) {
                                            i6 = 100;
                                        } else if (e3 instanceof SecurityException) {
                                            i6 = 102;
                                        } else {
                                            i3 = 42;
                                            String a6 = i3 != 42 ? M.a(e3) : null;
                                            b6.f743b.t(0);
                                            i7 = 6;
                                            boolean z6 = z5;
                                            str = a6;
                                            z = z6;
                                        }
                                        i3 = i6;
                                        if (i3 != 42) {
                                        }
                                        b6.f743b.t(0);
                                        i7 = 6;
                                        boolean z62 = z5;
                                        str = a6;
                                        z = z62;
                                    }
                                    if (interfaceC0323d != null) {
                                        String packageName = b6.f743b.f829f.getPackageName();
                                        i7 = 3;
                                        int i9 = 23;
                                        while (true) {
                                            if (i9 < 3) {
                                                i9 = 0;
                                                break;
                                            }
                                            if (bundle == null) {
                                                C0317b c0317b2 = (C0317b) interfaceC0323d;
                                                Parcel c2 = c0317b2.c();
                                                c2.writeInt(i9);
                                                c2.writeString(packageName);
                                                c2.writeString("subs");
                                                Parcel d6 = c0317b2.d(c2, 1);
                                                int readInt = d6.readInt();
                                                d6.recycle();
                                                i7 = readInt;
                                            } else {
                                                i7 = ((C0317b) interfaceC0323d).g(i9, packageName, "subs", bundle);
                                            }
                                            if (i7 == 0) {
                                                AbstractC0357o0.f("BillingClient", "highestLevelSupportedForSubs: " + i9);
                                                break;
                                            }
                                            i9--;
                                        }
                                        C0054d c0054d4 = b6.f743b;
                                        c0054d4.f834k = i9 >= 5;
                                        c0054d4.f833j = i9 >= 3;
                                        if (i9 < 3) {
                                            AbstractC0357o0.f("BillingClient", "In-app billing API does not support subscription on this device.");
                                            i3 = 9;
                                        } else {
                                            i3 = 1;
                                        }
                                        int i10 = 23;
                                        while (true) {
                                            if (i10 < 3) {
                                                break;
                                            }
                                            if (bundle == null) {
                                                C0317b c0317b3 = (C0317b) interfaceC0323d;
                                                Parcel c6 = c0317b3.c();
                                                c6.writeInt(i10);
                                                c6.writeString(packageName);
                                                c6.writeString("inapp");
                                                Parcel d7 = c0317b3.d(c6, 1);
                                                i7 = d7.readInt();
                                                d7.recycle();
                                            } else {
                                                i7 = ((C0317b) interfaceC0323d).g(i10, packageName, "inapp", bundle);
                                            }
                                            if (i7 == 0) {
                                                b6.f743b.f835l = i10;
                                                AbstractC0357o0.f("BillingClient", "mHighestLevelSupportedForInApp: " + i10);
                                                break;
                                            }
                                            i10--;
                                        }
                                        C0054d c0054d5 = b6.f743b;
                                        int i11 = c0054d5.f835l;
                                        c0054d5.z = i11 >= 23;
                                        c0054d5.f848y = i11 >= 22;
                                        c0054d5.f847x = i11 >= 21;
                                        c0054d5.f846w = i11 >= 20;
                                        c0054d5.f845v = i11 >= 19;
                                        c0054d5.f844u = i11 >= 18;
                                        c0054d5.f843t = i11 >= 17;
                                        c0054d5.f842s = i11 >= 16;
                                        c0054d5.f841r = i11 >= 15;
                                        c0054d5.f840q = i11 >= 14;
                                        c0054d5.f839p = i11 >= 12;
                                        c0054d5.f838o = i11 >= 9;
                                        c0054d5.f837n = i11 >= 8;
                                        c0054d5.f836m = i11 >= 6;
                                        if (i11 < 3) {
                                            AbstractC0357o0.g("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                            i3 = 36;
                                        }
                                        if (i7 == 0) {
                                            synchronized (b6.f743b.f824a) {
                                                try {
                                                    if (b6.f743b.f825b != 3) {
                                                        z = i8 != 1;
                                                        b6.f743b.t(2);
                                                        S s2 = b6.f743b.f828e != null ? b6.f743b.f828e : null;
                                                        if (s2 != null) {
                                                            s2.a(b6.f743b.f847x);
                                                        }
                                                    }
                                                } finally {
                                                }
                                            }
                                            return null;
                                        }
                                        z = i8 != 1;
                                        b6.f743b.t(0);
                                        str = null;
                                        if (i7 == 0) {
                                            try {
                                                if (true != z) {
                                                    b6.f743b.J(6);
                                                } else {
                                                    B0.l lVar = b6.f743b.f830g;
                                                    k2 o2 = l2.o();
                                                    T1 r5 = U1.r();
                                                    r5.e(0);
                                                    o2.d();
                                                    l2.n((l2) o2.f5183b, (U1) r5.b());
                                                    lVar.m((l2) o2.b());
                                                }
                                            } catch (Throwable th) {
                                                AbstractC0357o0.h("BillingClient", "Unable to log.", th);
                                            }
                                            b6.a(O.f780j);
                                        } else {
                                            C0060j c0060j = O.f771a;
                                            try {
                                                if (true != z) {
                                                    b6.f743b.I(i3, 6, c0060j, str);
                                                } else {
                                                    T1 r6 = U1.r();
                                                    r6.e(c0060j.f862a);
                                                    String str2 = c0060j.f863b;
                                                    r6.d();
                                                    U1.o((U1) r6.f5183b, str2);
                                                    r6.f(i3);
                                                    if (str != null) {
                                                        r6.d();
                                                        U1.n((U1) r6.f5183b, str);
                                                    }
                                                    B0.l lVar2 = b6.f743b.f830g;
                                                    k2 o5 = l2.o();
                                                    U1 u12 = (U1) r6.b();
                                                    o5.d();
                                                    l2.n((l2) o5.f5183b, u12);
                                                    lVar2.m((l2) o5.b());
                                                }
                                            } catch (Throwable th2) {
                                                AbstractC0357o0.h("BillingClient", "Unable to log.", th2);
                                            }
                                            b6.a(O.f771a);
                                        }
                                        return null;
                                    }
                                    b6.f743b.t(0);
                                    C0054d c0054d6 = b6.f743b;
                                    C0060j c0060j2 = O.f781k;
                                    c0054d6.H(119, 6, c0060j2);
                                    b6.a(c0060j2);
                                }
                            } finally {
                            }
                        }
                        return null;
                    }
                }, 30000L, new B.a(1, this), c0054d2.D(), c0054d2.q()) == null) {
                    C0054d c0054d3 = this.f743b;
                    C0060j n6 = c0054d3.n();
                    c0054d3.H(25, 6, n6);
                    a(n6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        AbstractC0357o0.g("BillingClient", "Billing service disconnected.");
        try {
            C0054d c0054d = this.f743b;
            synchronized (c0054d.f824a) {
                z = true;
                if (c0054d.f825b != 1) {
                    z = false;
                }
            }
            if (z) {
                B0.l lVar = this.f743b.f830g;
                P1 r5 = Q1.r();
                r5.f(6);
                T1 r6 = U1.r();
                r6.f(121);
                r5.e(r6);
                lVar.h((Q1) r5.b());
            } else {
                this.f743b.f830g.n(m2.n());
            }
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f743b.f824a) {
            try {
                if (this.f743b.f825b == 3) {
                    return;
                }
                this.f743b.t(0);
                this.f742a.onBillingServiceDisconnected();
            } finally {
            }
        }
    }
}
