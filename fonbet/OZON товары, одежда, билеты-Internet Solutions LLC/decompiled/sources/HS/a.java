package HS;

import io.sentry.C7229z1;
import io.sentry.Z;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.HotelsScrollPriceCalendarV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.view.HotelsScrollPriceCalendarV2View;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation.AdditionalReviewV2VH;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation.AdditionalReviewV2VH$1$2;
import ru.ozon.uni.atoms.af.AtomAction;
import v3.o;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10754c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f10752a = i11;
        this.f10753b = obj;
        this.f10754c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10752a) {
            case 0:
                HotelsScrollPriceCalendarV2View.bind$lambda$3((HotelsScrollPriceCalendarV2VI.State) this.f10753b, (HotelsScrollPriceCalendarV2View) this.f10754c);
                break;
            case 1:
                AdditionalReviewV2VH$1$2.invoke$lambda$2$lambda$1$lambda$0((AdditionalReviewV2VH) this.f10753b, (AtomAction) this.f10754c);
                break;
            case 2:
                C7229z1.C((C7229z1) this.f10753b, (Z) this.f10754c);
                break;
            default:
                o.a.k((o.a) this.f10753b, (Exception) this.f10754c);
                break;
        }
    }
}
