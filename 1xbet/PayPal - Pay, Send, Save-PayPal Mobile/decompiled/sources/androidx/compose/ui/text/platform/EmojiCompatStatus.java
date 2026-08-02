package androidx.compose.ui.text.platform;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/text/platform/EmojiCompatStatus;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "<init>", "()V", "newDelegate", "", "setDelegateForTesting$ui_text", "(Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/State;", "", "getFontLoaded", "()Landroidx/compose/runtime/State;", "fontLoaded"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmojiCompatStatus implements androidx.compose.ui.text.platform.EmojiCompatStatusDelegate {
    public static final androidx.compose.ui.text.platform.EmojiCompatStatus INSTANCE = new androidx.compose.ui.text.platform.EmojiCompatStatus();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static androidx.compose.ui.text.platform.EmojiCompatStatusDelegate Camera2StreamConfigurationMap = new androidx.compose.ui.text.platform.DefaultImpl();
    public static final int $stable = 8;

    private EmojiCompatStatus() {
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public final androidx.compose.runtime.State<java.lang.Boolean> getFontLoaded() {
        return Camera2StreamConfigurationMap.getFontLoaded();
    }

    public final void setDelegateForTesting$ui_text(androidx.compose.ui.text.platform.EmojiCompatStatusDelegate newDelegate) {
        if (newDelegate == null) {
            newDelegate = new androidx.compose.ui.text.platform.DefaultImpl();
        }
        Camera2StreamConfigurationMap = newDelegate;
    }
}
