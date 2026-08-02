package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\u00058\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R$\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R$\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016"}, d2 = {"Landroidx/compose/material3/TimePickerStateImpl;", "Landroidx/compose/material3/TimePickerState;", "", "p0", "p1", "", "p2", "<init>", "(IIZ)V", "getHighSpeedVideoFpsRangesFor", "Z", "is24hour", "()Z", "set24hour", "(Z)V", "getHighSpeedVideoSizes", "Landroidx/compose/material3/TimePickerSelectionMode;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableState;", "getSelection-yecRtBI", "()I", "setSelection-6_8s6DQ", "(I)V", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/runtime/MutableIntState;", "getHighResolutionOutputSizeshNQ4ISI", "getMinute", "setMinute", "Camera2StreamConfigurationMap", "getHour", "setHour", "getOutputMinFrameDuration", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TimePickerStateImpl implements androidx.compose.material3.TimePickerState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.TimePickerStateImpl.Companion INSTANCE = new androidx.compose.material3.TimePickerStateImpl.Companion(null);
    private final androidx.compose.runtime.MutableIntState getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.runtime.MutableState getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState getHighSpeedVideoFpsRangesFor;

    public TimePickerStateImpl(int i, int i2, boolean z) {
        if (i < 0 || i >= 24) {
            throw new java.lang.IllegalArgumentException("initialHour should in [0..23] range".toString());
        }
        if (i2 < 0 || i2 >= 60) {
            throw new java.lang.IllegalArgumentException("initialMinute should be in [0..59] range".toString());
        }
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.material3.TimePickerSelectionMode.m4052boximpl(androidx.compose.material3.TimePickerSelectionMode.INSTANCE.m4058getHouryecRtBI()), null, 2, null);
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: is24hour, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void set24hour(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: getSelection-yecRtBI */
    public final int mo2876getSelectionyecRtBI() {
        return ((androidx.compose.material3.TimePickerSelectionMode) this.getHighSpeedVideoFpsRanges.getValue()).m4057unboximpl();
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: setSelection-6_8s6DQ */
    public final void mo2878setSelection6_8s6DQ(int i) {
        this.getHighSpeedVideoFpsRanges.setValue(androidx.compose.material3.TimePickerSelectionMode.m4052boximpl(i));
    }

    @Override // androidx.compose.material3.TimePickerState
    public final int getMinute() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getIntValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void setMinute(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setIntValue(i);
    }

    @Override // androidx.compose.material3.TimePickerState
    public final int getHour() {
        return this.getHighSpeedVideoFpsRangesFor.getIntValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public final void setHour(int i) {
        this.getHighSpeedVideoFpsRangesFor.setIntValue(i);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/material3/TimePickerStateImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/TimePickerStateImpl;", "Saver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.TimePickerStateImpl, ?> Saver() {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.TimePickerStateImpl$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.util.List listOf;
                    listOf = kotlin.collections.CollectionsKt.listOf(java.lang.Integer.valueOf(r2.getHour()), java.lang.Integer.valueOf(r2.getMinute()), java.lang.Boolean.valueOf(((androidx.compose.material3.TimePickerStateImpl) obj2).getGetHighSpeedVideoSizes()));
                    return listOf;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TimePickerStateImpl$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.TimePickerStateImpl.Companion.m4060$r8$lambda$TLMFv8W9kWzN9mzwkblpBraovE((java.util.List) obj);
                }
            });
        }

        /* renamed from: $r8$lambda$TLMFv8W9kWzN9mzwkblpBra-ovE, reason: not valid java name */
        public static /* synthetic */ androidx.compose.material3.TimePickerStateImpl m4060$r8$lambda$TLMFv8W9kWzN9mzwkblpBraovE(java.util.List list) {
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            int intValue = ((java.lang.Integer) obj).intValue();
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            int intValue2 = ((java.lang.Integer) obj2).intValue();
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
            return new androidx.compose.material3.TimePickerStateImpl(intValue, intValue2, ((java.lang.Boolean) obj3).booleanValue());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
