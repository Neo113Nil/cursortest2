package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.l3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4403l3 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31500a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f31501b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f31502c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayMaterialButton f31503d;

    /* renamed from: e, reason: collision with root package name */
    public final SPayMaterialButton f31504e;

    public C4403l3(ConstraintLayout constraintLayout, SPayTextView sPayTextView, SPayTextView sPayTextView2, SPayMaterialButton sPayMaterialButton, SPayMaterialButton sPayMaterialButton2) {
        this.f31500a = constraintLayout;
        this.f31501b = sPayTextView;
        this.f31502c = sPayTextView2;
        this.f31503d = sPayMaterialButton;
        this.f31504e = sPayMaterialButton2;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f31500a;
    }
}
