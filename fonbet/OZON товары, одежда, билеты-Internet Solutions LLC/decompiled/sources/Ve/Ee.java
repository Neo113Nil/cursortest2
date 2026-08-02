package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Ee implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f28925a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f28926b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f28927c;

    public Ee(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, SPayTextView sPayTextView) {
        this.f28925a = constraintLayout;
        this.f28926b = appCompatImageView;
        this.f28927c = sPayTextView;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f28925a;
    }
}
