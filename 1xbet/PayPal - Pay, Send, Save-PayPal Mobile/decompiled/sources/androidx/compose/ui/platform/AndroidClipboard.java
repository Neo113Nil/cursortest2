package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/platform/AndroidClipboard;", "Landroidx/compose/ui/platform/Clipboard;", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "androidClipboardManager", "<init>", "(Landroidx/compose/ui/platform/AndroidClipboardManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroidx/compose/ui/platform/ClipEntry;", "getClipEntry", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clipEntry", "", "setClipEntry", "(Landroidx/compose/ui/platform/ClipEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "Camera2StreamConfigurationMap", "Landroid/content/ClipboardManager;", "Landroidx/compose/ui/platform/getHighSpeedVideoFpsRanges;", "getNativeClipboard", "()Landroid/content/ClipboardManager;", "nativeClipboard"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidClipboard implements androidx.compose.ui.platform.Clipboard {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.AndroidClipboardManager Camera2StreamConfigurationMap;

    public AndroidClipboard(androidx.compose.ui.platform.AndroidClipboardManager androidClipboardManager) {
        this.Camera2StreamConfigurationMap = androidClipboardManager;
    }

    public AndroidClipboard(android.content.Context context) {
        this(new androidx.compose.ui.platform.AndroidClipboardManager(context));
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public final java.lang.Object getClipEntry(kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.ClipEntry> continuation) {
        return this.Camera2StreamConfigurationMap.getClip();
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public final java.lang.Object setClipEntry(androidx.compose.ui.platform.ClipEntry clipEntry, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.Camera2StreamConfigurationMap.setClip(clipEntry);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.platform.Clipboard
    /* renamed from: getNativeClipboard */
    public final android.content.ClipboardManager getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor();
    }
}
