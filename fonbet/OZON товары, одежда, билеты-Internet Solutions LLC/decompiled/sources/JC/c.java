package JC;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.InputFieldView;
import ru.ozon.app.android.pdp.utils.views.input.PdpTextInputLayout;
import ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeVI;
import ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeView;
import ru.ozon.uni.android.cell.CellView;

/* loaded from: classes13.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14266c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f14264a = i11;
        this.f14265b = obj;
        this.f14266c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14264a) {
            case 0:
                PdpTextInputLayout._init_$lambda$6((PdpTextInputLayout) this.f14265b, (Context) this.f14266c, view);
                break;
            case 1:
                InputFieldView.checkBox$lambda$11$lambda$10((InputFieldView) this.f14265b, (CellView) this.f14266c, view);
                break;
            default:
                StarsBadgeView.bindOrGone$lambda$2((StarsBadgeVI) this.f14265b, (Function1) this.f14266c, view);
                break;
        }
    }
}
