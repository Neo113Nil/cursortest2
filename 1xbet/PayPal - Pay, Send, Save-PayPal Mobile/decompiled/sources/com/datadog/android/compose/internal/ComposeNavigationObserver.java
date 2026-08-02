package com.datadog.android.compose.internal;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u001f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/datadog/android/compose/internal/ComposeNavigationObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "trackArguments", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Landroidx/navigation/NavDestination;", "destinationPredicate", "Landroidx/navigation/NavController;", "navController", "Lcom/datadog/android/rum/RumMonitor;", "rumMonitor", "<init>", "(ZLcom/datadog/android/rum/tracking/ComponentPredicate;Landroidx/navigation/NavController;Lcom/datadog/android/rum/RumMonitor;)V", "controller", "destination", "Landroid/os/Bundle;", "arguments", "", "onDestinationChanged", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V", "onDispose$dd_sdk_android_compose_release", "()V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Camera2StreamConfigurationMap", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "getHighSpeedVideoFpsRanges", "Landroidx/navigation/NavController;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/datadog/android/rum/RumMonitor;", "getHighSpeedVideoFpsRangesFor", "Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposeNavigationObserver implements androidx.view.LifecycleEventObserver, androidx.navigation.NavController.OnDestinationChangedListener {
    public static final int $stable = 8;
    private final com.datadog.android.rum.tracking.ComponentPredicate<androidx.view.NavDestination> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.view.NavController getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;
    private final com.datadog.android.rum.RumMonitor getHighSpeedVideoSizes;

    public ComposeNavigationObserver(boolean z, com.datadog.android.rum.tracking.ComponentPredicate<androidx.view.NavDestination> componentPredicate, androidx.view.NavController navController, com.datadog.android.rum.RumMonitor rumMonitor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumMonitor, "");
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = componentPredicate;
        this.getHighResolutionOutputSizeshNQ4ISI = navController;
        this.getHighSpeedVideoSizes = rumMonitor;
    }

    public /* synthetic */ ComposeNavigationObserver(boolean z, com.datadog.android.rum.tracking.AcceptAllNavDestinations acceptAllNavDestinations, androidx.view.NavController navController, com.datadog.android.rum.RumMonitor rumMonitor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? new com.datadog.android.rum.tracking.AcceptAllNavDestinations() : acceptAllNavDestinations, navController, rumMonitor);
    }

    @Override // androidx.view.LifecycleEventObserver
    public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        java.lang.String route;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event == androidx.lifecycle.Lifecycle.Event.ON_RESUME) {
            this.getHighResolutionOutputSizeshNQ4ISI.addOnDestinationChangedListener(this);
            return;
        }
        if (event == androidx.lifecycle.Lifecycle.Event.ON_PAUSE) {
            androidx.view.NavDestination currentDestination = this.getHighResolutionOutputSizeshNQ4ISI.getCurrentDestination();
            if (currentDestination != null && (route = currentDestination.getRoute()) != null) {
                com.datadog.android.rum.RumMonitor.DefaultImpls.stopView$default(this.getHighSpeedVideoSizes, route, null, 2, null);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.removeOnDestinationChangedListener(this);
        }
    }

    @Override // androidx.navigation.NavController.OnDestinationChangedListener
    public final void onDestinationChanged(androidx.view.NavController controller, androidx.view.NavDestination destination, android.os.Bundle arguments) {
        java.lang.String route;
        java.util.LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        if (!this.Camera2StreamConfigurationMap.accept(destination) || (route = destination.getRoute()) == null) {
            return;
        }
        java.lang.String viewName = this.Camera2StreamConfigurationMap.getViewName(destination);
        if (viewName == null) {
            viewName = route;
        }
        if (this.getHighSpeedVideoFpsRanges) {
            linkedHashMap = kotlin.collections.MapsKt.toMutableMap(com.datadog.android.rum.tracking.BundleExtKt.convertToRumViewAttributes(arguments));
        } else {
            linkedHashMap = new java.util.LinkedHashMap();
        }
        this.getHighSpeedVideoSizes.startView(route, viewName, com.datadog.android.internal.attributes.LocalAttributeKt.enrichWithConstantAttribute(linkedHashMap, com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Native.COMPOSE));
    }

    public final void onDispose$dd_sdk_android_compose_release() {
        this.getHighResolutionOutputSizeshNQ4ISI.removeOnDestinationChangedListener(this);
    }
}
