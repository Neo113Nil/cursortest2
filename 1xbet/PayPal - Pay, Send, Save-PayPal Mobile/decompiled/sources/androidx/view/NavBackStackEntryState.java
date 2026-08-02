package androidx.view;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0015\b\u0016\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0004\u0010\tJ\u0011\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\u0010\u0016\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010 \u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0016\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078G¢\u0006\u0006\u001a\u0004\b!\u0010\u000bR\u0015\u0010#\u001a\u00060\u0006j\u0002`\u00078G¢\u0006\u0006\u001a\u0004\b\"\u0010\u000bR\u0014\u0010'\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "", "Landroidx/navigation/NavBackStackEntry;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "<init>", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "state", "(Landroid/os/Bundle;)V", "writeToState", "()Landroid/os/Bundle;", "Landroidx/navigation/internal/NavContext;", "context", "Landroidx/navigation/NavDestination;", "destination", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "instantiate", "(Landroidx/navigation/internal/NavContext;Landroidx/navigation/NavDestination;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavControllerViewModel;)Landroidx/navigation/NavBackStackEntry;", "args", "prepareArgs", "(Landroid/os/Bundle;Landroidx/navigation/internal/NavContext;)Landroid/os/Bundle;", "", "getId", "()Ljava/lang/String;", "id", "", "getDestinationId", "()I", "destinationId", "getArgs", "getSavedState", "savedState", "Landroidx/navigation/internal/NavBackStackEntryStateImpl;", "Camera2StreamConfigurationMap", "Landroidx/navigation/internal/NavBackStackEntryStateImpl;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavBackStackEntryState {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.internal.NavBackStackEntryStateImpl getHighSpeedVideoFpsRanges;

    public final java.lang.String getId() {
        return this.getHighSpeedVideoFpsRanges.getId();
    }

    public final int getDestinationId() {
        return this.getHighSpeedVideoFpsRanges.getDestinationId();
    }

    public final android.os.Bundle getArgs() {
        return this.getHighSpeedVideoFpsRanges.getArgs();
    }

    public final android.os.Bundle getSavedState() {
        return this.getHighSpeedVideoFpsRanges.getSavedState();
    }

    public NavBackStackEntryState(androidx.view.NavBackStackEntry navBackStackEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        this.getHighSpeedVideoFpsRanges = new androidx.view.internal.NavBackStackEntryStateImpl(navBackStackEntry, navBackStackEntry.getDestination().getId());
    }

    public NavBackStackEntryState(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        bundle.setClassLoader(getClass().getClassLoader());
        this.getHighSpeedVideoFpsRanges = new androidx.view.internal.NavBackStackEntryStateImpl(bundle);
    }

    public final android.os.Bundle writeToState() {
        return this.getHighSpeedVideoFpsRanges.writeToState$navigation_runtime_release();
    }

    public final androidx.view.NavBackStackEntry instantiate(androidx.view.internal.NavContext context, androidx.view.NavDestination destination, androidx.lifecycle.Lifecycle.State hostLifecycleState, androidx.view.NavControllerViewModel viewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostLifecycleState, "");
        android.os.Bundle args = getArgs();
        return this.getHighSpeedVideoFpsRanges.instantiate(context, destination, args != null ? prepareArgs(args, context) : null, hostLifecycleState, viewModel);
    }

    public final android.os.Bundle prepareArgs(android.os.Bundle args, androidx.view.internal.NavContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.Context context2 = context.getContext();
        args.setClassLoader(context2 != null ? context2.getClassLoader() : null);
        return args;
    }
}
