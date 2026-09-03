package defpackage;

import androidx.compose.material3.SnackbarData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class x6 implements Function0 {
    public final /* synthetic */ SnackbarData b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ x6(SnackbarData snackbarData, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = snackbarData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        SnackbarData snackbarData = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                snackbarData.hRNgd2zGCE5kj();
                break;
            default:
                snackbarData.dismiss();
                break;
        }
        return unit;
    }
}
