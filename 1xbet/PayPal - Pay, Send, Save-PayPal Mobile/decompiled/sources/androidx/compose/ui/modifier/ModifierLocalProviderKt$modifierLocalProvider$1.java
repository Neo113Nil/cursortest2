package androidx.compose.ui.modifier;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\u00028\u00008WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalProviderKt$modifierLocalProvider$1;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "value$delegate", "Landroidx/compose/runtime/State;", "getValue", "()Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModifierLocalProviderKt$modifierLocalProvider$1<T> extends androidx.compose.ui.platform.InspectorValueInfo implements androidx.compose.ui.modifier.ModifierLocalProvider<T> {
    private final androidx.compose.ui.modifier.ProvidableModifierLocal<T> key;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State value;

    ModifierLocalProviderKt$modifierLocalProvider$1(androidx.compose.ui.modifier.ProvidableModifierLocal<T> providableModifierLocal, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1) {
        super(function1);
        this.key = providableModifierLocal;
        this.value = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(function0);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final androidx.compose.ui.modifier.ProvidableModifierLocal<T> getKey() {
        return this.key;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public final T getValue() {
        return (T) this.value.getValue();
    }
}
