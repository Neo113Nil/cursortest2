package androidx.view.internal;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0010\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0013\u0010\f\u001a\u00060\bj\u0002`\tH\u0000¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0012\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\u0012\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010\rR\u001e\u0010$\u001a\u00060\bj\u0002`\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\r"}, d2 = {"Landroidx/navigation/internal/NavBackStackEntryStateImpl;", "", "Landroidx/navigation/NavBackStackEntry;", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "", "destId", "<init>", "(Landroidx/navigation/NavBackStackEntry;I)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "state", "(Landroid/os/Bundle;)V", "writeToState$navigation_runtime_release", "()Landroid/os/Bundle;", "Landroidx/navigation/internal/NavContext;", "context", "Landroidx/navigation/NavDestination;", "destination", "args", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "instantiate", "(Landroidx/navigation/internal/NavContext;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavControllerViewModel;)Landroidx/navigation/NavBackStackEntry;", "", "id", "Ljava/lang/String;", "getId$navigation_runtime_release", "()Ljava/lang/String;", "destinationId", com.visa.cbp.getEncExpo.warmup, "getDestinationId$navigation_runtime_release", "()I", "Landroid/os/Bundle;", "getArgs$navigation_runtime_release", "savedState", "getSavedState$navigation_runtime_release", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavBackStackEntryStateImpl {
    public static final java.lang.String KEY_ARGS = "nav-entry-state:args";
    public static final java.lang.String KEY_DESTINATION_ID = "nav-entry-state:destination-id";
    public static final java.lang.String KEY_ID = "nav-entry-state:id";
    public static final java.lang.String KEY_SAVED_STATE = "nav-entry-state:saved-state";
    private final android.os.Bundle args;
    private final int destinationId;
    private final java.lang.String id;
    private final android.os.Bundle savedState;

    /* renamed from: getId$navigation_runtime_release, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: getDestinationId$navigation_runtime_release, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    /* renamed from: getArgs$navigation_runtime_release, reason: from getter */
    public final android.os.Bundle getArgs() {
        return this.args;
    }

    /* renamed from: getSavedState$navigation_runtime_release, reason: from getter */
    public final android.os.Bundle getSavedState() {
        return this.savedState;
    }

    public NavBackStackEntryStateImpl(androidx.view.NavBackStackEntry navBackStackEntry, int i) {
        kotlin.Pair[] pairArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        this.id = navBackStackEntry.getId();
        this.destinationId = i;
        this.args = navBackStackEntry.getArguments();
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
            for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        this.savedState = bundleOf;
        navBackStackEntry.saveState(bundleOf);
    }

    public NavBackStackEntryStateImpl(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        this.id = androidx.view.SavedStateReader.m9367getStringimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle), KEY_ID);
        this.destinationId = androidx.view.SavedStateReader.m9327getIntimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle), KEY_DESTINATION_ID);
        this.args = androidx.view.SavedStateReader.m9353getSavedStateimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle), KEY_ARGS);
        this.savedState = androidx.view.SavedStateReader.m9353getSavedStateimpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle), KEY_SAVED_STATE);
    }

    public final androidx.view.NavBackStackEntry instantiate(androidx.view.internal.NavContext context, androidx.view.NavDestination destination, android.os.Bundle args, androidx.lifecycle.Lifecycle.State hostLifecycleState, androidx.view.NavControllerViewModel viewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostLifecycleState, "");
        return androidx.view.NavBackStackEntry.INSTANCE.create(context, destination, args, hostLifecycleState, viewModel, this.id, this.savedState);
    }

    public final android.os.Bundle writeToState$navigation_runtime_release() {
        kotlin.Pair[] pairArr;
        kotlin.Pair[] pairArr2;
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
            for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        android.os.Bundle m9382constructorimpl = androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        androidx.view.SavedStateWriter.m9415putStringimpl(m9382constructorimpl, KEY_ID, this.id);
        androidx.view.SavedStateWriter.m9399putIntimpl(m9382constructorimpl, KEY_DESTINATION_ID, this.destinationId);
        android.os.Bundle bundle = this.args;
        if (bundle == null) {
            java.util.Map emptyMap2 = kotlin.collections.MapsKt.emptyMap();
            if (emptyMap2.isEmpty()) {
                pairArr2 = new kotlin.Pair[0];
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(emptyMap2.size());
                for (java.util.Map.Entry entry2 : emptyMap2.entrySet()) {
                    arrayList2.add(kotlin.TuplesKt.to((java.lang.String) entry2.getKey(), entry2.getValue()));
                }
                pairArr2 = (kotlin.Pair[]) arrayList2.toArray(new kotlin.Pair[0]);
            }
            bundle = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr2, pairArr2.length));
            androidx.view.SavedStateWriter.m9382constructorimpl(bundle);
        }
        androidx.view.SavedStateWriter.m9409putSavedStateimpl(m9382constructorimpl, KEY_ARGS, bundle);
        androidx.view.SavedStateWriter.m9409putSavedStateimpl(m9382constructorimpl, KEY_SAVED_STATE, this.savedState);
        return bundleOf;
    }
}
