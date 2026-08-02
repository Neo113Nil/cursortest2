package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/ClipEntry;", "Landroid/net/Uri;", "firstUriOrNull", "(Landroidx/compose/ui/platform/ClipEntry;)Landroid/net/Uri;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClipboardExtensions_androidKt {
    public static final android.net.Uri firstUriOrNull(androidx.compose.ui.platform.ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            android.net.Uri uri = clipEntry.getClipData().getItemAt(i).getUri();
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }
}
