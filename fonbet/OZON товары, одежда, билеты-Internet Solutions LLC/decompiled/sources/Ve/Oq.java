package Ve;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Oq implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29647a;

    /* renamed from: b, reason: collision with root package name */
    public final CardView f29648b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f29649c;

    public Oq(ConstraintLayout constraintLayout, CardView cardView, SPayTextView sPayTextView) {
        this.f29647a = constraintLayout;
        this.f29648b = cardView;
        this.f29649c = sPayTextView;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f29647a;
    }
}
