package Yx;

import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.di.TextBlockComponent$Companion$create$1$1;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterComponent$Companion$create$1$1;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35212a;

    public /* synthetic */ b(int i11) {
        this.f35212a = i11;
    }

    @Override // Pc.a
    public final Object get() {
        CatalogTabsSharedViewModel catalogTabsSharedViewModel$lambda$0;
        UgcCachedActionsSharedViewModel _get_ugcCachedActionsSharedViewModel_$lambda$0;
        switch (this.f35212a) {
            case 0:
                catalogTabsSharedViewModel$lambda$0 = TextBlockComponent$Companion$create$1$1.catalogTabsSharedViewModel$lambda$0();
                return catalogTabsSharedViewModel$lambda$0;
            default:
                _get_ugcCachedActionsSharedViewModel_$lambda$0 = ActionsFooterComponent$Companion$create$1$1._get_ugcCachedActionsSharedViewModel_$lambda$0();
                return _get_ugcCachedActionsSharedViewModel_$lambda$0;
        }
    }
}
