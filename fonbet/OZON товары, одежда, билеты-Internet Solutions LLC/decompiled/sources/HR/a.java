package HR;

import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapAction;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.views.SelectionTileHeaderView;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10751c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f10749a = i11;
        this.f10750b = obj;
        this.f10751c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10749a) {
            case 0:
                HotelsMapInfoV4Wrapper.toggleCard$lambda$19((MapAction.ToggleCard) this.f10750b, (HotelsMapInfoV4Wrapper) this.f10751c);
                break;
            default:
                SelectionTileHeaderView.bindSocialHeader$lambda$18((SelectionTileHeaderView) this.f10750b, (SelectionsListVI.HeaderVO.SocialHeader) this.f10751c);
                break;
        }
    }
}
