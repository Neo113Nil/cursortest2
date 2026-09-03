package defpackage;

import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SheetDefaultsKt;
import androidx.compose.material3.TimePickerDialogKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements Function2 {
    public final /* synthetic */ ComposableLambdaImpl b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ v1(ComposableLambdaImpl composableLambdaImpl) {
        this.oyjLVtGms9eZwJ0 = 0;
        this.b41X89IqSbKt = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        ComposableLambdaImpl composableLambdaImpl = this.b41X89IqSbKt;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if (!composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 3) != 2)) {
                    composer.gmXBnHsR2YSm();
                    break;
                } else {
                    composableLambdaImpl.MRfxZSx8l5UG62U(FlowRowScopeInstance.yzPsTade5rL7D3, composer, 6);
                    break;
                }
            case 1:
                num.getClass();
                LazySaveableStateHolderKt.yzPsTade5rL7D3(RecomposeScopeImplKt.yzPsTade5rL7D3(7), composer, composableLambdaImpl);
                break;
            case 2:
                num.getClass();
                SearchBarKt.yzPsTade5rL7D3(RecomposeScopeImplKt.yzPsTade5rL7D3(49), composer, composableLambdaImpl);
                break;
            case 3:
                num.getClass();
                SheetDefaultsKt.yzPsTade5rL7D3(RecomposeScopeImplKt.yzPsTade5rL7D3(55), composer, composableLambdaImpl);
                break;
            default:
                num.getClass();
                TimePickerDialogKt.yzPsTade5rL7D3(RecomposeScopeImplKt.yzPsTade5rL7D3(49), composer, composableLambdaImpl);
                break;
        }
        return unit;
    }

    public /* synthetic */ v1(ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.b41X89IqSbKt = composableLambdaImpl;
    }
}
