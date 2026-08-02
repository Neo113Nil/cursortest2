package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class D implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f28793a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f28794b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f28795c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayMaterialButton f28796d;

    /* renamed from: e, reason: collision with root package name */
    public final SPayMaterialButton f28797e;

    public D(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, SPayTextView sPayTextView, SPayMaterialButton sPayMaterialButton, SPayMaterialButton sPayMaterialButton2) {
        this.f28793a = constraintLayout;
        this.f28794b = appCompatImageView;
        this.f28795c = sPayTextView;
        this.f28796d = sPayMaterialButton;
        this.f28797e = sPayMaterialButton2;
    }

    @Override // X4.a
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f28793a;
    }
}
