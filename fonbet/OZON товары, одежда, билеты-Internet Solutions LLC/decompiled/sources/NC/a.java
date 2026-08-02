package NC;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360Activity;
import ru.ozon.app.android.pdp.widgets.brand.presentation.button.ButtonBrandBinder;
import ru.ozon.uni.android.cell.selection.toggle.ToggleTitleSubtitleCellView;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18831b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f18830a = i11;
        this.f18831b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean photo360TouchListener$lambda$0;
        boolean _init_$lambda$1;
        boolean touchEnabled$lambda$0;
        switch (this.f18830a) {
            case 0:
                photo360TouchListener$lambda$0 = Photo360Activity.photo360TouchListener$lambda$0((Photo360Activity) this.f18831b, view, motionEvent);
                return photo360TouchListener$lambda$0;
            case 1:
                _init_$lambda$1 = ButtonBrandBinder._init_$lambda$1((ButtonBrandBinder) this.f18831b, view, motionEvent);
                return _init_$lambda$1;
            default:
                touchEnabled$lambda$0 = ToggleTitleSubtitleCellView.setTouchEnabled$lambda$0((Function2) this.f18831b, view, motionEvent);
                return touchEnabled$lambda$0;
        }
    }
}
