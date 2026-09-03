package defpackage;

import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements Function1 {
    public final /* synthetic */ int b41X89IqSbKt;
    public final /* synthetic */ Placeable gmXBnHsR2YSm;
    public final /* synthetic */ int i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ w2(int i, int i2, Placeable placeable) {
        this.oyjLVtGms9eZwJ0 = 1;
        this.b41X89IqSbKt = i;
        this.gmXBnHsR2YSm = placeable;
        this.i7xAcZoXXiIt = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.i7xAcZoXXiIt;
        int i3 = this.b41X89IqSbKt;
        Placeable placeable = this.gmXBnHsR2YSm;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                placementScope.UEutaskTsxaI(placeable, i3, i2, 0.0f);
                break;
            case 1:
                placementScope.UEutaskTsxaI(placeable, MathKt.hRNgd2zGCE5kj((i3 - placeable.oyjLVtGms9eZwJ0) / 2.0f), MathKt.hRNgd2zGCE5kj((i2 - placeable.b41X89IqSbKt) / 2.0f), 0.0f);
                break;
            default:
                placementScope.UEutaskTsxaI(placeable, i3, i2, 0.0f);
                break;
        }
        return unit;
    }

    public /* synthetic */ w2(Placeable placeable, int i, int i2, int i3) {
        this.oyjLVtGms9eZwJ0 = i3;
        this.gmXBnHsR2YSm = placeable;
        this.b41X89IqSbKt = i;
        this.i7xAcZoXXiIt = i2;
    }
}
