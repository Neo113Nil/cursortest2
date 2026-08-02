package Ve;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import spay.sdk.view.SPayMaterialButton;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.bp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4137bp implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayoutCompat f30745a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f30746b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f30747c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayMaterialButton f30748d;

    /* renamed from: e, reason: collision with root package name */
    public final SPayMaterialButton f30749e;

    public C4137bp(LinearLayoutCompat linearLayoutCompat, SPayTextView sPayTextView, SPayTextView sPayTextView2, SPayMaterialButton sPayMaterialButton, SPayMaterialButton sPayMaterialButton2) {
        this.f30745a = linearLayoutCompat;
        this.f30746b = sPayTextView;
        this.f30747c = sPayTextView2;
        this.f30748d = sPayMaterialButton;
        this.f30749e = sPayMaterialButton2;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f30745a;
    }
}
