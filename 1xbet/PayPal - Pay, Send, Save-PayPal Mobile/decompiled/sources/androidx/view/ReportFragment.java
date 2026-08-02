package androidx.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001b\u001c\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019"}, d2 = {"Landroidx/lifecycle/ReportFragment;", "Landroid/app/Fragment;", "<init>", "()V", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Landroidx/lifecycle/Lifecycle$Event;", "Camera2StreamConfigurationMap", "(Landroidx/lifecycle/Lifecycle$Event;)V", "processListener", "setProcessListener", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "Companion", "ActivityInitializationListener", "LifecycleCallbacks"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class ReportFragment extends android.app.Fragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.ReportFragment.Companion INSTANCE = new androidx.view.ReportFragment.Companion(null);
    private androidx.lifecycle.ReportFragment.ActivityInitializationListener getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "", "", "onCreate", "()V", "onStart", "onResume"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    private static void getHighSpeedVideoFpsRangesFor(androidx.lifecycle.ReportFragment.ActivityInitializationListener p0) {
        if (p0 != null) {
            p0.onCreate();
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(androidx.lifecycle.ReportFragment.ActivityInitializationListener p0) {
        if (p0 != null) {
            p0.onStart();
        }
    }

    private static void getHighSpeedVideoFpsRanges(androidx.lifecycle.ReportFragment.ActivityInitializationListener p0) {
        if (p0 != null) {
            p0.onResume();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
        Camera2StreamConfigurationMap(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
        Camera2StreamConfigurationMap(androidx.lifecycle.Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI);
        Camera2StreamConfigurationMap(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        Camera2StreamConfigurationMap(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        Camera2StreamConfigurationMap(androidx.lifecycle.Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Camera2StreamConfigurationMap(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    private final void Camera2StreamConfigurationMap(androidx.lifecycle.Lifecycle.Event p0) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            androidx.view.ReportFragment.Companion companion = INSTANCE;
            android.app.Activity activity = getActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activity, "");
            companion.dispatch$lifecycle_runtime(activity, p0);
        }
    }

    public final void setProcessListener(androidx.lifecycle.ReportFragment.ActivityInitializationListener processListener) {
        this.getHighResolutionOutputSizeshNQ4ISI = processListener;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u000e"}, d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "bundle", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "savedInstanceState", "onActivityPostCreated", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityPostStarted", "onActivityResumed", "onActivityPostResumed", "onActivityPrePaused", "onActivityPaused", "onActivityPreStopped", "onActivityStopped", "onActivitySaveInstanceState", "onActivityPreDestroyed", "onActivityDestroyed", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class LifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion INSTANCE = new androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion(null);

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            androidx.view.ReportFragment.INSTANCE.dispatch$lifecycle_runtime(activity, androidx.lifecycle.Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostStarted(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            androidx.view.ReportFragment.INSTANCE.dispatch$lifecycle_runtime(activity, androidx.lifecycle.Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPostResumed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            androidx.view.ReportFragment.INSTANCE.dispatch$lifecycle_runtime(activity, androidx.lifecycle.Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPrePaused(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            androidx.view.ReportFragment.INSTANCE.dispatch$lifecycle_runtime(activity, androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreStopped(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            androidx.view.ReportFragment.INSTANCE.dispatch$lifecycle_runtime(activity, androidx.lifecycle.Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreDestroyed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            androidx.view.ReportFragment.INSTANCE.dispatch$lifecycle_runtime(activity, androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "registerIn", "(Landroid/app/Activity;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final void registerIn(android.app.Activity activity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
                activity.registerActivityLifecycleCallbacks(new androidx.lifecycle.ReportFragment.LifecycleCallbacks());
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        }

        @kotlin.jvm.JvmStatic
        public static final void registerIn(android.app.Activity activity) {
            INSTANCE.registerIn(activity);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0011\u001a\u00020\r*\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/lifecycle/ReportFragment$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "injectIfNeededIn", "(Landroid/app/Activity;)V", "Landroidx/lifecycle/Lifecycle$Event;", "event", "dispatch$lifecycle_runtime", "(Landroid/app/Activity;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/ReportFragment;", "get", "(Landroid/app/Activity;)Landroidx/lifecycle/ReportFragment;", "get$annotations", "reportFragment"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void get$annotations(android.app.Activity activity) {
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final void injectIfNeededIn(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                androidx.lifecycle.ReportFragment.LifecycleCallbacks.INSTANCE.registerIn(activity);
            }
            android.app.FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new androidx.view.ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        public final void dispatch$lifecycle_runtime(android.app.Activity activity, androidx.lifecycle.Lifecycle.Event event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            if (activity instanceof androidx.view.LifecycleRegistryOwner) {
                ((androidx.view.LifecycleRegistryOwner) activity).getLifecycle().handleLifecycleEvent(event);
            } else if (activity instanceof androidx.view.LifecycleOwner) {
                androidx.view.Lifecycle lifecycle = ((androidx.view.LifecycleOwner) activity).getLifecycle();
                if (lifecycle instanceof androidx.view.LifecycleRegistry) {
                    ((androidx.view.LifecycleRegistry) lifecycle).handleLifecycleEvent(event);
                }
            }
        }

        public final androidx.view.ReportFragment get(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            android.app.Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.Intrinsics.checkNotNull(findFragmentByTag, "");
            return (androidx.view.ReportFragment) findFragmentByTag;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final void injectIfNeededIn(android.app.Activity activity) {
        INSTANCE.injectIfNeededIn(activity);
    }

    public static final androidx.view.ReportFragment get(android.app.Activity activity) {
        return INSTANCE.get(activity);
    }
}
