package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public class SortedList<T> {
    public static final int INVALID_POSITION = -1;
    private T[] Camera2StreamConfigurationMap;
    private androidx.recyclerview.widget.SortedList.BatchedCallback getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    T[] getHighSpeedVideoFpsRangesFor;
    private androidx.recyclerview.widget.SortedList.Callback getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private final java.lang.Class<T> getInputFormats;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;

    public SortedList(java.lang.Class<T> cls, androidx.recyclerview.widget.SortedList.Callback<T> callback) {
        this(cls, callback, 10);
    }

    public SortedList(java.lang.Class<T> cls, androidx.recyclerview.widget.SortedList.Callback<T> callback, int i) {
        this.getInputFormats = cls;
        this.getHighSpeedVideoFpsRangesFor = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, i));
        this.getHighSpeedVideoSizes = callback;
        this.getOutputFormats = 0;
    }

    public int size() {
        return this.getOutputFormats;
    }

    public void addAll(T... tArr) {
        addAll(tArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(java.util.Collection<T> collection) {
        addAll(collection.toArray((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.getInputFormats, collection.size())), true);
    }

    public void replaceAll(T... tArr) {
        replaceAll(tArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(java.util.Collection<T> collection) {
        replaceAll(collection.toArray((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.getInputFormats, collection.size())), true);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(T[] tArr) {
        if (tArr.length <= 0) {
            return;
        }
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(tArr);
        int i = 0;
        if (this.getOutputFormats == 0) {
            this.getHighSpeedVideoFpsRangesFor = tArr;
            this.getOutputFormats = highSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes.onInserted(0, highSpeedVideoFpsRangesFor);
            return;
        }
        boolean z = this.getHighSpeedVideoSizes instanceof androidx.recyclerview.widget.SortedList.BatchedCallback;
        if (!z) {
            beginBatchedUpdates();
        }
        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizesFor = 0;
        int i2 = this.getOutputFormats;
        this.getOutputMinFrameDuration = i2;
        this.getHighSpeedVideoFpsRangesFor = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.getInputFormats, i2 + highSpeedVideoFpsRangesFor + 10));
        this.getHighSpeedVideoFpsRanges = 0;
        while (true) {
            int i3 = this.getHighSpeedVideoSizesFor;
            int i4 = this.getOutputMinFrameDuration;
            if (i3 >= i4 && i >= highSpeedVideoFpsRangesFor) {
                break;
            }
            if (i3 == i4) {
                int i5 = highSpeedVideoFpsRangesFor - i;
                java.lang.System.arraycopy(tArr, i, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, i5);
                int i6 = this.getHighSpeedVideoFpsRanges + i5;
                this.getHighSpeedVideoFpsRanges = i6;
                this.getOutputFormats += i5;
                this.getHighSpeedVideoSizes.onInserted(i6 - i5, i5);
                break;
            }
            if (i == highSpeedVideoFpsRangesFor) {
                int i7 = i4 - i3;
                java.lang.System.arraycopy(this.Camera2StreamConfigurationMap, i3, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, i7);
                this.getHighSpeedVideoFpsRanges += i7;
                break;
            }
            T t = this.Camera2StreamConfigurationMap[i3];
            T t2 = tArr[i];
            int compare = this.getHighSpeedVideoSizes.compare(t, t2);
            if (compare > 0) {
                T[] tArr2 = this.getHighSpeedVideoFpsRangesFor;
                int i8 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i8 + 1;
                tArr2[i8] = t2;
                this.getOutputFormats++;
                i++;
                this.getHighSpeedVideoSizes.onInserted(i8, 1);
            } else if (compare == 0 && this.getHighSpeedVideoSizes.areItemsTheSame(t, t2)) {
                T[] tArr3 = this.getHighSpeedVideoFpsRangesFor;
                int i9 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i9 + 1;
                tArr3[i9] = t2;
                i++;
                this.getHighSpeedVideoSizesFor++;
                if (!this.getHighSpeedVideoSizes.areContentsTheSame(t, t2)) {
                    androidx.recyclerview.widget.SortedList.Callback callback = this.getHighSpeedVideoSizes;
                    callback.onChanged(this.getHighSpeedVideoFpsRanges - 1, 1, callback.getChangePayload(t, t2));
                }
            } else {
                T[] tArr4 = this.getHighSpeedVideoFpsRangesFor;
                int i10 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i10 + 1;
                tArr4[i10] = t;
                this.getHighSpeedVideoSizesFor++;
            }
        }
        this.Camera2StreamConfigurationMap = null;
        if (z) {
            return;
        }
        endBatchedUpdates();
    }

    private void Camera2StreamConfigurationMap(T[] tArr) {
        boolean z = this.getHighSpeedVideoSizes instanceof androidx.recyclerview.widget.SortedList.BatchedCallback;
        if (!z) {
            beginBatchedUpdates();
        }
        this.getHighSpeedVideoSizesFor = 0;
        this.getOutputMinFrameDuration = this.getOutputFormats;
        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = 0;
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(tArr);
        this.getHighSpeedVideoFpsRangesFor = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.getInputFormats, highSpeedVideoFpsRangesFor));
        while (true) {
            int i = this.getHighSpeedVideoFpsRanges;
            if (i >= highSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizesFor >= this.getOutputMinFrameDuration) {
                break;
            }
            int i2 = this.getHighSpeedVideoSizesFor;
            int i3 = this.getOutputMinFrameDuration;
            if (i2 >= i3) {
                int i4 = highSpeedVideoFpsRangesFor - i;
                java.lang.System.arraycopy(tArr, i, this.getHighSpeedVideoFpsRangesFor, i, i4);
                this.getHighSpeedVideoFpsRanges += i4;
                this.getOutputFormats += i4;
                this.getHighSpeedVideoSizes.onInserted(i, i4);
                break;
            }
            if (i >= highSpeedVideoFpsRangesFor) {
                int i5 = i3 - i2;
                this.getOutputFormats -= i5;
                this.getHighSpeedVideoSizes.onRemoved(i, i5);
                break;
            }
            T t = this.Camera2StreamConfigurationMap[i2];
            T t2 = tArr[i];
            int compare = this.getHighSpeedVideoSizes.compare(t, t2);
            if (compare < 0) {
                getHighSpeedVideoSizes();
            } else if (compare > 0) {
                getHighSpeedVideoFpsRanges(t2);
            } else if (!this.getHighSpeedVideoSizes.areItemsTheSame(t, t2)) {
                getHighSpeedVideoSizes();
                getHighSpeedVideoFpsRanges(t2);
            } else {
                T[] tArr2 = this.getHighSpeedVideoFpsRangesFor;
                int i6 = this.getHighSpeedVideoFpsRanges;
                tArr2[i6] = t2;
                this.getHighSpeedVideoSizesFor++;
                this.getHighSpeedVideoFpsRanges = i6 + 1;
                if (!this.getHighSpeedVideoSizes.areContentsTheSame(t, t2)) {
                    androidx.recyclerview.widget.SortedList.Callback callback = this.getHighSpeedVideoSizes;
                    callback.onChanged(this.getHighSpeedVideoFpsRanges - 1, 1, callback.getChangePayload(t, t2));
                }
            }
        }
        this.Camera2StreamConfigurationMap = null;
        if (z) {
            return;
        }
        endBatchedUpdates();
    }

    private void getHighSpeedVideoFpsRanges(T t) {
        T[] tArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoFpsRanges;
        tArr[i] = t;
        this.getHighSpeedVideoFpsRanges = i + 1;
        this.getOutputFormats++;
        this.getHighSpeedVideoSizes.onInserted(i, 1);
    }

    private void getHighSpeedVideoSizes() {
        this.getOutputFormats--;
        this.getHighSpeedVideoSizesFor++;
        this.getHighSpeedVideoSizes.onRemoved(this.getHighSpeedVideoFpsRanges, 1);
    }

    private int getHighSpeedVideoFpsRangesFor(T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        java.util.Arrays.sort(tArr, this.getHighSpeedVideoSizes);
        int i = 0;
        int i2 = 1;
        for (int i3 = 1; i3 < tArr.length; i3++) {
            T t = tArr[i3];
            if (this.getHighSpeedVideoSizes.compare(tArr[i], t) == 0) {
                int i4 = i;
                while (true) {
                    if (i4 >= i2) {
                        i4 = -1;
                        break;
                    }
                    if (this.getHighSpeedVideoSizes.areItemsTheSame(tArr[i4], t)) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1) {
                    tArr[i4] = t;
                } else {
                    if (i2 != i3) {
                        tArr[i2] = t;
                    }
                    i2++;
                }
            } else {
                if (i2 != i3) {
                    tArr[i2] = t;
                }
                i = i2;
                i2++;
            }
        }
        return i2;
    }

    private int getHighSpeedVideoFpsRanges(T t, boolean z) {
        int highSpeedVideoSizes = getHighSpeedVideoSizes(t, this.getHighSpeedVideoFpsRangesFor, 0, this.getOutputFormats, 1);
        if (highSpeedVideoSizes == -1) {
            highSpeedVideoSizes = 0;
        } else if (highSpeedVideoSizes < this.getOutputFormats) {
            T t2 = this.getHighSpeedVideoFpsRangesFor[highSpeedVideoSizes];
            if (this.getHighSpeedVideoSizes.areItemsTheSame(t2, t)) {
                if (this.getHighSpeedVideoSizes.areContentsTheSame(t2, t)) {
                    this.getHighSpeedVideoFpsRangesFor[highSpeedVideoSizes] = t;
                    return highSpeedVideoSizes;
                }
                this.getHighSpeedVideoFpsRangesFor[highSpeedVideoSizes] = t;
                androidx.recyclerview.widget.SortedList.Callback callback = this.getHighSpeedVideoSizes;
                callback.onChanged(highSpeedVideoSizes, 1, callback.getChangePayload(t2, t));
                return highSpeedVideoSizes;
            }
        }
        int i = this.getOutputFormats;
        if (highSpeedVideoSizes > i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot add item to ");
            sb.append(highSpeedVideoSizes);
            sb.append(" because size is ");
            sb.append(this.getOutputFormats);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        T[] tArr = this.getHighSpeedVideoFpsRangesFor;
        if (i == tArr.length) {
            T[] tArr2 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.getInputFormats, tArr.length + 10));
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, 0, tArr2, 0, highSpeedVideoSizes);
            tArr2[highSpeedVideoSizes] = t;
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, highSpeedVideoSizes, tArr2, highSpeedVideoSizes + 1, this.getOutputFormats - highSpeedVideoSizes);
            this.getHighSpeedVideoFpsRangesFor = tArr2;
        } else {
            java.lang.System.arraycopy(tArr, highSpeedVideoSizes, tArr, highSpeedVideoSizes + 1, i - highSpeedVideoSizes);
            this.getHighSpeedVideoFpsRangesFor[highSpeedVideoSizes] = t;
        }
        this.getOutputFormats++;
        if (z) {
            this.getHighSpeedVideoSizes.onInserted(highSpeedVideoSizes, 1);
        }
        return highSpeedVideoSizes;
    }

    private void getHighSpeedVideoFpsRangesFor(int i, boolean z) {
        T[] tArr = this.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(tArr, i + 1, tArr, i, (this.getOutputFormats - i) - 1);
        int i2 = this.getOutputFormats - 1;
        this.getOutputFormats = i2;
        this.getHighSpeedVideoFpsRangesFor[i2] = null;
        if (z) {
            this.getHighSpeedVideoSizes.onRemoved(i, 1);
        }
    }

    public T get(int i) throws java.lang.IndexOutOfBoundsException {
        int i2;
        if (i >= this.getOutputFormats || i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Asked to get item at ");
            sb.append(i);
            sb.append(" but size is ");
            sb.append(this.getOutputFormats);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        T[] tArr = this.Camera2StreamConfigurationMap;
        if (tArr != null && i >= (i2 = this.getHighSpeedVideoFpsRanges)) {
            return tArr[(i - i2) + this.getHighSpeedVideoSizesFor];
        }
        return this.getHighSpeedVideoFpsRangesFor[i];
    }

    public int indexOf(T t) {
        if (this.Camera2StreamConfigurationMap != null) {
            int highSpeedVideoSizes = getHighSpeedVideoSizes(t, this.getHighSpeedVideoFpsRangesFor, 0, this.getHighSpeedVideoFpsRanges, 4);
            if (highSpeedVideoSizes != -1) {
                return highSpeedVideoSizes;
            }
            int highSpeedVideoSizes2 = getHighSpeedVideoSizes(t, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, 4);
            if (highSpeedVideoSizes2 != -1) {
                return (highSpeedVideoSizes2 - this.getHighSpeedVideoSizesFor) + this.getHighSpeedVideoFpsRanges;
            }
            return -1;
        }
        return getHighSpeedVideoSizes(t, this.getHighSpeedVideoFpsRangesFor, 0, this.getOutputFormats, 4);
    }

    private int getHighSpeedVideoSizes(T t, T[] tArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            T t2 = tArr[i4];
            int compare = this.getHighSpeedVideoSizes.compare(t2, t);
            if (compare < 0) {
                i = i4 + 1;
            } else {
                if (compare == 0) {
                    if (!this.getHighSpeedVideoSizes.areItemsTheSame(t2, t)) {
                        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(t, i4, i, i2);
                        if (i3 != 1 || highSpeedVideoFpsRangesFor != -1) {
                            return highSpeedVideoFpsRangesFor;
                        }
                    }
                    return i4;
                }
                i2 = i4;
            }
        }
        if (i3 == 1) {
            return i;
        }
        return -1;
    }

    private int getHighSpeedVideoFpsRangesFor(T t, int i, int i2, int i3) {
        T t2;
        for (int i4 = i - 1; i4 >= i2; i4--) {
            T t3 = this.getHighSpeedVideoFpsRangesFor[i4];
            if (this.getHighSpeedVideoSizes.compare(t3, t) != 0) {
                break;
            }
            if (this.getHighSpeedVideoSizes.areItemsTheSame(t3, t)) {
                return i4;
            }
        }
        do {
            i++;
            if (i >= i3) {
                return -1;
            }
            t2 = this.getHighSpeedVideoFpsRangesFor[i];
            if (this.getHighSpeedVideoSizes.compare(t2, t) != 0) {
                return -1;
            }
        } while (!this.getHighSpeedVideoSizes.areItemsTheSame(t2, t));
        return i;
    }

    public static abstract class Callback<T2> implements java.util.Comparator<T2>, androidx.recyclerview.widget.ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t2, T2 t22);

        public abstract boolean areItemsTheSame(T2 t2, T2 t22);

        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        public java.lang.Object getChangePayload(T2 t2, T2 t22) {
            return null;
        }

        public abstract void onChanged(int i, int i2);

        public void onChanged(int i, int i2, java.lang.Object obj) {
            onChanged(i, i2);
        }
    }

    public static class BatchedCallback<T2> extends androidx.recyclerview.widget.SortedList.Callback<T2> {
        final androidx.recyclerview.widget.SortedList.Callback<T2> getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.recyclerview.widget.BatchingListUpdateCallback getHighSpeedVideoFpsRangesFor;

        public BatchedCallback(androidx.recyclerview.widget.SortedList.Callback<T2> callback) {
            this.getHighResolutionOutputSizeshNQ4ISI = callback;
            this.getHighSpeedVideoFpsRangesFor = new androidx.recyclerview.widget.BatchingListUpdateCallback(callback);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            return this.getHighResolutionOutputSizeshNQ4ISI.compare(t2, t22);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i, int i2) {
            this.getHighSpeedVideoFpsRangesFor.onInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i, int i2) {
            this.getHighSpeedVideoFpsRangesFor.onRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i, int i2) {
            this.getHighSpeedVideoFpsRangesFor.onMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void onChanged(int i, int i2) {
            this.getHighSpeedVideoFpsRangesFor.onChanged(i, i2, null);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i, int i2, java.lang.Object obj) {
            this.getHighSpeedVideoFpsRangesFor.onChanged(i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areContentsTheSame(T2 t2, T2 t22) {
            return this.getHighResolutionOutputSizeshNQ4ISI.areContentsTheSame(t2, t22);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areItemsTheSame(T2 t2, T2 t22) {
            return this.getHighResolutionOutputSizeshNQ4ISI.areItemsTheSame(t2, t22);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public java.lang.Object getChangePayload(T2 t2, T2 t22) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getChangePayload(t2, t22);
        }

        public void dispatchLastEvent() {
            this.getHighSpeedVideoFpsRangesFor.dispatchLastEvent();
        }
    }

    public int add(T t) {
        if (this.Camera2StreamConfigurationMap == null) {
            return getHighSpeedVideoFpsRanges(t, true);
        }
        throw new java.lang.IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(T[] tArr, boolean z) {
        if (this.Camera2StreamConfigurationMap == null) {
            if (tArr.length == 0) {
                return;
            }
            if (z) {
                getHighResolutionOutputSizeshNQ4ISI(tArr);
                return;
            }
            java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.getInputFormats, tArr.length);
            java.lang.System.arraycopy(tArr, 0, objArr, 0, tArr.length);
            getHighResolutionOutputSizeshNQ4ISI(objArr);
            return;
        }
        throw new java.lang.IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }

    public void beginBatchedUpdates() {
        if (this.Camera2StreamConfigurationMap == null) {
            if (this.getHighSpeedVideoSizes instanceof androidx.recyclerview.widget.SortedList.BatchedCallback) {
                return;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = new androidx.recyclerview.widget.SortedList.BatchedCallback(this.getHighSpeedVideoSizes);
            }
            this.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI;
            return;
        }
        throw new java.lang.IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }

    public void clear() {
        if (this.Camera2StreamConfigurationMap == null) {
            int i = this.getOutputFormats;
            if (i == 0) {
                return;
            }
            java.util.Arrays.fill(this.getHighSpeedVideoFpsRangesFor, 0, i, (java.lang.Object) null);
            this.getOutputFormats = 0;
            this.getHighSpeedVideoSizes.onRemoved(0, i);
            return;
        }
        throw new java.lang.IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }

    public void endBatchedUpdates() {
        if (this.Camera2StreamConfigurationMap == null) {
            androidx.recyclerview.widget.SortedList.Callback callback = this.getHighSpeedVideoSizes;
            if (callback instanceof androidx.recyclerview.widget.SortedList.BatchedCallback) {
                ((androidx.recyclerview.widget.SortedList.BatchedCallback) callback).dispatchLastEvent();
            }
            androidx.recyclerview.widget.SortedList.Callback callback2 = this.getHighSpeedVideoSizes;
            androidx.recyclerview.widget.SortedList.BatchedCallback batchedCallback = this.getHighResolutionOutputSizeshNQ4ISI;
            if (callback2 == batchedCallback) {
                this.getHighSpeedVideoSizes = batchedCallback.getHighResolutionOutputSizeshNQ4ISI;
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }

    public void recalculatePositionOfItemAt(int i) {
        if (this.Camera2StreamConfigurationMap == null) {
            T t = get(i);
            getHighSpeedVideoFpsRangesFor(i, false);
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(t, false);
            if (i != highSpeedVideoFpsRanges) {
                this.getHighSpeedVideoSizes.onMoved(i, highSpeedVideoFpsRanges);
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }

    public boolean remove(T t) {
        if (this.Camera2StreamConfigurationMap != null) {
            throw new java.lang.IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
        int highSpeedVideoSizes = getHighSpeedVideoSizes(t, this.getHighSpeedVideoFpsRangesFor, 0, this.getOutputFormats, 2);
        if (highSpeedVideoSizes == -1) {
            return false;
        }
        getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, true);
        return true;
    }

    public T removeItemAt(int i) {
        if (this.Camera2StreamConfigurationMap == null) {
            T t = get(i);
            getHighSpeedVideoFpsRangesFor(i, true);
            return t;
        }
        throw new java.lang.IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(T[] tArr, boolean z) {
        if (this.Camera2StreamConfigurationMap != null) {
            throw new java.lang.IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
        if (z) {
            Camera2StreamConfigurationMap(tArr);
            return;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.getInputFormats, tArr.length);
        java.lang.System.arraycopy(tArr, 0, objArr, 0, tArr.length);
        Camera2StreamConfigurationMap(objArr);
    }

    public void updateItemAt(int i, T t) {
        if (this.Camera2StreamConfigurationMap == null) {
            T t2 = get(i);
            boolean z = t2 == t || !this.getHighSpeedVideoSizes.areContentsTheSame(t2, t);
            if (t2 != t && this.getHighSpeedVideoSizes.compare(t2, t) == 0) {
                this.getHighSpeedVideoFpsRangesFor[i] = t;
                if (z) {
                    androidx.recyclerview.widget.SortedList.Callback callback = this.getHighSpeedVideoSizes;
                    callback.onChanged(i, 1, callback.getChangePayload(t2, t));
                    return;
                }
                return;
            }
            if (z) {
                androidx.recyclerview.widget.SortedList.Callback callback2 = this.getHighSpeedVideoSizes;
                callback2.onChanged(i, 1, callback2.getChangePayload(t2, t));
            }
            getHighSpeedVideoFpsRangesFor(i, false);
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(t, false);
            if (i != highSpeedVideoFpsRanges) {
                this.getHighSpeedVideoSizes.onMoved(i, highSpeedVideoFpsRanges);
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }
}
