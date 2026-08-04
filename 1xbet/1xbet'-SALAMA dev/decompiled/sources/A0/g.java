package A0;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import io.sentry.protocol.Device;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p058i.v;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f49b;

    public /* synthetic */ g(Context context, int i7) {
        this.f48a = i7;
        this.f49b = context;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    @Override // java.lang.Runnable
    public final void run() {
        L.j jVar;
        Object systemService;
        Context context;
        switch (this.f48a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f49b, 1));
                break;
            case 1:
                e.s(this.f49b, new p094n.a(1), e.f36a, false);
                break;
            default:
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context2 = this.f49b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (L.b.c()) {
                            Iterator it = p058i.m.f13718x.iterator();
                            while (true) {
                                p122r.h hVar = (p122r.h) it;
                                if (hVar.hasNext()) {
                                    p058i.m mVar = (p058i.m) ((WeakReference) hVar.next()).get();
                                    if (mVar != null && (context = ((v) mVar).f13755B) != null) {
                                        systemService = context.getSystemService(Device.JsonKeys.LOCALE);
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                jVar = new L.j(new L.k(p058i.l.a(systemService)));
                            } else {
                                jVar = L.j.f4185b;
                            }
                        } else {
                            jVar = p058i.m.f13714c;
                            if (jVar == null) {
                                jVar = L.j.f4185b;
                            }
                        }
                        if (jVar.f4186a.f4187a.isEmpty()) {
                            String strE = P6.b.E(context2);
                            Object systemService2 = context2.getSystemService(Device.JsonKeys.LOCALE);
                            if (systemService2 != null) {
                                p058i.l.b(systemService2, p058i.k.a(strE));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                p058i.m.f13717f = true;
                break;
        }
    }
}
