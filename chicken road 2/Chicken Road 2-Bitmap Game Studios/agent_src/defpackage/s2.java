package defpackage;

import android.graphics.Path;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.android.TextLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements Function1 {
    public final /* synthetic */ int b41X89IqSbKt;
    public final /* synthetic */ int gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ s2(int i, int i2, AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1, int i3) {
        this.oyjLVtGms9eZwJ0 = i3;
        this.b41X89IqSbKt = i;
        this.gmXBnHsR2YSm = i2;
        this.i7xAcZoXXiIt = androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.gmXBnHsR2YSm;
        int i3 = this.b41X89IqSbKt;
        Object obj2 = this.i7xAcZoXXiIt;
        switch (i) {
            case 0:
                AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 = (AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1) obj2;
                TextFieldBuffer textFieldBuffer = (TextFieldBuffer) obj;
                long yzPsTade5rL7D3 = TextRangeKt.yzPsTade5rL7D3(0, textFieldBuffer.b41X89IqSbKt.length());
                androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1.b41X89IqSbKt(yzPsTade5rL7D3);
                int i7xAcZoXXiIt = TextRange.i7xAcZoXXiIt(yzPsTade5rL7D3);
                int gmXBnHsR2YSm = TextRange.gmXBnHsR2YSm(yzPsTade5rL7D3);
                if (i3 < i7xAcZoXXiIt) {
                    i3 = i7xAcZoXXiIt;
                }
                if (i3 <= gmXBnHsR2YSm) {
                    gmXBnHsR2YSm = i3;
                }
                int i7xAcZoXXiIt2 = TextRange.i7xAcZoXXiIt(yzPsTade5rL7D3);
                int gmXBnHsR2YSm2 = TextRange.gmXBnHsR2YSm(yzPsTade5rL7D3);
                if (i2 < i7xAcZoXXiIt2) {
                    i2 = i7xAcZoXXiIt2;
                }
                if (i2 <= gmXBnHsR2YSm2) {
                    gmXBnHsR2YSm2 = i2;
                }
                long yzPsTade5rL7D32 = TextRangeKt.yzPsTade5rL7D3(gmXBnHsR2YSm, gmXBnHsR2YSm2);
                androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1.oyjLVtGms9eZwJ0(yzPsTade5rL7D32);
                textFieldBuffer.b41X89IqSbKt(yzPsTade5rL7D32);
                return unit;
            case 1:
                AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$12 = (AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1) obj2;
                TextFieldBuffer textFieldBuffer2 = (TextFieldBuffer) obj;
                if (i3 < 0 || i2 < 0) {
                    InlineClassHelperKt.yzPsTade5rL7D3("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i2 + " respectively.");
                }
                long j = textFieldBuffer2.i7xAcZoXXiIt;
                androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$12.b41X89IqSbKt(j);
                int gmXBnHsR2YSm3 = TextRange.gmXBnHsR2YSm(j);
                int i4 = gmXBnHsR2YSm3 + i2;
                if (((gmXBnHsR2YSm3 ^ i4) & (i4 ^ i2)) < 0) {
                    androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$12.ra306ClFT3HT();
                    throw null;
                }
                TextRange.gmXBnHsR2YSm(j);
                androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$12.ra306ClFT3HT();
                throw null;
            case 2:
                AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$13 = (AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1) obj2;
                TextFieldBuffer textFieldBuffer3 = (TextFieldBuffer) obj;
                TextRange textRange = textFieldBuffer3.Uo5pffGf8LUU;
                PartialGapBuffer partialGapBuffer = textFieldBuffer3.b41X89IqSbKt;
                if (textRange != null) {
                    textFieldBuffer3.oyjLVtGms9eZwJ0(null);
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                long yzPsTade5rL7D33 = TextRangeKt.yzPsTade5rL7D3(i3, i2);
                androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$13.oyjLVtGms9eZwJ0(yzPsTade5rL7D33);
                int ra306ClFT3HT = RangesKt.ra306ClFT3HT(TextRange.i7xAcZoXXiIt(yzPsTade5rL7D33), 0, partialGapBuffer.length());
                int ra306ClFT3HT2 = RangesKt.ra306ClFT3HT(TextRange.gmXBnHsR2YSm(yzPsTade5rL7D33), 0, partialGapBuffer.length());
                if (ra306ClFT3HT != ra306ClFT3HT2) {
                    if (ra306ClFT3HT < ra306ClFT3HT2) {
                        textFieldBuffer3.ra306ClFT3HT(ra306ClFT3HT, ra306ClFT3HT2, null);
                    } else {
                        textFieldBuffer3.ra306ClFT3HT(ra306ClFT3HT2, ra306ClFT3HT, null);
                    }
                }
                return unit;
            default:
                AndroidPath androidPath = (AndroidPath) obj2;
                ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
                AndroidParagraph androidParagraph = paragraphInfo.yzPsTade5rL7D3;
                int oyjLVtGms9eZwJ0 = paragraphInfo.oyjLVtGms9eZwJ0(i3);
                int oyjLVtGms9eZwJ02 = paragraphInfo.oyjLVtGms9eZwJ0(i2);
                CharSequence charSequence = androidParagraph.b41X89IqSbKt;
                if (oyjLVtGms9eZwJ0 < 0 || oyjLVtGms9eZwJ0 > oyjLVtGms9eZwJ02 || oyjLVtGms9eZwJ02 > charSequence.length()) {
                    androidx.compose.ui.text.internal.InlineClassHelperKt.yzPsTade5rL7D3("start(" + oyjLVtGms9eZwJ0 + ") or end(" + oyjLVtGms9eZwJ02 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                TextLayout textLayout = androidParagraph.oyjLVtGms9eZwJ0;
                textLayout.gmXBnHsR2YSm.getSelectionPath(oyjLVtGms9eZwJ0, oyjLVtGms9eZwJ02, path);
                int i5 = textLayout.Uo5pffGf8LUU;
                if (i5 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i5);
                }
                AndroidPath androidPath2 = new AndroidPath(path);
                float f = paragraphInfo.gmXBnHsR2YSm;
                androidPath2.yRx9jbDCTnXb3((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                androidx.compose.ui.graphics.Path.kSPEzfraxudm4i(androidPath, androidPath2);
                return unit;
        }
    }

    public /* synthetic */ s2(Object obj, int i, int i2, int i3) {
        this.oyjLVtGms9eZwJ0 = i3;
        this.i7xAcZoXXiIt = obj;
        this.b41X89IqSbKt = i;
        this.gmXBnHsR2YSm = i2;
    }
}
