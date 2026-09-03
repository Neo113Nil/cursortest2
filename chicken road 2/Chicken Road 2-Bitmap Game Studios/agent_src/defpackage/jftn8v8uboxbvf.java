package defpackage;

import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class jftn8v8uboxbvf implements Function1 {
    public final /* synthetic */ Object FsuUJlzzWhYnMlD;
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ float b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    public /* synthetic */ jftn8v8uboxbvf(Rect rect, Outline.Generic generic, Brush brush, float f, Path path) {
        this.gmXBnHsR2YSm = rect;
        this.i7xAcZoXXiIt = generic;
        this.Uo5pffGf8LUU = brush;
        this.b41X89IqSbKt = f;
        this.FsuUJlzzWhYnMlD = path;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        long j;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj2 = this.FsuUJlzzWhYnMlD;
        Object obj3 = this.Uo5pffGf8LUU;
        Object obj4 = this.i7xAcZoXXiIt;
        Object obj5 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj5;
                Outline.Generic generic = (Outline.Generic) obj4;
                Brush brush = (Brush) obj3;
                float f = this.b41X89IqSbKt;
                Path path = (Path) obj2;
                DrawScope drawScope = (DrawScope) obj;
                float f2 = -rect.yzPsTade5rL7D3;
                float f3 = -rect.hRNgd2zGCE5kj;
                drawScope.getB41X89IqSbKt().yzPsTade5rL7D3.gmXBnHsR2YSm(f2, f3);
                try {
                    DrawScope.x(drawScope, generic.yzPsTade5rL7D3, brush, 0.0f, new Stroke(f * 2.0f, 0.0f, 0, 0, null, 30), null, 0, 52);
                    float intBitsToFloat = (Float.intBitsToFloat((int) (drawScope.b41X89IqSbKt() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (drawScope.b41X89IqSbKt() >> 32));
                    float intBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.b41X89IqSbKt() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (drawScope.b41X89IqSbKt() & 4294967295L));
                    long a2 = drawScope.a();
                    CanvasDrawScope$drawContext$1 b41X89IqSbKt = drawScope.getB41X89IqSbKt();
                    long oyjLVtGms9eZwJ0 = b41X89IqSbKt.oyjLVtGms9eZwJ0();
                    b41X89IqSbKt.yzPsTade5rL7D3().yRx9jbDCTnXb3();
                    try {
                        b41X89IqSbKt.yzPsTade5rL7D3.b41X89IqSbKt(intBitsToFloat, intBitsToFloat2, a2);
                        j = oyjLVtGms9eZwJ0;
                    } catch (Throwable th) {
                        th = th;
                        j = oyjLVtGms9eZwJ0;
                    }
                    try {
                        DrawScope.x(drawScope, path, brush, 0.0f, null, null, 0, 28);
                        b41X89IqSbKt.yzPsTade5rL7D3().uypNJrpDByoB();
                        b41X89IqSbKt.Uo5pffGf8LUU(j);
                        return unit;
                    } catch (Throwable th2) {
                        th = th2;
                        b41X89IqSbKt.yzPsTade5rL7D3().uypNJrpDByoB();
                        b41X89IqSbKt.Uo5pffGf8LUU(j);
                        throw th;
                    }
                } finally {
                    drawScope.getB41X89IqSbKt().yzPsTade5rL7D3.gmXBnHsR2YSm(-f2, -f3);
                }
            default:
                long longValue = ((Long) obj).longValue();
                Object obj6 = ((Ref.ObjectRef) obj5).oyjLVtGms9eZwJ0;
                obj6.getClass();
                SuspendAnimationKt.Uo5pffGf8LUU((AnimationScope) obj6, longValue, this.b41X89IqSbKt, (Animation) obj4, (AnimationState) obj3, (Function1) obj2);
                return unit;
        }
    }

    public /* synthetic */ jftn8v8uboxbvf(Ref.ObjectRef objectRef, float f, Animation animation, AnimationState animationState, Function1 function1) {
        this.gmXBnHsR2YSm = objectRef;
        this.b41X89IqSbKt = f;
        this.i7xAcZoXXiIt = animation;
        this.Uo5pffGf8LUU = animationState;
        this.FsuUJlzzWhYnMlD = function1;
    }
}
