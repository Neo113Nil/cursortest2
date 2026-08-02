package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\nB7\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\rB\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u000eB\u001d\b\u0017\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u000fB-\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u0006\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b \u0010\u001f"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetProperties;", "", "<init>", "()V", "", "shouldDismissOnBackPress", "shouldDismissOnClickOutside", "(ZZ)V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "(Landroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "isAppearanceLightStatusBars", "isAppearanceLightNavigationBars", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "(Z)V", "(Landroidx/compose/ui/window/SecureFlagPolicy;Z)V", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/window/SecureFlagPolicy;", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "Z", "getShouldDismissOnBackPress", "()Z", "Ljava/lang/Boolean;", "isAppearanceLightStatusBars$material3", "()Ljava/lang/Boolean;", "isAppearanceLightNavigationBars$material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetProperties {
    public static final int $stable = 0;
    private final java.lang.Boolean isAppearanceLightNavigationBars;
    private final java.lang.Boolean isAppearanceLightStatusBars;
    private final androidx.compose.ui.window.SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;
    private final boolean shouldDismissOnClickOutside;

    public final androidx.compose.ui.window.SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    /* renamed from: shouldDismissOnClickOutside, reason: from getter */
    public final boolean getShouldDismissOnClickOutside() {
        return this.shouldDismissOnClickOutside;
    }

    /* renamed from: isAppearanceLightStatusBars$material3, reason: from getter */
    public final java.lang.Boolean getIsAppearanceLightStatusBars() {
        return this.isAppearanceLightStatusBars;
    }

    /* renamed from: isAppearanceLightNavigationBars$material3, reason: from getter */
    public final java.lang.Boolean getIsAppearanceLightNavigationBars() {
        return this.isAppearanceLightNavigationBars;
    }

    public ModalBottomSheetProperties() {
        this.securePolicy = androidx.compose.ui.window.SecureFlagPolicy.Inherit;
        this.shouldDismissOnBackPress = true;
        this.shouldDismissOnClickOutside = true;
        this.isAppearanceLightStatusBars = null;
        this.isAppearanceLightNavigationBars = null;
    }

    public ModalBottomSheetProperties(boolean z, boolean z2) {
        this.securePolicy = androidx.compose.ui.window.SecureFlagPolicy.Inherit;
        this.shouldDismissOnBackPress = z;
        this.shouldDismissOnClickOutside = z2;
        this.isAppearanceLightNavigationBars = null;
        this.isAppearanceLightStatusBars = null;
    }

    public /* synthetic */ ModalBottomSheetProperties(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    public /* synthetic */ ModalBottomSheetProperties(androidx.compose.ui.window.SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.window.SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
    }

    public ModalBottomSheetProperties(androidx.compose.ui.window.SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2) {
        this.securePolicy = secureFlagPolicy;
        this.shouldDismissOnBackPress = z;
        this.shouldDismissOnClickOutside = z2;
        this.isAppearanceLightNavigationBars = null;
        this.isAppearanceLightStatusBars = null;
    }

    public /* synthetic */ ModalBottomSheetProperties(boolean z, boolean z2, androidx.compose.ui.window.SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? androidx.compose.ui.window.SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4);
    }

    public ModalBottomSheetProperties(boolean z, boolean z2, androidx.compose.ui.window.SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4) {
        this.shouldDismissOnBackPress = z3;
        this.shouldDismissOnClickOutside = z4;
        this.securePolicy = secureFlagPolicy;
        this.isAppearanceLightStatusBars = java.lang.Boolean.valueOf(z);
        this.isAppearanceLightNavigationBars = java.lang.Boolean.valueOf(z2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced with additional shouldDismissOnScrimClick param constructor.")
    public /* synthetic */ ModalBottomSheetProperties(boolean z) {
        this(z, true);
    }

    public /* synthetic */ ModalBottomSheetProperties(androidx.compose.ui.window.SecureFlagPolicy secureFlagPolicy, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.window.SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 2) != 0 ? true : z);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use empty constructor or constructor including shouldDismissOnScrimClick param.")
    public /* synthetic */ ModalBottomSheetProperties(androidx.compose.ui.window.SecureFlagPolicy secureFlagPolicy, boolean z) {
        this(secureFlagPolicy, z, true);
    }

    public /* synthetic */ ModalBottomSheetProperties(boolean z, boolean z2, androidx.compose.ui.window.SecureFlagPolicy secureFlagPolicy, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? androidx.compose.ui.window.SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 8) != 0 ? true : z3);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use empty constructor or constructor including shouldDismissOnScrimClick param.")
    public /* synthetic */ ModalBottomSheetProperties(boolean z, boolean z2, androidx.compose.ui.window.SecureFlagPolicy secureFlagPolicy, boolean z3) {
        this.shouldDismissOnBackPress = z3;
        this.shouldDismissOnClickOutside = true;
        this.securePolicy = secureFlagPolicy;
        this.isAppearanceLightStatusBars = java.lang.Boolean.valueOf(z);
        this.isAppearanceLightNavigationBars = java.lang.Boolean.valueOf(z2);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material3.ModalBottomSheetProperties)) {
            return false;
        }
        androidx.compose.material3.ModalBottomSheetProperties modalBottomSheetProperties = (androidx.compose.material3.ModalBottomSheetProperties) other;
        return this.securePolicy == modalBottomSheetProperties.securePolicy && kotlin.jvm.internal.Intrinsics.areEqual(this.isAppearanceLightStatusBars, modalBottomSheetProperties.isAppearanceLightStatusBars) && kotlin.jvm.internal.Intrinsics.areEqual(this.isAppearanceLightNavigationBars, modalBottomSheetProperties.isAppearanceLightNavigationBars) && this.shouldDismissOnClickOutside == modalBottomSheetProperties.shouldDismissOnClickOutside && this.shouldDismissOnBackPress == modalBottomSheetProperties.shouldDismissOnBackPress;
    }

    public final int hashCode() {
        int hashCode = this.securePolicy.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.shouldDismissOnBackPress);
        java.lang.Boolean bool = this.isAppearanceLightStatusBars;
        int hashCode3 = bool != null ? bool.hashCode() : 0;
        java.lang.Boolean bool2 = this.isAppearanceLightNavigationBars;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool2 != null ? bool2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.shouldDismissOnClickOutside);
    }
}
