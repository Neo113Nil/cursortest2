package dagger.hilt.android.internal.managers;

/* loaded from: classes17.dex */
public final class BroadcastReceiverComponentManager {
    public static java.lang.Object generatedComponent(android.content.Context context) {
        android.content.ComponentCallbacks2 application = dagger.hilt.android.internal.Contexts.getApplication(context.getApplicationContext());
        dagger.hilt.internal.Preconditions.checkArgument(application instanceof dagger.hilt.internal.GeneratedComponentManager, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((dagger.hilt.internal.GeneratedComponentManager) application).generatedComponent();
    }

    private BroadcastReceiverComponentManager() {
    }
}
