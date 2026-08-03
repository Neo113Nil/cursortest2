package androidx.compose.foundation.pager;

/* compiled from: PagerState.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/pager/PagerStateImpl;", "Landroidx/compose/foundation/pager/PagerState;", "initialPage", "", "initialPageOffsetFraction", "", "updatedPageCount", "Lkotlin/Function0;", "(IFLkotlin/jvm/functions/Function0;)V", "pageCount", "getPageCount", "()I", "pageCountState", "Landroidx/compose/runtime/MutableState;", "getPageCountState", "()Landroidx/compose/runtime/MutableState;", "setPageCountState", "(Landroidx/compose/runtime/MutableState;)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerStateImpl extends androidx.compose.foundation.pager.PagerState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.pager.PagerStateImpl.Companion INSTANCE = new androidx.compose.foundation.pager.PagerStateImpl.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.pager.PagerStateImpl, ?> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.foundation.pager.PagerStateImpl, java.util.List<? extends java.lang.Object>>() { // from class: androidx.compose.foundation.pager.PagerStateImpl$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final java.util.List<java.lang.Object> invoke(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.foundation.pager.PagerStateImpl pagerStateImpl) {
            return kotlin.collections.CollectionsKt.listOf(java.lang.Integer.valueOf(pagerStateImpl.getCurrentPage()), java.lang.Float.valueOf(pagerStateImpl.getCurrentPageOffsetFraction()), java.lang.Integer.valueOf(pagerStateImpl.getPageCount()));
        }
    }, new kotlin.jvm.functions.Function1<java.util.List, androidx.compose.foundation.pager.PagerStateImpl>() { // from class: androidx.compose.foundation.pager.PagerStateImpl$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.foundation.pager.PagerStateImpl invoke(java.util.List list) {
            return invoke2((java.util.List<? extends java.lang.Object>) list);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final androidx.compose.foundation.pager.PagerStateImpl invoke2(final java.util.List<? extends java.lang.Object> list) {
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) obj).intValue();
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new androidx.compose.foundation.pager.PagerStateImpl(intValue, ((java.lang.Float) obj2).floatValue(), new kotlin.jvm.functions.Function0<java.lang.Integer>() { // from class: androidx.compose.foundation.pager.PagerStateImpl$Companion$Saver$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Integer invoke() {
                    java.lang.Object obj3 = list.get(2);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return (java.lang.Integer) obj3;
                }
            });
        }
    });
    private androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<java.lang.Integer>> pageCountState;

    public PagerStateImpl(int i, float f, kotlin.jvm.functions.Function0<java.lang.Integer> function0) {
        super(i, f);
        this.pageCountState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function0, null, 2, null);
    }

    public final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<java.lang.Integer>> getPageCountState() {
        return this.pageCountState;
    }

    public final void setPageCountState(androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<java.lang.Integer>> mutableState) {
        this.pageCountState = mutableState;
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public int getPageCount() {
        return this.pageCountState.getValue().invoke().intValue();
    }

    /* compiled from: PagerState.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/pager/PagerStateImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/pager/PagerStateImpl;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.pager.PagerStateImpl, ?> getSaver() {
            return androidx.compose.foundation.pager.PagerStateImpl.Saver;
        }
    }
}
