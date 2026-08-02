package androidx.compose.ui.hapticfeedback;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "hapticFeedbackType", "", "performHapticFeedback-CdsT49E", "(I)V", "performHapticFeedback", "getHighSpeedVideoFpsRangesFor", "Landroid/view/View;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformHapticFeedback implements androidx.compose.ui.hapticfeedback.HapticFeedback {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.view.View getHighResolutionOutputSizeshNQ4ISI;

    public PlatformHapticFeedback(android.view.View view) {
        this.getHighResolutionOutputSizeshNQ4ISI = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* renamed from: performHapticFeedback-CdsT49E */
    public final void mo6704performHapticFeedbackCdsT49E(int hapticFeedbackType) {
        int i;
        if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6712getConfirm5zf0vsI())) {
            i = 16;
        } else if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6713getContextClick5zf0vsI())) {
            i = 6;
        } else if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6714getGestureEnd5zf0vsI())) {
            i = 13;
        } else if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6715getGestureThresholdActivate5zf0vsI())) {
            i = 23;
        } else if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6716getKeyboardTap5zf0vsI())) {
            i = 3;
        } else if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6717getLongPress5zf0vsI())) {
            i = 0;
        } else if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6718getReject5zf0vsI())) {
            i = 17;
        } else if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6719getSegmentFrequentTick5zf0vsI())) {
            i = 27;
        } else if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6720getSegmentTick5zf0vsI())) {
            i = 26;
        } else if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6721getTextHandleMove5zf0vsI())) {
            i = 9;
        } else if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6722getToggleOff5zf0vsI())) {
            i = 22;
        } else if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6723getToggleOn5zf0vsI())) {
            i = 21;
        } else {
            i = androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6708equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6724getVirtualKey5zf0vsI()) ? 1 : -1;
        }
        androidx.core.view.ViewCompat.performHapticFeedback(this.getHighResolutionOutputSizeshNQ4ISI, i);
    }
}
