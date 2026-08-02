package Eq;

import GZ.g;
import Ve.C4251fo;
import Ve.C4608s6;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.emptyState.EmptyStateViewHolder;
import ru.ozon.app.android.seller.sellerTag.presentation.SellerTagVO;
import ru.ozon.app.android.seller.sellerTag.presentation.SellerTagViewHolder;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8148c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f8146a = i11;
        this.f8147b = obj;
        this.f8148c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8146a) {
            case 0:
                EmptyStateViewHolder._init_$lambda$0((g) this.f8147b, (EmptyStateViewHolder) this.f8148c, view);
                break;
            case 1:
                C4251fo this$0 = (C4251fo) this.f8147b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C4608s6 item = (C4608s6) this.f8148c;
                Intrinsics.checkNotNullParameter(item, "$item");
                this$0.f31057c.invoke(item);
                break;
            default:
                SellerTagViewHolder.bind$lambda$2$lambda$1((SellerTagViewHolder) this.f8147b, (SellerTagVO) this.f8148c, view);
                break;
        }
    }
}
