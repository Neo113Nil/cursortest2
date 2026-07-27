package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public class K3 implements InterfaceC2586b8 {
    public final /* synthetic */ C2093Ji A00;

    public K3(C2093Ji c2093Ji) {
        this.A00 = c2093Ji;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2586b8
    public final void AE7(C2585b7 c2585b7) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        imageView = this.A00.A02;
        if (imageView != null && c2585b7.A00() != null) {
            imageView2 = this.A00.A02;
            imageView2.setImageBitmap(c2585b7.A00());
            imageView3 = this.A00.A02;
            imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView4 = this.A00.A02;
            imageView4.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
