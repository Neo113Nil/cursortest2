package A;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

/* loaded from: classes.dex */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f0a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageFilterButton f1b;

    public /* synthetic */ a(ImageFilterButton imageFilterButton, int i7) {
        this.f0a = i7;
        this.f1b = imageFilterButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f0a) {
            case 0:
                ImageFilterButton imageFilterButton = this.f1b;
                outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), (Math.min(r3, r4) * imageFilterButton.f8899f) / 2.0f);
                break;
            default:
                ImageFilterButton imageFilterButton2 = this.f1b;
                outline.setRoundRect(0, 0, imageFilterButton2.getWidth(), imageFilterButton2.getHeight(), imageFilterButton2.f8900x);
                break;
        }
    }
}
