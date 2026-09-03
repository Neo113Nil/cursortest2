package defpackage;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ProgressIndicatorKt;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class h2 implements Function0 {
    public final /* synthetic */ Function0 b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ h2(int i, Function0 function0) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        Function0 function0 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                try {
                    return (List) function0.hRNgd2zGCE5kj();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.oyjLVtGms9eZwJ0;
                }
            case 1:
                int i2 = ModalBottomSheetKt.hRNgd2zGCE5kj;
                function0.hRNgd2zGCE5kj();
                break;
            case 2:
                function0.hRNgd2zGCE5kj();
                break;
            default:
                CubicBezierEasing cubicBezierEasing = ProgressIndicatorKt.yzPsTade5rL7D3;
                float floatValue = ((Number) function0.hRNgd2zGCE5kj()).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                }
                return Float.valueOf(floatValue);
        }
        return Boolean.TRUE;
    }
}
