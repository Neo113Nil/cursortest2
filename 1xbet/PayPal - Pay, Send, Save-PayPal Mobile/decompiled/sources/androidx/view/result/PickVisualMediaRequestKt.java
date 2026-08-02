package androidx.view.result;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0003\u0010\u0007\u001a5\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0003\u0010\f\u001a=\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0003\u0010\u000f\u001a?\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0003\u0010\u0012\u001aG\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0003\u0010\u0013"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mediaType", "Landroidx/activity/result/PickVisualMediaRequest;", "PickVisualMediaRequest", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest;", "", "maxItems", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;I)Landroidx/activity/result/PickVisualMediaRequest;", "", "isOrderedSelection", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "defaultTab", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;IZLandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)Landroidx/activity/result/PickVisualMediaRequest;", "", "accentColor", "(JLandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;IZLandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)Landroidx/activity/result/PickVisualMediaRequest;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "mediaCapabilitiesForTranscoding", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;IZLandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)Landroidx/activity/result/PickVisualMediaRequest;", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;JLandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;IZLandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)Landroidx/activity/result/PickVisualMediaRequest;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PickVisualMediaRequestKt {
    public static /* synthetic */ androidx.view.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            visualMediaType = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by PickVisualMediaRequest that takes an optional maxItems")
    public static final /* synthetic */ androidx.view.result.PickVisualMediaRequest PickVisualMediaRequest(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualMediaType, "");
        return new androidx.activity.result.PickVisualMediaRequest.Builder().setMediaType(visualMediaType).build();
    }

    public static /* synthetic */ androidx.view.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            visualMediaType = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.getMaxItems$activity();
        }
        return PickVisualMediaRequest(visualMediaType, i);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by PickVisualMediaRequest that take optional isOrderedSelection and defaultTab")
    public static final /* synthetic */ androidx.view.result.PickVisualMediaRequest PickVisualMediaRequest(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualMediaType, "");
        return new androidx.activity.result.PickVisualMediaRequest.Builder().setMediaType(visualMediaType).setMaxItems(i).build();
    }

    public static /* synthetic */ androidx.view.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, boolean z, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            visualMediaType = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.getMaxItems$activity();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            defaultTab = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType, i, z, defaultTab);
    }

    public static final androidx.view.result.PickVisualMediaRequest PickVisualMediaRequest(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, boolean z, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualMediaType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultTab, "");
        return new androidx.activity.result.PickVisualMediaRequest.Builder().setMediaType(visualMediaType).setMaxItems(i).setOrderedSelection(z).setDefaultTab(defaultTab).build();
    }

    public static /* synthetic */ androidx.view.result.PickVisualMediaRequest PickVisualMediaRequest$default(long j, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, boolean z, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            visualMediaType = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType2 = visualMediaType;
        if ((i2 & 4) != 0) {
            i = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.getMaxItems$activity();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            defaultTab = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(j, visualMediaType2, i3, z2, defaultTab);
    }

    public static final androidx.view.result.PickVisualMediaRequest PickVisualMediaRequest(long j, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, boolean z, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualMediaType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultTab, "");
        return new androidx.activity.result.PickVisualMediaRequest.Builder().setMediaType(visualMediaType).setMaxItems(i).setOrderedSelection(z).setDefaultTab(defaultTab).setAccentColor(j).build();
    }

    public static /* synthetic */ androidx.view.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, boolean z, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            visualMediaType = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            i = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.getMaxItems$activity();
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            defaultTab = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(mediaCapabilities, visualMediaType, i, z, defaultTab);
    }

    public static final androidx.view.result.PickVisualMediaRequest PickVisualMediaRequest(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, boolean z, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualMediaType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultTab, "");
        return new androidx.activity.result.PickVisualMediaRequest.Builder().setMediaType(visualMediaType).setMaxItems(i).setOrderedSelection(z).setDefaultTab(defaultTab).setMediaCapabilitiesForTranscoding(mediaCapabilities).build();
    }

    public static /* synthetic */ androidx.view.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities, long j, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, boolean z, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            visualMediaType = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType2 = visualMediaType;
        if ((i2 & 8) != 0) {
            i = androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.INSTANCE.getMaxItems$activity();
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            defaultTab = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(mediaCapabilities, j, visualMediaType2, i3, z2, defaultTab);
    }

    public static final androidx.view.result.PickVisualMediaRequest PickVisualMediaRequest(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.MediaCapabilities mediaCapabilities, long j, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, boolean z, androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualMediaType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultTab, "");
        return new androidx.activity.result.PickVisualMediaRequest.Builder().setMediaType(visualMediaType).setMaxItems(i).setOrderedSelection(z).setDefaultTab(defaultTab).setAccentColor(j).setMediaCapabilitiesForTranscoding(mediaCapabilities).build();
    }
}
