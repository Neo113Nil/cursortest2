package A0;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import i.AbstractC1233k;
import i.v;
import io.sentry.protocol.Device;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.ExecutorC1441a;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f49b;

    public /* synthetic */ g(Context context, int i7) {
        this.f48a = i7;
        this.f49b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        L.j jVar;
        Object obj;
        Context context;
        switch (this.f48a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f49b, 1));
                break;
            case 1:
                e.s(this.f49b, new ExecutorC1441a(1), e.f36a, false);
                break;
            default:
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context2 = this.f49b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (!L.b.c()) {
                            jVar = i.m.f13708c;
                            break;
                        } else {
                            Iterator it = i.m.f13712x.iterator();
                            while (true) {
                                r.h hVar = (r.h) it;
                                if (hVar.hasNext()) {
                                    i.m mVar = (i.m) ((WeakReference) hVar.next()).get();
                                    if (mVar != null && (context = ((v) mVar).f13749B) != null) {
                                        obj = context.getSystemService(Device.JsonKeys.LOCALE);
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                jVar = new L.j(new L.k(i.l.a(obj)));
                                if (jVar.f4186a.f4187a.isEmpty()) {
                                    String E7 = P6.b.E(context2);
                                    Object systemService = context2.getSystemService(Device.JsonKeys.LOCALE);
                                    if (systemService != null) {
                                        i.l.b(systemService, AbstractC1233k.a(E7));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            jVar = L.j.f4185b;
                            if (jVar.f4186a.f4187a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                i.m.f13711f = true;
                break;
        }
    }
}
