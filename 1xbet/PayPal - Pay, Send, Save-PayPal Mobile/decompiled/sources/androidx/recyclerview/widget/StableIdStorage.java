package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
interface StableIdStorage {

    public interface StableIdLookup {
        long localToGlobal(long j);
    }

    androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup();

    public static class NoStableIdStorage implements androidx.recyclerview.widget.StableIdStorage {
        private final androidx.recyclerview.widget.StableIdStorage.StableIdLookup getHighSpeedVideoFpsRangesFor = new androidx.recyclerview.widget.StableIdStorage.StableIdLookup() { // from class: androidx.recyclerview.widget.StableIdStorage.NoStableIdStorage.1
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                return -1L;
            }
        };

        @Override // androidx.recyclerview.widget.StableIdStorage
        public androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public static class SharedPoolStableIdStorage implements androidx.recyclerview.widget.StableIdStorage {
        private final androidx.recyclerview.widget.StableIdStorage.StableIdLookup Camera2StreamConfigurationMap = new androidx.recyclerview.widget.StableIdStorage.StableIdLookup() { // from class: androidx.recyclerview.widget.StableIdStorage.SharedPoolStableIdStorage.1
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                return j;
            }
        };

        @Override // androidx.recyclerview.widget.StableIdStorage
        public androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    public static class IsolatedStableIdStorage implements androidx.recyclerview.widget.StableIdStorage {
        long getHighSpeedVideoFpsRanges = 0;

        @Override // androidx.recyclerview.widget.StableIdStorage
        public androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup() {
            return new androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage.WrapperStableIdLookup();
        }

        class WrapperStableIdLookup implements androidx.recyclerview.widget.StableIdStorage.StableIdLookup {
            private final androidx.collection.LongSparseArray<java.lang.Long> getHighSpeedVideoFpsRangesFor = new androidx.collection.LongSparseArray<>();

            WrapperStableIdLookup() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                java.lang.Long l = this.getHighSpeedVideoFpsRangesFor.get(j);
                if (l == null) {
                    androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage isolatedStableIdStorage = androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage.this;
                    long j2 = isolatedStableIdStorage.getHighSpeedVideoFpsRanges;
                    isolatedStableIdStorage.getHighSpeedVideoFpsRanges = 1 + j2;
                    l = java.lang.Long.valueOf(j2);
                    this.getHighSpeedVideoFpsRangesFor.put(j, l);
                }
                return l.longValue();
            }
        }
    }
}
