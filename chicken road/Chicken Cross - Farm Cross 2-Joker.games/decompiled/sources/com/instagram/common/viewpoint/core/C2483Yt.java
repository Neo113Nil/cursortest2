package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2483Yt extends AdNativeComponentView {
    public static final int A01 = (int) (XX.A02 * 1.0f);
    public final ImageView A00;

    public C2483Yt(C2930gi c2930gi) {
        super(c2930gi);
        this.A00 = new ZI(c2930gi);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC2440Xc.A04(this.A00, EnumC2440Xc.A0B);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        YB.A0N(this.A00, -2130706433);
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
