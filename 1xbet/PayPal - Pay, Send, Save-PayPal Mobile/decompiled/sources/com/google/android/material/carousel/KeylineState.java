package com.google.android.material.carousel;

/* loaded from: classes8.dex */
final class KeylineState {
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final java.util.List<com.google.android.material.carousel.KeylineState.Keyline> keylines;
    private final int lastFocalKeylineIndex;

    private KeylineState(float f, java.util.List<com.google.android.material.carousel.KeylineState.Keyline> list, int i, int i2) {
        this.itemSize = f;
        this.keylines = java.util.Collections.unmodifiableList(list);
        this.firstFocalKeylineIndex = i;
        this.lastFocalKeylineIndex = i2;
    }

    final float getItemSize() {
        return this.itemSize;
    }

    final java.util.List<com.google.android.material.carousel.KeylineState.Keyline> getKeylines() {
        return this.keylines;
    }

    final com.google.android.material.carousel.KeylineState.Keyline getFirstFocalKeyline() {
        return this.keylines.get(this.firstFocalKeylineIndex);
    }

    final int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    final com.google.android.material.carousel.KeylineState.Keyline getLastFocalKeyline() {
        return this.keylines.get(this.lastFocalKeylineIndex);
    }

    final int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    final java.util.List<com.google.android.material.carousel.KeylineState.Keyline> getFocalKeylines() {
        return this.keylines.subList(this.firstFocalKeylineIndex, this.lastFocalKeylineIndex + 1);
    }

    final com.google.android.material.carousel.KeylineState.Keyline getFirstKeyline() {
        return this.keylines.get(0);
    }

    final com.google.android.material.carousel.KeylineState.Keyline getLastKeyline() {
        return this.keylines.get(r0.size() - 1);
    }

    final com.google.android.material.carousel.KeylineState.Keyline getFirstNonAnchorKeyline() {
        for (int i = 0; i < this.keylines.size(); i++) {
            com.google.android.material.carousel.KeylineState.Keyline keyline = this.keylines.get(i);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    final com.google.android.material.carousel.KeylineState.Keyline getLastNonAnchorKeyline() {
        for (int size = this.keylines.size() - 1; size >= 0; size--) {
            com.google.android.material.carousel.KeylineState.Keyline keyline = this.keylines.get(size);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    final int getNumberOfNonAnchorKeylines() {
        java.util.Iterator<com.google.android.material.carousel.KeylineState.Keyline> it = this.keylines.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().isAnchor) {
                i++;
            }
        }
        return this.keylines.size() - i;
    }

    static com.google.android.material.carousel.KeylineState lerp(com.google.android.material.carousel.KeylineState keylineState, com.google.android.material.carousel.KeylineState keylineState2, float f) {
        if (keylineState.getItemSize() != keylineState2.getItemSize()) {
            throw new java.lang.IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        java.util.List<com.google.android.material.carousel.KeylineState.Keyline> keylines = keylineState.getKeylines();
        java.util.List<com.google.android.material.carousel.KeylineState.Keyline> keylines2 = keylineState2.getKeylines();
        if (keylines.size() != keylines2.size()) {
            throw new java.lang.IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < keylineState.getKeylines().size(); i++) {
            arrayList.add(com.google.android.material.carousel.KeylineState.Keyline.lerp(keylines.get(i), keylines2.get(i), f));
        }
        return new com.google.android.material.carousel.KeylineState(keylineState.getItemSize(), arrayList, com.google.android.material.animation.AnimationUtils.lerp(keylineState.getFirstFocalKeylineIndex(), keylineState2.getFirstFocalKeylineIndex(), f), com.google.android.material.animation.AnimationUtils.lerp(keylineState.getLastFocalKeylineIndex(), keylineState2.getLastFocalKeylineIndex(), f));
    }

    static com.google.android.material.carousel.KeylineState reverse(com.google.android.material.carousel.KeylineState keylineState, float f) {
        com.google.android.material.carousel.KeylineState.Builder builder = new com.google.android.material.carousel.KeylineState.Builder(keylineState.getItemSize(), f);
        float f2 = (f - keylineState.getLastKeyline().locOffset) - (keylineState.getLastKeyline().maskedItemSize / 2.0f);
        int size = keylineState.getKeylines().size() - 1;
        while (size >= 0) {
            com.google.android.material.carousel.KeylineState.Keyline keyline = keylineState.getKeylines().get(size);
            builder.addKeyline((keyline.maskedItemSize / 2.0f) + f2, keyline.mask, keyline.maskedItemSize, size >= keylineState.getFirstFocalKeylineIndex() && size <= keylineState.getLastFocalKeylineIndex(), keyline.isAnchor);
            f2 += keyline.maskedItemSize;
            size--;
        }
        return builder.build();
    }

    static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final float availableSpace;
        private final float itemSize;
        private com.google.android.material.carousel.KeylineState.Keyline tmpFirstFocalKeyline;
        private com.google.android.material.carousel.KeylineState.Keyline tmpLastFocalKeyline;
        private final java.util.List<com.google.android.material.carousel.KeylineState.Keyline> tmpKeylines = new java.util.ArrayList();
        private int firstFocalKeylineIndex = -1;
        private int lastFocalKeylineIndex = -1;
        private float lastKeylineMaskedSize = 0.0f;
        private int latestAnchorKeylineIndex = -1;

        private static float calculateKeylineLocationForItemPosition(float f, float f2, int i, int i2) {
            return (f - (i * f2)) + (i2 * f2);
        }

        Builder(float f, float f2) {
            this.itemSize = f;
            this.availableSpace = f2;
        }

        final com.google.android.material.carousel.KeylineState.Builder addKeyline(float f, float f2, float f3, boolean z) {
            return addKeyline(f, f2, f3, z, false);
        }

        final com.google.android.material.carousel.KeylineState.Builder addKeyline(float f, float f2, float f3) {
            return addKeyline(f, f2, f3, false);
        }

        final com.google.android.material.carousel.KeylineState.Builder addKeyline(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
            if (f3 <= 0.0f) {
                return this;
            }
            if (z2) {
                if (z) {
                    throw new java.lang.IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i = this.latestAnchorKeylineIndex;
                if (i != -1 && i != 0) {
                    throw new java.lang.IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.latestAnchorKeylineIndex = this.tmpKeylines.size();
            }
            com.google.android.material.carousel.KeylineState.Keyline keyline = new com.google.android.material.carousel.KeylineState.Keyline(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
            if (z) {
                if (this.tmpFirstFocalKeyline == null) {
                    this.tmpFirstFocalKeyline = keyline;
                    this.firstFocalKeylineIndex = this.tmpKeylines.size();
                }
                if (this.lastFocalKeylineIndex != -1 && this.tmpKeylines.size() - this.lastFocalKeylineIndex > 1) {
                    throw new java.lang.IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.tmpFirstFocalKeyline.maskedItemSize) {
                    throw new java.lang.IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.tmpLastFocalKeyline = keyline;
                this.lastFocalKeylineIndex = this.tmpKeylines.size();
            } else {
                if (this.tmpFirstFocalKeyline == null && keyline.maskedItemSize < this.lastKeylineMaskedSize) {
                    throw new java.lang.IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.tmpLastFocalKeyline != null && keyline.maskedItemSize > this.lastKeylineMaskedSize) {
                    throw new java.lang.IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.lastKeylineMaskedSize = keyline.maskedItemSize;
            this.tmpKeylines.add(keyline);
            return this;
        }

        final com.google.android.material.carousel.KeylineState.Builder addKeyline(float f, float f2, float f3, boolean z, boolean z2, float f4) {
            return addKeyline(f, f2, f3, z, z2, f4, 0.0f, 0.0f);
        }

        final com.google.android.material.carousel.KeylineState.Builder addKeyline(float f, float f2, float f3, boolean z, boolean z2) {
            float f4;
            float f5 = f3 / 2.0f;
            float f6 = f - f5;
            float f7 = f5 + f;
            float f8 = this.availableSpace;
            if (f7 > f8) {
                f4 = java.lang.Math.abs(f7 - java.lang.Math.max(f7 - f3, f8));
            } else {
                f4 = 0.0f;
                if (f6 < 0.0f) {
                    f4 = java.lang.Math.abs(f6 - java.lang.Math.min(f6 + f3, 0.0f));
                }
            }
            return addKeyline(f, f2, f3, z, z2, f4);
        }

        final com.google.android.material.carousel.KeylineState.Builder addAnchorKeyline(float f, float f2, float f3) {
            return addKeyline(f, f2, f3, false, true);
        }

        final com.google.android.material.carousel.KeylineState.Builder addKeylineRange(float f, float f2, float f3, int i) {
            return addKeylineRange(f, f2, f3, i, false);
        }

        final com.google.android.material.carousel.KeylineState.Builder addKeylineRange(float f, float f2, float f3, int i, boolean z) {
            if (i > 0 && f3 > 0.0f) {
                for (int i2 = 0; i2 < i; i2++) {
                    addKeyline((i2 * f3) + f, f2, f3, z);
                }
            }
            return this;
        }

        final com.google.android.material.carousel.KeylineState build() {
            if (this.tmpFirstFocalKeyline == null) {
                throw new java.lang.IllegalStateException("There must be a keyline marked as focal.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < this.tmpKeylines.size(); i++) {
                com.google.android.material.carousel.KeylineState.Keyline keyline = this.tmpKeylines.get(i);
                arrayList.add(new com.google.android.material.carousel.KeylineState.Keyline(calculateKeylineLocationForItemPosition(this.tmpFirstFocalKeyline.locOffset, this.itemSize, this.firstFocalKeylineIndex, i), keyline.locOffset, keyline.mask, keyline.maskedItemSize, keyline.isAnchor, keyline.cutoff, keyline.leftOrTopPaddingShift, keyline.rightOrBottomPaddingShift));
            }
            return new com.google.android.material.carousel.KeylineState(this.itemSize, arrayList, this.firstFocalKeylineIndex, this.lastFocalKeylineIndex);
        }
    }

    static final class Keyline {
        final float cutoff;
        final boolean isAnchor;
        final float leftOrTopPaddingShift;
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;
        final float rightOrBottomPaddingShift;

        Keyline(float f, float f2, float f3, float f4) {
            this(f, f2, f3, f4, false, 0.0f, 0.0f, 0.0f);
        }

        Keyline(float f, float f2, float f3, float f4, boolean z, float f5, float f6, float f7) {
            this.loc = f;
            this.locOffset = f2;
            this.mask = f3;
            this.maskedItemSize = f4;
            this.isAnchor = z;
            this.cutoff = f5;
            this.leftOrTopPaddingShift = f6;
            this.rightOrBottomPaddingShift = f7;
        }

        static com.google.android.material.carousel.KeylineState.Keyline lerp(com.google.android.material.carousel.KeylineState.Keyline keyline, com.google.android.material.carousel.KeylineState.Keyline keyline2, float f) {
            return new com.google.android.material.carousel.KeylineState.Keyline(com.google.android.material.animation.AnimationUtils.lerp(keyline.loc, keyline2.loc, f), com.google.android.material.animation.AnimationUtils.lerp(keyline.locOffset, keyline2.locOffset, f), com.google.android.material.animation.AnimationUtils.lerp(keyline.mask, keyline2.mask, f), com.google.android.material.animation.AnimationUtils.lerp(keyline.maskedItemSize, keyline2.maskedItemSize, f));
        }
    }
}
