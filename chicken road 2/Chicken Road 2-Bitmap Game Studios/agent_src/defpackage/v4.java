package defpackage;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class v4 implements Function2 {
    public final /* synthetic */ TextFieldColors FsuUJlzzWhYnMlD;
    public final /* synthetic */ float MRfxZSx8l5UG62U;
    public final /* synthetic */ Object NIabVTHf6LMJyXq;
    public final /* synthetic */ Shape UEutaskTsxaI;
    public final /* synthetic */ Modifier Uo5pffGf8LUU;
    public final /* synthetic */ boolean b41X89IqSbKt;
    public final /* synthetic */ boolean gmXBnHsR2YSm;
    public final /* synthetic */ InteractionSource i7xAcZoXXiIt;
    public final /* synthetic */ float kSPEzfraxudm4i;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;
    public final /* synthetic */ int uypNJrpDByoB;
    public final /* synthetic */ int yRx9jbDCTnXb3;

    public /* synthetic */ v4(Object obj, boolean z, boolean z2, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, int i2, int i3) {
        this.oyjLVtGms9eZwJ0 = i3;
        this.NIabVTHf6LMJyXq = obj;
        this.b41X89IqSbKt = z;
        this.gmXBnHsR2YSm = z2;
        this.i7xAcZoXXiIt = interactionSource;
        this.Uo5pffGf8LUU = modifier;
        this.FsuUJlzzWhYnMlD = textFieldColors;
        this.UEutaskTsxaI = shape;
        this.MRfxZSx8l5UG62U = f;
        this.kSPEzfraxudm4i = f2;
        this.uypNJrpDByoB = i;
        this.yRx9jbDCTnXb3 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.uypNJrpDByoB;
        Object obj3 = this.NIabVTHf6LMJyXq;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                ((OutlinedTextFieldDefaults) obj3).yzPsTade5rL7D3(this.b41X89IqSbKt, this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, this.MRfxZSx8l5UG62U, this.kSPEzfraxudm4i, (Composer) obj, yzPsTade5rL7D3, this.yRx9jbDCTnXb3);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                ((TextFieldDefaults) obj3).yzPsTade5rL7D3(this.b41X89IqSbKt, this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, this.MRfxZSx8l5UG62U, this.kSPEzfraxudm4i, (Composer) obj, yzPsTade5rL7D32, this.yRx9jbDCTnXb3);
                break;
        }
        return unit;
    }
}
