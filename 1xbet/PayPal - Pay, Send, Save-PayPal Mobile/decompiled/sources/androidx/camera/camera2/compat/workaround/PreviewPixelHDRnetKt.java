package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/core/impl/SessionConfig$Builder;", "Landroid/util/Size;", "resolution", "", "setupHDRnet", "(Landroidx/camera/core/impl/SessionConfig$Builder;Landroid/util/Size;)V", "Landroid/util/Rational;", "getHighSpeedVideoFpsRanges", "Landroid/util/Rational;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviewPixelHDRnetKt {
    private static final android.util.Rational getHighSpeedVideoFpsRanges = new android.util.Rational(16, 9);

    public static final void setupHDRnet(androidx.camera.core.impl.SessionConfig.Builder builder, android.util.Size size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
        if (((androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.class)) == null || kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoFpsRanges, new android.util.Rational(size.getWidth(), size.getHeight()))) {
            return;
        }
        androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder2 = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.TONEMAP_MODE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        builder2.setCaptureRequestOption(key, 2);
        builder.addImplementationOptions(builder2.build());
    }
}
