package Ve;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import spay.sdk.view.MerchantLogoCompositeView;

/* loaded from: classes10.dex */
public final class Oh implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f29627a;

    /* renamed from: b, reason: collision with root package name */
    public final MerchantLogoCompositeView f29628b;

    /* renamed from: c, reason: collision with root package name */
    public final ShapeableImageView f29629c;

    public Oh(FrameLayout frameLayout, MerchantLogoCompositeView merchantLogoCompositeView, ShapeableImageView shapeableImageView) {
        this.f29627a = frameLayout;
        this.f29628b = merchantLogoCompositeView;
        this.f29629c = shapeableImageView;
    }

    @Override // X4.a
    public final View getRoot() {
        return this.f29627a;
    }
}
