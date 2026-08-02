package EJ;

import V10.c;
import android.view.View;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.b;
import ru.ozon.app.android.bank.widgets.openBankAccount.presentation.OpenBankAccountWidgetVH;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist.CheckBoxViewHolder;
import ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.ModalPickerView;
import ru.ozon.app.android.partpayment.formpage.view.vh.ApproveButtonVH;
import ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewHolder;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonWithIconHolder;
import ru.ozon.uni.atoms.v3.holders.notification.deprecated.NotificationWithoutIconHolder;
import ru.ozon.uni.atoms.v3.holders.tags.TagHolder;
import z00.f;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7690b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f7689a = i11;
        this.f7690b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f7690b;
        switch (this.f7689a) {
            case 0:
                UserAuthBiometryViewHolder._init_$lambda$0((UserAuthBiometryViewHolder) obj, view);
                break;
            case 1:
                CheckBoxViewHolder._init_$lambda$1((CheckBoxViewHolder) obj, view);
                break;
            case 2:
                int i11 = PageIssueStateView.f94849k;
                ((c) ((f) obj)).f().invoke();
                break;
            case 3:
                WrappedBorderlessButtonWithIconHolder._init_$lambda$0((WrappedBorderlessButtonWithIconHolder) obj, view);
                break;
            case 4:
                ModalPickerView._init_$lambda$0((ModalPickerView) obj, view);
                break;
            case 5:
                ApproveButtonVH._init_$lambda$2((ApproveButtonVH) obj, view);
                break;
            case 6:
                NotificationWithoutIconHolder._init_$lambda$1((NotificationWithoutIconHolder) obj, view);
                break;
            case 7:
                TagHolder._init_$lambda$1((TagHolder) obj, view);
                break;
            case 8:
                b.a((b) obj);
                break;
            default:
                OpenBankAccountWidgetVH._init_$lambda$2((OpenBankAccountWidgetVH) obj, view);
                break;
        }
    }
}
