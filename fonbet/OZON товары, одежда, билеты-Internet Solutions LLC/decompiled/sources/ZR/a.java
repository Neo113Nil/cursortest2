package ZR;

import androidx.lifecycle.W;
import jk0.j;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignVH;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter.HotelsGalleryVideoViewHolder;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f35740b;

    public /* synthetic */ a(j jVar, int i11) {
        this.f35739a = i11;
        this.f35740b = jVar;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(Object obj) {
        switch (this.f35739a) {
            case 0:
                HotelsGalleryVideoViewHolder.swipeRefreshBusEventObserver$lambda$1((HotelsGalleryVideoViewHolder) this.f35740b, (A00.a) obj);
                break;
            default:
                SmsSignVH.onAttach$lambda$3((SmsSignVH) this.f35740b, (SmsSignViewModel.Action) obj);
                break;
        }
    }
}
