package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Gg implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29075a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f29076b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f29077c;

    public Gg(ConstraintLayout constraintLayout, SPayTextView sPayTextView, ConstraintLayout constraintLayout2) {
        this.f29075a = constraintLayout;
        this.f29076b = sPayTextView;
        this.f29077c = constraintLayout2;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f29075a;
    }
}
