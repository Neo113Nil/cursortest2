package CX;

import Ve.C4238fb;
import Ve.C4297hc;
import Ve.C4582r9;
import Ve.C4825zo;
import Ve.Db;
import Ve.T9;
import Ve.Za;
import android.view.View;
import androidx.lifecycle.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.ui.rightIconButtonView.RightIconButtonView;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.AvatarPickerView;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItemViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.AviaCheckTariffsShowMoreButtonView;
import ru.ozon.app.android.uikit.view.atoms.cells.regular.CellRegularPickerView;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.tile.MessengerTileDataBinder;
import ru.ozon.composer.ui.view.issue.PageIssueStateView;
import ru.ozon.fintech.features.camera.ui.ScannerErrorResultView;
import ru.ozon.uni.android.input.textinput.ui.buttons.InputActionButtonView;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedSmallButtonWithIconHolder;
import xe.C10727i;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4566b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f4565a = i11;
        this.f4566b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4565a) {
            case 0:
                MessengerTileDataBinder._init_$lambda$1((MessengerTileDataBinder) this.f4566b, view);
                break;
            case 1:
                InputActionButtonView._init_$lambda$3((InputActionButtonView) this.f4566b, view);
                break;
            case 2:
                ((Function0) this.f4566b).invoke();
                break;
            case 3:
                AvatarPickerView.lambda$3$lambda$1((AvatarPickerView) this.f4566b, view);
                break;
            case 4:
                PageIssueStateView.c((PageIssueStateView) this.f4566b);
                break;
            case 5:
                Za this$0 = (Za) this.f4566b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C4297hc c4297hc = (C4297hc) this$0.u();
                Object event = C4582r9.f31960a;
                Intrinsics.checkNotNullParameter(event, "event");
                if (!event.equals(event)) {
                    if (event.equals(T9.f30027a)) {
                        C10727i.c(x0.a(c4297hc), null, null, new Db(c4297hc, null), 3);
                        break;
                    }
                } else {
                    ((C4238fb) c4297hc.f31181d).b(C4825zo.f32678a);
                    break;
                }
                break;
            case 6:
                WrappedSmallButtonWithIconHolder._init_$lambda$1((WrappedSmallButtonWithIconHolder) this.f4566b, view);
                break;
            case 7:
                RightIconButtonView._init_$lambda$7((RightIconButtonView) this.f4566b, view);
                break;
            case 8:
                PhotoItemViewHolder.lambda$3$lambda$2((PhotoItemViewHolder) this.f4566b, view);
                break;
            case 9:
                AviaCheckTariffsShowMoreButtonView._init_$lambda$2((AviaCheckTariffsShowMoreButtonView) this.f4566b, view);
                break;
            case 10:
                ((ScannerErrorResultView) this.f4566b).close();
                break;
            case 11:
                CellRegularPickerView._init_$lambda$0((CellRegularPickerView) this.f4566b, view);
                break;
            default:
                OzonBottomSheetDialog.wrapInBottomSheet$lambda$11$lambda$10$lambda$9$lambda$7((OzonBottomSheetDialog) this.f4566b, view);
                break;
        }
    }
}
