package defpackage;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.foundation.draganddrop.DragAndDropTargetNode;
import androidx.compose.foundation.layout.VisibilityNode;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.window.layout.WindowMetricsCalculator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class y8 implements Function1 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ y8(DragAndDropTargetNode dragAndDropTargetNode) {
        this.oyjLVtGms9eZwJ0 = 12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        switch (i) {
            case 0:
                Offset offset = (Offset) obj;
                return new AnimationVector2D(Float.intBitsToFloat((int) (offset.yzPsTade5rL7D3 >> 32)), Float.intBitsToFloat((int) (4294967295L & offset.yzPsTade5rL7D3)));
            case 1:
                float f = ((AnimationVector2D) obj).yzPsTade5rL7D3;
                return new Offset((Float.floatToRawIntBits(r9.hRNgd2zGCE5kj) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            case 2:
                long j = ((IntOffset) obj).yzPsTade5rL7D3;
                return new AnimationVector2D((int) (j >> 32), (int) (j & 4294967295L));
            case 3:
                AnimationVector2D animationVector2D = (AnimationVector2D) obj;
                return new IntOffset((Math.round(animationVector2D.hRNgd2zGCE5kj) & 4294967295L) | (Math.round(animationVector2D.yzPsTade5rL7D3) << 32));
            case 4:
                long j2 = ((IntSize) obj).yzPsTade5rL7D3;
                return new AnimationVector2D((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                AnimationVector2D animationVector2D2 = (AnimationVector2D) obj;
                int round = Math.round(animationVector2D2.yzPsTade5rL7D3);
                if (round < 0) {
                    round = 0;
                }
                return new IntSize((round << 32) | ((Math.round(animationVector2D2.hRNgd2zGCE5kj) >= 0 ? r9 : 0) & 4294967295L));
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                Rect rect = (Rect) obj;
                return new AnimationVector4D(rect.yzPsTade5rL7D3, rect.hRNgd2zGCE5kj, rect.ra306ClFT3HT, rect.oyjLVtGms9eZwJ0);
            case 7:
                AnimationVector4D animationVector4D = (AnimationVector4D) obj;
                return new Rect(animationVector4D.yzPsTade5rL7D3, animationVector4D.hRNgd2zGCE5kj, animationVector4D.ra306ClFT3HT, animationVector4D.oyjLVtGms9eZwJ0);
            case 8:
                return Float.valueOf(((AnimationVector1D) obj).yzPsTade5rL7D3);
            case 9:
                KProperty[] kPropertyArr = SemanticsPropertiesKt.yzPsTade5rL7D3;
                ((SemanticsPropertyReceiver) obj).hRNgd2zGCE5kj(SemanticsProperties.ZvpnNpCMEWSR3, unit);
                return unit;
            case 10:
                return ((WindowInsetsHolder) obj).ra306ClFT3HT;
            case 11:
                WindowMetricsCalculator windowMetricsCalculator = (WindowMetricsCalculator) obj;
                WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion.yzPsTade5rL7D3;
                windowMetricsCalculator.getClass();
                return windowMetricsCalculator;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                throw null;
            default:
                return unit;
        }
    }

    public /* synthetic */ y8(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }

    public /* synthetic */ y8(VisibilityNode visibilityNode, Placeable placeable) {
        this.oyjLVtGms9eZwJ0 = 13;
    }
}
