package Hm;

import C2.r;
import D2.g;
import android.text.Editable;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.m;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.cancel.DebouncedTextWatcher;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.ItemViewHolder;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.Item;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorView;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter.IndicatorAnimationController;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11213c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f11211a = i11;
        this.f11212b = obj;
        this.f11213c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11211a) {
            case 0:
                ItemViewHolder.bind$lambda$2((Item) this.f11212b, (ItemViewHolder) this.f11213c);
                return;
            case 1:
                L2.a this$0 = (L2.a) this.f11212b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                r rVar = this$0.f16205f;
                if (rVar != null) {
                    rVar.a((g) this.f11213c);
                    return;
                } else {
                    Intrinsics.n("callback");
                    throw null;
                }
            case 2:
                ConstraintTrackingWorker.b((ConstraintTrackingWorker) this.f11212b, (m) this.f11213c);
                return;
            case 3:
                DebouncedTextWatcher.afterTextChanged$lambda$0((DebouncedTextWatcher) this.f11212b, (Editable) this.f11213c);
                return;
            default:
                ((IndicatorAnimationController) this.f11212b).clearShowAnimation((IndicatorView) this.f11213c);
                return;
        }
    }
}
