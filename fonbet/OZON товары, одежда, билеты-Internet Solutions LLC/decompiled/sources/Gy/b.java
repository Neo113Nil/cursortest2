package Gy;

import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.favorites.accesscontrol.presentation.ChangeAccessControlDelegate;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarViewModel;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements g, q, o, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f10325b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f10324a = i11;
        this.f10325b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f10324a) {
            case 0:
                this.f10325b.invoke(obj);
                break;
            case 1:
            case 2:
            case 3:
            default:
                this.f10325b.invoke(obj);
                break;
            case 4:
                this.f10325b.invoke(obj);
                break;
            case 5:
                this.f10325b.invoke(obj);
                break;
            case 6:
                this.f10325b.invoke(obj);
                break;
            case 7:
                this.f10325b.invoke(obj);
                break;
            case 8:
                this.f10325b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        List performApiAction$lambda$0;
        performApiAction$lambda$0 = TravelScrollPriceCalendarViewModel.performApiAction$lambda$0(this.f10325b, obj);
        return performApiAction$lambda$0;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f10325b.invoke(obj);
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean _init_$lambda$0;
        _init_$lambda$0 = ChangeAccessControlDelegate._init_$lambda$0(this.f10325b, obj);
        return _init_$lambda$0;
    }
}
