package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public class AsyncListUtil<T> {
    final androidx.recyclerview.widget.AsyncListUtil.DataCallback<T> getHighSpeedVideoFpsRanges;
    final androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    final androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> getHighSpeedVideoSizesFor;
    final java.lang.Class<T> getInputSizeshNQ4ISI;
    final int getOutputSizes;
    final androidx.recyclerview.widget.TileList<T> getOutputSizeshNQ4ISI;
    final androidx.recyclerview.widget.AsyncListUtil.ViewCallback getOutputStallDurationlomOqCM;
    private final androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> getValidOutputFormatsForInputhNQ4ISI;
    private final androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> unwrapAs;
    final int[] getOutputStallDuration = new int[2];
    final int[] getInputFormats = new int[2];
    final int[] getOutputMinFrameDurationlomOqCM = new int[2];
    private int isOutputSupportedFor = 0;
    int getHighResolutionOutputSizeshNQ4ISI = 0;
    int Camera2StreamConfigurationMap = 0;
    int getOutputMinFrameDuration = 0;
    final android.util.SparseIntArray getOutputFormats = new android.util.SparseIntArray();

    public static abstract class DataCallback<T> {
        public abstract void fillData(T[] tArr, int i, int i2);

        public int getMaxCachedTiles() {
            return 10;
        }

        public void recycleData(T[] tArr, int i) {
        }

        public abstract int refreshData();
    }

    public AsyncListUtil(java.lang.Class<T> cls, int i, androidx.recyclerview.widget.AsyncListUtil.DataCallback<T> dataCallback, androidx.recyclerview.widget.AsyncListUtil.ViewCallback viewCallback) {
        androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> mainThreadCallback = new androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.1
            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void addTile(int i2, androidx.recyclerview.widget.TileList.Tile<T> tile) {
                androidx.recyclerview.widget.TileList.Tile<T> tile2;
                if (i2 != androidx.recyclerview.widget.AsyncListUtil.this.getOutputMinFrameDuration) {
                    androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoFpsRangesFor.recycleTile(tile);
                    return;
                }
                androidx.recyclerview.widget.TileList<T> tileList = androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizeshNQ4ISI;
                int indexOfKey = tileList.getHighSpeedVideoSizes.indexOfKey(tile.mStartPosition);
                if (indexOfKey < 0) {
                    tileList.getHighSpeedVideoSizes.put(tile.mStartPosition, tile);
                    tile2 = null;
                } else {
                    androidx.recyclerview.widget.TileList.Tile<T> valueAt = tileList.getHighSpeedVideoSizes.valueAt(indexOfKey);
                    tileList.getHighSpeedVideoSizes.setValueAt(indexOfKey, tile);
                    if (tileList.getHighSpeedVideoFpsRangesFor == valueAt) {
                        tileList.getHighSpeedVideoFpsRangesFor = tile;
                    }
                    tile2 = valueAt;
                }
                if (tile2 != null) {
                    int i3 = tile2.mStartPosition;
                    androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoFpsRangesFor.recycleTile(tile2);
                }
                int i4 = tile.mStartPosition;
                int i5 = tile.mItemCount;
                int i6 = 0;
                while (i6 < androidx.recyclerview.widget.AsyncListUtil.this.getOutputFormats.size()) {
                    int keyAt = androidx.recyclerview.widget.AsyncListUtil.this.getOutputFormats.keyAt(i6);
                    if (tile.mStartPosition > keyAt || keyAt >= i4 + i5) {
                        i6++;
                    } else {
                        androidx.recyclerview.widget.AsyncListUtil.this.getOutputFormats.removeAt(i6);
                        androidx.recyclerview.widget.AsyncListUtil.this.getOutputStallDurationlomOqCM.onItemLoaded(keyAt);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void removeTile(int i2, int i3) {
                if (i2 == androidx.recyclerview.widget.AsyncListUtil.this.getOutputMinFrameDuration) {
                    androidx.recyclerview.widget.TileList<T> tileList = androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizeshNQ4ISI;
                    androidx.recyclerview.widget.TileList.Tile<T> tile = tileList.getHighSpeedVideoSizes.get(i3);
                    if (tileList.getHighSpeedVideoFpsRangesFor == tile) {
                        tileList.getHighSpeedVideoFpsRangesFor = null;
                    }
                    tileList.getHighSpeedVideoSizes.delete(i3);
                    if (tile == null) {
                        return;
                    }
                    androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoFpsRangesFor.recycleTile(tile);
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void updateItemCount(int i2, int i3) {
                if (i2 == androidx.recyclerview.widget.AsyncListUtil.this.getOutputMinFrameDuration) {
                    androidx.recyclerview.widget.AsyncListUtil.this.getHighResolutionOutputSizeshNQ4ISI = i3;
                    androidx.recyclerview.widget.AsyncListUtil.this.getOutputStallDurationlomOqCM.onDataRefresh();
                    androidx.recyclerview.widget.AsyncListUtil asyncListUtil = androidx.recyclerview.widget.AsyncListUtil.this;
                    asyncListUtil.Camera2StreamConfigurationMap = asyncListUtil.getOutputMinFrameDuration;
                    int i4 = 0;
                    while (i4 < androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizeshNQ4ISI.getHighSpeedVideoSizes.size()) {
                        androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> backgroundCallback = androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoFpsRangesFor;
                        androidx.recyclerview.widget.TileList<T> tileList = androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizeshNQ4ISI;
                        backgroundCallback.recycleTile((i4 < 0 || i4 >= tileList.getHighSpeedVideoSizes.size()) ? null : tileList.getHighSpeedVideoSizes.valueAt(i4));
                        i4++;
                    }
                    androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizeshNQ4ISI.getHighSpeedVideoSizes.clear();
                    androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoSizes = false;
                    androidx.recyclerview.widget.AsyncListUtil.this.getHighResolutionOutputSizeshNQ4ISI();
                }
            }
        };
        this.unwrapAs = mainThreadCallback;
        androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> backgroundCallback = new androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.2
            private int getHighResolutionOutputSizeshNQ4ISI;
            private int getHighSpeedVideoFpsRanges;
            private int getHighSpeedVideoFpsRangesFor;
            final android.util.SparseBooleanArray getHighSpeedVideoSizes = new android.util.SparseBooleanArray();
            private androidx.recyclerview.widget.TileList.Tile<T> getInputFormats;
            private int getOutputFormats;

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void refresh(int i2) {
                this.getHighResolutionOutputSizeshNQ4ISI = i2;
                this.getHighSpeedVideoSizes.clear();
                this.getHighSpeedVideoFpsRanges = androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoFpsRanges.refreshData();
                androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoSizesFor.updateItemCount(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
            }

            private void getHighResolutionOutputSizeshNQ4ISI(int i2, int i3, int i4, boolean z) {
                int i5 = i2;
                while (i5 <= i3) {
                    androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoFpsRangesFor.loadTile(z ? (i3 + i2) - i5 : i5, i4);
                    i5 += androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizes;
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void recycleTile(androidx.recyclerview.widget.TileList.Tile<T> tile) {
                androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoFpsRanges.recycleData(tile.mItems, tile.mItemCount);
                tile.Camera2StreamConfigurationMap = this.getInputFormats;
                this.getInputFormats = tile;
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void loadTile(int i2, int i3) {
                if (this.getHighSpeedVideoSizes.get(i2)) {
                    return;
                }
                androidx.recyclerview.widget.TileList.Tile<T> tile = this.getInputFormats;
                if (tile != null) {
                    this.getInputFormats = tile.Camera2StreamConfigurationMap;
                } else {
                    tile = new androidx.recyclerview.widget.TileList.Tile<>(androidx.recyclerview.widget.AsyncListUtil.this.getInputSizeshNQ4ISI, androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizes);
                }
                tile.mStartPosition = i2;
                tile.mItemCount = java.lang.Math.min(androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizes, this.getHighSpeedVideoFpsRanges - tile.mStartPosition);
                androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoFpsRanges.fillData(tile.mItems, tile.mStartPosition, tile.mItemCount);
                int maxCachedTiles = androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoFpsRanges.getMaxCachedTiles();
                while (this.getHighSpeedVideoSizes.size() >= maxCachedTiles) {
                    int keyAt = this.getHighSpeedVideoSizes.keyAt(0);
                    android.util.SparseBooleanArray sparseBooleanArray = this.getHighSpeedVideoSizes;
                    int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                    int i4 = this.getHighSpeedVideoFpsRangesFor - keyAt;
                    int i5 = keyAt2 - this.getOutputFormats;
                    if (i4 > 0 && (i4 >= i5 || i3 == 2)) {
                        this.getHighSpeedVideoSizes.delete(keyAt);
                        androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoSizesFor.removeTile(this.getHighResolutionOutputSizeshNQ4ISI, keyAt);
                    } else {
                        if (i5 <= 0 || (i4 >= i5 && i3 != 1)) {
                            break;
                        }
                        this.getHighSpeedVideoSizes.delete(keyAt2);
                        androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoSizesFor.removeTile(this.getHighResolutionOutputSizeshNQ4ISI, keyAt2);
                    }
                }
                this.getHighSpeedVideoSizes.put(tile.mStartPosition, true);
                androidx.recyclerview.widget.AsyncListUtil.this.getHighSpeedVideoSizesFor.addTile(this.getHighResolutionOutputSizeshNQ4ISI, tile);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void updateRange(int i2, int i3, int i4, int i5, int i6) {
                if (i2 > i3) {
                    return;
                }
                int i7 = i2 - (i2 % androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizes);
                int i8 = i3 - (i3 % androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizes);
                this.getHighSpeedVideoFpsRangesFor = i4 - (i4 % androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizes);
                int i9 = i5 - (i5 % androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizes);
                this.getOutputFormats = i9;
                if (i6 == 1) {
                    getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, i8, i6, true);
                    getHighResolutionOutputSizeshNQ4ISI(i8 + androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizes, this.getOutputFormats, i6, false);
                } else {
                    getHighResolutionOutputSizeshNQ4ISI(i7, i9, i6, false);
                    getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, i7 - androidx.recyclerview.widget.AsyncListUtil.this.getOutputSizes, i6, true);
                }
            }
        };
        this.getValidOutputFormatsForInputhNQ4ISI = backgroundCallback;
        this.getInputSizeshNQ4ISI = cls;
        this.getOutputSizes = i;
        this.getHighSpeedVideoFpsRanges = dataCallback;
        this.getOutputStallDurationlomOqCM = viewCallback;
        this.getOutputSizeshNQ4ISI = new androidx.recyclerview.widget.TileList<>(i);
        androidx.recyclerview.widget.MessageThreadUtil messageThreadUtil = new androidx.recyclerview.widget.MessageThreadUtil();
        this.getHighSpeedVideoSizesFor = messageThreadUtil.getHighSpeedVideoFpsRanges(mainThreadCallback);
        this.getHighSpeedVideoFpsRangesFor = messageThreadUtil.getHighSpeedVideoFpsRanges(backgroundCallback);
        refresh();
    }

    public void refresh() {
        this.getOutputFormats.clear();
        androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> backgroundCallback = this.getHighSpeedVideoFpsRangesFor;
        int i = this.getOutputMinFrameDuration + 1;
        this.getOutputMinFrameDuration = i;
        backgroundCallback.refresh(i);
    }

    public T getItem(int i) {
        T t;
        int i2;
        if (i < 0 || i >= this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i);
            sb.append(" is not within 0 and ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        androidx.recyclerview.widget.TileList<T> tileList = this.getOutputSizeshNQ4ISI;
        androidx.recyclerview.widget.TileList.Tile<T> tile = tileList.getHighSpeedVideoFpsRangesFor;
        if (tile == null || (i2 = tile.mStartPosition) > i || i >= i2 + tile.mItemCount) {
            int indexOfKey = tileList.getHighSpeedVideoSizes.indexOfKey(i - (i % tileList.getHighResolutionOutputSizeshNQ4ISI));
            if (indexOfKey >= 0) {
                tileList.getHighSpeedVideoFpsRangesFor = tileList.getHighSpeedVideoSizes.valueAt(indexOfKey);
            } else {
                t = null;
                if (t == null && this.getOutputMinFrameDuration == this.Camera2StreamConfigurationMap) {
                    this.getOutputFormats.put(i, 0);
                }
                return t;
            }
        }
        androidx.recyclerview.widget.TileList.Tile<T> tile2 = tileList.getHighSpeedVideoFpsRangesFor;
        t = tile2.mItems[i - tile2.mStartPosition];
        if (t == null) {
            this.getOutputFormats.put(i, 0);
        }
        return t;
    }

    public int getItemCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        int i;
        this.getOutputStallDurationlomOqCM.getItemRangeInto(this.getOutputStallDuration);
        int[] iArr = this.getOutputStallDuration;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 > i3 || i2 < 0 || i3 >= this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (this.getHighSpeedVideoSizes) {
            int[] iArr2 = this.getInputFormats;
            if (i2 <= iArr2[1] && (i = iArr2[0]) <= i3) {
                if (i2 < i) {
                    this.isOutputSupportedFor = 1;
                } else if (i2 > i) {
                    this.isOutputSupportedFor = 2;
                }
                int[] iArr3 = this.getInputFormats;
                iArr3[0] = i2;
                iArr3[1] = i3;
                this.getOutputStallDurationlomOqCM.extendRangeInto(iArr, this.getOutputMinFrameDurationlomOqCM, this.isOutputSupportedFor);
                int[] iArr4 = this.getOutputMinFrameDurationlomOqCM;
                iArr4[0] = java.lang.Math.min(this.getOutputStallDuration[0], java.lang.Math.max(iArr4[0], 0));
                int[] iArr5 = this.getOutputMinFrameDurationlomOqCM;
                iArr5[1] = java.lang.Math.max(this.getOutputStallDuration[1], java.lang.Math.min(iArr5[1], this.getHighResolutionOutputSizeshNQ4ISI - 1));
                androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> backgroundCallback = this.getHighSpeedVideoFpsRangesFor;
                int[] iArr6 = this.getOutputStallDuration;
                int i4 = iArr6[0];
                int i5 = iArr6[1];
                int[] iArr7 = this.getOutputMinFrameDurationlomOqCM;
                backgroundCallback.updateRange(i4, i5, iArr7[0], iArr7[1], this.isOutputSupportedFor);
            }
        }
        this.isOutputSupportedFor = 0;
        int[] iArr32 = this.getInputFormats;
        iArr32[0] = i2;
        iArr32[1] = i3;
        this.getOutputStallDurationlomOqCM.extendRangeInto(iArr, this.getOutputMinFrameDurationlomOqCM, this.isOutputSupportedFor);
        int[] iArr42 = this.getOutputMinFrameDurationlomOqCM;
        iArr42[0] = java.lang.Math.min(this.getOutputStallDuration[0], java.lang.Math.max(iArr42[0], 0));
        int[] iArr52 = this.getOutputMinFrameDurationlomOqCM;
        iArr52[1] = java.lang.Math.max(this.getOutputStallDuration[1], java.lang.Math.min(iArr52[1], this.getHighResolutionOutputSizeshNQ4ISI - 1));
        androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> backgroundCallback2 = this.getHighSpeedVideoFpsRangesFor;
        int[] iArr62 = this.getOutputStallDuration;
        int i42 = iArr62[0];
        int i52 = iArr62[1];
        int[] iArr72 = this.getOutputMinFrameDurationlomOqCM;
        backgroundCallback2.updateRange(i42, i52, iArr72[0], iArr72[1], this.isOutputSupportedFor);
    }

    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        public abstract void getItemRangeInto(int[] iArr);

        public abstract void onDataRefresh();

        public abstract void onItemLoaded(int i);

        public void extendRangeInto(int[] iArr, int[] iArr2, int i) {
            int i2 = iArr[1];
            int i3 = iArr[0];
            int i4 = (i2 - i3) + 1;
            int i5 = i4 / 2;
            iArr2[0] = i3 - (i == 1 ? i4 : i5);
            if (i != 2) {
                i4 = i5;
            }
            iArr2[1] = i2 + i4;
        }
    }

    public void onRangeChanged() {
        if (this.getOutputMinFrameDuration != this.Camera2StreamConfigurationMap) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoSizes = true;
    }
}
