package Lt;

import Sc.InterfaceC4003e;
import WZ.t;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item.CartTileItemView;
import ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.presentation.CartClickTileView;
import ru.ozon.uni.atoms.af.AtomAction;

/* renamed from: Lt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC3597a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17162a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f17163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17164c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4003e f17166e;

    public /* synthetic */ ViewOnClickListenerC3597a(CartTileVO.TileItem tileItem, Function1 function1, Function2 function2, CartTileVO.TileItem tileItem2) {
        this.f17164c = tileItem;
        this.f17163b = function1;
        this.f17166e = function2;
        this.f17165d = tileItem2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f17162a) {
            case 0:
                CartTileItemView.bind$lambda$38$lambda$37((CartTileVO.TileItem) this.f17164c, this.f17163b, (Function2) this.f17166e, (CartTileVO.TileItem) this.f17165d, view);
                break;
            default:
                CartClickTileView.setupCurtainClickView$lambda$18(this.f17163b, (AtomAction) this.f17164c, (t) this.f17165d, (Function1) this.f17166e, view);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC3597a(AtomAction atomAction, Function1 function1, Function1 function12, t tVar) {
        this.f17163b = function1;
        this.f17164c = atomAction;
        this.f17165d = tVar;
        this.f17166e = function12;
    }
}
