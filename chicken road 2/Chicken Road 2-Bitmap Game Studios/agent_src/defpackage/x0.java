package defpackage;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Function1 {
    public final /* synthetic */ State b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ x0(State state, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        State state = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                long j = ((Color) state.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3;
                if (!Color.ra306ClFT3HT(j, Color.i7xAcZoXXiIt)) {
                    DrawScope.K6HLhdE38aTVLa(drawScope, j, 0L, 0L, 0.0f, null, null, 126);
                    break;
                }
                break;
            case 1:
                ((GraphicsLayerScope) obj).yzPsTade5rL7D3(((Number) state.getOyjLVtGms9eZwJ0()).floatValue());
                break;
            case 2:
                break;
            case 3:
                ((GraphicsLayerScope) obj).yzPsTade5rL7D3(((Number) state.getOyjLVtGms9eZwJ0()).floatValue());
                break;
            case 4:
                ((GraphicsLayerScope) obj).yzPsTade5rL7D3(((Number) state.getOyjLVtGms9eZwJ0()).floatValue());
                break;
            default:
                ((GraphicsLayerScope) obj).yzPsTade5rL7D3(((Number) state.getOyjLVtGms9eZwJ0()).floatValue());
                break;
        }
        return unit;
    }
}
