package Dv;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import l10.i;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.presentation.GeotrackingBottomButtonOverlapMapper;
import ru.ozon.app.android.messenger.widgets.chatListHeader.core.ChatListHeaderViewMapper;
import ru.ozon.app.android.messenger.widgets.chatListHeader.presentation.ChatListHeaderView;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButton;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.button.EmptyScreenButtonViewMapper;

/* renamed from: Dv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C2882a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6781b;

    public /* synthetic */ C2882a(Object obj, int i11) {
        this.f6780a = i11;
        this.f6781b = obj;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$3;
        View createHolder$lambda$2;
        View createHolder$lambda$0;
        switch (this.f6780a) {
            case 0:
                createHolder$lambda$3 = GeotrackingBottomButtonOverlapMapper.createHolder$lambda$3((i) this.f6781b, (LinearLayout) viewGroup);
                return createHolder$lambda$3;
            case 1:
                createHolder$lambda$2 = EmptyScreenButtonViewMapper.createHolder$lambda$2((MorkovskShadowButton) this.f6781b, (LinearLayout) viewGroup);
                return createHolder$lambda$2;
            default:
                createHolder$lambda$0 = ChatListHeaderViewMapper.createHolder$lambda$0((ChatListHeaderView) this.f6781b, (LinearLayout) viewGroup);
                return createHolder$lambda$0;
        }
    }
}
