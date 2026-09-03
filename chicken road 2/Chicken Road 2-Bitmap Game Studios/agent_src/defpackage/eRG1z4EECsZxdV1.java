package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class eRG1z4EECsZxdV1 implements Function2 {
    public final /* synthetic */ Modifier b41X89IqSbKt;
    public final /* synthetic */ ComposableLambdaImpl gmXBnHsR2YSm;
    public final /* synthetic */ int i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ eRG1z4EECsZxdV1(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.b41X89IqSbKt = modifier;
        this.gmXBnHsR2YSm = composableLambdaImpl;
        this.i7xAcZoXXiIt = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.i7xAcZoXXiIt;
        ComposableLambdaImpl composableLambdaImpl = this.gmXBnHsR2YSm;
        Modifier modifier = this.b41X89IqSbKt;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AndroidTextContextMenuToolbarProvider_androidKt.yzPsTade5rL7D3(modifier, composableLambdaImpl, composer, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            case 1:
                AndroidTextContextMenuToolbarProvider_androidKt.hRNgd2zGCE5kj(modifier, composableLambdaImpl, composer, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            case 2:
                DefaultTextContextMenuDropdownProvider_androidKt.oyjLVtGms9eZwJ0(modifier, composableLambdaImpl, composer, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            case 3:
                PlatformDefaultTextContextMenuProviders_androidKt.hRNgd2zGCE5kj(modifier, composableLambdaImpl, composer, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            default:
                PlatformDefaultTextContextMenuProviders_androidKt.yzPsTade5rL7D3(modifier, composableLambdaImpl, composer, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
        }
        return unit;
    }
}
