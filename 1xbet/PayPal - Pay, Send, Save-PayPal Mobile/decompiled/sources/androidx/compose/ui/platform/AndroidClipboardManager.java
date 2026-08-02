package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u00060\u0002j\u0002`\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/ClipboardManager;", "Landroid/content/ClipboardManager;", "clipboardManager", "<init>", "(Landroid/content/ClipboardManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "", "setText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "", "hasText", "()Z", "Landroidx/compose/ui/platform/ClipEntry;", "getClip", "()Landroidx/compose/ui/platform/ClipEntry;", "clipEntry", "setClip", "(Landroidx/compose/ui/platform/ClipEntry;)V", "Camera2StreamConfigurationMap", "Landroid/content/ClipboardManager;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/platform/getHighSpeedVideoFpsRanges;", "getNativeClipboard", "()Landroid/content/ClipboardManager;", "nativeClipboard"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidClipboardManager implements androidx.compose.ui.platform.ClipboardManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.ClipboardManager getHighSpeedVideoFpsRangesFor;

    public AndroidClipboardManager(android.content.ClipboardManager clipboardManager) {
        this.getHighSpeedVideoFpsRangesFor = clipboardManager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidClipboardManager(android.content.Context context) {
        this((android.content.ClipboardManager) r2);
        java.lang.Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public final void setText(androidx.compose.ui.text.AnnotatedString annotatedString) {
        this.getHighSpeedVideoFpsRangesFor.setPrimaryClip(android.content.ClipData.newPlainText("plain text", androidx.compose.ui.platform.AndroidClipboardManager_androidKt.convertToCharSequence(annotatedString)));
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public final androidx.compose.ui.text.AnnotatedString getText() {
        android.content.ClipData primaryClip = this.getHighSpeedVideoFpsRangesFor.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
        return androidx.compose.ui.platform.AndroidClipboardManager_androidKt.convertToAnnotatedString(itemAt != null ? itemAt.getText() : null);
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public final boolean hasText() {
        android.content.ClipDescription primaryClipDescription = this.getHighSpeedVideoFpsRangesFor.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public final androidx.compose.ui.platform.ClipEntry getClip() {
        android.content.ClipData primaryClip = this.getHighSpeedVideoFpsRangesFor.getPrimaryClip();
        if (primaryClip != null) {
            return new androidx.compose.ui.platform.ClipEntry(primaryClip);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public final void setClip(androidx.compose.ui.platform.ClipEntry clipEntry) {
        if (clipEntry == null) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                androidx.compose.ui.platform.Api28ClipboardManagerClipClear.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
                return;
            } else {
                this.getHighSpeedVideoFpsRangesFor.setPrimaryClip(android.content.ClipData.newPlainText("", ""));
                return;
            }
        }
        this.getHighSpeedVideoFpsRangesFor.setPrimaryClip(clipEntry.getClipData());
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    /* renamed from: getNativeClipboard, reason: from getter */
    public final android.content.ClipboardManager getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
