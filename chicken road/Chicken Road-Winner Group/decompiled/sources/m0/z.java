package m0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractBinderC0176c;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.C0173b;
import com.google.android.gms.internal.play_billing.InterfaceC0179d;
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
public final class z implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1117e f10094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1116d f10095b;

    public /* synthetic */ z(C1116d c1116d, InterfaceC1117e interfaceC1117e) {
        this.f10095b = c1116d;
        this.f10094a = interfaceC1117e;
    }

    public final void a(C1120h c1120h) {
        synchronized (this.f10095b.f10017a) {
            try {
                if (this.f10095b.f10018b == 3) {
                    return;
                }
                this.f10094a.onBillingSetupFinished(c1120h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z3;
        AbstractC0213o0.g("BillingClient", "Billing service died.");
        try {
            C1116d c1116d = this.f10095b;
            synchronized (c1116d.f10017a) {
                z3 = true;
                if (c1116d.f10018b != 1) {
                    z3 = false;
                }
            }
            if (z3) {
                V1.b bVar = this.f10095b.f10022g;
                P1 r3 = Q1.r();
                r3.f(6);
                T1 r4 = U1.r();
                r4.f(122);
                r3.e(r4);
                bVar.v((Q1) r3.b());
            } else {
                this.f10095b.f10022g.y(W1.n());
            }
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f10095b.f10017a) {
            if (this.f10095b.f10018b != 3 && this.f10095b.f10018b != 0) {
                this.f10095b.t(0);
                this.f10095b.u();
                this.f10094a.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0179d c0173b;
        AbstractC0213o0.f("BillingClient", "Billing service connected.");
        synchronized (this.f10095b.f10017a) {
            try {
                if (this.f10095b.f10018b == 3) {
                    return;
                }
                C1116d c1116d = this.f10095b;
                int i3 = AbstractBinderC0176c.f2726d;
                if (iBinder == null) {
                    c0173b = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    c0173b = queryLocalInterface instanceof InterfaceC0179d ? (InterfaceC0179d) queryLocalInterface : new C0173b(iBinder, "com.android.vending.billing.IInAppBillingService", 1);
                }
                c1116d.f10023h = c0173b;
                C1116d c1116d2 = this.f10095b;
                if (C1116d.m(new Callable() { // from class: m0.y
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:114:0x0278  */
                    /* JADX WARN: Removed duplicated region for block: B:127:0x0237 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:187:0x0224  */
                    /* JADX WARN: Removed duplicated region for block: B:189:0x0229  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object call() {
                        Bundle bundle;
                        String str;
                        int i4;
                        int i5;
                        String str2;
                        boolean z3;
                        int i6;
                        InterfaceC0179d interfaceC0179d;
                        z zVar = z.this;
                        synchronized (zVar.f10095b.f10017a) {
                            try {
                                if (zVar.f10095b.f10018b == 3) {
                                    return null;
                                }
                                int i7 = zVar.f10095b.f10018b;
                                if (TextUtils.isEmpty(null)) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("accountName", null);
                                    C1116d c1116d3 = zVar.f10095b;
                                    AbstractC0213o0.b(bundle, c1116d3.f10019c, c1116d3.f10016E.longValue());
                                }
                                try {
                                    synchronized (zVar.f10095b.f10017a) {
                                        try {
                                            try {
                                                interfaceC0179d = zVar.f10095b.f10023h;
                                            } catch (Throwable th) {
                                                th = th;
                                                while (true) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                }
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            boolean z4 = i7 != 1;
                                            AbstractC0213o0.h("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                            if (e instanceof DeadObjectException) {
                                                i5 = 101;
                                            } else if (e instanceof RemoteException) {
                                                i5 = 100;
                                            } else {
                                                if (!(e instanceof SecurityException)) {
                                                    i4 = 42;
                                                    String a3 = i4 != 42 ? M.a(e) : str;
                                                    zVar.f10095b.t(0);
                                                    boolean z5 = z4;
                                                    str2 = a3;
                                                    z3 = z5;
                                                    i6 = 6;
                                                    if (i6 == 0) {
                                                    }
                                                    return str;
                                                }
                                                i5 = 102;
                                            }
                                            i4 = i5;
                                            if (i4 != 42) {
                                            }
                                            zVar.f10095b.t(0);
                                            boolean z52 = z4;
                                            str2 = a3;
                                            z3 = z52;
                                            i6 = 6;
                                            if (i6 == 0) {
                                            }
                                            return str;
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    str = null;
                                }
                                if (interfaceC0179d == null) {
                                    zVar.f10095b.t(0);
                                    C1116d c1116d4 = zVar.f10095b;
                                    C1120h c1120h = O.f9977k;
                                    c1116d4.H(119, 6, c1120h);
                                    zVar.a(c1120h);
                                    return null;
                                }
                                String packageName = zVar.f10095b.f.getPackageName();
                                i6 = 3;
                                int i8 = 23;
                                while (true) {
                                    if (i8 < 3) {
                                        str = null;
                                        i8 = 0;
                                        break;
                                    }
                                    if (bundle == null) {
                                        C0173b c0173b2 = (C0173b) interfaceC0179d;
                                        Parcel a4 = c0173b2.a();
                                        a4.writeInt(i8);
                                        a4.writeString(packageName);
                                        a4.writeString("subs");
                                        Parcel b3 = c0173b2.b(a4, 1);
                                        int readInt = b3.readInt();
                                        b3.recycle();
                                        i6 = readInt;
                                    } else {
                                        i6 = ((C0173b) interfaceC0179d).d(i8, packageName, "subs", bundle);
                                    }
                                    if (i6 == 0) {
                                        StringBuilder sb = new StringBuilder();
                                        str = null;
                                        sb.append("highestLevelSupportedForSubs: ");
                                        sb.append(i8);
                                        AbstractC0213o0.f("BillingClient", sb.toString());
                                        break;
                                    }
                                    i8--;
                                }
                                C1116d c1116d5 = zVar.f10095b;
                                c1116d5.f10026k = i8 >= 5;
                                c1116d5.f10025j = i8 >= 3;
                                if (i8 < 3) {
                                    AbstractC0213o0.f("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i4 = 9;
                                } else {
                                    i4 = 1;
                                }
                                int i9 = 23;
                                while (true) {
                                    if (i9 < 3) {
                                        break;
                                    }
                                    if (bundle == null) {
                                        C0173b c0173b3 = (C0173b) interfaceC0179d;
                                        Parcel a5 = c0173b3.a();
                                        a5.writeInt(i9);
                                        a5.writeString(packageName);
                                        a5.writeString("inapp");
                                        Parcel b4 = c0173b3.b(a5, 1);
                                        i6 = b4.readInt();
                                        b4.recycle();
                                    } else {
                                        i6 = ((C0173b) interfaceC0179d).d(i9, packageName, "inapp", bundle);
                                    }
                                    if (i6 == 0) {
                                        zVar.f10095b.f10027l = i9;
                                        AbstractC0213o0.f("BillingClient", "mHighestLevelSupportedForInApp: " + i9);
                                        break;
                                    }
                                    i9--;
                                }
                                C1116d c1116d6 = zVar.f10095b;
                                int i10 = c1116d6.f10027l;
                                c1116d6.f10040z = i10 >= 23;
                                c1116d6.y = i10 >= 22;
                                c1116d6.f10039x = i10 >= 21;
                                c1116d6.f10038w = i10 >= 20;
                                c1116d6.f10037v = i10 >= 19;
                                c1116d6.f10036u = i10 >= 18;
                                c1116d6.f10035t = i10 >= 17;
                                c1116d6.f10034s = i10 >= 16;
                                c1116d6.f10033r = i10 >= 15;
                                c1116d6.f10032q = i10 >= 14;
                                c1116d6.f10031p = i10 >= 12;
                                c1116d6.f10030o = i10 >= 9;
                                c1116d6.f10029n = i10 >= 8;
                                c1116d6.f10028m = i10 >= 6;
                                if (i10 < 3) {
                                    AbstractC0213o0.g("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i4 = 36;
                                }
                                if (i6 == 0) {
                                    synchronized (zVar.f10095b.f10017a) {
                                        try {
                                            if (zVar.f10095b.f10018b == 3) {
                                                return str;
                                            }
                                            z3 = i7 != 1;
                                            zVar.f10095b.t(2);
                                            Q q3 = zVar.f10095b.f10021e != null ? zVar.f10095b.f10021e : str;
                                            if (q3 != 0) {
                                                q3.a(zVar.f10095b.f10039x);
                                            }
                                        } finally {
                                        }
                                    }
                                } else {
                                    z3 = i7 != 1;
                                    zVar.f10095b.t(0);
                                }
                                str2 = str;
                                if (i6 == 0) {
                                    try {
                                        if (true != z3) {
                                            zVar.f10095b.J(6);
                                        } else {
                                            V1.b bVar = zVar.f10095b.f10022g;
                                            k2 o3 = l2.o();
                                            T1 r3 = U1.r();
                                            r3.e(0);
                                            o3.d();
                                            l2.n((l2) o3.f2752b, (U1) r3.b());
                                            bVar.z((l2) o3.b());
                                        }
                                    } catch (Throwable th3) {
                                        AbstractC0213o0.h("BillingClient", "Unable to log.", th3);
                                    }
                                    zVar.a(O.f9976j);
                                } else {
                                    C1120h c1120h2 = O.f9968a;
                                    try {
                                        if (true != z3) {
                                            zVar.f10095b.I(i4, 6, c1120h2, str2);
                                        } else {
                                            T1 r4 = U1.r();
                                            r4.e(c1120h2.f10046a);
                                            String str3 = c1120h2.f10047b;
                                            r4.d();
                                            U1.o((U1) r4.f2752b, str3);
                                            r4.f(i4);
                                            if (str2 != null) {
                                                r4.d();
                                                U1.n((U1) r4.f2752b, str2);
                                            }
                                            V1.b bVar2 = zVar.f10095b.f10022g;
                                            k2 o4 = l2.o();
                                            U1 u1 = (U1) r4.b();
                                            o4.d();
                                            l2.n((l2) o4.f2752b, u1);
                                            bVar2.z((l2) o4.b());
                                        }
                                    } catch (Throwable th4) {
                                        AbstractC0213o0.h("BillingClient", "Unable to log.", th4);
                                    }
                                    zVar.a(O.f9968a);
                                }
                                return str;
                            } finally {
                            }
                        }
                    }
                }, 30000L, new A.b(16, this), c1116d2.D(), c1116d2.q()) == null) {
                    C1116d c1116d3 = this.f10095b;
                    C1120h n3 = c1116d3.n();
                    c1116d3.H(25, 6, n3);
                    a(n3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z3;
        AbstractC0213o0.g("BillingClient", "Billing service disconnected.");
        try {
            C1116d c1116d = this.f10095b;
            synchronized (c1116d.f10017a) {
                z3 = true;
                if (c1116d.f10018b != 1) {
                    z3 = false;
                }
            }
            if (z3) {
                V1.b bVar = this.f10095b.f10022g;
                P1 r3 = Q1.r();
                r3.f(6);
                T1 r4 = U1.r();
                r4.f(121);
                r3.e(r4);
                bVar.v((Q1) r3.b());
            } else {
                this.f10095b.f10022g.A(m2.n());
            }
        } catch (Throwable th) {
            AbstractC0213o0.h("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f10095b.f10017a) {
            try {
                if (this.f10095b.f10018b == 3) {
                    return;
                }
                this.f10095b.t(0);
                this.f10094a.onBillingServiceDisconnected();
            } finally {
            }
        }
    }
}
