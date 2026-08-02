package androidx.compose.ui.modifier;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0090\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\r2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/modifier/EmptyMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "<init>", "()V", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)Ljava/lang/Void;", "get$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "", "contains$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmptyMap extends androidx.compose.ui.modifier.ModifierLocalMap {
    public static final int $stable = 0;
    public static final androidx.compose.ui.modifier.EmptyMap INSTANCE = new androidx.compose.ui.modifier.EmptyMap();

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final boolean contains$ui(androidx.compose.ui.modifier.ModifierLocal<?> key) {
        return false;
    }

    private EmptyMap() {
        super(null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ void mo7494set$ui(androidx.compose.ui.modifier.ModifierLocal modifierLocal, java.lang.Object obj) {
        set$ui((androidx.compose.ui.modifier.ModifierLocal<androidx.compose.ui.modifier.ModifierLocal>) modifierLocal, (androidx.compose.ui.modifier.ModifierLocal) obj);
    }

    public final <T> java.lang.Void set$ui(androidx.compose.ui.modifier.ModifierLocal<T> key, T value) {
        throw new java.lang.IllegalStateException("".toString());
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public final <T> T get$ui(androidx.compose.ui.modifier.ModifierLocal<T> key) {
        throw new java.lang.IllegalStateException("".toString());
    }
}
