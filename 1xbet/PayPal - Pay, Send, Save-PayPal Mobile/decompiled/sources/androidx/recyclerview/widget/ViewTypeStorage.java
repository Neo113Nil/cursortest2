package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
interface ViewTypeStorage {

    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int i);

        int localToGlobal(int i);
    }

    androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper);

    androidx.recyclerview.widget.NestedAdapterWrapper getWrapperForGlobalType(int i);

    public static class SharedIdRangeViewTypeStorage implements androidx.recyclerview.widget.ViewTypeStorage {
        android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> getHighSpeedVideoFpsRanges = new android.util.SparseArray<>();

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public androidx.recyclerview.widget.NestedAdapterWrapper getWrapperForGlobalType(int i) {
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> list = this.getHighSpeedVideoFpsRanges.get(i);
            if (list == null || list.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Cannot find the wrapper for global view type ".concat(java.lang.String.valueOf(i)));
            }
            return list.get(0);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
            return new androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage.WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        class WrapperViewTypeLookup implements androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup {
            final androidx.recyclerview.widget.NestedAdapterWrapper getHighSpeedVideoSizes;

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                return i;
            }

            WrapperViewTypeLookup(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
                this.getHighSpeedVideoSizes = nestedAdapterWrapper;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> list = androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage.this.getHighSpeedVideoFpsRanges.get(i);
                if (list == null) {
                    list = new java.util.ArrayList<>();
                    androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage.this.getHighSpeedVideoFpsRanges.put(i, list);
                }
                if (!list.contains(this.getHighSpeedVideoSizes)) {
                    list.add(this.getHighSpeedVideoSizes);
                }
                return i;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage sharedIdRangeViewTypeStorage = androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage.this;
                androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = this.getHighSpeedVideoSizes;
                for (int size = sharedIdRangeViewTypeStorage.getHighSpeedVideoFpsRanges.size() - 1; size >= 0; size--) {
                    java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> valueAt = sharedIdRangeViewTypeStorage.getHighSpeedVideoFpsRanges.valueAt(size);
                    if (valueAt.remove(nestedAdapterWrapper) && valueAt.isEmpty()) {
                        sharedIdRangeViewTypeStorage.getHighSpeedVideoFpsRanges.removeAt(size);
                    }
                }
            }
        }
    }

    public static class IsolatedViewTypeStorage implements androidx.recyclerview.widget.ViewTypeStorage {
        android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> Camera2StreamConfigurationMap = new android.util.SparseArray<>();
        int getHighResolutionOutputSizeshNQ4ISI = 0;

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public androidx.recyclerview.widget.NestedAdapterWrapper getWrapperForGlobalType(int i) {
            androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = this.Camera2StreamConfigurationMap.get(i);
            if (nestedAdapterWrapper != null) {
                return nestedAdapterWrapper;
            }
            throw new java.lang.IllegalArgumentException("Cannot find the wrapper for global view type ".concat(java.lang.String.valueOf(i)));
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
            return new androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage.WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        class WrapperViewTypeLookup implements androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup {
            final androidx.recyclerview.widget.NestedAdapterWrapper Camera2StreamConfigurationMap;
            private android.util.SparseIntArray getHighResolutionOutputSizeshNQ4ISI = new android.util.SparseIntArray(1);
            private android.util.SparseIntArray getHighSpeedVideoSizes = new android.util.SparseIntArray(1);

            WrapperViewTypeLookup(androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper) {
                this.Camera2StreamConfigurationMap = nestedAdapterWrapper;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                int indexOfKey = this.getHighResolutionOutputSizeshNQ4ISI.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.getHighResolutionOutputSizeshNQ4ISI.valueAt(indexOfKey);
                }
                androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage isolatedViewTypeStorage = androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage.this;
                androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = this.Camera2StreamConfigurationMap;
                int i2 = isolatedViewTypeStorage.getHighResolutionOutputSizeshNQ4ISI;
                isolatedViewTypeStorage.getHighResolutionOutputSizeshNQ4ISI = i2 + 1;
                isolatedViewTypeStorage.Camera2StreamConfigurationMap.put(i2, nestedAdapterWrapper);
                this.getHighResolutionOutputSizeshNQ4ISI.put(i, i2);
                this.getHighSpeedVideoSizes.put(i2, i);
                return i2;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                int indexOfKey = this.getHighSpeedVideoSizes.indexOfKey(i);
                if (indexOfKey < 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("requested global type ");
                    sb.append(i);
                    sb.append(" does not belong to the adapter:");
                    sb.append(this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor);
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                return this.getHighSpeedVideoSizes.valueAt(indexOfKey);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage isolatedViewTypeStorage = androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage.this;
                androidx.recyclerview.widget.NestedAdapterWrapper nestedAdapterWrapper = this.Camera2StreamConfigurationMap;
                for (int size = isolatedViewTypeStorage.Camera2StreamConfigurationMap.size() - 1; size >= 0; size--) {
                    if (isolatedViewTypeStorage.Camera2StreamConfigurationMap.valueAt(size) == nestedAdapterWrapper) {
                        isolatedViewTypeStorage.Camera2StreamConfigurationMap.removeAt(size);
                    }
                }
            }
        }
    }
}
