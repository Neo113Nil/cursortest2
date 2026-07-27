package D1;

import S.f;
import S.i;
import android.app.Activity;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.internal.a8;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.gh;
import com.startapp.sdk.internal.vk;
import com.startapp.sdk.internal.yk;
import com.startapp.sdk.internal.z7;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.billing.impl.j;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.idsync.impl.p;
import io.appmetrica.analytics.idsync.impl.y;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0596jd;
import io.appmetrica.analytics.impl.C0677mg;
import io.appmetrica.analytics.impl.C0703ng;
import io.appmetrica.analytics.impl.InterfaceC0962xg;
import io.appmetrica.analytics.impl.J0;
import io.appmetrica.analytics.impl.Kb;
import io.appmetrica.analytics.impl.V;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import l.C1099s;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f290c;

    public /* synthetic */ a(Object obj, int i3, Object obj2) {
        this.f288a = i3;
        this.f289b = obj;
        this.f290c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = 0;
        Object obj = this.f290c;
        Object obj2 = this.f289b;
        switch (this.f288a) {
            case 0:
                j.a((j) obj2, (ProductInfo) obj);
                break;
            case 1:
                p.a((p) obj2, (RequestConfig) obj);
                break;
            case 2:
                p.a((y) obj2, (p) obj);
                break;
            case 3:
                int i4 = JobInfoSchedulerService.f2545a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                break;
            case 4:
                ((ProfileInstallerInitializer) obj2).getClass();
                (Build.VERSION.SDK_INT >= 28 ? i.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new f((Context) obj, i3), new Random().nextInt(Math.max(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 1)) + 5000);
                break;
            case 5:
                ((StartAppAd) obj2).a((Activity) obj);
                break;
            case 6:
                com.startapp.sdk.adsbase.periodic.a.a((com.startapp.sdk.adsbase.periodic.a) obj2, (z7) obj);
                break;
            case 7:
                ((a8) obj2).b((Boolean) obj);
                break;
            case 8:
                e7.a((Context) obj2, null, "StartIoCachedAds", (Serializable) obj);
                break;
            case 9:
                gh.a((Context) obj2, (Runnable) obj);
                break;
            case 10:
                ((vk) obj2).a((String) obj);
                break;
            case 11:
                ((WebView) obj2).loadUrl((String) obj);
                break;
            case 12:
                yk.a((WebView) obj2, (yk) obj);
                break;
            case 13:
                J0.a((J0) obj2, (PluginErrorDetails) obj);
                break;
            case 14:
                Kb.a((Kb) obj2, (V) obj);
                break;
            case 15:
                C0596jd.a((C0596jd) obj2, (ArrayList) obj);
                break;
            case 16:
                C0677mg.a((C0703ng) obj2, (InterfaceC0962xg) obj);
                break;
            case 17:
                C0703ng.b((InterfaceC0962xg) obj2, (Throwable) obj);
                break;
            default:
                ((C1099s) obj2).b((Typeface) obj);
                break;
        }
    }
}
