package Cw;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.account.user.NetworkUserDataStore;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.cabinet.profiledatasettings.domain.ProfileSettingsInteractorImpl;
import ru.ozon.app.android.common.SearchUrlPrefetchServiceImpl$navigateWhenRequestPrefetched$1;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantViewModel;
import ru.ozon.app.android.session.editUserFullName.data.EditUserFullNameRepository;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameResult;
import ru.ozon.app.android.storage.user.model.User;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramViewModel;
import ru.ozon.app.android.web.webview.cache.models.CacheState;
import ru.ozon.app.android.web.webview.cache.service.CacheManifestRepository;
import ru.ozon.app.android.yandexsearchsheet.DetailsSuggest;
import ru.ozon.app.android.yandexsearchsheet.data.YandexSearchSheetRepository;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes12.dex */
public final /* synthetic */ class c implements g, o, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f5176b;

    public /* synthetic */ c(Function1 function1, int i11) {
        this.f5175a = i11;
        this.f5176b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f5175a) {
            case 0:
                this.f5176b.invoke(obj);
                break;
            case 1:
            case 4:
            case 5:
            case 9:
            case 12:
            case 13:
            default:
                this.f5176b.invoke(obj);
                break;
            case 2:
                this.f5176b.invoke(obj);
                break;
            case 3:
                this.f5176b.invoke(obj);
                break;
            case 6:
                this.f5176b.invoke(obj);
                break;
            case 7:
                this.f5176b.invoke(obj);
                break;
            case 8:
                this.f5176b.invoke(obj);
                break;
            case 10:
                this.f5176b.invoke(obj);
                break;
            case 11:
                this.f5176b.invoke(obj);
                break;
            case 14:
                this.f5176b.invoke(obj);
                break;
            case 15:
                this.f5176b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        CacheState loadRemoteCacheState$lambda$0;
        C updateUserSex$lambda$1;
        DetailsSuggest details$lambda$1;
        AtomAction onFindTicketsClicked$lambda$4;
        User userInfoV2$lambda$0;
        EditUserFullNameResult editUserFullName$lambda$0;
        switch (this.f5175a) {
            case 1:
                loadRemoteCacheState$lambda$0 = CacheManifestRepository.loadRemoteCacheState$lambda$0(this.f5176b, obj);
                return loadRemoteCacheState$lambda$0;
            case 4:
                updateUserSex$lambda$1 = ProfileSettingsInteractorImpl.updateUserSex$lambda$1(this.f5176b, obj);
                return updateUserSex$lambda$1;
            case 5:
                details$lambda$1 = YandexSearchSheetRepository.getDetails$lambda$1(this.f5176b, obj);
                return details$lambda$1;
            case 9:
                onFindTicketsClicked$lambda$4 = PricesHistogramViewModel.onFindTicketsClicked$lambda$4(this.f5176b, obj);
                return onFindTicketsClicked$lambda$4;
            case 13:
                userInfoV2$lambda$0 = NetworkUserDataStore.getUserInfoV2$lambda$0(this.f5176b, obj);
                return userInfoV2$lambda$0;
            default:
                editUserFullName$lambda$0 = EditUserFullNameRepository.editUserFullName$lambda$0(this.f5176b, obj);
                return editUserFullName$lambda$0;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean _init_$lambda$0;
        boolean handle$lambda$0;
        boolean onError$lambda$0;
        switch (this.f5175a) {
            case 12:
                _init_$lambda$0 = SubscribeQuantViewModel._init_$lambda$0(this.f5176b, obj);
                return _init_$lambda$0;
            case 17:
                handle$lambda$0 = ActionSheetEventHandler.handle$lambda$0(this.f5176b, obj);
                return handle$lambda$0;
            default:
                onError$lambda$0 = SearchUrlPrefetchServiceImpl$navigateWhenRequestPrefetched$1.onError$lambda$0(this.f5176b, obj);
                return onError$lambda$0;
        }
    }
}
