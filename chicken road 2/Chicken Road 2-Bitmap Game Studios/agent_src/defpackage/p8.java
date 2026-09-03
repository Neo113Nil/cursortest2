package defpackage;

import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class p8 implements Function1 {
    public final /* synthetic */ ArrayList b41X89IqSbKt;
    public final /* synthetic */ Placeable gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ p8(ArrayList arrayList, Placeable placeable, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = arrayList;
        this.gmXBnHsR2YSm = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Placeable placeable = this.gmXBnHsR2YSm;
        ArrayList arrayList = this.b41X89IqSbKt;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                placementScope.UEutaskTsxaI((Placeable) arrayList.get(0), 0, 0, 0.0f);
                placementScope.UEutaskTsxaI((Placeable) arrayList.get(1), ((Placeable) arrayList.get(0)).oyjLVtGms9eZwJ0, 0, 0.0f);
                placementScope.UEutaskTsxaI(placeable, ((Placeable) arrayList.get(0)).oyjLVtGms9eZwJ0 - (placeable.oyjLVtGms9eZwJ0 / 2), 0, 0.0f);
                break;
            default:
                placementScope.UEutaskTsxaI((Placeable) arrayList.get(0), 0, 0, 0.0f);
                placementScope.UEutaskTsxaI((Placeable) arrayList.get(1), 0, ((Placeable) arrayList.get(0)).b41X89IqSbKt, 0.0f);
                placementScope.UEutaskTsxaI(placeable, 0, ((Placeable) arrayList.get(0)).b41X89IqSbKt - (placeable.b41X89IqSbKt / 2), 0.0f);
                break;
        }
        return unit;
    }
}
