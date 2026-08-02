package dagger.internal;

/* loaded from: classes17.dex */
public final class InstanceFactory<T> implements dagger.internal.Factory<T>, dagger.Lazy<T> {
    private static final dagger.internal.InstanceFactory<java.lang.Object> getHighSpeedVideoSizes = new dagger.internal.InstanceFactory<>(null);
    private final T getHighSpeedVideoFpsRangesFor;

    public static <T> dagger.internal.Factory<T> create(T t) {
        return new dagger.internal.InstanceFactory(dagger.internal.Preconditions.checkNotNull(t, "instance cannot be null"));
    }

    private InstanceFactory(T t) {
        this.getHighSpeedVideoFpsRangesFor = t;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final T get() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static <T> dagger.internal.Factory<T> createNullable(T t) {
        if (t != null) {
            return new dagger.internal.InstanceFactory(t);
        }
        return getHighSpeedVideoSizes;
    }
}
