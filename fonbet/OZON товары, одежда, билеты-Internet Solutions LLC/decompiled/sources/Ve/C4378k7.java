package Ve;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.view.SPayTextView;
import spay.sdk.view.SpayBonusOverallCompositeView;

/* renamed from: Ve.k7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4378k7 implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31421a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f31422b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f31423c;

    /* renamed from: d, reason: collision with root package name */
    public final SPayTextView f31424d;

    /* renamed from: e, reason: collision with root package name */
    public final SpayBonusOverallCompositeView f31425e;

    /* renamed from: f, reason: collision with root package name */
    public final CardView f31426f;

    public C4378k7(ConstraintLayout constraintLayout, SPayTextView sPayTextView, SPayTextView sPayTextView2, SPayTextView sPayTextView3, SpayBonusOverallCompositeView spayBonusOverallCompositeView, CardView cardView) {
        this.f31421a = constraintLayout;
        this.f31422b = sPayTextView;
        this.f31423c = sPayTextView2;
        this.f31424d = sPayTextView3;
        this.f31425e = spayBonusOverallCompositeView;
        this.f31426f = cardView;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f31421a;
    }
}
