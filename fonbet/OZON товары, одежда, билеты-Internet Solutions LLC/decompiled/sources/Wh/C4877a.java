package Wh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import l10.i;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.core.EmptyStateV2ButtonsOverlayHorizontalViewMapper;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationTotalBinding;
import ru.ozon.app.android.returns.creation.widgets.total.presentation.viewMapper.ReturnCreationTotalViewMapper;

/* renamed from: Wh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C4877a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33868b;

    public /* synthetic */ C4877a(Object obj, int i11) {
        this.f33867a = i11;
        this.f33868b = obj;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$2;
        View createHolder$lambda$0;
        switch (this.f33867a) {
            case 0:
                createHolder$lambda$2 = EmptyStateV2ButtonsOverlayHorizontalViewMapper.createHolder$lambda$2((i) this.f33868b, (LinearLayout) viewGroup);
                return createHolder$lambda$2;
            default:
                createHolder$lambda$0 = ReturnCreationTotalViewMapper.createHolder$lambda$0((ReturnCreationTotalBinding) this.f33868b, (LinearLayout) viewGroup);
                return createHolder$lambda$0;
        }
    }
}
