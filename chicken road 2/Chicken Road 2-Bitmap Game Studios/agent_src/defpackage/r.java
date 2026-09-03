package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Function3 {
    public final /* synthetic */ Function0 b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ r(int i, Function0 function0) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object MRfxZSx8l5UG62U(Object obj, Object obj2, Object obj3) {
        MutableInteractionSource mutableInteractionSource;
        switch (this.oyjLVtGms9eZwJ0) {
            case 0:
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                composer.mFNFvFv0Eiyk(-756081143);
                Indication indication = (Indication) composer.Uo5pffGf8LUU(IndicationKt.yzPsTade5rL7D3);
                if (indication instanceof IndicationNodeFactory) {
                    composer.mFNFvFv0Eiyk(-1604682242);
                    composer.o4ticBN7g1K8jE();
                    mutableInteractionSource = null;
                } else {
                    composer.mFNFvFv0Eiyk(-1604549624);
                    Object UEutaskTsxaI = composer.UEutaskTsxaI();
                    if (UEutaskTsxaI == Composer.Companion.yzPsTade5rL7D3) {
                        UEutaskTsxaI = InteractionSourceKt.yzPsTade5rL7D3();
                        composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                    }
                    mutableInteractionSource = (MutableInteractionSource) UEutaskTsxaI;
                    composer.o4ticBN7g1K8jE();
                }
                Modifier yzPsTade5rL7D3 = ClickableKt.yzPsTade5rL7D3(Modifier.Companion.oyjLVtGms9eZwJ0, mutableInteractionSource, indication, true, null, this.b41X89IqSbKt);
                composer.o4ticBN7g1K8jE();
                return yzPsTade5rL7D3;
            default:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                Constraints constraints = (Constraints) obj3;
                float f = ((Dp) this.b41X89IqSbKt.hRNgd2zGCE5kj()).oyjLVtGms9eZwJ0;
                Placeable kSPEzfraxudm4i = measurable.kSPEzfraxudm4i(Constraints.hRNgd2zGCE5kj(constraints.yzPsTade5rL7D3, 0, 0, ConstraintsKt.gmXBnHsR2YSm(!Dp.hRNgd2zGCE5kj(f, Float.NaN) ? measureScope.uMAEPvJoKWq8X(f) : 0, constraints.yzPsTade5rL7D3), 0, 11));
                return MeasureScope.OL5dzh3MEyfV(measureScope, kSPEzfraxudm4i.oyjLVtGms9eZwJ0, kSPEzfraxudm4i.b41X89IqSbKt, new tY4RqfA4k7DmtD(kSPEzfraxudm4i, 16));
        }
    }
}
