package defpackage;

import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class yzUZju8lbdmWa implements Function1 {
    public final /* synthetic */ ArrayList b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ yzUZju8lbdmWa(int i, ArrayList arrayList) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        ArrayList arrayList = this.b41X89IqSbKt;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Placeable.PlacementScope.NIabVTHf6LMJyXq(placementScope, (Placeable) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                int size2 = arrayList.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    Placeable placeable = (Placeable) arrayList.get(i4);
                    Placeable.PlacementScope.NIabVTHf6LMJyXq(placementScope, placeable, i3, 0);
                    i3 += placeable.oyjLVtGms9eZwJ0;
                }
                break;
            default:
                int size3 = arrayList.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    placementScope.UEutaskTsxaI((Placeable) arrayList.get(i5), 0, 0, 0.0f);
                }
                break;
        }
        return unit;
    }
}
