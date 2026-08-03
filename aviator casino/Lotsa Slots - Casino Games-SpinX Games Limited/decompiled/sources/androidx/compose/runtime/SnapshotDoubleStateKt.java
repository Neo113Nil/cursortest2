package androidx.compose.runtime;

/* compiled from: SnapshotDoubleState.kt */
@kotlin.Metadata(d1 = {"androidx/compose/runtime/SnapshotDoubleStateKt__SnapshotDoubleStateKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotDoubleStateKt {
    public static final double getValue(androidx.compose.runtime.DoubleState doubleState, java.lang.Object obj, kotlin.reflect.KProperty<?> kProperty) {
        return androidx.compose.runtime.SnapshotDoubleStateKt__SnapshotDoubleStateKt.getValue(doubleState, obj, kProperty);
    }

    public static final androidx.compose.runtime.MutableDoubleState mutableDoubleStateOf(double d) {
        return androidx.compose.runtime.SnapshotDoubleStateKt__SnapshotDoubleStateKt.mutableDoubleStateOf(d);
    }

    public static final void setValue(androidx.compose.runtime.MutableDoubleState mutableDoubleState, java.lang.Object obj, kotlin.reflect.KProperty<?> kProperty, double d) {
        androidx.compose.runtime.SnapshotDoubleStateKt__SnapshotDoubleStateKt.setValue(mutableDoubleState, obj, kProperty, d);
    }
}
