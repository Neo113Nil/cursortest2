package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
public class DiffUtil {
    private static final java.util.Comparator<androidx.recyclerview.widget.DiffUtil.Diagonal> getHighSpeedVideoSizes = new java.util.Comparator<androidx.recyclerview.widget.DiffUtil.Diagonal>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(androidx.recyclerview.widget.DiffUtil.Diagonal diagonal, androidx.recyclerview.widget.DiffUtil.Diagonal diagonal2) {
            return diagonal.getHighResolutionOutputSizeshNQ4ISI - diagonal2.getHighResolutionOutputSizeshNQ4ISI;
        }
    };

    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public java.lang.Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* loaded from: classes.dex */
    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(T t, T t2);

        public abstract boolean areItemsTheSame(T t, T t2);

        public java.lang.Object getChangePayload(T t, T t2) {
            return null;
        }
    }

    private DiffUtil() {
    }

    public static androidx.recyclerview.widget.DiffUtil.DiffResult calculateDiff(androidx.recyclerview.widget.DiffUtil.Callback callback) {
        return calculateDiff(callback, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
    
        if (r5.getHighSpeedVideoSizes[(r9 + 1) + r5.getHighSpeedVideoFpsRangesFor] <= r5.getHighSpeedVideoSizes[(r9 - 1) + r5.getHighSpeedVideoFpsRangesFor]) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.recyclerview.widget.DiffUtil.DiffResult calculateDiff(androidx.recyclerview.widget.DiffUtil.Callback callback, boolean z) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        androidx.recyclerview.widget.DiffUtil.Snake snake;
        java.util.ArrayList arrayList4;
        java.util.ArrayList arrayList5;
        java.util.ArrayList arrayList6;
        int i;
        androidx.recyclerview.widget.DiffUtil.Range range;
        androidx.recyclerview.widget.DiffUtil.Diagonal diagonal;
        int i2;
        boolean z2;
        androidx.recyclerview.widget.DiffUtil.Snake snake2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(new androidx.recyclerview.widget.DiffUtil.Range(oldListSize, newListSize));
        int i12 = oldListSize + newListSize;
        int i13 = 1;
        int i14 = (((i12 + 1) / 2) * 2) + 1;
        androidx.recyclerview.widget.DiffUtil.CenteredArray centeredArray = new androidx.recyclerview.widget.DiffUtil.CenteredArray(i14);
        androidx.recyclerview.widget.DiffUtil.CenteredArray centeredArray2 = new androidx.recyclerview.widget.DiffUtil.CenteredArray(i14);
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        while (!arrayList8.isEmpty()) {
            androidx.recyclerview.widget.DiffUtil.Range range2 = (androidx.recyclerview.widget.DiffUtil.Range) arrayList8.remove(arrayList8.size() - i13);
            if (range2.getHighSpeedVideoFpsRanges - range2.getHighResolutionOutputSizeshNQ4ISI > 0 && range2.getHighSpeedVideoFpsRangesFor - range2.Camera2StreamConfigurationMap > 0) {
                int i15 = (((range2.getHighSpeedVideoFpsRanges - range2.getHighResolutionOutputSizeshNQ4ISI) + (range2.getHighSpeedVideoFpsRangesFor - range2.Camera2StreamConfigurationMap)) + i13) / 2;
                centeredArray.getHighSpeedVideoSizes[centeredArray.getHighSpeedVideoFpsRangesFor + i13] = range2.getHighResolutionOutputSizeshNQ4ISI;
                centeredArray2.getHighSpeedVideoSizes[centeredArray2.getHighSpeedVideoFpsRangesFor + i13] = range2.getHighSpeedVideoFpsRanges;
                int i16 = 0;
                while (i16 < i15) {
                    int i17 = java.lang.Math.abs((range2.getHighSpeedVideoFpsRanges - range2.getHighResolutionOutputSizeshNQ4ISI) - (range2.getHighSpeedVideoFpsRangesFor - range2.Camera2StreamConfigurationMap)) % 2 != i13 ? 0 : i13;
                    int i18 = range2.getHighSpeedVideoFpsRanges - range2.getHighResolutionOutputSizeshNQ4ISI;
                    int i19 = range2.getHighSpeedVideoFpsRangesFor - range2.Camera2StreamConfigurationMap;
                    int i20 = -i16;
                    int i21 = i20;
                    while (true) {
                        if (i21 > i16) {
                            arrayList = arrayList9;
                            arrayList2 = arrayList7;
                            arrayList3 = arrayList8;
                            i2 = i15;
                            z2 = false;
                            snake2 = null;
                            break;
                        }
                        if (i21 != i20) {
                            if (i21 != i16) {
                                i2 = i15;
                                arrayList3 = arrayList8;
                            } else {
                                arrayList3 = arrayList8;
                                i2 = i15;
                            }
                            i7 = centeredArray.getHighSpeedVideoSizes[(i21 - 1) + centeredArray.getHighSpeedVideoFpsRangesFor];
                            i6 = i7 + 1;
                            i8 = (range2.Camera2StreamConfigurationMap + (i6 - range2.getHighResolutionOutputSizeshNQ4ISI)) - i21;
                            if (i16 == 0 && i6 == i7) {
                                i9 = i8 - 1;
                                arrayList = arrayList9;
                            } else {
                                arrayList = arrayList9;
                                i9 = i8;
                            }
                            while (i6 < range2.getHighSpeedVideoFpsRanges && i8 < range2.getHighSpeedVideoFpsRangesFor && callback.areItemsTheSame(i6, i8)) {
                                i6++;
                                i8++;
                            }
                            arrayList2 = arrayList7;
                            centeredArray.getHighSpeedVideoSizes[centeredArray.getHighSpeedVideoFpsRangesFor + i21] = i6;
                            if (i17 != 0 || (i11 = (i18 - i19) - i21) < i20 + 1 || i11 > i16 - 1) {
                                i10 = i17;
                            } else {
                                i10 = i17;
                                if (centeredArray2.getHighSpeedVideoSizes[i11 + centeredArray2.getHighSpeedVideoFpsRangesFor] <= i6) {
                                    snake2 = new androidx.recyclerview.widget.DiffUtil.Snake();
                                    snake2.getHighSpeedVideoFpsRanges = i7;
                                    snake2.getHighSpeedVideoFpsRangesFor = i9;
                                    snake2.getHighResolutionOutputSizeshNQ4ISI = i6;
                                    snake2.Camera2StreamConfigurationMap = i8;
                                    z2 = false;
                                    snake2.getHighSpeedVideoSizes = false;
                                    break;
                                }
                            }
                            i21 += 2;
                            i15 = i2;
                            arrayList8 = arrayList3;
                            arrayList9 = arrayList;
                            arrayList7 = arrayList2;
                            i17 = i10;
                        } else {
                            arrayList3 = arrayList8;
                            i2 = i15;
                        }
                        i7 = centeredArray.getHighSpeedVideoSizes[i21 + 1 + centeredArray.getHighSpeedVideoFpsRangesFor];
                        i6 = i7;
                        i8 = (range2.Camera2StreamConfigurationMap + (i6 - range2.getHighResolutionOutputSizeshNQ4ISI)) - i21;
                        if (i16 == 0) {
                        }
                        arrayList = arrayList9;
                        i9 = i8;
                        while (i6 < range2.getHighSpeedVideoFpsRanges) {
                            i6++;
                            i8++;
                        }
                        arrayList2 = arrayList7;
                        centeredArray.getHighSpeedVideoSizes[centeredArray.getHighSpeedVideoFpsRangesFor + i21] = i6;
                        if (i17 != 0) {
                        }
                        i10 = i17;
                        i21 += 2;
                        i15 = i2;
                        arrayList8 = arrayList3;
                        arrayList9 = arrayList;
                        arrayList7 = arrayList2;
                        i17 = i10;
                    }
                    if (snake2 == null) {
                        boolean z4 = ((range2.getHighSpeedVideoFpsRanges - range2.getHighResolutionOutputSizeshNQ4ISI) - (range2.getHighSpeedVideoFpsRangesFor - range2.Camera2StreamConfigurationMap)) % 2 == 0 ? true : z2;
                        int i22 = range2.getHighSpeedVideoFpsRanges - range2.getHighResolutionOutputSizeshNQ4ISI;
                        int i23 = range2.getHighSpeedVideoFpsRangesFor - range2.Camera2StreamConfigurationMap;
                        int i24 = i20;
                        while (true) {
                            if (i24 > i16) {
                                snake2 = null;
                                break;
                            }
                            if (i24 != i20 && (i24 == i16 || centeredArray2.getHighSpeedVideoSizes[i24 + 1 + centeredArray2.getHighSpeedVideoFpsRangesFor] >= centeredArray2.getHighSpeedVideoSizes[(i24 - 1) + centeredArray2.getHighSpeedVideoFpsRangesFor])) {
                                i3 = centeredArray2.getHighSpeedVideoSizes[(i24 - 1) + centeredArray2.getHighSpeedVideoFpsRangesFor];
                                i4 = i3 - 1;
                            } else {
                                i3 = centeredArray2.getHighSpeedVideoSizes[i24 + 1 + centeredArray2.getHighSpeedVideoFpsRangesFor];
                                i4 = i3;
                            }
                            int i25 = range2.getHighSpeedVideoFpsRangesFor - ((range2.getHighSpeedVideoFpsRanges - i4) - i24);
                            int i26 = (i16 == 0 || i4 != i3) ? i25 : i25 + 1;
                            while (i4 > range2.getHighResolutionOutputSizeshNQ4ISI && i25 > range2.Camera2StreamConfigurationMap && callback.areItemsTheSame(i4 - 1, i25 - 1)) {
                                i4--;
                                i25--;
                            }
                            centeredArray2.getHighSpeedVideoSizes[centeredArray2.getHighSpeedVideoFpsRangesFor + i24] = i4;
                            if (!z4 || (i5 = (i22 - i23) - i24) < i20 || i5 > i16) {
                                z3 = z4;
                            } else {
                                z3 = z4;
                                if (centeredArray.getHighSpeedVideoSizes[i5 + centeredArray.getHighSpeedVideoFpsRangesFor] >= i4) {
                                    snake2 = new androidx.recyclerview.widget.DiffUtil.Snake();
                                    snake2.getHighSpeedVideoFpsRanges = i4;
                                    snake2.getHighSpeedVideoFpsRangesFor = i25;
                                    snake2.getHighResolutionOutputSizeshNQ4ISI = i3;
                                    snake2.Camera2StreamConfigurationMap = i26;
                                    snake2.getHighSpeedVideoSizes = true;
                                    break;
                                }
                            }
                            i24 += 2;
                            z4 = z3;
                        }
                        if (snake2 == null) {
                            i16++;
                            i15 = i2;
                            arrayList8 = arrayList3;
                            arrayList9 = arrayList;
                            arrayList7 = arrayList2;
                            i13 = 1;
                        }
                    }
                    snake = snake2;
                    break;
                }
            }
            arrayList = arrayList9;
            arrayList2 = arrayList7;
            arrayList3 = arrayList8;
            snake = null;
            if (snake == null) {
                arrayList4 = arrayList3;
                arrayList5 = arrayList;
                arrayList6 = arrayList2;
                i = 1;
                arrayList5.add(range2);
            } else {
                if (java.lang.Math.min(snake.getHighResolutionOutputSizeshNQ4ISI - snake.getHighSpeedVideoFpsRanges, snake.Camera2StreamConfigurationMap - snake.getHighSpeedVideoFpsRangesFor) > 0) {
                    if (snake.Camera2StreamConfigurationMap - snake.getHighSpeedVideoFpsRangesFor != snake.getHighResolutionOutputSizeshNQ4ISI - snake.getHighSpeedVideoFpsRanges) {
                        if (snake.getHighSpeedVideoSizes) {
                            diagonal = new androidx.recyclerview.widget.DiffUtil.Diagonal(snake.getHighSpeedVideoFpsRanges, snake.getHighSpeedVideoFpsRangesFor, java.lang.Math.min(snake.getHighResolutionOutputSizeshNQ4ISI - snake.getHighSpeedVideoFpsRanges, snake.Camera2StreamConfigurationMap - snake.getHighSpeedVideoFpsRangesFor));
                        } else if (snake.Camera2StreamConfigurationMap - snake.getHighSpeedVideoFpsRangesFor > snake.getHighResolutionOutputSizeshNQ4ISI - snake.getHighSpeedVideoFpsRanges) {
                            diagonal = new androidx.recyclerview.widget.DiffUtil.Diagonal(snake.getHighSpeedVideoFpsRanges, snake.getHighSpeedVideoFpsRangesFor + 1, java.lang.Math.min(snake.getHighResolutionOutputSizeshNQ4ISI - snake.getHighSpeedVideoFpsRanges, snake.Camera2StreamConfigurationMap - snake.getHighSpeedVideoFpsRangesFor));
                        } else {
                            diagonal = new androidx.recyclerview.widget.DiffUtil.Diagonal(snake.getHighSpeedVideoFpsRanges + 1, snake.getHighSpeedVideoFpsRangesFor, java.lang.Math.min(snake.getHighResolutionOutputSizeshNQ4ISI - snake.getHighSpeedVideoFpsRanges, snake.Camera2StreamConfigurationMap - snake.getHighSpeedVideoFpsRangesFor));
                        }
                    } else {
                        int i27 = snake.getHighSpeedVideoFpsRanges;
                        diagonal = new androidx.recyclerview.widget.DiffUtil.Diagonal(i27, snake.getHighSpeedVideoFpsRangesFor, snake.getHighResolutionOutputSizeshNQ4ISI - i27);
                    }
                    arrayList6 = arrayList2;
                    arrayList6.add(diagonal);
                } else {
                    arrayList6 = arrayList2;
                }
                if (arrayList.isEmpty()) {
                    range = new androidx.recyclerview.widget.DiffUtil.Range();
                    arrayList5 = arrayList;
                    i = 1;
                } else {
                    i = 1;
                    arrayList5 = arrayList;
                    range = (androidx.recyclerview.widget.DiffUtil.Range) arrayList5.remove(arrayList.size() - 1);
                }
                range.getHighResolutionOutputSizeshNQ4ISI = range2.getHighResolutionOutputSizeshNQ4ISI;
                range.Camera2StreamConfigurationMap = range2.Camera2StreamConfigurationMap;
                range.getHighSpeedVideoFpsRanges = snake.getHighSpeedVideoFpsRanges;
                range.getHighSpeedVideoFpsRangesFor = snake.getHighSpeedVideoFpsRangesFor;
                arrayList4 = arrayList3;
                arrayList4.add(range);
                range2.getHighSpeedVideoFpsRanges = range2.getHighSpeedVideoFpsRanges;
                range2.getHighSpeedVideoFpsRangesFor = range2.getHighSpeedVideoFpsRangesFor;
                range2.getHighResolutionOutputSizeshNQ4ISI = snake.getHighResolutionOutputSizeshNQ4ISI;
                range2.Camera2StreamConfigurationMap = snake.Camera2StreamConfigurationMap;
                arrayList4.add(range2);
            }
            arrayList9 = arrayList5;
            arrayList8 = arrayList4;
            int i28 = i;
            arrayList7 = arrayList6;
            i13 = i28;
        }
        java.util.ArrayList arrayList10 = arrayList7;
        java.util.Collections.sort(arrayList10, getHighSpeedVideoSizes);
        return new androidx.recyclerview.widget.DiffUtil.DiffResult(callback, arrayList10, centeredArray.getHighSpeedVideoSizes, centeredArray2.getHighSpeedVideoSizes, z);
    }

    static class Diagonal {
        public final int Camera2StreamConfigurationMap;
        public final int getHighResolutionOutputSizeshNQ4ISI;
        public final int getHighSpeedVideoFpsRangesFor;

        Diagonal(int i, int i2, int i3) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRangesFor = i2;
            this.Camera2StreamConfigurationMap = i3;
        }
    }

    static class Snake {
        public int Camera2StreamConfigurationMap;
        public int getHighResolutionOutputSizeshNQ4ISI;
        public int getHighSpeedVideoFpsRanges;
        public int getHighSpeedVideoFpsRangesFor;
        public boolean getHighSpeedVideoSizes;

        Snake() {
        }
    }

    static class Range {
        int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        public Range() {
        }

        public Range(int i, int i2) {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoFpsRanges = i;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRangesFor = i2;
        }
    }

    public static class DiffResult {
        public static final int NO_POSITION = -1;
        private final int[] Camera2StreamConfigurationMap;
        private final boolean getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.List<androidx.recyclerview.widget.DiffUtil.Diagonal> getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;
        private final androidx.recyclerview.widget.DiffUtil.Callback getHighSpeedVideoSizes;
        private final int[] getInputFormats;
        private final int getInputSizeshNQ4ISI;

        DiffResult(androidx.recyclerview.widget.DiffUtil.Callback callback, java.util.List<androidx.recyclerview.widget.DiffUtil.Diagonal> list, int[] iArr, int[] iArr2, boolean z) {
            this.getHighSpeedVideoFpsRanges = list;
            this.getInputFormats = iArr;
            this.Camera2StreamConfigurationMap = iArr2;
            java.util.Arrays.fill(iArr, 0);
            java.util.Arrays.fill(iArr2, 0);
            this.getHighSpeedVideoSizes = callback;
            int oldListSize = callback.getOldListSize();
            this.getInputSizeshNQ4ISI = oldListSize;
            int newListSize = callback.getNewListSize();
            this.getHighSpeedVideoFpsRangesFor = newListSize;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            androidx.recyclerview.widget.DiffUtil.Diagonal diagonal = list.isEmpty() ? null : list.get(0);
            if (diagonal == null || diagonal.getHighResolutionOutputSizeshNQ4ISI != 0 || diagonal.getHighSpeedVideoFpsRangesFor != 0) {
                list.add(0, new androidx.recyclerview.widget.DiffUtil.Diagonal(0, 0, 0));
            }
            list.add(new androidx.recyclerview.widget.DiffUtil.Diagonal(oldListSize, newListSize, 0));
            for (androidx.recyclerview.widget.DiffUtil.Diagonal diagonal2 : list) {
                for (int i = 0; i < diagonal2.Camera2StreamConfigurationMap; i++) {
                    int i2 = diagonal2.getHighResolutionOutputSizeshNQ4ISI + i;
                    int i3 = diagonal2.getHighSpeedVideoFpsRangesFor + i;
                    int i4 = this.getHighSpeedVideoSizes.areContentsTheSame(i2, i3) ? 1 : 2;
                    this.getInputFormats[i2] = (i3 << 4) | i4;
                    this.Camera2StreamConfigurationMap[i3] = (i2 << 4) | i4;
                }
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                int i5 = 0;
                for (androidx.recyclerview.widget.DiffUtil.Diagonal diagonal3 : this.getHighSpeedVideoFpsRanges) {
                    while (i5 < diagonal3.getHighResolutionOutputSizeshNQ4ISI) {
                        if (this.getInputFormats[i5] == 0) {
                            int size = this.getHighSpeedVideoFpsRanges.size();
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                if (i6 < size) {
                                    androidx.recyclerview.widget.DiffUtil.Diagonal diagonal4 = this.getHighSpeedVideoFpsRanges.get(i6);
                                    while (i7 < diagonal4.getHighSpeedVideoFpsRangesFor) {
                                        if (this.Camera2StreamConfigurationMap[i7] == 0 && this.getHighSpeedVideoSizes.areItemsTheSame(i5, i7)) {
                                            int i8 = this.getHighSpeedVideoSizes.areContentsTheSame(i5, i7) ? 8 : 4;
                                            this.getInputFormats[i5] = (i7 << 4) | i8;
                                            this.Camera2StreamConfigurationMap[i7] = i8 | (i5 << 4);
                                        } else {
                                            i7++;
                                        }
                                    }
                                    i7 = diagonal4.getHighSpeedVideoFpsRangesFor + diagonal4.Camera2StreamConfigurationMap;
                                    i6++;
                                }
                            }
                        }
                        i5++;
                    }
                    i5 = diagonal3.getHighResolutionOutputSizeshNQ4ISI + diagonal3.Camera2StreamConfigurationMap;
                }
            }
        }

        public int convertOldPositionToNew(int i) {
            if (i < 0 || i >= this.getInputSizeshNQ4ISI) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Index out of bounds - passed position = ");
                sb.append(i);
                sb.append(", old list size = ");
                sb.append(this.getInputSizeshNQ4ISI);
                throw new java.lang.IndexOutOfBoundsException(sb.toString());
            }
            int i2 = this.getInputFormats[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        public int convertNewPositionToOld(int i) {
            if (i < 0 || i >= this.getHighSpeedVideoFpsRangesFor) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Index out of bounds - passed position = ");
                sb.append(i);
                sb.append(", new list size = ");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                throw new java.lang.IndexOutOfBoundsException(sb.toString());
            }
            int i2 = this.Camera2StreamConfigurationMap[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        public void dispatchUpdatesTo(androidx.recyclerview.widget.RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new androidx.recyclerview.widget.AdapterListUpdateCallback(adapter));
        }

        public void dispatchUpdatesTo(androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback) {
            androidx.recyclerview.widget.BatchingListUpdateCallback batchingListUpdateCallback;
            int i;
            if (listUpdateCallback instanceof androidx.recyclerview.widget.BatchingListUpdateCallback) {
                batchingListUpdateCallback = (androidx.recyclerview.widget.BatchingListUpdateCallback) listUpdateCallback;
            } else {
                batchingListUpdateCallback = new androidx.recyclerview.widget.BatchingListUpdateCallback(listUpdateCallback);
            }
            int i2 = this.getInputSizeshNQ4ISI;
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            int i3 = this.getInputSizeshNQ4ISI;
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            for (int size = this.getHighSpeedVideoFpsRanges.size() - 1; size >= 0; size--) {
                androidx.recyclerview.widget.DiffUtil.Diagonal diagonal = this.getHighSpeedVideoFpsRanges.get(size);
                int i5 = diagonal.getHighResolutionOutputSizeshNQ4ISI + diagonal.Camera2StreamConfigurationMap;
                int i6 = diagonal.getHighSpeedVideoFpsRangesFor + diagonal.Camera2StreamConfigurationMap;
                while (true) {
                    if (i3 <= i5) {
                        break;
                    }
                    i3--;
                    int i7 = this.getInputFormats[i3];
                    if ((i7 & 12) != 0) {
                        int i8 = i7 >> 4;
                        androidx.recyclerview.widget.DiffUtil.PostponedUpdate Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(arrayDeque, i8, false);
                        if (Camera2StreamConfigurationMap != null) {
                            int i9 = (i2 - Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges) - 1;
                            batchingListUpdateCallback.onMoved(i3, i9);
                            if ((i7 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i9, 1, this.getHighSpeedVideoSizes.getChangePayload(i3, i8));
                            }
                        } else {
                            arrayDeque.add(new androidx.recyclerview.widget.DiffUtil.PostponedUpdate(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        batchingListUpdateCallback.onRemoved(i3, 1);
                        i2--;
                    }
                }
                while (i4 > i6) {
                    i4--;
                    int i10 = this.Camera2StreamConfigurationMap[i4];
                    if ((i10 & 12) != 0) {
                        int i11 = i10 >> 4;
                        androidx.recyclerview.widget.DiffUtil.PostponedUpdate Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(arrayDeque, i11, true);
                        if (Camera2StreamConfigurationMap2 == null) {
                            arrayDeque.add(new androidx.recyclerview.widget.DiffUtil.PostponedUpdate(i4, i2 - i3, false));
                        } else {
                            batchingListUpdateCallback.onMoved((i2 - Camera2StreamConfigurationMap2.getHighSpeedVideoFpsRanges) - 1, i3);
                            if ((i10 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i3, 1, this.getHighSpeedVideoSizes.getChangePayload(i11, i4));
                            }
                        }
                    } else {
                        batchingListUpdateCallback.onInserted(i3, 1);
                        i2++;
                    }
                }
                int i12 = diagonal.getHighResolutionOutputSizeshNQ4ISI;
                int i13 = diagonal.getHighSpeedVideoFpsRangesFor;
                for (i = 0; i < diagonal.Camera2StreamConfigurationMap; i++) {
                    if ((this.getInputFormats[i12] & 15) == 2) {
                        batchingListUpdateCallback.onChanged(i12, 1, this.getHighSpeedVideoSizes.getChangePayload(i12, i13));
                    }
                    i12++;
                    i13++;
                }
                i3 = diagonal.getHighResolutionOutputSizeshNQ4ISI;
                i4 = diagonal.getHighSpeedVideoFpsRangesFor;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }

        private static androidx.recyclerview.widget.DiffUtil.PostponedUpdate Camera2StreamConfigurationMap(java.util.Collection<androidx.recyclerview.widget.DiffUtil.PostponedUpdate> collection, int i, boolean z) {
            androidx.recyclerview.widget.DiffUtil.PostponedUpdate postponedUpdate;
            java.util.Iterator<androidx.recyclerview.widget.DiffUtil.PostponedUpdate> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    postponedUpdate = null;
                    break;
                }
                postponedUpdate = it.next();
                if (postponedUpdate.Camera2StreamConfigurationMap == i && postponedUpdate.getHighSpeedVideoFpsRangesFor == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                androidx.recyclerview.widget.DiffUtil.PostponedUpdate next = it.next();
                if (z) {
                    next.getHighSpeedVideoFpsRanges--;
                } else {
                    next.getHighSpeedVideoFpsRanges++;
                }
            }
            return postponedUpdate;
        }
    }

    static class PostponedUpdate {
        int Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;

        PostponedUpdate(int i, int i2, boolean z) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRanges = i2;
            this.getHighSpeedVideoFpsRangesFor = z;
        }
    }

    static class CenteredArray {
        final int getHighSpeedVideoFpsRangesFor;
        final int[] getHighSpeedVideoSizes;

        CenteredArray(int i) {
            this.getHighSpeedVideoSizes = new int[i];
            this.getHighSpeedVideoFpsRangesFor = i / 2;
        }
    }
}
