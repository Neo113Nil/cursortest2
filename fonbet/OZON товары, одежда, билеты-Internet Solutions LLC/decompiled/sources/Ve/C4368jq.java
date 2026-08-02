package Ve;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.jq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4368jq implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31396a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f31397b;

    /* renamed from: c, reason: collision with root package name */
    public final Group f31398c;

    /* renamed from: d, reason: collision with root package name */
    public final LottieAnimationView f31399d;

    /* renamed from: e, reason: collision with root package name */
    public final SPayTextView f31400e;

    public C4368jq(ConstraintLayout constraintLayout, SPayTextView sPayTextView, Group group, LottieAnimationView lottieAnimationView, SPayTextView sPayTextView2) {
        this.f31396a = constraintLayout;
        this.f31397b = sPayTextView;
        this.f31398c = group;
        this.f31399d = lottieAnimationView;
        this.f31400e = sPayTextView2;
    }

    @Override // X4.a
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f31396a;
    }
}
