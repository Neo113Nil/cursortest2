package defpackage;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.DpSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class fZcu2pOOfz9l implements Function2 {
    public final /* synthetic */ long b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    public /* synthetic */ fZcu2pOOfz9l(long j, Modifier modifier) {
        this.b41X89IqSbKt = j;
        this.gmXBnHsR2YSm = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj3 = this.gmXBnHsR2YSm;
        long j = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                float f = AndroidCursorHandle_androidKt.yzPsTade5rL7D3;
                if (!composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 3) != 2)) {
                    composer.gmXBnHsR2YSm();
                } else if (j != 9205357640488583168L) {
                    composer.mFNFvFv0Eiyk(-1244013944);
                    Modifier Uo5pffGf8LUU = SizeKt.Uo5pffGf8LUU(modifier, DpSize.oyjLVtGms9eZwJ0(j), DpSize.ra306ClFT3HT(j), 0.0f, 0.0f, 12);
                    MeasurePolicy oyjLVtGms9eZwJ0 = BoxKt.oyjLVtGms9eZwJ0(Alignment.Companion.hRNgd2zGCE5kj, false);
                    int hashCode = Long.hashCode(composer.getH5JgSr7BP0b5Z());
                    PersistentCompositionLocalMap FTJ2XS7ULgY8 = composer.FTJ2XS7ULgY8();
                    Modifier oyjLVtGms9eZwJ02 = ComposedModifierKt.oyjLVtGms9eZwJ0(composer, Uo5pffGf8LUU);
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
                    AndroidCursorHandle_androidKt.hRNgd2zGCE5kj(null, composer, 0, 1);
                    composer.GDGFDp2lxiHY();
                    composer.o4ticBN7g1K8jE();
                } else {
                    composer.mFNFvFv0Eiyk(-1243644858);
                    AndroidCursorHandle_androidKt.hRNgd2zGCE5kj(modifier, composer, 0, 0);
                    composer.o4ticBN7g1K8jE();
                }
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                PullToRefreshKt.yzPsTade5rL7D3((FloatProducer) obj3, j, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
            default:
                ((Integer) obj2).getClass();
                TextFieldImplKt.ra306ClFT3HT(j, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return unit;
        }
    }

    public /* synthetic */ fZcu2pOOfz9l(long j, Function2 function2, int i) {
        this.b41X89IqSbKt = j;
        this.gmXBnHsR2YSm = function2;
    }

    public /* synthetic */ fZcu2pOOfz9l(FloatProducer floatProducer, long j, int i) {
        this.gmXBnHsR2YSm = floatProducer;
        this.b41X89IqSbKt = j;
    }
}
