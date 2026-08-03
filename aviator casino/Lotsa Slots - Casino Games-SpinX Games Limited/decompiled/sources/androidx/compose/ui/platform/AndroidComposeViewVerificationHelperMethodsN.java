package androidx.compose.ui.platform;

/* compiled from: AndroidComposeView.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsN;", "", "()V", "setPointerIcon", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidComposeViewVerificationHelperMethodsN {
    public static final androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN INSTANCE = new androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    public final void setPointerIcon(android.view.View view, androidx.compose.ui.input.pointer.PointerIcon icon) {
        android.view.PointerIcon systemIcon;
        if (icon instanceof androidx.compose.ui.input.pointer.AndroidPointerIcon) {
            systemIcon = ((androidx.compose.ui.input.pointer.AndroidPointerIcon) icon).getPointerIcon();
        } else if (icon instanceof androidx.compose.ui.input.pointer.AndroidPointerIconType) {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), ((androidx.compose.ui.input.pointer.AndroidPointerIconType) icon).getType());
        } else {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
