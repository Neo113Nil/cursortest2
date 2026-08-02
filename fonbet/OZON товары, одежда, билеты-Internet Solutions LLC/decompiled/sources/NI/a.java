package NI;

import k20.C7475g;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.di.RecShelfComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewModel;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.search.widgets.searchResult.header.di.SearchResultHeaderComponent$Companion$create$1$1;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18838b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f18837a = i11;
        this.f18838b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        MinifyLinkViewModel viewModelProvider$lambda$0;
        RecShelfViewModel viewModelProvider$lambda$02;
        switch (this.f18837a) {
            case 0:
                viewModelProvider$lambda$0 = SearchResultHeaderComponent$Companion$create$1$1.viewModelProvider$lambda$0((SearchResultHeaderComponent$Companion$create$1$1) this.f18838b);
                return viewModelProvider$lambda$0;
            default:
                viewModelProvider$lambda$02 = RecShelfComponent$Companion$create$1$1.viewModelProvider$lambda$0((C7475g) this.f18838b);
                return viewModelProvider$lambda$02;
        }
    }
}
