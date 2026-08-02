package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
class ChildHelper {
    final androidx.recyclerview.widget.ChildHelper.Callback Camera2StreamConfigurationMap;
    android.view.View getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges = 0;
    final androidx.recyclerview.widget.ChildHelper.Bucket getHighSpeedVideoFpsRangesFor = new androidx.recyclerview.widget.ChildHelper.Bucket();
    final java.util.List<android.view.View> getHighSpeedVideoSizes = new java.util.ArrayList();

    interface Callback {
        android.view.View Camera2StreamConfigurationMap(int i);

        androidx.recyclerview.widget.RecyclerView.ViewHolder Camera2StreamConfigurationMap(android.view.View view);

        void getHighResolutionOutputSizeshNQ4ISI(int i);

        void getHighResolutionOutputSizeshNQ4ISI(android.view.View view);

        void getHighSpeedVideoFpsRanges();

        void getHighSpeedVideoFpsRanges(android.view.View view);

        int getHighSpeedVideoFpsRangesFor();

        int getHighSpeedVideoFpsRangesFor(android.view.View view);

        void getHighSpeedVideoFpsRangesFor(int i);

        void getHighSpeedVideoFpsRangesFor(android.view.View view, int i);

        void getHighSpeedVideoSizes(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams);
    }

    ChildHelper(androidx.recyclerview.widget.ChildHelper.Callback callback) {
        this.Camera2StreamConfigurationMap = callback;
    }

    final void Camera2StreamConfigurationMap(android.view.View view, int i, boolean z) {
        int highSpeedVideoFpsRanges;
        if (i < 0) {
            highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
        } else {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i);
        }
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, z);
        if (z) {
            this.getHighSpeedVideoSizes.add(view);
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(view);
        }
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(view, highSpeedVideoFpsRanges);
    }

    final int getHighSpeedVideoFpsRanges(int i) {
        if (i < 0) {
            return -1;
        }
        int highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
        int i2 = i;
        while (i2 < highSpeedVideoFpsRangesFor) {
            int highResolutionOutputSizeshNQ4ISI = i - (i2 - this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(i2));
            if (highResolutionOutputSizeshNQ4ISI == 0) {
                while (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += highResolutionOutputSizeshNQ4ISI;
        }
        return -1;
    }

    final void getHighSpeedVideoFpsRangesFor(int i) {
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i2 == 1) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i);
            android.view.View Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges);
            if (Camera2StreamConfigurationMap != null) {
                this.getHighSpeedVideoFpsRanges = 1;
                this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                if (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges) && this.getHighSpeedVideoSizes.remove(Camera2StreamConfigurationMap)) {
                    this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap);
                }
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges);
            }
        } finally {
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }

    final android.view.View getHighResolutionOutputSizeshNQ4ISI(int i) {
        return this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges(i));
    }

    final void getHighSpeedVideoSizes() {
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges();
        for (int size = this.getHighSpeedVideoSizes.size() - 1; size >= 0; size--) {
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.get(size));
            this.getHighSpeedVideoSizes.remove(size);
        }
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
    }

    final android.view.View Camera2StreamConfigurationMap(int i) {
        int size = this.getHighSpeedVideoSizes.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.view.View view = this.getHighSpeedVideoSizes.get(i2);
            androidx.recyclerview.widget.RecyclerView.ViewHolder Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(view);
            if (Camera2StreamConfigurationMap.getLayoutPosition() == i && !Camera2StreamConfigurationMap.isInvalid() && !Camera2StreamConfigurationMap.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    final void getHighSpeedVideoFpsRanges(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams, boolean z) {
        int highSpeedVideoFpsRanges;
        if (i < 0) {
            highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
        } else {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i);
        }
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, z);
        if (z) {
            this.getHighSpeedVideoSizes.add(view);
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(view);
        }
        this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(view, highSpeedVideoFpsRanges, layoutParams);
    }

    final int getHighSpeedVideoFpsRangesFor() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor() - this.getHighSpeedVideoSizes.size();
    }

    final int getHighResolutionOutputSizeshNQ4ISI() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
    }

    final android.view.View getHighSpeedVideoSizes(int i) {
        return this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(i);
    }

    final int getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
        int highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(view);
        if (highSpeedVideoFpsRangesFor == -1 || this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor)) {
            return -1;
        }
        return highSpeedVideoFpsRangesFor - this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
    }

    final boolean getHighSpeedVideoFpsRangesFor(android.view.View view) {
        return this.getHighSpeedVideoSizes.contains(view);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor.toString());
        sb.append(", hidden list:");
        sb.append(this.getHighSpeedVideoSizes.size());
        return sb.toString();
    }

    final boolean getHighSpeedVideoFpsRanges(android.view.View view) {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 1) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == view) {
                return false;
            }
            throw new java.lang.IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i == 2) {
            throw new java.lang.IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.getHighSpeedVideoFpsRanges = 2;
            int highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(view);
            if (highSpeedVideoFpsRangesFor != -1) {
                if (!this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor)) {
                    return false;
                }
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor);
                if (this.getHighSpeedVideoSizes.remove(view)) {
                    this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(view);
                }
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
                return true;
            }
            if (this.getHighSpeedVideoSizes.remove(view)) {
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(view);
            }
            return true;
        } finally {
            this.getHighSpeedVideoFpsRanges = 0;
        }
    }

    static class Bucket {
        androidx.recyclerview.widget.ChildHelper.Bucket getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges = 0;

        Bucket() {
        }

        final void Camera2StreamConfigurationMap(int i) {
            androidx.recyclerview.widget.ChildHelper.Bucket bucket = this;
            while (i >= 64) {
                bucket = bucket.getHighResolutionOutputSizeshNQ4ISI;
                if (bucket == null) {
                    return;
                } else {
                    i -= 64;
                }
            }
            bucket.getHighSpeedVideoFpsRanges &= ~(1 << i);
        }

        final void getHighSpeedVideoFpsRanges() {
            androidx.recyclerview.widget.ChildHelper.Bucket bucket = this;
            do {
                bucket.getHighSpeedVideoFpsRanges = 0L;
                bucket = bucket.getHighResolutionOutputSizeshNQ4ISI;
            } while (bucket != null);
        }

        final int getHighResolutionOutputSizeshNQ4ISI(int i) {
            androidx.recyclerview.widget.ChildHelper.Bucket bucket = this.getHighResolutionOutputSizeshNQ4ISI;
            if (bucket == null) {
                if (i >= 64) {
                    return java.lang.Long.bitCount(this.getHighSpeedVideoFpsRanges);
                }
                return java.lang.Long.bitCount(this.getHighSpeedVideoFpsRanges & ((1 << i) - 1));
            }
            if (i < 64) {
                return java.lang.Long.bitCount(this.getHighSpeedVideoFpsRanges & ((1 << i) - 1));
            }
            return bucket.getHighResolutionOutputSizeshNQ4ISI(i - 64) + java.lang.Long.bitCount(this.getHighSpeedVideoFpsRanges);
        }

        public java.lang.String toString() {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                return java.lang.Long.toBinaryString(this.getHighSpeedVideoFpsRanges);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.toString());
            sb.append("xx");
            sb.append(java.lang.Long.toBinaryString(this.getHighSpeedVideoFpsRanges));
            return sb.toString();
        }

        final boolean getHighSpeedVideoFpsRangesFor(int i) {
            androidx.recyclerview.widget.ChildHelper.Bucket bucket = this;
            while (i >= 64) {
                if (bucket.getHighResolutionOutputSizeshNQ4ISI == null) {
                    bucket.getHighResolutionOutputSizeshNQ4ISI = new androidx.recyclerview.widget.ChildHelper.Bucket();
                }
                bucket = bucket.getHighResolutionOutputSizeshNQ4ISI;
                i -= 64;
            }
            return (bucket.getHighSpeedVideoFpsRanges & (1 << i)) != 0;
        }

        final void getHighSpeedVideoSizes(int i, boolean z) {
            androidx.recyclerview.widget.ChildHelper.Bucket bucket = this;
            while (true) {
                if (i < 64) {
                    long j = bucket.getHighSpeedVideoFpsRanges;
                    boolean z2 = (Long.MIN_VALUE & j) != 0;
                    long j2 = (1 << i) - 1;
                    bucket.getHighSpeedVideoFpsRanges = (j & j2) | (((~j2) & j) << 1);
                    if (z) {
                        bucket.getHighSpeedVideoSizes(i);
                    } else {
                        bucket.Camera2StreamConfigurationMap(i);
                    }
                    if (!z2 && bucket.getHighResolutionOutputSizeshNQ4ISI == null) {
                        return;
                    }
                    if (bucket.getHighResolutionOutputSizeshNQ4ISI == null) {
                        bucket.getHighResolutionOutputSizeshNQ4ISI = new androidx.recyclerview.widget.ChildHelper.Bucket();
                    }
                    bucket = bucket.getHighResolutionOutputSizeshNQ4ISI;
                    z = z2;
                    i = 0;
                } else {
                    if (bucket.getHighResolutionOutputSizeshNQ4ISI == null) {
                        bucket.getHighResolutionOutputSizeshNQ4ISI = new androidx.recyclerview.widget.ChildHelper.Bucket();
                    }
                    bucket = bucket.getHighResolutionOutputSizeshNQ4ISI;
                    i -= 64;
                }
            }
        }

        final boolean getHighSpeedVideoFpsRanges(int i) {
            androidx.recyclerview.widget.ChildHelper.Bucket bucket = this;
            while (i >= 64) {
                if (bucket.getHighResolutionOutputSizeshNQ4ISI == null) {
                    bucket.getHighResolutionOutputSizeshNQ4ISI = new androidx.recyclerview.widget.ChildHelper.Bucket();
                }
                bucket = bucket.getHighResolutionOutputSizeshNQ4ISI;
                i -= 64;
            }
            long j = 1 << i;
            long j2 = bucket.getHighSpeedVideoFpsRanges;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            bucket.getHighSpeedVideoFpsRanges = j3;
            long j4 = j - 1;
            bucket.getHighSpeedVideoFpsRanges = java.lang.Long.rotateRight((~j4) & j3, 1) | (j4 & j3);
            androidx.recyclerview.widget.ChildHelper.Bucket bucket2 = bucket.getHighResolutionOutputSizeshNQ4ISI;
            if (bucket2 != null) {
                if (bucket2.getHighSpeedVideoFpsRangesFor(0)) {
                    bucket.getHighSpeedVideoSizes(63);
                }
                bucket.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(0);
            }
            return z;
        }

        final void getHighSpeedVideoSizes(int i) {
            androidx.recyclerview.widget.ChildHelper.Bucket bucket = this;
            while (i >= 64) {
                if (bucket.getHighResolutionOutputSizeshNQ4ISI == null) {
                    bucket.getHighResolutionOutputSizeshNQ4ISI = new androidx.recyclerview.widget.ChildHelper.Bucket();
                }
                bucket = bucket.getHighResolutionOutputSizeshNQ4ISI;
                i -= 64;
            }
            bucket.getHighSpeedVideoFpsRanges |= 1 << i;
        }
    }
}
