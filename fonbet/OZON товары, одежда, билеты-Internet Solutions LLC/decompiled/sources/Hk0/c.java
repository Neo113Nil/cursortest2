package Hk0;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.domain.ProfileTilesVO;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views.BonusesTileView;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersLlBinder;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.textArea.common.InfoIconView;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11207c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f11205a = i11;
        this.f11206b = obj;
        this.f11207c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11205a) {
            case 0:
                TextAreaView.infoIconView$lambda$11$lambda$10((InfoIconView) this.f11206b, (TextAreaView) this.f11207c, view);
                break;
            case 1:
                BonusesTileView.bind$lambda$9$lambda$8((ProfileTilesVO.Bonuses) this.f11206b, (Function1) this.f11207c, view);
                break;
            default:
                UgcCountersLlBinder.bindBlocks$lambda$9$lambda$6$lambda$5((UgcCountersLlBinder) this.f11206b, (UgcCountersVO.Block.Single) this.f11207c, view);
                break;
        }
    }
}
