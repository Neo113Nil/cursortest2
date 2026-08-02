package dagger.hilt.android;

/* loaded from: classes3.dex */
public final class EarlyEntryPoints {
    @javax.annotation.Nonnull
    public static <T> T get(android.content.Context context, java.lang.Class<T> cls) {
        android.content.ComponentCallbacks2 application = dagger.hilt.android.internal.Contexts.getApplication(context);
        dagger.hilt.internal.Preconditions.checkState(application instanceof dagger.hilt.internal.GeneratedComponentManagerHolder, "Expected application to implement GeneratedComponentManagerHolder. Check that you're passing in an application context that uses Hilt. Application class found: %s", application.getClass());
        dagger.hilt.internal.GeneratedComponentManager<?> componentManager = ((dagger.hilt.internal.GeneratedComponentManagerHolder) application).componentManager();
        if (!(componentManager instanceof dagger.hilt.internal.TestSingletonComponentManager)) {
            return (T) dagger.hilt.EntryPoints.get(application, cls);
        }
        java.lang.annotation.Annotation[] annotations = cls.getAnnotations();
        int length = annotations.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (annotations[i].annotationType().equals(dagger.hilt.android.EarlyEntryPoint.class)) {
                z = true;
                break;
            }
            i++;
        }
        dagger.hilt.internal.Preconditions.checkState(z, "%s should be called with EntryPoints.get() rather than EarlyEntryPoints.get()", cls.getCanonicalName());
        return cls.cast(((dagger.hilt.internal.TestSingletonComponentManager) componentManager).earlySingletonComponent());
    }

    private EarlyEntryPoints() {
    }
}
