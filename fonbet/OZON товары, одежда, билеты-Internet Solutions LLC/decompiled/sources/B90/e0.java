package B90;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersOverlayWidgetViewHolder;
import ru.ozon.app.android.ugc.widgets.profileInputs.presentation.ProfileInputsViewHolder;
import ru.ozon.fintech.features.tabber.presentation.preferences.FintechPreferencesActivity;
import ru.ozon.fintech.features.tabber.ui.PreferenceViewListenerQa;
import ru.ozon.uni.android.cell.text.TextFieldCellView;

/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3146b;

    public /* synthetic */ e0(Object obj, int i11) {
        this.f3145a = i11;
        this.f3146b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f3146b;
        switch (this.f3145a) {
            case 0:
                v0.y0((v0) obj);
                break;
            case 1:
                HotelsGalleryFiltersOverlayWidgetViewHolder.addView$lambda$2((HotelsGalleryFiltersOverlayWidgetViewHolder) obj);
                break;
            case 2:
                ProfileInputsViewHolder.hideBottomLabel$lambda$4((TextFieldCellView) obj);
                break;
            case 3:
                ((Function0) obj).invoke();
                break;
            case 4:
                int i11 = PreferenceViewListenerQa.f96345d;
                PreferenceViewListenerQa preferenceViewListenerQa = (PreferenceViewListenerQa) obj;
                Context context = preferenceViewListenerQa.getContext();
                int i12 = FintechPreferencesActivity.f96339j;
                Context context2 = preferenceViewListenerQa.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                context.startActivity(FintechPreferencesActivity.a.a(context2, preferenceViewListenerQa.getF81740c()));
                break;
            default:
                ((ru.ozon.android.messenger.blocks.chat.common.j) obj).start();
                break;
        }
    }
}
