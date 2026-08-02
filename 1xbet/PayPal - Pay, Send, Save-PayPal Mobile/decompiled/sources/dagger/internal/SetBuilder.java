package dagger.internal;

/* loaded from: classes17.dex */
public final class SetBuilder<T> {
    private final java.util.List<T> getHighSpeedVideoFpsRanges;

    private SetBuilder(int i) {
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(i);
    }

    public static <T> dagger.internal.SetBuilder<T> newSetBuilder(int i) {
        return new dagger.internal.SetBuilder<>(i);
    }

    public final dagger.internal.SetBuilder<T> add(T t) {
        this.getHighSpeedVideoFpsRanges.add(dagger.internal.Preconditions.checkNotNull(t, "Set contributions cannot be null"));
        return this;
    }

    public final dagger.internal.SetBuilder<T> addAll(java.util.Collection<? extends T> collection) {
        java.util.Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            dagger.internal.Preconditions.checkNotNull(it.next(), "Set contributions cannot be null");
        }
        this.getHighSpeedVideoFpsRanges.addAll(collection);
        return this;
    }

    public final java.util.Set<T> build() {
        if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
            return java.util.Collections.emptySet();
        }
        if (this.getHighSpeedVideoFpsRanges.size() == 1) {
            return java.util.Collections.singleton(this.getHighSpeedVideoFpsRanges.get(0));
        }
        return java.util.Collections.unmodifiableSet(new java.util.HashSet(this.getHighSpeedVideoFpsRanges));
    }
}
