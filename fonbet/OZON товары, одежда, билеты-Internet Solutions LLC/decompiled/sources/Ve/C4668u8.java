package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.u8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4668u8 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32191a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f32192b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayMaterialButton f32193c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayMaterialButton f32194d;

    /* renamed from: e, reason: collision with root package name */
    public final ShapeableImageView f32195e;

    /* renamed from: f, reason: collision with root package name */
    public final SPayTextView f32196f;

    /* renamed from: g, reason: collision with root package name */
    public final SPayTextView f32197g;

    public C4668u8(ConstraintLayout constraintLayout, SPayTextView sPayTextView, SPayMaterialButton sPayMaterialButton, SPayMaterialButton sPayMaterialButton2, ShapeableImageView shapeableImageView, SPayTextView sPayTextView2, SPayTextView sPayTextView3) {
        this.f32191a = constraintLayout;
        this.f32192b = sPayTextView;
        this.f32193c = sPayMaterialButton;
        this.f32194d = sPayMaterialButton2;
        this.f32195e = shapeableImageView;
        this.f32196f = sPayTextView2;
        this.f32197g = sPayTextView3;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f32191a;
    }
}
