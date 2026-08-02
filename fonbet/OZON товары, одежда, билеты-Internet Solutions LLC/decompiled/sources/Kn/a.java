package Kn;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import l10.i;
import ru.ozon.app.android.cart.emptyoverlay.presentation.EmptyOverlayViewMapper;
import ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleViewMapper;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16026b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f16025a = i11;
        this.f16026b = obj;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$1;
        View createHolder$lambda$0;
        switch (this.f16025a) {
            case 0:
                createHolder$lambda$1 = EmptyOverlayViewMapper.createHolder$lambda$1((i) this.f16026b, (LinearLayout) viewGroup);
                return createHolder$lambda$1;
            default:
                createHolder$lambda$0 = PromoStickyBubbleViewMapper.createHolder$lambda$0((PromoStickyBubbleViewMapper) this.f16026b, (LinearLayout) viewGroup);
                return createHolder$lambda$0;
        }
    }
}
