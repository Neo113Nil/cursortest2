package EV;

import k20.C7475g;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.di.UnreadMessageIndicatorComponent;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation.UnreadMessageIndicatorViewModel;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.di.MediaCentricComponent$Companion$create$1$1;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModelImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7712b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f7711a = i11;
        this.f7712b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        MediaCentricViewModelImpl _get_mediaCentricViewModelProvider_$lambda$0;
        UnreadMessageIndicatorViewModel viewModelProvider$lambda$0;
        switch (this.f7711a) {
            case 0:
                _get_mediaCentricViewModelProvider_$lambda$0 = MediaCentricComponent$Companion$create$1$1._get_mediaCentricViewModelProvider_$lambda$0((ActionComponentApi) this.f7712b);
                return _get_mediaCentricViewModelProvider_$lambda$0;
            default:
                viewModelProvider$lambda$0 = UnreadMessageIndicatorComponent.viewModelProvider$lambda$0((C7475g) this.f7712b);
                return viewModelProvider$lambda$0;
        }
    }
}
