package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class EURemBBPR88w6 implements Function2 {
    public final /* synthetic */ Object AGl7HBCQ8xrHABq;
    public final /* synthetic */ int FTJ2XS7ULgY8;
    public final /* synthetic */ Function1 FsuUJlzzWhYnMlD;
    public final /* synthetic */ boolean GiTAvmtrM6Bh8SJ;
    public final /* synthetic */ int MCcLy95b8Awzmw;
    public final /* synthetic */ boolean MRfxZSx8l5UG62U;
    public final /* synthetic */ boolean NIabVTHf6LMJyXq;
    public final /* synthetic */ MutableInteractionSource UEutaskTsxaI;
    public final /* synthetic */ VisualTransformation Uo5pffGf8LUU;
    public final /* synthetic */ Function1 b41X89IqSbKt;
    public final /* synthetic */ Object exVmIuryuB8HeQ;
    public final /* synthetic */ Modifier gmXBnHsR2YSm;
    public final /* synthetic */ TextStyle i7xAcZoXXiIt;
    public final /* synthetic */ int kSPEzfraxudm4i;
    public final /* synthetic */ ComposableLambdaImpl o2t7oodqU1bUMaS;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;
    public final /* synthetic */ Object pu0JZhzR2Or6;
    public final /* synthetic */ int uypNJrpDByoB;
    public final /* synthetic */ KeyboardActions yRx9jbDCTnXb3;

    public /* synthetic */ EURemBBPR88w6(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i, int i2, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, ComposableLambdaImpl composableLambdaImpl, int i3, int i4) {
        this.exVmIuryuB8HeQ = textFieldValue;
        this.b41X89IqSbKt = function1;
        this.gmXBnHsR2YSm = modifier;
        this.i7xAcZoXXiIt = textStyle;
        this.Uo5pffGf8LUU = visualTransformation;
        this.FsuUJlzzWhYnMlD = function12;
        this.UEutaskTsxaI = mutableInteractionSource;
        this.AGl7HBCQ8xrHABq = brush;
        this.MRfxZSx8l5UG62U = z;
        this.kSPEzfraxudm4i = i;
        this.uypNJrpDByoB = i2;
        this.pu0JZhzR2Or6 = imeOptions;
        this.yRx9jbDCTnXb3 = keyboardActions;
        this.NIabVTHf6LMJyXq = z2;
        this.GiTAvmtrM6Bh8SJ = z3;
        this.o2t7oodqU1bUMaS = composableLambdaImpl;
        this.MCcLy95b8Awzmw = i3;
        this.FTJ2XS7ULgY8 = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.MCcLy95b8Awzmw;
        Object obj3 = this.pu0JZhzR2Or6;
        Object obj4 = this.AGl7HBCQ8xrHABq;
        Object obj5 = this.exVmIuryuB8HeQ;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                BasicTextFieldKt.hRNgd2zGCE5kj((String) obj5, this.b41X89IqSbKt, this.gmXBnHsR2YSm, this.MRfxZSx8l5UG62U, this.NIabVTHf6LMJyXq, this.i7xAcZoXXiIt, (KeyboardOptions) obj4, this.yRx9jbDCTnXb3, this.GiTAvmtrM6Bh8SJ, this.kSPEzfraxudm4i, this.uypNJrpDByoB, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, (SolidColor) obj3, this.o2t7oodqU1bUMaS, (Composer) obj, yzPsTade5rL7D3, this.FTJ2XS7ULgY8);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                int yzPsTade5rL7D33 = RecomposeScopeImplKt.yzPsTade5rL7D3(this.FTJ2XS7ULgY8);
                CoreTextFieldKt.yzPsTade5rL7D3((TextFieldValue) obj5, this.b41X89IqSbKt, this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, (Brush) obj4, this.MRfxZSx8l5UG62U, this.kSPEzfraxudm4i, this.uypNJrpDByoB, (ImeOptions) obj3, this.yRx9jbDCTnXb3, this.NIabVTHf6LMJyXq, this.GiTAvmtrM6Bh8SJ, this.o2t7oodqU1bUMaS, (Composer) obj, yzPsTade5rL7D32, yzPsTade5rL7D33);
                break;
        }
        return unit;
    }

    public /* synthetic */ EURemBBPR88w6(String str, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, SolidColor solidColor, ComposableLambdaImpl composableLambdaImpl, int i3, int i4) {
        this.exVmIuryuB8HeQ = str;
        this.b41X89IqSbKt = function1;
        this.gmXBnHsR2YSm = modifier;
        this.MRfxZSx8l5UG62U = z;
        this.NIabVTHf6LMJyXq = z2;
        this.i7xAcZoXXiIt = textStyle;
        this.AGl7HBCQ8xrHABq = keyboardOptions;
        this.yRx9jbDCTnXb3 = keyboardActions;
        this.GiTAvmtrM6Bh8SJ = z3;
        this.kSPEzfraxudm4i = i;
        this.uypNJrpDByoB = i2;
        this.Uo5pffGf8LUU = visualTransformation;
        this.FsuUJlzzWhYnMlD = function12;
        this.UEutaskTsxaI = mutableInteractionSource;
        this.pu0JZhzR2Or6 = solidColor;
        this.o2t7oodqU1bUMaS = composableLambdaImpl;
        this.MCcLy95b8Awzmw = i3;
        this.FTJ2XS7ULgY8 = i4;
    }
}
