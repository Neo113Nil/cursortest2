package Yk;

import android.view.View;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.account.orders.ordergallery.presentation.PostingsAdapter;
import ru.ozon.app.android.cs_orders.databinding.WidgetOrderGalleryPostingItemBinding;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonDateInputV2View;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayoutV2;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35143c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f35144d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i11) {
        this.f35141a = i11;
        this.f35142b = obj;
        this.f35143c = obj2;
        this.f35144d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f35141a) {
            case 0:
                PostingsAdapter.PostingVH.bind$lambda$11$lambda$10$lambda$5$lambda$4((PostingsAdapter.PostingVH) this.f35142b, (WidgetOrderGalleryPostingItemBinding) this.f35143c, (List) this.f35144d, view);
                break;
            default:
                CommonDateInputV2View.bind$lambda$4$lambda$3((TravelTextInputLayoutV2) this.f35142b, (Function1) this.f35143c, (CommonInputV2VO.DateInputV2) this.f35144d, view);
                break;
        }
    }
}
