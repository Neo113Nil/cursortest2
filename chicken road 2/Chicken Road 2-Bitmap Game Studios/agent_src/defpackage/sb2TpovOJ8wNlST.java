package defpackage;

import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class sb2TpovOJ8wNlST implements Function1 {
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ boolean b41X89IqSbKt;
    public final /* synthetic */ Function0 gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    public /* synthetic */ sb2TpovOJ8wNlST(Function0 function0, boolean z, ImageBitmap imageBitmap, BlendModeColorFilter blendModeColorFilter) {
        this.gmXBnHsR2YSm = function0;
        this.b41X89IqSbKt = z;
        this.i7xAcZoXXiIt = imageBitmap;
        this.Uo5pffGf8LUU = blendModeColorFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Object obj2 = this.Uo5pffGf8LUU;
        Object obj3 = this.i7xAcZoXXiIt;
        switch (i) {
            case 0:
                ImageBitmap imageBitmap = (ImageBitmap) obj3;
                BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj2;
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                contentDrawScope.N();
                if (((Boolean) this.gmXBnHsR2YSm.hRNgd2zGCE5kj()).booleanValue()) {
                    if (this.b41X89IqSbKt) {
                        long a2 = contentDrawScope.a();
                        CanvasDrawScope$drawContext$1 b41X89IqSbKt = contentDrawScope.getB41X89IqSbKt();
                        long oyjLVtGms9eZwJ0 = b41X89IqSbKt.oyjLVtGms9eZwJ0();
                        b41X89IqSbKt.yzPsTade5rL7D3().yRx9jbDCTnXb3();
                        try {
                            b41X89IqSbKt.yzPsTade5rL7D3.b41X89IqSbKt(-1.0f, 1.0f, a2);
                            DrawScope.Tq1wTdNjhzJEqe(contentDrawScope, imageBitmap, 0L, 0.0f, blendModeColorFilter, 0, 46);
                        } finally {
                            OcGJUxcOVecQiKb.pu0JZhzR2Or6(b41X89IqSbKt, oyjLVtGms9eZwJ0);
                        }
                    } else {
                        DrawScope.Tq1wTdNjhzJEqe(contentDrawScope, imageBitmap, 0L, 0.0f, blendModeColorFilter, 0, 46);
                    }
                }
                return Unit.yzPsTade5rL7D3;
            default:
                SheetValue sheetValue = (SheetValue) obj;
                return new SheetState(this.b41X89IqSbKt, this.gmXBnHsR2YSm, (Function0) obj3, sheetValue, (Function1) obj2);
        }
    }

    public /* synthetic */ sb2TpovOJ8wNlST(boolean z, Function0 function0, Function0 function02, Function1 function1) {
        this.b41X89IqSbKt = z;
        this.gmXBnHsR2YSm = function0;
        this.i7xAcZoXXiIt = function02;
        this.Uo5pffGf8LUU = function1;
    }
}
