package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
class TileList<T> {
    final int getHighResolutionOutputSizeshNQ4ISI;
    androidx.recyclerview.widget.TileList.Tile<T> getHighSpeedVideoFpsRangesFor;
    final android.util.SparseArray<androidx.recyclerview.widget.TileList.Tile<T>> getHighSpeedVideoSizes = new android.util.SparseArray<>(10);

    public TileList(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public static class Tile<T> {
        androidx.recyclerview.widget.TileList.Tile<T> Camera2StreamConfigurationMap;
        public int mItemCount;
        public final T[] mItems;
        public int mStartPosition;

        Tile(java.lang.Class<T> cls, int i) {
            this.mItems = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, i));
        }
    }
}
