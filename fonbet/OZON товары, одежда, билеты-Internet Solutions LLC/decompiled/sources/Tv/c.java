package Tv;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.view.TileView;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookAddressDetailVH;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookVO;

/* loaded from: classes12.dex */
public final /* synthetic */ class c implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27222c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f27220a = i11;
        this.f27221b = obj;
        this.f27222c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean bind$lambda$8$lambda$4;
        switch (this.f27220a) {
            case 0:
                z11 = TileView.touchListener$lambda$6((TileView) this.f27221b, (Context) this.f27222c, view, motionEvent);
                return z11;
            default:
                bind$lambda$8$lambda$4 = AddressBookAddressDetailVH.bind$lambda$8$lambda$4((AddressBookVO.Address) this.f27221b, (AddressBookAddressDetailVH) this.f27222c, view, motionEvent);
                return bind$lambda$8$lambda$4;
        }
    }
}
