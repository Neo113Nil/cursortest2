package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class M7 implements com.facebook.ads.redexgen.core.InterfaceC1275ar {
    public final /* synthetic */ com.facebook.ads.redexgen.core.M6 A00;

    public M7(com.facebook.ads.redexgen.core.M6 m6) {
        this.A00 = m6;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1275ar
    public final void ADB(boolean z) {
        boolean z2;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.ImageView imageView3;
        this.A00.A0D(z);
        z2 = this.A00.A0B;
        if (z2) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1275ar
    public final void ADx(boolean z) {
        boolean z2;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.ImageView imageView3;
        this.A00.A0D(z);
        z2 = this.A00.A0B;
        if (z2) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }
}
