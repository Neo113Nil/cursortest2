package defpackage;

import androidx.compose.foundation.MagnifierNode;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class p3 implements Function0 {
    public final /* synthetic */ MagnifierNode b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ p3(MagnifierNode magnifierNode, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = magnifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        MagnifierNode magnifierNode = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                magnifierNode.s0();
                return Unit.yzPsTade5rL7D3;
            case 1:
                return new Offset(magnifierNode.elPM8kURv8Fp);
            default:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((SnapshotMutableStateImpl) magnifierNode.Yey4RyhSyBRHub).getOyjLVtGms9eZwJ0();
                return new Offset(layoutCoordinates != null ? layoutCoordinates.WogNAwiJP7IHm(0L) : 9205357640488583168L);
        }
    }
}
