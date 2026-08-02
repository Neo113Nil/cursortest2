package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.ym, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4795ym implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32600a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f32601b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f32602c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayTextView f32603d;

    /* renamed from: e, reason: collision with root package name */
    public final SPayMaterialButton f32604e;

    public C4795ym(ConstraintLayout constraintLayout, SPayTextView sPayTextView, SPayTextView sPayTextView2, SPayTextView sPayTextView3, SPayMaterialButton sPayMaterialButton) {
        this.f32600a = constraintLayout;
        this.f32601b = sPayTextView;
        this.f32602c = sPayTextView2;
        this.f32603d = sPayTextView3;
        this.f32604e = sPayMaterialButton;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f32600a;
    }
}
