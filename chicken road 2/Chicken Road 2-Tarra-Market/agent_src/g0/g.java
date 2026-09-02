package g0;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.impl.B;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.idsync.impl.y;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0322jd;
import io.appmetrica.analytics.impl.C0403mg;
import io.appmetrica.analytics.impl.C0429ng;
import io.appmetrica.analytics.impl.InterfaceC0688xg;
import io.appmetrica.analytics.impl.J0;
import io.appmetrica.analytics.impl.Kb;
import io.appmetrica.analytics.impl.V;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1093c;

    public /* synthetic */ g(int i2, Object obj, Object obj2) {
        this.f1091a = i2;
        this.f1092b = obj;
        this.f1093c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0.a aVar;
        switch (this.f1091a) {
            case 0:
                h hVar = (h) this.f1092b;
                hVar.getClass();
                f fVar = (f) this.f1093c;
                fVar.f1090b.run();
                hVar.f1099f = fVar;
                hVar.f1098e.run();
                return;
            case 1:
                C0.j jVar = (C0.j) this.f1093c;
                h hVar2 = (h) this.f1092b;
                synchronized (jVar) {
                    HashSet hashSet = new HashSet((HashSet) jVar.f72e);
                    ((HashSet) jVar.f73f).remove(hVar2);
                    ((HashSet) jVar.f72e).add(hVar2);
                    f fVar2 = hVar2.f1099f;
                    if (fVar2 == null || (aVar = fVar2.f1089a) == null || !((e) aVar.f51b).j()) {
                        f fVar3 = hVar2.f1099f;
                        if ((fVar3 != null ? fVar3.a() : null) != null) {
                            HashMap hashMap = (HashMap) jVar.f74g;
                            f fVar4 = hVar2.f1099f;
                            hashMap.remove(fVar4 != null ? fVar4.a() : null);
                        }
                    }
                    jVar.f(hVar2);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        jVar.f((h) it.next());
                    }
                }
                return;
            case 2:
                B.a((B) this.f1092b, (OnFetchCompleteListener) this.f1093c);
                return;
            case 3:
                J0.a((J0) this.f1092b, (PluginErrorDetails) this.f1093c);
                return;
            case 4:
                Kb.a((Kb) this.f1092b, (V) this.f1093c);
                return;
            case 5:
                C0322jd.a((C0322jd) this.f1092b, (ArrayList) this.f1093c);
                return;
            case 6:
                C0403mg.a((C0429ng) this.f1092b, (InterfaceC0688xg) this.f1093c);
                return;
            case 7:
                C0429ng.b((InterfaceC0688xg) this.f1092b, (Throwable) this.f1093c);
                return;
            case 8:
                io.appmetrica.analytics.billing.impl.j.a((io.appmetrica.analytics.billing.impl.j) this.f1092b, (ProductInfo) this.f1093c);
                return;
            case 9:
                io.appmetrica.analytics.idsync.impl.p.a((io.appmetrica.analytics.idsync.impl.p) this.f1092b, (RequestConfig) this.f1093c);
                return;
            case 10:
                io.appmetrica.analytics.idsync.impl.p.a((y) this.f1092b, (io.appmetrica.analytics.idsync.impl.p) this.f1093c);
                return;
            default:
                ((ProfileInstallerInitializer) this.f1092b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? r.i.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new r.f((Context) this.f1093c, 0), new Random().nextInt(Math.max(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 1)) + 5000);
                return;
        }
    }

    public /* synthetic */ g(C0.j jVar, h hVar) {
        this.f1091a = 1;
        this.f1093c = jVar;
        this.f1092b = hVar;
    }
}
