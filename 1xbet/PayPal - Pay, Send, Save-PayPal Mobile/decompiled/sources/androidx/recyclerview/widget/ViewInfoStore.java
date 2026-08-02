package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
class ViewInfoStore {
    final androidx.collection.SimpleArrayMap<androidx.recyclerview.widget.RecyclerView.ViewHolder, androidx.recyclerview.widget.ViewInfoStore.InfoRecord> getHighSpeedVideoFpsRangesFor = new androidx.collection.SimpleArrayMap<>();
    final androidx.collection.LongSparseArray<androidx.recyclerview.widget.RecyclerView.ViewHolder> getHighSpeedVideoSizes = new androidx.collection.LongSparseArray<>();

    interface ProcessCallback {
        void Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);

        void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);
    }

    ViewInfoStore() {
    }

    final void getHighSpeedVideoSizes() {
        this.getHighSpeedVideoFpsRangesFor.clear();
        this.getHighSpeedVideoSizes.clear();
    }

    final void getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord = this.getHighSpeedVideoFpsRangesFor.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.getHighResolutionOutputSizeshNQ4ISI();
            this.getHighSpeedVideoFpsRangesFor.put(viewHolder, infoRecord);
        }
        infoRecord.getHighSpeedVideoSizes = itemHolderInfo;
        infoRecord.Camera2StreamConfigurationMap |= 4;
    }

    final androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo getHighSpeedVideoSizes(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord valueAt;
        androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int indexOfKey = this.getHighSpeedVideoFpsRangesFor.indexOfKey(viewHolder);
        if (indexOfKey < 0 || (valueAt = this.getHighSpeedVideoFpsRangesFor.valueAt(indexOfKey)) == null || (valueAt.Camera2StreamConfigurationMap & i) == 0) {
            return null;
        }
        valueAt.Camera2StreamConfigurationMap &= ~i;
        if (i == 4) {
            itemHolderInfo = valueAt.getHighSpeedVideoSizes;
        } else if (i == 8) {
            itemHolderInfo = valueAt.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            throw new java.lang.IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((valueAt.Camera2StreamConfigurationMap & 12) == 0) {
            this.getHighSpeedVideoFpsRangesFor.removeAt(indexOfKey);
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.getHighSpeedVideoFpsRanges(valueAt);
        }
        return itemHolderInfo;
    }

    final androidx.recyclerview.widget.RecyclerView.ViewHolder getHighSpeedVideoFpsRanges(long j) {
        return this.getHighSpeedVideoSizes.get(j);
    }

    final void Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord = this.getHighSpeedVideoFpsRangesFor.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.getHighResolutionOutputSizeshNQ4ISI();
            this.getHighSpeedVideoFpsRangesFor.put(viewHolder, infoRecord);
        }
        infoRecord.getHighResolutionOutputSizeshNQ4ISI = itemHolderInfo;
        infoRecord.Camera2StreamConfigurationMap |= 8;
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord = this.getHighSpeedVideoFpsRangesFor.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = androidx.recyclerview.widget.ViewInfoStore.InfoRecord.getHighResolutionOutputSizeshNQ4ISI();
            this.getHighSpeedVideoFpsRangesFor.put(viewHolder, infoRecord);
        }
        infoRecord.Camera2StreamConfigurationMap |= 1;
    }

    final void Camera2StreamConfigurationMap(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord = this.getHighSpeedVideoFpsRangesFor.get(viewHolder);
        if (infoRecord == null) {
            return;
        }
        infoRecord.Camera2StreamConfigurationMap &= -2;
    }

    final void Camera2StreamConfigurationMap(androidx.recyclerview.widget.ViewInfoStore.ProcessCallback processCallback) {
        for (int camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.getCamera2StreamConfigurationMap() - 1; camera2StreamConfigurationMap >= 0; camera2StreamConfigurationMap--) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder keyAt = this.getHighSpeedVideoFpsRangesFor.keyAt(camera2StreamConfigurationMap);
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord removeAt = this.getHighSpeedVideoFpsRangesFor.removeAt(camera2StreamConfigurationMap);
            if ((removeAt.Camera2StreamConfigurationMap & 3) == 3) {
                processCallback.getHighSpeedVideoFpsRanges(keyAt);
            } else if ((removeAt.Camera2StreamConfigurationMap & 1) != 0) {
                if (removeAt.getHighSpeedVideoSizes == null) {
                    processCallback.getHighSpeedVideoFpsRanges(keyAt);
                } else {
                    processCallback.Camera2StreamConfigurationMap(keyAt, removeAt.getHighSpeedVideoSizes, removeAt.getHighResolutionOutputSizeshNQ4ISI);
                }
            } else if ((removeAt.Camera2StreamConfigurationMap & 14) == 14) {
                processCallback.getHighSpeedVideoFpsRangesFor(keyAt, removeAt.getHighSpeedVideoSizes, removeAt.getHighResolutionOutputSizeshNQ4ISI);
            } else if ((removeAt.Camera2StreamConfigurationMap & 12) == 12) {
                processCallback.getHighSpeedVideoSizes(keyAt, removeAt.getHighSpeedVideoSizes, removeAt.getHighResolutionOutputSizeshNQ4ISI);
            } else if ((removeAt.Camera2StreamConfigurationMap & 4) != 0) {
                processCallback.Camera2StreamConfigurationMap(keyAt, removeAt.getHighSpeedVideoSizes, null);
            } else if ((removeAt.Camera2StreamConfigurationMap & 8) != 0) {
                processCallback.getHighSpeedVideoFpsRangesFor(keyAt, removeAt.getHighSpeedVideoSizes, removeAt.getHighResolutionOutputSizeshNQ4ISI);
            } else {
                int i = removeAt.Camera2StreamConfigurationMap;
            }
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.getHighSpeedVideoFpsRanges(removeAt);
        }
    }

    final void getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        int size = this.getHighSpeedVideoSizes.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (viewHolder == this.getHighSpeedVideoSizes.valueAt(size)) {
                this.getHighSpeedVideoSizes.removeAt(size);
                break;
            }
            size--;
        }
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord remove = this.getHighSpeedVideoFpsRangesFor.remove(viewHolder);
        if (remove != null) {
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord.getHighSpeedVideoFpsRanges(remove);
        }
    }

    static void Camera2StreamConfigurationMap() {
        androidx.recyclerview.widget.ViewInfoStore.InfoRecord.getHighSpeedVideoSizes();
    }

    static class InfoRecord {
        static androidx.core.util.Pools.Pool<androidx.recyclerview.widget.ViewInfoStore.InfoRecord> getHighSpeedVideoFpsRanges = new androidx.core.util.Pools.SimplePool(20);
        int Camera2StreamConfigurationMap;
        androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo getHighResolutionOutputSizeshNQ4ISI;
        androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemHolderInfo getHighSpeedVideoSizes;

        private InfoRecord() {
        }

        static androidx.recyclerview.widget.ViewInfoStore.InfoRecord getHighResolutionOutputSizeshNQ4ISI() {
            androidx.recyclerview.widget.ViewInfoStore.InfoRecord acquire = getHighSpeedVideoFpsRanges.acquire();
            return acquire == null ? new androidx.recyclerview.widget.ViewInfoStore.InfoRecord() : acquire;
        }

        static void getHighSpeedVideoFpsRanges(androidx.recyclerview.widget.ViewInfoStore.InfoRecord infoRecord) {
            infoRecord.Camera2StreamConfigurationMap = 0;
            infoRecord.getHighSpeedVideoSizes = null;
            infoRecord.getHighResolutionOutputSizeshNQ4ISI = null;
            getHighSpeedVideoFpsRanges.release(infoRecord);
        }

        static void getHighSpeedVideoSizes() {
            while (getHighSpeedVideoFpsRanges.acquire() != null) {
            }
        }
    }
}
