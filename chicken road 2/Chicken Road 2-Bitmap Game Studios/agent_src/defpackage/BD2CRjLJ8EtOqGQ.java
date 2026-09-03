package defpackage;

import androidx.compose.material3.internal.AnchoredDragScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class BD2CRjLJ8EtOqGQ implements Function2 {
    public final /* synthetic */ AnchoredDragScope b41X89IqSbKt;
    public final /* synthetic */ Ref.FloatRef gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ BD2CRjLJ8EtOqGQ(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = anchoredDragScope;
        this.gmXBnHsR2YSm = floatRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Ref.FloatRef floatRef = this.gmXBnHsR2YSm;
        AnchoredDragScope anchoredDragScope = this.b41X89IqSbKt;
        float floatValue = ((Float) obj).floatValue();
        float floatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                anchoredDragScope.yzPsTade5rL7D3(floatValue, floatValue2);
                floatRef.oyjLVtGms9eZwJ0 = floatValue;
                break;
            default:
                anchoredDragScope.yzPsTade5rL7D3(floatValue, floatValue2);
                floatRef.oyjLVtGms9eZwJ0 = floatValue;
                break;
        }
        return unit;
    }
}
