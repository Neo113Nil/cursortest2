package FK;

import Jb0.i;
import android.view.View;
import java.util.Map;
import l10.InterfaceC7851b;
import ld0.x;
import ru.ozon.android.messenger.blocks.chatlistheader.e;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.app.android.debugmenu.analytics.ui.DataLayerAdapter;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.vh.CreateShoppingListSuggestItemViewHolder;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.FashionTabOnboardingDialog;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9184c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f9182a = i11;
        this.f9183b = obj;
        this.f9184c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9182a) {
            case 0:
                FashionTabOnboardingDialog.bindFakeTab$lambda$3((FashionTabOnboardingDialog) this.f9183b, (String) this.f9184c, view);
                break;
            case 1:
                CreateShoppingListSuggestItemViewHolder._init_$lambda$1((InterfaceC7851b) this.f9183b, (CreateShoppingListSuggestItemViewHolder) this.f9184c, view);
                break;
            case 2:
                x.y((x) this.f9183b, (i) this.f9184c);
                break;
            case 3:
                DataLayerAdapter.MainViewHolder._init_$lambda$0((DataLayerAdapter) this.f9183b, (DataLayerAdapter.MainViewHolder) this.f9184c, view);
                break;
            default:
                f.b bVar = (f.b) this.f9183b;
                boolean z11 = bVar instanceof f.b.C1482b;
                d dVar = (d) this.f9184c;
                if (!z11) {
                    if (bVar instanceof f.b.a) {
                        f.b.a aVar = (f.b.a) bVar;
                        ru.ozon.android.messenger.framework.navigation.action.a b11 = aVar.b();
                        if (b11 != null) {
                            dVar.c().q(b11);
                        }
                        Map<String, MessengerTrackingInfo> c11 = aVar.c();
                        if (c11 != null) {
                            dVar.c().m(c11);
                            break;
                        }
                    }
                } else {
                    e.a(dVar, ((f.b.C1482b) bVar).b());
                    break;
                }
                break;
        }
    }
}
