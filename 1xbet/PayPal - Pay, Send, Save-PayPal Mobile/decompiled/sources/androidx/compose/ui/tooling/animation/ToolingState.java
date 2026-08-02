package androidx.compose.ui.tooling.animation;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\f\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00008W@WX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005"}, d2 = {"Landroidx/compose/ui/tooling/animation/ToolingState;", "T", "Landroidx/compose/runtime/State;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "<init>", "(Ljava/lang/Object;)V", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ToolingState<T> implements androidx.compose.runtime.State<T> {
    public static final int $stable = 0;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState value;

    public ToolingState(T t) {
        this.value = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
    }

    @Override // androidx.compose.runtime.State
    public final T getValue() {
        return this.value.getValue();
    }

    public final void setValue(T t) {
        this.value.setValue(t);
    }
}
