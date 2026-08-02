package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0005¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/graphics/TileMode;", "", "isSupported-0vamqd0", "(I)Z", "isSupported", "Landroid/graphics/Shader$TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "toAndroidTileMode", "toComposeTileMode", "(Landroid/graphics/Shader$TileMode;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidTileMode_androidKt {
    /* renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m5899isSupported0vamqd0(int i) {
        return android.os.Build.VERSION.SDK_INT >= 31 || !androidx.compose.ui.graphics.TileMode.m6357equalsimpl0(i, androidx.compose.ui.graphics.TileMode.INSTANCE.m6362getDecal3opZhB0());
    }

    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final android.graphics.Shader.TileMode m5900toAndroidTileMode0vamqd0(int i) {
        if (androidx.compose.ui.graphics.TileMode.m6357equalsimpl0(i, androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0())) {
            return android.graphics.Shader.TileMode.CLAMP;
        }
        if (androidx.compose.ui.graphics.TileMode.m6357equalsimpl0(i, androidx.compose.ui.graphics.TileMode.INSTANCE.m6364getRepeated3opZhB0())) {
            return android.graphics.Shader.TileMode.REPEAT;
        }
        if (androidx.compose.ui.graphics.TileMode.m6357equalsimpl0(i, androidx.compose.ui.graphics.TileMode.INSTANCE.m6363getMirror3opZhB0())) {
            return android.graphics.Shader.TileMode.MIRROR;
        }
        if (androidx.compose.ui.graphics.TileMode.m6357equalsimpl0(i, androidx.compose.ui.graphics.TileMode.INSTANCE.m6362getDecal3opZhB0())) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                androidx.compose.ui.graphics.TileModeVerificationHelper tileModeVerificationHelper = androidx.compose.ui.graphics.TileModeVerificationHelper.INSTANCE;
                return androidx.compose.ui.graphics.TileModeVerificationHelper.Camera2StreamConfigurationMap();
            }
            return android.graphics.Shader.TileMode.CLAMP;
        }
        return android.graphics.Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(android.graphics.Shader.TileMode tileMode) {
        int i = androidx.compose.ui.graphics.AndroidTileMode_androidKt.WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i == 1) {
            return androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0();
        }
        if (i == 2) {
            return androidx.compose.ui.graphics.TileMode.INSTANCE.m6363getMirror3opZhB0();
        }
        if (i == 3) {
            return androidx.compose.ui.graphics.TileMode.INSTANCE.m6364getRepeated3opZhB0();
        }
        if (android.os.Build.VERSION.SDK_INT >= 31 && tileMode == android.graphics.Shader.TileMode.DECAL) {
            androidx.compose.ui.graphics.TileModeVerificationHelper tileModeVerificationHelper = androidx.compose.ui.graphics.TileModeVerificationHelper.INSTANCE;
            return androidx.compose.ui.graphics.TileModeVerificationHelper.getHighSpeedVideoFpsRangesFor();
        }
        return androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[android.graphics.Shader.TileMode.values().length];
            try {
                iArr[android.graphics.Shader.TileMode.CLAMP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[android.graphics.Shader.TileMode.MIRROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[android.graphics.Shader.TileMode.REPEAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
