package defpackage;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements Function1 {
    public final /* synthetic */ TextFieldSelectionManager b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ r0(TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        Rect rect;
        LegacyTextFieldState legacyTextFieldState;
        LayoutCoordinates ra306ClFT3HT;
        char c;
        long j;
        float f;
        LayoutCoordinates ra306ClFT3HT2;
        LayoutCoordinates ra306ClFT3HT3;
        LayoutCoordinates ra306ClFT3HT4;
        LayoutCoordinates ra306ClFT3HT5;
        int i = this.oyjLVtGms9eZwJ0;
        final TextFieldSelectionManager textFieldSelectionManager = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$lambda$17$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void yzPsTade5rL7D3() {
                        TextFieldSelectionManager.this.GiTAvmtrM6Bh8SJ();
                    }
                };
            case 1:
                textFieldSelectionManager.FTJ2XS7ULgY8();
                return Unit.yzPsTade5rL7D3;
            default:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.oyjLVtGms9eZwJ0;
                Rect rect2 = Rect.b41X89IqSbKt;
                if (legacyTextFieldState2 != null) {
                    if (legacyTextFieldState2.GiTAvmtrM6Bh8SJ) {
                        legacyTextFieldState2 = null;
                    }
                    if (legacyTextFieldState2 != null) {
                        OffsetMapping offsetMapping = textFieldSelectionManager.hRNgd2zGCE5kj;
                        long j2 = textFieldSelectionManager.NIabVTHf6LMJyXq().hRNgd2zGCE5kj;
                        int i2 = TextRange.ra306ClFT3HT;
                        int hRNgd2zGCE5kj = offsetMapping.hRNgd2zGCE5kj((int) (j2 >> 32));
                        int hRNgd2zGCE5kj2 = textFieldSelectionManager.hRNgd2zGCE5kj.hRNgd2zGCE5kj((int) (textFieldSelectionManager.NIabVTHf6LMJyXq().hRNgd2zGCE5kj & 4294967295L));
                        LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.oyjLVtGms9eZwJ0;
                        long j3 = 0;
                        long WogNAwiJP7IHm = (legacyTextFieldState3 == null || (ra306ClFT3HT5 = legacyTextFieldState3.ra306ClFT3HT()) == null) ? 0L : ra306ClFT3HT5.WogNAwiJP7IHm(textFieldSelectionManager.uypNJrpDByoB(true));
                        LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.oyjLVtGms9eZwJ0;
                        if (legacyTextFieldState4 != null && (ra306ClFT3HT4 = legacyTextFieldState4.ra306ClFT3HT()) != null) {
                            j3 = ra306ClFT3HT4.WogNAwiJP7IHm(textFieldSelectionManager.uypNJrpDByoB(false));
                        }
                        LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.oyjLVtGms9eZwJ0;
                        float f2 = 0.0f;
                        if (legacyTextFieldState5 == null || (ra306ClFT3HT3 = legacyTextFieldState5.ra306ClFT3HT()) == null) {
                            c = ' ';
                            j = j3;
                            f = 0.0f;
                        } else {
                            c = ' ';
                            j = j3;
                            f = Float.intBitsToFloat((int) (ra306ClFT3HT3.WogNAwiJP7IHm((Float.floatToRawIntBits(legacyTextFieldState2.oyjLVtGms9eZwJ0() != null ? r4.yzPsTade5rL7D3.ra306ClFT3HT(hRNgd2zGCE5kj).hRNgd2zGCE5kj : 0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)) & 4294967295L));
                        }
                        LegacyTextFieldState legacyTextFieldState6 = textFieldSelectionManager.oyjLVtGms9eZwJ0;
                        if (legacyTextFieldState6 != null && (ra306ClFT3HT2 = legacyTextFieldState6.ra306ClFT3HT()) != null) {
                            f2 = Float.intBitsToFloat((int) (ra306ClFT3HT2.WogNAwiJP7IHm((Float.floatToRawIntBits(0.0f) << c) | (Float.floatToRawIntBits(legacyTextFieldState2.oyjLVtGms9eZwJ0() != null ? r7.yzPsTade5rL7D3.ra306ClFT3HT(hRNgd2zGCE5kj2).hRNgd2zGCE5kj : 0.0f) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (WogNAwiJP7IHm >> c);
                        int i4 = (int) (j >> c);
                        rect = new Rect(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(f, f2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (legacyTextFieldState2.yzPsTade5rL7D3.i7xAcZoXXiIt.getB41X89IqSbKt() * 25.0f) + Math.max(Float.intBitsToFloat((int) (WogNAwiJP7IHm & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
                        legacyTextFieldState = textFieldSelectionManager.oyjLVtGms9eZwJ0;
                        if (legacyTextFieldState != null || (ra306ClFT3HT = legacyTextFieldState.ra306ClFT3HT()) == null) {
                            return null;
                        }
                        if (ra306ClFT3HT.FsuUJlzzWhYnMlD() && layoutCoordinates.FsuUJlzzWhYnMlD()) {
                            rect2 = RectKt.yzPsTade5rL7D3(layoutCoordinates.vAthhQhzH5WQr3(LayoutCoordinatesKt.ra306ClFT3HT(ra306ClFT3HT), rect.b41X89IqSbKt()), rect.oyjLVtGms9eZwJ0());
                        }
                        return rect2;
                    }
                }
                rect = rect2;
                legacyTextFieldState = textFieldSelectionManager.oyjLVtGms9eZwJ0;
                if (legacyTextFieldState != null) {
                }
                return null;
        }
    }
}
