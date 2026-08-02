package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Hf implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29156a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f29157b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f29158c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayTextView f29159d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f29160e;

    public Hf(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, SPayTextView sPayTextView, SPayTextView sPayTextView2, ConstraintLayout constraintLayout2) {
        this.f29156a = constraintLayout;
        this.f29157b = appCompatImageView;
        this.f29158c = sPayTextView;
        this.f29159d = sPayTextView2;
        this.f29160e = constraintLayout2;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f29156a;
    }
}
