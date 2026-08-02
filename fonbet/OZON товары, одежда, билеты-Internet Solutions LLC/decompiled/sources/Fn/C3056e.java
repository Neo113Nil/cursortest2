package Fn;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.viewmodel.AvatarViewModel;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.domain.CartManagerImpl;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoriteComposerActionExecutor;
import ru.ozon.app.android.partpayment.formpage.data.validation.PassFormRepository;
import ru.ozon.app.android.partpayment.formpage.view.vo.PassFormVO;
import ru.ozon.app.android.partpayment.landing.limit.data.FormPageLandingLimitRepository;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewViewModelImpl;

/* renamed from: Fn.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C3056e implements o, q, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9538b;

    public /* synthetic */ C3056e(Function1 function1, int i11) {
        this.f9537a = i11;
        this.f9538b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9537a) {
            case 2:
                this.f9538b.invoke(obj);
                break;
            case 3:
                this.f9538b.invoke(obj);
                break;
            case 4:
            case 5:
            case 7:
            case 8:
            default:
                this.f9538b.invoke(obj);
                break;
            case 6:
                this.f9538b.invoke(obj);
                break;
            case 9:
                this.f9538b.invoke(obj);
                break;
            case 10:
                this.f9538b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        CartAddItemDTO addProducts$lambda$4;
        C uploadAvatar$lambda$5;
        PassFormVO passForm$lambda$0;
        PassFormVO passLimit$lambda$0;
        Long removeFromFavorites$lambda$2;
        switch (this.f9537a) {
            case 0:
                addProducts$lambda$4 = CartManagerImpl.addProducts$lambda$4(this.f9538b, obj);
                return addProducts$lambda$4;
            case 4:
                uploadAvatar$lambda$5 = AvatarViewModel.uploadAvatar$lambda$5(this.f9538b, obj);
                return uploadAvatar$lambda$5;
            case 5:
                passForm$lambda$0 = PassFormRepository.passForm$lambda$0(this.f9538b, obj);
                return passForm$lambda$0;
            case 7:
                passLimit$lambda$0 = FormPageLandingLimitRepository.passLimit$lambda$0(this.f9538b, obj);
                return passLimit$lambda$0;
            default:
                removeFromFavorites$lambda$2 = FavoriteComposerActionExecutor.removeFromFavorites$lambda$2(this.f9538b, obj);
                return removeFromFavorites$lambda$2;
        }
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean checkAuthorise$lambda$0;
        checkAuthorise$lambda$0 = SingleReviewViewModelImpl.checkAuthorise$lambda$0(this.f9538b, obj);
        return checkAuthorise$lambda$0;
    }
}
