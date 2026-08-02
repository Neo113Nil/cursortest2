package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/graphics/TileModeVerificationHelper;", "", "<init>", "()V", "Landroid/graphics/Shader$TileMode;", "Camera2StreamConfigurationMap", "()Landroid/graphics/Shader$TileMode;", "Landroidx/compose/ui/graphics/TileMode;", "getHighSpeedVideoFpsRangesFor", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TileModeVerificationHelper {
    public static final androidx.compose.ui.graphics.TileModeVerificationHelper INSTANCE = new androidx.compose.ui.graphics.TileModeVerificationHelper();

    private TileModeVerificationHelper() {
    }

    public static android.graphics.Shader.TileMode Camera2StreamConfigurationMap() {
        return android.graphics.Shader.TileMode.DECAL;
    }

    public static int getHighSpeedVideoFpsRangesFor() {
        return androidx.compose.ui.graphics.TileMode.INSTANCE.m6362getDecal3opZhB0();
    }
}
