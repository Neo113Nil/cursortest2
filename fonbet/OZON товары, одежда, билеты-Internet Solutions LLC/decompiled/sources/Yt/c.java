package Yt;

import WZ.l;
import android.view.View;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.productshelf.i;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.presentation.FreshCellVO;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.presentation.FreshCellView;

/* loaded from: classes12.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35209c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f35210d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i11) {
        this.f35207a = i11;
        this.f35208b = obj;
        this.f35209c = obj2;
        this.f35210d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f35207a) {
            case 0:
                FreshCellView.setupCheckbox$lambda$28((FreshCellVO.CheckboxFreshVO) this.f35208b, (l) this.f35209c, (Function1) this.f35210d, view);
                break;
            default:
                ru.ozon.android.messenger.blocks.productshelf.b.d((Map) this.f35208b, (ru.ozon.android.messenger.blocks.productshelf.b) this.f35209c, (i) this.f35210d);
                break;
        }
    }
}
