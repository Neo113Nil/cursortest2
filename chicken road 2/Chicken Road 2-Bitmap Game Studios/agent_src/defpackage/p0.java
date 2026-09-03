package defpackage;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Function1 {
    public final /* synthetic */ LegacyTextFieldState b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ p0(LegacyTextFieldState legacyTextFieldState, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = legacyTextFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        LegacyTextFieldState legacyTextFieldState = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                TextLayoutResultProxy oyjLVtGms9eZwJ0 = legacyTextFieldState.oyjLVtGms9eZwJ0();
                if (oyjLVtGms9eZwJ0 != null) {
                    oyjLVtGms9eZwJ0.ra306ClFT3HT = layoutCoordinates;
                }
                return unit;
            case 1:
                MutableState mutableState = legacyTextFieldState.exVmIuryuB8HeQ;
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                String str = textFieldValue.yzPsTade5rL7D3.b41X89IqSbKt;
                AnnotatedString annotatedString = legacyTextFieldState.UEutaskTsxaI;
                if (!Intrinsics.yzPsTade5rL7D3(str, annotatedString != null ? annotatedString.b41X89IqSbKt : null)) {
                    ((SnapshotMutableStateImpl) legacyTextFieldState.MRfxZSx8l5UG62U).setValue(HandleState.oyjLVtGms9eZwJ0);
                    if (((Boolean) ((SnapshotMutableStateImpl) mutableState).getOyjLVtGms9eZwJ0()).booleanValue()) {
                        ((SnapshotMutableStateImpl) mutableState).setValue(Boolean.FALSE);
                    } else {
                        ((SnapshotMutableStateImpl) legacyTextFieldState.FTJ2XS7ULgY8).setValue(Boolean.FALSE);
                    }
                }
                long j = TextRange.hRNgd2zGCE5kj;
                legacyTextFieldState.gmXBnHsR2YSm(j);
                legacyTextFieldState.b41X89IqSbKt(j);
                legacyTextFieldState.AGl7HBCQ8xrHABq.uypNJrpDByoB(textFieldValue);
                legacyTextFieldState.hRNgd2zGCE5kj.invalidate();
                return unit;
            case 2:
                legacyTextFieldState.MCcLy95b8Awzmw.hRNgd2zGCE5kj(((ImeAction) obj).yzPsTade5rL7D3);
                return unit;
            case 3:
                return Boolean.valueOf(legacyTextFieldState.MCcLy95b8Awzmw.hRNgd2zGCE5kj(((ImeAction) obj).yzPsTade5rL7D3));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((SnapshotMutableStateImpl) legacyTextFieldState.o2t7oodqU1bUMaS).setValue(bool);
                return unit;
        }
    }
}
