package androidx.camera.video.internal.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/VideoInterlacingQuirk;", "Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;", "<init>", "()V", "", "load", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoInterlacingQuirk implements androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk {
    public static final androidx.camera.video.internal.compat.quirk.VideoInterlacingQuirk INSTANCE = new androidx.camera.video.internal.compat.quirk.VideoInterlacingQuirk();

    private VideoInterlacingQuirk() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean load() {
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf("SM-N9208");
        java.lang.String str = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (!listOf.contains(upperCase)) {
            if (!kotlin.text.StringsKt.equals(android.os.Build.BRAND, "Samsung", true)) {
                return false;
            }
            java.lang.String str2 = android.os.Build.PRODUCT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
            if (!kotlin.text.StringsKt.startsWith(str2, "zeroflte", true)) {
                return false;
            }
        }
        return true;
    }
}
