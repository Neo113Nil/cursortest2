package defpackage;

import androidx.compose.material3.ExposedDropdownMenuAnchorType;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements Function0 {
    public final /* synthetic */ Function1 b41X89IqSbKt;
    public final /* synthetic */ boolean gmXBnHsR2YSm;
    public final /* synthetic */ MutableState oyjLVtGms9eZwJ0;

    public /* synthetic */ r1(MutableState mutableState, Function1 function1, boolean z) {
        this.oyjLVtGms9eZwJ0 = mutableState;
        this.b41X89IqSbKt = function1;
        this.gmXBnHsR2YSm = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        this.oyjLVtGms9eZwJ0.setValue(new ExposedDropdownMenuAnchorType());
        this.b41X89IqSbKt.uypNJrpDByoB(Boolean.valueOf(!this.gmXBnHsR2YSm));
        return Unit.yzPsTade5rL7D3;
    }
}
