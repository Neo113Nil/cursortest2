package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.or, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4514or implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31750a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f31751b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayMaterialButton f31752c;

    public C4514or(ConstraintLayout constraintLayout, SPayTextView sPayTextView, SPayMaterialButton sPayMaterialButton) {
        this.f31750a = constraintLayout;
        this.f31751b = sPayTextView;
        this.f31752c = sPayMaterialButton;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f31750a;
    }
}
