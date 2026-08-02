package A;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterView;

/* loaded from: classes.dex */
public final class b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageFilterView f3b;

    public /* synthetic */ b(ImageFilterView imageFilterView, int i7) {
        this.f2a = i7;
        this.f3b = imageFilterView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f2a) {
            case 0:
                ImageFilterView imageFilterView = this.f3b;
                outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), (Math.min(r3, r4) * imageFilterView.f8918z) / 2.0f);
                break;
            default:
                ImageFilterView imageFilterView2 = this.f3b;
                outline.setRoundRect(0, 0, imageFilterView2.getWidth(), imageFilterView2.getHeight(), imageFilterView2.f8903A);
                break;
        }
    }
}
