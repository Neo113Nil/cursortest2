package CT;

import android.view.View;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3View;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f4552b;

    public /* synthetic */ a(Function0 function0, int i11) {
        this.f4551a = i11;
        this.f4552b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4551a) {
            case 0:
                this.f4552b.invoke();
                break;
            default:
                DeliveryWidgetV3View.bind$lambda$23$lambda$21(this.f4552b, view);
                break;
        }
    }
}
