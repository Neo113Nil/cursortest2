package Ve;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.yn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4796yn implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f32605a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f32606b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f32607c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayMaterialButton f32608d;

    public C4796yn(LinearLayoutCompat linearLayoutCompat, SPayTextView sPayTextView, SPayTextView sPayTextView2, SPayMaterialButton sPayMaterialButton) {
        this.f32605a = linearLayoutCompat;
        this.f32606b = sPayTextView;
        this.f32607c = sPayTextView2;
        this.f32608d = sPayMaterialButton;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f32605a;
    }
}
