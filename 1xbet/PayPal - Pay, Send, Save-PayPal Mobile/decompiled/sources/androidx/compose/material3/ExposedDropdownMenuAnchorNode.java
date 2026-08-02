package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuAnchorNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function0;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "onAttach", "()V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ExposedDropdownMenuAnchorNode extends androidx.compose.ui.Modifier.Node {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    public ExposedDropdownMenuAnchorNode(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoFpsRangesFor = function0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        this.getHighSpeedVideoFpsRangesFor.invoke();
    }
}
