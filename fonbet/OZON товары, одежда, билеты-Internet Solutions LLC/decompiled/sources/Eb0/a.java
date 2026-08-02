package Eb0;

import WZ.t;
import android.view.View;
import ec0.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.atoms.v3.molecules.list.rv.GalleryRecyclerViewAdapter;
import ru.ozon.app.android.atoms.v3.molecules.list.rv.holders.GalleryImageItemViewHolder;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitVerticalViewHolder;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.BrandAspectsVO;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.rv.BrandAspectItemViewHolder;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation.InputFormView;
import ru.ozon.id.common.disclaimer.DisclaimerDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7800c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f7798a = i11;
        this.f7799b = obj;
        this.f7800c = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7798a) {
            case 0:
                ((C7735q) this.f7799b).invoke((DisclaimerDTO.DisclaimerButtonDTO) this.f7800c);
                break;
            case 1:
                BrandAspectItemViewHolder.bind$lambda$4$lambda$3$lambda$2((BrandAspectsVO.AspectBrand) this.f7799b, (BrandAspectItemViewHolder) this.f7800c, view);
                break;
            case 2:
                SplitVerticalViewHolder.bindImage$lambda$4$lambda$3((t) this.f7799b, (SplitVerticalViewHolder) this.f7800c, view);
                break;
            case 3:
                h.t((h) this.f7799b, (EntryDTO.SubmitButtonDTO) this.f7800c);
                break;
            case 4:
                GalleryRecyclerViewAdapter.onCreateViewHolder$lambda$2$lambda$1((GalleryImageItemViewHolder) this.f7799b, (GalleryRecyclerViewAdapter) this.f7800c, view);
                break;
            default:
                InputFormView.bind$lambda$6((Function1) this.f7799b, (InputFormView) this.f7800c, view);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(Function1 function1, DisclaimerDTO.DisclaimerButtonDTO disclaimerButtonDTO) {
        this.f7798a = 0;
        this.f7799b = (C7735q) function1;
        this.f7800c = disclaimerButtonDTO;
    }
}
