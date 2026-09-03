package defpackage;

import androidx.compose.material3.AlertDialogKt;
import androidx.compose.material3.TimePickerDialogKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class exVmIuryuB8HeQ implements Function2 {
    public final /* synthetic */ Modifier b41X89IqSbKt;
    public final /* synthetic */ long gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    public /* synthetic */ exVmIuryuB8HeQ(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, long j, int i) {
        this.i7xAcZoXXiIt = composableLambdaImpl;
        this.b41X89IqSbKt = modifier;
        this.gmXBnHsR2YSm = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj3 = this.i7xAcZoXXiIt;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(7);
                AlertDialogKt.yzPsTade5rL7D3((ComposableLambdaImpl) obj3, this.b41X89IqSbKt, this.gmXBnHsR2YSm, (Composer) obj, yzPsTade5rL7D3);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(1);
                TimePickerDialogKt.hRNgd2zGCE5kj(this.b41X89IqSbKt, (Shape) obj3, this.gmXBnHsR2YSm, (Composer) obj, yzPsTade5rL7D32);
                break;
        }
        return unit;
    }

    public /* synthetic */ exVmIuryuB8HeQ(Modifier modifier, Shape shape, long j, int i) {
        this.b41X89IqSbKt = modifier;
        this.i7xAcZoXXiIt = shape;
        this.gmXBnHsR2YSm = j;
    }
}
