package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR+\u0010%\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/foundation/layout/ValueInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/foundation/layout/InsetsValues;", "insets", "", "name", "<init>", "(Landroidx/compose/foundation/layout/InsetsValues;Ljava/lang/String;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getTop", "(Landroidx/compose/ui/unit/Density;)I", "getRight", "getBottom", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue$foundation_layout", "()Landroidx/compose/foundation/layout/InsetsValues;", "setValue$foundation_layout", "(Landroidx/compose/foundation/layout/InsetsValues;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ValueInsets implements androidx.compose.foundation.layout.WindowInsets {
    public static final int $stable = 0;
    private final java.lang.String name;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState value;

    public ValueInsets(androidx.compose.foundation.layout.InsetsValues insetsValues, java.lang.String str) {
        this.name = str;
        this.value = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(insetsValues, null, 2, null);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.layout.InsetsValues getValue$foundation_layout() {
        return (androidx.compose.foundation.layout.InsetsValues) this.value.getValue();
    }

    public final void setValue$foundation_layout(androidx.compose.foundation.layout.InsetsValues insetsValues) {
        this.value.setValue(insetsValues);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return getValue$foundation_layout().getLeft();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(androidx.compose.ui.unit.Density density) {
        return getValue$foundation_layout().getTop();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return getValue$foundation_layout().getRight();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(androidx.compose.ui.unit.Density density) {
        return getValue$foundation_layout().getBottom();
    }

    public final boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof androidx.compose.foundation.layout.ValueInsets) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getValue$foundation_layout(), ((androidx.compose.foundation.layout.ValueInsets) other).getValue$foundation_layout());
        }
        return false;
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.name);
        sb.append("(left=");
        sb.append(getValue$foundation_layout().getLeft());
        sb.append(", top=");
        sb.append(getValue$foundation_layout().getTop());
        sb.append(", right=");
        sb.append(getValue$foundation_layout().getRight());
        sb.append(", bottom=");
        sb.append(getValue$foundation_layout().getBottom());
        sb.append(')');
        return sb.toString();
    }
}
