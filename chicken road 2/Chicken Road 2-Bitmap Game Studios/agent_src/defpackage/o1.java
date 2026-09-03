package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.WindowBoundsCalculator;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements Function1 {
    public final /* synthetic */ Object FsuUJlzzWhYnMlD;
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ int b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    public /* synthetic */ o1(WindowBoundsCalculator windowBoundsCalculator, int i, MutableState mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        this.gmXBnHsR2YSm = windowBoundsCalculator;
        this.b41X89IqSbKt = i;
        this.i7xAcZoXXiIt = mutableState;
        this.Uo5pffGf8LUU = mutableIntState;
        this.FsuUJlzzWhYnMlD = mutableIntState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.b41X89IqSbKt;
        Object obj2 = this.FsuUJlzzWhYnMlD;
        Object obj3 = this.Uo5pffGf8LUU;
        Object obj4 = this.i7xAcZoXXiIt;
        Object obj5 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj4;
                MutableIntState mutableIntState = (MutableIntState) obj2;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                mutableState.setValue(layoutCoordinates);
                ((MutableIntState) obj3).uypNJrpDByoB((int) (layoutCoordinates.ra306ClFT3HT() >> 32));
                View view = ((WindowBoundsCalculator) obj5).yzPsTade5rL7D3;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                IntRect intRect = new IntRect(rect.left, rect.top, rect.right, rect.bottom);
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) mutableState.getOyjLVtGms9eZwJ0();
                mutableIntState.uypNJrpDByoB(ExposedDropdownMenuKt.hRNgd2zGCE5kj(intRect, (layoutCoordinates2 == null || !layoutCoordinates2.FsuUJlzzWhYnMlD()) ? androidx.compose.ui.geometry.Rect.b41X89IqSbKt : RectKt.yzPsTade5rL7D3(layoutCoordinates2.pu0JZhzR2Or6(0L), IntSizeKt.ra306ClFT3HT(layoutCoordinates2.ra306ClFT3HT())), i2));
                break;
            default:
                ArrayList arrayList = (ArrayList) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                Ref.IntRef intRef = (Ref.IntRef) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Placeable.PlacementScope.NIabVTHf6LMJyXq(placementScope, (Placeable) arrayList.get(i3), intRef.oyjLVtGms9eZwJ0 * i3, 0);
                }
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Placeable placeable = (Placeable) arrayList2.get(i4);
                    Placeable.PlacementScope.NIabVTHf6LMJyXq(placementScope, placeable, 0, i2 - placeable.b41X89IqSbKt);
                }
                int size3 = arrayList3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    Placeable placeable2 = (Placeable) arrayList3.get(i5);
                    Placeable.PlacementScope.NIabVTHf6LMJyXq(placementScope, placeable2, 0, i2 - placeable2.b41X89IqSbKt);
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ o1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Ref.IntRef intRef, int i) {
        this.gmXBnHsR2YSm = arrayList;
        this.i7xAcZoXXiIt = arrayList2;
        this.Uo5pffGf8LUU = arrayList3;
        this.FsuUJlzzWhYnMlD = intRef;
        this.b41X89IqSbKt = i;
    }
}
