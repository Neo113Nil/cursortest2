package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ$\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/ui/platform/LifecycleRetainedValuesStore;", "Landroidx/compose/runtime/retain/RetainedValuesStore;", "Landroidx/compose/runtime/retain/ManagedRetainedValuesStore;", "delegate", "<init>", "(Landroidx/compose/runtime/retain/ManagedRetainedValuesStore;)V", "", "startLifecycleTransition", "()V", "endLifecycleTransition", "dispose", "onContentEnteredComposition", "onContentExitComposition", "", "key", "defaultValue", "consumeExitedValueOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "saveExitingValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Landroidx/compose/runtime/retain/ManagedRetainedValuesStore;", "getDelegate", "()Landroidx/compose/runtime/retain/ManagedRetainedValuesStore;", "", "isRetainingExitedValues", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LifecycleRetainedValuesStore implements androidx.compose.runtime.retain.RetainedValuesStore {
    public static final int $stable = androidx.compose.runtime.retain.ManagedRetainedValuesStore.$stable;
    private final androidx.compose.runtime.retain.ManagedRetainedValuesStore delegate;

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public final void onContentEnteredComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public final void onContentExitComposition() {
    }

    public LifecycleRetainedValuesStore(androidx.compose.runtime.retain.ManagedRetainedValuesStore managedRetainedValuesStore) {
        this.delegate = managedRetainedValuesStore;
        managedRetainedValuesStore.onContentEnteredComposition();
    }

    public /* synthetic */ LifecycleRetainedValuesStore(androidx.compose.runtime.retain.ManagedRetainedValuesStore managedRetainedValuesStore, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new androidx.compose.runtime.retain.ManagedRetainedValuesStore() : managedRetainedValuesStore);
    }

    public final androidx.compose.runtime.retain.ManagedRetainedValuesStore getDelegate() {
        return this.delegate;
    }

    public final boolean isRetainingExitedValues() {
        return this.delegate.isRetainingExitedValues();
    }

    public final void startLifecycleTransition() {
        this.delegate.onContentExitComposition();
    }

    public final void endLifecycleTransition() {
        this.delegate.onContentEnteredComposition();
    }

    public final void dispose() {
        this.delegate.dispose();
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public final void saveExitingValue(java.lang.Object key, java.lang.Object value) {
        this.delegate.saveExitingValue(key, value);
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public final java.lang.Object consumeExitedValueOrDefault(java.lang.Object key, java.lang.Object defaultValue) {
        return this.delegate.consumeExitedValueOrDefault(key, defaultValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleRetainedValuesStore() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
