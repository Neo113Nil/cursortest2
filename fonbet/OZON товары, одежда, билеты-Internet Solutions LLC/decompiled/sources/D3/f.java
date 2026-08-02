package D3;

import E.Q;
import E.Y;
import android.view.View;
import java.io.IOException;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailWidgetVH;
import ru.ozon.uni.android.atom.selectionControls.RadioButtonView;

/* loaded from: classes8.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5632c;

    public /* synthetic */ f(int i11, Object obj, Object obj2) {
        this.f5630a = i11;
        this.f5631b = obj;
        this.f5632c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5630a) {
            case 0:
                i.a((i) this.f5631b, (IOException) this.f5632c);
                break;
            case 1:
                ((Y) this.f5631b).f6861e.remove((Q) this.f5632c);
                break;
            case 2:
                RadioButtonView.increaseTouchArea$lambda$1$lambda$0((RadioButtonView) this.f5631b, (View) this.f5632c);
                break;
            default:
                AddressEditPickUpDetailWidgetVH.showKeyboardDelayed$lambda$36((AddressEditPickUpDetailWidgetVH) this.f5631b, (View) this.f5632c);
                break;
        }
    }
}
