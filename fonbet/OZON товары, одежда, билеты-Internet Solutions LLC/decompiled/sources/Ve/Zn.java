package Ve;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Zn implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f30613a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f30614b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f30615c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayMaterialButton f30616d;

    public Zn(LinearLayoutCompat linearLayoutCompat, SPayTextView sPayTextView, SPayTextView sPayTextView2, SPayMaterialButton sPayMaterialButton) {
        this.f30613a = linearLayoutCompat;
        this.f30614b = sPayTextView;
        this.f30615c = sPayTextView2;
        this.f30616d = sPayMaterialButton;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f30613a;
    }
}
