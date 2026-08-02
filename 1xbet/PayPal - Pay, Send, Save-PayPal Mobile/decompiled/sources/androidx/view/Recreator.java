package androidx.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/savedstate/SavedStateRegistryOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "<init>", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/savedstate/SavedStateRegistryOwner;", "getHighSpeedVideoFpsRangesFor", "Companion", "SavedStateProvider"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Recreator implements androidx.view.LifecycleEventObserver {
    public static final java.lang.String CLASSES_KEY = "classes_to_restore";
    public static final java.lang.String COMPONENT_KEY = "androidx.savedstate.Restarter";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.SavedStateRegistryOwner getHighSpeedVideoFpsRangesFor;

    public Recreator(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        this.getHighSpeedVideoFpsRangesFor = savedStateRegistryOwner;
    }

    @Override // androidx.view.LifecycleEventObserver
    public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event != androidx.lifecycle.Lifecycle.Event.ON_CREATE) {
            throw new java.lang.AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().removeObserver(this);
        android.os.Bundle consumeRestoredStateForKey = this.getHighSpeedVideoFpsRangesFor.getSavedStateRegistry().consumeRestoredStateForKey(COMPONENT_KEY);
        if (consumeRestoredStateForKey != null) {
            java.util.List<java.lang.String> m9371getStringListOrNullimpl = androidx.view.SavedStateReader.m9371getStringListOrNullimpl(androidx.view.SavedStateReader.m9296constructorimpl(consumeRestoredStateForKey), CLASSES_KEY);
            if (m9371getStringListOrNullimpl == null) {
                throw new java.lang.IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"".toString());
            }
            for (java.lang.String str : m9371getStringListOrNullimpl) {
                try {
                    java.lang.Class<? extends U> asSubclass = java.lang.Class.forName(str, false, androidx.view.Recreator.class.getClassLoader()).asSubclass(androidx.savedstate.SavedStateRegistry.AutoRecreated.class);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(asSubclass);
                    try {
                        java.lang.reflect.Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new java.lang.Class[0]);
                        declaredConstructor.setAccessible(true);
                        try {
                            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance);
                            ((androidx.savedstate.SavedStateRegistry.AutoRecreated) newInstance).onRecreated(this.getHighSpeedVideoFpsRangesFor);
                        } catch (java.lang.Exception e) {
                            throw new java.lang.RuntimeException("Failed to instantiate ".concat(java.lang.String.valueOf(str)), e);
                        }
                    } catch (java.lang.NoSuchMethodException e2) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Class ");
                        sb.append(asSubclass.getSimpleName());
                        sb.append(" must have default constructor in order to be automatically recreated");
                        throw new java.lang.IllegalStateException(sb.toString(), e2);
                    }
                } catch (java.lang.ClassNotFoundException e3) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Class ");
                    sb2.append(str);
                    sb2.append(" wasn't found");
                    throw new java.lang.RuntimeException(sb2.toString(), e3);
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry;", "registry", "<init>", "(Landroidx/savedstate/SavedStateRegistry;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "saveState", "()Landroid/os/Bundle;", "", "className", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/String;)V", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SavedStateProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.util.Set<java.lang.String> getHighSpeedVideoSizes;

        public SavedStateProvider(androidx.view.SavedStateRegistry savedStateRegistry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistry, "");
            this.getHighSpeedVideoSizes = new java.util.LinkedHashSet();
            savedStateRegistry.registerSavedStateProvider(androidx.view.Recreator.COMPONENT_KEY, this);
        }

        public final void add(java.lang.String className) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "");
            this.getHighSpeedVideoSizes.add(className);
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        public final android.os.Bundle saveState() {
            kotlin.Pair[] pairArr;
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
            androidx.view.SavedStateWriter.m9417putStringListimpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf), androidx.view.Recreator.CLASSES_KEY, kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoSizes));
            return bundleOf;
        }
    }
}
