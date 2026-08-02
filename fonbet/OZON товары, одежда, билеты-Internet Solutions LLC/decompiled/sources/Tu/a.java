package Tu;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.di.EdoDatePickerComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.presentation.EdoDatePickerViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.di.ReturnPolicyComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27211a;

    public /* synthetic */ a(int i11) {
        this.f27211a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        EdoDatePickerComponent widgetComponent$lambda$0;
        ReturnPolicyComponent create$lambda$0;
        switch (this.f27211a) {
            case 0:
                widgetComponent$lambda$0 = EdoDatePickerViewMapper.widgetComponent$lambda$0();
                return widgetComponent$lambda$0;
            default:
                create$lambda$0 = ReturnPolicyComponent.Companion.create$lambda$0();
                return create$lambda$0;
        }
    }
}
