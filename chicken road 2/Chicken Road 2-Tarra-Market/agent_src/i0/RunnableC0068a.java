package i0;

import android.content.Context;
import com.yandex.varioqub.config.impl.B;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.impl.C0103b0;
import io.appmetrica.analytics.impl.C0543s1;
import io.appmetrica.analytics.impl.J0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0068a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1263c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1264d;

    public /* synthetic */ RunnableC0068a(J0 j02, PluginErrorDetails pluginErrorDetails, String str) {
        this.f1261a = 1;
        this.f1263c = j02;
        this.f1264d = pluginErrorDetails;
        this.f1262b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1261a) {
            case 0:
                B.a((B) this.f1263c, (String) this.f1262b, (String) this.f1264d);
                break;
            case 1:
                J0.a((J0) this.f1263c, (PluginErrorDetails) this.f1264d, (String) this.f1262b);
                break;
            case 2:
                C0103b0.a((C0103b0) this.f1263c, (Context) this.f1262b, (AppMetricaLibraryAdapterConfig) this.f1264d);
                break;
            default:
                ((C0543s1) this.f1263c).b((Context) this.f1262b, (AppMetricaConfig) this.f1264d);
                break;
        }
    }

    public /* synthetic */ RunnableC0068a(Object obj, Object obj2, Object obj3, int i2) {
        this.f1261a = i2;
        this.f1263c = obj;
        this.f1262b = obj2;
        this.f1264d = obj3;
    }
}
