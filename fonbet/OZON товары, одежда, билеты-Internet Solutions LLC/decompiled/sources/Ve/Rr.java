package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayMaterialButton;

/* loaded from: classes10.dex */
public final class Rr implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29878a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayMaterialButton f29879b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayMaterialButton f29880c;

    public Rr(ConstraintLayout constraintLayout, SPayMaterialButton sPayMaterialButton, SPayMaterialButton sPayMaterialButton2) {
        this.f29878a = constraintLayout;
        this.f29879b = sPayMaterialButton;
        this.f29880c = sPayMaterialButton2;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f29878a;
    }
}
