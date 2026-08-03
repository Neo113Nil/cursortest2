package androidx.compose.ui.graphics;

/* compiled from: AndroidTileMode.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0002*\u00020\u0006¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/TileMode;", "isSupported-0vamqd0", "(I)Z", "toAndroidTileMode", "Landroid/graphics/Shader$TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "toComposeTileMode", "(Landroid/graphics/Shader$TileMode;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTileMode_androidKt {

    /* compiled from: AndroidTileMode.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    /* renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m2017isSupported0vamqd0(int i) {
        return android.os.Build.VERSION.SDK_INT >= 31 || !androidx.compose.ui.graphics.TileMode.m2490equalsimpl0(i, androidx.compose.ui.graphics.TileMode.INSTANCE.m2495getDecal3opZhB0());
    }

    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final android.graphics.Shader.TileMode m2018toAndroidTileMode0vamqd0(int i) {
        if (androidx.compose.ui.graphics.TileMode.m2490equalsimpl0(i, androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0())) {
            return android.graphics.Shader.TileMode.CLAMP;
        }
        if (androidx.compose.ui.graphics.TileMode.m2490equalsimpl0(i, androidx.compose.ui.graphics.TileMode.INSTANCE.m2497getRepeated3opZhB0())) {
            return android.graphics.Shader.TileMode.REPEAT;
        }
        if (androidx.compose.ui.graphics.TileMode.m2490equalsimpl0(i, androidx.compose.ui.graphics.TileMode.INSTANCE.m2496getMirror3opZhB0())) {
            return android.graphics.Shader.TileMode.MIRROR;
        }
        if (androidx.compose.ui.graphics.TileMode.m2490equalsimpl0(i, androidx.compose.ui.graphics.TileMode.INSTANCE.m2495getDecal3opZhB0())) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                return androidx.compose.ui.graphics.TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
            }
            return android.graphics.Shader.TileMode.CLAMP;
        }
        return android.graphics.Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(android.graphics.Shader.TileMode tileMode) {
        int i = androidx.compose.ui.graphics.AndroidTileMode_androidKt.WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i == 1) {
            return androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0();
        }
        if (i == 2) {
            return androidx.compose.ui.graphics.TileMode.INSTANCE.m2496getMirror3opZhB0();
        }
        if (i == 3) {
            return androidx.compose.ui.graphics.TileMode.INSTANCE.m2497getRepeated3opZhB0();
        }
        if (android.os.Build.VERSION.SDK_INT >= 31 && tileMode == android.graphics.Shader.TileMode.DECAL) {
            return androidx.compose.ui.graphics.TileModeVerificationHelper.INSTANCE.m2498getComposeTileModeDecal3opZhB0();
        }
        return androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0();
    }
}
