package Hs;

import android.graphics.Bitmap;
import io.reactivex.C;
import java.util.List;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.data.SearchSheetRepository;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.AuthorizePaymentDTO;
import ru.ozon.app.android.domain.session.interactors.AuthInteractorImpl;
import ru.ozon.app.android.favorites.data.service.ChangeFavoriteAnalyticsData;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProviderImpl;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.BaseStoryV3Fragment;

/* loaded from: classes11.dex */
public final /* synthetic */ class c implements o, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f11231b;

    public /* synthetic */ c(Function1 function1, int i11) {
        this.f11230a = i11;
        this.f11231b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f11230a) {
            case 1:
                this.f11231b.invoke(obj);
                break;
            case 2:
                this.f11231b.invoke(obj);
                break;
            case 3:
                this.f11231b.invoke(obj);
                break;
            case 4:
                this.f11231b.invoke(obj);
                break;
            case 5:
            case 6:
            case 8:
            case 9:
            default:
                this.f11231b.invoke(obj);
                break;
            case 7:
                this.f11231b.invoke(obj);
                break;
            case 10:
                this.f11231b.invoke(obj);
                break;
            case 11:
                this.f11231b.invoke(obj);
                break;
            case 12:
                this.f11231b.invoke(obj);
                break;
            case 13:
                this.f11231b.invoke(obj);
                break;
            case 14:
                this.f11231b.invoke(obj);
                break;
            case 15:
                this.f11231b.invoke(obj);
                break;
            case 16:
                this.f11231b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        C callAction$lambda$0;
        ChangeFavoriteAnalyticsData addFavorite$lambda$3;
        Bitmap blurredBackground$lambda$0;
        AuthorizePaymentDTO processGooglePay$lambda$5$lambda$4;
        List suggests$lambda$0;
        switch (this.f11230a) {
            case 0:
                callAction$lambda$0 = AuthInteractorImpl.callAction$lambda$0(this.f11231b, obj);
                return callAction$lambda$0;
            case 5:
                addFavorite$lambda$3 = FavoritesServiceProviderImpl.addFavorite$lambda$3(this.f11231b, obj);
                return addFavorite$lambda$3;
            case 6:
                blurredBackground$lambda$0 = BaseStoryV3Fragment.setBlurredBackground$lambda$0(this.f11231b, obj);
                return blurredBackground$lambda$0;
            case 8:
                processGooglePay$lambda$5$lambda$4 = CreateAndPayRepository.processGooglePay$lambda$5$lambda$4(this.f11231b, obj);
                return processGooglePay$lambda$5$lambda$4;
            default:
                suggests$lambda$0 = SearchSheetRepository.getSuggests$lambda$0(this.f11231b, obj);
                return suggests$lambda$0;
        }
    }
}
