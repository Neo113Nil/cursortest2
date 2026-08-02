package JE;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.orders.productsPackage.presentation.ProductsPackageAdapter;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate.RichContentBillboardBinderDelegate;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.CategoryMenuViewModel;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.item.CategoryMenuItemViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderVI;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.view.BonusExpirationRemainderView;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersLlBinder;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14274c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f14272a = i11;
        this.f14273b = obj;
        this.f14274c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14272a) {
            case 0:
                RichContentBillboardBinderDelegate.DefaultImpls.bindBillboard$lambda$2$lambda$1((Function2) this.f14273b, (RichContentVO.Item.Billboard) this.f14274c, view);
                break;
            case 1:
                CategoryMenuItemViewHolder._init_$lambda$1((CategoryMenuItemViewHolder) this.f14273b, (CategoryMenuViewModel) this.f14274c, view);
                break;
            case 2:
                UgcCountersLlBinder.bindBlocks$lambda$9$lambda$2$lambda$1((UgcCountersLlBinder) this.f14273b, (UgcCountersVO.Block.Single) this.f14274c, view);
                break;
            case 3:
                ProductsPackageAdapter.ProductItemVH._init_$lambda$1((ProductsPackageAdapter.ProductItemVH) this.f14273b, (ComposerNavigator) this.f14274c, view);
                break;
            default:
                BonusExpirationRemainderView.bind$lambda$2((BonusExpirationRemainderVI) this.f14273b, (Function1) this.f14274c, view);
                break;
        }
    }
}
