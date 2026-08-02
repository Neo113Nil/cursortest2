package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\n8\u0007@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/pager/DefaultPagerState;", "Landroidx/compose/foundation/pager/PagerState;", "", "p0", "", "p1", "Lkotlin/Function0;", "p2", "<init>", "(IFLkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableState;", "getHighResolutionOutputSizeshNQ4ISI", "getPageCount", "()I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultPagerState extends androidx.compose.foundation.pager.PagerState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.pager.DefaultPagerState.Companion INSTANCE = new androidx.compose.foundation.pager.DefaultPagerState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.pager.DefaultPagerState, ?> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.pager.DefaultPagerState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.util.List listOf;
            listOf = kotlin.collections.CollectionsKt.listOf(java.lang.Integer.valueOf(r2.getCurrentPage()), java.lang.Float.valueOf(kotlin.ranges.RangesKt.coerceIn(r2.getCurrentPageOffsetFraction(), -0.5f, 0.5f)), java.lang.Integer.valueOf(((androidx.compose.foundation.pager.DefaultPagerState) obj2).getPageCount()));
            return listOf;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.pager.DefaultPagerState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.foundation.pager.DefaultPagerState.getHighSpeedVideoSizes((java.util.List) obj);
        }
    });

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<java.lang.Integer>> getHighResolutionOutputSizeshNQ4ISI;

    public DefaultPagerState(int i, float f, kotlin.jvm.functions.Function0<java.lang.Integer> function0) {
        super(i, f);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function0, null, 2, null);
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public final int getPageCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().invoke().intValue();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/foundation/pager/DefaultPagerState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/pager/DefaultPagerState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.pager.DefaultPagerState, ?> getSaver() {
            return androidx.compose.foundation.pager.DefaultPagerState.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ androidx.compose.foundation.pager.DefaultPagerState getHighSpeedVideoSizes(final java.util.List list) {
        java.lang.Object obj = list.get(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        int intValue = ((java.lang.Integer) obj).intValue();
        java.lang.Object obj2 = list.get(1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
        return new androidx.compose.foundation.pager.DefaultPagerState(intValue, ((java.lang.Float) obj2).floatValue(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.DefaultPagerState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(androidx.compose.foundation.pager.DefaultPagerState.getHighResolutionOutputSizeshNQ4ISI(list));
            }
        });
    }

    public static /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI(java.util.List list) {
        java.lang.Object obj = list.get(2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return ((java.lang.Integer) obj).intValue();
    }
}
