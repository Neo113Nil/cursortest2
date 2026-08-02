package androidx.view.result;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00010B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@AX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00138\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00198\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00138\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R*\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\"8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R.\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u0005\u001a\u0004\u0018\u00010)8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest;", "", "<init>", "()V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "mediaType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "getMediaType", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "setMediaType$activity", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)V", "", "maxItems", com.visa.cbp.getEncExpo.warmup, "getMaxItems", "()I", "setMaxItems$activity", "(I)V", "", "isOrderedSelection", "Z", "()Z", "setOrderedSelection$activity", "(Z)V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "defaultTab", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "getDefaultTab", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "setDefaultTab$activity", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)V", "isCustomAccentColorApplied", "setCustomAccentColorApplied$activity", "", "accentColor", "J", "getAccentColor", "()J", "setAccentColor$activity", "(J)V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "mediaCapabilitiesForTranscoding", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "getMediaCapabilitiesForTranscoding", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "setMediaCapabilitiesForTranscoding$activity", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;)V", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PickVisualMediaRequest {
    private long accentColor;
    private boolean isCustomAccentColorApplied;
    private boolean isOrderedSelection;
    private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilitiesForTranscoding;
    private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
    private int maxItems = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.getMaxItems$activity();
    private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;

    public final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType getMediaType() {
        return this.mediaType;
    }

    public final void setMediaType$activity(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualMediaType, "");
        this.mediaType = visualMediaType;
    }

    public final int getMaxItems() {
        return this.maxItems;
    }

    public final void setMaxItems$activity(int i) {
        this.maxItems = i;
    }

    /* renamed from: isOrderedSelection, reason: from getter */
    public final boolean getIsOrderedSelection() {
        return this.isOrderedSelection;
    }

    public final void setOrderedSelection$activity(boolean z) {
        this.isOrderedSelection = z;
    }

    public final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab getDefaultTab() {
        return this.defaultTab;
    }

    public final void setDefaultTab$activity(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultTab, "");
        this.defaultTab = defaultTab;
    }

    /* renamed from: isCustomAccentColorApplied, reason: from getter */
    public final boolean getIsCustomAccentColorApplied() {
        return this.isCustomAccentColorApplied;
    }

    public final void setCustomAccentColorApplied$activity(boolean z) {
        this.isCustomAccentColorApplied = z;
    }

    public final long getAccentColor() {
        return this.accentColor;
    }

    public final void setAccentColor$activity(long j) {
        this.accentColor = j;
    }

    public final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities getMediaCapabilitiesForTranscoding() {
        return this.mediaCapabilitiesForTranscoding;
    }

    public final void setMediaCapabilitiesForTranscoding$activity(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities) {
        this.mediaCapabilitiesForTranscoding = mediaCapabilities;
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010'R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010*\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "<init>", "()V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mediaType", "setMediaType", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "maxItems", "setMaxItems", "(I)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "isOrderedSelection", "setOrderedSelection", "(Z)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "defaultTab", "setDefaultTab", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "accentColor", "setAccentColor", "(J)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "mediaCapabilities", "setMediaCapabilitiesForTranscoding", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "Landroidx/activity/result/PickVisualMediaRequest;", "build", "()Landroidx/activity/result/PickVisualMediaRequest;", "getOutputFormats", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Z", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "getHighSpeedVideoFpsRangesFor", "J", "getInputSizeshNQ4ISI", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "getInputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private boolean Camera2StreamConfigurationMap;
        private boolean getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private long getInputSizeshNQ4ISI;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities getInputFormats;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType getHighSpeedVideoFpsRanges = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private int getHighSpeedVideoSizes = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.getMaxItems$activity();

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab getHighResolutionOutputSizeshNQ4ISI = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;

        public final androidx.activity.result.PickVisualMediaRequest.Builder setMediaType(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaType, "");
            this.getHighSpeedVideoFpsRanges = mediaType;
            return this;
        }

        public final androidx.activity.result.PickVisualMediaRequest.Builder setMaxItems(int maxItems) {
            this.getHighSpeedVideoSizes = maxItems;
            return this;
        }

        public final androidx.activity.result.PickVisualMediaRequest.Builder setOrderedSelection(boolean isOrderedSelection) {
            this.Camera2StreamConfigurationMap = isOrderedSelection;
            return this;
        }

        public final androidx.activity.result.PickVisualMediaRequest.Builder setDefaultTab(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultTab, "");
            this.getHighResolutionOutputSizeshNQ4ISI = defaultTab;
            return this;
        }

        public final androidx.activity.result.PickVisualMediaRequest.Builder setAccentColor(long accentColor) {
            this.getInputSizeshNQ4ISI = accentColor;
            this.getHighSpeedVideoFpsRangesFor = true;
            return this;
        }

        public final androidx.activity.result.PickVisualMediaRequest.Builder setMediaCapabilitiesForTranscoding(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities) {
            this.getInputFormats = mediaCapabilities;
            return this;
        }

        public final androidx.view.result.PickVisualMediaRequest build() {
            androidx.view.result.PickVisualMediaRequest pickVisualMediaRequest = new androidx.view.result.PickVisualMediaRequest();
            pickVisualMediaRequest.setMediaType$activity(this.getHighSpeedVideoFpsRanges);
            pickVisualMediaRequest.setMaxItems$activity(this.getHighSpeedVideoSizes);
            pickVisualMediaRequest.setOrderedSelection$activity(this.Camera2StreamConfigurationMap);
            pickVisualMediaRequest.setDefaultTab$activity(this.getHighResolutionOutputSizeshNQ4ISI);
            pickVisualMediaRequest.setCustomAccentColorApplied$activity(this.getHighSpeedVideoFpsRangesFor);
            pickVisualMediaRequest.setAccentColor$activity(this.getInputSizeshNQ4ISI);
            pickVisualMediaRequest.setMediaCapabilitiesForTranscoding$activity(this.getInputFormats);
            return pickVisualMediaRequest;
        }
    }
}
