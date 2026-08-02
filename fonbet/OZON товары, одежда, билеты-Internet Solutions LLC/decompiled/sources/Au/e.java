package Au;

import Hi.j;
import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.cabinet.databinding.ChooseBirthdayDialogFragmentBinding;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui.ProfileBirthdayChooseDialog;
import ru.ozon.app.android.geo.addresseditcarousel.presentation.AddressEditCarouselVO;
import ru.ozon.app.android.geo.addresseditcarousel.presentation.options.CellWithBadgeView;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.view.DialogSearchBarView;
import ru.ozon.app.android.videomolecule.presentation.rv.viewholders.VideoMoleculeTitleViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import wi.C10563a;

/* loaded from: classes12.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1286c;

    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        this.f1284a = i11;
        this.f1285b = obj;
        this.f1286c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1284a) {
            case 0:
                ((Function1) this.f1285b).invoke((AtomAction) this.f1286c);
                break;
            case 1:
                VideoMoleculeTitleViewHolder._init_$lambda$1((VideoMoleculeTitleViewHolder) this.f1286c, (Function1) this.f1285b, view);
                break;
            case 2:
                ProfileBirthdayChooseDialog.initClicks$lambda$7$lambda$5((ProfileBirthdayChooseDialog) this.f1285b, (ChooseBirthdayDialogFragmentBinding) this.f1286c, view);
                break;
            case 3:
                DialogSearchBarView.bindRightButton$lambda$32((IconButtonV3DTO) this.f1286c, (Function1) this.f1285b, view);
                break;
            case 4:
                CellWithBadgeView.bind$lambda$8$lambda$2((AddressEditCarouselVO.CellVO) this.f1286c, (Function1) this.f1285b, view);
                break;
            default:
                C10563a.e((C10563a) this.f1285b, (j) this.f1286c);
                break;
        }
    }

    public /* synthetic */ e(int i11, Function1 function1, Object obj) {
        this.f1284a = i11;
        this.f1286c = obj;
        this.f1285b = function1;
    }
}
