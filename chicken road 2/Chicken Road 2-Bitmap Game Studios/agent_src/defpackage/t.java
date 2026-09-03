package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.RowColumnParentData;
import androidx.compose.material3.SegmentedButtonContentMeasurePolicy;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Function1 {
    public final /* synthetic */ Object FsuUJlzzWhYnMlD;
    public final /* synthetic */ Object UEutaskTsxaI;
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ MeasureScope b41X89IqSbKt;
    public final /* synthetic */ int gmXBnHsR2YSm;
    public final /* synthetic */ int i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;

    public /* synthetic */ t(ArrayList arrayList, MeasureScope measureScope, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, int i, ArrayList arrayList2, int i2) {
        this.Uo5pffGf8LUU = arrayList;
        this.b41X89IqSbKt = measureScope;
        this.FsuUJlzzWhYnMlD = segmentedButtonContentMeasurePolicy;
        this.gmXBnHsR2YSm = i;
        this.UEutaskTsxaI = arrayList2;
        this.i7xAcZoXXiIt = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = 0;
        Object obj2 = this.UEutaskTsxaI;
        Object obj3 = this.FsuUJlzzWhYnMlD;
        MeasureScope measureScope = this.b41X89IqSbKt;
        Object obj4 = this.Uo5pffGf8LUU;
        switch (i) {
            case 0:
                Placeable[] placeableArr = (Placeable[]) obj4;
                ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) obj3;
                int[] iArr = (int[]) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int length = placeableArr.length;
                int i3 = 0;
                while (i2 < length) {
                    Placeable placeable = placeableArr[i2];
                    int i4 = i3 + 1;
                    placeable.getClass();
                    Object jJwKDtysO3vm5E = placeable.getJJwKDtysO3vm5E();
                    RowColumnParentData rowColumnParentData = jJwKDtysO3vm5E instanceof RowColumnParentData ? (RowColumnParentData) jJwKDtysO3vm5E : null;
                    LayoutDirection b41X89IqSbKt = measureScope.getB41X89IqSbKt();
                    CrossAxisAlignment crossAxisAlignment = rowColumnParentData != null ? rowColumnParentData.ra306ClFT3HT : null;
                    int i5 = this.gmXBnHsR2YSm;
                    placementScope.UEutaskTsxaI(placeable, crossAxisAlignment != null ? crossAxisAlignment.yzPsTade5rL7D3(i5, placeable.oyjLVtGms9eZwJ0, b41X89IqSbKt, placeable, this.i7xAcZoXXiIt) : columnMeasurePolicy.hRNgd2zGCE5kj.yzPsTade5rL7D3(placeable.oyjLVtGms9eZwJ0, i5, b41X89IqSbKt), iArr[i3], 0.0f);
                    i2++;
                    i3 = i4;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj4;
                SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy = (SegmentedButtonContentMeasurePolicy) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                int size = arrayList.size();
                int i6 = 0;
                while (true) {
                    int i7 = this.i7xAcZoXXiIt;
                    if (i6 >= size) {
                        int uMAEPvJoKWq8X = measureScope.uMAEPvJoKWq8X(8.0f) + measureScope.uMAEPvJoKWq8X(SegmentedButtonDefaults.hRNgd2zGCE5kj);
                        Animatable animatable = segmentedButtonContentMeasurePolicy.ra306ClFT3HT;
                        int intValue = uMAEPvJoKWq8X + (animatable != null ? ((Number) animatable.oyjLVtGms9eZwJ0()).intValue() : this.gmXBnHsR2YSm);
                        int size2 = arrayList2.size();
                        while (i2 < size2) {
                            Placeable placeable2 = (Placeable) arrayList2.get(i2);
                            placementScope2.UEutaskTsxaI(placeable2, intValue, (i7 - placeable2.b41X89IqSbKt) / 2, 0.0f);
                            i2++;
                        }
                        break;
                    } else {
                        Placeable placeable3 = (Placeable) arrayList.get(i6);
                        placementScope2.UEutaskTsxaI(placeable3, 0, (i7 - placeable3.b41X89IqSbKt) / 2, 0.0f);
                        i6++;
                    }
                }
        }
        return unit;
    }

    public /* synthetic */ t(Placeable[] placeableArr, ColumnMeasurePolicy columnMeasurePolicy, int i, int i2, MeasureScope measureScope, int[] iArr) {
        this.Uo5pffGf8LUU = placeableArr;
        this.FsuUJlzzWhYnMlD = columnMeasurePolicy;
        this.gmXBnHsR2YSm = i;
        this.i7xAcZoXXiIt = i2;
        this.b41X89IqSbKt = measureScope;
        this.UEutaskTsxaI = iArr;
    }
}
