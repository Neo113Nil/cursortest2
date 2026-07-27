package F0;

import A0.i;
import A0.k;
import A0.r;
import B0.h;
import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.j1;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.zc;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.impl.C0377b0;
import io.appmetrica.analytics.impl.C0817s1;
import io.appmetrica.analytics.impl.J0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f365d;

    public /* synthetic */ a(c cVar, k kVar, r rVar, i iVar) {
        this.f362a = 0;
        this.f363b = cVar;
        this.f364c = kVar;
        this.f365d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f362a) {
            case 0:
                k kVar = (k) this.f364c;
                String str = kVar.f69a;
                i iVar = (i) this.f365d;
                c cVar = (c) this.f363b;
                cVar.getClass();
                Logger logger = c.f;
                try {
                    h a3 = cVar.f372c.a(str);
                    if (a3 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((H0.i) cVar.f374e).f(new b(cVar, kVar, ((y0.c) a3).a(iVar), 0));
                    }
                    break;
                } catch (Exception e3) {
                    logger.warning("Error scheduling event " + e3.getMessage());
                    return;
                }
            case 1:
                a0.a((Context) this.f363b, (AdEventListener) this.f364c, (Ad) this.f365d);
                break;
            case 2:
                e7.c((Context) this.f363b, (String) this.f364c, (Serializable) this.f365d);
                break;
            case 3:
                j1.a((Context) this.f363b, (BannerListener) this.f364c, (View) this.f365d);
                break;
            case 4:
                y6.b((y6) this.f363b, (List) this.f364c, (Map) this.f365d);
                break;
            case 5:
                ((zc) this.f363b).a((String) this.f364c, (String) this.f365d, null);
                break;
            case 6:
                J0.a((J0) this.f363b, (PluginErrorDetails) this.f364c, (String) this.f365d);
                break;
            case 7:
                C0377b0.a((C0377b0) this.f363b, (Context) this.f364c, (AppMetricaLibraryAdapterConfig) this.f365d);
                break;
            default:
                ((C0817s1) this.f363b).b((Context) this.f364c, (AppMetricaConfig) this.f365d);
                break;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i3) {
        this.f362a = i3;
        this.f363b = obj;
        this.f364c = obj2;
        this.f365d = obj3;
    }
}
