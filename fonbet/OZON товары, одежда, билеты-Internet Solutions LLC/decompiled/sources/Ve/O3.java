package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayMaterialButton;

/* loaded from: classes10.dex */
public final class O3 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29581a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayMaterialButton f29582b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayMaterialButton f29583c;

    public O3(ConstraintLayout constraintLayout, SPayMaterialButton sPayMaterialButton, SPayMaterialButton sPayMaterialButton2) {
        this.f29581a = constraintLayout;
        this.f29582b = sPayMaterialButton;
        this.f29583c = sPayMaterialButton2;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f29581a;
    }
}
