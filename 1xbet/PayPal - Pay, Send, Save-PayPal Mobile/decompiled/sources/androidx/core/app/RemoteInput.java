package androidx.core.app;

/* loaded from: classes3.dex */
public final class RemoteInput {
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    public static final java.lang.String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    public static final java.lang.String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;
    private final java.lang.CharSequence[] Camera2StreamConfigurationMap;
    private final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final android.os.Bundle getHighSpeedVideoSizes;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final java.lang.CharSequence getOutputFormats;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Source {
    }

    RemoteInput(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence[] charSequenceArr, boolean z, int i, android.os.Bundle bundle, java.util.Set<java.lang.String> set) {
        this.getInputSizeshNQ4ISI = str;
        this.getOutputFormats = charSequence;
        this.Camera2StreamConfigurationMap = charSequenceArr;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = bundle;
        this.getHighResolutionOutputSizeshNQ4ISI = set;
        if (getEditChoicesBeforeSending() == 2 && !getAllowFreeFormInput()) {
            throw new java.lang.IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public final java.lang.String getResultKey() {
        return this.getInputSizeshNQ4ISI;
    }

    public final java.lang.CharSequence getLabel() {
        return this.getOutputFormats;
    }

    public final java.lang.CharSequence[] getChoices() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.Set<java.lang.String> getAllowedDataTypes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isDataOnly() {
        if (getAllowFreeFormInput()) {
            return false;
        }
        return ((getChoices() != null && getChoices().length != 0) || getAllowedDataTypes() == null || getAllowedDataTypes().isEmpty()) ? false : true;
    }

    public final boolean getAllowFreeFormInput() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int getEditChoicesBeforeSending() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final android.os.Bundle getExtras() {
        return this.getHighSpeedVideoSizes;
    }

    /* loaded from: classes7.dex */
    public static final class Builder {
        private java.lang.CharSequence[] Camera2StreamConfigurationMap;
        private java.lang.CharSequence getHighSpeedVideoSizesFor;
        private final java.lang.String getOutputMinFrameDuration;
        private final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();
        private final android.os.Bundle getHighSpeedVideoFpsRangesFor = new android.os.Bundle();
        private boolean getHighSpeedVideoSizes = true;
        private int getHighSpeedVideoFpsRanges = 0;

        public Builder(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalArgumentException("Result key can't be null");
            }
            this.getOutputMinFrameDuration = str;
        }

        public final androidx.core.app.RemoteInput.Builder setLabel(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizesFor = charSequence;
            return this;
        }

        public final androidx.core.app.RemoteInput.Builder setChoices(java.lang.CharSequence[] charSequenceArr) {
            this.Camera2StreamConfigurationMap = charSequenceArr;
            return this;
        }

        public final androidx.core.app.RemoteInput.Builder setAllowDataType(java.lang.String str, boolean z) {
            if (z) {
                this.getHighResolutionOutputSizeshNQ4ISI.add(str);
                return this;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.remove(str);
            return this;
        }

        public final androidx.core.app.RemoteInput.Builder setAllowFreeFormInput(boolean z) {
            this.getHighSpeedVideoSizes = z;
            return this;
        }

        public final androidx.core.app.RemoteInput.Builder setEditChoicesBeforeSending(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        public final androidx.core.app.RemoteInput.Builder addExtras(android.os.Bundle bundle) {
            if (bundle != null) {
                this.getHighSpeedVideoFpsRangesFor.putAll(bundle);
            }
            return this;
        }

        public final android.os.Bundle getExtras() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final androidx.core.app.RemoteInput build() {
            return new androidx.core.app.RemoteInput(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public static java.util.Map<java.lang.String, android.net.Uri> getDataResultsFromIntent(android.content.Intent intent, java.lang.String str) {
        return androidx.core.app.RemoteInput.Api26Impl.getHighSpeedVideoFpsRanges(intent, str);
    }

    public static android.os.Bundle getResultsFromIntent(android.content.Intent intent) {
        return android.app.RemoteInput.getResultsFromIntent(intent);
    }

    public static void addResultsToIntent(androidx.core.app.RemoteInput[] remoteInputArr, android.content.Intent intent, android.os.Bundle bundle) {
        android.app.RemoteInput.addResultsToIntent(getHighSpeedVideoSizes(remoteInputArr), intent, bundle);
    }

    public static void addDataResultToIntent(androidx.core.app.RemoteInput remoteInput, android.content.Intent intent, java.util.Map<java.lang.String, android.net.Uri> map) {
        androidx.core.app.RemoteInput.Api26Impl.getHighSpeedVideoFpsRangesFor(remoteInput, intent, map);
    }

    public static void setResultsSource(android.content.Intent intent, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.app.RemoteInput.Api28Impl.getHighSpeedVideoFpsRanges(intent, i);
            return;
        }
        android.content.Intent highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(intent);
        if (highSpeedVideoFpsRangesFor == null) {
            highSpeedVideoFpsRangesFor = new android.content.Intent();
        }
        highSpeedVideoFpsRangesFor.putExtra("android.remoteinput.resultsSource", i);
        intent.setClipData(android.content.ClipData.newIntent(RESULTS_CLIP_LABEL, highSpeedVideoFpsRangesFor));
    }

    public static int getResultsSource(android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.app.RemoteInput.Api28Impl.getHighSpeedVideoFpsRangesFor(intent);
        }
        android.content.Intent highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(intent);
        if (highSpeedVideoFpsRangesFor == null) {
            return 0;
        }
        return highSpeedVideoFpsRangesFor.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }

    static android.app.RemoteInput[] getHighSpeedVideoSizes(androidx.core.app.RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            remoteInputArr2[i] = androidx.core.app.RemoteInput.Api20Impl.getHighSpeedVideoSizes(remoteInputArr[i]);
        }
        return remoteInputArr2;
    }

    static android.app.RemoteInput getHighSpeedVideoFpsRanges(androidx.core.app.RemoteInput remoteInput) {
        return androidx.core.app.RemoteInput.Api20Impl.getHighSpeedVideoSizes(remoteInput);
    }

    static androidx.core.app.RemoteInput getHighResolutionOutputSizeshNQ4ISI(android.app.RemoteInput remoteInput) {
        return androidx.core.app.RemoteInput.Api20Impl.Camera2StreamConfigurationMap(remoteInput);
    }

    private static android.content.Intent getHighSpeedVideoFpsRangesFor(android.content.Intent intent) {
        android.content.ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        android.content.ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(RESULTS_CLIP_LABEL)) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static java.util.Map<java.lang.String, android.net.Uri> getHighSpeedVideoFpsRanges(android.content.Intent intent, java.lang.String str) {
            return android.app.RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static java.util.Set<java.lang.String> getHighSpeedVideoSizes(java.lang.Object obj) {
            return ((android.app.RemoteInput) obj).getAllowedDataTypes();
        }

        static void getHighSpeedVideoFpsRangesFor(androidx.core.app.RemoteInput remoteInput, android.content.Intent intent, java.util.Map<java.lang.String, android.net.Uri> map) {
            android.app.RemoteInput.addDataResultToIntent(androidx.core.app.RemoteInput.getHighSpeedVideoFpsRanges(remoteInput), intent, map);
        }

        static android.app.RemoteInput.Builder Camera2StreamConfigurationMap(android.app.RemoteInput.Builder builder, java.lang.String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    static class Api20Impl {
        private Api20Impl() {
        }

        static androidx.core.app.RemoteInput Camera2StreamConfigurationMap(java.lang.Object obj) {
            android.app.RemoteInput remoteInput = (android.app.RemoteInput) obj;
            androidx.core.app.RemoteInput.Builder addExtras = new androidx.core.app.RemoteInput.Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
            java.util.Set<java.lang.String> highSpeedVideoSizes = androidx.core.app.RemoteInput.Api26Impl.getHighSpeedVideoSizes(remoteInput);
            if (highSpeedVideoSizes != null) {
                java.util.Iterator<java.lang.String> it = highSpeedVideoSizes.iterator();
                while (it.hasNext()) {
                    addExtras.setAllowDataType(it.next(), true);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                addExtras.setEditChoicesBeforeSending(androidx.core.app.RemoteInput.Api29Impl.getHighSpeedVideoFpsRangesFor(remoteInput));
            }
            return addExtras.build();
        }

        public static android.app.RemoteInput getHighSpeedVideoSizes(androidx.core.app.RemoteInput remoteInput) {
            android.app.RemoteInput.Builder addExtras = new android.app.RemoteInput.Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
            java.util.Set<java.lang.String> allowedDataTypes = remoteInput.getAllowedDataTypes();
            if (allowedDataTypes != null) {
                java.util.Iterator<java.lang.String> it = allowedDataTypes.iterator();
                while (it.hasNext()) {
                    androidx.core.app.RemoteInput.Api26Impl.Camera2StreamConfigurationMap(addExtras, it.next(), true);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                androidx.core.app.RemoteInput.Api29Impl.Camera2StreamConfigurationMap(addExtras, remoteInput.getEditChoicesBeforeSending());
            }
            return addExtras.build();
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static int getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
            return ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static android.app.RemoteInput.Builder Camera2StreamConfigurationMap(android.app.RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    /* loaded from: classes7.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static void getHighSpeedVideoFpsRanges(android.content.Intent intent, int i) {
            android.app.RemoteInput.setResultsSource(intent, i);
        }

        static int getHighSpeedVideoFpsRangesFor(android.content.Intent intent) {
            return android.app.RemoteInput.getResultsSource(intent);
        }
    }
}
