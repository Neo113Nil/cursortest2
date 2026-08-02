package DJ;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.marketing.common.coupon.CouponResult;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;
import ru.ozon.app.android.network.websockets.OzonWebSocketImpl;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360ViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModelImpl;
import ru.ozon.fintech.wallet.manager.domain.model.WalletId;
import ru.ozon.fintech.wallet.manager.domain.model.WalletIdStatus;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements g, o, q, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6234b;

    public /* synthetic */ c(Function1 function1, int i11) {
        this.f6233a = i11;
        this.f6234b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f6233a) {
            case 0:
                this.f6234b.invoke(obj);
                break;
            case 1:
            case 3:
            case 6:
            case 9:
            default:
                this.f6234b.invoke(obj);
                break;
            case 2:
                this.f6234b.invoke(obj);
                break;
            case 4:
                this.f6234b.invoke(obj);
                break;
            case 5:
                this.f6234b.invoke(obj);
                break;
            case 7:
                this.f6234b.invoke(obj);
                break;
            case 8:
                ReviewGalleryV2MainViewModelImpl._init_$lambda$1(this.f6234b, obj);
                break;
            case 10:
                this.f6234b.invoke(obj);
                break;
            case 11:
                this.f6234b.invoke(obj);
                break;
            case 12:
                this.f6234b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Float startAutoplay$lambda$1;
        CouponResult activate$lambda$6;
        switch (this.f6233a) {
            case 1:
                startAutoplay$lambda$1 = Photo360ViewModel.startAutoplay$lambda$1(this.f6234b, obj);
                return startAutoplay$lambda$1;
            default:
                activate$lambda$6 = CouponViewModelImpl.activate$lambda$6(this.f6234b, obj);
                return activate$lambda$6;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        WalletId walletId = new WalletId(WalletIdStatus.INTERNAL_ERROR, null, 2, null);
        if (task.isSuccessful()) {
            walletId = walletId.copy(WalletIdStatus.AVAILABLE_WALLET_ID, (String) task.getResult());
        } else {
            ApiException apiException = (ApiException) task.getException();
            if (apiException != null && apiException.getStatusCode() == 15002) {
                walletId = WalletId.copy$default(walletId, WalletIdStatus.NO_ACTIVE_WALLET, null, 2, null);
            }
        }
        this.f6234b.invoke(walletId);
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean socketFlowable$lambda$4;
        socketFlowable$lambda$4 = OzonWebSocketImpl.getSocketFlowable$lambda$4(this.f6234b, obj);
        return socketFlowable$lambda$4;
    }
}
