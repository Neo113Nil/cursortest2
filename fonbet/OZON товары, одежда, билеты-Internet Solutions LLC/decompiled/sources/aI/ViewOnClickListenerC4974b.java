package aI;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.rv.holders.CellStepItemViewHolder;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list.TravelDocumentsToEmailListVO;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list.TravelDocumentsToEmailListWidgetViewHolder;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* renamed from: aI.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class ViewOnClickListenerC4974b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36485c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36486d;

    public /* synthetic */ ViewOnClickListenerC4974b(Object obj, Object obj2, Object obj3, int i11) {
        this.f36483a = i11;
        this.f36484b = obj;
        this.f36485c = obj2;
        this.f36486d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36483a) {
            case 0:
                CellStepItemViewHolder.bind$lambda$4$lambda$3((CellAtom) this.f36484b, (Function1) this.f36485c, (CellStepItemViewHolder) this.f36486d, view);
                break;
            default:
                TravelDocumentsToEmailListWidgetViewHolder.bind$lambda$1$lambda$0((LargeButtonView) this.f36484b, (TravelDocumentsToEmailListWidgetViewHolder) this.f36485c, (TravelDocumentsToEmailListVO) this.f36486d, view);
                break;
        }
    }
}
