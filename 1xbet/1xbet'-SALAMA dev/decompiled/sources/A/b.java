package A;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterView;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
                int width = imageFilterView.getWidth();
                int height = imageFilterView.getHeight();
                outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterView.f8918z) / 2.0f);
                break;
            default:
                ImageFilterView imageFilterView2 = this.f3b;
                outline.setRoundRect(0, 0, imageFilterView2.getWidth(), imageFilterView2.getHeight(), imageFilterView2.f8903A);
                break;
        }
    }
}
