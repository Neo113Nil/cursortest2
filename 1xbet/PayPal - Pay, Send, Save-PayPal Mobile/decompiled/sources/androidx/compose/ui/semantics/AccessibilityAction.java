package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function;", "", "T", "", "", "label", "action", "<init>", "(Ljava/lang/String;Lkotlin/Function;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getLabel", "Lkotlin/Function;", "getAction", "()Lkotlin/Function;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccessibilityAction<T extends kotlin.Function<? extends java.lang.Boolean>> {
    public static final int $stable = 0;
    private final T action;
    private final java.lang.String label;

    public AccessibilityAction(java.lang.String str, T t) {
        this.label = str;
        this.action = t;
    }

    public final T getAction() {
        return this.action;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.semantics.AccessibilityAction)) {
            return false;
        }
        androidx.compose.ui.semantics.AccessibilityAction accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, accessibilityAction.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, accessibilityAction.action);
    }

    public final int hashCode() {
        java.lang.String str = this.label;
        int hashCode = str != null ? str.hashCode() : 0;
        T t = this.action;
        return (hashCode * 31) + (t != null ? t.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccessibilityAction(label=");
        sb.append(this.label);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(')');
        return sb.toString();
    }
}
