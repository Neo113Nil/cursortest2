package defpackage;

import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Function2 {
    public final /* synthetic */ TextFieldSelectionManager b41X89IqSbKt;
    public final /* synthetic */ ComposableLambdaImpl gmXBnHsR2YSm;
    public final /* synthetic */ int i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ u(TextFieldSelectionManager textFieldSelectionManager, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.b41X89IqSbKt = textFieldSelectionManager;
        this.gmXBnHsR2YSm = composableLambdaImpl;
        this.i7xAcZoXXiIt = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.i7xAcZoXXiIt;
        ComposableLambdaImpl composableLambdaImpl = this.gmXBnHsR2YSm;
        TextFieldSelectionManager textFieldSelectionManager = this.b41X89IqSbKt;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CommonContextMenuAreaKt.yzPsTade5rL7D3(textFieldSelectionManager, composableLambdaImpl, composer, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            default:
                ContextMenu_androidKt.yzPsTade5rL7D3(textFieldSelectionManager, composableLambdaImpl, composer, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
        }
        return unit;
    }
}
