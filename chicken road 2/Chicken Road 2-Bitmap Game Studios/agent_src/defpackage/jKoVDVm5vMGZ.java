package defpackage;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class jKoVDVm5vMGZ implements Function1 {
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ long b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Serializable i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;

    public /* synthetic */ jKoVDVm5vMGZ(long j, float[] fArr, Ref.IntRef intRef, Ref.FloatRef floatRef) {
        this.b41X89IqSbKt = j;
        this.gmXBnHsR2YSm = fArr;
        this.i7xAcZoXXiIt = intRef;
        this.Uo5pffGf8LUU = floatRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj2 = this.Uo5pffGf8LUU;
        Serializable serializable = this.i7xAcZoXXiIt;
        Object obj3 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj3;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) serializable;
                long j = this.b41X89IqSbKt;
                ColorFilter colorFilter = (ColorFilter) obj2;
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                contentDrawScope.N();
                float f = rect.yzPsTade5rL7D3;
                float f2 = rect.hRNgd2zGCE5kj;
                contentDrawScope.getB41X89IqSbKt().yzPsTade5rL7D3.gmXBnHsR2YSm(f, f2);
                try {
                    DrawScope.yDnubW8GLBhc(contentDrawScope, (ImageBitmap) objectRef.oyjLVtGms9eZwJ0, 0L, j, 0L, 0L, 0.0f, null, colorFilter, 0, 0, 890);
                    return unit;
                } finally {
                    contentDrawScope.getB41X89IqSbKt().yzPsTade5rL7D3.gmXBnHsR2YSm(-f, -f2);
                }
            default:
                float[] fArr = (float[]) obj3;
                Ref.IntRef intRef = (Ref.IntRef) serializable;
                Ref.FloatRef floatRef = (Ref.FloatRef) obj2;
                ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
                int i2 = paragraphInfo.hRNgd2zGCE5kj;
                AndroidParagraph androidParagraph = paragraphInfo.yzPsTade5rL7D3;
                int i3 = paragraphInfo.ra306ClFT3HT;
                long j2 = this.b41X89IqSbKt;
                int i7xAcZoXXiIt = i2 > TextRange.i7xAcZoXXiIt(j2) ? paragraphInfo.hRNgd2zGCE5kj : TextRange.i7xAcZoXXiIt(j2);
                if (i3 >= TextRange.gmXBnHsR2YSm(j2)) {
                    i3 = TextRange.gmXBnHsR2YSm(j2);
                }
                long yzPsTade5rL7D3 = TextRangeKt.yzPsTade5rL7D3(paragraphInfo.oyjLVtGms9eZwJ0(i7xAcZoXXiIt), paragraphInfo.oyjLVtGms9eZwJ0(i3));
                androidParagraph.oyjLVtGms9eZwJ0.yzPsTade5rL7D3(TextRange.i7xAcZoXXiIt(yzPsTade5rL7D3), TextRange.gmXBnHsR2YSm(yzPsTade5rL7D3), fArr, intRef.oyjLVtGms9eZwJ0);
                int b41X89IqSbKt = (TextRange.b41X89IqSbKt(yzPsTade5rL7D3) * 4) + intRef.oyjLVtGms9eZwJ0;
                for (int i4 = intRef.oyjLVtGms9eZwJ0; i4 < b41X89IqSbKt; i4 += 4) {
                    int i5 = i4 + 1;
                    float f3 = fArr[i5];
                    float f4 = floatRef.oyjLVtGms9eZwJ0;
                    fArr[i5] = f3 + f4;
                    int i6 = i4 + 3;
                    fArr[i6] = fArr[i6] + f4;
                }
                intRef.oyjLVtGms9eZwJ0 = b41X89IqSbKt;
                floatRef.oyjLVtGms9eZwJ0 = androidParagraph.ra306ClFT3HT() + floatRef.oyjLVtGms9eZwJ0;
                return unit;
        }
    }

    public /* synthetic */ jKoVDVm5vMGZ(Rect rect, Ref.ObjectRef objectRef, long j, BlendModeColorFilter blendModeColorFilter) {
        this.gmXBnHsR2YSm = rect;
        this.i7xAcZoXXiIt = objectRef;
        this.b41X89IqSbKt = j;
        this.Uo5pffGf8LUU = blendModeColorFilter;
    }
}
