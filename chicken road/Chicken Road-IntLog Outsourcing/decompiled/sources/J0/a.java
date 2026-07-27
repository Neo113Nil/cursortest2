package J0;

import B0.e;
import G2.i;
import I1.h;
import J3.c;
import P3.b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.chickyneer.roadway.MainActivity;
import com.onesignal.core.internal.application.impl.ApplicationService;
import com.yandex.varioqub.config.impl.B;
import f2.AbstractServiceC0423g;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.impl.C0526b0;
import io.appmetrica.analytics.impl.C0966s1;
import io.appmetrica.analytics.impl.J0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import o.C1351f;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1349c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1350d;

    public /* synthetic */ a(J0 j02, PluginErrorDetails pluginErrorDetails, String str) {
        this.f1347a = 5;
        this.f1348b = j02;
        this.f1350d = pluginErrorDetails;
        this.f1349c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1347a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f1348b;
                String str = (String) this.f1349c;
                i iVar = (i) this.f1350d;
                int i2 = MainActivity.f4947f;
                try {
                    mainActivity.getClass();
                    Uri parse = Uri.parse(str);
                    try {
                        C1351f c1351f = new C1351f();
                        c1351f.f11476a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                        e a6 = c1351f.a();
                        Intent intent = (Intent) a6.f146b;
                        intent.setData(parse);
                        mainActivity.startActivity(intent, (Bundle) a6.f147c);
                    } catch (Exception unused) {
                        Intent intent2 = new Intent("android.intent.action.VIEW", parse);
                        intent2.addCategory("android.intent.category.BROWSABLE");
                        intent2.addFlags(268435456);
                        mainActivity.startActivity(intent2);
                    }
                    iVar.success(null);
                    return;
                } catch (Exception e3) {
                    iVar.b("open_failed", e3.getMessage(), null);
                    return;
                }
            case 1:
                b bVar = (b) this.f1348b;
                c cVar = (c) this.f1349c;
                c cVar2 = (c) this.f1350d;
                bVar.f2304m = false;
                c shutdown = bVar.f2295d.shutdown();
                shutdown.f(new a(cVar, shutdown, cVar2, 2));
                return;
            case 2:
                boolean b6 = ((c) this.f1348b).b();
                c cVar3 = (c) this.f1350d;
                if (b6 && ((c) this.f1349c).b()) {
                    cVar3.e();
                    return;
                } else {
                    cVar3.a(null);
                    return;
                }
            case 3:
                ApplicationService.decorViewReady$lambda$1((ApplicationService) this.f1348b, (Runnable) this.f1349c, (ApplicationService) this.f1350d);
                return;
            case 4:
                Intent intent3 = (Intent) this.f1349c;
                h hVar = (h) this.f1350d;
                AbstractServiceC0423g abstractServiceC0423g = (AbstractServiceC0423g) this.f1348b;
                abstractServiceC0423g.getClass();
                try {
                    abstractServiceC0423g.b(intent3);
                    return;
                } finally {
                    hVar.b(null);
                }
            case 5:
                J0.a((J0) this.f1348b, (PluginErrorDetails) this.f1350d, (String) this.f1349c);
                return;
            case 6:
                C0526b0.a((C0526b0) this.f1348b, (Context) this.f1349c, (AppMetricaLibraryAdapterConfig) this.f1350d);
                return;
            case 7:
                ((C0966s1) this.f1348b).b((Context) this.f1349c, (AppMetricaConfig) this.f1350d);
                return;
            default:
                B.a((B) this.f1348b, (String) this.f1349c, (String) this.f1350d);
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i2) {
        this.f1347a = i2;
        this.f1348b = obj;
        this.f1349c = obj2;
        this.f1350d = obj3;
    }
}
