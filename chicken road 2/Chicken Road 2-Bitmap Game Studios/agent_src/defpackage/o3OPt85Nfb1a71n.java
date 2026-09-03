package defpackage;

import android.view.View;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.Typography;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class o3OPt85Nfb1a71n implements Function2 {
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ o3OPt85Nfb1a71n(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i, Object obj2, int i2) {
        this.oyjLVtGms9eZwJ0 = 8;
        this.i7xAcZoXXiIt = lazyLayoutItemProvider;
        this.Uo5pffGf8LUU = obj;
        this.gmXBnHsR2YSm = i;
        this.b41X89IqSbKt = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        int i2 = this.gmXBnHsR2YSm;
        Object obj3 = this.b41X89IqSbKt;
        Object obj4 = this.Uo5pffGf8LUU;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj5 = this.i7xAcZoXXiIt;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AndroidSelectionHandles_androidKt.yzPsTade5rL7D3((OffsetProvider) obj5, (Alignment) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                BasicTextContextMenuProviderKt.yzPsTade5rL7D3((Modifier) obj5, (ProvidableCompositionLocal) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                BasicTooltipKt.ra306ClFT3HT((TooltipState) obj5, (MutableState) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((ComposableLambdaImpl) obj3).Uo5pffGf8LUU(obj5, obj4, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2) | 1);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ContextMenuUiKt.hRNgd2zGCE5kj((Modifier) obj5, (ContextMenuColors) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1), this.gmXBnHsR2YSm);
                break;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                ((Integer) obj2).getClass();
                ContextMenuUiKt.yzPsTade5rL7D3((ContextMenuColors) obj5, (Modifier) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                ((Integer) obj2).intValue();
                DefaultTextContextMenuDropdownProvider_androidKt.ra306ClFT3HT((TextContextMenuSession) obj5, (TextContextMenuDataProvider) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                ExposedDropdownMenu_androidKt.hRNgd2zGCE5kj((View) obj5, (Density) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(1);
                LazyLayoutItemContentFactoryKt.yzPsTade5rL7D3((LazyLayoutItemProvider) obj5, this.Uo5pffGf8LUU, this.gmXBnHsR2YSm, this.b41X89IqSbKt, (Composer) obj, yzPsTade5rL7D3);
                break;
            case 9:
                ((Integer) obj2).intValue();
                LifecycleEffectKt.ra306ClFT3HT((LifecycleOwner) obj5, (LifecycleStartStopEffectScope) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                MaterialThemeKt.hRNgd2zGCE5kj((ColorScheme) obj5, (Shapes) obj4, (Typography) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
        }
        return unit;
    }

    public /* synthetic */ o3OPt85Nfb1a71n(TooltipState tooltipState, MutableState mutableState, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.oyjLVtGms9eZwJ0 = 2;
        this.i7xAcZoXXiIt = tooltipState;
        this.Uo5pffGf8LUU = mutableState;
        this.b41X89IqSbKt = composableLambdaImpl;
        this.gmXBnHsR2YSm = i;
    }

    public /* synthetic */ o3OPt85Nfb1a71n(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, int i) {
        this.oyjLVtGms9eZwJ0 = 3;
        this.b41X89IqSbKt = composableLambdaImpl;
        this.i7xAcZoXXiIt = obj;
        this.Uo5pffGf8LUU = obj2;
        this.gmXBnHsR2YSm = i;
    }

    public /* synthetic */ o3OPt85Nfb1a71n(Modifier modifier, ContextMenuColors contextMenuColors, Function1 function1, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = 4;
        this.i7xAcZoXXiIt = modifier;
        this.Uo5pffGf8LUU = contextMenuColors;
        this.b41X89IqSbKt = function1;
        this.gmXBnHsR2YSm = i2;
    }

    public /* synthetic */ o3OPt85Nfb1a71n(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.i7xAcZoXXiIt = obj;
        this.Uo5pffGf8LUU = obj2;
        this.b41X89IqSbKt = obj3;
        this.gmXBnHsR2YSm = i;
    }
}
