package androidx.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/navigation/NavAction;", "", "", "destinationId", "Landroidx/navigation/NavOptions;", "navOptions", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "defaultArguments", "<init>", "(ILandroidx/navigation/NavOptions;Landroid/os/Bundle;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getDestinationId", "Landroidx/navigation/NavOptions;", "getNavOptions", "()Landroidx/navigation/NavOptions;", "setNavOptions", "(Landroidx/navigation/NavOptions;)V", "Landroid/os/Bundle;", "getDefaultArguments", "()Landroid/os/Bundle;", "setDefaultArguments", "(Landroid/os/Bundle;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavAction {
    private android.os.Bundle defaultArguments;
    private final int destinationId;
    private androidx.view.NavOptions navOptions;

    public NavAction(int i, androidx.view.NavOptions navOptions, android.os.Bundle bundle) {
        this.destinationId = i;
        this.navOptions = navOptions;
        this.defaultArguments = bundle;
    }

    public /* synthetic */ NavAction(int i, androidx.view.NavOptions navOptions, android.os.Bundle bundle, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : navOptions, (i2 & 4) != 0 ? null : bundle);
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final androidx.view.NavOptions getNavOptions() {
        return this.navOptions;
    }

    public final void setNavOptions(androidx.view.NavOptions navOptions) {
        this.navOptions = navOptions;
    }

    public final android.os.Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    public final void setDefaultArguments(android.os.Bundle bundle) {
        this.defaultArguments = bundle;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.view.NavAction)) {
            return false;
        }
        androidx.view.NavAction navAction = (androidx.view.NavAction) other;
        if (this.destinationId != navAction.destinationId || !kotlin.jvm.internal.Intrinsics.areEqual(this.navOptions, navAction.navOptions)) {
            return false;
        }
        android.os.Bundle bundle = this.defaultArguments;
        android.os.Bundle bundle2 = navAction.defaultArguments;
        if (kotlin.jvm.internal.Intrinsics.areEqual(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !androidx.view.SavedStateReader.m9298contentDeepEqualsimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle), bundle2)) ? false : true;
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.destinationId);
        androidx.view.NavOptions navOptions = this.navOptions;
        int hashCode2 = (hashCode * 31) + (navOptions != null ? navOptions.hashCode() : 0);
        android.os.Bundle bundle = this.defaultArguments;
        return bundle != null ? (hashCode2 * 31) + androidx.view.SavedStateReader.m9299contentDeepHashCodeimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle)) : hashCode2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(java.lang.Integer.toHexString(this.destinationId));
        sb.append(")");
        if (this.navOptions != null) {
            sb.append(" navOptions=");
            sb.append(this.navOptions);
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public NavAction(int i, androidx.view.NavOptions navOptions) {
        this(i, navOptions, null, 4, null);
    }

    public NavAction(int i) {
        this(i, null, null, 6, null);
    }
}
