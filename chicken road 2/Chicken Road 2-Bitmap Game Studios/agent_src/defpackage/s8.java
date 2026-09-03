package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class s8 implements Function0 {
    public final /* synthetic */ Transition b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ s8(Transition transition, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = transition;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        Transition transition = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                return Boolean.valueOf(!Intrinsics.yzPsTade5rL7D3(((SnapshotMutableStateImpl) transition.oyjLVtGms9eZwJ0).getOyjLVtGms9eZwJ0(), transition.yzPsTade5rL7D3.yzPsTade5rL7D3()) || transition.Uo5pffGf8LUU() || ((Boolean) ((SnapshotMutableStateImpl) transition.Uo5pffGf8LUU).getOyjLVtGms9eZwJ0()).booleanValue());
            default:
                return Long.valueOf(transition.hRNgd2zGCE5kj());
        }
    }
}
