package androidx.camera.video.internal.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewFreezeAfterHighSpeedRecordingQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "", "load", "()Z", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviewFreezeAfterHighSpeedRecordingQuirk implements androidx.camera.core.impl.Quirk {
    public static final androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk INSTANCE = new androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final boolean Camera2StreamConfigurationMap;

    private PreviewFreezeAfterHighSpeedRecordingQuirk() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean load() {
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (kotlin.text.StringsKt.startsWith(r0, "Pixel", true) == false) goto L6;
     */
    static {
        boolean z = true;
        if (kotlin.text.StringsKt.equals(android.os.Build.BRAND, com.adjust.sdk.Constants.REFERRER_API_GOOGLE, true)) {
            java.lang.String str = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
        z = false;
        Camera2StreamConfigurationMap = z;
    }
}
