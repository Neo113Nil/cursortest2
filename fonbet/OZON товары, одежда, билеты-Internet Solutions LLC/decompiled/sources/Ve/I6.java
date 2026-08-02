package Ve;

import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;

/* loaded from: classes10.dex */
public final class I6 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f29216a;

    /* renamed from: b, reason: collision with root package name */
    public final CardView f29217b;

    public I6(FrameLayout frameLayout, CardView cardView) {
        this.f29216a = frameLayout;
        this.f29217b = cardView;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f29216a;
    }
}
