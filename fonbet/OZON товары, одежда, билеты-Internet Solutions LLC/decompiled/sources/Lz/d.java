package Lz;

import io.reactivex.f;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractorImpl;
import ru.ozon.app.android.marketing.widgets.badgeTimer.presentation.BadgeTimerViewModelImpl;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsConfigurator;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewModel;

/* loaded from: classes12.dex */
public final /* synthetic */ class d implements o, g, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f17194b;

    public /* synthetic */ d(Function1 function1, int i11) {
        this.f17193a = i11;
        this.f17194b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f17193a) {
            case 1:
                this.f17194b.invoke(obj);
                break;
            case 2:
            case 4:
            default:
                this.f17194b.invoke(obj);
                break;
            case 3:
                this.f17194b.invoke(obj);
                break;
            case 5:
                this.f17194b.invoke(obj);
                break;
            case 6:
                this.f17194b.invoke(obj);
                break;
            case 7:
                this.f17194b.invoke(obj);
                break;
            case 8:
                this.f17194b.invoke(obj);
                break;
            case 9:
                this.f17194b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Boolean onComposerInitialized$lambda$0;
        f checkAndAddToFavorite$lambda$15;
        Long startTimer$lambda$0;
        switch (this.f17193a) {
            case 0:
                onComposerInitialized$lambda$0 = NotificationsSettingsConfigurator.onComposerInitialized$lambda$0(this.f17194b, obj);
                return onComposerInitialized$lambda$0;
            case 1:
            default:
                startTimer$lambda$0 = BadgeTimerViewModelImpl.startTimer$lambda$0(this.f17194b, obj);
                return startTimer$lambda$0;
            case 2:
                checkAndAddToFavorite$lambda$15 = FavoriteInteractorImpl.checkAndAddToFavorite$lambda$15(this.f17194b, obj);
                return checkAndAddToFavorite$lambda$15;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean authAndSubscribe$lambda$4;
        authAndSubscribe$lambda$4 = SubscribeViewModel.authAndSubscribe$lambda$4(this.f17194b, obj);
        return authAndSubscribe$lambda$4;
    }
}
