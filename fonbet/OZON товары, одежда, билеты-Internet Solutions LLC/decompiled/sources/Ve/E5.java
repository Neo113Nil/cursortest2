package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class E5 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f28905a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f28906b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayMaterialButton f28907c;

    public E5(ConstraintLayout constraintLayout, SPayTextView sPayTextView, SPayMaterialButton sPayMaterialButton) {
        this.f28905a = constraintLayout;
        this.f28906b = sPayTextView;
        this.f28907c = sPayMaterialButton;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f28905a;
    }
}
