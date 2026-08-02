package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "", "", "label", "Lkotlin/Function0;", "", "action", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getLabel", "Lkotlin/jvm/functions/Function0;", "getAction", "()Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CustomAccessibilityAction {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> action;
    private final java.lang.String label;

    public CustomAccessibilityAction(java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        this.label = str;
        this.action = function0;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getAction() {
        return this.action;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.semantics.CustomAccessibilityAction)) {
            return false;
        }
        androidx.compose.ui.semantics.CustomAccessibilityAction customAccessibilityAction = (androidx.compose.ui.semantics.CustomAccessibilityAction) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, customAccessibilityAction.label) && this.action == customAccessibilityAction.action;
    }

    public final int hashCode() {
        return (this.label.hashCode() * 31) + this.action.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomAccessibilityAction(label=");
        sb.append(this.label);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(')');
        return sb.toString();
    }
}
