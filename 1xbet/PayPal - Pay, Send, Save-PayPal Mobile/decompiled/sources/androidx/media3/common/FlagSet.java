package androidx.media3.common;

/* loaded from: classes7.dex */
public final class FlagSet {
    private final android.util.SparseBooleanArray getHighSpeedVideoSizes;

    /* synthetic */ FlagSet(android.util.SparseBooleanArray sparseBooleanArray, byte b) {
        this(sparseBooleanArray);
    }

    public static final class Builder {
        private final android.util.SparseBooleanArray getHighSpeedVideoFpsRangesFor = new android.util.SparseBooleanArray();
        private boolean getHighSpeedVideoSizes;

        public final androidx.media3.common.FlagSet.Builder add(int i) {
            com.google.common.base.Preconditions.checkState(!this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoFpsRangesFor.append(i, true);
            return this;
        }

        public final androidx.media3.common.FlagSet.Builder addIf(int i, boolean z) {
            return z ? add(i) : this;
        }

        public final androidx.media3.common.FlagSet.Builder addAll(int... iArr) {
            for (int i : iArr) {
                add(i);
            }
            return this;
        }

        public final androidx.media3.common.FlagSet.Builder addAll(androidx.media3.common.FlagSet flagSet) {
            for (int i = 0; i < flagSet.size(); i++) {
                add(flagSet.get(i));
            }
            return this;
        }

        public final androidx.media3.common.FlagSet.Builder remove(int i) {
            com.google.common.base.Preconditions.checkState(!this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoFpsRangesFor.delete(i);
            return this;
        }

        public final androidx.media3.common.FlagSet.Builder removeIf(int i, boolean z) {
            return z ? remove(i) : this;
        }

        public final androidx.media3.common.FlagSet.Builder removeAll(int... iArr) {
            for (int i : iArr) {
                remove(i);
            }
            return this;
        }

        public final androidx.media3.common.FlagSet build() {
            com.google.common.base.Preconditions.checkState(!this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoSizes = true;
            return new androidx.media3.common.FlagSet(this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        }
    }

    private FlagSet(android.util.SparseBooleanArray sparseBooleanArray) {
        this.getHighSpeedVideoSizes = sparseBooleanArray;
    }

    public final boolean contains(int i) {
        return this.getHighSpeedVideoSizes.get(i);
    }

    public final boolean containsAny(int... iArr) {
        for (int i : iArr) {
            if (contains(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAny(androidx.media3.common.FlagSet flagSet) {
        for (int i = 0; i < flagSet.size(); i++) {
            if (contains(flagSet.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final int size() {
        return this.getHighSpeedVideoSizes.size();
    }

    public final int get(int i) {
        com.google.common.base.Preconditions.checkElementIndex(i, size());
        return this.getHighSpeedVideoSizes.keyAt(i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.media3.common.FlagSet) {
            return this.getHighSpeedVideoSizes.equals(((androidx.media3.common.FlagSet) obj).getHighSpeedVideoSizes);
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }
}
