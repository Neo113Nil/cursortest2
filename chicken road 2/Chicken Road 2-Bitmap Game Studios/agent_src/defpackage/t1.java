package defpackage;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.automirrored.filled.SortKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.MathHelpersKt;
import com.door.brass.knob.ui.menu.MenuUiState;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements Function3 {
    public final /* synthetic */ State b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ t1(State state, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object MRfxZSx8l5UG62U(Object obj, Object obj2, Object obj3) {
        Map map;
        int i = this.oyjLVtGms9eZwJ0;
        State state = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                Constraints constraints = (Constraints) obj3;
                int ra306ClFT3HT = MathHelpersKt.ra306ClFT3HT(((Number) state.getOyjLVtGms9eZwJ0()).floatValue(), measureScope.uMAEPvJoKWq8X(0.0f), measurable.zBlwxQG5AB2UBQ(Constraints.Uo5pffGf8LUU(constraints.yzPsTade5rL7D3)));
                Placeable kSPEzfraxudm4i = measurable.kSPEzfraxudm4i(constraints.yzPsTade5rL7D3);
                int i2 = kSPEzfraxudm4i.b41X89IqSbKt;
                tY4RqfA4k7DmtD ty4rqfa4k7dmtd = new tY4RqfA4k7DmtD(kSPEzfraxudm4i, 5);
                map = EmptyMap.oyjLVtGms9eZwJ0;
                return measureScope.Ae8HxJ6tiidOhX(ra306ClFT3HT, i2, map, ty4rqfa4k7dmtd);
            default:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 17) != 16)) {
                    ImageVector imageVector = SortKt.yzPsTade5rL7D3;
                    if (imageVector == null) {
                        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.Sort", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i3 = VectorKt.yzPsTade5rL7D3;
                        SolidColor solidColor = new SolidColor(Color.hRNgd2zGCE5kj);
                        PathBuilder pathBuilder = new PathBuilder();
                        pathBuilder.Uo5pffGf8LUU(3.0f, 18.0f);
                        pathBuilder.b41X89IqSbKt(6.0f);
                        pathBuilder.MRfxZSx8l5UG62U(-2.0f);
                        pathBuilder.gmXBnHsR2YSm(3.0f, 16.0f);
                        pathBuilder.MRfxZSx8l5UG62U(2.0f);
                        pathBuilder.yzPsTade5rL7D3();
                        pathBuilder.Uo5pffGf8LUU(3.0f, 6.0f);
                        pathBuilder.MRfxZSx8l5UG62U(2.0f);
                        pathBuilder.b41X89IqSbKt(18.0f);
                        pathBuilder.gmXBnHsR2YSm(21.0f, 6.0f);
                        pathBuilder.gmXBnHsR2YSm(3.0f, 6.0f);
                        pathBuilder.yzPsTade5rL7D3();
                        pathBuilder.Uo5pffGf8LUU(3.0f, 13.0f);
                        pathBuilder.b41X89IqSbKt(12.0f);
                        pathBuilder.MRfxZSx8l5UG62U(-2.0f);
                        pathBuilder.gmXBnHsR2YSm(3.0f, 11.0f);
                        pathBuilder.MRfxZSx8l5UG62U(2.0f);
                        pathBuilder.yzPsTade5rL7D3();
                        builder.hRNgd2zGCE5kj(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, solidColor, null, "", pathBuilder.yzPsTade5rL7D3);
                        imageVector = builder.oyjLVtGms9eZwJ0();
                        SortKt.yzPsTade5rL7D3 = imageVector;
                    }
                    ImageVector imageVector2 = imageVector;
                    Modifier.Companion companion = Modifier.Companion.oyjLVtGms9eZwJ0;
                    IconKt.hRNgd2zGCE5kj(imageVector2, null, SizeKt.NIabVTHf6LMJyXq(companion, 20.0f), 0L, composer, 432, 8);
                    SpacerKt.yzPsTade5rL7D3(composer, SizeKt.NIabVTHf6LMJyXq(companion, 6.0f));
                    TextKt.hRNgd2zGCE5kj(((MenuUiState) state.getOyjLVtGms9eZwJ0()).b41X89IqSbKt, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, composer, 0, 0, 262142);
                } else {
                    composer.gmXBnHsR2YSm();
                }
                return Unit.yzPsTade5rL7D3;
        }
    }
}
