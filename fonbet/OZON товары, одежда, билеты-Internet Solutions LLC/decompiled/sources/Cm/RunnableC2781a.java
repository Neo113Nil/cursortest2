package Cm;

import C.s0;
import N.l;
import Z.m;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.metrics.PlaybackMetrics;
import android.util.Log;
import android.view.View;
import androidx.concurrent.futures.b;
import androidx.lifecycle.C5425l;
import org.chromium.net.impl.a0;
import org.chromium.net.impl.g0;
import org.chromium.net.y;
import ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileView;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldVH;
import ru.ozon.app.android.commonwidgets.widgets.refresh.RefreshVO;
import ru.ozon.app.android.commonwidgets.widgets.refresh.RefreshWidgetHolder;
import ru.ozon.app.android.deeplinks.DeeplinkActivity;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselVO;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.RailwayScrollPriceCalendarVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.RailwayScrollPriceCalendarWidgetViewHolder;
import u3.N;

/* renamed from: Cm.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC2781a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5147c;

    public /* synthetic */ RunnableC2781a(int i11, Object obj, Object obj2) {
        this.f5145a = i11;
        this.f5146b = obj;
        this.f5147c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5145a) {
            case 0:
                ProductStarsTileView.updateUserStars$lambda$4$lambda$0((ProductStarsTileView) this.f5146b, (Drawable) this.f5147c);
                break;
            case 1:
                PromoCarouselViewHolder.bind$lambda$4((PromoCarouselViewHolder) this.f5146b, (PromoCarouselVO) this.f5147c);
                break;
            case 2:
                l.l((l) this.f5146b, (s0) this.f5147c);
                break;
            case 3:
                m.b((m) this.f5146b, (b.a) this.f5147c);
                break;
            case 4:
                C5425l.a((C5425l) this.f5146b, (Runnable) this.f5147c);
                break;
            case 5:
                FieldVH.showKeyboardDelayed$lambda$0((FieldVH) this.f5146b, (View) this.f5147c);
                break;
            case 6:
                RailwayScrollPriceCalendarWidgetViewHolder.bind$lambda$3$lambda$2((RailwayScrollPriceCalendarVO) this.f5146b, (RailwayScrollPriceCalendarWidgetViewHolder) this.f5147c);
                break;
            case 7:
                try {
                    ((g0) this.f5146b).b((a0) ((y) this.f5147c));
                    break;
                } catch (Exception e11) {
                    Log.e("HttpEngineWrapper", "Exception thrown from observation task", e11);
                    return;
                }
            case 8:
                ((N) this.f5146b).f99771d.reportPlaybackMetrics((PlaybackMetrics) this.f5147c);
                break;
            case 9:
                ((DeeplinkActivity) this.f5146b).navigateByExternalDeeplink((Intent) this.f5147c);
                break;
            default:
                RefreshWidgetHolder.scheduleRefresh$lambda$3((RefreshVO) this.f5146b, (RefreshWidgetHolder) this.f5147c);
                break;
        }
    }
}
