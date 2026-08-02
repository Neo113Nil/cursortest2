package androidx.compose.foundation.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0010\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/internal/ClipboardUtils;", "", "<init>", "()V", "Landroidx/compose/ui/platform/ClipEntry;", "clipEntry", "", "readText", "(Landroidx/compose/ui/platform/ClipEntry;)Ljava/lang/String;", "Landroidx/compose/ui/text/AnnotatedString;", "readAnnotatedString", "(Landroidx/compose/ui/platform/ClipEntry;)Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "toClipEntry", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/platform/ClipEntry;", "", "hasText", "(Landroidx/compose/ui/platform/ClipEntry;)Z", "Landroidx/compose/ui/platform/Clipboard;", "clipboard", "(Landroidx/compose/ui/platform/Clipboard;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClipboardUtils {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.internal.ClipboardUtils INSTANCE = new androidx.compose.foundation.internal.ClipboardUtils();

    private ClipboardUtils() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String readText(androidx.compose.ui.platform.ClipEntry clipEntry) {
        java.lang.CharSequence text;
        android.content.ClipData.Item itemAt = clipEntry.getClipData().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.compose.ui.text.AnnotatedString readAnnotatedString(androidx.compose.ui.platform.ClipEntry clipEntry) {
        java.lang.CharSequence text;
        android.content.ClipData.Item itemAt = clipEntry.getClipData().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return androidx.compose.foundation.internal.ClipboardUtils_androidKt.convertToAnnotatedString(text);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.compose.ui.platform.ClipEntry toClipEntry(androidx.compose.ui.text.AnnotatedString annotatedString) {
        if (annotatedString == null) {
            return null;
        }
        return new androidx.compose.ui.platform.ClipEntry(android.content.ClipData.newPlainText("plain text", androidx.compose.foundation.internal.ClipboardUtils_androidKt.convertToCharSequence(annotatedString)));
    }

    @kotlin.jvm.JvmStatic
    public static final boolean hasText(androidx.compose.ui.platform.ClipEntry clipEntry) {
        if (clipEntry == null) {
            return false;
        }
        return clipEntry.getClipData().getDescription().hasMimeType("text/*");
    }

    @kotlin.jvm.JvmStatic
    public static final boolean hasText(androidx.compose.ui.platform.Clipboard clipboard) {
        android.content.ClipDescription primaryClipDescription = clipboard.getCamera2StreamConfigurationMap().getPrimaryClipDescription();
        return primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*");
    }
}
