package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* renamed from: com.facebook.ads.redexgen.X.Xz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0896Xz extends AdNativeComponentView {
    public static final int A01 = (int) (AbstractC0856Wl.A02 * 1.0f);
    public final ImageView A00;

    public C0896Xz(C1153dL c1153dL) {
        super(c1153dL);
        this.A00 = new YM(c1153dL);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC0861Wq.A04(this.A00, EnumC0861Wq.A0B);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        XP.A0K(this.A00, -2130706433);
        setPadding(A01, A01, A01, A01);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
