package Ve;

import android.app.Dialog;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.buttons.a;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2BaseItemViewHolder;
import ru.ozon.app.android.partpayment.formpage.view.vh.SummaryFieldVH;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.plain.PlainQuantVO;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.plain.PlainViewV4;
import ru.ozon.id.nativeauth.data.models.EntryDTO;

/* loaded from: classes10.dex */
public final /* synthetic */ class Lq implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29441c;

    public /* synthetic */ Lq(int i11, Object obj, Object obj2) {
        this.f29439a = i11;
        this.f29440b = obj;
        this.f29441c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f29439a) {
            case 0:
                Mq this$0 = (Mq) this.f29440b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Dialog this_apply = (Dialog) this.f29441c;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this$0.getClass();
                this$0.z(new Kd(), "LoggerFragment");
                this_apply.dismiss();
                break;
            case 1:
                SummaryFieldVH.ActionAdapter.SummaryButtonVH._init_$lambda$1((SummaryFieldVH.ActionAdapter.SummaryButtonVH) this.f29440b, (SummaryFieldVH.ActionAdapter) this.f29441c, view);
                break;
            case 2:
                cd0.m.v((cd0.m) this.f29440b, (EntryDTO.EntryButtonDTO) this.f29441c);
                break;
            case 3:
                PlainViewV4.bind$lambda$2$lambda$1((PlainQuantVO) this.f29440b, (PlainViewV4) this.f29441c, view);
                break;
            case 4:
                ru.ozon.android.messenger.blocks.buttons.presentation.flex.a.f((ru.ozon.android.messenger.blocks.buttons.presentation.flex.a) this.f29440b, (a.b) this.f29441c);
                break;
            default:
                NotificationCarouselV2BaseItemViewHolder.bind$lambda$1((NotificationCarouselV2BaseItemViewHolder) this.f29440b, (NotificationCarouselV2VO.NotificationCarouselItemVO) this.f29441c, view);
                break;
        }
    }
}
