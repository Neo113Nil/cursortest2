package EI;

import android.view.View;
import kotlin.jvm.functions.Function1;
import q10.e;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.b;
import ru.ozon.android.messenger.framework.presentation.chatdetail.k;
import ru.ozon.app.android.bank.widgets.openBankAccount.presentation.OpenBankAccountWidgetVH;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchFragment;
import ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper;
import ru.ozon.app.android.partpayment.formpage.view.vh.ApproveButtonVH;
import ru.ozon.app.android.search.widgets.modalButton.presentation.ModalButtonWidgetViewHolder;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.container.adapter.TravelTabViewHolder;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import ru.ozon.fintech.ui.actionV2.ActionTextItemV2State;
import ru.ozon.fintech.ui.actionV2.ActionTextItemV2View;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolder;
import ru.ozon.uni.atoms.v3.holders.notification.deprecated.NotificationWithIconHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7688b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f7687a = i11;
        this.f7688b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7687a) {
            case 0:
                ModalButtonWidgetViewHolder._init_$lambda$1((ModalButtonWidgetViewHolder) this.f7688b, view);
                break;
            case 1:
                ((Function1) this.f7688b).invoke(view);
                break;
            case 2:
                AddressEditMapViewWrapper._init_$lambda$8((AddressEditMapViewWrapper) this.f7688b, view);
                break;
            case 3:
                AddressSearchFragment.onViewCreated$lambda$0((AddressSearchFragment) this.f7688b, view);
                break;
            case 4:
                PageIssueStateView.b((PageIssueStateView) this.f7688b);
                break;
            case 5:
                WrappedBorderlessButtonHolder._init_$lambda$1((WrappedBorderlessButtonHolder) this.f7688b, view);
                break;
            case 6:
                ActionTextItemV2View.bindState$lambda$3((ActionTextItemV2State) this.f7688b, view);
                break;
            case 7:
                ApproveButtonVH._init_$lambda$0((ApproveButtonVH) this.f7688b, view);
                break;
            case 8:
                NotificationWithIconHolder._init_$lambda$1((NotificationWithIconHolder) this.f7688b, view);
                break;
            case 9:
                b.c((b) this.f7688b);
                break;
            case 10:
                ((e) this.f7688b).dismissNow();
                break;
            case 11:
                k.d((k) this.f7688b);
                break;
            case 12:
                TravelTabViewHolder._init_$lambda$0((TravelTabViewHolder) this.f7688b, view);
                break;
            default:
                OpenBankAccountWidgetVH.lambda$1$lambda$0((OpenBankAccountWidgetVH) this.f7688b, view);
                break;
        }
    }
}
