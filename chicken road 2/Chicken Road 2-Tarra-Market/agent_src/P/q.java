package P;

import Q.AbstractBinderC0003a;
import Q.F;
import Q.InterfaceC0008f;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import b1.AbstractC0030s;
import com.google.android.gms.tasks.Task;
import d0.C0056e;
import e0.InterfaceC0059a;
import e0.InterfaceC0060b;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f343a;

    /* renamed from: b, reason: collision with root package name */
    public Object f344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f345c;

    public /* synthetic */ q(int i2, Object obj, Object obj2) {
        this.f343a = i2;
        this.f345c = obj;
        this.f344b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g1.i iVar;
        InterfaceC0008f interfaceC0008f;
        Set set;
        InterfaceC0008f interfaceC0008f2 = null;
        switch (this.f343a) {
            case 0:
                r rVar = (r) this.f345c;
                o oVar = (o) ((C0002c) rVar.f351f).f311j.get((C0000a) rVar.f348c);
                if (oVar == null) {
                    return;
                }
                N.b bVar = (N.b) this.f344b;
                if ((bVar.f231b == 0 ? 1 : 0) == 0) {
                    oVar.o(bVar, null);
                    return;
                }
                rVar.f346a = true;
                O.c cVar = (O.c) rVar.f347b;
                if (cVar.j()) {
                    if (!rVar.f346a || (interfaceC0008f = (InterfaceC0008f) rVar.f349d) == null) {
                        return;
                    }
                    cVar.e(interfaceC0008f, (Set) rVar.f350e);
                    return;
                }
                try {
                    cVar.e(null, cVar.g());
                    return;
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    cVar.i("Failed to get service from broker.");
                    oVar.o(new N.b(10), null);
                    return;
                }
            case 1:
                C0056e c0056e = (C0056e) this.f344b;
                N.b bVar2 = c0056e.f899b;
                boolean z2 = bVar2.f231b == 0;
                y yVar = (y) this.f345c;
                if (z2) {
                    Q.o oVar2 = c0056e.f900c;
                    Q.s.c(oVar2);
                    N.b bVar3 = oVar2.f459c;
                    if (bVar3.f231b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        yVar.f374h.b(bVar3);
                        yVar.f373g.h();
                        return;
                    }
                    r rVar2 = yVar.f374h;
                    IBinder iBinder = oVar2.f458b;
                    if (iBinder != null) {
                        int i2 = AbstractBinderC0003a.f399b;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        interfaceC0008f2 = queryLocalInterface instanceof InterfaceC0008f ? (InterfaceC0008f) queryLocalInterface : new F(iBinder);
                    }
                    rVar2.getClass();
                    if (interfaceC0008f2 == null || (set = yVar.f371e) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        rVar2.b(new N.b(4));
                    } else {
                        rVar2.f349d = interfaceC0008f2;
                        rVar2.f350e = set;
                        if (rVar2.f346a) {
                            ((O.c) rVar2.f347b).e(interfaceC0008f2, set);
                        }
                    }
                } else {
                    yVar.f374h.b(bVar2);
                }
                yVar.f373g.h();
                return;
            case 2:
                Y.e eVar = (Y.e) this.f344b;
                Context context = (Context) eVar.f523b;
                String string = Y.e.r(context).getString(CommonUrlParts.APP_SET_ID, null);
                long j2 = Y.e.r((Context) eVar.f523b).getLong("app_set_id_last_used_time", -1L);
                long j3 = j2 != -1 ? 33696000000L + j2 : -1L;
                e0.k kVar = ((e0.d) this.f345c).f954a;
                if (string == null || System.currentTimeMillis() > j3) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString(CommonUrlParts.APP_SET_ID, string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new Y.d("Failed to store the app set ID.");
                        }
                        Y.e.s(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new Y.d("Failed to store the app set ID creation time.");
                        }
                    } catch (Y.d e3) {
                        kVar.e(e3);
                        return;
                    }
                } else {
                    try {
                        Y.e.s(context);
                    } catch (Y.d e4) {
                        kVar.e(e4);
                        return;
                    }
                }
                kVar.f(new K.a(string, 1));
                return;
            case 3:
                e0.f fVar = (e0.f) this.f345c;
                try {
                    Task m2 = ((C0.a) fVar.f959c).m((Task) this.f344b);
                    if (m2 == null) {
                        ((e0.k) fVar.f960d).e(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    e0.j jVar = e0.e.f956b;
                    m2.a(jVar, fVar);
                    e0.k kVar2 = (e0.k) m2;
                    e0.g gVar = new e0.g(jVar, fVar, 1);
                    e0.i iVar2 = kVar2.f969b;
                    iVar2.c(gVar);
                    kVar2.h();
                    iVar2.c(new e0.g(jVar, fVar, 0));
                    kVar2.h();
                    return;
                } catch (e0.c e5) {
                    if (e5.getCause() instanceof Exception) {
                        ((e0.k) fVar.f960d).e((Exception) e5.getCause());
                        return;
                    } else {
                        ((e0.k) fVar.f960d).e(e5);
                        return;
                    }
                } catch (Exception e6) {
                    ((e0.k) fVar.f960d).e(e6);
                    return;
                }
            case 4:
                synchronized (((e0.f) this.f345c).f959c) {
                    try {
                        InterfaceC0059a interfaceC0059a = (InterfaceC0059a) ((e0.f) this.f345c).f960d;
                        if (interfaceC0059a != null) {
                            interfaceC0059a.onComplete((Task) this.f344b);
                        }
                    } finally {
                    }
                }
                return;
            case 5:
                synchronized (((e0.f) this.f345c).f959c) {
                    try {
                        InterfaceC0060b interfaceC0060b = (InterfaceC0060b) ((e0.f) this.f345c).f960d;
                        if (interfaceC0060b != null) {
                            interfaceC0060b.onSuccess(((Task) this.f344b).c());
                        }
                    } finally {
                    }
                }
                return;
        }
        do {
            try {
                ((Runnable) this.f344b).run();
            } catch (Throwable th) {
                AbstractC0030s.c(M0.j.f226a, th);
            }
            iVar = (g1.i) this.f345c;
            Runnable n2 = iVar.n();
            if (n2 == null) {
                return;
            }
            this.f344b = n2;
            r2++;
        } while (r2 < 16);
        h1.l lVar = iVar.f1155c;
        lVar.getClass();
        lVar.l(iVar, this);
    }

    public /* synthetic */ q(Y.e eVar, e0.d dVar) {
        this.f343a = 2;
        this.f344b = eVar;
        this.f345c = dVar;
    }
}
