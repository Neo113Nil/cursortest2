package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J#\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/retain/ForgetfulRetainedValuesStore;", "Landroidx/compose/runtime/retain/RetainedValuesStore;", "<init>", "()V", "", "onContentEnteredComposition", "onContentExitComposition", "", "key", "defaultValue", "consumeExitedValueOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "saveExitingValue", "(Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ForgetfulRetainedValuesStore implements androidx.compose.runtime.retain.RetainedValuesStore {
    public static final int $stable = 0;
    public static final androidx.compose.runtime.retain.ForgetfulRetainedValuesStore INSTANCE = new androidx.compose.runtime.retain.ForgetfulRetainedValuesStore();

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public final java.lang.Object consumeExitedValueOrDefault(java.lang.Object key, java.lang.Object defaultValue) {
        return defaultValue;
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public final void onContentEnteredComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public final void onContentExitComposition() {
    }

    private ForgetfulRetainedValuesStore() {
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public final void saveExitingValue(java.lang.Object key, java.lang.Object value) {
        if (value instanceof androidx.compose.runtime.retain.RetainObserver) {
            ((androidx.compose.runtime.retain.RetainObserver) value).onRetired();
        }
    }
}
