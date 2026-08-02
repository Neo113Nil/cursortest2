package AJ;

import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.cellstore.FilterValuesCellStore;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate.FavoriteEntityViewHolderDelegate;
import ru.ozon.fintech.wallet.manager.domain.model.WalletCard;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements g, o, OnCompleteListener, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f634b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f633a = i11;
        this.f634b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f633a) {
            case 0:
                this.f634b.invoke(obj);
                break;
            case 1:
            case 6:
            default:
                this.f634b.invoke(obj);
                break;
            case 2:
                this.f634b.invoke(obj);
                break;
            case 3:
                this.f634b.invoke(obj);
                break;
            case 4:
                this.f634b.invoke(obj);
                break;
            case 5:
                this.f634b.invoke(obj);
                break;
            case 7:
                this.f634b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        List observe$lambda$0;
        observe$lambda$0 = FilterValuesCellStore.observe$lambda$0(this.f634b, obj);
        return observe$lambda$0;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ArrayList arrayList = new ArrayList();
        if (task.isSuccessful()) {
            Object result = task.getResult();
            Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
            for (TokenInfo tokenInfo : (Iterable) result) {
                String portfolioName = tokenInfo.getPortfolioName();
                Intrinsics.checkNotNullExpressionValue(portfolioName, "getPortfolioName(...)");
                String fpanLastFour = tokenInfo.getFpanLastFour();
                Intrinsics.checkNotNullExpressionValue(fpanLastFour, "getFpanLastFour(...)");
                String dpanLastFour = tokenInfo.getDpanLastFour();
                Intrinsics.checkNotNullExpressionValue(dpanLastFour, "getDpanLastFour(...)");
                arrayList.add(new WalletCard(portfolioName, fpanLastFour, dpanLastFour, tokenInfo.getNetwork(), tokenInfo.getTokenServiceProvider(), tokenInfo.getIsDefaultToken()));
            }
        } else {
            ApiException apiException = (ApiException) task.getException();
            if (apiException != null) {
                Log.d("GooglePayWalletManagerImpl", "Google pay exception while get list of the tokens with message: " + apiException.getLocalizedMessage() + " and status code: " + apiException.getStatusCode());
            }
        }
        this.f634b.invoke(arrayList);
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean initSubscribers$lambda$4;
        initSubscribers$lambda$4 = FavoriteEntityViewHolderDelegate.initSubscribers$lambda$4(this.f634b, obj);
        return initSubscribers$lambda$4;
    }
}
