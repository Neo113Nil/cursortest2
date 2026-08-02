package androidx.customview.widget;

/* loaded from: classes7.dex */
class FocusStrategy {

    public interface BoundsAdapter<T> {
        void obtainBounds(T t, android.graphics.Rect rect);
    }

    public interface CollectionAdapter<T, V> {
        V get(T t, int i);

        int size(T t);
    }

    public static <L, T> T getHighResolutionOutputSizeshNQ4ISI(L l, androidx.customview.widget.FocusStrategy.CollectionAdapter<L, T> collectionAdapter, androidx.customview.widget.FocusStrategy.BoundsAdapter<T> boundsAdapter, T t, int i, boolean z) {
        int size = collectionAdapter.size(l);
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(collectionAdapter.get(l, i2));
        }
        java.util.Collections.sort(arrayList, new androidx.customview.widget.FocusStrategy.SequentialComparator(z, boundsAdapter));
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
            int size2 = arrayList.size();
            int lastIndexOf = (t != null ? arrayList.lastIndexOf(t) : -1) + 1;
            if (lastIndexOf < size2) {
                return (T) arrayList.get(lastIndexOf);
            }
            return null;
        }
        int size3 = arrayList.size();
        if (t != null) {
            size3 = arrayList.indexOf(t);
        }
        int i3 = size3 - 1;
        if (i3 >= 0) {
            return (T) arrayList.get(i3);
        }
        return null;
    }

    static class SequentialComparator<T> implements java.util.Comparator<T> {
        private final boolean getHighSpeedVideoFpsRanges;
        private final androidx.customview.widget.FocusStrategy.BoundsAdapter<T> getHighSpeedVideoSizes;
        private final android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Rect();
        private final android.graphics.Rect Camera2StreamConfigurationMap = new android.graphics.Rect();

        SequentialComparator(boolean z, androidx.customview.widget.FocusStrategy.BoundsAdapter<T> boundsAdapter) {
            this.getHighSpeedVideoFpsRanges = z;
            this.getHighSpeedVideoSizes = boundsAdapter;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            android.graphics.Rect rect = this.getHighResolutionOutputSizeshNQ4ISI;
            android.graphics.Rect rect2 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes.obtainBounds(t, rect);
            this.getHighSpeedVideoSizes.obtainBounds(t2, rect2);
            if (rect.top < rect2.top) {
                return -1;
            }
            if (rect.top > rect2.top) {
                return 1;
            }
            if (rect.left < rect2.left) {
                return this.getHighSpeedVideoFpsRanges ? 1 : -1;
            }
            if (rect.left > rect2.left) {
                return this.getHighSpeedVideoFpsRanges ? -1 : 1;
            }
            if (rect.bottom < rect2.bottom) {
                return -1;
            }
            if (rect.bottom > rect2.bottom) {
                return 1;
            }
            if (rect.right < rect2.right) {
                return this.getHighSpeedVideoFpsRanges ? 1 : -1;
            }
            if (rect.right > rect2.right) {
                return this.getHighSpeedVideoFpsRanges ? -1 : 1;
            }
            return 0;
        }
    }

    public static <L, T> T getHighSpeedVideoFpsRanges(L l, androidx.customview.widget.FocusStrategy.CollectionAdapter<L, T> collectionAdapter, androidx.customview.widget.FocusStrategy.BoundsAdapter<T> boundsAdapter, T t, android.graphics.Rect rect, int i) {
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int size = collectionAdapter.size(l);
        android.graphics.Rect rect3 = new android.graphics.Rect();
        T t2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            T t3 = collectionAdapter.get(l, i2);
            if (t3 != t) {
                boundsAdapter.obtainBounds(t3, rect3);
                if (Camera2StreamConfigurationMap(rect, rect3, i)) {
                    if (Camera2StreamConfigurationMap(rect, rect2, i) && !getHighSpeedVideoFpsRangesFor(i, rect, rect3, rect2)) {
                        if (!getHighSpeedVideoFpsRangesFor(i, rect, rect2, rect3)) {
                            int max = java.lang.Math.max(0, getHighSpeedVideoSizes(i, rect, rect3));
                            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i, rect, rect3);
                            int i3 = (max * 13 * max) + (Camera2StreamConfigurationMap * Camera2StreamConfigurationMap);
                            int max2 = java.lang.Math.max(0, getHighSpeedVideoSizes(i, rect, rect2));
                            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i, rect, rect2);
                            if (i3 >= (max2 * 13 * max2) + (Camera2StreamConfigurationMap2 * Camera2StreamConfigurationMap2)) {
                            }
                        }
                    }
                    rect2.set(rect3);
                    t2 = t3;
                }
            }
        }
        return t2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r10.bottom <= r12.top) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r9 == 17) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r9 == 66) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r11 = java.lang.Math.max(0, getHighSpeedVideoSizes(r9, r10, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r9 == 17) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r9 == 33) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r9 == 66) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r9 != 130) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0031, code lost:
    
        if (r10.right <= r12.left) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0038, code lost:
    
        if (r10.top >= r12.bottom) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003f, code lost:
    
        if (r10.left >= r12.right) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean getHighSpeedVideoFpsRangesFor(int i, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3) {
        boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i, rect, rect2);
        if (getHighSpeedVideoFpsRangesFor(i, rect, rect3) || !highSpeedVideoFpsRangesFor) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    private static boolean Camera2StreamConfigurationMap(android.graphics.Rect rect, android.graphics.Rect rect2, int i) {
        if (i == 17) {
            return (rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left;
        }
        if (i == 33) {
            return (rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top;
        }
        if (i == 66) {
            return (rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right;
        }
        if (i == 130) {
            return (rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom;
        }
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static boolean getHighSpeedVideoFpsRangesFor(int i, android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    private static int getHighSpeedVideoSizes(int i, android.graphics.Rect rect, android.graphics.Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    private static int Camera2StreamConfigurationMap(int i, android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return java.lang.Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return java.lang.Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    private FocusStrategy() {
    }
}
