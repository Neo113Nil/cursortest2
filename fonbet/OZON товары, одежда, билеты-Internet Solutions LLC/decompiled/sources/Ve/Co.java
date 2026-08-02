package Ve;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Co implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f28777a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f28778b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f28779c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayTextView f28780d;

    /* renamed from: e, reason: collision with root package name */
    public final SPayMaterialButton f28781e;

    /* renamed from: f, reason: collision with root package name */
    public final SPayMaterialButton f28782f;

    public Co(LinearLayoutCompat linearLayoutCompat, SPayTextView sPayTextView, SPayTextView sPayTextView2, SPayTextView sPayTextView3, SPayMaterialButton sPayMaterialButton, SPayMaterialButton sPayMaterialButton2) {
        this.f28777a = linearLayoutCompat;
        this.f28778b = sPayTextView;
        this.f28779c = sPayTextView2;
        this.f28780d = sPayTextView3;
        this.f28781e = sPayMaterialButton;
        this.f28782f = sPayMaterialButton2;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f28777a;
    }
}
