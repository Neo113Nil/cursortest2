package Ts;

import k20.C7475g;
import ru.ozon.app.android.favorites.applyWishlist.di.ApplyWishlistWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.di.CurtainGoalsV2Component$Companion$create$1$1;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation.CurtainGoalsViewModel;

/* renamed from: Ts.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C4048a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27209b;

    public /* synthetic */ C4048a(Object obj, int i11) {
        this.f27208a = i11;
        this.f27209b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        CreateShoppingListViewModel viewModelProvider$lambda$0;
        CurtainGoalsViewModel viewModelProvider$lambda$02;
        switch (this.f27208a) {
            case 0:
                viewModelProvider$lambda$0 = ApplyWishlistWidgetComponent$Companion$create$1$1.viewModelProvider$lambda$0((C7475g) this.f27209b);
                return viewModelProvider$lambda$0;
            default:
                viewModelProvider$lambda$02 = CurtainGoalsV2Component$Companion$create$1$1.viewModelProvider$lambda$0((CurtainGoalsV2Component$Companion$create$1$1) this.f27209b);
                return viewModelProvider$lambda$02;
        }
    }
}
