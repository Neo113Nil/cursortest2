package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class K3 implements com.facebook.ads.redexgen.core.InterfaceC1292b8 {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0799Ji A00;

    public K3(com.facebook.ads.redexgen.core.C0799Ji c0799Ji) {
        this.A00 = c0799Ji;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1292b8
    public final void AE7(com.facebook.ads.redexgen.core.C1291b7 c1291b7) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.ImageView imageView3;
        android.widget.ImageView imageView4;
        imageView = this.A00.A02;
        if (imageView != null && c1291b7.A00() != null) {
            imageView2 = this.A00.A02;
            imageView2.setImageBitmap(c1291b7.A00());
            imageView3 = this.A00.A02;
            imageView3.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            imageView4 = this.A00.A02;
            imageView4.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
