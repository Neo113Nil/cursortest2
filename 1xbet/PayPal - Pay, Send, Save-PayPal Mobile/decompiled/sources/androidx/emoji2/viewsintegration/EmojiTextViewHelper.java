package androidx.emoji2.viewsintegration;

/* loaded from: classes3.dex */
public final class EmojiTextViewHelper {
    private final androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal Camera2StreamConfigurationMap;

    public EmojiTextViewHelper(android.widget.TextView textView) {
        this(textView, true);
    }

    public EmojiTextViewHelper(android.widget.TextView textView, boolean z) {
        androidx.core.util.Preconditions.checkNotNull(textView, "textView cannot be null");
        if (!z) {
            this.Camera2StreamConfigurationMap = new androidx.emoji2.viewsintegration.EmojiTextViewHelper.SkippingHelper19(textView);
        } else {
            this.Camera2StreamConfigurationMap = new androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal19(textView);
        }
    }

    public final void updateTransformationMethod() {
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
    }

    public final android.text.InputFilter[] getFilters(android.text.InputFilter[] inputFilterArr) {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(inputFilterArr);
    }

    public final android.text.method.TransformationMethod wrapTransformationMethod(android.text.method.TransformationMethod transformationMethod) {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(transformationMethod);
    }

    public final void setEnabled(boolean z) {
        this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(z);
    }

    public final void setAllCaps(boolean z) {
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(z);
    }

    public final boolean isEnabled() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
    }

    static class HelperInternal {
        void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        }

        android.text.method.TransformationMethod getHighSpeedVideoFpsRanges(android.text.method.TransformationMethod transformationMethod) {
            return transformationMethod;
        }

        void getHighSpeedVideoFpsRanges() {
        }

        public boolean getHighSpeedVideoFpsRangesFor() {
            return false;
        }

        android.text.InputFilter[] getHighSpeedVideoFpsRangesFor(android.text.InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        void getHighSpeedVideoSizes(boolean z) {
        }

        HelperInternal() {
        }
    }

    static class SkippingHelper19 extends androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal {
        private final androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal19 getHighResolutionOutputSizeshNQ4ISI;

        SkippingHelper19(android.widget.TextView textView) {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal19(textView);
        }

        private boolean Camera2StreamConfigurationMap() {
            return !androidx.emoji2.text.EmojiCompat.isConfigured();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void getHighSpeedVideoFpsRanges() {
            if (Camera2StreamConfigurationMap()) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        android.text.InputFilter[] getHighSpeedVideoFpsRangesFor(android.text.InputFilter[] inputFilterArr) {
            return Camera2StreamConfigurationMap() ? inputFilterArr : this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        android.text.method.TransformationMethod getHighSpeedVideoFpsRanges(android.text.method.TransformationMethod transformationMethod) {
            return Camera2StreamConfigurationMap() ? transformationMethod : this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            if (Camera2StreamConfigurationMap()) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(z);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void getHighSpeedVideoSizes(boolean z) {
            if (Camera2StreamConfigurationMap()) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(z);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(z);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean getHighSpeedVideoFpsRangesFor() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
        }
    }

    static class HelperInternal19 extends androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal {
        private boolean getHighResolutionOutputSizeshNQ4ISI = true;
        private final androidx.emoji2.viewsintegration.EmojiInputFilter getHighSpeedVideoFpsRangesFor;
        private final android.widget.TextView getHighSpeedVideoSizes;

        HelperInternal19(android.widget.TextView textView) {
            this.getHighSpeedVideoSizes = textView;
            this.getHighSpeedVideoFpsRangesFor = new androidx.emoji2.viewsintegration.EmojiInputFilter(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void getHighSpeedVideoFpsRanges() {
            this.getHighSpeedVideoSizes.setTransformationMethod(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.getTransformationMethod()));
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            this.getHighSpeedVideoSizes.setFilters(getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes.getFilters()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        android.text.InputFilter[] getHighSpeedVideoFpsRangesFor(android.text.InputFilter[] inputFilterArr) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                return getHighSpeedVideoSizes(inputFilterArr);
            }
            return Camera2StreamConfigurationMap(inputFilterArr);
        }

        private android.text.InputFilter[] Camera2StreamConfigurationMap(android.text.InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (android.text.InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.getHighSpeedVideoFpsRangesFor) {
                    return inputFilterArr;
                }
            }
            android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length + 1];
            java.lang.System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.getHighSpeedVideoFpsRangesFor;
            return inputFilterArr2;
        }

        private android.text.InputFilter[] getHighSpeedVideoSizes(android.text.InputFilter[] inputFilterArr) {
            android.util.SparseArray<android.text.InputFilter> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(inputFilterArr);
            if (highSpeedVideoFpsRanges.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length - highSpeedVideoFpsRanges.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (highSpeedVideoFpsRanges.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        private android.util.SparseArray<android.text.InputFilter> getHighSpeedVideoFpsRanges(android.text.InputFilter[] inputFilterArr) {
            android.util.SparseArray<android.text.InputFilter> sparseArray = new android.util.SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                android.text.InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof androidx.emoji2.viewsintegration.EmojiInputFilter) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        android.text.method.TransformationMethod getHighSpeedVideoFpsRanges(android.text.method.TransformationMethod transformationMethod) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return getHighSpeedVideoSizes(transformationMethod);
            }
            return Camera2StreamConfigurationMap(transformationMethod);
        }

        private android.text.method.TransformationMethod Camera2StreamConfigurationMap(android.text.method.TransformationMethod transformationMethod) {
            return transformationMethod instanceof androidx.emoji2.viewsintegration.EmojiTransformationMethod ? ((androidx.emoji2.viewsintegration.EmojiTransformationMethod) transformationMethod).Camera2StreamConfigurationMap : transformationMethod;
        }

        private android.text.method.TransformationMethod getHighSpeedVideoSizes(android.text.method.TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof androidx.emoji2.viewsintegration.EmojiTransformationMethod) || (transformationMethod instanceof android.text.method.PasswordTransformationMethod)) ? transformationMethod : new androidx.emoji2.viewsintegration.EmojiTransformationMethod(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            if (z) {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void getHighSpeedVideoSizes(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            getHighSpeedVideoFpsRanges();
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean getHighSpeedVideoFpsRangesFor() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        void getHighSpeedVideoFpsRangesFor(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }
    }
}
