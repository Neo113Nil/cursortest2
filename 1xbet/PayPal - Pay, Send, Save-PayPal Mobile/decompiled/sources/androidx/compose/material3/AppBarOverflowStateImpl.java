package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b"}, d2 = {"Landroidx/compose/material3/AppBarOverflowStateImpl;", "Landroidx/compose/material3/AppBarOverflowState;", "<init>", "()V", "", "p0", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableIntState;", "getTotalItemCount", "()I", "setTotalItemCount", "(I)V", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getVisibleItemCount", "setVisibleItemCount", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppBarOverflowStateImpl implements androidx.compose.material3.AppBarOverflowState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.AppBarOverflowStateImpl.Companion INSTANCE = new androidx.compose.material3.AppBarOverflowStateImpl.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.AppBarOverflowStateImpl, ?> Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.AppBarOverflowStateImpl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.util.List listOf;
            listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(r2.getTotalItemCount()), java.lang.Integer.valueOf(((androidx.compose.material3.AppBarOverflowStateImpl) obj2).getVisibleItemCount())});
            return listOf;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.AppBarOverflowStateImpl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.material3.AppBarOverflowStateImpl.getHighSpeedVideoSizes((java.util.List) obj);
        }
    });

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);

    @Override // androidx.compose.material3.AppBarOverflowState
    public final int getTotalItemCount() {
        return this.Camera2StreamConfigurationMap.getIntValue();
    }

    @Override // androidx.compose.material3.AppBarOverflowState
    public final void setTotalItemCount(int i) {
        this.Camera2StreamConfigurationMap.setIntValue(i);
    }

    @Override // androidx.compose.material3.AppBarOverflowState
    public final int getVisibleItemCount() {
        return this.getHighSpeedVideoFpsRangesFor.getIntValue();
    }

    @Override // androidx.compose.material3.AppBarOverflowState
    public final void setVisibleItemCount(int i) {
        this.getHighSpeedVideoFpsRangesFor.setIntValue(i);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/material3/AppBarOverflowStateImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/AppBarOverflowStateImpl;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.AppBarOverflowStateImpl, ?> getSaver() {
            return androidx.compose.material3.AppBarOverflowStateImpl.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ androidx.compose.material3.AppBarOverflowStateImpl getHighSpeedVideoSizes(java.util.List list) {
        androidx.compose.material3.AppBarOverflowStateImpl appBarOverflowStateImpl = new androidx.compose.material3.AppBarOverflowStateImpl();
        appBarOverflowStateImpl.setTotalItemCount(((java.lang.Number) list.get(0)).intValue());
        appBarOverflowStateImpl.setVisibleItemCount(((java.lang.Number) list.get(1)).intValue());
        return appBarOverflowStateImpl;
    }
}
