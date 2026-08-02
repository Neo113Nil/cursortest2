package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: Ve.ae, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4097ae implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f30664a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f30665b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f30666c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f30667d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f30668e;

    public C4097ae(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout2) {
        this.f30664a = constraintLayout;
        this.f30665b = appCompatImageView;
        this.f30666c = appCompatTextView;
        this.f30667d = appCompatTextView2;
        this.f30668e = constraintLayout2;
    }

    @Override // X4.a
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f30664a;
    }
}
