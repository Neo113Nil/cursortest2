package HX;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewModelImpl;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonState;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f10760b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f10759a = i11;
        this.f10760b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f10759a) {
            case 0:
                this.f10760b.invoke(obj);
                break;
            case 1:
                this.f10760b.invoke(obj);
                break;
            case 2:
                this.f10760b.invoke(obj);
                break;
            case 3:
            case 6:
            default:
                this.f10760b.invoke(obj);
                break;
            case 4:
                this.f10760b.invoke(obj);
                break;
            case 5:
                this.f10760b.invoke(obj);
                break;
            case 7:
                this.f10760b.invoke(obj);
                break;
            case 8:
                this.f10760b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Pair pageSource$lambda$0;
        SwitchingButtonState observeState$lambda$1;
        switch (this.f10759a) {
            case 3:
                pageSource$lambda$0 = FormPageViewModelImpl.pageSource$lambda$0(this.f10760b, obj);
                return pageSource$lambda$0;
            default:
                observeState$lambda$1 = SwitchingButtonStateStorage.observeState$lambda$1(this.f10760b, obj);
                return observeState$lambda$1;
        }
    }
}
