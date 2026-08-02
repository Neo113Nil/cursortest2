package Au;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickView;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItemViewHolder;
import ru.ozon.fintech.ui.radioV20.RadioWrapperV20View;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1278b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f1277a = i11;
        this.f1278b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean subtitleTv$lambda$5$lambda$4$lambda$3;
        boolean lambda$3$lambda$1;
        boolean _init_$lambda$2;
        switch (this.f1277a) {
            case 0:
                subtitleTv$lambda$5$lambda$4$lambda$3 = ImageSkuClickView.subtitleTv$lambda$5$lambda$4$lambda$3((ImageSkuClickView) this.f1278b, view, motionEvent);
                return subtitleTv$lambda$5$lambda$4$lambda$3;
            case 1:
                lambda$3$lambda$1 = PhotoItemViewHolder.lambda$3$lambda$1((PhotoItemViewHolder) this.f1278b, view, motionEvent);
                return lambda$3$lambda$1;
            default:
                _init_$lambda$2 = RadioWrapperV20View._init_$lambda$2((RadioWrapperV20View) this.f1278b, view, motionEvent);
                return _init_$lambda$2;
        }
    }
}
