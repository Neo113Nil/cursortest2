package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/activity/compose/ComposeBackHandler;", "Landroidx/activity/compose/internal/BackHandlerCompat;", "Landroidx/activity/compose/BackHandlerInfo;", "p0", "<init>", "(Landroidx/activity/compose/BackHandlerInfo;)V", "", "onBackCompleted", "()V", "Lkotlin/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ComposeBackHandler extends androidx.view.compose.internal.BackHandlerCompat {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    public ComposeBackHandler(androidx.view.compose.BackHandlerInfo backHandlerInfo) {
        super(backHandlerInfo);
        this.getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function0() { // from class: androidx.activity.compose.ComposeBackHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        };
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final void onBackCompleted() {
        this.getHighSpeedVideoFpsRangesFor.invoke();
    }
}
