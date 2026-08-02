package androidx.compose.ui.modifier;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000H \u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H \u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\r2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H \u0002¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0004\u0010\u0011\u0012\u0013"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalMap;", "", "<init>", "()V", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "get$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "", "contains$ui", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "Landroidx/compose/ui/modifier/EmptyMap;", "Landroidx/compose/ui/modifier/MultiLocalMap;", "Landroidx/compose/ui/modifier/SingleLocalMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ModifierLocalMap {
    public static final int $stable = 0;

    public abstract boolean contains$ui(androidx.compose.ui.modifier.ModifierLocal<?> key);

    public abstract <T> T get$ui(androidx.compose.ui.modifier.ModifierLocal<T> key);

    /* renamed from: set$ui */
    public abstract <T> void mo7494set$ui(androidx.compose.ui.modifier.ModifierLocal<T> key, T value);

    private ModifierLocalMap() {
    }

    public /* synthetic */ ModifierLocalMap(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
