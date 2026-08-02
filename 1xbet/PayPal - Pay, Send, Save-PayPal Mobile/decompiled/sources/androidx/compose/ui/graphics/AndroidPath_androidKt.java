package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Path", "()Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Path;", "asComposePath", "(Landroid/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "asAndroidPath", "(Landroidx/compose/ui/graphics/Path;)Landroid/graphics/Path;", "", "message", "", "throwIllegalStateException", "(Ljava/lang/String;)V", "Landroidx/compose/ui/graphics/Path$Direction;", "Landroid/graphics/Path$Direction;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/graphics/Path$Direction;)Landroid/graphics/Path$Direction;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidPath_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.graphics.Path Path() {
        return new androidx.compose.ui.graphics.AndroidPath(null, 1, 0 == true ? 1 : 0);
    }

    public static final androidx.compose.ui.graphics.Path asComposePath(android.graphics.Path path) {
        return new androidx.compose.ui.graphics.AndroidPath(path);
    }

    public static final android.graphics.Path asAndroidPath(androidx.compose.ui.graphics.Path path) {
        if (path instanceof androidx.compose.ui.graphics.AndroidPath) {
            return ((androidx.compose.ui.graphics.AndroidPath) path).getInternalPath();
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public static final void throwIllegalStateException(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Path.Direction getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.Path.Direction direction) {
        int i = androidx.compose.ui.graphics.AndroidPath_androidKt.WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return android.graphics.Path.Direction.CCW;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return android.graphics.Path.Direction.CW;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.graphics.Path.Direction.values().length];
            try {
                iArr[androidx.compose.ui.graphics.Path.Direction.CounterClockwise.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.graphics.Path.Direction.Clockwise.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
