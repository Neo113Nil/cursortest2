package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.if, reason: invalid class name */
/* loaded from: classes10.dex */
public final class Cif implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31291a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f31292b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f31293c;

    public Cif(ConstraintLayout constraintLayout, SPayTextView sPayTextView, SPayTextView sPayTextView2) {
        this.f31291a = constraintLayout;
        this.f31292b = sPayTextView;
        this.f31293c = sPayTextView2;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f31291a;
    }
}
