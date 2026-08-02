package p000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;

/* JADX INFO: renamed from: wq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0849wq implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    public final na0 f8626a = na0.m3507a();

    /* JADX INFO: renamed from: b */
    public final int f8627b;

    /* JADX INFO: renamed from: c */
    public final int f8628c;

    /* JADX INFO: renamed from: d */
    public final EnumC0034aq f8629d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0668ru f8630e;

    /* JADX INFO: renamed from: f */
    public final boolean f8631f;

    /* JADX INFO: renamed from: g */
    public final bx0 f8632g;

    public C0849wq(int i, int i2, uu0 uu0Var) {
        this.f8627b = i;
        this.f8628c = i2;
        this.f8629d = (EnumC0034aq) uu0Var.m4955c(C0742tu.f7590f);
        this.f8630e = (AbstractC0668ru) uu0Var.m4955c(AbstractC0668ru.f6967c);
        ru0 ru0Var = C0742tu.f7593i;
        this.f8631f = uu0Var.m4955c(ru0Var) != null && ((Boolean) uu0Var.m4955c(ru0Var)).booleanValue();
        this.f8632g = (bx0) uu0Var.m4955c(C0742tu.f7591g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        na0 na0Var = this.f8626a;
        int width = this.f8627b;
        int height = this.f8628c;
        if (na0Var.m3508b(width, height, this.f8631f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f8629d == EnumC0034aq.f593k) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0812vq());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fMo3991b = this.f8630e.mo3991b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fMo3991b);
        int iRound2 = Math.round(size.getHeight() * fMo3991b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fMo3991b);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        bx0 bx0Var = this.f8632g;
        if (bx0Var != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((bx0Var == bx0.f1039j && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
