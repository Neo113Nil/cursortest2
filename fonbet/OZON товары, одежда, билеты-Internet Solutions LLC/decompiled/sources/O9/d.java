package O9;

import android.app.Activity;
import android.content.Context;
import com.vk.id.captcha.sensors.SensorsDataRepositoryImpl;
import io.sentry.android.core.C7102c;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.NavLikezoneCaruselBannerMulti;

/* loaded from: classes9.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20075c;

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f20073a = i11;
        this.f20074b = obj;
        this.f20075c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20073a) {
            case 0:
                ((e) this.f20074b).f20079c.h((n) this.f20075c);
                break;
            case 1:
                SensorsDataRepositoryImpl.a((Function1) this.f20074b, (ArrayList) this.f20075c);
                break;
            case 2:
                NavLikezoneCaruselBannerMulti.View.scrollToNextBannerRunnable$lambda$1((NavLikezoneCaruselBannerMulti.View) this.f20074b, (Context) this.f20075c);
                break;
            default:
                ((C7102c) this.f20074b).f67068a.a().c((Activity) this.f20075c);
                break;
        }
    }
}
