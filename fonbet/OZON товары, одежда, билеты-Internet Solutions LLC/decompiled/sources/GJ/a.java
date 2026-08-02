package GJ;

import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.SuggestionVO;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModelImpl;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements g, o, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9830b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f9829a = i11;
        this.f9830b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9829a) {
            case 0:
                this.f9830b.invoke(obj);
                break;
            case 1:
            default:
                this.f9830b.invoke(obj);
                break;
            case 2:
                this.f9830b.invoke(obj);
                break;
            case 3:
                this.f9830b.invoke(obj);
                break;
            case 4:
                this.f9830b.invoke(obj);
                break;
            case 5:
                this.f9830b.invoke(obj);
                break;
            case 6:
                this.f9830b.invoke(obj);
                break;
            case 7:
                this.f9830b.invoke(obj);
                break;
            case 8:
                this.f9830b.invoke(obj);
                break;
            case 9:
                this.f9830b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        SuggestionVO suggestClicked$lambda$6;
        suggestClicked$lambda$6 = AddressSearchViewModelImpl.suggestClicked$lambda$6(this.f9830b, obj);
        return suggestClicked$lambda$6;
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean z11;
        z11 = WidgetImagePlaceholderAdapter.setupObservers$lambda$5(this.f9830b, obj);
        return z11;
    }
}
