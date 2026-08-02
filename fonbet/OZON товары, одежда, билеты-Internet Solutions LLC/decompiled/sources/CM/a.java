package CM;

import android.widget.CompoundButton;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.view.v3.AviaSearchV3BonusToggleView;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonCheckboxInputV2View;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4541c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f4539a = i11;
        this.f4540b = obj;
        this.f4541c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
        switch (this.f4539a) {
            case 0:
                AviaSearchV3BonusToggleView.bind$lambda$1((AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem) this.f4540b, (InterfaceC6511n) this.f4541c, compoundButton, z11);
                break;
            default:
                CommonCheckboxInputV2View.bind$lambda$2$lambda$1((Function2) this.f4540b, (CommonInputV2VO.CheckboxV2) this.f4541c, compoundButton, z11);
                break;
        }
    }
}
