package Ww;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetBottomCartBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewHolder;
import ru.ozon.app.android.returns.creation.databinding.PhotoPickerButtonsBinding;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewMapper.ButtonsWidgetViewMapper;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X4.a f33903b;

    public /* synthetic */ a(X4.a aVar, int i11) {
        this.f33902a = i11;
        this.f33903b = aVar;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View _init_$lambda$0;
        View createHolder$lambda$1;
        switch (this.f33902a) {
            case 0:
                _init_$lambda$0 = BottomCartWidgetViewHolder._init_$lambda$0((WidgetBottomCartBinding) this.f33903b, (LinearLayout) viewGroup);
                return _init_$lambda$0;
            default:
                createHolder$lambda$1 = ButtonsWidgetViewMapper.createHolder$lambda$1((PhotoPickerButtonsBinding) this.f33903b, (LinearLayout) viewGroup);
                return createHolder$lambda$1;
        }
    }
}
