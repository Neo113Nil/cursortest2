package Go;

import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.GestureDetectorCompat;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitVH;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal.SecureDealDataViewHolder;

/* loaded from: classes11.dex */
public final /* synthetic */ class d implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10295b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f10294a = i11;
        this.f10295b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean lambda$4$lambda$3;
        boolean z11;
        switch (this.f10294a) {
            case 0:
                lambda$4$lambda$3 = RealFbsSplitVH.lambda$4$lambda$3((GestureDetectorCompat) this.f10295b, view, motionEvent);
                return lambda$4$lambda$3;
            default:
                z11 = SecureDealDataViewHolder.touchListener$lambda$0((SecureDealDataViewHolder) this.f10295b, view, motionEvent);
                return z11;
        }
    }
}
