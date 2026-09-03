package defpackage;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class deguKDOsnZ2r implements Function2 {
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ Modifier b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    public /* synthetic */ deguKDOsnZ2r(Modifier modifier, MutableState mutableState, ComposableLambdaImpl composableLambdaImpl, BasicTextContextMenuProvider basicTextContextMenuProvider) {
        this.b41X89IqSbKt = modifier;
        this.gmXBnHsR2YSm = mutableState;
        this.i7xAcZoXXiIt = composableLambdaImpl;
        this.Uo5pffGf8LUU = basicTextContextMenuProvider;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj3 = this.Uo5pffGf8LUU;
        Object obj4 = this.i7xAcZoXXiIt;
        Object obj5 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj5;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                BasicTextContextMenuProvider basicTextContextMenuProvider = (BasicTextContextMenuProvider) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 3) != 2)) {
                    Object UEutaskTsxaI = composer.UEutaskTsxaI();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.yzPsTade5rL7D3;
                    if (UEutaskTsxaI == composer$Companion$Empty$1) {
                        UEutaskTsxaI = new P3UQsRX4QVEGd28(mutableState, 1);
                        composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                    }
                    Modifier yzPsTade5rL7D3 = OnGloballyPositionedModifierKt.yzPsTade5rL7D3(this.b41X89IqSbKt, (Function1) UEutaskTsxaI);
                    MeasurePolicy oyjLVtGms9eZwJ0 = BoxKt.oyjLVtGms9eZwJ0(Alignment.Companion.yzPsTade5rL7D3, true);
                    int hashCode = Long.hashCode(composer.getH5JgSr7BP0b5Z());
                    PersistentCompositionLocalMap FTJ2XS7ULgY8 = composer.FTJ2XS7ULgY8();
                    Modifier oyjLVtGms9eZwJ02 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer, yzPsTade5rL7D3);
                    ComposeUiNode.hRNgd2zGCE5kj.getClass();
                    Function0 function0 = ComposeUiNode.Companion.hRNgd2zGCE5kj;
                    if (composer.PyXrjLswZZoWpho() == null) {
                        ComposablesKt.yzPsTade5rL7D3();
                        throw null;
                    }
                    composer.tp5sG1Fy0ZCmW();
                    if (composer.getEYWI9RMqk13H5()) {
                        composer.EYWI9RMqk13H5(function0);
                    } else {
                        composer.AGl7HBCQ8xrHABq();
                    }
                    Updater.hRNgd2zGCE5kj(composer, oyjLVtGms9eZwJ0, ComposeUiNode.Companion.gmXBnHsR2YSm);
                    Updater.hRNgd2zGCE5kj(composer, FTJ2XS7ULgY8, ComposeUiNode.Companion.b41X89IqSbKt);
                    Updater.hRNgd2zGCE5kj(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.i7xAcZoXXiIt);
                    Updater.yzPsTade5rL7D3(composer, ComposeUiNode.Companion.Uo5pffGf8LUU);
                    Updater.hRNgd2zGCE5kj(composer, oyjLVtGms9eZwJ02, ComposeUiNode.Companion.oyjLVtGms9eZwJ0);
                    composableLambdaImpl.kSPEzfraxudm4i(composer, 0);
                    Object UEutaskTsxaI2 = composer.UEutaskTsxaI();
                    if (UEutaskTsxaI2 == composer$Companion$Empty$1) {
                        UEutaskTsxaI2 = new fuDJENIYBwmKgKU(mutableState, 1);
                        composer.Yey4RyhSyBRHub(UEutaskTsxaI2);
                    }
                    basicTextContextMenuProvider.hRNgd2zGCE5kj((Function0) UEutaskTsxaI2, composer, 6);
                    composer.GDGFDp2lxiHY();
                } else {
                    composer.gmXBnHsR2YSm();
                }
                return unit;
            default:
                ((Integer) obj2).getClass();
                LazyLayoutKt.yzPsTade5rL7D3((Function0) obj5, this.b41X89IqSbKt, (LazyLayoutPrefetchState) obj4, (LazyLayoutMeasurePolicy) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
        }
    }

    public /* synthetic */ deguKDOsnZ2r(Function0 function0, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutMeasurePolicy lazyLayoutMeasurePolicy, int i) {
        this.gmXBnHsR2YSm = function0;
        this.b41X89IqSbKt = modifier;
        this.i7xAcZoXXiIt = lazyLayoutPrefetchState;
        this.Uo5pffGf8LUU = lazyLayoutMeasurePolicy;
    }
}
