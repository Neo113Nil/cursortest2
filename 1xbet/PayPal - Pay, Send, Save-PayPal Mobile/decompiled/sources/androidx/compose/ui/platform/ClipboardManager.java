package androidx.compose.ui.platform;

@kotlin.Deprecated(message = "Use Clipboard instead, which supports suspend functions.", replaceWith = @kotlin.ReplaceWith(expression = "Clipboard", imports = {"androidx.compose.ui.platform.Clipboard"}))
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u00060\u0012j\u0002`\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ClipboardManager;", "", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "", "setText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "", "hasText", "()Z", "Landroidx/compose/ui/platform/ClipEntry;", "getClip", "()Landroidx/compose/ui/platform/ClipEntry;", "clipEntry", "setClip", "(Landroidx/compose/ui/platform/ClipEntry;)V", "Landroid/content/ClipboardManager;", "Landroidx/compose/ui/platform/getHighSpeedVideoFpsRanges;", "getNativeClipboard", "()Landroid/content/ClipboardManager;", "nativeClipboard"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ClipboardManager {
    default androidx.compose.ui.platform.ClipEntry getClip() {
        return null;
    }

    androidx.compose.ui.text.AnnotatedString getText();

    default void setClip(androidx.compose.ui.platform.ClipEntry clipEntry) {
    }

    void setText(androidx.compose.ui.text.AnnotatedString annotatedString);

    default boolean hasText() {
        androidx.compose.ui.text.AnnotatedString text = getText();
        return text != null && text.length() > 0;
    }

    /* renamed from: getNativeClipboard */
    default android.content.ClipboardManager getGetHighSpeedVideoFpsRangesFor() {
        throw new java.lang.UnsupportedOperationException("This platform does not offer a native Clipboard");
    }
}
