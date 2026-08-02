package IW;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.atoms.atom2.LabelsAtom;
import ru.ozon.app.android.atoms.data.deprecated.Labels;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.CategoryViewHolder;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.ProductPickerSearchAdapter;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.holders.MainDrawMajorScreenProgressHeaderHolder;
import ru.ozon.app.android.search.catalog.components.meta.MetaVO;
import ru.ozon.app.android.search.catalog.components.meta.MetaWidgetViewHolder;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonDateInputView;
import ru.ozon.app.android.travel.molecules.view.imageBanner.ImageBannerVO;
import ru.ozon.app.android.travel.molecules.view.imageBanner.ImageBannerView;
import ru.ozon.app.android.ugc.widgets.reviewstitle.ReviewsTitleViewHolder;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.EmptyView;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.id.nativeauth.main.ErrorView;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12120c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f12118a = i11;
        this.f12119b = obj;
        this.f12120c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f12118a) {
            case 0:
                ReviewsTitleViewHolder._init_$lambda$0((ComposerReferences) this.f12119b, (ReviewsTitleViewHolder) this.f12120c, view);
                break;
            case 1:
                ErrorView.d((ErrorView) this.f12119b, (String) this.f12120c);
                break;
            case 2:
                EmptyView.bind$lambda$7((SelectionsListVI.SelectionsListItemVI.EmptyItem) this.f12119b, (Function1) this.f12120c, view);
                break;
            case 3:
                LabelsAtom.Element.IconLabel.bind$lambda$2((Labels.Label) this.f12119b, (LabelsAtom.Element.IconLabel) this.f12120c, view);
                break;
            case 4:
                MetaWidgetViewHolder.bind$lambda$5$lambda$2((MetaVO) this.f12119b, (MetaWidgetViewHolder) this.f12120c, view);
                break;
            case 5:
                MainDrawMajorScreenProgressHeaderHolder.bind$lambda$5((MainDrawMajorScreenVO.ProgressBlock) this.f12119b, (Function1) this.f12120c, view);
                break;
            case 6:
                CommonDateInputView.bind$lambda$3$lambda$2((Function1) this.f12119b, (CommonInputVO.DateCommonInputVO) this.f12120c, view);
                break;
            case 7:
                ProductPickerSearchAdapter.onCreateViewHolder$lambda$1$lambda$0((ProductPickerSearchAdapter) this.f12119b, (CategoryViewHolder) this.f12120c, view);
                break;
            case 8:
                ImageBannerView.bind$lambda$1$lambda$0((Function1) this.f12119b, (ImageBannerVO) this.f12120c, view);
                break;
            default:
                ScreenStateViewWidget.showState$lambda$9((ScreenState.Custom) this.f12119b, (ScreenStateViewWidget) this.f12120c, view);
                break;
        }
    }
}
