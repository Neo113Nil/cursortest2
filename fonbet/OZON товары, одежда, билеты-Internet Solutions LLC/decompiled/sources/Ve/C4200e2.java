package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayMaterialButton;

/* renamed from: Ve.e2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4200e2 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f30909a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayMaterialButton f30910b;

    public C4200e2(ConstraintLayout constraintLayout, SPayMaterialButton sPayMaterialButton) {
        this.f30909a = constraintLayout;
        this.f30910b = sPayMaterialButton;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f30909a;
    }
}
