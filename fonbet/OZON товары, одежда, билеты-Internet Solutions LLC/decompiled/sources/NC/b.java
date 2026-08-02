package NC;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360Activity;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.presentation.FullTextSearchHeaderV4ViewHolder;
import ru.ozon.uni.android.cell.selection.toggle.ToggleTitleSubtitleCellView;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18833b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f18832a = i11;
        this.f18833b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean zoomTouchListener$lambda$1;
        boolean lambda$2$lambda$1;
        boolean createPopUp$lambda$8$lambda$7;
        boolean touchEnabled$lambda$1;
        switch (this.f18832a) {
            case 0:
                zoomTouchListener$lambda$1 = Photo360Activity.zoomTouchListener$lambda$1((Photo360Activity) this.f18833b, view, motionEvent);
                return zoomTouchListener$lambda$1;
            case 1:
                lambda$2$lambda$1 = FullTextSearchHeaderV4ViewHolder.lambda$2$lambda$1((FullTextSearchHeaderV4ViewHolder) this.f18833b, view, motionEvent);
                return lambda$2$lambda$1;
            case 2:
                createPopUp$lambda$8$lambda$7 = AddressBookBarWidgetV2ViewHolder.createPopUp$lambda$8$lambda$7((AddressBookBarWidgetV2ViewHolder) this.f18833b, view, motionEvent);
                return createPopUp$lambda$8$lambda$7;
            default:
                touchEnabled$lambda$1 = ToggleTitleSubtitleCellView.setTouchEnabled$lambda$1((Function2) this.f18833b, view, motionEvent);
                return touchEnabled$lambda$1;
        }
    }
}
