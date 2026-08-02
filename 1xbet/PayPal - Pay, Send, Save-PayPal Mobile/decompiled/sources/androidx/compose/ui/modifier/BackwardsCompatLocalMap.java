package androidx.compose.ui.modifier;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u00020\u000f2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005"}, d2 = {"Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "element", "<init>", "(Landroidx/compose/ui/modifier/ModifierLocalProvider;)V", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "get$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "", "contains$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "getElement", "()Landroidx/compose/ui/modifier/ModifierLocalProvider;", "setElement"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BackwardsCompatLocalMap extends androidx.compose.ui.modifier.ModifierLocalMap {
    public static final int $stable = 8;
    private androidx.compose.ui.modifier.ModifierLocalProvider<?> element;

    public BackwardsCompatLocalMap(androidx.compose.ui.modifier.ModifierLocalProvider<?> modifierLocalProvider) {
        super(null);
        this.element = modifierLocalProvider;
    }

    public final androidx.compose.ui.modifier.ModifierLocalProvider<?> getElement() {
        return this.element;
    }

    public final void setElement(androidx.compose.ui.modifier.ModifierLocalProvider<?> modifierLocalProvider) {
        this.element = modifierLocalProvider;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui */
    public final <T> void mo7494set$ui(androidx.compose.ui.modifier.ModifierLocal<T> key, T value) {
        throw new java.lang.IllegalStateException("Set is not allowed on a backwards compat provider".toString());
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final <T> T get$ui(androidx.compose.ui.modifier.ModifierLocal<T> key) {
        if (key != this.element.getKey()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        return (T) this.element.getValue();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final boolean contains$ui(androidx.compose.ui.modifier.ModifierLocal<?> key) {
        return key == this.element.getKey();
    }
}
