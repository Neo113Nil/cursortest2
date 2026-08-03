package androidx.compose.ui.semantics;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SemanticsProperties.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/ui/semantics/AccessibilityAction;", "T", "Lkotlin/Function;", "", "parentValue", "childValue", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsPropertiesKt$ActionPropertyKey$1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>, androidx.compose.ui.semantics.AccessibilityAction<T>> {
    public static final androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1 INSTANCE = new androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final androidx.compose.ui.semantics.AccessibilityAction<T> invoke(androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction, androidx.compose.ui.semantics.AccessibilityAction<T> accessibilityAction2) {
        java.lang.String label;
        T action;
        if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
            label = accessibilityAction2.getLabel();
        }
        if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
            action = accessibilityAction2.getAction();
        }
        return new androidx.compose.ui.semantics.AccessibilityAction<>(label, action);
    }
}
