package defpackage;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements Function1 {
    public final /* synthetic */ int b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;

    public /* synthetic */ u2(int i, Collection collection) {
        this.b41X89IqSbKt = i;
        this.gmXBnHsR2YSm = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Object obj2 = this.gmXBnHsR2YSm;
        int i2 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                String str = (String) obj2;
                TextFieldBuffer textFieldBuffer = (TextFieldBuffer) obj;
                TextRange textRange = textFieldBuffer.Uo5pffGf8LUU;
                if (textRange != null) {
                    long j = textRange.yzPsTade5rL7D3;
                    ImeEditCommand_androidKt.hRNgd2zGCE5kj(textFieldBuffer, (int) (j >> 32), (int) (j & 4294967295L), str);
                } else {
                    ImeEditCommand_androidKt.hRNgd2zGCE5kj(textFieldBuffer, TextRange.i7xAcZoXXiIt(textFieldBuffer.i7xAcZoXXiIt), TextRange.gmXBnHsR2YSm(textFieldBuffer.i7xAcZoXXiIt), str);
                }
                int ra306ClFT3HT = RangesKt.ra306ClFT3HT(i2 > 0 ? (r0 + i2) - 1 : (TextRange.i7xAcZoXXiIt(textFieldBuffer.i7xAcZoXXiIt) + i2) - str.length(), 0, textFieldBuffer.b41X89IqSbKt.length());
                textFieldBuffer.b41X89IqSbKt(TextRangeKt.yzPsTade5rL7D3(ra306ClFT3HT, ra306ClFT3HT));
                return Unit.yzPsTade5rL7D3;
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ u2(String str, int i) {
        this.gmXBnHsR2YSm = str;
        this.b41X89IqSbKt = i;
    }
}
