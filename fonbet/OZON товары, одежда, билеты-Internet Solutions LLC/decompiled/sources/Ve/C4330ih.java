package Ve;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.ih, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4330ih implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final CardView f31299a;

    /* renamed from: b, reason: collision with root package name */
    public final SPayTextView f31300b;

    /* renamed from: c, reason: collision with root package name */
    public final SPayTextView f31301c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f31302d;

    public C4330ih(CardView cardView, SPayTextView sPayTextView, SPayTextView sPayTextView2, AppCompatImageView appCompatImageView) {
        this.f31299a = cardView;
        this.f31300b = sPayTextView;
        this.f31301c = sPayTextView2;
        this.f31302d = appCompatImageView;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f31299a;
    }
}
