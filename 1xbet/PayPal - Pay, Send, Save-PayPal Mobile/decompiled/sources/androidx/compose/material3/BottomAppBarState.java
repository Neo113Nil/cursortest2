package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010R\u001c\u0010\u0007\u001a\u00020\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/BottomAppBarState;", "", "", "getHeightOffsetLimit", "()F", "setHeightOffsetLimit", "(F)V", "heightOffsetLimit", "getHeightOffset", "setHeightOffset", "heightOffset", "getContentOffset", "setContentOffset", "contentOffset", "getCollapsedFraction", "collapsedFraction", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BottomAppBarState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.BottomAppBarState.Companion INSTANCE = androidx.compose.material3.BottomAppBarState.Companion.getHighResolutionOutputSizeshNQ4ISI;

    float getCollapsedFraction();

    float getContentOffset();

    float getHeightOffset();

    float getHeightOffsetLimit();

    void setContentOffset(float f);

    void setHeightOffset(float f);

    void setHeightOffsetLimit(float f);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/material3/BottomAppBarState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/BottomAppBarState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.material3.BottomAppBarState.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.material3.BottomAppBarState.Companion();
        private static final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.BottomAppBarState, ?> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.BottomAppBarState$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.util.List listOf;
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Float[]{java.lang.Float.valueOf(r2.getHeightOffsetLimit()), java.lang.Float.valueOf(r2.getHeightOffset()), java.lang.Float.valueOf(((androidx.compose.material3.BottomAppBarState) obj2).getContentOffset())});
                return listOf;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.BottomAppBarState$Companion$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.material3.BottomAppBarState BottomAppBarState;
                BottomAppBarState = androidx.compose.material3.AppBarKt.BottomAppBarState(((java.lang.Number) r1.get(0)).floatValue(), ((java.lang.Number) r1.get(1)).floatValue(), ((java.lang.Number) ((java.util.List) obj).get(2)).floatValue());
                return BottomAppBarState;
            }
        });

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.BottomAppBarState, ?> getSaver() {
            return Saver;
        }
    }
}
