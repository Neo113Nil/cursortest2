package defpackage;

import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class x4 implements Function0 {
    public final /* synthetic */ FloatProducer b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ x4(FloatProducer floatProducer, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = floatProducer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        FloatProducer floatProducer = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                return new Dp(MathHelpersKt.hRNgd2zGCE5kj(24.0f, 16.0f, floatProducer.hRNgd2zGCE5kj()));
            case 1:
                return Float.valueOf(floatProducer.hRNgd2zGCE5kj() < 1.0f ? 0.3f : 1.0f);
            default:
                return new Dp(MathHelpersKt.hRNgd2zGCE5kj(24.0f, 16.0f, floatProducer.hRNgd2zGCE5kj()));
        }
    }
}
