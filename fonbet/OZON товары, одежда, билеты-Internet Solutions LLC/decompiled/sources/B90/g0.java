package B90;

import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.appsflyer.internal.AFd1hSDK;
import com.yandex.mapkit.offline_cache.internal.BackgroundDownloadInitializer;
import io.sentry.android.core.C7109j;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerViewHolder;
import ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment;
import ru.ozon.uni.android.flashbar.view.FlashbarContainerView;
import ru.ozon.uni.android.flashbar.view.FlashbarContainerView$dismissInternal$1;

/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3152b;

    public /* synthetic */ g0(Object obj, int i11) {
        this.f3151a = i11;
        this.f3152b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3151a) {
            case 0:
                v0.u0((v0) this.f3152b);
                break;
            case 1:
                FlashbarContainerView$dismissInternal$1.onStop$lambda$0((FlashbarContainerView) this.f3152b);
                break;
            case 2:
                CoroutineWorker.a((CoroutineWorker) this.f3152b);
                break;
            case 3:
                AFd1hSDK.valueOf((AFd1hSDK) this.f3152b);
                break;
            case 4:
                ((BackgroundDownloadInitializer) this.f3152b).setListener(null);
                break;
            case 5:
                d0.J.f((d0.J) this.f3152b);
                break;
            case 6:
                f50.b.v((f50.b) this.f3152b);
                break;
            case 7:
                ((C7109j) this.f3152b).l(true);
                break;
            case 8:
                io.sentry.android.core.internal.util.a.m((io.sentry.android.core.internal.util.a) this.f3152b);
                break;
            case 9:
                ConstraintTrackingWorker.a((ConstraintTrackingWorker) this.f3152b);
                break;
            case 10:
                ((Function0) this.f3152b).invoke();
                break;
            case 11:
                AdBannerViewHolder.closeBanner$lambda$5((AdBannerViewHolder) this.f3152b);
                break;
            default:
                OnboardingFragment.t((OnboardingFragment) this.f3152b);
                break;
        }
    }
}
