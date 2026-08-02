package dagger.hilt;

/* loaded from: classes3.dex */
public final class EntryPoints {
    @javax.annotation.Nonnull
    public static <T> T get(java.lang.Object obj, java.lang.Class<T> cls) {
        while (!(obj instanceof dagger.hilt.internal.GeneratedComponent)) {
            if (obj instanceof dagger.hilt.internal.GeneratedComponentManager) {
                obj = ((dagger.hilt.internal.GeneratedComponentManager) obj).generatedComponent();
            } else {
                throw new java.lang.IllegalStateException(java.lang.String.format("Given component holder %s does not implement %s or %s", obj.getClass(), dagger.hilt.internal.GeneratedComponent.class, dagger.hilt.internal.GeneratedComponentManager.class));
            }
        }
        if (obj instanceof dagger.hilt.internal.TestSingletonComponent) {
            java.lang.annotation.Annotation[] annotations = cls.getAnnotations();
            int length = annotations.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                    z = true;
                    break;
                }
                i++;
            }
            dagger.hilt.internal.Preconditions.checkState(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
        }
        return cls.cast(obj);
    }

    private EntryPoints() {
    }
}
