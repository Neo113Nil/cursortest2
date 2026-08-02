package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes10.dex */
public final class Zd implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f30584a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f30585b;

    public Zd(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView) {
        this.f30584a = constraintLayout;
        this.f30585b = appCompatImageView;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f30584a;
    }
}
