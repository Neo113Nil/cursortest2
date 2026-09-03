package defpackage;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class qWMdVyDND2HO1 implements Function2 {
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ boolean b41X89IqSbKt;
    public final /* synthetic */ int gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    public /* synthetic */ qWMdVyDND2HO1(Modifier modifier, Function0 function0, boolean z, int i) {
        this.i7xAcZoXXiIt = modifier;
        this.Uo5pffGf8LUU = function0;
        this.b41X89IqSbKt = z;
        this.gmXBnHsR2YSm = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.gmXBnHsR2YSm;
        Object obj3 = this.Uo5pffGf8LUU;
        Object obj4 = this.i7xAcZoXXiIt;
        boolean z = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AndroidSelectionHandles_androidKt.ra306ClFT3HT((Modifier) obj4, (Function0) obj3, z, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                TextFieldSelectionManagerKt.yzPsTade5rL7D3(z, (ResolvedTextDirection) obj4, (TextFieldSelectionManager) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
        }
        return unit;
    }

    public /* synthetic */ qWMdVyDND2HO1(boolean z, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, int i) {
        this.b41X89IqSbKt = z;
        this.i7xAcZoXXiIt = resolvedTextDirection;
        this.Uo5pffGf8LUU = textFieldSelectionManager;
        this.gmXBnHsR2YSm = i;
    }
}
