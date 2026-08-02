package dagger.hilt.android.migration;

/* loaded from: classes17.dex */
public final class OptionalInjectCheck {
    public static boolean wasInjectedByHilt(androidx.view.ComponentActivity componentActivity) {
        return getHighSpeedVideoSizes(componentActivity);
    }

    public static boolean wasInjectedByHilt(android.content.BroadcastReceiver broadcastReceiver) {
        return getHighSpeedVideoSizes(broadcastReceiver);
    }

    public static boolean wasInjectedByHilt(androidx.fragment.app.Fragment fragment) {
        return getHighSpeedVideoSizes(fragment);
    }

    public static boolean wasInjectedByHilt(android.app.Service service) {
        return getHighSpeedVideoSizes(service);
    }

    public static boolean wasInjectedByHilt(android.view.View view) {
        return getHighSpeedVideoSizes(view);
    }

    private static boolean getHighSpeedVideoSizes(java.lang.Object obj) {
        dagger.hilt.internal.Preconditions.checkNotNull(obj);
        dagger.hilt.internal.Preconditions.checkArgument(obj instanceof dagger.hilt.android.internal.migration.InjectedByHilt, "'%s' is not an optionally injected android entry point. Check that you have annotated the class with both @AndroidEntryPoint and @OptionalInject.", obj.getClass());
        return ((dagger.hilt.android.internal.migration.InjectedByHilt) obj).wasInjectedByHilt();
    }

    private OptionalInjectCheck() {
    }
}
