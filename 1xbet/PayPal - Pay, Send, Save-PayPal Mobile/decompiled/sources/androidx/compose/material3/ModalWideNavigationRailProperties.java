package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/material3/ModalWideNavigationRailProperties;", "", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "", "shouldDismissOnBackPress", "<init>", "(Landroidx/compose/ui/window/SecureFlagPolicy;Z)V", "(Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/window/SecureFlagPolicy;", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "Z", "getShouldDismissOnBackPress", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModalWideNavigationRailProperties {
    public static final int $stable = 0;
    private final androidx.compose.ui.window.SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;

    public ModalWideNavigationRailProperties(androidx.compose.ui.window.SecureFlagPolicy secureFlagPolicy, boolean z) {
        this.securePolicy = secureFlagPolicy;
        this.shouldDismissOnBackPress = z;
    }

    public /* synthetic */ ModalWideNavigationRailProperties(androidx.compose.ui.window.SecureFlagPolicy secureFlagPolicy, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.window.SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 2) != 0 ? true : z);
    }

    public final androidx.compose.ui.window.SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public /* synthetic */ ModalWideNavigationRailProperties(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public ModalWideNavigationRailProperties(boolean z) {
        this(androidx.compose.ui.window.SecureFlagPolicy.Inherit, z);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.material3.ModalWideNavigationRailProperties) && this.securePolicy == ((androidx.compose.material3.ModalWideNavigationRailProperties) other).securePolicy;
    }

    public final int hashCode() {
        return (this.securePolicy.hashCode() * 31) + java.lang.Boolean.hashCode(this.shouldDismissOnBackPress);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModalWideNavigationRailProperties() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
