package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.x1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4746x1 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final NestedScrollView f32439a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f32440b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayMaterialButton f32441c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayMaterialButton f32442d;

    /* renamed from: e, reason: collision with root package name */
    public final SPayTextView f32443e;

    /* renamed from: f, reason: collision with root package name */
    public final SPayTextView f32444f;

    /* renamed from: g, reason: collision with root package name */
    public final SPayTextView f32445g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatCheckBox f32446h;

    /* renamed from: i, reason: collision with root package name */
    public final RecyclerView f32447i;

    public C4746x1(NestedScrollView nestedScrollView, SPayTextView sPayTextView, SPayMaterialButton sPayMaterialButton, SPayMaterialButton sPayMaterialButton2, SPayTextView sPayTextView2, SPayTextView sPayTextView3, SPayTextView sPayTextView4, AppCompatCheckBox appCompatCheckBox, RecyclerView recyclerView) {
        this.f32439a = nestedScrollView;
        this.f32440b = sPayTextView;
        this.f32441c = sPayMaterialButton;
        this.f32442d = sPayMaterialButton2;
        this.f32443e = sPayTextView2;
        this.f32444f = sPayTextView3;
        this.f32445g = sPayTextView4;
        this.f32446h = appCompatCheckBox;
        this.f32447i = recyclerView;
    }

    @Override // X4.a
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f32439a;
    }
}
