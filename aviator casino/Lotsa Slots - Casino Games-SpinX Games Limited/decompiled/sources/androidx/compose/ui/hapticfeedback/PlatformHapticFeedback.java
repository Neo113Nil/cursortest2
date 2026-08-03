package androidx.compose.ui.hapticfeedback;

/* compiled from: PlatformHapticFeedback.android.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Landroid/view/View;)V", "performHapticFeedback", "", "hapticFeedbackType", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "performHapticFeedback-CdsT49E", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformHapticFeedback implements androidx.compose.ui.hapticfeedback.HapticFeedback {
    public static final int $stable = 8;
    private final android.view.View view;

    public PlatformHapticFeedback(android.view.View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* renamed from: performHapticFeedback-CdsT49E */
    public void mo2797performHapticFeedbackCdsT49E(int hapticFeedbackType) {
        if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m2801equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m2805getLongPress5zf0vsI())) {
            this.view.performHapticFeedback(0);
        } else if (androidx.compose.ui.hapticfeedback.HapticFeedbackType.m2801equalsimpl0(hapticFeedbackType, androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m2806getTextHandleMove5zf0vsI())) {
            this.view.performHapticFeedback(9);
        }
    }
}
