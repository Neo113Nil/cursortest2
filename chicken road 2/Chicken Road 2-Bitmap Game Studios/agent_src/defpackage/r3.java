package defpackage;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.internal.NavControllerImpl;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class r3 implements Function1 {
    public final /* synthetic */ Object FsuUJlzzWhYnMlD;
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ boolean b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 2;

    public /* synthetic */ r3(Handle handle, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef, Ref.LongRef longRef2, boolean z) {
        this.gmXBnHsR2YSm = longRef;
        this.i7xAcZoXXiIt = textFieldSelectionState;
        this.b41X89IqSbKt = z;
        this.Uo5pffGf8LUU = handle;
        this.FsuUJlzzWhYnMlD = longRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj2 = this.FsuUJlzzWhYnMlD;
        Object obj3 = this.Uo5pffGf8LUU;
        boolean z = this.b41X89IqSbKt;
        Object obj4 = this.i7xAcZoXXiIt;
        Object obj5 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                MutableState mutableState = ((MutableTransitionState) obj5).ra306ClFT3HT;
                MutableState mutableState2 = (MutableState) obj4;
                State state = (State) obj3;
                State state2 = (State) obj2;
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                float f = 0.8f;
                float f2 = 1.0f;
                graphicsLayerScope.exVmIuryuB8HeQ(!z ? ((Number) state.getOyjLVtGms9eZwJ0()).floatValue() : ((Boolean) ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0()).booleanValue() ? 1.0f : 0.8f);
                if (!z) {
                    f = ((Number) state.getOyjLVtGms9eZwJ0()).floatValue();
                } else if (((Boolean) ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0()).booleanValue()) {
                    f = 1.0f;
                }
                graphicsLayerScope.Yey4RyhSyBRHub(f);
                if (!z) {
                    f2 = ((Number) state2.getOyjLVtGms9eZwJ0()).floatValue();
                } else if (!((Boolean) ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0()).booleanValue()) {
                    f2 = 0.0f;
                }
                graphicsLayerScope.yzPsTade5rL7D3(f2);
                graphicsLayerScope.pJp52Z5NdMAiw(((TransformOrigin) mutableState2.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3);
                return unit;
            case 1:
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                navBackStackEntry.getClass();
                ((Ref.BooleanRef) obj5).oyjLVtGms9eZwJ0 = true;
                ((Ref.BooleanRef) obj4).oyjLVtGms9eZwJ0 = true;
                ((NavControllerImpl) obj3).yRx9jbDCTnXb3(navBackStackEntry, z, (ArrayDeque) obj2);
                return unit;
            default:
                throw null;
        }
    }

    public /* synthetic */ r3(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, NavControllerImpl navControllerImpl, boolean z, ArrayDeque arrayDeque) {
        this.gmXBnHsR2YSm = booleanRef;
        this.i7xAcZoXXiIt = booleanRef2;
        this.Uo5pffGf8LUU = navControllerImpl;
        this.b41X89IqSbKt = z;
        this.FsuUJlzzWhYnMlD = arrayDeque;
    }

    public /* synthetic */ r3(boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, Transition.TransitionAnimationState transitionAnimationState, Transition.TransitionAnimationState transitionAnimationState2) {
        this.b41X89IqSbKt = z;
        this.gmXBnHsR2YSm = mutableTransitionState;
        this.i7xAcZoXXiIt = mutableState;
        this.Uo5pffGf8LUU = transitionAnimationState;
        this.FsuUJlzzWhYnMlD = transitionAnimationState2;
    }
}
