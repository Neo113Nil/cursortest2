package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/platform/ClipEntry;", "", "Landroid/content/ClipData;", "clipData", "<init>", "(Landroid/content/ClipData;)V", "Landroid/content/ClipData;", "getClipData", "()Landroid/content/ClipData;", "Landroidx/compose/ui/platform/ClipMetadata;", "getClipMetadata", "()Landroidx/compose/ui/platform/ClipMetadata;", "clipMetadata"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClipEntry {
    public static final int $stable = 8;
    private final android.content.ClipData clipData;

    public ClipEntry(android.content.ClipData clipData) {
        this.clipData = clipData;
    }

    public final android.content.ClipData getClipData() {
        return this.clipData;
    }

    public final androidx.compose.ui.platform.ClipMetadata getClipMetadata() {
        return androidx.compose.ui.platform.AndroidClipboardManager_androidKt.toClipMetadata(this.clipData.getDescription());
    }
}
