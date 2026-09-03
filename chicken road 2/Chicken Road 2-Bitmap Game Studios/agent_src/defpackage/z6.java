package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class z6 implements Function1 {
    public final /* synthetic */ Function1 Uo5pffGf8LUU;
    public final /* synthetic */ float b41X89IqSbKt;
    public final /* synthetic */ Ref.FloatRef gmXBnHsR2YSm;
    public final /* synthetic */ ScrollScope i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ z6(float f, Ref.FloatRef floatRef, ScrollScope scrollScope, Function1 function1, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = f;
        this.gmXBnHsR2YSm = floatRef;
        this.i7xAcZoXXiIt = scrollScope;
        this.Uo5pffGf8LUU = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        float f;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Function1 function1 = this.Uo5pffGf8LUU;
        ScrollScope scrollScope = this.i7xAcZoXXiIt;
        Ref.FloatRef floatRef = this.gmXBnHsR2YSm;
        float f2 = this.b41X89IqSbKt;
        AnimationScope animationScope = (AnimationScope) obj;
        switch (i) {
            case 0:
                float abs = Math.abs(((Number) ((SnapshotMutableStateImpl) animationScope.b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue());
                float abs2 = Math.abs(f2);
                MutableState mutableState = animationScope.b41X89IqSbKt;
                if (abs < abs2) {
                    SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) mutableState;
                    SnapFlingBehaviorKt.ra306ClFT3HT(animationScope, scrollScope, function1, ((Number) snapshotMutableStateImpl.getOyjLVtGms9eZwJ0()).floatValue() - floatRef.oyjLVtGms9eZwJ0);
                    floatRef.oyjLVtGms9eZwJ0 = ((Number) snapshotMutableStateImpl.getOyjLVtGms9eZwJ0()).floatValue();
                    break;
                } else {
                    float oyjLVtGms9eZwJ0 = SnapFlingBehaviorKt.oyjLVtGms9eZwJ0(((Number) ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0()).floatValue(), f2);
                    SnapFlingBehaviorKt.ra306ClFT3HT(animationScope, scrollScope, function1, oyjLVtGms9eZwJ0 - floatRef.oyjLVtGms9eZwJ0);
                    animationScope.yzPsTade5rL7D3();
                    floatRef.oyjLVtGms9eZwJ0 = oyjLVtGms9eZwJ0;
                    break;
                }
            default:
                float oyjLVtGms9eZwJ02 = SnapFlingBehaviorKt.oyjLVtGms9eZwJ0(((Number) ((SnapshotMutableStateImpl) animationScope.b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue(), f2);
                float f3 = oyjLVtGms9eZwJ02 - floatRef.oyjLVtGms9eZwJ0;
                try {
                    f = scrollScope.b41X89IqSbKt(f3);
                } catch (CancellationException unused) {
                    animationScope.yzPsTade5rL7D3();
                    f = 0.0f;
                }
                function1.uypNJrpDByoB(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || oyjLVtGms9eZwJ02 != ((Number) ((SnapshotMutableStateImpl) animationScope.b41X89IqSbKt).getOyjLVtGms9eZwJ0()).floatValue()) {
                    animationScope.yzPsTade5rL7D3();
                }
                floatRef.oyjLVtGms9eZwJ0 += f;
                break;
        }
        return unit;
    }
}
