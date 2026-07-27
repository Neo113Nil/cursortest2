package A;

import R0.n;
import R0.u;
import S0.AbstractBinderC0058a;
import S0.C;
import S0.r;
import Y1.C0081e;
import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import com.google.android.gms.internal.play_billing.C0244z;
import com.google.android.gms.internal.play_billing.Q;
import com.google.android.gms.tasks.Task;
import i1.AbstractC0336f;
import i1.C0334d;
import i1.C0335e;
import i1.C0337g;
import i1.C0338h;
import i1.C0341k;
import i1.ExecutorC0340j;
import i1.InterfaceC0332b;
import i1.InterfaceC0333c;
import io.appmetrica.analytics.impl.C0644l9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Future;
import k.MenuC1069j;
import l.C1087f;
import l.C1090i;
import l.C1099s;
import l.C1100t;
import m0.C1116d;
import m0.C1120h;
import m0.C1121i;
import m0.InterfaceC1127o;
import m0.InterfaceC1128p;
import m0.InterfaceC1129q;
import m0.O;
import w2.AbstractC1242v;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f0a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2c;

    public /* synthetic */ a(Object obj, int i3, Object obj2) {
        this.f0a = i3;
        this.f1b = obj;
        this.f2c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B2.i iVar;
        S0.e eVar;
        Set set;
        S0.e eVar2 = null;
        switch (this.f0a) {
            case 0:
                C1099s c1099s = (C1099s) ((b0.j) this.f1b).f2462a;
                if (c1099s != null) {
                    c1099s.b((Typeface) this.f2c);
                    return;
                }
                return;
            case 1:
                ((g) this.f1b).accept(this.f2c);
                return;
            case 2:
                break;
            case 3:
                n nVar = (n) this.f2c;
                R0.l lVar = (R0.l) ((R0.c) nVar.f).f1200j.get((R0.a) nVar.f1224c);
                if (lVar == null) {
                    return;
                }
                P0.b bVar = (P0.b) this.f1b;
                if ((bVar.f1122b == 0 ? 1 : 0) == 0) {
                    lVar.o(bVar, null);
                    return;
                }
                nVar.f1222a = true;
                Q0.c cVar = (Q0.c) nVar.f1223b;
                if (cVar.j()) {
                    if (!nVar.f1222a || (eVar = (S0.e) nVar.f1225d) == null) {
                        return;
                    }
                    cVar.l(eVar, (Set) nVar.f1226e);
                    return;
                }
                try {
                    cVar.l(null, cVar.b());
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    cVar.c("Failed to get service from broker.");
                    lVar.o(new P0.b(10), null);
                    return;
                }
            case 4:
                h1.e eVar3 = (h1.e) this.f1b;
                P0.b bVar2 = eVar3.f4992b;
                r1 = bVar2.f1122b == 0 ? 1 : 0;
                u uVar = (u) this.f2c;
                if (r1 != 0) {
                    S0.n nVar2 = eVar3.f4993c;
                    r.c(nVar2);
                    P0.b bVar3 = nVar2.f1349c;
                    if (bVar3.f1122b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        uVar.f1248j.c(bVar3);
                        uVar.f1247i.i();
                        return;
                    }
                    n nVar3 = uVar.f1248j;
                    IBinder iBinder = nVar2.f1348b;
                    if (iBinder != null) {
                        int i3 = AbstractBinderC0058a.f1298d;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        eVar2 = queryLocalInterface instanceof S0.e ? (S0.e) queryLocalInterface : new C(iBinder);
                    }
                    nVar3.getClass();
                    if (eVar2 == null || (set = uVar.f1245g) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        nVar3.c(new P0.b(4));
                    } else {
                        nVar3.f1225d = eVar2;
                        nVar3.f1226e = set;
                        if (nVar3.f1222a) {
                            ((Q0.c) nVar3.f1223b).l(eVar2, set);
                        }
                    }
                } else {
                    uVar.f1248j.c(bVar2);
                }
                uVar.f1247i.i();
                return;
            case 5:
                a1.e eVar4 = (a1.e) this.f1b;
                Context context = (Context) eVar4.f1788b;
                String string = a1.e.G(context).getString(CommonUrlParts.APP_SET_ID, null);
                long j3 = a1.e.G((Context) eVar4.f1788b).getLong("app_set_id_last_used_time", -1L);
                long j4 = j3 != -1 ? 33696000000L + j3 : -1L;
                C0341k c0341k = ((C0335e) this.f2c).f5011a;
                if (string == null || System.currentTimeMillis() > j4) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString(CommonUrlParts.APP_SET_ID, string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new a1.d("Failed to store the app set ID.");
                        }
                        a1.e.H(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new a1.d("Failed to store the app set ID creation time.");
                        }
                    } catch (a1.d e4) {
                        c0341k.d(e4);
                        return;
                    }
                } else {
                    try {
                        a1.e.H(context);
                    } catch (a1.d e5) {
                        c0341k.d(e5);
                        return;
                    }
                }
                c0341k.e(new M0.a(string, 1));
                return;
            case 6:
                C0337g c0337g = (C0337g) this.f2c;
                try {
                    Task j5 = ((b0.i) c0337g.f5016c).j((Task) this.f1b);
                    if (j5 == null) {
                        ((C0341k) c0337g.f5017d).d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC0340j executorC0340j = AbstractC0336f.f5013b;
                    C0341k c0341k2 = (C0341k) j5;
                    C0337g c0337g2 = new C0337g(executorC0340j, c0337g);
                    V.f fVar = c0341k2.f5023b;
                    fVar.d(c0337g2);
                    c0341k2.g();
                    fVar.d(new C0338h(executorC0340j, c0337g, 1));
                    c0341k2.g();
                    fVar.d(new C0338h(executorC0340j, c0337g, 0));
                    c0341k2.g();
                    return;
                } catch (C0334d e6) {
                    if (e6.getCause() instanceof Exception) {
                        ((C0341k) c0337g.f5017d).d((Exception) e6.getCause());
                        return;
                    } else {
                        ((C0341k) c0337g.f5017d).d(e6);
                        return;
                    }
                } catch (Exception e7) {
                    ((C0341k) c0337g.f5017d).d(e7);
                    return;
                }
            case 7:
                synchronized (((C0337g) this.f2c).f5016c) {
                    ((InterfaceC0332b) ((C0337g) this.f2c).f5017d).onComplete((Task) this.f1b);
                }
                return;
            case 8:
                synchronized (((C0337g) this.f2c).f5016c) {
                    try {
                        InterfaceC0333c interfaceC0333c = (InterfaceC0333c) ((C0337g) this.f2c).f5017d;
                        if (interfaceC0333c != null) {
                            interfaceC0333c.onSuccess(((Task) this.f1b).b());
                        }
                    } finally {
                    }
                }
                return;
            case 9:
                C1090i c1090i = (C1090i) this.f2c;
                MenuC1069j menuC1069j = c1090i.f9802c;
                ActionMenuView actionMenuView = c1090i.f9805g;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C1087f c1087f = (C1087f) this.f1b;
                    if (!c1087f.b()) {
                        if (c1087f.f9631e != null) {
                            c1087f.d(0, 0, false, false);
                        }
                    }
                    c1090i.f9816r = c1087f;
                }
                c1090i.f9818t = null;
                return;
            case 10:
                C1100t c1100t = (C1100t) ((WeakReference) this.f1b).get();
                if (c1100t != null && c1100t.f9895m) {
                    TextView textView = c1100t.f9884a;
                    Typeface typeface = (Typeface) this.f2c;
                    textView.setTypeface(typeface);
                    c1100t.f9894l = typeface;
                    return;
                }
                return;
            case 11:
                C1116d c1116d = (C1116d) this.f1b;
                c1116d.getClass();
                C1120h c1120h = O.f9978l;
                c1116d.H(24, 9, c1120h);
                C0244z c0244z = com.google.android.gms.internal.play_billing.C.f2606b;
                ((InterfaceC1129q) this.f2c).onQueryPurchasesResponse(c1120h, Q.f2666e);
                return;
            case 12:
                C1116d c1116d2 = (C1116d) this.f1b;
                c1116d2.getClass();
                c1116d2.A((F1.b) this.f2c, O.f9978l, 24, null);
                return;
            case 13:
                Future future = (Future) this.f1b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                future.cancel(true);
                AbstractC0213o0.g("BillingClient", "Async task is taking too long, cancel it!");
                Runnable runnable = (Runnable) this.f2c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                C1116d c1116d3 = (C1116d) this.f1b;
                C1120h c1120h2 = O.f9978l;
                c1116d3.H(24, 4, c1120h2);
                ((C0081e) ((F1.b) this.f2c).f378b).a(F2.b.s(c1120h2));
                return;
            case 15:
                C1116d c1116d4 = (C1116d) this.f1b;
                c1116d4.getClass();
                C1120h c1120h3 = O.f9978l;
                c1116d4.H(24, 11, c1120h3);
                ((InterfaceC1128p) this.f2c).onPurchaseHistoryResponse(c1120h3, null);
                return;
            case 16:
                C1116d c1116d5 = (C1116d) this.f1b;
                c1116d5.getClass();
                C1120h c1120h4 = O.f9978l;
                c1116d5.H(24, 7, c1120h4);
                ((InterfaceC1127o) this.f2c).onProductDetailsResponse(c1120h4, new ArrayList());
                return;
            case 17:
                C1116d c1116d6 = (C1116d) this.f1b;
                C1120h c1120h5 = (C1120h) this.f2c;
                if (c1116d6.f10021e.f9996b != null) {
                    c1116d6.f10021e.f9996b.onPurchasesUpdated(c1120h5, null);
                    return;
                } else {
                    AbstractC0213o0.g("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 18:
                C1116d c1116d7 = (C1116d) this.f1b;
                c1116d7.getClass();
                c1116d7.G((F1.b) this.f2c, O.f9978l, 24, null);
                return;
            case C0644l9.f7759C /* 19 */:
                C1116d c1116d8 = (C1116d) this.f1b;
                c1116d8.getClass();
                C1120h c1120h6 = O.f9978l;
                c1116d8.H(24, 3, c1120h6);
                ((F1.b) this.f2c).c(c1120h6);
                return;
            case C0644l9.f7760D /* 20 */:
                C1116d c1116d9 = (C1116d) this.f1b;
                c1116d9.getClass();
                C1120h c1120h7 = O.f9978l;
                c1116d9.H(24, 13, c1120h7);
                ((F1.b) this.f2c).f(c1120h7);
                return;
            default:
                C1116d c1116d10 = (C1116d) this.f1b;
                c1116d10.getClass();
                c1116d10.C((F1.b) this.f2c, O.f9978l, 24, null);
                return;
        }
        do {
            try {
                ((Runnable) this.f1b).run();
            } catch (Throwable th) {
                AbstractC1242v.e(g2.i.f4981a, th);
            }
            iVar = (B2.i) this.f2c;
            Runnable e8 = iVar.e();
            if (e8 == null) {
                return;
            }
            this.f1b = e8;
            r1++;
        } while (r1 < 16);
        D2.l lVar2 = iVar.f163c;
        lVar2.getClass();
        lVar2.c(iVar, this);
    }

    public /* synthetic */ a(Object obj, Object obj2, int i3, boolean z3) {
        this.f0a = i3;
        this.f2c = obj;
        this.f1b = obj2;
    }

    public /* synthetic */ a(C1116d c1116d, F1.b bVar, C1121i c1121i) {
        this.f0a = 14;
        this.f1b = c1116d;
        this.f2c = bVar;
    }
}
