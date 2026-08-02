package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\t\u001a\u00020\u0000*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\r\u001a\u00020\f*\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"", "p0", "Landroidx/compose/runtime/MutableDoubleState;", "mutableDoubleStateOf", "(D)Landroidx/compose/runtime/MutableDoubleState;", "Landroidx/compose/runtime/DoubleState;", "", "Lkotlin/reflect/KProperty;", "p1", "getValue", "(Landroidx/compose/runtime/DoubleState;Ljava/lang/Object;Lkotlin/reflect/KProperty;)D", "p2", "", "setValue", "(Landroidx/compose/runtime/MutableDoubleState;Ljava/lang/Object;Lkotlin/reflect/KProperty;D)V"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotDoubleStateKt")
/* loaded from: classes6.dex */
final /* synthetic */ class SnapshotDoubleStateKt__SnapshotDoubleStateKt {
    public static final androidx.compose.runtime.MutableDoubleState mutableDoubleStateOf(double d) {
        return androidx.compose.runtime.SnapshotDoubleState_androidKt.createSnapshotMutableDoubleState(d);
    }

    public static final double getValue(androidx.compose.runtime.DoubleState doubleState, java.lang.Object obj, kotlin.reflect.KProperty<?> kProperty) {
        return doubleState.getDoubleValue();
    }

    public static final void setValue(androidx.compose.runtime.MutableDoubleState mutableDoubleState, java.lang.Object obj, kotlin.reflect.KProperty<?> kProperty, double d) {
        mutableDoubleState.setDoubleValue(d);
    }
}
