package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Lb implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29399a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f29400b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f29401c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayTextView f29402d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f29403e;

    public Lb(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, SPayTextView sPayTextView, SPayTextView sPayTextView2, ConstraintLayout constraintLayout2) {
        this.f29399a = constraintLayout;
        this.f29400b = appCompatImageView;
        this.f29401c = sPayTextView;
        this.f29402d = sPayTextView2;
        this.f29403e = constraintLayout2;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f29399a;
    }
}
