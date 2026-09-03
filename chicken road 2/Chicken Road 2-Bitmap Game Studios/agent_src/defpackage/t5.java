package defpackage;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements DoubleFunction {
    public final /* synthetic */ Rgb hRNgd2zGCE5kj;
    public final /* synthetic */ int yzPsTade5rL7D3;

    public /* synthetic */ t5(Rgb rgb, int i) {
        this.yzPsTade5rL7D3 = i;
        this.hRNgd2zGCE5kj = rgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double ra306ClFT3HT(double d) {
        int i = this.yzPsTade5rL7D3;
        Rgb rgb = this.hRNgd2zGCE5kj;
        switch (i) {
            case 0:
                return RangesKt.yzPsTade5rL7D3(rgb.MRfxZSx8l5UG62U.ra306ClFT3HT(d), rgb.b41X89IqSbKt, rgb.gmXBnHsR2YSm);
            default:
                return rgb.yRx9jbDCTnXb3.ra306ClFT3HT(RangesKt.yzPsTade5rL7D3(d, rgb.b41X89IqSbKt, rgb.gmXBnHsR2YSm));
        }
    }
}
