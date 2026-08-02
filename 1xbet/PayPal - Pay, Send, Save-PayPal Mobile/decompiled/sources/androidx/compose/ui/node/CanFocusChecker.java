package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/node/CanFocusChecker;", "Landroidx/compose/ui/focus/FocusProperties;", "<init>", "()V", "", "getHighSpeedVideoFpsRanges", "()Z", "", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Ljava/lang/Boolean;", "p0", "getCanFocus", "setCanFocus", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CanFocusChecker implements androidx.compose.ui.focus.FocusProperties {
    public static final androidx.compose.ui.node.CanFocusChecker INSTANCE = new androidx.compose.ui.node.CanFocusChecker();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static java.lang.Boolean getHighSpeedVideoFpsRanges;

    private CanFocusChecker() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final boolean getCanFocus() {
        java.lang.Boolean bool = getHighSpeedVideoFpsRanges;
        if (bool == null) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("canFocus is read before it is written");
            throw new kotlin.KotlinNothingValueException();
        }
        return bool.booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final void setCanFocus(boolean z) {
        getHighSpeedVideoFpsRanges = java.lang.Boolean.valueOf(z);
    }

    public static boolean getHighSpeedVideoFpsRanges() {
        return getHighSpeedVideoFpsRanges != null;
    }

    public static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRanges = null;
    }
}
