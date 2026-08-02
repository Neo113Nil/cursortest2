package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsN;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroidx/compose/ui/input/pointer/PointerIcon;", "p1", "Landroid/view/PointerIcon;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/content/Context;Landroidx/compose/ui/input/pointer/PointerIcon;)Landroid/view/PointerIcon;", "Landroid/view/View;", "", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/PointerIcon;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidComposeViewVerificationHelperMethodsN {
    public static final androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    public static android.view.PointerIcon getHighResolutionOutputSizeshNQ4ISI(android.content.Context p0, androidx.compose.ui.input.pointer.PointerIcon p1) {
        return p1 instanceof androidx.compose.ui.input.pointer.AndroidPointerIcon ? ((androidx.compose.ui.input.pointer.AndroidPointerIcon) p1).getPointerIcon() : p1 instanceof androidx.compose.ui.input.pointer.AndroidPointerIconType ? android.view.PointerIcon.getSystemIcon(p0, ((androidx.compose.ui.input.pointer.AndroidPointerIconType) p1).getType()) : android.view.PointerIcon.getSystemIcon(p0, 1000);
    }

    public static void getHighSpeedVideoFpsRanges(android.view.View p0, androidx.compose.ui.input.pointer.PointerIcon p1) {
        android.view.PointerIcon highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(p0.getContext(), p1);
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0.getPointerIcon(), highResolutionOutputSizeshNQ4ISI)) {
            return;
        }
        p0.setPointerIcon(highResolutionOutputSizeshNQ4ISI);
    }
}
