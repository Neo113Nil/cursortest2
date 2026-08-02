package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.qc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4557qc implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31854a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f31855b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f31856c;

    public C4557qc(ConstraintLayout constraintLayout, SPayTextView sPayTextView, SPayTextView sPayTextView2) {
        this.f31854a = constraintLayout;
        this.f31855b = sPayTextView;
        this.f31856c = sPayTextView2;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f31854a;
    }
}
