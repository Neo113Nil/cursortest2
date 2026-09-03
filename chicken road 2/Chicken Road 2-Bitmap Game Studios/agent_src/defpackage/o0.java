package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.compose.internal.NavComposeUtils_androidKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CopyableThreadContextElement;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Function2 {
    public final /* synthetic */ boolean b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    public /* synthetic */ o0(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i) {
        this.gmXBnHsR2YSm = textFieldSelectionManager;
        this.b41X89IqSbKt = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj3 = this.gmXBnHsR2YSm;
        boolean z = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CoreTextFieldKt.ra306ClFT3HT((TextFieldSelectionManager) obj3, z, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            case 1:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj3;
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof CopyableThreadContextElement)) {
                    return coroutineContext.o4ticBN7g1K8jE(element);
                }
                if (((CoroutineContext) objectRef.oyjLVtGms9eZwJ0).pu0JZhzR2Or6(element.getOyjLVtGms9eZwJ0()) == null) {
                    return coroutineContext.o4ticBN7g1K8jE(z ? ((CopyableThreadContextElement) element).tp5sG1Fy0ZCmW() : (CopyableThreadContextElement) element);
                }
                objectRef.oyjLVtGms9eZwJ0 = ((CoroutineContext) objectRef.oyjLVtGms9eZwJ0).VaOWcPY5RiGR(element.getOyjLVtGms9eZwJ0());
                return coroutineContext.o4ticBN7g1K8jE(((CopyableThreadContextElement) element).yzUZju8lbdmWa());
            default:
                ((Integer) obj2).getClass();
                NavComposeUtils_androidKt.yzPsTade5rL7D3(z, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
        }
    }

    public /* synthetic */ o0(Ref.ObjectRef objectRef, boolean z) {
        this.gmXBnHsR2YSm = objectRef;
        this.b41X89IqSbKt = z;
    }

    public /* synthetic */ o0(boolean z, Function2 function2, int i) {
        this.b41X89IqSbKt = z;
        this.gmXBnHsR2YSm = function2;
    }
}
